package DAO;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionDAO {

        //nome do usuário no mysql
        private static final String USERNAME = "root";

        //senha do banco
        private static final String PASSWORD = "";

        //Caminho do banco
        private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/novobanco";

        //Conexão com o banco
        public static Connection createConnectiontoMySql() throws Exception {

                //Faz com que a classe seja carregada pela JVM
                Class.forName("com.mysql.jdbc.Driver");

                // Cria conexão com o banco
                Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

                return connection;
        }

        public static void main(String[] args) throws Exception {
                //recuperar uma conexão com o banco de dados
                Connection con = createConnectiontoMySql();

                //Testar se a conexão é nula
                if(con !=null){
                        System.out.println("Conexão obtida com sucesso");
                        con.close();
                }
        }

}