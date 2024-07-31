package com.hypredge;

/**
 * Hello world!
 *
 */
public class App 
{
    String srcf;

    public static void main( String[] args )
    {
        App app = new App();
        app.setSrcf(args[0]);
        app.copyFile();
    }

    public void setSrcf(String src) {
        srcf = src;
    }

    public void copyFile() {
        CopyFileRequest.Builder builder = CopyFileRequest.builder();
        builder.sourceFile(srcf);
        CopyFileRequest request = builder.build();
        CopyFile client = new CopyFile();
        client.copyFile(request);
    }
}
