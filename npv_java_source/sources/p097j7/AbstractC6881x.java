package p097j7;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: j7.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6881x extends p097j7.AbstractC6880w {
    public static java.util.ArrayList g(java.lang.Object... objArr) {
        p247y7.AbstractC7350t.f(objArr, "elements");
        return objArr.length == 0 ? new java.util.ArrayList() : new java.util.ArrayList(new p097j7.C6870l(objArr, true));
    }

    public static final java.util.Collection h(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        return new p097j7.C6870l(objArr, false);
    }

    public static int i(java.util.List list, int i6, int i10, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(list, "<this>");
        p247y7.AbstractC7350t.f(lVar, "comparison");
        u(list.size(), i6, i10);
        int i11 = i10 - 1;
        while (i6 <= i11) {
            int i12 = (i6 + i11) >>> 1;
            int iIntValue = ((java.lang.Number) lVar.l(list.get(i12))).intValue();
            if (iIntValue < 0) {
                i6 = i12 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i12;
                }
                i11 = i12 - 1;
            }
        }
        return -(i6 + 1);
    }

    public static final int j(java.util.List list, java.lang.Comparable comparable, int i6, int i10) {
        p247y7.AbstractC7350t.f(list, "<this>");
        u(list.size(), i6, i10);
        int i11 = i10 - 1;
        while (i6 <= i11) {
            int i12 = (i6 + i11) >>> 1;
            int iD = p117l7.a.d((java.lang.Comparable) list.get(i12), comparable);
            if (iD < 0) {
                i6 = i12 + 1;
            } else {
                if (iD <= 0) {
                    return i12;
                }
                i11 = i12 - 1;
            }
        }
        return -(i6 + 1);
    }

    public static /* synthetic */ int k(java.util.List list, int i6, int i10, p237x7.l lVar, int i11, java.lang.Object obj) {
        if ((i11 & 1) != 0) {
            i6 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = list.size();
        }
        return p097j7.AbstractC6879v.i(list, i6, i10, lVar);
    }

    public static /* synthetic */ int l(java.util.List list, java.lang.Comparable comparable, int i6, int i10, int i11, java.lang.Object obj) {
        if ((i11 & 2) != 0) {
            i6 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = list.size();
        }
        return j(list, comparable, i6, i10);
    }

    public static java.util.List m() {
        return p097j7.I.f49284C;
    }

    public static E7.i n(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "<this>");
        return new E7.i(0, collection.size() - 1);
    }

    public static int o(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "<this>");
        return list.size() - 1;
    }

    public static java.util.List p(java.lang.Object... objArr) {
        p247y7.AbstractC7350t.f(objArr, "elements");
        return objArr.length > 0 ? p097j7.AbstractC6872n.d(objArr) : p097j7.AbstractC6879v.m();
    }

    public static java.util.List q(java.lang.Object obj) {
        return obj != null ? p097j7.AbstractC6879v.e(obj) : p097j7.AbstractC6879v.m();
    }

    public static java.util.List r(java.lang.Object... objArr) {
        p247y7.AbstractC7350t.f(objArr, "elements");
        return p097j7.AbstractC6872n.W(objArr);
    }

    public static java.util.List s(java.lang.Object... objArr) {
        p247y7.AbstractC7350t.f(objArr, "elements");
        return objArr.length == 0 ? new java.util.ArrayList() : new java.util.ArrayList(new p097j7.C6870l(objArr, true));
    }

    public static final java.util.List t(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "<this>");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : p097j7.AbstractC6879v.e(list.get(0));
        }
        return p097j7.AbstractC6879v.m();
    }

    private static final void u(int i6, int i10, int i11) {
        if (i10 > i11) {
            throw new java.lang.IllegalArgumentException("fromIndex (" + i10 + ") is greater than toIndex (" + i11 + ").");
        }
        if (i10 < 0) {
            throw new java.lang.IndexOutOfBoundsException("fromIndex (" + i10 + ") is less than zero.");
        }
        if (i11 <= i6) {
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("toIndex (" + i11 + ") is greater than size (" + i6 + ").");
    }

    public static void v() {
        throw new java.lang.ArithmeticException("Count overflow has happened.");
    }

    public static void w() {
        throw new java.lang.ArithmeticException("Index overflow has happened.");
    }
}
