package org.bikesterdam.stockPriceWatch.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import org.bikesterdam.stockPriceWatch.client.model.DelistedException;
import org.bikesterdam.stockPriceWatch.client.model.StockPrice;

public interface StockPriceWatchServiceAsync {

    void getPrices(String[] symbols, AsyncCallback<StockPrice[]> callback);

}
