package com.example.tarea_clases_inyeccion;

import com.example.tarea_clases_inyeccion.models.domain.Ciudad;
import com.example.tarea_clases_inyeccion.models.domain.Empleado;
import com.example.tarea_clases_inyeccion.models.domain.Sucursal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean()
    public List<Empleado> registrarItemsEmp(){



        Empleado e1 = new
                Empleado(
                "Marlon",
                "Velez",
                "marlonvelez@gmail.com",
                "0979574883",
                "Gerente General",
                "https://i.postimg.cc/zfB4vXf9/avatar-m.png");

        Empleado e2 = new
                Empleado(
                "William",
                "Tocto",
                "williamtocto@gmail.com",
                "0974851266",
                "Ejecutivo Administrador",
                "https://i.postimg.cc/zfB4vXf9/avatar-m.png");


        Empleado e3 = new
                Empleado(
                "Danny",
                "Tenemea",
                "dannytenemea@gmail.com",
                "099311884",
                "Asistente",
                "https://us.123rf.com/450wm/jemastock/jemastock1708/jemastock170806644/83824890-call-center-servicio-de-atenci%C3%B3n-al-cliente-asistente-avatar-icono-imagen-vector-ilustraci%C3%B3n-dise%C3%B1o.jpg");

        return Arrays.asList(e1,e2,e3);
    }

    @Bean()
    public List<Ciudad> registrarItemsCiudad() {
        Ciudad c2 = new Ciudad(1,"Cuenca");
        Ciudad c1 = new Ciudad(2,"Quito");
        Ciudad c3 = new Ciudad(3,"Guayaquil");
        return Arrays.asList(c1,c2,c3);
    }

    @Bean()
    public List<Sucursal> registrarItemsSucursal() {

        Sucursal s1 = new
                Sucursal(1,"Sucursal Principal");
        Sucursal s2 = new
                Sucursal(2,"Segunda Sucursal");
        Sucursal s3 = new
                Sucursal(3,"Tercera Sucursal");
        return Arrays.asList(s1,s2,s3);
    }

}
