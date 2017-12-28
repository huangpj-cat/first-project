package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 生成数据
 */
public class CreateData {

    //分割符
    private static final String SEPARATOR="|";
    //交易码+请求机构+请求渠道
    private static final String REQ="012051|0055|06|";
    //号码等常量
    private static final String ID="1|04|13510434519|200|1000|1000|0|0|||0|01|1|67JFFC4AN|||http://192.168.123.39:9091/xcharge-simulator/ReceiveMsgAutoResponServletForMobileShop|||0|0|0|0";
    //返回码常量
    private static final String RESULT="0|0000|成功|0000|成功|010A00|支付成功，充值成功|20171215000000|||||结束";
    public static void main(String[] args) {
        Long start=System.currentTimeMillis();
        creatData();
        Long end=System.currentTimeMillis();

        Long time=end-start;
        System.out.println(time);
    }

    public static void creatData(){
        BufferedWriter bw=null;
        File file=new File("testdata_200.bcp");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMddHHmmssSSS");
        try{
            bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file.getAbsolutePath()), "UTF-8"));

            for (int i=0;i<100000;i++) {
                Thread.sleep(1);
                StringBuilder str = new StringBuilder();
                Date date = new Date();
                //账期+请求日期
                String reqDate = simpleDateFormat.format(date).substring(0, 8);
                //时间戳
                String dateString = simpleDateFormat.format(date);
                int random = (int) ((Math.random() + 1) * 1000000);
                String reqTransID = "moblie" + dateString + random;
                String upayTransID = "upayid" + dateString + random;
                String transActionID = "AAA10999" + dateString + random;

                //行记录
                str = str.append(REQ)
                        .append(reqDate)
                        .append(SEPARATOR)
                        .append(reqTransID)
                        .append(SEPARATOR)
                        .append(dateString)
                        .append(SEPARATOR)
                        .append(reqDate)//账期
                        .append(SEPARATOR)
                        .append(upayTransID)
                        .append(SEPARATOR)
                        .append(dateString)
                        .append(SEPARATOR)
                        .append(reqTransID)
                        .append(SEPARATOR)
                        .append(ID)
                        .append(SEPARATOR)
                        .append(transActionID)
                        .append(SEPARATOR)
                        .append(upayTransID)
                        .append(SEPARATOR)
                        .append(dateString.substring(0, 14))
                        .append(SEPARATOR)
                        .append(RESULT)
                        .append("\r\n");
                bw.append(str);
            }
            bw.close();

        }catch(Exception e){
            e.printStackTrace();
        }


    }
}
