package sass.api;

import com.sun.jna.Native;

public final class LibSass {
  static {
    Native.register("sass");
  }

  private LibSass() {};

  public static native LibSassContext sass_new_context();
  public static native LibSassFileContext sass_new_file_context();
  public static native LibSassFolderContext sass_new_folder_context();

  public static native void sass_free_context(LibSassContext ctx);
  public static native void sass_free_file_context(LibSassFileContext ctx);
  public static native void sass_free_folder_context(LibSassFolderContext ctx);

  public static native int sass_compile(LibSassContext ctx);
  public static native int sass_compile_file(LibSassFileContext ctx);
  public static native int sass_compile_folder(LibSassFolderContext ctx);

  public static native String quote(String str, char quotemark);
  public static native String unquote(String str);
}

