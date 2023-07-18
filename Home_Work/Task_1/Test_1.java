package Home_Work.Task_1;

import java.util.ArrayList;

public class Test_1 extends InterfaceMy_4 implements Interface_1, InterfaceB_3, InterfaceMINMAX_2{

    String val;

    @Override
    public String met1() {

        return "Котику назначено лечение на понедельник ";
        
    }

    @Override
    public String met2() {

        return "Котику назначено лечение на среду ";

    }

    @Override
    public String met3() {

        return "Котику назначено лечение на пятницу ";

    }

    @Override
    public String getTime() {
        return  "в 15:00 ";
    }

    @Override
    public String reset() {
        
        return "<<Назначьте время>>";

    }
}
