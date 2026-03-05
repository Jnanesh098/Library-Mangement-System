package com.example.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.entity.IssueRecord;
import com.example.library.service.IssueService;

@RestController
@RequestMapping("/issue")
public class IssueController {
	@Autowired
	private IssueService issueService;
	@PostMapping("/{memberId}/{bookId}")
	public IssueRecord issueBook(@PathVariable Long memberId,
			@PathVariable Long bookId) {
		return issueService.issueRecord(memberId, bookId);
	}
}