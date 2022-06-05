package L14_Chain_of_responsibility.processors;

import L14_Chain_of_responsibility.domain.HTTPMethod;
import L14_Chain_of_responsibility.domain.HTTPRequest;
import L14_Chain_of_responsibility.exceptions.AuthorizationException;

public class HTTPAuthenticationMethodProcessor extends HTTPAuthenticationRequestProcessor {

    public HTTPAuthenticationMethodProcessor(HTTPRequest request) {
        super(request);
    }

    @Override
    public void check() {
        if (!request.getMethod().equals(HTTPMethod.POST)) {
            throw new AuthorizationException("Incorrect HTTPMethod");
        }
        super.check();
    }
}
