package service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DAO.Content;
import DAO.ContentDAO;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("app*.xml");
		//ContentDAO dao = (ContentDAO) context.getBean("ContentDAO");
		GetCode code = new GetCode();
		int i;
		//for (i=0;i<3;i++)
		//System.out.println(code.Question().get(i));
	}

}
