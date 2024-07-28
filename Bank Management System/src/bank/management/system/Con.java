package bank.management.system;

import java.sql.*;

public class Con {
    Connection connection;
    Statement statement;
    public Con(){
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root",// your password in double quotes);
            statement=connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
