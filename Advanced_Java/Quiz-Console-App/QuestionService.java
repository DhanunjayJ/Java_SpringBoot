import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[6];

    public QuestionService() {
        // Initializing 6 questions (index 0 to 5)
        questions[0] = new Question(1, "What is the size of int in bytes?", "2", "3", "4", "5", "4");
        questions[1] = new Question(2, "Which keyword is used to create an object?", "class", "new", "this", "static",
                "new");
        questions[2] = new Question(3, "What is the default value of a boolean?", "true", "false", "0", "null",
                "false");
        questions[3] = new Question(4, "Which operator is used for addition?", "+", "-", "*", "/", "+");
        questions[4] = new Question(5, "Which data type is used for characters?", "int", "String", "char", "float",
                "char");
        questions[5] = new Question(6, "What is the index of the first element in an array?", "-1", "1", "0", "2", "0");
    }

    public void playQuiz() {
        int score = 0;
        for(Question q : questions){
            System.out.println("Question no. :" + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Answer...");
            String answer = sc.nextLine();
            if(answer.equals(q.getAnswer())){
                score++;
            }
        }
        System.out.println("You have succesfullly completed the Quiz Your Score is :"+ score);
    }

}
