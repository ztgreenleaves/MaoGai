package action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.omg.CORBA.Request;

import DAO.Content;
import DAO.ContentDAO;
import service.GetCode;

public class GetQusetion_Action {

	List<Content> list;
	String answerStr;// 答案存储字符串.以“1,1,2,3,5”类似存储;1=A 2=B ...
	private String number;
	static List<String> answerList;
	int t, i;
	String s = "";
	GetCode getcode;

	public String getsuccess() {
		t = Integer.parseInt(number);
		answerList = getcode.initAnswerList(t);
		// GetCode getcode = new GetCode();
		List<Integer> listcode = new ArrayList<Integer>();
		listcode = getcode.Question(t);
		setList(getcode.getList(listcode));
		return "success";
	}

	public String toOtherPage() {
		System.out.println("," + answerStr);
		return "success1";
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public List<Content> getList() {
		return list;
	}

	public void setList(List<Content> list) {
		this.list = list;
	}

	public GetCode getGetcode() {
		return getcode;
	}

	public void setGetcode(GetCode getcode) {
		this.getcode = getcode;
	}

	public static List<String> getAnswerList() {
		return answerList;
	}

	public static void setAnswerList(List<String> answerList) {
		GetQusetion_Action.answerList = answerList;
	}

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}

	public String getAnswerStr() {
		return answerStr;
	}

	public void setAnswerStr(String answerStr) {
		this.answerStr = answerStr;
	}

}
