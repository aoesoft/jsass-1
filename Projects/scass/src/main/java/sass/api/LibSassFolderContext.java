package sass.api;

import com.sun.jna.Structure;
import com.sun.jna.ptr.PointerByReference;

import java.util.Arrays;
import java.util.List;

public class LibSassFolderContext extends Structure {

  private static final List fieldOrder = Arrays.asList(
          "searchPath", "outputPath", "sassOptions", "errorStatus", "errorMessage", "cFunctions",
          "includedFiles", "numIncludedFiles"
  );

  public String searchPath;
  public String outputPath;
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
