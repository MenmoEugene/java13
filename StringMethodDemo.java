/*
String�������������ַ������
��ô�����ṩ�˶���������ַ������в�����

�����Ĳ�������Щ��
��afbs��

1����ȡ
	1.1 �ַ����а������ַ�����Ҳ�����ַ����ĳ��ȡ�
		int length(): ��ȡ���ȡ�
	1.2 ����λ�û�ȡλ����ĳ���ַ���
		char charAt(int index): 
	1.3 �����ַ���ȡ�ַ����ַ�����λ�á�
		intindexOf(int ch): ���ص���ch���ַ����е�һ�γ��ֵ�λ�á�
		intindexOf(int ch, int fromIndex): ��fromIndexָ��λ�ÿ�ʼ����ȡch���ַ����г��ֵ�λ�á�

		intindexOf(int str): ���ص���str���ַ����е�һ�γ��ֵ�λ�á�
		intindexOf(int str, int fromIndex): ��fromIndexָ��λ�ÿ�ʼ����ȡstr���ַ����г��ֵ�λ�á�

		int lastIndexOf(int ch);

2���жϡ�
	2.1 �ַ������Ƿ����ĳһ���Ӵ���
		boolean contains(str):
		����֮����indexOf(str):��������str��һ�γ��ֵ�λ�ã��������-1.��ʾ��str�������ַ����С�
					���ԣ�Ҳ�������ڶ�ָ���ж��Ƿ������
				if(str.indexOf("aa")!=-1)
				���Ҹ÷����ȿ����жϣ��ֿ��Ի�ȡ���ֵ�λ�á�
	2.2 �ַ����Ƿ������ݡ�
		boolean ifEmpty(): ԭ������жϳ����Ƿ�Ϊ0. 
	2.3 �ַ����Ƿ�����ָ�����ݿ�ͷ��
		boolean startsWith(str);
	2.4 �ַ����Ƿ�����ָ�����ݽ�β��
		boolean endsWith(str);
	2.5�ж��ַ��������Ƿ���ͬ����д��Object���е�equals������
		boolean equals(str);
	2.6�ж������Ƿ���ͬ�������Դ�Сд��
		boolean equalsIgnoreCase();

3��ת��
	
	3.1 ���ַ�����ת���ַ�����
		���캯����String(char[])
				  String(char[],offset,count):���ַ������е�һ����ת���ַ�����
		
		��̬������
				  static String copyValueOf(char[]);
				  static String copyValueOf(char[] data,int offset,int count)

				  static String valueOf(char[]):
	3.2 ���ַ���ת���ַ����顣
		char[] toCharArray():

	3.3 ���ֽ�����ת���ַ�����
		String(byte[])
		String(byte[],offset,count):���ֽ������е�һ����ת���ַ�����
	3.4 ���ַ���ת���ֽ����顣**
			byte[] getBytes():

	3.5 ��������������ת���ַ�����
		static String valueOf(int)
		static String valueOf(double)

		3+"";//String.valueOf(3);

		���⣺�ַ������ֽ�������ת�������У��ǿ���ָ�������ġ�

4. �滻
	String replace(oldchar,newchar);

5. �и�
	String[] split(regex);

6. �Ӵ�  ��ȡ�ַ����е�һ����
	String substring(begin);
	String substring(begin,end);

7��ת����ȥ���ո񣬱Ƚϡ�
	7.1 ���ַ���ת�ɴ�д��Сд��
		String toUpperCase();
		String toLowerCase();
	7.2 ���ַ������˵Ķ���ո�ȥ����
		String trim();

	7.3 �������ַ���������Ȼ˳��ıȽϡ�
	int compareTo(string);
*/
class StringMethodDemo
{
	public static void method_qie()
	{
		String s = "    Hello Java   ";
		sop(s.toLowerCase());
		sop(s.toUpperCase());
		sop(s.trim());

		String s1 = "aaa";
		String s2 = "aba";//ACII�����
		sop(s1.compareTo(s2));
	}

	public static void method_sub()
	{
		String s = "adfgadfk";
		sop(s.substring(2));//��ָ��λ�ÿ�ʼ����β������Ǳ겻���ڣ�������ַ����Ǳ�Խ���쳣��
		sop(s.substring(2,5));//����ͷ������β��s.substring(0,s.length());
	}
	public static void method_split()
	{
		String s = "xumanli,eugene";
		String[] arr =s.split(",");
		for (int x=0; x<arr.length; x++)
		{
			System.out.print(arr[x]);
		}
	}
	public static void method_replace()
	{
		String s = "haha java";
		//String s1 = s.replace('a','n');�滻�����ַ����ӵڼ����Ǳ꿪ʼ����

		String s1 = s.replace("java","fucker");
		sop("s="+s);
		sop("s1="+s1);//���Ҫ�滻���ַ������ڣ����صĻ���ԭ����
	}
	
	public static void method_trans()
	{
		char[] arr ={'a','b','c','d','e','f'};
		String s = new String(arr,1,3);
		sop("s="+s);

		String s1 = "czfxml";
		char[] chs = s1.toCharArray();
		for (int x=0; x<arr.length; x++)
		{
			if(x>0)
				System.out.print(chs[x]);
			else
				System.out.print("ch="+chs[x]);
		}
	}

	public static void method_is()
	{
		String str = "ArrayDemo.java";
		//�ж��ļ������Ƿ���Array���ʿ�ͷ
		sop(str.startsWith("Array"));
		//�ж��ļ������Ƿ���.java���ļ�
		sop(str.endsWith(".java"));
		//�ж��ļ����Ƿ����Demo
		sop(str.contains("Demo"));
	}

	public static void method_get()
	{
		String str = "abcgskfka";
		//����
		sop(str.length());
		//����������ȡ�ַ�
		sop(str.charAt(4));//�����ʵ��ַ��������ڵĽǱ�ʱ���ᷢ��StringIndexOfBoundsException��
		//�����ַ���ȡ����
		sop(str.indexOf('a',3));//���û���ҵ�����-1
		//��������һ���ַ�����λ��
		sop(str.lastIndexOf('a'));
	}

	public static void main(String[] args) 
	{
		method_qie();
		method_split();
		method_replace();
		method_trans();
		method_is();
		method_get();

		String s1 = "abc";
		String s2 = new String("abc");
		String s3 = ("abc");
		sop(s1==s2);
		sop(s1==s3);

	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}