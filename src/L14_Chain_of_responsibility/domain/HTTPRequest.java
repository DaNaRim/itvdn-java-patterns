package L14_Chain_of_responsibility.domain;

public class HTTPRequest {

    private String path;
    private HTTPMethod method;
    private String header;
    private String body;

    public HTTPRequest(String path,
                       HTTPMethod method,
                       String header,
                       String body) {
        this.path = path;
        this.method = method;
        this.header = header;
        this.body = body;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public HTTPMethod getMethod() {
        return method;
    }

    public void setMethod(HTTPMethod method) {
        this.method = method;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "HTTPRequest{" +
                "path='" + path + '\'' +
                ", method=" + method +
                ", header='" + header + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
