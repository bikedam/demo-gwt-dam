package org.bikesterdam.demoDam.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface DemoDamServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
