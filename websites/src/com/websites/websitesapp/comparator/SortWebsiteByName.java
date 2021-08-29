package com.websites.websitesapp.comparator;
import java.util.Comparator;
import com.websites.websitesapp.dto.WebsitesDTO;
public class SortWebsiteByName implements Comparator<WebsitesDTO>{
	@Override
	public int compare(WebsitesDTO o1,WebsitesDTO o2)
	{
		return o1.getName().compareTo(o2.getName());
	}

}
