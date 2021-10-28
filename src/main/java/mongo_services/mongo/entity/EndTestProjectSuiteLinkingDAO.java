package mongo_services.mongo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import mongo_services.DTO.request.SuiteIDNameListDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * pushing project and suite information in mongoDB for end to end linking.
 * */

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(value = "EndTestProjectSuiteLinking")
public class EndTestProjectSuiteLinkingDAO {

     private String projectId;

     private String suiteId;

     private String suiteName;

     private List<SuiteIDNameListDTO> tests;
}
