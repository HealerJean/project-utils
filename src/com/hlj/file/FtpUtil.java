package com.hlj.file;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

/**
 * ftp�ϴ��ļ������ļ���
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
        System.out.println("�ϴ��ɹ�");
     }    
    
    
    /**  
     *   
     * @param path �ϴ���ftp�������ĸ�·����     
     * @param addr ��ַ  
     * @param port �˿ں�  
     * @param username �û���  
     * @param password ����  
     * @return  
     * @throws Exception  
     */    
    private  boolean connect(String path,String addr,int port,String username,String password) throws Exception {      
        boolean result = false;      
        ftp = new FTPClient();      
        int reply;      
        ftp.connect(addr,port);   //����ftp  Ĭ����21 ��дportҲ���� 
        ftp.connect(addr);   
        ftp.login(username,password);     //ftp��¼  
        ftp.setFileType(FTPClient.BINARY_FILE_TYPE);   //�ļ�����Ϊ�������ļ�    
        reply = ftp.getReplyCode();      
        if (!FTPReply.isPositiveCompletion(reply)) {      
            ftp.disconnect();      
            return result;      
        }      
        ftp.changeWorkingDirectory(path);  //���浽ftp·����               
        result = true;   
        
        return result;      
    }
    /**  
     *   
     * @param file �ϴ����ļ����ļ���  
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
                    ftp.changeToParentDirectory();      //�ϴ�Ŀ¼
                }else{                    
                    File file2 = new File(file.getPath()+"\\"+files[i]);      
                    FileInputStream input = new FileInputStream(file2);      
                    ftp.storeFile(file2.getName(), input);      
                    input.close();            //�ϴ��ļ�                 
                }                 
            }      
        }else{      
            File file2 = new File(file.getPath());      
            FileInputStream input = new FileInputStream(file2);      
            ftp.storeFile(file2.getName(), input);    //�ϴ��ļ�   
            input.close();        
        }      
    }      
  
}  