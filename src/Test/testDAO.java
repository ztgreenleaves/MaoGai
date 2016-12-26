package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DAO.Content;
import DAO.ContentDAO;

public class testDAO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("app*.xml");
		ContentDAO dao = (ContentDAO) context.getBean("ContentDAO");
		
		Content te = dao.findById(3);
		System.out.println(te.toString());
	}

}
