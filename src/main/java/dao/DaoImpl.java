package dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        /*
        se connecter a la DB pour recuperer la temperature
         */
        System.out.println("Version Base de données");
        double temp = Math.random()*40;
        return temp;
    }
}
