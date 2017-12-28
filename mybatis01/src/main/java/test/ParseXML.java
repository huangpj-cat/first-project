package test;

import models.UpayParam;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.junit.Before;
import org.junit.Test;


import java.lang.reflect.Field;

/**
 * 解析XML字符串
 */
public class ParseXML {

    private String xmlString;
    private Field[] fields;

    /**
     * 生产一个xml格式的字符串
     */

    @Before
    public void createString() {
        UpayParam param = new UpayParam();

         fields= param.getClass().getDeclaredFields();
       /* for (int i=0;i<fields.length;i++){
            System.out.println(fields[i]);
        }*/

       xmlString="<status>00</status><typeDesc>初始化中</typeDesc><paramCode1>0055</paramCode1>";
    }

    @Test
    public void xmlTest(){
        System.out.println(xmlString);

        try{
            Document documented= DocumentHelper.parseText(xmlString);

            for (int i=0;i<fields.length;i++){

            }

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}