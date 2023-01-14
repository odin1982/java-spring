package ch01.pag010.com.springinaction.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ch01.com.springinaction.knights.Knight;

public class KnightMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
		Knight knight = (Knight)context.getBean("knight");
		knight.embarkOnQuest();
	}
}
