package com.oracle.contarctinfo;

import jakarta.servlet.http.HttpSession;
import org.springframework.mock.web.MockHttpSession;

public class TestEnvironmentIntitilizer {
    protected static final HttpSession Test_SESSION_OBJECT=new MockHttpSession();

    protected TestEnvironmentIntitilizer(){
        super();
    }

    public static void setUp() throws Exception{
        System.out.println("setup completed");
    }
}
