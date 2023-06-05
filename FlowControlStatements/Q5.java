class Q5{
  public static void main(String args[]){
    char c1 = '*';
    
    if(c1>'a'&&c1<'z'||c1>'A'&&c1<'Z')
      System.out.print("Alphabet");
    else if(c1>=48 && c1<=57)
      System.out.print("Digit");
    else
      System.out.print("Special character");
  }
}