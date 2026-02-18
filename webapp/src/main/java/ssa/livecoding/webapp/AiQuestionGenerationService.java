package ssa.livecoding.webapp;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class AiQuestionGenerationService {
    private final ChatClient chatClient;

    public AiQuestionGenerationService(ChatClient.Builder chatClient) {
        this.chatClient = chatClient.build();
    }

    public String generateQuestions() {
        return chatClient.prompt()
                .user("""
                    Generate 3 Java Core quiz questions.
                    Return JSON with structure:
                    {
                      "questions":[
                        {
                          "question": "...",
                          "options": ["A","B","C","D"],
                          "correctIndex": 1
                        }
                      ]
                    }
                    """)
                .call()
                .content();
    }
}
