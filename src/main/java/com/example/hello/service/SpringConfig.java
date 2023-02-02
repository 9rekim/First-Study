package com.example.hello.service;

import com.example.hello.aop.TImeTraceAop;
import com.example.hello.repository.JpaMemberRepository;
import com.example.hello.repository.MemberRepository;
import com.example.hello.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;
    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

/*    @Bean
    public TImeTraceAop tImeTraceAop() {
        return new TImeTraceAop();
    }*/

/*    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }*/

/*    @Bean
    public MemberRepository memberRepository() {
        return new JpaMemberRepository();
    }*/
}
