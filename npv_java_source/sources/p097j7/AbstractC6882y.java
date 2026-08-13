package p097j7;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: j7.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6882y extends p097j7.AbstractC6881x {
    public static int x(java.lang.Iterable iterable, int i6) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        return iterable instanceof java.util.Collection ? ((java.util.Collection) iterable).size() : i6;
    }

    public static final java.lang.Integer y(java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        if (iterable instanceof java.util.Collection) {
            return java.lang.Integer.valueOf(((java.util.Collection) iterable).size());
        }
        return null;
    }

    public static java.util.List z(java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            p097j7.AbstractC6879v.C(arrayList, (java.lang.Iterable) it.next());
        }
        return arrayList;
    }
}
