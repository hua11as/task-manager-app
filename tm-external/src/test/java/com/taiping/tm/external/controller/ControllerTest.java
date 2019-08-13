package com.taiping.tm.external.controller;

import com.taiping.tm.external.controller.v1.ExternalController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * desc:
 * author: as
 * date: 2019/6/27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ControllerTest {
    private MockMvc mockMvc;

    @Autowired
    ExternalController externalController;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(externalController).build();
    }

    @Test
    public void startFlowTest() throws Exception {
        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/external/startFlow")
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                        .param("str1", "36271b94630f45a589a4791dde9fe4a7")
                        .param("str2", "1517414399999")
                        .param("start", "1514736000000")
                        .param("selfAccountId", "ee3b9ffbb3e946899929882b4711b57d"))
                .andDo(print()).andExpect(status().isOk()).andReturn().getResponse()
                .getContentAsString();
    }

}
