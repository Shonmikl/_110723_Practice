package org.example._2023_11_9.mockito.stub;

public class PricingRepository {

	// [... other methods ...]

	public Price getPriceForTrade(Trade trade) {
		return trade.price;
	}
}