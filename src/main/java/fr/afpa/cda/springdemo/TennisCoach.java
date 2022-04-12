package fr.afpa.cda.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println("inside tennis constructor");
	}

//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}

//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		System.out.println("inside set");
//		fortuneService = theFortuneService;
//	}

//	@Autowired
//	public void doOtherStuff(FortuneService theFortuneService) {
//		System.out.println("inside doOtherStuff");
//		fortuneService = theFortuneService;
//	}

	public String getDailyWorkout() {
		return "bla bla tennis";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@PostConstruct
	public void doInitStuff() {
		System.out.println("inside init");
	}
	
	@PreDestroy
	public void doCleanStuff() {
		System.out.println("inside clean");
	}
}
