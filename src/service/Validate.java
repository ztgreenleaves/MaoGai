package service;

import java.util.ArrayList;
import java.util.List;

import DAO.Content;

public class Validate {
	public List<Integer> CompareFalse(List<Content> list,String[] ex){
		int i;
		List<Integer> error = new ArrayList<Integer>();
		for (i=0;i<ex.length;i++){
			if (!list.get(i).getQAnswer().equals(ex[i])){
				error.add(list.get(i).getId());
			}
		}
		return error;
	}
	
//	public List<Integer> CompareRight(List<Content> list,String[] ex){
//		int i;
//		List<Integer> correct = new ArrayList<Integer>();
//		for (i=0;i<ex.length;i++){
//			if (list.get(i).getQAnswer().equals(ex[i])){
//				correct.add(list.get(i).getId());
//			}
//		}
//		return correct;
//	}
	public List<String> wronganswer(List<Content> list,String[] ex){
		int i;
		List<String> wa = new ArrayList<String>();
		for (i=0;i<ex.length;i++){
			if (!list.get(i).getQAnswer().equals(ex[i])){
				wa.add(ex[i]);
			}
		}
		return wa;
	}
}
