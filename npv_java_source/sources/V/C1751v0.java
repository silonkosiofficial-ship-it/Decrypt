package V;

/* JADX INFO: renamed from: V.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1751v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p170r.K f15051a;

    private /* synthetic */ C1751v0(p170r.K k6) {
        this.f15051a = k6;
    }

    public static final /* synthetic */ V.C1751v0 a(p170r.K k6) {
        return new V.C1751v0(k6);
    }

    public static p170r.K b(p170r.K k6) {
        return k6;
    }

    public static boolean c(p170r.K k6, java.lang.Object obj) {
        return (obj instanceof V.C1751v0) && p247y7.AbstractC7350t.b(k6, ((V.C1751v0) obj).h());
    }

    public static int d(p170r.K k6) {
        return k6.hashCode();
    }

    public static final java.lang.Object e(p170r.K k6, java.lang.Object obj) {
        java.lang.Object objC = k6.c(obj);
        if (objC == null) {
            return null;
        }
        if (p247y7.W.n(objC)) {
            java.util.List listC = p247y7.W.c(objC);
            java.lang.Object objRemove = listC.remove(0);
            if (listC.isEmpty()) {
                k6.p(obj);
            }
            objC = objRemove;
        } else {
            k6.p(obj);
        }
        p247y7.AbstractC7350t.d(objC, "null cannot be cast to non-null type V of androidx.compose.runtime.MutableScatterMultiMap.pop_impl$lambda$1");
        return objC;
    }

    public static final void f(p170r.K k6, java.lang.Object obj, java.lang.Object obj2) {
        int iL = k6.l(obj);
        boolean z6 = iL < 0;
        java.lang.Object obj3 = z6 ? null : k6.f53335c[iL];
        if (obj3 != null) {
            if (p247y7.W.n(obj3)) {
                p247y7.AbstractC7350t.d(obj3, "null cannot be cast to non-null type kotlin.collections.MutableList<V of androidx.compose.runtime.MutableScatterMultiMap.put_impl$lambda$0>");
                java.util.List listC = p247y7.W.c(obj3);
                listC.add(obj2);
                obj2 = listC;
            } else {
                obj2 = p097j7.AbstractC6879v.s(obj3, obj2);
            }
        }
        if (!z6) {
            k6.f53335c[iL] = obj2;
            return;
        }
        int i6 = ~iL;
        k6.f53334b[i6] = obj;
        k6.f53335c[i6] = obj2;
    }

    public static java.lang.String g(p170r.K k6) {
        return "MutableScatterMultiMap(map=" + k6 + ')';
    }

    public boolean equals(java.lang.Object obj) {
        return c(this.f15051a, obj);
    }

    public final /* synthetic */ p170r.K h() {
        return this.f15051a;
    }

    public int hashCode() {
        return d(this.f15051a);
    }

    public java.lang.String toString() {
        return g(this.f15051a);
    }
}
