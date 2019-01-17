package cn.goldensoft.ishopping;

import cn.goldensoft.ishopping.domain.User;
import cn.goldensoft.ishopping.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProductService_8002.class)
public class UserServiceTest {

    @Autowired
    private IUserService userService;
    @Test
    public void testSelectAll(){
        List<User> users = userService.selectList(null);
        System.out.println(users);
    }
}
