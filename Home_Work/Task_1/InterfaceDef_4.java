package Home_Work.Task_1;

public interface InterfaceDef_4 {

    int getUserID();

    default int getCatID(){
        return 1;
    }

    static String getUniqueID(){
        return "Хотят приютить!";
    }
    
}
