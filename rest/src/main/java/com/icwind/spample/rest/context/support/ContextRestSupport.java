package com.icwind.spample.rest.context.support;

import com.icwind.spample.rest.context.view.UserProfileView;

public interface ContextRestSupport {

    UserProfileView exchangeCurrentBenity(String username, String benityId);

    UserProfileView getUserProfile(String username);

}
