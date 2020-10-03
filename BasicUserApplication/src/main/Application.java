package main;
import java.util.ArrayList;
import java.util.Calendar;


public class Application {
	
	private static ArrayList <User> listOfUsers;

	public static void main(String[] args) {
		
		listOfUsers = new ArrayList<>();
		
		listOfUsers.add(new User("John", "Doe", 34, "johndoe@gmail.com", "NEW"));
		listOfUsers.add(new User("Alex", "Pitt", 29, "alex@gmail.com", "NEW"));
		listOfUsers.add(new User("Marry", "Bob", 42, "marryb@gmail.com", "NEW"));
		listOfUsers.add(new User("Michael", "Jordan", 33, "michael@gmail.com", "ACTIVE"));
		listOfUsers.add(new User("Andrew", "Lebb", 19, "andrew@gmail.com", "ACTIVE"));
		listOfUsers.add(new User("Sarah", "Bach", 27, "sarah@gmail.com", "INACTIVE"));
		listOfUsers.add(new User("Jonny", "Alvarez", 16, "jonny@gmail.com", "ACTIVE"));
		listOfUsers.add(new User("Sandra", "Dobosh", 21, "sandra@gmail.com", "ACTIVE"));
		listOfUsers.add(new User("Christopher", "Nissen", 51, "christopher@gmail.com", "INACTIVE"));
		
		listOfUsers.get(0).setTimestamp(6, 9, 69);
		listOfUsers.get(8).setTimestamp(11, 9, 101);
		listOfUsers.get(5).setTimestamp(1, 9, 120);
		
		activateUsers(listOfUsers);
		blockUsers(listOfUsers);
		showListOfUsers(listOfUsers);
		
//		System.out.println(listOfUsers.get(5).getTimestamp().getMonth());
//		System.out.println(Calendar.getInstance().getTime().getMonth());
		
	}

	static void activateUsers(ArrayList <User> listOfUsers) {
		for (User user : listOfUsers) {
		if(user.getStatus().equals("NEW")) {
			if(Calendar.getInstance().getTime().getDate() > user.getTimestamp().getDate() ) {
				user.setStatus("ACTIVE");
		}else if(Calendar.getInstance().getTime().getMonth() > user.getTimestamp().getMonth()) {
			  user.setStatus("ACTIVE");
		}else if(Calendar.getInstance().getTime().getYear() > user.getTimestamp().getYear() ) {
			  user.setStatus("ACTIVE");
		}
	 }
	}
  }
	
	static void blockUsers(ArrayList <User> listOfUsers) {
		Integer days = 0;
		for (User user : listOfUsers) {
		  if(user.getStatus().equals("INACTIVE")) {
			if(Calendar.getInstance().getTime().getYear() != user.getTimestamp().getYear() ) {
				if(Calendar.getInstance().getTime().getMonth() ==  user.getTimestamp().getMonth()) {
					user.setStatus("BLOCKED");
				}else if(Calendar.getInstance().getTime().getMonth() - user.getTimestamp().getMonth() == -11 ) {
					days = Calendar.getInstance().getTime().getDate() + (31-user.getTimestamp().getDate());
					if(days > 30) {
						user.setStatus("BLOCKED");
					}
				}else {
					user.setStatus("BLOCKED");
				}
			}else if(Calendar.getInstance().getTime().getMonth() - user.getTimestamp().getMonth() == 1) {
				days = Calendar.getInstance().getTime().getDate() + (31-user.getTimestamp().getDate());
				//System.out.println(days);
				if(days > 30) {
					user.setStatus("BLOCKED");
				}
			}else if(Calendar.getInstance().getTime().getMonth() != user.getTimestamp().getMonth()) {
				   user.setStatus("BLOCKED");
			}
		}
	  }
	}
	
	static void showListOfUsers(ArrayList <User> listOfUsers) {
		for (User user : listOfUsers) {
			System.out.println(user);
		}
	}
}
