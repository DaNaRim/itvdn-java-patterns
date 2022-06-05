package L14_Chain_of_responsibility.utils;

import L14_Chain_of_responsibility.domain.AuthorizationObject;
import L14_Chain_of_responsibility.exceptions.JSONException;

public class JSONUtils {

    public String toJSON(AuthorizationObject authorizationObject) {
        return "{" + "\n" +
                "\"username\": " + authorizationObject.getUsername() + "\"," + "\n" +
                "\"password\": " + authorizationObject.getPassword() + "\"\n" +
                "}";
    }

    public AuthorizationObject fromJSON(String stringAuthObject) {
        if (!(stringAuthObject.startsWith("{") && stringAuthObject.endsWith("}"))) {
            throw new JSONException("Incorrect format");
        }
        if (!(stringAuthObject.contains("\"username\":") && stringAuthObject.contains("\"password\":"))) {
            throw new JSONException("Wrong JSON Object");
        }

        AuthorizationObject authorizationObject = new AuthorizationObject();
        authorizationObject.setUsername(stringAuthObject.substring(
                stringAuthObject.indexOf("\"username\": \"") + 12, stringAuthObject.indexOf("\",")));
        authorizationObject.setPassword(stringAuthObject.substring(
                stringAuthObject.indexOf("\"password\": \"") + 12, stringAuthObject.indexOf("\"}")));
        return authorizationObject;
    }
}
