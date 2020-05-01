package com.org.company.hr.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created in Eclipse IDE.
 * Project : hr-master
 * User: yash
 * Date: 18/01/2020
 */
@RestController
public class HeartBeat
{
    @RequestMapping("heartbeat")
    public String heartbeat()
    {
        return "Always up and running for you";
    }
}
