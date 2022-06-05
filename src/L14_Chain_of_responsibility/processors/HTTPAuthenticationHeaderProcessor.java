package L14_Chain_of_responsibility.processors;

import L14_Chain_of_responsibility.domain.HTTPRequest;
import L14_Chain_of_responsibility.exceptions.AuthorizationException;

public class HTTPAuthenticationHeaderProcessor extends HTTPAuthenticationRequestProcessor {

    public HTTPAuthenticationHeaderProcessor(HTTPRequest request) {
        super(request);
    }

    @Override
    public void check() {
        if (!request.getHeader().equals("\"Content-type\": \"application/json;chartSet=UTF-8\"")) {
            throw new AuthorizationException("Incorrect HTTPHeader");
        }
        super.check();
    }
}
