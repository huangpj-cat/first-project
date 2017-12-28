package test;

import models.Cat;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;


/**
 * 通过配置文件创建sqlsessionfactory
 */


public class MybatisTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init(){
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSelectInfo(){
        SqlSession sqlSession=null;
        try{
            sqlSession=sqlSessionFactory.openSession();
            Cat cat=sqlSession.selectOne("Test.selectById",5);

            System.out.println(cat.getId());
            System.out.println(cat.getCatName());


        }catch(Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }

    }







}
