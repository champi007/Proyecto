package io.lkmx.academia.demo.Entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "route")
public class Route {

    @Id
    private String id;

    private String corto;
    private String largo;

  /*  public Route(String corto,String largo){
        this.corto = corto;
        this.largo = largo;

    }*/
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorto() {
        return corto;
    }

    public void setCorto(String corto) {
        this.corto = corto;
    }

    public String getLargo() {
        return largo;
    }

    public void setLargo(String largo) {
        this.largo = largo;
    }


  /*  public String toString(){
        String info= String.format("{'id': %s 'corto' : %s, 'largo': %s}",id,corto,largo);
        return info;
    }
*/
}
