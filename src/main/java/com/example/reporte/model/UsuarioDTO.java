package com.example.reporte.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {

    private Long id;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private Boolean activo;
}

