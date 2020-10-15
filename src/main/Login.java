package main;

import java.util.Scanner;

public class Login {
	
	public String username;
	private String password;
	public Scanner scan;
	private String specialChar = ("!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~");
	
	public Login() {
		this.username = "";
		this.password = "";
	}
	
	public Login(String u, String p) {
		this.username = u;
		this.password = p;		
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void checkUsername() {
		try {
			if (this.username.length() >= 10) {
				System.out.println(this.username + " is a valid username.");
			}
			else {
				int i = 10 /0;
			}
		} catch (Exception e) {
			System.out.println("Usernames need to be at least 10 characters.");
			System.out.print("Please try again: ");
			this.scan = new Scanner(System.in);
			String temp = new String(scan.next());
			this.setUsername(temp);
			this.checkUsername();
		}
	}
	
	public void checkPassword() {
		try {
			boolean temp = false;
			int i = 0;
			while(temp == false) {
				for(int x = 0; x < this.specialChar.length(); x++) {										
					if( i == 0 && this.password.charAt(i) ==  specialChar.charAt(x)) {					
						break;
					}
					else if (this.password.charAt(i) ==  specialChar.charAt(x) && temp != true) {
						temp = true;
						System.out.println(temp + " "+ x);
						break;
					}
				}
				i++;				
			}
			
			if(temp && this.password.length() >= 10) {
				System.out.println("Password is valid.");				
			}
			else {
				System.out.println(password.charAt(password.length()+1));
			}
		} catch(Exception e) {
			System.out.println(this.getPassword() + " is not a valid password because either it is not at least 10 "
					+ "characters or it does not contain 1 of these special characters: " + specialChar + " or it starts with 1 of the special characters.");
		}
	}

}
