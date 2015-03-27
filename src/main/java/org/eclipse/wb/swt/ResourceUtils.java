package org.eclipse.wb.swt;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

/**
 * 资源路径
 * 
 * @author Administrator
 */
public abstract class ResourceUtils {

	public static final String DEFAULT_NAME = "default.jpg";

	public static Image getImageByName(String filename) {
		InputStream stream = null;
		try {
			stream = FileUtils.openInputStream(new java.io.File(filename));
		} catch (IOException e) {
			return null;
		}
		try {
			Display display = Display.getCurrent();
			ImageData data = new ImageData(stream);
			if (data.transparentPixel > 0) {
				return new Image(display, data, data.getTransparencyMask());
			}
			return new Image(display, data);
		} finally {
			if (stream != null) {
				try {
					stream.close();
				} catch (IOException e) {
				}
			}
		}
	}

	public static Image getImage() {
		return getImageByName(getResource(DEFAULT_NAME));
	}

	public static void saveImage(Image image) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		try {
			ImageData imageData = image.getImageData();
			ImageLoader imageLoader = new ImageLoader();
			imageLoader.data = new ImageData[1];
			imageLoader.data[0] = imageData;
			imageLoader.save(bos, SWT.IMAGE_JPEG);
			FileUtils.writeByteArrayToFile(new java.io.File(
					getResource(DEFAULT_NAME)), bos.toByteArray());
		} catch (IOException e) {
			throw new IllegalStateException(e.getMessage(), e);
		}
	}

	public static Color getColor(String hex) {
		Color color = null;
		try {
			if (hex.contains("#")) {
				hex = StringUtils.remove(hex, "#");
			}
			java.awt.Color awtcolor = new java.awt.Color(Integer.parseInt(hex,
					16));
			color = SWTResourceManager.getColor(awtcolor.getRed(),
					awtcolor.getGreen(), awtcolor.getBlue());
		} catch (NumberFormatException e) {
		}
		return color;
	}

	public static RGB getImageGRB(Image image) {
		int color = image.getImageData().getPixel(0, 1);
		int r = 0xFF & color;
		int g = 0xFF00 & color;
		g >>= 8;
		int b = 0xFF0000 & color;
		b >>= 16;
		return new RGB(r, g, b);
	}

	public static String getResource(String filename) {
		URL url = ResourceUtils.class.getProtectionDomain().getCodeSource()
				.getLocation();
		String path = null;
		try {
			path = URLDecoder.decode(url.getPath(), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new IllegalStateException("获取文件当前运行目录 UTF-8编码转换失败", e);
		}
		if (path.startsWith("/")) {
			path = path.substring(1, path.length());
		}
		if (path.contains("/bin/")) {
			path = path.substring(0, path.indexOf("/bin/"));
		}
		if (path.contains("/lib/")) {
			path = path.substring(0, path.indexOf("/lib/"));
		}
		System.out.println("file path :" + path + "/" + filename);
		return path + "/" + filename;
	}
}
