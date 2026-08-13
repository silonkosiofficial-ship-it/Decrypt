package O7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class N {
    public static final void a(O7.L l6, p138n8.c cVar, java.util.Collection collection) {
        p247y7.AbstractC7350t.f(l6, "<this>");
        p247y7.AbstractC7350t.f(cVar, "fqName");
        p247y7.AbstractC7350t.f(collection, "packageFragments");
        if (l6 instanceof O7.O) {
            ((O7.O) l6).c(cVar, collection);
        } else {
            collection.addAll(l6.b(cVar));
        }
    }

    public static final boolean b(O7.L l6, p138n8.c cVar) {
        p247y7.AbstractC7350t.f(l6, "<this>");
        p247y7.AbstractC7350t.f(cVar, "fqName");
        return l6 instanceof O7.O ? ((O7.O) l6).a(cVar) : c(l6, cVar).isEmpty();
    }

    public static final java.util.List c(O7.L l6, p138n8.c cVar) {
        p247y7.AbstractC7350t.f(l6, "<this>");
        p247y7.AbstractC7350t.f(cVar, "fqName");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        a(l6, cVar, arrayList);
        return arrayList;
    }
}
