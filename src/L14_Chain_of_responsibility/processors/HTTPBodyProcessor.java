package L14_Chain_of_responsibility.processors;

import L14_Chain_of_responsibility.domain.AuthorizationObject;
import L14_Chain_of_responsibility.domain.HTTPRequest;
import L14_Chain_of_responsibility.exceptions.AuthorizationException;
import L14_Chain_of_responsibility.utils.JSONUtils;

public class HTTPBodyProcessor extends HTTPAuthenticationRequestProcessor {

    public HTTPBodyProcessor(HTTPRequest request) {
        super(request);
    }

    @Override
    public void check() {
        if (request.getBody() == null || request.getBody().isEmpty()) {
            throw new AuthorizationException("Wrong username or password");
        }

        JSONUtils utils = new JSONUtils();
        AuthorizationObject authObject = utils.fromJSON(request.getBody());
        System.out.println(utils.toJSON(authObject));
        super.check();
    }
}
