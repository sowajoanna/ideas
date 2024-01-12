package pl.stormit.ideas;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    private final IdeasConfiguration ideasConfiguration;

    public QuestionService(IdeasConfiguration ideasConfiguration) {
        this.ideasConfiguration = ideasConfiguration;
    }

    public List<Question> getQuestions() {
        return Arrays.asList(
                new Question("Question1"),
                new Question("Question2"));
    }

    public String test(String value) {
        return String.format("Hello %s %s", ideasConfiguration.getName(), value);
    }
}
