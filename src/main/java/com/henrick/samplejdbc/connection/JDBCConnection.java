package com.henrick.samplejdbc.connection;

import com.henrick.samplejdbc.controller.vo.CostumerVO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCConnection {

    private static final String JDBC = "jdbc:";

    public List<CostumerVO> load() throws Exception {
        List<CostumerVO> costumerVOS = new ArrayList<>();
        Connection conn = null;
        Statement stmt = null;

        final String URL = JDBC + System.getenv("CLEARDB_DATABASE_URL");
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(URL);
        stmt = conn.createStatement();
        final String query = "select * from costumer";
        final ResultSet rs = stmt.executeQuery(query);

        CostumerVO costumerVO;
        while (rs.next()){
            costumerVO = new CostumerVO();
            costumerVO.setIdCostumer(rs.getInt("idCostumer"));
            costumerVO.setNameCostumer(rs.getString("nmCostumer"));
            costumerVOS.add(costumerVO);
        }

        return costumerVOS;
    }

}
