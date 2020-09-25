package ch6;

// 빈 라이프사이클 초기화, 종류를 보여주는 코드입니다.
// ch2를 기반으로 하여 예제를 작성하였습니다.
// 자바 코드 규격에 맞지 않을 수 있습니다.
public class BeanLifeCycle_ {
	// 1. 컨테이너 초기화
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
	
	// 2. 컨테이너에서 빈 객체를 구해서 사용
	Greeter g = ctx.getBean("greeter", Greeter.class);
	String mag = g.greet("스프링");
	System.out.println(msg);
	
	// 3. 컨테이너 종료
	ctx.close();
}
