

public class myBST{

    class Node{
      Node left = null;
      Node right=null;
      int val ;
      public Node(int v){
        this.left = null;
        this.right=null;
        this.val = v;
      }
    }

    Node root = null;

    public myBST(){
      this.root=null;
    }

    public void insert(int v){
      if(this.root==null)
        this.root = new Node(v);
      else{
        Node temp=this.root;
        while(true){
            //if v is smaller
            if(v<temp.val){
              if(temp.left==null){
                  temp.left = new Node(v);
                  return;
              }
              temp = temp.left;
              
            }
            else if(v>temp.val)
            {
              if(temp.right == null){
                temp.right = new Node(v);
                return;
              }
              temp=temp.right;
            }
      }
      }
    }

    public Node lookup(int val){
      if(this.root == null)
        return null;
      if(this.root.val == val){
        return this.root;
      }
      Node temp = this.root;
      while(true){
        if(temp == null)
          return null;//not found
        if(val == temp.val ){
          return temp;
        }
        if(val < temp.val){
          temp = temp.left;
        }
        else if(val > temp.val){
          temp = temp.right;
        }
      }
    }

}