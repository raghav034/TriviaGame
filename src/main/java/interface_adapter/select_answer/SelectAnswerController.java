package interface_adapter.select_answer;

import entity.Question;
import use_case.select_answer.SelectAnswerInputBoundary;
import use_case.select_answer.SelectAnswerInputData;

public class SelectAnswerController {

    SelectAnswerInputBoundary selectAnswerInputBoundary;

    public SelectAnswerController(SelectAnswerInputBoundary selectAnswerInputBoundary) {
        this.selectAnswerInputBoundary = selectAnswerInputBoundary;
    }

    public void execute(int answer) {
        SelectAnswerInputData selectAnswerInputData = new SelectAnswerInputData(answer);
        selectAnswerInputBoundary.execute(selectAnswerInputData);
    }
}
