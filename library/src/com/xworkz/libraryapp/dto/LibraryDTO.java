package com.xworkz.libraryapp.dto;
	import java.io.Serializable;
	public class LibraryDTO implements Serializable{
		private int libraryId;
		private String libraryName;
		private String type;
		private String location;
		public int getLibraryId() {
			return libraryId;
		}
		public void setLibraryId(int libraryId) {
			this.libraryId = libraryId;
		}
		public String getLibraryName() {
			return libraryName;
		}
		public void setLibraryName(String libraryName) {
			this.libraryName = libraryName;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		
		@Override
		public int hashCode()
		{
			final int prime=31;
			int result=1;
			result=prime*result+libraryId;
			result=prime*result+((libraryName==null)?0:libraryName.hashCode());
			result=prime*result+((location==null)?0:type.hashCode());
			return result;
			
		}
		@Override
		public boolean equals(Object obj)
		{
			if(this==obj)
				return true;
			if(obj==null)
				return false;
			if(getClass()!=obj.getClass())
				return false;
			LibraryDTO other=(LibraryDTO) obj;
			if(libraryId!=other.libraryId)
				return false;
			if(libraryName==null)
			{
				if(other.libraryName!=null)
					return false;
			}
			else if(!libraryName.contentEquals(other.libraryName))
				return false;
			if(location==null)
			{
				if(other.location!=null)
					return false;
			}
			else if(!location.contentEquals(other.location))
				return false;
			if(location==null)
			{
				if(other.location!=null)
				return false;
			}
			else if(!location.contentEquals(other.location))
				return false;
			if(type==null)
			{
				if(other.type!=null)
					return false;
			}
			else if(!type.contentEquals(other.type))
				return false;
			return true;
		}
		@Override
		public String toString()
		{
			return "LibraryDTO [libraryId="+libraryId+",libraryName="+libraryName+",type="+type+",location="+location+"]";
		}

	}

