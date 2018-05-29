package me.alanzhang;

/**
 * Created by alanzhang on 2018/5/29.
 */
public class HelloSpringImpl implements HelloSpring{
	@Override
	public String sayHello(String userName) {
		return userName + " say hello!";
	}
}
