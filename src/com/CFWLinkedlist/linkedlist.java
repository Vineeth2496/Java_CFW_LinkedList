package com.CFWLinkedlist;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.*;
import java.util.List;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList li=new LinkedList();
		System.out.println("Before Updation: "+li);
		li.add("Hai");
		li.add("Dude");
		li.add("Vineeth");
		li.add("Kathrine");
		li.add("Darling");
		li.add("Passion");
		li.add("Vikram");
		System.out.println("After updation: "+li);
		//   public E getFirst();
		System.out.println("First Element is: "+li.getFirst());
		//  public E getLast();
		System.out.println("Last Element is: "+li.getLast());
		//  public E removeFirst();
		System.out.println("First Element is: "+li.removeFirst());
		System.out.println("After Changes Element is: "+li);
		//  public E removeLast();
		System.out.println("Last Element is: "+li.removeLast());
		System.out.println("After Changes Element is: "+li);
		//  public void addFirst(E);
		li.addFirst("Hai");
		System.out.println("After first Add: "+li);
		//  public void addLast(E);
		li.addLast("Vikram");
		System.out.println("After last Add: "+li);
		//  public boolean contains(java.lang.Object);
		boolean C=li.contains("Kathrine");
		boolean C1=li.contains("Langford");
		System.out.println("Kathrine contains in list: "+C);
		System.out.println("Langford contains in list: "+C1);
		// public int size();
		Integer size=li.size();
		System.out.println("Size of LinkedList is: "+size);
		//  public boolean remove(java.lang.Object);
		li.remove("Passion");
		System.out.println("After removing: "+li);
		//public boolean addAll(java.util.Collection<? extends E>);
		LinkedList li1=new LinkedList();
		li1.add("Banti");
		li1.add("Shailesh");
		li1.add("Naresh");
		li1.add("Vamshi");
		li.addAll(li1);
		System.out.println("After addAll elements: "+li);
		//  public void clear();
		System.out.println("LinkedList1 after before clearing: "+li1);
		li1.clear();
		System.out.println("LinkedList1 after clearing: "+li1.size());
		//  public E get(int);
		System.out.println("Get from list of index 2 is: "+li.get(2));
		System.out.println("Get from list of index 7 is: "+li.get(7));
		System.out.println("Get from list of index 8 is: "+li.get(8));
		System.out.println("Get from list of index 9 is: "+li.get(9));

		//  public E set(int, E);
		
		LinkedList colorli=new LinkedList();
		colorli.add("Voilet");
		colorli.add("Indigo");
		colorli.add("Blue");
		colorli.add("Green");
		colorli.add("Orange");
		colorli.add("Yellow");
		System.out.println("VIBGORY Nature gifted colors: "+colorli);
		colorli.set(5, "Red");
		System.out.println("After Seting Color: "+colorli);
		//  public void add(int, E);
		colorli.add(6, "YelloW");
		colorli.add(7, "Black");
		System.out.println("After Insterting color throw Addon: "+colorli);
		//  public E remove(int);
		colorli.remove(0);
		System.out.println("After Removing Index 0 is "+colorli);
		//  public int indexOf(java.lang.Object);
		System.out.println("Index of Green is: "+colorli.indexOf("Green"));
		System.out.println("Index of Black is: "+colorli.indexOf("Black"));
		//  public int lastIndexOf(java.lang.Object);
		LinkedList car=new LinkedList();
		car.add("Merc Benz");
		car.add("BMW");
		car.add("Lomborgine");
		car.add("Astenmortine");
		car.add("Audi");
		car.add("Porch");
		car.add("Bently");
		car.add("Range Rover");
		car.add("Audi");
		System.out.println("List of cars are: "+car);
		System.out.println("Last Index of Audi is: "+car.lastIndexOf("Audi"));
		//  public E peek();
		System.out.println("Head of list Peek of cars is: "+car.peek());
		//  public E poll();
		// remove the head of list
		System.out.println("Head of the list is: "+car.poll());
		System.out.println("After poll is: "+car);

		//  public boolean offer(E);
		//  public boolean offerFirst(E);
		//  public boolean offerLast(E);
		car.offer("Merc Benz");
		System.out.println("After Offer of car:"+car);
		System.out.println("First offer is: "+car.offerFirst("Fortuner"));
		System.out.println("After first offer: "+car);
		System.out.println("Last offer is:"+car.offerLast("Mahendra thor"));
		System.out.println("After last offer: "+car);
		//  public E pollFirst();
		//	public E pollLast();
		System.out.println("First poll is:"+car.pollFirst());
		System.out.println("After removing through first poll: "+"\n"+car);
		System.out.println("Last poll is:"+car.pollLast());
		System.out.println("After removing of Last poll: "+"\n"+car);
		//  public void push(E);
		//  public E pop();
		car.push("KIA");
		System.out.println("After pushing new car: "+"\n"+car);
		System.out.println("Poping out car is: "+car.pop());
		System.out.println("After Poping out car: "+"\n"+car);
		//	public boolean removeFirstOccurrence(java.lang.Object);
		LinkedList bike=new LinkedList();
		bike.add("Raj doot");
		bike.add("Yahmaha RX100");
		bike.add("Royal Enfield");
		bike.add("TVS Aapachi");
		bike.add("Bajaj Pulser");
		System.out.println("Available bikes are: "+ bike);
		boolean found=bike.removeFirstOccurrence("Raj doot");
		System.out.println("Removed first occrance of bike: "+found);
		System.out.println("After removing of first occrance: "+bike);
		//  public java.util.ListIterator<E> listIterator(int);
		ListIterator li2=bike.listIterator();
		
		for(;li2.hasNext();)
		{
			System.out.println(li2.next());
		}
		for(;li2.hasPrevious();)
		{
			System.out.println(li2.previous());
		}
		//  public java.util.Iterator<E> descendingIterator();
		LinkedList li3=new LinkedList();
		li3.add(20);
		li3.add(30);
		li3.add(10);
		li3.add("Darling");
		li3.add("Vikram");
		System.out.println("Before Linked list order: "+li3);
		Iterator s=li3.descendingIterator();
		while(s.hasNext())
		{
			System.out.println("Descending order values are: "+s.next());
		}
		//  public <T> T[] toArray(T[]);
		Object[] A=li3.toArray();
		for(Object value:A)
		{
			System.out.println(value);
		}
		//  public java.util.Spliterator<E> spliterator();
		LinkedList li4=new LinkedList();
		li4.add("vineeth@gmail.com");
		li4.add("banti@gamil.com");
		li4.add("Kathrine@gmail.com");
		System.out.println("List of Emails are:");
		Spliterator email=li4.spliterator();
		email.forEachRemaining((n)-> System.out.println(n));
	}

}
/*
  transient int size;
  transient java.util.LinkedList$Node<E> first;
  transient java.util.LinkedList$Node<E> last;
  public java.util.LinkedList();
  public java.util.LinkedList(java.util.Collection<? extends E>);
  void linkLast(E);
  void linkBefore(E, java.util.LinkedList$Node<E>);
  E unlink(java.util.LinkedList$Node<E>);
  public E getFirst();
  public E getLast();
  public E removeFirst();
  public E removeLast();
  public void addFirst(E);
  public void addLast(E);
  public boolean contains(java.lang.Object);
  public int size();
  public boolean add(E);
  public boolean remove(java.lang.Object);
  public boolean addAll(java.util.Collection<? extends E>);
  public boolean addAll(int, java.util.Collection<? extends E>);
  public void clear();
  public E get(int);
  public E set(int, E);
  public void add(int, E);
  public E remove(int);
  java.util.LinkedList$Node<E> node(int);
  public int indexOf(java.lang.Object);
  public int lastIndexOf(java.lang.Object);
  public E peek();
  public E element();
  public E poll();
  public E remove();
  public boolean offer(E);
  public boolean offerFirst(E);
  public boolean offerLast(E);
  public E peekFirst();
  public E peekLast();
  public E pollFirst();
  public E pollLast();
  public void push(E);
  public E pop();
  public boolean removeFirstOccurrence(java.lang.Object);
  public boolean removeLastOccurrence(java.lang.Object);
  public java.util.ListIterator<E> listIterator(int);
  public java.util.Iterator<E> descendingIterator();
  public java.lang.Object clone();
  public java.lang.Object[] toArray();
  public <T> T[] toArray(T[]);
  public java.util.Spliterator<E> spliterator();
}

*/