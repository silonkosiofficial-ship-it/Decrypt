package p200u;

/* JADX INFO: loaded from: classes.dex */
public abstract class U {
    public static final int a(p170r.AbstractC7037l abstractC7037l, int i6, int i10, int i11) {
        if (!(i10 <= i11)) {
            p200u.AbstractC7166e0.a("fromIndex(" + i10 + ") > toIndex(" + i11 + ')');
        }
        if (i10 < 0) {
            throw new java.lang.IndexOutOfBoundsException("Index out of range: " + i10);
        }
        if (i11 > abstractC7037l.b()) {
            throw new java.lang.IndexOutOfBoundsException("Index out of range: " + i11);
        }
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iA = abstractC7037l.a(i13);
            if (iA < i6) {
                i10 = i13 + 1;
            } else {
                if (iA <= i6) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int b(p170r.AbstractC7037l abstractC7037l, int i6, int i10, int i11, int i12, java.lang.Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = abstractC7037l.b();
        }
        return a(abstractC7037l, i6, i10, i11);
    }
}
