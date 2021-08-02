package com.example.jpabook2;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class LombokTest {

    @Test
    public void test(){
        //given
        LombokClass lombokClass = new LombokClass();
        String param = "string";

        //when
        lombokClass.setName(param);

        //then
        String name = lombokClass.getName();

        assertThat(name).isEqualTo(param);
    }
}
