/*
StringBuffer���ַ�������������һ��������
�ض���
1�����ҳ����ǿɱ仯��
2������ֱ�Ӳ�������������͡�
3�����ջ�ͨ��toString��������ַ���

C create U update R read D delete

1���洢��
	StringBuffer append():���ƶ�������Ϊ������ӵ��������ݽ�β����
	StringBuffer insert(index,����):���Խ����ݲ��뵽ָ��indexλ�á�

2��ɾ����
	StringBuffer delete(start,end):ɾ���������е����ݣ�����start��������end��
	StringBuffer deleteCharAt(index):ɾ��ָ��λ�õ��ַ���

3����ȡ��
	char charAt(int index):��ȡһ���ű��ַ�
	int indexOf(String str):��ȡλ��
	int lastIndexOf(String str):
	int length()
	String substring(int start,int end)//���ʵĻ���String������StringBuffer
4���޸ġ�
	StringBuffer replace(index start,end,String);
	void setCharAt(int index, char ch);

5,��ת��
	StringBuffer reverse();

6,
	����������ָ�����ݴ洢��ָ���ַ������С�
	void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
	//            ��...��ʼ��   ��...������ �洢�� ....,��...�Ǳ�λ�ÿ�ʼ��

JDK1.5 �汾֮�������StringBuilder.

StringBuffer���߳�ͬ��
StringBuilder���̲߳�ͬ��

�Ժ󿪷�����ʹ��StringBuilder
java����Χ���������أ����Ч�ʣ�����д����߰�ȫ�ԡ�
*/
class StringBufferDemo 
{
	public static void main(String[] args) 
	{
//		method_del();
		method_update();

//		StringBuffer sb = new StringBuffer("abcdef");
		StringBuilder sb = new StringBuilder("abcdef");

		char[] chs = new char[4];
		sb.getChars(1,4,chs,1);
		for (int x=0; x<chs.length; x++)
		{
			sop("chs["+x+"]="+chs[x]+";");
		}
	}

	public static void method_update()
	{
		StringBuffer sb = new StringBuffer("abcde");
//		sb.replace(1,4,"java");
		sb.setCharAt(2,'k');
		sop(sb.toString());
	}
	public static void method_del()
	{
		StringBuffer sb = new StringBuffer("abcde");
//		sb.delete(1,3);
//		sb.delete(0,sb.length());//��ջ�����
//		sb.delete(2,3);//���һ������ͬ�� sb.deleteCharAt(2);

		sop(sb.toString());
	}
	public static void method_add()
	{
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = sb.append(34);

		sb.append("abc").append(true).append(34);//��β�����  .append()
//		sop("sb==sb1:"+(sb==sb1));
		sb.insert(1,"qq");
		sop(sb.toString());
//		sop(sb1.toString());
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
