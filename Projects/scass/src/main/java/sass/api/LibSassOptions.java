package sass.api;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class LibSassOptions extends Structure {

  private static final List fieldOrder = Arrays.asList(
          "outputStyle", "sourceComments", "sourceMapFile", "omitSourceMapUrl", "isIndentedSyntaxSrc", "includePaths",
          "imagePath", "precision"
  );

  public static final int outputStyleNested = 0;
  public static final int outputStyleExpanded = 1;
  public static final int outputStyleCompact = 2;
  public static final int outputStyleCompressed = 3;

  public int outputStyle;
  public boolean sourceComments;
  public String sourceMapFile;
  public boolean omitSourceMapUrl;
  public boolean isIndentedSyntaxSrc;
  public String includePaths;
  public String imagePath;
  public int precision;

  @Override
  protected List getFieldOrder() {
    return fieldOrder;
  }
}
