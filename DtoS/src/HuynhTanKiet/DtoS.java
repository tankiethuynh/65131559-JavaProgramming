package HuynhTanKiet;

import java.io.BufferedReader;
import java.io.FileReader;

public class DtoS {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("D:\\LapTrinhJavaProjects\\65131559-JavaProgramming\\KtoD\\test.txt");  
	    BufferedReader br = new BufferedReader(fr);  
	    String s;  
	    while((s = br.readLine()) != null)   
	    {  
	      System.out.println(s);  
	    }  
	    fr.close();  
	}

}
