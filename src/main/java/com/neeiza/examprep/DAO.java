package com.neeiza.examprep;

import java.sql.*;

public class DAO {
    public ResultSet login(String username, String password) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/redfox", "root", "MoneiBakang@959115515");
        PreparedStatement pst = connection.prepareStatement("select * from admin where userid = ? and password = ?");
        pst.setString(1, username);
        pst.setString(2, password);
        ResultSet resultSet = pst.executeQuery();
        return resultSet;
    }
}
