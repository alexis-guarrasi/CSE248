package p2;

import java.util.ArrayList;


public class PancakeHouseMenuIterator implements Iterator {
	private ArrayList<MenuItem> menuItems;
	private java.util.Iterator iterator;
	
	public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
		this.menuItems = menuItems;
		this.iterator = menuItems.iterator();
	}

	@Override
	public boolean hasNext() {
		return this.iterator.hasNext();
	}

	@Override
	public Object next() {
		return this.iterator.next();
	}
	
	
}
