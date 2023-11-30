package com.zipcodewilmington.singlylinkedlist;
import org.junit.Test;
import org.junit.Assert;
/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void listAddTest(){
        SinglyLinkedList list = new SinglyLinkedList();
        Assert.assertTrue(list.add());
    }

    @Test
    public void listRemoveTest(){
        SinglyLinkedList list = new SinglyLinkedList();
        Assert.assertTrue(list.remove());
    }
    @Test
    public void listContainsTest(){
        SinglyLinkedList list = new SinglyLinkedList();
        Assert.assertTrue(list.contains());
    }
    @Test
    public void listFindTest(){
        SinglyLinkedList list = new SinglyLinkedList();
        Object expected = list.list[2];
        Object looking = 2;
        Assert.assertEquals((int)expected, list.find(looking));
    }

    @Test
    public void listSizeTest(){
        SinglyLinkedList list = new SinglyLinkedList();
        int expect = 12;
        int actual = list.size();
        Assert.assertEquals(expect, actual );
    }

    @Test
    public void listGetTest(){
        SinglyLinkedList list = new SinglyLinkedList();
        int expected = 2;
        int location = 3;
        Assert.assertEquals(expected, list.get(location));
    }

    @Test
    public void listCopyTest(){
        SinglyLinkedList list = new SinglyLinkedList();
        SinglyLinkedList newList = list.copy();
        Assert.assertEquals(list, newList);
    }

    @Test
    public void listSortTest(){
        SinglyLinkedList list = new SinglyLinkedList();
        Assert.assertTrue(list.add());
    }
}
