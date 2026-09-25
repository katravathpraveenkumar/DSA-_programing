
public class classroom {
    static class node{
        int data;
        node left;
        node right;
        public node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void perorder(node root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        perorder(root.left);
        perorder(root.right);
    }
    public static node createbst(int arr[],int st,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        node root=new node(arr[mid]);
        root.left=createbst(arr,st,mid-1);
        root.right=createbst(arr,mid+1,end);
        return root;
    }
    public static void main(String args[]){
        int arr[]={3,5,6,8,10,11,12};
        node root=createbst(arr,0,arr.length-1);
        perorder(root);
    }
}
