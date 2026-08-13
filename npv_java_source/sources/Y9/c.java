package Y9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public static final void a(X9.AbstractC1843k abstractC1843k, X9.Q q6, boolean z6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(abstractC1843k, "<this>");
        p247y7.AbstractC7350t.f(q6, "dir");
        p097j7.C6871m c6871m = new p097j7.C6871m();
        for (X9.Q qS = q6; qS != null && !abstractC1843k.g(qS); qS = qS.s()) {
            c6871m.f(qS);
        }
        if (z6 && c6871m.isEmpty()) {
            throw new java.io.IOException(q6 + " already exists.");
        }
        java.util.Iterator<E> it = c6871m.iterator();
        while (it.hasNext()) {
            abstractC1843k.c((X9.Q) it.next());
        }
    }

    public static final boolean b(X9.AbstractC1843k abstractC1843k, X9.Q q6) {
        p247y7.AbstractC7350t.f(abstractC1843k, "<this>");
        p247y7.AbstractC7350t.f(q6, "path");
        return abstractC1843k.h(q6) != null;
    }
}
