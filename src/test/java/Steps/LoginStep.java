package Steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class LoginStep {
    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() {

        System.out.println("checking if i see the text");
    }

    @And("I enter the following for Login")
    public void iEnterTheFollowingForLogin(DataTable table) {

        List<List<String>> data = table.cells();

        data.get(0).get(1);
        System.out.println(data.get(1).get(1));
    }
//        //create an arraylist
//        List<User> users = new ArrayList<User>();
//        //store all users
//        users = table.asList(User.class);
//
//        for (User user: users){
//            System.out.println("The username is : "+ user.username);
//            System.out.println("The username is : "+ user.password);
//        }
//    }
//
//    public class User {
//        public String username;
//        public String password;
//
//        public User(String userName, String passWord) {
//            username = userName;
//            password = passWord;
//        }
//    }


        @When("I click login button")
        public void iClickLoginButton () {
        }

        @Then("I should see the userform page")
        public void iShouldSeeTheUserformPage () {
        }

    }
