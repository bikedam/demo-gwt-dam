package org.bikesterdam.stockPriceWatch.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.google.gwt.core.client.GWT;
import org.bikesterdam.stockPriceWatch.client.model.DelistedException;
import org.bikesterdam.stockPriceWatch.client.model.StockPrice;

@RemoteServiceRelativePath("StockPriceWatchService")
public interface StockPriceWatchService extends RemoteService {


    StockPrice[] getPrices(String[] symbols) throws DelistedException;

    /**
     * Utility/Convenience class.
     * Use StockPriceWatchService.App.getInstance() to access static instance of StockPriceWatchServiceAsync
     */
    public static class App {
        private static final StockPriceWatchServiceAsync ourInstance = (StockPriceWatchServiceAsync) GWT.create(StockPriceWatchService.class);

        public static StockPriceWatchServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
