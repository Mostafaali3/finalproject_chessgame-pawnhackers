package LoginSystem;

import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    public IDandPasswords(){

        logininfo.put("Habiba","pizza");
        logininfo.put("Maya","pizza");
        logininfo.put("Eman","pizza");
        logininfo.put("Mostafa","pizza");
        logininfo.put("Mohamed","pizza");
    }

    public HashMap getLoginInfo(){
        return logininfo;
    }
}
