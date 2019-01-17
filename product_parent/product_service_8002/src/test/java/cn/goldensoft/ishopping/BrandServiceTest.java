package cn.goldensoft.ishopping;


import cn.goldensoft.ishoping.util.PageList;
import cn.goldensoft.ishopping.domain.Brand;
import cn.goldensoft.ishopping.domain.ProductType;
import cn.goldensoft.ishopping.query.BrandQuery;
import cn.goldensoft.ishopping.service.IBrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProductService_8002.class)
public class BrandServiceTest {

    @Autowired
    private IBrandService brandService;
    @Test
    public void testSelectAll(){
        PageList<Brand> brandPageList = brandService.selectPageList(new BrandQuery());
        System.out.println(brandPageList.getTotal());
        List<Brand> rows = brandPageList.getRows();
//        for (Brand row : rows) {
//            ProductType productType = row.getProductType();
//           // System.out.println(productType);
//        }
    }
}
