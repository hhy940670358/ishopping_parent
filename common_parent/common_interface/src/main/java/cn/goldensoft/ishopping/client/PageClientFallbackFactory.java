package cn.goldensoft.ishopping.client;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.Map;
@Component
public class PageClientFallbackFactory implements FallbackFactory<PageClient> {
    @Override
    public PageClient create(Throwable throwable) {
        return new PageClient() {
            @Override
            public void generateStaticPage(Map<String, Object> params) {
                System.out.println("静态网页降级");
            }
        };
    }
}
