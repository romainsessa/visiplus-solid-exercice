package fr.visiplus.exercice;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {

	public int compare(User o1, User o2) {
		return o1.getUsername().compareTo(o2.getUsername());
	}

}
