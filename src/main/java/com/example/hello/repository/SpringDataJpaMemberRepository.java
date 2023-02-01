package com.example.hello.repository;

import com.example.hello.domain.Member;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    //select m from m Member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);
}
