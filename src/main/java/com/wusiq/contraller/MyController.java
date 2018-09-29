package com.wusiq.contraller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wusiq.activemq.Producer;

@Controller
@RequestMapping(value = "user")
public class MyController {
	
    @Autowired
    Producer producer;
	
    @ResponseBody
    @RequestMapping(value="/ddd",method = RequestMethod.GET)
	public String doSome() {
		producer.sendTranMsg("testtttttt333");
		return "33";
	}
}
