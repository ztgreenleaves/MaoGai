package DataOperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import DAO.MySqlUtils;

public class QuestionOP {
	public String getContent(String fileName) {
		String content = null;
		StringBuffer str = null;
		try {
			File file = new File(fileName);
			if (file.isFile() && file.exists()) {
				InputStreamReader reader = new InputStreamReader(
						new FileInputStream(file), "UTF-8");
				BufferedReader bufferedReader = new BufferedReader(reader);
				String line = null;
				while ((line = bufferedReader.readLine()) != null) {
					content += line + "\n";
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return content;
	}

	public void setTxt(String content) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(new File(
					"test.txt"));
			fileOutputStream.write(content.getBytes());
			fileOutputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<String> getQuestion(String content,int index,String regex) {
		List<String> questions = new ArrayList<String>();
		List<String> answers = new ArrayList<String>();
		// String regex1 = "([A-Z]{1})\\s*\\.(.+?)\\s{1}";
		//group1 = 选项 group2=题目.
//		String regex = "(\\d+?\\s*?\\.)(.+?)([A-Z])";// group2 = 题干; group3 =
														// 答案.

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(content);
		int q = 0;
		while (matcher.find()) {
			q++;
			String str = matcher.group(index);
			questions.add(str);
			System.out.println(q + " : " + str);

		}
		// System.out.println(questions.get(2000));
		System.out.println(q);
		return questions;
	}

	public void getQ(String fileName,int begin) {
		String sql = "select * from content";
		MySqlUtils db1 = null;
		db1 = new MySqlUtils(sql);// 创建DBHelper对象
		QuestionOP qop = new QuestionOP();
		String content = qop.getContent(fileName);
		List<String> q = qop.getQuestion(content,2,"(\\d+?\\s*?\\.)(.+?)([A-Z])");
		int i = begin;
		for (String q1 : q) {

			// sql = "update content set q_a = '" + q.get(j) + "',q_b='"
			// + q.get(j + 1) + "',q_c='" + q.get(j + 2) + "',q_d='"
			// + q.get(j + 3) + "'where id = '" + i + "'";// SQL语句

			sql = "insert into content (id,q_content)values('" + i + "','" + q1
					+ "')";

			try {
				db1.pst.execute(sql);// 插入

			} catch (SQLException e) {
				e.printStackTrace();
			}
			i++;
		}
		db1.close();// 关闭连接

	}

	public void getA(String fileName,int begin) {
		String sql = "select * from content";
		MySqlUtils db1 = null;
		db1 = new MySqlUtils(sql);// 创建DBHelper对象
		QuestionOP qop = new QuestionOP();
		String content = qop.getContent(fileName);
		List<String> q = qop.getQuestion(content,2,"([A-Z]{1})\\s*\\.(.+?)\\s{1}");
		int i = begin;
		for (int j = 0; j < q.size(); j = j + 4) {
			sql = "update content set q_a = '" + q.get(j) + "',q_b='"
					+ q.get(j + 1) + "',q_c='" + q.get(j + 2) + "',q_d='"
					+ q.get(j + 3) + "'where id = '" + i + "'";// SQL语句

			try {
				db1.pst.executeUpdate(sql);// 执行语句，得到结果集
			} catch (SQLException e) {
				e.printStackTrace();
			}
			i++;
		}
		db1.close();// 关闭连接

	}
	public void getAnswer(String fileName,int begin) {
		String sql = "select * from content";
		MySqlUtils db1 = null;
		db1 = new MySqlUtils(sql);// 创建DBHelper对象
		QuestionOP qop = new QuestionOP();
		String content = qop.getContent(fileName);
		List<String> q = qop.getQuestion(content,3,"(\\d+?\\s*?\\.)(.+?)([A-Z])");
		int i = begin;
		for (int j = 0; j < q.size();j++) {
			sql = "update content set q_answer = '"+q.get(j)+"' where id = '" + i + "'";// SQL语句

			try {
				db1.pst.executeUpdate(sql);// 执行语句，得到结果集
			} catch (SQLException e) {
				e.printStackTrace();
			}
			i++;
		}
		db1.close();// 关闭连接

	}
}
