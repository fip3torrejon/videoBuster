/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.exceptions;

/**
 *
 * @author felip
 */
public class ExcepcionCodigoNoValido extends RuntimeException {
    public ExcepcionCodigoNoValido(){
        super();
    }

    public ExcepcionCodigoNoValido(String message) {
        super(message);
    }
    
}
