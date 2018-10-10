package com.tyzq.imps.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tyzq.imps.model.RestResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user/")
@Setter
@Getter
@Slf4j
@Api(value = "UserController")
public class UserController  {

    @RequestMapping(value = "/find-by-username", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "根据姓名查询用户", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "姓名", required = true, dataType = "String", paramType = "query")
    })
    public RestResult findByCodeAction(@RequestParam(name = "username") String username, HttpServletRequest request){
//        log.info("find User by username[{}] request", username);
        RestResult result = new RestResult();
//        EntityWrapper<User> u=new EntityWrapper<User>();
//        u.eq("name", username); 
////        u.eq("","");
//        List<User> community = userService.selectList(u);
//        if(community == null){
//            result.setResult(ErrCode.No_Data);
//        }else{
//            result.setData(community);
//        }
//        log.info("find User by username[{}] response: {}", username, JsonUtil.toJson(result));
//         222
        return result;
    }
}
