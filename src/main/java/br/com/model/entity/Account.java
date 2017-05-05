package br.com.model.entity;
public class Account {
	
	public Account(String coinId, String type, String coin, Double  purchaseRate) {
		super();
		this.coinId = coinId;
		this.type = type;
		this.coin = coin;
		this.purchaseRate = purchaseRate;
	}
	
	private String coinId;
	
	private String type;
	
	private String coin;
	
	private Double purchaseRate;

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

	public Double  getPurchaseRate() {
		return purchaseRate;
	}

	public void setPurchaseRate(Double purchaseRate) {
		this.purchaseRate = purchaseRate;
	}

}
