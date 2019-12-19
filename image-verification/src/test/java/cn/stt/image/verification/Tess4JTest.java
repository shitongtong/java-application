package cn.stt.image.verification;

import cn.stt.image.verification.util.ImageUtil;
import cn.stt.image.verification.util.Tess4JUtil;
import org.junit.Test;

/**
 * @Description TODO
 * @Author shitt7
 * @Date 2019/12/19 12:07
 */
public class Tess4JTest {

    @Test
    public void test() {
        //原始验证码地址
        String OriginalImg = "D:\\图片验证码\\captcha.jpg";
        //识别样本输出地址
        String ocrResult = "D:\\图片验证码\\captcha-out.jpg";
        //去噪点
        ImageUtil.removeBackground(OriginalImg, ocrResult);
        //裁剪边角
        ImageUtil.cuttingImg(ocrResult);
        //OCR识别
        String code = Tess4JUtil.executeTess4J(ocrResult);
        //输出识别结果
        System.out.println("Ocr识别结果: \n" + code);
    }
}
