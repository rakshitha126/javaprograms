package com.xworkz.youtube.youtubeapp;
import com.xworkz.youtube.youtubeapp.Youtube;
public class YoutubeTester {
public static void main(String a[]) throws CloneNotSupportedException{
	Youtube youtube = new Youtube();
	youtube.setAccountId(12);
	youtube.setAccountName("Sangetha");
	youtube.setViews(700000L);
	youtube.setDuration(60);
	
	System.out.println(youtube.getAccountId()+" "+youtube.getAccountName()+" "+youtube.getViews()+" "+youtube.getDuration());
	Youtube you= (Youtube)youtube.clone();
	you.setViews(80000L);
	you.setDuration(200);
	System.out.println(you.getAccountId()+" "+you.getAccountName()+" "+you.getDuration()+" "+you.getViews());
}
}

