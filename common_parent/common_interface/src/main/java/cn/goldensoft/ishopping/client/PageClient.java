package cn.goldensoft.ishopping.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 *
 */
@FeignClient(value = "ISHOPPING-COMMON",fallbackFactory = PageClientFallbackFactory.class) //服务提供者的名称
@RequestMapping("/common")
public interface PageClient {
    /**
     * 根据特定模板传入特定数据,生成静态页面到特定位置
     *
     * Map<String,Object> params中
     * Object model  == 数据,
     * String templatePath == 模板路径和名称,
     * String staticPagePath== 生成文件路径和名称
     */
    @RequestMapping(value = "/page",method = RequestMethod.POST)
    public void generateStaticPage(@RequestBody Map<String,Object> params);

}
