/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SupportLoginFacebook;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.Version;
import com.restfb.scope.FacebookPermissions;
import com.restfb.types.User;
import java.io.IOException;
import org.apache.http.client.fluent.Request;

/**
 *
 * @author phuch_cqzh776
 */
public class RestFB implements FacebookInfo {

    public static String getToken(final String code) {
        try {
            String link = String.format(FACEBOOK_LINK_GET_TOKEN, FACEBOOK_APP_ID, FACEBOOK_APP_SECRET, FACEBOOK_REDIRECT_URL, code);
            String reponse = Request.Get(link).execute().returnContent().asString();

            JsonObject jobj = new Gson().fromJson(reponse, JsonObject.class);

            String accessToken = jobj.get("access_token").toString().replaceAll("\"", "");
            return accessToken;
        } catch (JsonSyntaxException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static User getUserInfo(String accessToken) {
        FacebookClient facebookClient = new DefaultFacebookClient(accessToken, FACEBOOK_APP_SECRET, Version.LATEST);

        return facebookClient.fetchObject("me", User.class, Parameter.with("fields", "id,name,email,first_name, last_name"));
    }
}
