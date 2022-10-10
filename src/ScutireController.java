import java.util.ArrayList;
import java.util.List;

public class ScutireController {
    private List<Scutire> scutiri = new ArrayList<>();

    public Scutire CreateNewScutire(String excuseeName, String excuseReason, String excuserName)
    {
        Scutire aux = new Scutire();
        aux.setExcuseeName(excuseeName);
        aux.setExcuseReason(excuseReason);
        aux.setExcuserName(excuserName);
        scutiri.add(aux);
        return aux;
    }

    public Boolean RemoveScutire(String excuseReason)
    {
        for (int i = 0; i < scutiri.size(); i++)
        {
            if(scutiri.get(i).getExcuseReason() == excuseReason)
            {
                scutiri.remove(i);
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
