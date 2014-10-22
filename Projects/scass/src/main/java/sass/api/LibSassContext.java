package sass.api;

import com.sun.jna.Structure;
import com.sun.jna.ptr.PointerByReference;

import java.util.Arrays;
import java.util.List;

public class LibSassContext extends Structure {

  private static final List fieldOrder = Arrays.asList(
          "inputPath", "outputPath", "sourceString", "outputString", "outputMapString", "sassOptions",
          "errorStatus", "errorMessage", "cFunctions", "includedFiles", "numIncludedFiles"
  );

  public String inputPath;
  public String outputPath;
  public String sourceString;
  public String outputString;
  public String outputMapString;
  public LibSassOptions sassOptions;
  public int errorStatus;
  public String errorMessage;
  public LibSassCFunctionDescriptor cFunctions;
  public PointerByReference includedFiles;
  public int numIncludedFiles;

  @Override
  protected List getFieldOrder() {
    return fieldOrder;
  }
}
