package t_tok03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

// Advice : 부가기능을 담당하는 역할. 로깅을 담당할 클래스
public class LoggingAdvice {

	public void beforeAdvice() {
		System.out.println("#####메소드 실행전에 로그를 출력합니다.#####");
	}
	
	public void beforeBuyConfirm() {
		System.out.println("@@@@@구매 전 아이템 확인은 필수입니다.@@@@@");
	}
	
	public void afterAdvice() {
		System.out.println("$$$$$구매해주셔서 감사합니다.$$$$$");
	}
	
	public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		
		Signature method = joinPoint.getSignature();
		System.out.println("&&&&&내가 실행한 메소드 : " + method.getName());
		
		joinPoint.proceed();
		
		if ("buyGoods".equals( method.getName())) {
			System.out.println("Goods를 구매해주셔서 감사합니다.");
		} else {
			System.out.println("Item를 구매해주셔서 감사합니다.");
		}
		
	}
	
}
