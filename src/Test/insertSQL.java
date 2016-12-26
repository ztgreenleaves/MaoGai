package Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import DAO.MySqlUtils;
import DataOperation.QuestionOP;

public class insertSQL {
	public static void main(String[] args) {
	
		String fileName = "./txt/单项2.txt";
		QuestionOP qop = new QuestionOP();
		String content = qop.getContent(fileName);
		// qop.setTxt(content);
		// System.out.println(content);
//		qop.getQ(fileName,172);
//		qop.getAnswer(fileName,172);
		qop.getA(fileName,172);
	}

}
