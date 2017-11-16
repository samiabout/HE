import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * Created by sami- on 14/11/2017.
 */

@ManagedBean
@SessionScoped
public class Controller implements Serializable {

    public String accueil() {
        return "/index.xhtml";
    }

}
