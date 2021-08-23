package com.shopping.shoppingapp;
import java.util.Collection;
import com.shopping.shoppingapp.dao.ShopDAO;
import com.shopping.shoppingapp.dao.ShopDAOImpl;
import com.shopping.shoppingapp.dto.ShopsDTO;

public class ShoppingUtil {
	public static void main(String a[])
	{
	ShopsDTO shopsDTO=new ShopsDTO();
	shopsDTO.setShopId(23);
	shopsDTO.setFloor("1st floor");
	shopsDTO.setShopName("trends");
	shopsDTO.setType("clothing");
	ShopDAO dao=new ShopDAOImpl();
	dao.saveShop(shopsDTO);
	Collection<ShopsDTO> dtos=dao.getAllShops();
	for(ShopsDTO shopsDTO2:dtos)
	{
		System.out.println(shopsDTO2);
	}
	dao.updateFloorByName("3rd floor","trends");
	Collection<ShopsDTO> dtos1=dao.getAllShops();
	for(ShopsDTO shopsDTO2:dtos1)
	{
		System.out.println(shopsDTO2);
	}
	dao.deleteShopById(123);
	Collection<ShopsDTO> dto2=dao.getAllShops();
	if(dto2!=null)
	{
		for(ShopsDTO shopsDTO2:dto2) {
			System.out.println(shopsDTO2);
	}
	}else	{
			System.out.println("no coolection of shop found");
		}
}
}

