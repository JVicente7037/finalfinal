package Decorator;

import Composite.Component;

/**
 *
 * @author UsuarioPC
 */
public abstract class Decorator implements Component
{
    protected Component componente;

    public Decorator(Component componente)
    {
        this.componente=componente;
    }
    public String showMediot()
    {
        return componente.showMedioTransporte();
    }
}

