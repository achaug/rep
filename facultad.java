package facultad;

///////////////////////////////////////////////////////////////////////////////////////////
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//Carrera alumno,materia 1 a 1 materia tiene carrera

public class facultad {
   //private String url1,user1,pass1,DRIVER;
    /* 
   static Connection cn;
     String url,user,pass;
     
     facultad() throws SQLException, ClassNotFoundException{
                Class.forName("com.mysql.jdbc.Driver");
                 url="jdbc:mysql://127.0.0.1:3306/facultad";
                 user="root";
                 pass="";
                 
              cn=DriverManager.getConnection(url,user,pass);
             if (cn != null){
                System.out.println("coneccion establecida valor de cn:"+cn);
                 cn.close();
             }  
             else{
                 System.out.println("No se pudo conectar!! valor de cn:"+cn);
             
             }       
     }
      */
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

           


