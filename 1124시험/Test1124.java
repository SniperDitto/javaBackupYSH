package com.human.ex;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Test1124 {

	public static void main(String[] args) {
		try {
			String fileLocation = "B:\\javaBackupYSH\\1124시험\\testdata.csv";
        	FileInputStream inputStream = new FileInputStream(fileLocation);
            InputStreamReader reader = new InputStreamReader(inputStream,"UTF-8");
            BufferedReader br = new BufferedReader(reader);
            String line = "";
            int row =0;
            ArrayList<String> name = new ArrayList<String>();
            ArrayList<String> email = new ArrayList<String>();
            ArrayList<String> phone = new ArrayList<String>();
            ArrayList<String> jumin = new ArrayList<String>();
 
            while ((line = br.readLine()) != null) {
                // -1 은 마지막 "," 이후 빈 공백도 읽기 위함
                String[] data = line.split(",", -1);
                
                for(int i=0;i<data.length;i++) {
                	//System.out.println(data[i]+" i="+i+" row="+row);
                	//이름판별
                	if(Pattern.matches("^[가-힣]*$", data[i])) {
                		name.add(data[i]);
                	}
                	//전화번호판별
                	if(Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$", data[i])) {
                		phone.add(data[i]);
                	}
                	//이메일판별
                	if(Pattern.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?", data[i])) {
                		email.add(data[i]);
                	}
                	//주민번호판별
                	if(Pattern.matches("\\d{6}\\-[1-4]\\d{6}", data[i])) {
                		jumin.add(data[i]);
                	}
                }
                
                
                
               // System.out.println();
                
                row++;
            }
            br.close();
            System.out.println("<이름>");
            for(int i=0;i<name.size();i++) System.out.println(name.get(i));
            System.out.println();
            System.out.println("<전화번호>");
            for(int i=0;i<phone.size();i++) System.out.println(phone.get(i));
            System.out.println();
            System.out.println("<이메일>");
            for(int i=0;i<email.size();i++) System.out.println(email.get(i));
            System.out.println();
            System.out.println("<주민번호>");
            for(int i=0;i<jumin.size();i++) System.out.println(jumin.get(i));
//            System.out.println("이름 리스트: "+name);
//            System.out.println("전화번호 리스트: "+phone);
//            System.out.println("이메일 리스트: "+email);
//            System.out.println("주민번호 리스트: "+jumin);
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }


	}

}
