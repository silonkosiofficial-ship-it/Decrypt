package p097j7;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class D extends p097j7.C {
    public static java.util.List R(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "<this>");
        return new p097j7.Y(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int S(java.util.List list, int i6) {
        if (i6 >= 0 && i6 <= p097j7.AbstractC6879v.o(list)) {
            return p097j7.AbstractC6879v.o(list) - i6;
        }
        throw new java.lang.IndexOutOfBoundsException("Element index " + i6 + " must be in range [" + new E7.i(0, p097j7.AbstractC6879v.o(list)) + "].");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int T(java.util.List list, int i6) {
        return p097j7.AbstractC6879v.o(list) - i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int U(java.util.List list, int i6) {
        if (i6 >= 0 && i6 <= list.size()) {
            return list.size() - i6;
        }
        throw new java.lang.IndexOutOfBoundsException("Position index " + i6 + " must be in range [" + new E7.i(0, list.size()) + "].");
    }
}
