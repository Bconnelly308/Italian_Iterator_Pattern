import java.util.Iterator;
import java.util.Calendar;

public class AlternatingMenuIterator implements Iterator<MenuItem> {
	MenuItem[] items;
	int position;

	public AlternatingMenuIterator(MenuItem[] items) {
		this.items = items;
		position = Calendar.DAY_OF_WEEK % 2;
	}
	public MenuItem next() {
		MenuItem menuItem = items[position];
		position = position + 2;
		return menuItem;
	}
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}
}