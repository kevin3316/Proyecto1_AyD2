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
public class NodoCarta {
    private CartaBuilder cartabuilder;
    
    public void setCartaBuilder(CartaBuilder cb)
    {
        this.cartabuilder = cb;
    }
    
    public Carta getCarta()
    {
        return cartabuilder.ObtenerCarta();
    }
    
    public void ConstruirCarta(String ruta, int id)
    {
        cartabuilder.CrearCarta();
        cartabuilder.BuildTipo();
        cartabuilder.BuildRuta(ruta);
        cartabuilder.BuildMatch(id);
    }
}
