package br.usp.sin5009;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
}

