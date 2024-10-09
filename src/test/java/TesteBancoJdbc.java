import org.example.conexaojdbc.SingleConnection;
import org.example.dao.UserPosDAO;
import org.example.model.UserposJava;
import org.junit.Test;

import java.util.List;

public class TesteBancoJdbc {

    @Test
    public void initBanco() {
        SingleConnection.getConn();
    }

    @Test
    public void testInsert() {
        UserPosDAO userPosDao = new UserPosDAO();
        UserposJava user = new UserposJava();
        user.setNome("a");
        user.setEmail("a@teste.com");
        userPosDao.salvar(user);
    }

    @Test
    public void testSelect() {
        UserPosDAO userPosDAO = new UserPosDAO();
        List<UserposJava> userList = userPosDAO.listar();

        for (UserposJava user : userList) {
            System.out.println(user);
            System.out.println("-------------------------------------");
        }

    }

    @Test
    public void testBuscar() {
        UserPosDAO userPosDAO = new UserPosDAO();
        UserposJava user = userPosDAO.buscar(2L);
        System.out.println(user);
    }

    @Test
    public void testUpdate() {
        UserPosDAO userPosDAO = new UserPosDAO();

        UserposJava user = userPosDAO.buscar(2L);
        user.setNome("Teste Atualizado");
        userPosDAO.update(user);
    }

    @Test
    public void testDelete() {
        UserPosDAO userPosDAO = new UserPosDAO();
        userPosDAO.delete(3L);
    }
}
