package service;

import java.util.ArrayList;
import java.util.List;

import DAO.Content;
import DAO.ContentDAO;
import DAO.Duoxiang;
import DAO.DuoxiangDAO;

public class DXGetWrongQuestion {
	DuoxiangDAO newdao;
	Duoxiang duoxiang;
	public List<Duoxiang> getwrongquestion(List<Integer> ex){
		List<Duoxiang> wrong = new ArrayList<Duoxiang>();
		int i;
		for (i=0;i<ex.size();i++){
			duoxiang = newdao.findById(ex.get(i));
			wrong.add(duoxiang);
		}
		return wrong;
	}
	public DuoxiangDAO getNewdao() {
		return newdao;
	}
	public void setNewdao(DuoxiangDAO newdao) {
		this.newdao = newdao;
	}
}
