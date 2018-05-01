package chen.maventest1;

import org.junit.Test;

import junit.framework.TestCase;


public class HelloWorldTest extends TestCase {
	
	@Test
	public void testSayHello(){
		HelloWorld hello = new HelloWorld();
		String result = hello.sayHello();
		assertEquals ("hello Maven", result);
			
		
	}
	
	
}
