package com.simplilearn.lockme.application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import com.simplilearn.lockme.model.UserCredentials;
import com.simplilearn.lockme.model.Users;

public class Authentication {
	//input data
	private static Scanner keyboard;
	private static Scanner input;
	private static Scanner lockerInput;
	//output data 
	private static PrintWriter output;
	private static PrintWriter lockerOutput;
	//model to store data.
	private static Users users;
	private static UserCredentials userCredentials;
	private static UserCredentials username;
	public static String filename;
	
	
	
	public static void main(String[] args) throws IOException {
		initApp();
		welcomeScreen();
		signInOptions();
		//CreateSpecificUserFile();
		

	}
	public static void signInOptions() throws IOException {
		System.out.println("1 . Registration ");
		System.out.println("2 . Login ");
		int option = keyboard.nextInt();
		switch(option) {
			case 1 : 
				registerUser();
				break;
			case 2 :
				loginUser();
				break;
			default :
				System.out.println("Please select 1 Or 2");
				break;
		}
		keyboard.close();
		input.close();
	}
	
	public static void lockerOptions(String inpUsername) throws IOException {
		System.out.println("1 . FETCH ALL STORED CREDENTIALS ");
		System.out.println("2 . STORE CREDENTIALS ");
		System.out.println("3 . DELETE USER credential ");
		System.out.println("4 . SEARCH USER ");
		int option = keyboard.nextInt();
		switch(option) {
			case 1 : 
				fetchCredentials(inpUsername);
				break;
			case 2 :
				StoreCredential(inpUsername);
				break;
			case 3 :
				deleteFile(inpUsername); 
				break;
			case 4 :
				SearchUser(inpUsername); 
				break;
			default :
				System.out.println("Please select 1 Or 2");
				break;
		}
		lockerInput.close();
	}
	
	public static void registerUser() throws IOException {
		System.out.println("==========================================");
		System.out.println("*					*");
		System.out.println("*   WELCOME TO REGISTRATION PAGE	*");
		System.out.println("*					*");
		System.out.println("==========================================");
		
		System.out.println("Enter Username :");
		String username = keyboard.next();
		users.setUsername(username);
		
		System.out.println("Enter Password :");
		String password = keyboard.next();
		users.setPassword(password);
		
		output.println(users.getUsername());
		output.println(users.getPassword());
		
		System.out.println("User Registration Suscessful !");
		
		
		
		output.close();
		
	}
	public static void loginUser() throws IOException {
		System.out.println("==========================================");
		System.out.println("*					*");
		System.out.println("*   WELCOME TO LOGIN PAGE	 *");
		System.out.println("*					*");
		System.out.println("==========================================");
		System.out.println("Enter Username :");
		String inpUsername = keyboard.next();
		boolean found = false;
		while(input.hasNext() && !found) {
			if(input.next().equals(inpUsername)) {
				System.out.println("Enter Password :");
				String inpPassword = keyboard.next();
				if(input.next().equals(inpPassword)) {
					System.out.println("Login Successful ! 200OK");
					found = true;
					lockerOptions(inpUsername);
					break;
				}
			}
		}
		if(!found) {
			System.out.println("User Not Found : Login Failure : 404");
		}
		
	}
	
	public static void welcomeScreen() {
		System.out.println("==========================================");
		System.out.println("*					*");
		System.out.println("*   Welcome To LockMe.com		*");
		System.out.println("*   Your Personal Digital Locker	*");
		System.out.println("*					*");
		System.out.println("==========================================");
		
	}
	//store credentials
	public static void StoreCredential(String loggedInUser) throws IOException {
		System.out.println("==========================================");
		System.out.println("*					*");
		System.out.println("*   WELCOME TO DIGITAL LOCKER STORE YOUR CREDS HERE	 *");
		System.out.println("*					*");
		System.out.println("==========================================");
		
		userCredentials.setLoggedInUser(loggedInUser);
		
		System.out.println("Enter Site Name :");
		String siteName = keyboard.next();
		userCredentials.setSiteName(siteName);
		
		System.out.println("Enter Username :");
		String uname= keyboard.next();
		userCredentials.setUsername(uname);
		
		System.out.println("Enter Password :");
		String pwd = keyboard.next();
		userCredentials.setPassword(pwd);
			
		lockerOutput.println(userCredentials.getLoggedInUser());
		lockerOutput.println(userCredentials.getSiteName());
		lockerOutput.println(userCredentials.getUsername());
		lockerOutput.println(userCredentials.getPassword());
		
		
		
		//=========Creating a user specific file once a user is being created with username.txt as file name================
		
				filename= String.format(userCredentials.getUsername()+"."+"txt");
			    File myObj = new File(filename);
			     if (myObj.createNewFile()) {
			    	System.out.println("File created: " + myObj.getName());
			    	//Writing to the file
					
				      FileWriter myWriter = new FileWriter(filename);
				      myWriter.write("sitename:" +siteName);
				      myWriter.append('\n');
				      myWriter.write("username:" +uname);
				      myWriter.append('\n');
				      myWriter.write("password:" +pwd);
				      myWriter.close();
				      System.out.println("YOUR CREDS ARE STORED to the " + myObj.getName() + "file AND SECURED!");
			      } else {
			        System.out.println("File already exists.");
			      }
		
		
						
	}
	
	//fetch credentials
	public static void fetchCredentials(String filename) throws IOException {
		System.out.println("==========================================");
		System.out.println("*					*");
		System.out.println("*   WELCOME TO DIGITAL LOCKER 	 *");
		System.out.println("*   YOUR CREDS ARE 	 *");
		System.out.println("*					*");
		System.out.println("==========================================");
		System.out.println(filename);
		System.out.println("Enter Username :");
		String uname= keyboard.next();
		userCredentials.setUsername(uname);
		lockerInput = new Scanner(filename);
		
		
		while(lockerInput.hasNext()) {
			if(lockerInput.next().equals(filename)) {
				File myObj = new File(filename+"."+"txt"); 
				Scanner myReader = new Scanner(myObj);
			      while (myReader.hasNextLine()) {
			        String data = myReader.nextLine();
			        System.out.println(data);
			      }
			
		  }
			  }
			
	}
	
	//Delete user specific file
		public static void deleteFile(String filename) {
			System.out.println("==========================================");
			System.out.println("*					*");
			System.out.println("*   WELCOME TO DIGITAL LOCKER 	 *");
			System.out.println("*   YOUR CREDS ARE 	 *");
			System.out.println("*					*");
			System.out.println("==========================================");
			System.out.println(filename);
			System.out.println("Enter Username :");
			String uname= keyboard.next();
			userCredentials.setUsername(uname);
			lockerInput = new Scanner(filename);	
			
			while(lockerInput.hasNext()) {
				if(lockerInput.next().equals(filename)) {
					 File myObj = new File(filename+"."+"txt"); 
					    if (myObj.delete()) { 
					      System.out.println("Deleted the file: " + myObj.getName());
					    } else {
					      System.out.println("Failed to delete the file.");
					    } 
					
				}
			}
			
		}
		
		//Search user specific file
				public static void SearchUser(String filename) {
					System.out.println("==========================================");
					System.out.println("*					*");
					System.out.println("*   WELCOME TO DIGITAL LOCKER 	 *");
					System.out.println("*   YOUR CREDS ARE 	 *");
					System.out.println("*					*");
					System.out.println("==========================================");
					System.out.println(filename);
					System.out.println("Enter Username :");
					String uname= keyboard.next();
					userCredentials.setUsername(uname);
					lockerInput = new Scanner(filename);
										
					while(lockerInput.hasNext()) {
						if(lockerInput.next().equals(filename)) {
							 File myObj = new File(filename+"."+"txt"); 
							    if (myObj.delete()) { 
							      System.out.println("User " + myObj.getName() + " exists");
							    } else {
							      System.out.println("User does not exist.");
							    } 
							
						}
					}
					
				}
	
	public static void initApp() throws IOException {

		File  dbFile = new File("database.txt");
		File  lockerFile = new File("locker-file.txt");
		
		try {
			//read data from db file
			input = new Scanner(dbFile);
			
			//red data from locker file
			lockerInput = new Scanner(lockerFile);
			
			//read data from keyboard
			keyboard = new Scanner(System.in);
			
			//out put 
			output = new PrintWriter( new FileWriter(dbFile,true));
			lockerOutput = new PrintWriter( new FileWriter(lockerFile,true));
			
			users = new Users();
			userCredentials  = new UserCredentials();
			
			
		} catch (IOException e) {
			System.out.println("404 : File Not Found ");
		}
		
	}
	
	
	
}
