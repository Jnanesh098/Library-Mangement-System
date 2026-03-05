package com.example.library.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.library.entity.Book;
import com.example.library.entity.IssueRecord;
import com.example.library.entity.Member;
import com.example.library.repository.BookRepository;
import com.example.library.repository.IssueRepository;
import com.example.library.repository.MemberRepository;

@Service
public class IssueService {
	@Autowired
	private IssueRepository issueRepository;
	@Autowired
	private MemberRepository memberRepository;
	@Autowired
	private BookRepository bookRepository;
	
	@Transactional
	public IssueRecord issueRecord(Long memberId, Long bookId) {
		 Member member = memberRepository.findById(memberId)
	                .orElseThrow(() -> new RuntimeException("Member not found"));

	        Book book = bookRepository.findById(bookId)
	                .orElseThrow(() -> new RuntimeException("Book not found"));

	        if(book.getAvailableCopies() <= 0){
	            throw new RuntimeException("Book not available");
		}
		book.setAvailableCopies(book.getAvailableCopies()-1);
		bookRepository.save(book);
		IssueRecord record=new IssueRecord();
		record.setIssueDate(LocalDate.now());
		record.setMember(member);
		record.setBook(book);
		
		return issueRepository.save(record);
	}
}