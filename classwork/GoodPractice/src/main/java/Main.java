import com.capgemini.dao.PlayerDAO;
import com.capgemini.dao.PlayerDAOImpl;
import com.capgemini.entity.Player;

public class Main {
    public static void main(String[] args){
        PlayerDAO dao = new PlayerDAOImpl();

        //insert
        dao.insertPlayer(new Player(10,"Dhoni","India"));
    }
}
