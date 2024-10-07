import org.example.conexaojdbc.SingleConnection;
import org.junit.Test;

public class TesteBancoJdbc {

    @Test
    public void initBanco() {
        SingleConnection.getConn();
    }

}
