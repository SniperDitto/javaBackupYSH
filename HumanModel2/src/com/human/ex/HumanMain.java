package com.human.ex;

import com.human.controller.HumanExecute;
import com.human.controller.Request;
import com.human.controller.Response;
import com.human.controller.humanDelete;
import com.human.controller.humanInsert;
import com.human.controller.humanSelect;
import com.human.controller.humanUpdate;
import com.human.util.DBinput;

public class HumanMain {

	public static void main(String[] args) {
		
		boolean isExit=false;
		
		while(isExit==false) {
			Request request=new Request();
			Response response=new Response();
			HumanExecute execute=null;
			
			System.out.println("메뉴 선택");
			System.out.print("1.insert 2.update 3.delete 4.select 5.종료 : ");
			int inputMenu=DBinput.inputInt();
			switch (inputMenu) {
			case 1:
				execute=new humanInsert();
				execute.execute(request, response);
				break;
			case 2:
				execute=new humanUpdate();
				execute.execute(request, response);
				break;
			case 3:
				execute=new humanDelete();
				execute.execute(request, response);
				break;
			case 4:
				execute=new humanSelect();
				execute.execute(request, response);
				break;
			case 5:
				isExit=true;
				break;
			default:
				break;
			}
			
		}
		
		System.out.println("종료");

	}

}
