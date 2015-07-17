package org.imagetoascii.converter;

import java.awt.Image;

import org.imagetoascii.algorithms.Algorithm;

/**
 * This is an imageConverting interface which has a method convertToImage which
 * will be used to convert an image to appropriate image using an appropriate
 * algorithm.
 * 
 * TODO : List all implemented algorithms here.
 * 
 * @author Ayushya
 *
 */
public interface ImageConverter {

	Image convertToImage(Image imageToConvert);

}
