package apexam.freeresponse.twoCookies;

import java.util.ArrayList;
import java.util.List;

public class MasterOrder {
	private List<CookieOrder> orders;
	
	public MasterOrder(){
		orders = new ArrayList<CookieOrder>();
	}
	
	public void addOrder(CookieOrder theOrder){
		orders.add(theOrder);
	}
	
	public int getTotalBoxes(){
		int numBoxes = 0;
		for(int i = 0; i < orders.size(); i++){
			numBoxes+= orders.get(i).getNumBoxes();
		}
		return numBoxes;
	}
	
	public int removeVariety (String cookieVar){
		int boxCount = 0;
		int index = 0;
		while(index<orders.size()){
			if(orders.get(index).getVariety().equals(cookieVar)){
				boxCount+=orders.get(index).getNumBoxes();
				orders.remove(index);
			}
		}
		return boxCount;
	}
}
