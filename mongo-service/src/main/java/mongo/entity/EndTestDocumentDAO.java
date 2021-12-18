package mongo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(value = "endTest")
public class EndTestDocumentDAO {

  @Field("_id")
  private String id;

  private String name;

  private String step_name;

  private String step_number;

  private String test_case_id;

  private String type;

  private String locator;

  private String parameter1;

  private String parameter2;

  private String parameter3;

}
