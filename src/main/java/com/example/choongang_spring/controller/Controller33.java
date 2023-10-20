package com.example.choongang_spring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.List;
import java.util.function.Consumer;

@Controller
@RequiredArgsConstructor
@RequestMapping("main33")
public class Controller33 {

  @GetMapping("sub1")
  public void method1() {

  }

  @PostMapping("sub2")
  public void method2(String name, Integer age, MultipartFile myfile) throws IOException {
    System.out.println("name = " + name);
    System.out.println("age = " + age);

    if (myfile != null) {
      String originalFilename = myfile.getOriginalFilename();
      System.out.println("originalFilename = " + originalFilename);

      String path = "C:\\temp\\upload_" + originalFilename;

      InputStream inputStream = myfile.getInputStream();
      FileOutputStream outputStream = new FileOutputStream(path);
      BufferedInputStream bis = new BufferedInputStream(inputStream);
      BufferedOutputStream bos = new BufferedOutputStream(outputStream);

      try (bis; bos; inputStream; outputStream) {

        byte[] data = new byte[1024];
        int len = 0;

        while ((len = bis.read(data)) != -1) {
          bos.write(data, 0, len);
        }
        bos.flush();
      }
    }
  }

  @GetMapping("sub3")
  public void method3() {
  }

  @PostMapping("sub4")
  public void method4(MultipartFile upload) throws IOException {
    if (!upload.isEmpty()) {
      String path = "C:\\Temp\\myUpload_" + upload.getOriginalFilename();

      BufferedInputStream bis = new BufferedInputStream(upload.getInputStream());
      BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path));

      try (bis; bos) {

        byte[] data = new byte[1024];
        int len = 0;

        while ((len = bis.read(data)) != -1) {

          bos.write(data, 0, len);
        }
        bos.flush();
      }
    }
  }

  @GetMapping("sub5")
  public void method5() {
  }

  @PostMapping("sub6")
  public void method6(List<MultipartFile> files) {
    System.out.println("files.length = " + files.size());

    System.out.println("업로드 파일 크기들");
    files.forEach(new Consumer<MultipartFile>() {
      @Override
      public void accept(MultipartFile file) {
        if (file.getSize() > 0) {
          String path = "C:\\Temp\\multiUpload_" + file.getOriginalFilename();

          try {
            BufferedInputStream bis = new BufferedInputStream(file.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path));

            byte[] data = new byte[1024];
            int len = 0;

            while ((len = bis.read(data)) != -1) {

              bos.write(data, 0, len);
            }
            bos.flush();
            bis.close();
            bos.close();
          } catch (Exception e) {
            throw new RuntimeException(e);
          }
        }
      }
    });
  }

  @GetMapping("sub7")
  public void method7() {

  }

  @PostMapping("sub8")
  public void method8(List<MultipartFile> files) {
    files.forEach(new Consumer<MultipartFile>() {
      @Override
      public void accept(MultipartFile file) {
        if (file.getSize() > 0) {
          String dirPath = "C:\\Temp\\upload\\";
          String path = dirPath + file.getOriginalFilename();
          File dir = new File(dirPath);
          if (!dir.exists()) dir.mkdirs();

          try {
            BufferedInputStream bis = new BufferedInputStream(file.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path));

            byte[] data = new byte[1024];
            int len = 0;

            while ((len = bis.read(data)) != -1) {

              bos.write(data, 0, len);
            }

            bos.flush();
            bis.close();
            bos.close();
          } catch (IOException e) {
            throw new RuntimeException(e);
          }
        }
      }
    });
  }
}
