class FindPi2{
    public static void main(String args[]){
// ���������� ��������� � ��������� ����������:
        int N=5000000,k;
// ��������� �������� � �������:
        double Pi=0,q=4;
// ���������� ����� "��":
        for(k=0;k<=N;k++){
            Pi+=q/(2*k+1);
            q*=(-1);
        }
// ����� ���������� �� �����:
        System.out.println("���������� �� "+N+" ��������� ����:");
        System.out.println(Pi);}
}
