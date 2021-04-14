
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import junit.framework.Assert;
import listadetrabajadores.Cliente;
import listadetrabajadores.Plato;
import listadetrabajadores.Restaurante;
import listadetrabajadores.Cocinero;
import listadetrabajadores.Controlador;



import org.junit.Test;
import org.xml.sax.SAXException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexeltocayo
 */
public class unit_tests {
    
    @Test
    public void pruebaContructorPorParametrosCocinero(){
        
        Cocinero juan = new Cocinero(1, 1235.5, "juanillo", "Comida japonesa", 3);
        
        Assert.assertEquals(1, juan.getId_cocinero().byteValue());
        Assert.assertEquals(1235.5, juan.getSalario());
        Assert.assertEquals("juanillo", juan.getNombre());
        Assert.assertEquals("Comida japonesa", juan.getEspecialidad());
        Assert.assertEquals(3, juan.getNumero_de_premios());
    }
    
    @Test
    public void pruebaContructorPorParametrosPlato(){
        
        Plato revuleto_de_setas = new Plato(1, "Revuelto de setas con huevos rotos", "Umami", 25, 1);
        
        Assert.assertEquals(1, revuleto_de_setas.getId_plato());
        Assert.assertEquals("Revuelto de setas con huevos rotos", revuleto_de_setas.getNombre_plato());
        Assert.assertEquals("Umami", revuleto_de_setas.getSabor_principal());
        Assert.assertEquals(25, revuleto_de_setas.getTiempo_de_prep());
        Assert.assertEquals(1, revuleto_de_setas.getNum_ingredientes());
    }
    
    @Test
    public void pruebaContructorPorParametrosRestaurante(){
        
        Restaurante casaMari = new Restaurante(1, "Casa Mari", "Granda", 55, 10);
        
        Assert.assertEquals(1, casaMari.getId_restaurante());
        Assert.assertEquals("Casa Mari", casaMari.getNombre_restaurante());
        Assert.assertEquals("Granda", casaMari.getDireccion_restaurante());
        Assert.assertEquals(55, casaMari.getAforo_maximo_restaurante());
        Assert.assertEquals(10, casaMari.getNumero_empleados_restaurante());
    }
    
    @Test
    public void pruebaContructorPorParametrosCliente(){
        
        Cliente raul = new Cliente(1, "Renault", "Sí", "Sí", 15);
        
        Assert.assertEquals(1, raul.getId_cliente());
        Assert.assertEquals("Renault", raul.getNombre_cliente());
        Assert.assertEquals("Sí", raul.getAlergico());
        Assert.assertEquals("Sí", raul.getReserva());
        Assert.assertEquals(15, raul.getCoste_de_la_comida());
    }
    
    @Test
    public void pruebaAniadirCocinero() throws IOException, FileNotFoundException, ClassNotFoundException, SAXException, SQLException{
        
        Controlador c = new Controlador();
        
        Cocinero juan = new Cocinero(1, 1235.5, "juanillo", "Comida japonesa", 3);
        
        c.addCocineroToList(juan);
        
        Assert.assertEquals(1, c.getCocineroListSize());
    }
    
    @Test
    public void pruebaAniadirPlato() throws IOException, FileNotFoundException, ClassNotFoundException, SAXException, SQLException{
        
        Controlador c = new Controlador();
        
        Plato revuleto_de_setas = new Plato(1, "Revuelto de setas con huevos rotos", "Umami", 25, 1);
        
        c.addPlatoToList(revuleto_de_setas);
        
        Assert.assertEquals(1, c.getPlatoListSize());
    }
    
    @Test
    public void pruebaAniadirRestaurante() throws IOException, FileNotFoundException, ClassNotFoundException, SAXException, SQLException{
        
        Controlador c = new Controlador();
        
        Restaurante casaMari = new Restaurante(1, "Casa Mari", "Granda", 55, 10);
        
        c.addRestauranteToList(casaMari);
        
        Assert.assertEquals(1, c.getRestauranteListSize());
    }
    
    @Test
    public void pruebaAniadirCliente() throws IOException, FileNotFoundException, ClassNotFoundException, SAXException, SQLException{
        
        Controlador c = new Controlador();
        
        Cliente raul = new Cliente(1, "Renault", "Sí", "Sí", 15);
        
        c.addClienteToList(raul);
        
        Assert.assertEquals(1, c.getClienteListSize());
    }
    
    @Test
    public void pruebaBorrarCocinero() throws IOException, FileNotFoundException, ClassNotFoundException, SAXException, SQLException{
        
        Controlador c = new Controlador();
        
        Cocinero juan = new Cocinero(1, 1235.5, "juanillo", "Comida japonesa", 3);
        
        c.addCocineroToList(juan);
        
        c.removeCocinero(juan);
        
        Assert.assertEquals(0, c.getCocineroListSize());
    }
    
    @Test
    public void pruebaBorrarPlato() throws IOException, FileNotFoundException, ClassNotFoundException, SAXException, SQLException{
        
        Controlador c = new Controlador();
        
        Plato revuleto_de_setas = new Plato(1, "Revuelto de setas con huevos rotos", "Umami", 25, 1);
        
        c.addPlatoToList(revuleto_de_setas);
        
        c.removePlato(revuleto_de_setas);
        
        Assert.assertEquals(0, c.getPlatoListSize());
    }
    
    @Test
    public void pruebaBorrarRestaurante() throws IOException, FileNotFoundException, ClassNotFoundException, SAXException, SQLException{
        
        Controlador c = new Controlador();
        
        Restaurante casaMari = new Restaurante(1, "Casa Mari", "Granda", 55, 10);
        
        c.addRestauranteToList(casaMari);
        
        c.removeRestaurante(casaMari);
        
        Assert.assertEquals(0, c.getRestauranteListSize());
    }
    
    @Test
    public void pruebaBorrarCliente() throws IOException, FileNotFoundException, ClassNotFoundException, SAXException, SQLException{
        
        Controlador c = new Controlador();
        
        Cliente raul = new Cliente(1, "Renault", "Sí", "Sí", 15);
        
        c.addClienteToList(raul);
        
        c.removeCliente(raul);
        
        Assert.assertEquals(0, c.getClienteListSize());
    }
    
     
     
}
