package org.bikesterdam.demoDam.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.bikesterdam.demoDam.client.DemoDamService;

public class DemoDamServiceImpl extends RemoteServiceServlet implements DemoDamService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}