package cn.goldensoft.ishopping.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@FeignClient(value = "ISHOPPING-COMMON",fallbackFactory = RedisClientFallbackFactory.class) //服务提供者的名称
@RequestMapping("/common")
public interface RedisClient {

    @RequestMapping(value = "/redis",method = RequestMethod.POST)
    void set(@RequestParam("key")String key,@RequestParam("value")String value);

    @RequestMapping(value = "/redis",method = RequestMethod.GET)
    String get(@RequestParam("key")String key);

}
