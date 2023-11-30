package com.zipcodewilmington.singlylinkedlist;
import org.junit.Test;
import org.junit.Assert;
/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void listAddTest(){
        Object[] list = new Object[10];
        Assert.assertTrue(list.add());
    }

    @Test
    public void listRemoveTest(){
        Object[] list = new Object[10];
        Assert.assertTrue(list.remove());
    }
    @Test
    public void listContainsTest(){
        Object[] list = new Object[10];
        Assert.assertTrue(list.contains());
    }
    @Test
    public void listFindTest(){
        Object[] list = new Object[10];
        Object expected = list[2];
        Object looking = 2;
        Assert.assertEquals((int)expected, list.find(looking));
    }

    @Test
    public void listSizeTest(){
        Object[] list = new Object[10];
        int expect = 12;
        int actual = list.size();
        Assert.assertEquals(expect, actual );
    }

    @Test
    public void listGetTest(){
        Object[] list = new Object[10];
        int expected = 2;
        int location = 3;
        Assert.assertEquals(expected, list.get(location));
    }

    @Test
    public void listCopyTest(){
        Object[] list = new Object[10];
        Object[] newList = list.copy();
        Assert.assertEquals(list, newList);
    }

    @Test
    public void listAddTest(){
        Object[] list = new Object[10];
        Assert.assertTrue(list.add());
    }
}
