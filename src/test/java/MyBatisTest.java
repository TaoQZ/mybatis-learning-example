import org.junit.After;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.taoqz.domain.Brand;
import xyz.taoqz.mapper.BrandMapper;
import xyz.taoqz.utils.MybatisUtils;

/**
 * @author :almostTao
 * @date :Created in 2019/11/20 17:48
 */
public class MyBatisTest {

    private final BrandMapper mapper = MybatisUtils.getMapper(BrandMapper.class);

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void demo(){
        Brand brand = new Brand(null,"安踏",null,"A");
        mapper.insert(brand);
        logger.info("添加成功");
    }

    @After
    public void commitAndClose(){
        logger.info("提交并关闭资源");
        MybatisUtils.commitAndclose();
    }

}
