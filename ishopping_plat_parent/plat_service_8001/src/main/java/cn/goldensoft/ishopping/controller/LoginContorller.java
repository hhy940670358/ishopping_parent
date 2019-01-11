package cn.goldensoft.ishopping.controller;

import cn.goldensoft.ishoping.util.AjaxResult;
import cn.goldensoft.ishopping.domain.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginContorller {
    /**
     * 参数：Employee
     * 返回值：登录是否成功 AjaxResult
     * @RequestBody 以后前台传递的对象都要用@RequestBody接收
     * @RequestParam 以后前台传递的参数都要用@RequestParam接收
     * */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if("admin".equals(employee.getName())&&"123".equals(employee.getPassword()))
            return AjaxResult.me();
        return AjaxResult.me().setSuccess(false).setMessage("用户名或密码错误");
    }
}
