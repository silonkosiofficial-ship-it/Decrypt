package p117l7;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static java.util.Comparator b(final p237x7.l... lVarArr) {
        p247y7.AbstractC7350t.f(lVarArr, "selectors");
        if (lVarArr.length > 0) {
            return new java.util.Comparator() { // from class: l7.b
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    return p117l7.c.c(lVarArr, obj, obj2);
                }
            };
        }
        throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(p237x7.l[] lVarArr, java.lang.Object obj, java.lang.Object obj2) {
        return e(obj, obj2, lVarArr);
    }

    public static int d(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    private static final int e(java.lang.Object obj, java.lang.Object obj2, p237x7.l[] lVarArr) {
        for (p237x7.l lVar : lVarArr) {
            int iD = p117l7.a.d((java.lang.Comparable) lVar.l(obj), (java.lang.Comparable) lVar.l(obj2));
            if (iD != 0) {
                return iD;
            }
        }
        return 0;
    }

    public static java.util.Comparator f() {
        p117l7.f fVar = p117l7.f.f50070C;
        p247y7.AbstractC7350t.d(fVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return fVar;
    }
}
