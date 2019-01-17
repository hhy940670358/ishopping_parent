package cn.goldensoft.ishopping.controller;

import cn.goldensoft.ishopping.client.PageClient;
import cn.goldensoft.ishopping.util.VelocityUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
@RestController
public class PageController implements PageClient {

    @Override
    @RequestMapping(value = "/page",method = RequestMethod.POST)
    public void generateStaticPage(@RequestBody Map<String, Object> params) {
        //获取需要的页面数据
        Object model = params.get("model");
        //获取模板的路径
        String templatePath = (String) params.get("templatePath");
        //获取生成静态页面的路径
        String staticPagePath = (String) params.get("staticPagePath");
        VelocityUtils.staticByTemplate(model, templatePath, staticPagePath);
    }
}
