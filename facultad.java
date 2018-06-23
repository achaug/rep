package facultad;

///////////////////////////////////////////////////////////////////////////////////////////
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/////////////////////////////////////////////////////
//Plan 111Mil Programadore
//Objetivo:Devolver la coneecion dede un metodo
//autor:Augusto Acha
//////////////////////////////////////////////////////
public class facultad {

      //Declara la variableS privada
   private String url1,user1,pass1,DRIVER;
   
      public Connection meconecta() throws ClassNotFoundException, SQLException{                  
             
                 //DRIVER="Class.forName(\"com.mysql.jdbc.Driver\")";
                 //verificar q se cargue el driver
                 Class.forName("com.mysql.jdbc.Driver");
                 //que conecte con SSL encriptacion
      String unicode="useSSL=false&autoReconnect=true&useUnicode=yes&characterEncoding=UTF-8";
             url1="jdbc:mysql://127.0.0.1:3306/facultad?"+unicode;
             user1="root";
              pass1="";                
               
            //devolver coneccion
             return DriverManager.getConnection(url1,user1,pass1);
          }
      
    Connection coneccion11() throws ClassNotFoundException, SQLException{
           return meconecta();
    }
      
}   

           


