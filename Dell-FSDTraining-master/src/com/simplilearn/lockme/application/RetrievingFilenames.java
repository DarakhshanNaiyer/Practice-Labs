package com.simplilearn.lockme.application;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RetrievingFilenames {

	public static void main(String[] args) {
		// TODO: Retrieving the file names in an ascending order
		 String path="C:\\Users\\negia3\\workspace_FSD\\LockedMe.com";
		 String[] dirListing = null;
		 File dir = new File(path);
		 dirListing = dir.list();
		 Arrays.sort(dirListing);
		 System.out.println(Arrays.deepToString(dirListing));
	}

}
