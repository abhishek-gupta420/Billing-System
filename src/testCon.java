
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class testCon {
    public static void main(String args[]) throws ClassNotFoundException, SQLException{
        String un="root";
        String pass="password";
        String url="jdbc:mysql://localhost:3306/billingsystem";
        
                
        Class.forName("com.mysql.jdbc.Driver");
        try{
            Connection con=DriverManager.getConnection(url,un,pass);
            Statement st=con.createStatement();
            System.out.println("successfully connected to Data Base ");
            System.out.print("connection success");
           // String query="insert into abx vlaues(2,'abhishek gupta',70)";
            String query;
            query="select * from buyer";
            
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            System.out.println("\n" + rs.getString(1)+" " +rs.getString(2)+" " + rs.getString(3));
            
            con.close();            
        }
        catch(Exception e){
            System.out.print(e);
        }
            
        
             
    }

      
}
