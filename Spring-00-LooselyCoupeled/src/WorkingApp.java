import implementation.Mentor;
import service.FullTimeMentor;
import service.MentorAccount;

public class WorkingApp {
    public static void main(String[] args){

        FullTimeMentor fullTime = new FullTimeMentor();

        MentorAccount mentor = new MentorAccount(fullTime);

        mentor.manageAccount();
    }
}
