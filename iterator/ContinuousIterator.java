package com.test.iterator;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ContinuousIterator<E> implements Iterator<E> {
	private final Collection<E> collection;

	private int counter = 0;
	private Iterator<E> iterator;

	public ContinuousIterator(Collection<E> collection) {
		this.collection = collection;
	}

	@Override
	public boolean hasNext() {
		return counter < collection.size();
	}

	@Override
	public E next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}

		counter++;
		if (iterator == null || !iterator.hasNext()) {
			iterator = collection.iterator();
		}

		return iterator.next();
	}

	@Override
	public void remove() {
		counter--;
		iterator.remove();
	}

	public void setDone() {
		counter = 0;
	}

	public static void main(String[] args) {
		ContinuousIterator<Integer> it = new ContinuousIterator<>(Arrays.asList(1, 2, 3));
		System.out.println(it.next());
		it.setDone();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
	}
}
