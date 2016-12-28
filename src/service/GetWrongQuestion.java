package service;

import java.util.ArrayList;
import java.util.List;

import DAO.Content;
import DAO.ContentDAO;

public class GetWrongQuestion {
	ContentDAO newdao;
	Content content;
	public List<Content> getwrongquestion(List<Integer> ex){
		List<Content> wrong = new ArrayList<Content>();
		int i;
		for (i=0;i<ex.size();i++){
			content = newdao.findById(ex.get(i));
			wrong.add(content);
		}
		return wrong;
	}
	public ContentDAO getNewdao() {
		return newdao;
	}
	public void setNewdao(ContentDAO newdao) {
		this.newdao = newdao;
	}
}
