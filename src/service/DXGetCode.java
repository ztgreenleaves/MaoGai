package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import DAO.Duoxiang;
import DAO.DuoxiangDAO;



public class DXGetCode {
	DuoxiangDAO dao;
	static int sumQuestion = 796;
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
	public List<Duoxiang> getList(List<Integer> list){
		int i;
		List<Duoxiang> listcon = new ArrayList<Duoxiang>();
		for (i=0;i<list.size();i++){
			Duoxiang con = dao.findById(list.get(i));
			listcon.add(con);
		}
		return listcon;
	}
	public DuoxiangDAO getDao() {
		return dao;
	}
	public void setDao(DuoxiangDAO dao) {
		this.dao = dao;
	}
	
}
