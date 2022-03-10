package ch.fhnw.oop.exceptions.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile2 {

	public static void main(String[] args) throws IOException {
		copyFile(args[0], args[1]);
	}

	// An exception thrown while invoking read or write may be shadowed
	// by an exception thrown by one of the close invocations.
	private static void copyFile(String src, String dest) throws IOException {
		InputStream in = new FileInputStream(src);
		try {
			OutputStream out = new FileOutputStream(dest);
			try {
				byte[] buf = new byte[8192];
				int n;
				while ((n = in.read(buf)) >= 0) {
					out.write(buf, 0, n);
				}
			} finally {
				out.close();
			}
		} finally {
			in.close();
		}
	}

}
