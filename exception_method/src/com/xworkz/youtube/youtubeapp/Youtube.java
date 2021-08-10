package com.xworkz.youtube.youtubeapp;
	public class Youtube implements Cloneable{
		private int accountId;
		private String accountName;
		private long views;
		private int duration;
		public int getAccountId()
		{
			return accountId;
		}
		public void setAccountId(int accountId)
		{
			this.accountId=accountId;
		}
		public String getAccountName()
		{
			return accountName;
		}
		public void setAccountName(String accountName)
		{
			this.accountName=accountName;
		}
		public long getViews()
		{
			return views;
		}
		public void setViews(long views)
		{
			this.views=views;
		}
		public int getDuration()
		{
			return duration;
		}
		public void setDuration(int duration)
		{
			this.duration=duration;
		}
		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
		
		

	}

