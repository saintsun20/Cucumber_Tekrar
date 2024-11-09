package _JDBC;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _02_Soru_2 extends JDBCParent{

    public static void main(String[] args) throws SQLException {
        DBConnectionOpen();

        ResultSet rs = statement.executeQuery("select * from employees");
        ResultSetMetaData rsmd=rs.getMetaData();

        int kolonSayisi= rsmd.getColumnCount();
        System.out.println("kolonSayisi = " + kolonSayisi);

        for (int i = 1; i <= kolonSayisi; i++) {
            System.out.println(rsmd.getColumnName(i)+" "+rsmd.getColumnTypeName(i));
        }

        rs.next();
        for (int i = 1; i <= kolonSayisi; i++) {
            System.out.println(i+".kolon="+rs.getString(i));
        }

        while (rs.next())
            System.out.println(rs.getString("emp_no"));

        DBConnectionClose();
    }
}
