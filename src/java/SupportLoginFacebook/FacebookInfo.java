/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SupportLoginFacebook;

/**
 *
 * @author phuch_cqzh776
 */
public interface FacebookInfo {

    public static String FACEBOOK_APP_ID = "675194033118554";
    public static String FACEBOOK_APP_SECRET = "4fc3fda482fb95106506e3f4a873bb63";
    public static String FACEBOOK_REDIRECT_URL = "http://localhost:8080/LoginFacebook/login-facebook";
    public static String FACEBOOK_LINK_GET_TOKEN = "https://graph.facebook.com/oauth/access_token?client_id=%s&client_secret=%s&redirect_uri=%s&code=%s";
}
