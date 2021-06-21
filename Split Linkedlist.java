class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) { 
       // if(root==null)
            //return 
        ListNode[] division= new ListNode[k]; int count=0;
        ListNode curr=root;
        while(curr!=null)// traverse list
        {
            curr=curr.next;
            count++;
        }
        int noofparts=count/k;
        int extrano=count%k;
        curr=root; ListNode prev=null;
        for(int i=0;curr!=null && i<k;i++,extrano--)
        {   
            division[i]=curr;
            for(int j=0;j<noofparts+(extrano>0?1:0);j++)
            {
                prev=curr;
                curr=curr.next;
            }
            prev.next=null;
        }
        return division;
    }
}