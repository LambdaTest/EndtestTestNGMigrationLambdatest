package mongo_services.service;

import mongo_services.DTO.response.EndTestSuitesUnderProjectDto;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//   action=getTestCases&appId=85134686&appCode=93597488&testSuite=311408

@Service
public class RestTemplateService {
  private final RestTemplate restTemplate;

  public RestTemplateService(RestTemplateBuilder restTemplateBuilder) {
    HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
      HttpClientBuilder.create().useSystemProperties().build());

    List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();

    MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
    converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
    messageConverters.add(converter);
    this.restTemplate = new RestTemplate(clientHttpRequestFactory);
    restTemplate.setMessageConverters(messageConverters);
  }

  public List<EndTestSuitesUnderProjectDto> getSuiteIdListUsingAppCodeAndAppId(String url, String appId, String appCode){
    HttpHeaders headers = new HttpHeaders();
    headers.set("Content-Type","application/json");
    headers.set("Accept","application/json");

    UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromUriString(url);
    uriComponentsBuilder.queryParam("action","getTestSuites");
    uriComponentsBuilder.queryParam("appId",appId);
    uriComponentsBuilder.queryParam("appCode",appCode);
    String encodeURL = uriComponentsBuilder.encode().toUriString();

    HttpEntity entity = new HttpEntity(headers);
    return restTemplate.exchange(encodeURL, HttpMethod.GET, entity, new ParameterizedTypeReference<List<EndTestSuitesUnderProjectDto>>(){}).getBody();
  }

  public List<EndTestSuitesUnderProjectDto> getTestIdListUnderSuiteId(String url, String appId, String appCode, String suiteId) {
    HttpHeaders headers = new HttpHeaders();
    headers.set("Content-Type", "application/json");
    headers.set("Accept", "application/json");

    UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromUriString(url);
    uriComponentsBuilder.queryParam("action", "getTestCases");
    uriComponentsBuilder.queryParam("appId", appId);
    uriComponentsBuilder.queryParam("appCode", appCode);
    uriComponentsBuilder.queryParam("testSuite", suiteId);
    String encodedURL = uriComponentsBuilder.encode().toUriString();

    HttpEntity entity = new HttpEntity(headers);
    for (int i = 0; i < 5; i++) {
      try {
        Thread.sleep(1000);
        Object a = restTemplate.exchange(encodedURL, HttpMethod.GET, entity,
          new ParameterizedTypeReference<List<EndTestSuitesUnderProjectDto>>() {
          }).getBody();
        if (a != null) {
          return (List<EndTestSuitesUnderProjectDto>) a;
        }
      } catch (Exception e) {
        System.out.println("Exception came" + entity);
        }
      }
      return null;
    }
  }
