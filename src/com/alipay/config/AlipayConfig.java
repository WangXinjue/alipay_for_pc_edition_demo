package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016092300576600";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCw6W2XnILc7sMF1VzEakSTWPAgqEYQxbZWj4joYy3/+4CtUqRjCNWxxZcwJNPauprNXdfkpFUttGMaQfIRvwl2LnelVBhLYKagwKUP6WsmDxmvS72KBynJYfNJai+rdd5kyhcLfRL21V78tp9ilHXn+ZZuPuwctSiWd4tFPYjmZ4/pITAYE8ynkripLlnnp19sXdx1Dc5k7nW9uPEUPNPpsQfNOYe2CeWwaBnrXfqrluWam3yf9SI2yHjMZJdaxnuTenU/lz2GIR4+twYsh/k3lXWaMcIK/lnuz0L9ZZ8NyOTqTQfNUmelI77lP+WFNkZ1w24zxqYygKkLKqoGyEOvAgMBAAECggEARUk2nbEzY1mzUZ6NdXN1JgwoB3I/9qOoVOBkKzdktaOHctox/YNhRf1vx/A0dK6uoA3H1wkxPvQt+AOpzZ93Ei0CuOJlnWfd+olYXBH73+z8DzZnph5GFFPjV3ZZ8xn3npuzSNGUUs2gJPNVGuOwBckvTEAict/UZJGvHtAJxMpU62Va71CjpDrh+Gtf+BCSVgWliz8No5b6pjZjdzYcRWZr84MfN4/KO3yBv+BFoD3zaa5ZzFiSwd9ESE5Sn0CvpX17wN2c3JJ2oM01XLo18p3ZR1KWK3TVyj88nxmcntjHdry/PDkeDWTaqZo+TEL6UZAu9O5TfUNTz02Pvdwd+QKBgQDsS8q7MeqZ15YN9dD1aL0n3t6pZUCiYJJaj1i3kMnG/IIq2Y/W9sHfx5pOwR7qCLtzPSxbLf+haWKbUFTo+WDcq+2gaUVLF4KAI/r7SJcj2obNCXaLMynvKCvmq5uEN4GBhv9nL1L8glhtTBCwV/joBP1m733+ZxCAGYi0S6cqNQKBgQC/qfZBTrENqTaVTbo0rTA60XgaNTUkF2JB970OD6qri9dE0hR7zxR1yKkeA61U1SE/XLVXk5ZXVh6uECCv+HVhZ1goJUouGBfCL/XrX58Piv/CLTaOdp04FngLmO5SpXj8PiDf86Pa+mQRgvQaeLgr9Q1leqD1y24THV1PIf3S0wKBgGrzdyQ5WKUfNhTFgTnCmXMVZhSn9pRIP5Xrsc0MJLgDDGuWo4s5jtDZyFcDBBoLr8ReGNiAPmbxiycfOf9k+FmJG/nyC+IMFw4muu/HkFkzDLZ7JQOmOcG8nfo/DBnRAbX9w1YRzm7qFFoMBrW6a7egoo1XsuBWB9rjM8PfRh9NAoGAWsekxMAB6meIW+VJ2eNh4aoPSdKDzglpV7eAiyVuf/wnRQh//ThTB4q4V2gEdBbSvZEqr0VPQySeOXGYGeEDr9PkFHe9D+IHdsmCoC5VR2Zdx1nk6ktSIhu6VjvkPa70g/zlU02yAWjxdr3g4pzlFqTl6HfRvznQdCtHY9DEyVMCgYEArxiMiH/kiuMcWPNe4o6FD6oft3YB31hf0FSzpqYfBMBHvUx7JW3JyReOa0akUmy9WFiiIj+T5hcY38s3C6oZdSl2tsFRljV+vGUYyS7ZzoIdFGd5LgJJIa1uiOzeShQKGJyn9YpHo+SlOtTgubNacb3oF4wjOw0H2zLxRUeLA9I=";
    		
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAv4fDTLKW5cdgI7CUfTDgMvtrFKUS0z0iBAu0DF5JReZLeH82Ft7XEvwX/O0F+sE7IUK5KU7BSICg3MMFLNsCW+6+O9xJxZsUzu4T9hiCf7QNboAfcMDvWd7VRXIXO3nV6oLncpI3TQAAC+qSKP7iASiEAwPInxpalkvh8uzn/Ljyil+TJ5uzVeJk9A6rnHt8A7vTTXWuXPNx4UBLaYqU5++lX/H8pJZI0CmGQQIyZ9o1jW89epCn2I/3NvxHAvbyxwpxtkxzfCyj/ulcETnjCYB1f7sAj8Eq8eiEUS7pj8sQmDoY6ugbYojS0WSsYoJg7gJuGO/JZZYnufX3uGy8iQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

