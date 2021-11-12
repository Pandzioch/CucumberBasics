package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook {


    @Before
    public void InitializeTest(Scenario scenario){
        System.out.println("Opening the browser: MOCK");
        if(scenario.isFailed()){
            System.out.println(scenario.getName());
        }
    }

    @After
    public void TearDownTest(){
        System.out.println("Close the browser: Mock");
    }
}
