import org.junit.Test;

/**
 * @creed: Here be dragons !
 * @author: EzioQAQ
 * @Time: 2019-07-08 17:58
 */

public class SnowflakeDistributeIdTest {

    @Test
    public void test() {
        SnowflakeDistributeId idWorker = new SnowflakeDistributeId(0, 1);
        for (int i = 0; i < 1; i++) {
            long id = idWorker.nextId();
            System.out.println(id);
        }
    }
}
