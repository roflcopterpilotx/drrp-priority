/* /r/DanganRoleplay FCFS-Priority Hybrid Casting Program
 * Concept: /u/DestinyShiva
 * Code: /u/roflcopterpilotx
 * original code do not steal :ok_hand:
 */

import java.util.*;
public class priority_main {

	public static void main(String[] args) {	
		
		ArrayList<registrant> cast_list = new ArrayList<registrant>();
		//Test Case courtesy /u/DestinyShiva
		
		cast_list.add(new registrant("Lnce", -5));
		cast_list.add(new registrant("Tyby", -4));
		cast_list.add(new registrant("Awka", -2));
		cast_list.add(new registrant("Shdw", -4));
		cast_list.add(new registrant("Phii", -2));
		
		cast_list.add(new registrant("Rave", -1));
		cast_list.add(new registrant("Socc", -2));
		cast_list.add(new registrant("Leon", -3));
		cast_list.add(new registrant("Spag", -4));
		cast_list.add(new registrant("Aero", -3));
		
		
		//DEBUG: Output the initial registrations.
		System.out.println("INITIAL REGISTRATIONS:");
		for(int i = 0; i < cast_list.size(); i++) {
			System.out.println(cast_list.get(i).toString());
			cast_list.get(i).set_order(i);
		}
		
		//Perform priority adjustments. This process has runtime O(n^2).
		//For each registrant, perform a priority adjustment.
		System.out.println("PERFORMING ADJUSTMENTS:");
		for(int i = 0; i < cast_list.size(); i++) {
			int index = -1;
			
			//First, find the person with order i.
			//This ensures we adjust each person in our registration exactly one time.
			for(int j = 0; j < cast_list.size(); j++) {
				if(cast_list.get(j).get_order() == i) {
					index = j;
					System.out.println("Found " + cast_list.get(index).get_name() 
												+ " with order " + cast_list.get(index).get_order() 
												+ " at index " + index + ".");
					break;
				}
			}
			
			//DEBUG: Say how many places you're moving them. (Negative means down).
			System.out.println(   "Moving " + cast_list.get(index).get_name() 
											+ " down " + cast_list.get(index).get_priority() 
											+ " places.");
			
			//Second, swap them abs(PRIORITY) times down the list.
			int swap_num = Math.abs(cast_list.get(index).get_priority());
			for(int j = index; j < index+swap_num; j++) {
				if(j >= cast_list.size()-1) {break;}
				Collections.swap(cast_list, j, j+1);
			}
			
			//DEBUG: Print out the list after this adjustment is made.
			System.out.println("After adjustment " + (i+1) + ", the list is:");
			for(int k = 0; k < cast_list.size(); k++) {
				System.out.println(cast_list.get(k).get_name());
			}
		}
		
		//Print the final cast.
		System.out.println("FINAL CASTING:");
		for(int i = 0; i < cast_list.size(); i++) {
			int cast = i+1;
			System.out.println("Cast " + cast_list.get(i).get_name() + " with rank " + cast);
		}
		
		
	}
	
	

}
