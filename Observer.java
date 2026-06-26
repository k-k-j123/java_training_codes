//Observer and observable objects in java
import java.util.*;
class Channel{
	List<CustomerSubscriber> al = new ArrayList<>();
	void subscribe(CustomerSubscriber cs) {
		al.add(cs);
	}
	
	void printSubs() {
		for(CustomerSubscriber i : al) {
			System.out.println(i.name);
		}
	}
}
class CustomerSubscriber{
	String name;
	Channel worldAffairs;
	CustomerSubscriber(String name){
		this.name  = name;
	}
	
	void subscribeChannel(Channel c) {
		this.worldAffairs = c;
	}
	
	
}
public class Observer {

	public static void main(String[] args) {
		
		Channel c = new Channel();
		CustomerSubscriber cs1 = new CustomerSubscriber("Omkar");
		CustomerSubscriber cs2 = new CustomerSubscriber("Shubham");
		CustomerSubscriber cs3 = new CustomerSubscriber("Ankit");
		CustomerSubscriber cs4 = new CustomerSubscriber("Alankar");
		CustomerSubscriber cs5 = new CustomerSubscriber("Amol");
		
		c.subscribe(cs1);
		c.subscribe(cs2);
		c.subscribe(cs3);
		c.subscribe(cs4);
		c.subscribe(cs5);
		
		cs1.subscribeChannel(c);
		cs2.subscribeChannel(c);
		cs3.subscribeChannel(c);
		cs4.subscribeChannel(c);
		cs5.subscribeChannel(c);
		
		c.printSubs();
	}

}
