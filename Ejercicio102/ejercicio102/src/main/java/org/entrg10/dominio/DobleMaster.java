package org.entrg10.dominio;

import java.util.*;

public class DobleMaster extends Master{
    public Master master1;
    public Master master2;
    public Map<String, Master> relacionAsignaturaMaster;

    public DobleMaster(String identificador, String nombre, Set <Asignatura> asignaturas, Master master1, Master master2){
        this.nombre=nombre;
        this.identificador=identificador;
        this.asignaturas = asignaturas;
        this.master1 = master1;
        this.master2 = master2;
    }
    


}
