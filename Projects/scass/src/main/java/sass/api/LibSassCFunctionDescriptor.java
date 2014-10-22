package sass.api;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class LibSassCFunctionDescriptor extends Structure {

  private static List fieldOrder = Arrays.asList("signature");

  public String signature;

  @Override
  protected List getFieldOrder() {
    return fieldOrder;
  }
}
