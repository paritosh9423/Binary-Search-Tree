class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

  myBST bst = new myBST();
  bst.insert(4);
  bst.insert(6);
  bst.insert(5);
  bst.insert(1);
  bst.insert(99);
  bst.insert(56);
  bst.insert(-1);


  System.out.print(bst.lookup(91)==null?"Not Found" : bst.lookup(91).val);
  }
}