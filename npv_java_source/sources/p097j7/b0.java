package p097j7;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b0 extends p097j7.a0 {
    public static java.util.Set d() {
        return p097j7.K.f49286C;
    }

    public static java.util.LinkedHashSet e(java.lang.Object... objArr) {
        p247y7.AbstractC7350t.f(objArr, "elements");
        return (java.util.LinkedHashSet) p097j7.AbstractC6876s.K0(objArr, new java.util.LinkedHashSet(p097j7.S.d(objArr.length)));
    }

    public static final java.util.Set f(java.util.Set set) {
        p247y7.AbstractC7350t.f(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : p097j7.Z.c(set.iterator().next());
        }
        return p097j7.Z.d();
    }

    public static java.util.Set g(java.lang.Object... objArr) {
        p247y7.AbstractC7350t.f(objArr, "elements");
        return p097j7.AbstractC6872n.d1(objArr);
    }
}
