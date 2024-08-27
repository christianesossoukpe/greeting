package bj.universityh5.greeting.model;
import java.util.Objects;
public  class Greeting {
    private final long id;
    private final String content;
   

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }


    public long getId() {
        return id;
    }


    public String getContent() {
        return content;
    }
    // public int hashcode(){}//retourne des entiers
    //  @Override
    // public String toString(){}//retourne des string
   
    

 @Override//signale une modification au niveau des méthodes du parent

public boolean equals (Object o){ //retoourne des booleans
    if (this == o) return true;
    if(o == null||getClass() !=o.getClass())
    return false;
    Greeting obj =(Greeting) o;
return content == obj.content;
}


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", content='" + getContent() + "'" +
            "}";

            // return  String format("{
            //     id=%d, content = '%s'
            // }", 

            // "{id= }"
    }

   @Override
   public int hashcode(){
    return Objects.hash(id,content);
   }
}