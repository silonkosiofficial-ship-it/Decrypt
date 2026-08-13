package X7;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X7.m f16025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.Map f16026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.Map f16027c;

    static {
        X7.m mVar = new X7.m();
        f16025a = mVar;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        f16026b = linkedHashMap;
        p138n8.i iVar = p138n8.i.f52015a;
        mVar.c(iVar.l(), mVar.a("java.util.ArrayList", "java.util.LinkedList"));
        mVar.c(iVar.n(), mVar.a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        mVar.c(iVar.m(), mVar.a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        p138n8.b bVarM = p138n8.b.m(new p138n8.c("java.util.function.Function"));
        p247y7.AbstractC7350t.e(bVarM, "topLevel(...)");
        mVar.c(bVarM, mVar.a("java.util.function.UnaryOperator"));
        p138n8.b bVarM2 = p138n8.b.m(new p138n8.c("java.util.function.BiFunction"));
        p247y7.AbstractC7350t.e(bVarM2, "topLevel(...)");
        mVar.c(bVarM2, mVar.a("java.util.function.BinaryOperator"));
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap.size());
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(p087i7.B.a(((p138n8.b) entry.getKey()).b(), ((p138n8.b) entry.getValue()).b()));
        }
        f16027c = p097j7.S.q(arrayList);
    }

    private m() {
    }

    private final java.util.List a(java.lang.String... strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            arrayList.add(p138n8.b.m(new p138n8.c(str)));
        }
        return arrayList;
    }

    private final void c(p138n8.b bVar, java.util.List list) {
        java.util.Map map = f16026b;
        for (java.lang.Object obj : list) {
            map.put(obj, bVar);
        }
    }

    public final p138n8.c b(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "classFqName");
        return (p138n8.c) f16027c.get(cVar);
    }
}
