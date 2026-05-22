package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.PracticeBean;

public class PracticeDAO extends DAO{
	
    public List<PracticeBean> findAll(String order) throws Exception {
        List<PracticeBean> list = new ArrayList<>();

        String sql = "SELECT * FROM product ORDER BY " + order;

        try (Connection con = getConnection();
             PreparedStatement st = con.prepareStatement(sql);
             ResultSet rs = st.executeQuery()) {

            while (rs.next()) {
                PracticeBean p = new PracticeBean();
                    p.setId(rs.getInt("id"));
                    p.setName(rs.getString("name"));
                    p.setPrice(rs.getInt("price"));
                list.add(p);
            }
        }
        return list;
    }
}


