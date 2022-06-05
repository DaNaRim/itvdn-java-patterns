package L14_Chain_of_responsibility.processors;

import L14_Chain_of_responsibility.domain.HTTPRequest;
import L14_Chain_of_responsibility.exceptions.AuthorizationException;

public class PathProcessorAuthentication extends HTTPAuthenticationRequestProcessor {

    public PathProcessorAuthentication(HTTPRequest request) {
        super(request);
    }

    @Override
    public void check() {
        if (!request.getPath().equals("\\authentication")) {
            throw new AuthorizationException("Incorrect authentication path");
        }
        super.check();
    }
}
