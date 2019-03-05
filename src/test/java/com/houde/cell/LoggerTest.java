package com.houde.cell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by houde
 * 2019-03-05 13:19
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {


    @Test
    public void testLog() {
        log.info("info...");
        log.debug("debug...");
        log.error("error...");
        log.warn("warn...");
    }

}
