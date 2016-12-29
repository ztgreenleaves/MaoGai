package Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import DAO.MySqlUtils;
import DataOperation.QuestionOP;

public class insertSQL {
	public static void main(String[] args) {
	
		String fileName = "./txt/多项12.txt";
		QuestionOP qop = new QuestionOP();
		String content = qop.getContent(fileName);
		// qop.setTxt(content);
		// System.out.println(content);
		int begin = 765;
//		qop.getQ(fileName,begin);
//		qop.getAnswer(fileName,begin);
		qop.getA(fileName,begin);
	}

}
