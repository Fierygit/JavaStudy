package TestStream;

import java.io.BufferedInputStream;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;


public class TestStream {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\java\\gaoqi\\code\\test\\src\\Stream\\hello.txt");
		// test outoutstream
		// �ֽ��� �� ʹ��
		OutputStream os = new FileOutputStream(file);
		String temp = "FileOutputStream1\n";
		byte[] tmp = new byte[1024];
		tmp = temp.getBytes();
		os.write(tmp);
		// os.close();

		// test BufferedWriter

		BufferedOutputStream bos = new BufferedOutputStream(os);
		bos.write("BufferedOutputStream\n".getBytes());
		bos.flush();
		// bos.close();

		// �ַ�����ʹ��

		OutputStreamWriter osw = new OutputStreamWriter(os);
		osw.append("OutputStreamWriter");
		osw.flush();

		File image = new File("C:\\Users\\Firefly\\Desktop\\tt.jpg");

		FileInputStream is = new FileInputStream(image);

		OutputStream os1 = new FileOutputStream("C:\\Users\\Firefly\\Desktop\\yy.jpg");
		byte[] bt = new byte[1024]; //������
		while (is.read(bt) != -1) {
			os1.write(bt);
			os1.flush();
		}
		
		

	}
}
