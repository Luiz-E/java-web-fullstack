import org.example.conexaojdbc.SingleConnection;
import org.example.dao.UserPosDAO;
import org.example.model.UserposJava;
import org.junit.Test;

public class TesteBancoJdbc {

    @Test
    public void initBanco() {
        SingleConnection.getConn();
    }

    @Test
    public void testInsert() {
        UserPosDAO userPosDao = new UserPosDAO();
        UserposJava user = new UserposJava();
        user.setId(2L);
        user.setNome("Teste");
        user.setEmail("teste@teste.com");
        userPosDao.salvar(user);
    }

}
