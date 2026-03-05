package com.example.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.library.entity.IssueRecord;

public interface IssueRepository extends JpaRepository<IssueRecord, Long> {

}
