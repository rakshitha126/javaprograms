package com.shopping.shoppingapp.dao;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import com.shopping.shoppingapp.dto.ShopsDTO;
public class ShopDAOImpl implements ShopDAO{
	public Collection<ShopsDTO> dtos=new ArrayList<ShopsDTO>();
	public ShopDAOImpl()
	{
		
	}
	@Override
	public void saveShop(ShopsDTO shopsDTO)
	{
		if(shopsDTO!=null)
		{
			dtos.add(shopsDTO);
			System.out.println("shop details added");
		}else {
			System.out.println("shop is empty");
		}
	}
	@Override
	public Collection<ShopsDTO> getAllShops()
	{
		if(dtos!=null && !dtos.isEmpty())
		{
			return dtos;
		}
		return null;
	}
	@Override
	public void updateFloorByName(String flr,String nm)
	{
		if(flr!=null && nm!=null)
		{
			for(ShopsDTO shopsDTO:dtos)
			{
				shopsDTO.setFloor("3rd floor");
			}
		}
	}
	@Override
	public void deleteShopById(int id)
	{
		if(id>0)
		{
			for(ShopsDTO shopsDTO:dtos)
			{
				if(id==shopsDTO.getShopId())
				{
					dtos.remove(shopsDTO);
				}
			}
		}
	}
}
