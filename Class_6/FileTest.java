import java.io.*;

public class FileTest {
    public static void main(String[] args) throws IOException {
	String name = "c:\\eclipse";	File dir = new File(name);
	String[] fileNames = dir.list(); // ���� ���丮�� ��ü ���� ����Ʈ
	for (String s : fileNames) {
		File f = new File(name + "/" + s); // ���� ��η� �̸��� �־�� ��
		System.out.println("===============================");
		System.out.println("�̸�: " + f.getName());
		System.out.println("���: " + f.getPath());
		System.out.println("�θ�: " + f.getParent());
		System.out.println("������: " + f.getAbsolutePath());
		System.out.println("���԰��: " + f.getCanonicalPath());
		System.out.println("���丮 ����:" + f.isDirectory());
		System.out.println("���� ����:" + f.isFile());
		System.out.println("===============================");
	}
    }
}
