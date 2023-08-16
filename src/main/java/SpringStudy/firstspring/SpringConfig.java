package SpringStudy.firstspring;

import SpringStudy.firstspring.aop.TimeTraceAop;
import SpringStudy.firstspring.repository.MemberRepository;
import SpringStudy.firstspring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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

    @Bean
    public TimeTraceAop timeTraceAop() {
        return new TimeTraceAop();
    }
}

/*
    @Bean
    public MemberRepository memberRepository() {
        //return new JpaMemberReository(em);
    }
}
*/
