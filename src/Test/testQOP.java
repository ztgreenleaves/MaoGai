package Test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DAO.Content;
import DAO.ContentDAO;
import DataOperation.QuestionOP;

public class testQOP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionOP qop = new QuestionOP();
		String content = qop.getContent("./txt/单项2.txt");
//		qop.setTxt(content);
//		System.out.println(content);
		List<String> q = qop.getQuestion(content,2,"(\\d+?\\s*?\\.)(.+?)([A-Z])");

	}

}
