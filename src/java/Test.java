
import java.util.Date;
import ma.school.beans.Etudiant;
import ma.school.util.HibernateUtil;
import ma.school.service.EtudiantService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author akhmim
 */
public class Test {

    public static void main(String[] args) {
        EtudiantService es = new EtudiantService();
//        es.create(new Etudiant("RAMI", "ALI", "Agadir", new Date(), "homme"));
//        es.create(new Etudiant("Akhmim", "Abdelilah", "Casa", new Date(), "male"));

        for (Etudiant e : es.findAll()) {
//            System.out.println(e.getId() + " " + e.getNom());
            System.out.println(e);

        }
    }
}
