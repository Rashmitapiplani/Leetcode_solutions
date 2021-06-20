static ListNode reverselist(ListNODE head)
{
    ListNode curr=head,forward-null,prev=null;
    while(curr!=null)
    {
       forward=curr.next;
       curr.next=prev;
       prev=curr;
       curr.forward;

    }
    return prev;
}