package com.hlj.file;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

/**
 * ftp上传文件或者文件夹
 * @author qdkf
 *
 */

public class FtpUtil {      
    
    private  FTPClient ftp;      
    
    public static void main(String[] args) throws Exception{    
        FtpUtil t = new FtpUtil();    
        t.connect("E:\resourse", "10.3.250.74", 21, "HealerJean", "147094");    
        File file = new File("D:/guangdong/test");    
        t.upload(file); 
        System.out.println("上传成功");
     }    
    
    
    /**  
     *   
     * @param path 上传到ftp服务器哪个路径下     
     * @param addr 地址  
     * @param port 端口号  
     * @param username 用户名  
     * @param password 密码  
     * @return  
     * @throws Exception  
     */    
    private  boolean connect(String path,String addr,int port,String username,String password) throws Exception {      
        boolean result = false;      
        ftp = new FTPClient();      
        int reply;      
        ftp.connect(addr,port);   //连接ftp  默认是21 不写port也可以 
        ftp.connect(addr);   
        ftp.login(username,password);     //ftp登录  
        ftp.setFileType(FTPClient.BINARY_FILE_TYPE);   //文件类型为二进制文件    
        reply = ftp.getReplyCode();      
        if (!FTPReply.isPositiveCompletion(reply)) {      
            ftp.disconnect();      
            return result;      
        }      
        ftp.changeWorkingDirectory(path);  //保存到ftp路径下               
        result = true;   
        
        return result;      
    }
    /**  
     *   
     * @param file 上传的文件或文件夹  
     * @throws Exception  
     */    
    private void upload(File file) throws Exception{      
        if(file.isDirectory()){           
            ftp.makeDirectory(file.getName());                
            ftp.changeWorkingDirectory(file.getName());      
            String[] files = file.list();             
            for (int i = 0; i < files.length; i++) {      
                File file1 = new File(file.getPath()+"\\"+files[i] );      
                if(file1.isDirectory()){      
                    upload(file1);      
                    ftp.changeToParentDirectory();      //上传目录
                }else{                    
                    File file2 = new File(file.getPath()+"\\"+files[i]);      
                    FileInputStream input = new FileInputStream(file2);      
                    ftp.storeFile(file2.getName(), input);      
                    input.close();            //上传文件                 
                }                 
            }      
        }else{      
            File file2 = new File(file.getPath());      
            FileInputStream input = new FileInputStream(file2);      
            ftp.storeFile(file2.getName(), input);    //上传文件   
            input.close();        
        }      
    }      
  
}  