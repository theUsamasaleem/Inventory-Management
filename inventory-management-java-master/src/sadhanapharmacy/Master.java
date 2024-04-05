
package sadhanapharmacy;

import java.sql.*;





public class Master{

    
    Statement   st;
    ResultSet   rs;
    
    Connection  con;
    String      url;
    
    
    
    
    
    public Master(){

        new Home().setVisible(true);
        try{
            
            //url = "jdbc:ucanaccess://D:/Programming/Netbeans Projects/SadhanaPharmacy/SP.mdb";
            url = "jdbc:ucanaccess://SP.mdb";
            con = DriverManager.getConnection(url);        
            
        }catch(Exception e){
            System.out.println("Could Not Connect to Database" +e);
        }
        
        try{
            rs.next();
            
                    
        }catch (Exception e){
            
        }
    }
    
    
    
    
    
    
    
    
    
    public static void LookAndFeel(){
            try {for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    
    
    public static void main(String[] args){
        
        LookAndFeel();
        
        new Master();
        
     
    }


    
}
