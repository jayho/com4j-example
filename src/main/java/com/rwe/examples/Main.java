package com.rwe.examples;

import org.jvnet.com4j.generated.ClassFactory;
import org.jvnet.com4j.generated.IFileSystem3;

public class Main {
  public static void main(String[] args) {
    IFileSystem3 fs = ClassFactory.createFileSystemObject();
    for (String file : args)
      System.out.println(file + " -> "  + fs.getFileVersion(file));
//    fs.getComThread().kill();
//    fs.dispose();
  }
}
