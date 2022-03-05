package daysix.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public MapDemo() {	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map cityMap =new HashMap();
		cityMap.put(new Key(1,"NY"), "New York City");
		cityMap.put(new Key(2,"NDLS"), "New Delhi");
		cityMap.put(new Key(3,"LKO"), "Lucknow");
		cityMap.put(new Key(4,"HWH"), "Howrah");
		
		System.out.println(cityMap.size());
		System.out.println(cityMap);
	}

}
