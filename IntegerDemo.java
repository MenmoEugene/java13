/*
�����������Ͷ����װ�ࡣ

byte	Byte
short	Short
int	Integer
long	Long
boolean	Boolean
float	Float
double	Double
char	Character


�����������Ͷ����װ���������ã�
�������ڻ����������ͺ��ַ�������֮����ת��

������������ת���ַ�����

	������������+""

	������������.toString(������������ֵ);

	�磺Integer.toString(34);//��34�������"34";

�ַ���ת�ɻ����������͡�
	
	xxx a Xxx.parseXxx(String);

	int a = Integer.parseInt("124");

	double b = Double.parseDouble("12.34");

	boolean b = Boolean.parseBoolean("true");

	 �Ǿ�̬���ã�
		Integer i = new Integer("123");
		
		int num = i.intValue();

ʮ����ת���������ơ�
	toBinaryString();2
	toHexString();	 8
	toOctalString(); 16

��������ת��ʮ���ơ�
	parseInt(String,radix);//("��ֵ",������)
	
*/
class IntegerDemo
{
	public static void sop(String str)
	{
		System.out.println(str);
	}
	public static void main(String[] args) 
	{
		//��ӡ�������͵����ֵ
		sop("int max:"+Integer.MAX_VALUE);

		//��һ���ַ���ת��������
		int num = Integer.parseInt("321");//���봫�����ָ�ʽ���ַ�����
		long x = Long.parseLong("123");

		sop("num="+(num+4));
		sop(Integer.toBinaryString(-6));
		sop(Integer.toOctalString(60));

		int y = Integer.parseInt("3c",16);

		sop("y="+y);
	}
}
