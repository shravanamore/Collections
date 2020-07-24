package com.epam.Collections;
import java.util.*;
public class CustomList<T>
{
	private int size = 0; 
	private static final int defaultCapacity = 10; 
	private Object list[];	 
	CustomList()
	{
		list = new Object[defaultCapacity];
	} 
	public int size()
	{
		return this.size; 
	} 
	public void add(T t)
	{
		if(size == list.length)
		{
			increaseCapacity();
		}
		list[size++] = t;
	}
	@SuppressWarnings("unchecked")
	public T get(int i)
	{ 
		if(i >= size || i < 0)
		{
			throw new IndexOutOfBoundsException("Index out of bounds at index " + i);
		}
		return (T) list[i]; 
	} 
	@SuppressWarnings("unchecked")
	public T delete(int i)
	{
		if(i>=size || i<0)
		{
			throw new IndexOutOfBoundsException("Index out of bounds at index "+i);
		}
		Object item = list[i];
		int remElements = list.length-(i+1);
		System.arraycopy(list, i+1, list, i, remElements);
		size--;
		return (T) item;
	 }
	 @Override
	 public String toString()
	 {
		 StringBuffer stringBuffer = new StringBuffer();
		 stringBuffer.append("[");
		 for(int i = 0; i < size; i++)
		 {
			 stringBuffer.append(list[i].toString());
			 if(i != size-1)
				 stringBuffer.append(",");	 
			 if(i == size)
				 break;
		 }
		 stringBuffer.append("]");
		 return stringBuffer.toString();
	 }	 
	 public void increaseCapacity()
	 {
		 int increasedSize = 2*list.length;
		 list = Arrays.copyOf(list,increasedSize);
	 }	 
}
