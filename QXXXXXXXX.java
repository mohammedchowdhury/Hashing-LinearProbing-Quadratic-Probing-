
public class QXXXXXXXX<E> extends OpenHashTable<E> {

	public QXXXXXXXX(int cap, E ghostEntry) {
		super(cap, ghostEntry);
	}

	@Override
	public int resolve(int h, int step) {
		return (h + step*step) % capacity;
	}


}