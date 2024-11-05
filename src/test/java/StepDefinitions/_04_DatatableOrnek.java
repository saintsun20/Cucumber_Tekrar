package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class _04_DatatableOrnek {
    @When("Write username {string}")
    public void writeUsername(String username) {
        System.out.println(username);
    }

    @When("Write username and password {string} and {string}")
    public void writeUsernameAndPasswordAnd(String username, String password) {
        System.out.println(username + " " + password);
    }

    @And("Write username as Datatable")
    public void writeUsernameAsDatatable(DataTable dtUserlar) {
        List<String> listUserlar = dtUserlar.asList(String.class);

        for(String user : listUserlar)
            System.out.println(user);
    }

    @And("Write username and password as Datatable")
    public void writeUsernameAndPasswordAsDatatable(DataTable dtUserPass) {
        List< List <String> > listUSerPass = dtUserPass.asLists(String.class);

        for (int i = 0; i < listUSerPass.size(); i++) {
            System.out.println(listUSerPass.get(i).get(0) + " " +
                               listUSerPass.get(i).get(1));
        }
    }
}
