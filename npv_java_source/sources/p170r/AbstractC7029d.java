package p170r;

/* JADX INFO: renamed from: r.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7029d {
    public static final void a(p170r.C7027b c7027b, int i6) {
        p247y7.AbstractC7350t.f(c7027b, "<this>");
        c7027b.D(new int[i6]);
        c7027b.C(new java.lang.Object[i6]);
    }

    public static final int b(p170r.C7027b c7027b, int i6) {
        p247y7.AbstractC7350t.f(c7027b, "<this>");
        try {
            return p180s.a.a(c7027b.f(), c7027b.o(), i6);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public static final int c(p170r.C7027b c7027b, java.lang.Object obj, int i6) {
        p247y7.AbstractC7350t.f(c7027b, "<this>");
        int iO = c7027b.o();
        if (iO == 0) {
            return -1;
        }
        int iB = b(c7027b, i6);
        if (iB < 0 || p247y7.AbstractC7350t.b(obj, c7027b.e()[iB])) {
            return iB;
        }
        int i10 = iB + 1;
        while (i10 < iO && c7027b.f()[i10] == i6) {
            if (p247y7.AbstractC7350t.b(obj, c7027b.e()[i10])) {
                return i10;
            }
            i10++;
        }
        for (int i11 = iB - 1; i11 >= 0 && c7027b.f()[i11] == i6; i11--) {
            if (p247y7.AbstractC7350t.b(obj, c7027b.e()[i11])) {
                return i11;
            }
        }
        return ~i10;
    }

    public static final int d(p170r.C7027b c7027b) {
        p247y7.AbstractC7350t.f(c7027b, "<this>");
        return c(c7027b, null, 0);
    }
}
