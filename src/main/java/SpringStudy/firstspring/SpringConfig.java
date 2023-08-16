package SpringStudy.firstspring;

import SpringStudy.firstspring.repository.MemberRepository;
import SpringStudy.firstspring.repository.MemoryMemberRepository;
import SpringStudy.firstspring.service.MemberService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
