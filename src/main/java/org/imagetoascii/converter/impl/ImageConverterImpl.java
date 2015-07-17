package org.imagetoascii.converter.impl;

import java.awt.Image;

import org.imagetoascii.algorithms.Algorithm;
import org.imagetoascii.converter.ImageConverter;

/**
 * This class is the concrete implementation of the {@link ImageConverter}.
 * 
 * @author Ayushya
 */
public class ImageConverterImpl implements ImageConverter {

	private Algorithm algorithm;

	public ImageConverterImpl(Algorithm algorithm) {
		this.algorithm = algorithm;
	}

	/**
	 * This method takes an image and algorithm instance which is used to
	 * convert the image to the ascii image.
	 */
	@Override
	public Image convertToImage(Image imageToConvert) {
		Image image = algorithm.convertToAsciiImage(imageToConvert);
		return image;
	}

}
