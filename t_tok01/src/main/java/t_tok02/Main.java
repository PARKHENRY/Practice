package t_tok02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		WhitePhone wp = new WhitePhone();
		wp.show();

		BlackPhone bp = new BlackPhone();
		bp.show();
		
		Battery newBattery = new Battery("새로 산 배터리 - 생성자");
		bp.setBattery(newBattery);
		bp.show();
		
		newBattery.setName("새로 산 배터리 - 세터");
		bp.setBattery(newBattery);
		bp.show();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		BlackPhone newBp = (BlackPhone)context.getBean("blackphone");
		newBp.show();
	}

}
