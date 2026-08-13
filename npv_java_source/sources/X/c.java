package X;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(java.util.List list, int i6) {
        int size = list.size();
        if (i6 < 0 || i6 >= size) {
            throw new java.lang.IndexOutOfBoundsException("Index " + i6 + " is out of bounds. The list has " + size + " elements.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(java.util.List list, int i6, int i10) {
        int size = list.size();
        if (i6 > i10) {
            throw new java.lang.IllegalArgumentException("Indices are out of order. fromIndex (" + i6 + ") is greater than toIndex (" + i10 + ").");
        }
        if (i6 < 0) {
            throw new java.lang.IndexOutOfBoundsException("fromIndex (" + i6 + ") is less than 0.");
        }
        if (i10 <= size) {
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("toIndex (" + i10 + ") is more than than the list size (" + size + ')');
    }
}
