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
    Map<String, String> using = new HashMap<>();
    using.put(ID, "ID");
    using.put("css_selector", "CSS");
    using.put(XPATH, "XPATH");
    using.put("class_name", "CLASS");
    using.put(NAME, "NAME");
    using.put("tag_name", "TAG_NAME");
    using.put(LINK, "LINK");
    using.put(PARTIAL_LINK, "PARTIAL_LINK");
    return locatorUsing;
  }
}
