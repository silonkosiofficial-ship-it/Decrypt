package N4;

/* JADX INFO: renamed from: N4.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1418s extends N4.AbstractC1417q implements N4.A {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final transient N4.r f7783E;

    /* JADX INFO: renamed from: N4.s$a */
    public static final class a extends N4.AbstractC1417q.a {
        public N4.C1418s a() {
            java.util.Collection collectionEntrySet = this.f7779a.entrySet();
            java.util.Comparator comparator = this.f7780b;
            if (comparator != null) {
                collectionEntrySet = N4.G.a(comparator).d().b(collectionEntrySet);
            }
            return N4.C1418s.e(collectionEntrySet, this.f7781c);
        }
    }

    C1418s(N4.AbstractC1416p abstractC1416p, int i6, java.util.Comparator comparator) {
        super(abstractC1416p, i6);
        this.f7783E = d(comparator);
    }

    private static N4.r d(java.util.Comparator comparator) {
        return comparator == null ? N4.r.M() : N4.AbstractC1419t.W(comparator);
    }

    static N4.C1418s e(java.util.Collection collection, java.util.Comparator comparator) {
        if (collection.isEmpty()) {
            return f();
        }
        N4.AbstractC1416p.a aVar = new N4.AbstractC1416p.a(collection.size());
        java.util.Iterator it = collection.iterator();
        int size = 0;
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.Object key = entry.getKey();
            N4.r rVarG = g(comparator, (java.util.Collection) entry.getValue());
            if (!rVarG.isEmpty()) {
                aVar.e(key, rVarG);
                size += rVarG.size();
            }
        }
        return new N4.C1418s(aVar.b(), size, comparator);
    }

    public static N4.C1418s f() {
        return N4.C1412l.f7754F;
    }

    private static N4.r g(java.util.Comparator comparator, java.util.Collection collection) {
        return comparator == null ? N4.r.C(collection) : N4.AbstractC1419t.T(comparator, collection);
    }
}
