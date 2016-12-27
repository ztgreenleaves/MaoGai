package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import DAO.Content;
import DAO.ContentDAO;

public class GetCode {
	ContentDAO dao;
	static int sumQuestion = 250;
	public static List<String> initAnswerList(int t){
		List<String> answerList = new ArrayList<String>();
		for (int j = 0; j < t; j++){
			answerList.add("E");
		}
		return answerList;
	}
	public  static List<Integer> Question(int s){
		Random  r = new Random(); 

		List<Integer> list = new ArrayList<Integer>(); 

		int i; 

		while(list.size() < s){ 

			i = r.nextInt(sumQuestion)+1; 

			if(!list.contains(i)){ 

				list.add(i); 

			} 

		}
		return list;
	}	
	public List<Content> getList(List<Integer> list){
		int i;
		List<Content> listcon = new ArrayList<Content>();
		for (i=0;i<list.size();i++){
			Content con = dao.findById(list.get(i));
			listcon.add(con);
		}
		return listcon;
	}
	public ContentDAO getDao() {
		return dao;
	}
	public void setDao(ContentDAO dao) {
		this.dao = dao;
	}
}
