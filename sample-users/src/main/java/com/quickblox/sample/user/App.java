package com.quickblox.sample.user;

import com.quickblox.sample.core.CoreApp;
import com.quickblox.sample.user.definitions.Consts;

public class App extends CoreApp {

    @Override
    public void onCreate() {
        super.onCreate();

        // Initialize QuickBlox application with credentials
        super.initCredentials(Consts.APP_ID, Consts.AUTH_KEY, Consts.AUTH_SECRET, Consts.ACCOUNT_KEY);
    }
}
