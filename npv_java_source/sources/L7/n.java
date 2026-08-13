package L7;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L7.n f6435a = new L7.n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.Set f6436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.Set f6437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.util.HashMap f6438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.util.HashMap f6439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.util.HashMap f6440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.util.Set f6441g;

    static {
        L7.m[] mVarArrValues = L7.m.values();
        java.util.ArrayList arrayList = new java.util.ArrayList(mVarArrValues.length);
        for (L7.m mVar : mVarArrValues) {
            arrayList.add(mVar.m());
        }
        f6436b = p097j7.AbstractC6879v.Y0(arrayList);
        L7.l[] lVarArrValues = L7.l.values();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(lVarArrValues.length);
        for (L7.l lVar : lVarArrValues) {
            arrayList2.add(lVar.g());
        }
        f6437c = p097j7.AbstractC6879v.Y0(arrayList2);
        f6438d = new java.util.HashMap();
        f6439e = new java.util.HashMap();
        f6440f = p097j7.S.j(p087i7.B.a(L7.l.f6418E, p138n8.f.o("ubyteArrayOf")), p087i7.B.a(L7.l.f6419F, p138n8.f.o("ushortArrayOf")), p087i7.B.a(L7.l.f6420G, p138n8.f.o("uintArrayOf")), p087i7.B.a(L7.l.f6421H, p138n8.f.o("ulongArrayOf")));
        L7.m[] mVarArrValues2 = L7.m.values();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (L7.m mVar2 : mVarArrValues2) {
            linkedHashSet.add(mVar2.g().j());
        }
        f6441g = linkedHashSet;
        for (L7.m mVar3 : L7.m.values()) {
            f6438d.put(mVar3.g(), mVar3.i());
            f6439e.put(mVar3.i(), mVar3.g());
        }
    }

    private n() {
    }

    public static final boolean d(F8.E e6) {
        O7.InterfaceC1427h interfaceC1427hW;
        p247y7.AbstractC7350t.f(e6, "type");
        if (F8.q0.w(e6) || (interfaceC1427hW = e6.W0().w()) == null) {
            return false;
        }
        return f6435a.c(interfaceC1427hW);
    }

    public final p138n8.b a(p138n8.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "arrayClassId");
        return (p138n8.b) f6438d.get(bVar);
    }

    public final boolean b(p138n8.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        return f6441g.contains(fVar);
    }

    public final boolean c(O7.InterfaceC1432m interfaceC1432m) {
        p247y7.AbstractC7350t.f(interfaceC1432m, "descriptor");
        O7.InterfaceC1432m interfaceC1432mB = interfaceC1432m.b();
        return (interfaceC1432mB instanceof O7.K) && p247y7.AbstractC7350t.b(((O7.K) interfaceC1432mB).e(), L7.j.f6325y) && f6436b.contains(interfaceC1432m.getName());
    }
}
