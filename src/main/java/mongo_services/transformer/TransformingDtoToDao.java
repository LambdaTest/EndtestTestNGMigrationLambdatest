package mongo_services.transformer;

import mongo_services.DTO.request.EndTestProjectSuiteLinkingDTO;
import mongo_services.DTO.request.SuiteIDNameListDTO;
import mongo_services.DTO.response.EndTestSuitesUnderProjectDto;
import mongo_services.DTO.response.SuiteIdProjectIdForTestIdDTO;
import mongo_services.mongo.entity.EndTestProjectSuiteLinkingDAO;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

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
    suiteIdProjectIdForTestIdDTO.setSuiteName(endTestProjectSuiteLinkingDAO.getSuiteName());
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
