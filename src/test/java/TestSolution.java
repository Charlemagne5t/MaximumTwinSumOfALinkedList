import org.example.ListNode;
import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class TestSolution {
    @Test
    public void maxPairSumTest1(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(1000);
        Assert.assertEquals(1001, new Solution().pairSum(head));
    }
}
