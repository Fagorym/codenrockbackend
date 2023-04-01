package hackhaton.codenrock.server.dto;

import lombok.Data;

import java.util.List;

@Data
public class QuestionAnswersListDto {
    private List<QuestionAnswersDto> questionAnswersDtoList;

}
