package com.example.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.entity.Member;
import com.example.library.repository.MemberRepository;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;
    @PostMapping
    public Member addMember(@RequestBody Member member) {
        return memberRepository.save(member);
    }
    @GetMapping
    public List<Member> getMembers() {
        return memberRepository.findAll();
    }
}