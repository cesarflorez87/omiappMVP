package co.com.cesarflorez87.misiontic.omiapp.view.dto;

public class TareaActivity {
    private String Descipcion;
    private String Date;
    private ItemResult state;


    public void ItemResult(String Descripcion, String Date){
        this.Descipcion = Descripcion;
        this.Date = Date;
        this.state = ItemResult.PENDING;

    }

    public String getDescipcion(){
        return Descipcion;
    }

    public String getDate(){
        return Date;
    }

    public ItemResult getState(){
        return state;
    }
}
