import ssa.controller.QuestionController;
import ssa.repo.QuestionRepository;
import ssa.service.QuestionService;

void main() {
    Scanner scan = new Scanner(System.in);
    var repo = new QuestionRepository();
    var service = new QuestionService(repo);
    var runner = new QuestionController(service, scan);
    runner.run();
}