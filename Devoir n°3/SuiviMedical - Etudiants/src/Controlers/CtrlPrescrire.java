package Controlers;

import Tools.ConnexionBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CtrlPrescrire
{
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;

    public CtrlPrescrire() {
        cnx = ConnexionBDD.getCnx();
    }

    public void InsertPrescrire(int idConsult, int numMedicament, int quantite, int idDate)
    {
        // A vous de jouer

        try {
            ps = cnx.prepareStatement("INSERT INTO consultations VALUES (?,?,?,?)");
            ps.setInt(1, idConsult);
            ps.setInt(2,numMedicament);
            ps.setInt(3, quantite);
            ps.setInt(4, idDate);

            ps.executeUpdate();
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }



    }
}
