package com.websites.websitesapp.comparator;
import java.util.Comparator;
import com.websites.websitesapp.dto.WebsitesDTO;;
public class SortWebsiteByDuration implements Comparator<WebsitesDTO> {
	@Override
	public int compare(WebsitesDTO o1,WebsitesDTO o2)
	{
		return o1.getDuration().compareTo(o2.getDuration());
	}
	

}
