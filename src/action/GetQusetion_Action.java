package action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.omg.CORBA.Request;

import DAO.Content;
import DAO.ContentDAO;
import service.Change;
import service.GetCode;
import service.GetWrongQuestion;
import service.Validate;

public class GetQusetion_Action {

	List<Content> list;
	List<Content> qwrong;
	String answerStr;// 绛旀瀛樺偍瀛楃涓�浠モ�1,1,2,3,5鈥濈被浼煎瓨鍌�1=A 2=B ...
	private String number;
//	private List<Integer> Correct;
//	private List<Integer> Error;
	List<String> answerList;
	int t, i;
	String s = "";
	GetCode getcode;
	GetWrongQuestion getwrong;
	
	public String getsuccess() {
		t = Integer.parseInt(number);
		answerList = getcode.initAnswerList(t);
		// GetCode getcode = new GetCode();
		List<Integer> listcode = new ArrayList<Integer>();
		listcode = getcode.Question(t);
		setList(getcode.getList(listcode));
		return "success";
	}
	
//	public String getgrade(){
//		Change change = new Change();
//		String[] newanswer = change.ChangeString(answerStr);
//		Validate validate = new Validate(); 
//		setCorrect(validate.CompareRight(list, newanswer));
//		setError(validate.CompareFalse(list, newanswer));
//		return "getsu";
//	}
	
	public String toOtherPage() {
		String answer1= answerStr.substring(1);
		System.out.println("answerStr':"+answerStr);
		System.out.println("answer1':"+answer1);
		System.out.println("answer1'length:"+answer1.length());
		Change change = new Change();
		String[] newanswer = change.ChangeString(answer1);
//		System.out.println("change.ChangeString(answer1)'s length:"+change.ChangeString(answer1).length);
//		System.out.println("newanswer's length:"+newanswer.length);
		Validate validate = new Validate();
		setQwrong(getwrong.getwrongquestion(validate.CompareFalse(list, newanswer)));
		setAnswerList(validate.wronganswer(list, newanswer));
//		setCorrect(validate.CompareRight(list, newanswer));
//		setError(validate.CompareFalse(list, newanswer));
//		System.out.println("序号是"+yy);
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

	public List<String> getAnswerList() {
		return answerList;
	}

	public void setAnswerList(List<String> answerList) {
		this.answerList = answerList;
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

	public List<Content> getQwrong() {
		return qwrong;
	}

	public void setQwrong(List<Content> qwrong) {
		this.qwrong = qwrong;
	}

	public GetWrongQuestion getGetwrong() {
		return getwrong;
	}

	public void setGetwrong(GetWrongQuestion getwrong) {
		this.getwrong = getwrong;
	}
	
//	public List<Integer> getCorrect() {
//		return Correct;
//	}
//
//	public void setCorrect(List<Integer> correct) {
//		Correct = correct;
//	}
//
//	public List<Integer> getError() {
//		return Error;
//	}
//
//	public void setError(List<Integer> error) {
//		Error = error;
//	}
	
}
