package cn.stt.image.verification.demo;

import cn.stt.image.verification.util.ImageUtil;
import cn.stt.image.verification.util.Tess4JUtil;

/**
 * @Description TODO
 * @Author shitt7
 * @Date 2019/12/19 12:19
 */
public class Demo {
    public static void main(String[] args) {
        //原始验证码地址
        String originalImg = "D:\\图片验证码\\fc46.jpg";
        //识别样本输出地址
        String ocrResult = "D:\\图片验证码\\captcha-out.jpg";
        //去噪点
        ImageUtil.removeBackground(originalImg, ocrResult);
        //裁剪边角
//        ImageUtil.cuttingImg(ocrResult);
        //OCR识别
        String code = Tess4JUtil.executeTess4J(ocrResult);
        //输出识别结果
        System.out.println("Ocr识别结果: \n" + code);
    }
}
