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
public class ObjetoBuilder extends CartaBuilder{
    @Override
    public void BuildTipo() {
        carta.setTipo("Objeto");
    }

    @Override
    public void BuildRuta(String ruta) {
        carta.setRuta(ruta);
    }

    @Override
    public void BuildMatch(int id) {
        carta.setMatch(id);
    }
}
