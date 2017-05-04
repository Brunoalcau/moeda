package utils;
public class Account {
	
	public Account(String coinId, String type, String coin, String purchaseRate, String purchaseParity,
			String paritySale) {
		super();
		this.coinId = coinId;
		this.type = type;
		this.coin = coin;
		this.purchaseRate = purchaseRate;
		this.purchaseParity = purchaseParity;
		this.paritySale = paritySale;
	}
	
	private String coinId;
	
	private String type;
	
	private String coin;
	
	private String purchaseRate;
	
	private String purchaseParity;
	
	private String paritySale;

	public String getCoinId() {
		return coinId;
	}

	public void setCoinId(String coinId) {
		this.coinId = coinId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCoin() {
		return coin;
	}

	public void setCoin(String coin) {
		this.coin = coin;
	}

	public String getPurchaseRate() {
		return purchaseRate;
	}

	public void setPurchaseRate(String purchaseRate) {
		this.purchaseRate = purchaseRate;
	}

	public String getPurchaseParity() {
		return purchaseParity;
	}

	public void setPurchaseParity(String purchaseParity) {
		this.purchaseParity = purchaseParity;
	}

	public String getParitySale() {
		return paritySale;
	}

	public void setParitySale(String paritySale) {
		this.paritySale = paritySale;
	}

}
