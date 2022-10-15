package DAO;
import com.mysql.jdbc.PreparedStatement;

import java.sql.Connection;


public class crudDAO {
    public void save(Cadastro cadastro) {
        String sql = "INSERT INTO Cadastro(nome,idade,email,cpf,telefone,rg,senha,conta) VALUES (?,?,?,?,?,?,?,?)";

        Connection connection = null;
        PreparedStatement pstm = null;

        try{
            //Criar uma conexão com o banco de dados
            connection = ConnectionDAO.createConnectiontoMySql();

            //Criamos uma prepareStatement, para executar uma query
            pstm = (PreparedStatement) connection.prepareStatement(sql);
            pstm.setString(1,cadastro.getNome());
        }
    }
}
