package L14_Chain_of_responsibility;

import L14_Chain_of_responsibility.domain.HTTPMethod;
import L14_Chain_of_responsibility.domain.HTTPRequest;
import L14_Chain_of_responsibility.processors.*;

public class Main {

    public static void main(String[] args) {
        HTTPRequest request = new HTTPRequest("\\authentication",
                HTTPMethod.POST,
                "\"Content-type\": \"application/json;chartSet=UTF-8\"",
                "{\"username\": \"John Dou\", \"password\": \"qwerty123\"}"
        );

        HTTPAuthenticationRequestProcessor rootProcessor = new HTTPAuthenticationRequestProcessor(request);
        rootProcessor.add(new PathProcessorAuthentication(request));
        rootProcessor.add(new HTTPAuthenticationMethodProcessor(request));
        rootProcessor.add(new HTTPAuthenticationHeaderProcessor(request));
        rootProcessor.add(new HTTPBodyProcessor(request));

        rootProcessor.check();
    }
}
