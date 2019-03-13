package com.sight.mao.modular.controller;

import com.sight.mao.modular.dao.CollegeMapper;
import com.sight.mao.modular.pojo.College;
import com.sight.mao.modular.pojo.CollegeExample;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @pagckageName org.jim.server.modular.controller
 * @dcscribe 页面介绍
 * @time @author Created by SIGHT on 2019/3/13.
 */
@RestController
public class TestController {

   @Autowired
   private CollegeMapper collegeMapper;


    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(){
        CollegeExample example = new CollegeExample();
        example.setOffset(0);
        example.setLimit(10);
        List<College> collegeList = collegeMapper.selectByExample(example);
        //todo
      return "hellow" +collegeList.size()+collegeList.get(0).getName();
    }



}



