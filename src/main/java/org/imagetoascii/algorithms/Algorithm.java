package org.imagetoascii.algorithms;

import java.awt.Image;

/**
 * This is an interface which will be implemented by various concrete
 * implementation of this interface in order to provide flexibility to the end
 * user to choose the algorithm implementation.
 * 
 * @author Ayushya
 *
 */
public interface Algorithm {
	Image convertToAsciiImage(Image image);
}
