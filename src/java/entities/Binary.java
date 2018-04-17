package entities;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Stateless @Path("/binary")
public class Binary {

    public Binary() {
    }
      
    @GET
    public String binary(@QueryParam("num") long num) {
        return (xbinary(num));
    }
    String xbinary(long num){
        int resto;
        String res = "";
        while(num > 0 && num != 0){
            resto = (int) num % 2;
            num /= 2;
            res = resto + res;
        }
        return res;
    }    
}

