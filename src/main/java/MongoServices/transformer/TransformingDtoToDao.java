package MongoServices.transformer;

import MongoServices.DTO.request.EndTestProjectSuiteLinkingDTO;
import MongoServices.DTO.request.SuiteIDNameListDTO;
import MongoServices.DTO.response.EndTestSuitesUnderProjectDto;
import MongoServices.DTO.response.SuiteIdProjectIdForTestIdDTO;
import MongoServices.mongo.entity.EndTestProjectSuiteLinkingDAO;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class TransformingDtoToDao {

  public EndTestProjectSuiteLinkingDTO getTransformedData(EndTestProjectSuiteLinkingDAO endTestProjectSuiteLinkingDAO){
    EndTestProjectSuiteLinkingDTO endTestProjectSuiteLinkingDTO = new EndTestProjectSuiteLinkingDTO();
    endTestProjectSuiteLinkingDTO.setProjectId(endTestProjectSuiteLinkingDAO.getProjectId());
    endTestProjectSuiteLinkingDTO.setSuiteId(endTestProjectSuiteLinkingDAO.getSuiteId());
    endTestProjectSuiteLinkingDTO.setTests(endTestProjectSuiteLinkingDAO.getTests());
    return endTestProjectSuiteLinkingDTO;
  }

  public SuiteIdProjectIdForTestIdDTO getSuiteIdProjectId(EndTestProjectSuiteLinkingDAO
          endTestProjectSuiteLinkingDAO, String testId){
    SuiteIdProjectIdForTestIdDTO suiteIdProjectIdForTestIdDTO = new SuiteIdProjectIdForTestIdDTO();
    suiteIdProjectIdForTestIdDTO.setProjectId(endTestProjectSuiteLinkingDAO.getProjectId());
    suiteIdProjectIdForTestIdDTO.setSuiteId(endTestProjectSuiteLinkingDAO.getSuiteId());
    suiteIdProjectIdForTestIdDTO.setTestId(testId);
    return suiteIdProjectIdForTestIdDTO;
  }

  public EndTestProjectSuiteLinkingDAO getDaoFromDto(List<EndTestSuitesUnderProjectDto> endTestSuitesUnderProjectDto){
    EndTestProjectSuiteLinkingDAO endTestProjectSuiteLinkingDAO = new EndTestProjectSuiteLinkingDAO();
    endTestProjectSuiteLinkingDAO.setTests(sameToSameDTOConversion(endTestSuitesUnderProjectDto));
    return endTestProjectSuiteLinkingDAO;
  }

  public List<SuiteIDNameListDTO> sameToSameDTOConversion(List<EndTestSuitesUnderProjectDto> endTestSuitesUnderProjectDto){
    Gson gson = new Gson();
    return gson.fromJson(gson.toJson(endTestSuitesUnderProjectDto),new TypeToken<List<SuiteIDNameListDTO>>(){}.getType());
  }

}
