package com.icta.qualitycoder.hrapp.api;

import com.icta.qualitycoder.hrapp.security.SecurityManager;
import com.icta.qualitycoder.hrapp.security.SecurityManagerImpl;

public class ApiFacadeImpl implements ApiFacade {

    private SecurityManager manager = new SecurityManagerImpl();

    public boolean isUserAllowd(String userId) {
        return manager.isAllowd(userId);
    }

}
