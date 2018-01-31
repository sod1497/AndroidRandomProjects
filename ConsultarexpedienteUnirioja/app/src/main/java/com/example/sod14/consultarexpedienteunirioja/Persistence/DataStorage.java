package com.example.sod14.consultarexpedienteunirioja.Persistence;

import com.example.sod14.consultarexpedienteunirioja.InfoActivity;
import com.example.sod14.consultarexpedienteunirioja.MainActivity;
import com.example.sod14.consultarexpedienteunirioja.gen.GetAsignaturasMatriculaConImporteResponse;
import com.example.sod14.consultarexpedienteunirioja.gen.GetAsignaturasMatriculaResponse;
import com.example.sod14.consultarexpedienteunirioja.gen.GetCalificacionesResponse;
import com.example.sod14.consultarexpedienteunirioja.gen.GetTitulacionesResponse;

/**
 * Created by sod14 on 21/12/2017.
 */

public class DataStorage {
    private static final DataStorage ourInstance = new DataStorage();

    MainActivity mainActivity;
    InfoActivity infoActivity;

    GetCalificacionesResponse getCalificacionesResponse;
    GetTitulacionesResponse getTitulacionesResponse;
    GetAsignaturasMatriculaResponse getAsignaturasMatriculaResponse;
    GetAsignaturasMatriculaConImporteResponse getAsignaturasMatriculaConImporteResponse;

    boolean correct=false;


    public static DataStorage getInstance() {
        return ourInstance;
    }

    private DataStorage() {

    }

    public MainActivity getMainActivity() {
        return mainActivity;
    }

    public void setMainActivity(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    public InfoActivity getInfoActivity() {
        return infoActivity;
    }

    public void setInfoActivity(InfoActivity infoActivity) {
        this.infoActivity = infoActivity;
    }

    public GetCalificacionesResponse getGetCalificacionesResponse() {
        return getCalificacionesResponse;
    }

    public void setGetCalificacionesResponse(GetCalificacionesResponse getCalificacionesResponse) {
        this.getCalificacionesResponse = getCalificacionesResponse;
    }

    public GetTitulacionesResponse getGetTitulacionesResponse() {
        return getTitulacionesResponse;
    }

    public void setGetTitulacionesResponse(GetTitulacionesResponse getTitulacionesResponse) {
        this.getTitulacionesResponse = getTitulacionesResponse;
    }

    public GetAsignaturasMatriculaResponse getGetAsignaturasMatriculaResponse() {
        return getAsignaturasMatriculaResponse;
    }

    public void setGetAsignaturasMatriculaResponse(GetAsignaturasMatriculaResponse getAsignaturasMatriculaResponse) {
        this.getAsignaturasMatriculaResponse = getAsignaturasMatriculaResponse;
    }

    public GetAsignaturasMatriculaConImporteResponse getGetAsignaturasMatriculaConImporteResponse() {
        return getAsignaturasMatriculaConImporteResponse;
    }

    public void setGetAsignaturasMatriculaConImporteResponse(GetAsignaturasMatriculaConImporteResponse getAsignaturasMatriculaConImporteResponse) {
        this.getAsignaturasMatriculaConImporteResponse = getAsignaturasMatriculaConImporteResponse;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
}
