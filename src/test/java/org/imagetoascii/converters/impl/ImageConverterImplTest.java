package org.imagetoascii.converters.impl;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.imagetoascii.converter.ImageConverter;
import org.imagetoascii.converter.impl.ImageConverterImpl;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Ayushya
 *
 */
public class ImageConverterImplTest {

	private static ImageConverter imageConverter;

	@BeforeClass
	public static void startUp() {
		imageConverter = new ImageConverterImpl(null);
	}

	@Test
	public void _1testImageOutput() {
		try {
			Assert.assertTrue(imageConverter.convertToImage(getImage()) == null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private Image getImage() throws IOException {
		// Correct way to read resource files in maven directory structure.
		return ImageIO.read(new File(this.getClass().getResource("/mona1.png").getFile()));
	}

}
