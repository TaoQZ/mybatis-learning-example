import org.junit.After;
import org.junit.Test;
import xyz.taoqz.domain.Brand;
import xyz.taoqz.mapper.BrandMapper;
import xyz.taoqz.utils.MybatisUtils;

/**
 * @author :almostTao
 * @date :Created in 2019/11/20 17:48
 */
public class MyBatisTest {

    private final BrandMapper mapper = MybatisUtils.getMapper(BrandMapper.class);

    @Test
    public void demo(){
        Brand brand = new Brand(null,"安踏",null,"A");
        mapper.insert(brand);
    }

    @After
    public void commitAndClose(){
        MybatisUtils.commitAndclose();
    }

}
