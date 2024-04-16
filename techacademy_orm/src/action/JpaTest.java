package action;

import javax.persistence.EntityManager;

import entity.City;
import util.DBUtil;

public class JpaTest {

    public static void main(String[] args) {
        // EntityManagerのオブジェクトを生成
        EntityManager em = DBUtil.createEntityManager();

        // 1件取得して名前を表示する
        City city = em.find(City.class, 1);
        System.out.println(city.getName());

        // EntityManagerの利用を終了する
        em.close();
    }
}
