package org.bikesterdam.stockPriceWatch.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface StockPriceWatchServiceAsync {

    void getPrices(String[] symbols, AsyncCallback<StockPrice[]> callback);

}
