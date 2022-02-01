import org.junit.jupiter.api.Test;

public class TestWithPageObjects {

    @Test
    public void firstJenkinsTest() {
        InsertData insData = new InsertData();

        insData.openBrowser()
                .setAllData("Name", "Surname", "email@email.email", "Male", "9876543210",
                        "Address", "22", "June", "1941", "Computer Science",
                        "Reading", "NCR", "Delhi", "1.img")
                .submit()
                .validation("Name", "Surname", "email@email.email", "Male", "9876543210",
                        "Address", "22", "June", "1941", "Computer Science",
                        "Reading", "NCR", "Delhi", "1.img");
    }
}

