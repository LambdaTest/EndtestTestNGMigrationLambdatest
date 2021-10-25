package MongoServices.DTO.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Comparator;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestCaseStepsDTO implements Comparator<TestCaseStepsDTO> {

  private String name;

  private String step_name;

  private String step_number;

  private String test_case_id;

  private String type;

  private String locator;

  private String parameter1;

  private String parameter2;

  private String parameter3;

  @Override
  public int compare(TestCaseStepsDTO o1, TestCaseStepsDTO o2) {
    return o1.getStep_number().compareTo(o2.getStep_number());
  }
}
