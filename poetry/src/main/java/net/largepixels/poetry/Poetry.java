package net.largepixels.poetry;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.codec.binary.Base64;

class Poetry {

  public List<String> juliusCaesar() { 
    List<String> lines = new ArrayList<String>();
    lines.add("asdfasdlfkjalsdkjfalskdjf");
    lines.add("lkgjalkjealkfjalskdjflakjs");
    lines.add("zx,cvnaoeinvkansd,fnlkajs");
    return lines;
  }

  public void emit(List<String> lines) {
    for(String line : lines) {
      System.out.println(Poetry.encode(line));
    }
  }

  public static String encode(String text) {
    Base64 codec = new Base64();
    return new String(codec.encode(text.getBytes()));
  }

  public static void main(String[] args) {
    Poetry p = new Poetry();
    p.emit(p.juliusCaesar());
  }	

}
