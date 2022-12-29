package org.bikesterdam.demoDam.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("DemoDamService")
public interface DemoDamService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use DemoDamService.App.getInstance() to access static instance of DemoDamServiceAsync
     */
    public static class App {
        private static DemoDamServiceAsync ourInstance = GWT.create(DemoDamService.class);

        public static synchronized DemoDamServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
