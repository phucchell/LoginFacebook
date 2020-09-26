/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SupportLoginFacebook;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Version;
import com.restfb.scope.FacebookPermissions;
import com.restfb.scope.ScopeBuilder;

/**
 *
 * @author phuch_cqzh776
 */
public class FBGetUrl implements FacebookInfo {

    public static String getUrl() {
        ScopeBuilder scopeBuilder = new ScopeBuilder();
        scopeBuilder.addPermission(FacebookPermissions.EMAIL);
        FacebookClient client = new DefaultFacebookClient(Version.LATEST);
        String loginDialogUrlString = client.getLoginDialogUrl(FACEBOOK_APP_ID, FACEBOOK_REDIRECT_URL, scopeBuilder);
        return loginDialogUrlString;
    }

}
