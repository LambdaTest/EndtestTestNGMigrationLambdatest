package MongoServices.transformer;

import MongoServices.DTO.request.EndTestProjectSuiteLinkingDTO;
import MongoServices.mongo.entity.EndTestProjectSuiteLinkingDAO;

public class TransformingDtoToDao {

  public EndTestProjectSuiteLinkingDTO getTransformedData(EndTestProjectSuiteLinkingDAO endTestProjectSuiteLinkingDAO){
    EndTestProjectSuiteLinkingDTO endTestProjectSuiteLinkingDTO = new EndTestProjectSuiteLinkingDTO();
    endTestProjectSuiteLinkingDTO.setProjectId(endTestProjectSuiteLinkingDAO.getProjectId());
    endTestProjectSuiteLinkingDTO.setSuiteId(endTestProjectSuiteLinkingDAO.getSuiteId());
    endTestProjectSuiteLinkingDTO.setTests(endTestProjectSuiteLinkingDAO.getTests());
    return endTestProjectSuiteLinkingDTO;
  }
}
