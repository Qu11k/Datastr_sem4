package service;

import datastr.MyGraph;
import model.City;

public class MainService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGraph<City> map = new MyGraph<City>();
		try {
			City c1 = new City("Ventspils", 55.4f, "LV-3601");
			City c2 = new City("Riga", 57.4f, "LV-3601");
			City c3 = new City("Kuldiga", 14.4f, "LV-3601");
			City c4 = new City("Tukums", 10.4f, "LV-3601");
			map.addVertice(c1);
			map.addVertice(c2);
			map.addVertice(c3);
			map.addVertice(c4);
			
			map.addEdge(c1, c2, 190);
			map.addEdge(c2, c3, 50);
			map.addEdge(c3, c4, 111);
			map.print();
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
		

	}

}
