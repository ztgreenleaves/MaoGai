package action;

import java.util.ArrayList;
import java.util.List;

import DAO.Content;
import DAO.ContentDAO;
import service.GetCode;

public class GetQusetion_Action {
	private String number;
	List<Content> list;
	int t,i;
	String s="";
	GetCode getcode;
	public String getsuccess(){
		t = Integer.parseInt(number);
		//GetCode getcode = new GetCode();
		List<Integer> listcode = new ArrayList<Integer>(); 
		listcode = getcode.Question(t);
		setList(getcode.getList(listcode));
		return "success";
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
	
}
