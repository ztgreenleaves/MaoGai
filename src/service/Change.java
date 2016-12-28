package service;

public class Change {
	public String[] ChangeString(String ex){
		System.out.println("="+ex);
		
		String str[] = ex.split(",");  
//		System.out.println("str length:"+str.length);
//		for (String s:str){
//		System.out.println("="+s);
//		}
		return str;
	}
	
	
}