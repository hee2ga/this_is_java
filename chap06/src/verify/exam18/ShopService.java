package verify.exam18;

public class ShopService {
	private static ShopService shopService=new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return shopService;
	}
}
