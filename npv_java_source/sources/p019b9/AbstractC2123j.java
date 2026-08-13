package p019b9;

/* JADX INFO: renamed from: b9.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2123j {
    public static java.lang.Object a(java.lang.Object obj) {
        return obj;
    }

    public static /* synthetic */ java.lang.Object b(java.lang.Object obj, int i6, p247y7.AbstractC7342k abstractC7342k) {
        if ((i6 & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }

    public static final java.lang.Object c(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return a(obj2);
        }
        if (obj instanceof java.util.ArrayList) {
            p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ((java.util.ArrayList) obj).add(obj2);
            return a(obj);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return a(arrayList);
    }
}
