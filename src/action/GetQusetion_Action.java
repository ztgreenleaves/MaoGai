package action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.omg.CORBA.Request;

import DAO.Content;
import DAO.ContentDAO;
import DAO.Duoxiang;
import service.Change;
import service.DXGetCode;
import service.DXGetWrongQuestion;
import service.DXValidate;
import service.GetCode;
import service.GetWrongQuestion;
import service.Validate;

public class GetQusetion_Action {

	List<Content> list;
	List<Content> qwrong;
	List<Duoxiang> dxlist;
	List<Duoxiang> dwrong;
	String answerStr;// 绛旀瀛樺偍瀛楃涓�浠モ�1,1,2,3,5鈥濈被浼煎瓨鍌�1=A 2=B ...
	private String number;
	// private List<Integer> Correct;
	// private List<Integer> Error;
	List<String> answerList;
	List<String> dxanswerList;
	int t, y, i;
	String s = "";
	String answerGrade;
	GetCode getcode;
	DXGetCode dxgetcode;
	GetWrongQuestion getwrong;
	DXGetWrongQuestion dxgetwrongquestion;

	public String getsuccess() {
		t = 80;
		y = 20;
		// answerList = getcode.initAnswerList(t);
		// GetCode getcode = new GetCode();
		List<Integer> listcode = new ArrayList<Integer>();
		List<Integer> dxlistcode = new ArrayList<Integer>();
		listcode = getcode.Question(t);
		dxlistcode = dxgetcode.Question(y);
		setList(getcode.getList(listcode));
		setDxlist(dxgetcode.getList(dxlistcode));
		return "success";
	}

	// public String getgrade(){
	// Change change = new Change();
	// String[] newanswer = change.ChangeString(answerStr);
	// Validate validate = new Validate();
	// setCorrect(validate.CompareRight(list, newanswer));
	// setError(validate.CompareFalse(list, newanswer));
	// return "getsu";
	// }

	public String toOtherPage() {
//		System.out.println("answerStr'length:" + answerStr.length());
		String answer1 = answerStr.substring(1, 160);
		String answer2 = answerStr.substring(161, answerStr.length());
//		System.out.println("answerStr':" + answerStr);
//		System.out.println("answer1':" + answer1);
//		System.out.println("answer2':" + answer2);
//		System.out.println("answer1'length:" + answer1.length());
		Change change = new Change();
		String[] newanswer = change.ChangeString(answer1);
		String[] dxanswer = change.ChangeString(answer2);
		// System.out.println("change.ChangeString(answer1)'s length:"+change.ChangeString(answer1).length);
		// System.out.println("newanswer's length:"+newanswer.length);
		Validate validate = new Validate();
		DXValidate dxvalidate = new DXValidate();
		setQwrong(getwrong.getwrongquestion(validate.CompareFalse(list,
				newanswer)));
		setDwrong(dxgetwrongquestion.getwrongquestion(dxvalidate.CompareFalse(
				dxlist, dxanswer)));
		setAnswerList(validate.wronganswer(list, newanswer));
		setDxanswerList(dxvalidate.wronganswer(dxlist, dxanswer));
		// setCorrect(validate.CompareRight(list, newanswer));
		// setError(validate.CompareFalse(list, newanswer));
		// System.out.println("序号是"+yy);
		return "success1";
	}

	public String getAnswerGrade() {
		return answerGrade;
	}

	public void setAnswerGrade(String answerGrade) {
		this.answerGrade = answerGrade;
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

	public List<Duoxiang> getDxlist() {
		return dxlist;
	}

	public void setDxlist(List<Duoxiang> dxlist) {
		this.dxlist = dxlist;
	}

	public DXGetCode getDxgetcode() {
		return dxgetcode;
	}

	public void setDxgetcode(DXGetCode dxgetcode) {
		this.dxgetcode = dxgetcode;
	}

	public DXGetWrongQuestion getDxgetwrongquestion() {
		return dxgetwrongquestion;
	}

	public void setDxgetwrongquestion(DXGetWrongQuestion dxgetwrongquestion) {
		this.dxgetwrongquestion = dxgetwrongquestion;
	}

	public List<String> getDxanswerList() {
		return dxanswerList;
	}

	public void setDxanswerList(List<String> dxanswerList) {
		this.dxanswerList = dxanswerList;
	}

	public List<Duoxiang> getDwrong() {
		return dwrong;
	}

	public void setDwrong(List<Duoxiang> dwrong) {
		this.dwrong = dwrong;
	}

	// public List<Integer> getCorrect() {
	// return Correct;
	// }
	//
	// public void setCorrect(List<Integer> correct) {
	// Correct = correct;
	// }
	//
	// public List<Integer> getError() {
	// return Error;
	// }
	//
	// public void setError(List<Integer> error) {
	// Error = error;
	// }

}
