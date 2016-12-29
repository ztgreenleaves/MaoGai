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
		String content = qop.getContent("./txt/多项12.txt");
//		qop.setTxt(content);
//		System.out.println(content);//([A-Z]{1})\\s*\\.(.+?)\\s{1} //answer
		//(\\d+?\\s*?\\.)(.+?)([A-Z]{1,5}) //question
		List<String> q = qop.getQuestion(content,2,"([A-Z]{1})\\s*\\.(.+?)\\s{1}");
//		System.out.println(q.get(0));
	}

}
