package com.company;
import org.junit.*;
public class StackTest {
    private StativQueue queue;
    @Before
    public void initiallizeTest(){
        queue = new StativQueue();
    }

    @Test
    public   void push_Should_throw_Exeption_when_ElementIsFaildToBePushed() {
        int x = 3;
//        act
        queue.enqueue(x);
//        assert
        Assert.assertEquals(x, queue.peek());
    }
}
