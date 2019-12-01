
package br.usp.sin5009;

import javax.jws.WebService;

@WebService(endpointInterface = "br.usp.sin5009.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

