
package ar.com.eduit.curso.java.test;

import ar.com.eduit.curso.java.connector.ConnectorMySql;
import java.sql.Connection;
import java.sql.Statement;

public class TestConnector {
  public static void main(String[] args)  throws Exception {
      Connection conn = ConnectorMySql.getConnection();
      Statement st = conn.createStatement();
      String query = "insert into cursos (titulo, profesor,dia,turno) values"
              + "('HTML','Gomez','martes','tarde')";
              st.execute(query);
              st.close();
              
              ConnectorMySql.getConnection().createStatement().equals("insert into cursos (titulo, profesor,dia,turno) values"
              + "('Java','Torres','jueves','noche')");
  }  
}
