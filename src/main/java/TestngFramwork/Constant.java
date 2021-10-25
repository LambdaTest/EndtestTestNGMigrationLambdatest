package TestngFramwork;

import java.util.HashMap;
import java.util.Map;

public class Constant {
  protected static final String CLASS = "class";
  protected static final String ID = "id";
  protected static final String CSS = "css";
  protected static final String XPATH = "xpath";
  protected static final String NAME = "name";
  protected static final String TAG_NAME = "tagname";
  protected static final String LINK = "link";
  protected static final String PARTIAL_LINK = "partial_link";

  public static Map<String, String> locatorUsing = getLocatorUsing();

  public static Map<String, String> getLocatorUsing() {
    Map<String, String> locatorUsing = new HashMap<>();
    locatorUsing.put(ID, "ID");
    locatorUsing.put("css_selector", "CSS");
    locatorUsing.put(XPATH, "XPATH");
    locatorUsing.put("class_name", "CLASS");
    locatorUsing.put(NAME, "NAME");
    locatorUsing.put("tag_name", "TAG_NAME");
    locatorUsing.put(LINK, "LINK");
    locatorUsing.put(PARTIAL_LINK, "PARTIAL_LINK");
    return locatorUsing;
  }
}
