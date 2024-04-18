/*
package com.oracle.contarctinfo;

import com.oracle.contarctinfo.services.ReportService;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


import java.util.Arrays;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = Controller.class)
public class ControllerTest extends TestContext {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    ReportService reportService;

    @Test
    @DisplayName("Verify healthCheck")
    public void testHealthCheck() throws Exception{
        MvcResult result=mockMvc.perform(get("/contractinfo/healthcheck"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();
    }
}
*/
