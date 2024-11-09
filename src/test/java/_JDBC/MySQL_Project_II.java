package _JDBC;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class MySQL_Project_II  extends JDBCParent{
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
        System.out.println("***************************************************************");
        DBConnectionOpen();

        ResultSet rs1 = statement.executeQuery("select salary from salaries;");
        ResultSetMetaData rsmd1=rs1.getMetaData();

        while (rs.next())
            System.out.println(rs1.getString("salary"));

        int maas = 0;
        for (int i = 1; i <= rsmd1.getColumnCount(); i++) {
            rs1.next();
            rs1.getInt("salary");


        }
        System.out.println(maas);
        DBConnectionClose();


    }


    public static class MySQL_Project_II_02 extends JDBCParent {
        public static void main(String[] args) throws SQLException {

            DBConnectionOpen();

            ResultSet rs1 = statement.executeQuery("select salary from salaries;");
            ResultSetMetaData rsmd1=rs1.getMetaData();

            int ortalamaMaas = 0;

            while (rs1.next()) {
                System.out.println(rs1.getString("salary"));
                ortalamaMaas = ortalamaMaas + rs1.getInt("salary");
                ortalamaMaas = ortalamaMaas/2;
            }
            System.out.println(ortalamaMaas);

            DBConnectionClose();
        }
    }
}
