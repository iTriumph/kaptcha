package com.google.code.kaptcha;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.util.Properties;

public class ProducerTest {

	public static void main(String[] args) throws Exception {

		Properties properties = new Properties();
		properties.setProperty("kaptcha.border", "yes");
		properties.setProperty("kaptcha.border.color", "105,179,90");
		properties.setProperty("kaptcha.textproducer.font.color", "blue");

		Config config = new Config(properties);

		Producer producer = new DefaultKaptcha();
		((DefaultKaptcha) producer).setConfig(config);

		BufferedImage bufferedImage = producer.createImage("ADSC6893");
		ImageIO.write(bufferedImage, "jpg", new FileOutputStream("/Users/imiracle/Desktop/a.jpg"));
	}

}
