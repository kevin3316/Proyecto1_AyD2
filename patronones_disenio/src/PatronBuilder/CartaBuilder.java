/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronBuilder;

/**
 *
 * @author robin
 */
public abstract class CartaBuilder {
    protected Carta carta;
    
    public Carta ObtenerCarta()
    {
        return carta;
    }
    
    public void CrearCarta()
    {
        carta = new Carta();
    }
    
    public abstract void BuildTipo(); 
    public abstract void BuildRuta(String ruta);
    public abstract void BuildMatch(int id);
}
