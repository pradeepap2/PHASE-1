package com.javadeep_drive;

public class Access_Modifiers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//private
		
		Access_Modifiers1 obj = new Access_Modifiers1(); 
		 //trying to access private method of another class 
		 obj.display();
		}

		private void display() {
			// TODO Auto-generated method stub
	}

}
