package com.poo.hospital.entidades;

import java.util.List;
import java.util.ArrayList;

import com.poo.hospital.entidades.enums.Status;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Exame {
    public static int contadorId = 1;

    private Status status;
    private Medico medicoSolicitante;
    private MedicoEspecialista medicoLaudo;
    private String descricao;
    private String laudo;
    private int id;
    
    public static List <Exame> exameList = new ArrayList<Exame> ();

    public Exame(){
        this.id = contadorId;
        contadorId++;
    }

    public static List<Exame> getExameList() {
        return exameList;
    }

}
