package sass.api;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

public class Sass implements Library {
  Sass INSTANCE = (Sass) Native.loadLibrary("c", Sass.class);

  public static void main(String[] args) {
    System.out.println(Platform.RESOURCE_PREFIX);
  }
}
