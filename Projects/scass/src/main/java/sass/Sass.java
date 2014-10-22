package sass;

import sass.api.LibSass;
import sass.api.LibSassContext;
import sass.api.LibSassFolderContext;
import sass.api.LibSassOptions;

import java.io.File;
import java.io.IOException;

public class Sass {
  public void compile() {
    LibSassContext ctx = null;
    try {
      LibSass.sass_new_context();
    } finally {

    }
  }

  public static void main(String[] s) {
    new Sass().compileFolder("/data/home/mpallmann/Desktop/sass", "/data/home/mpallmann/Desktop/sass-out");
  }
}
