package L7;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L7.c f6243a = new L7.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.Set f6244b;

    static {
        java.util.Set set = L7.h.f6264H;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(set, 10));
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(L7.j.c((L7.h) it.next()));
        }
        p138n8.c cVarL = L7.j.a.f6379h.l();
        p247y7.AbstractC7350t.e(cVarL, "toSafe(...)");
        java.util.List listD0 = p097j7.AbstractC6879v.D0(arrayList, cVarL);
        p138n8.c cVarL2 = L7.j.a.f6383j.l();
        p247y7.AbstractC7350t.e(cVarL2, "toSafe(...)");
        java.util.List listD1 = p097j7.AbstractC6879v.D0(listD0, cVarL2);
        p138n8.c cVarL3 = L7.j.a.f6401s.l();
        p247y7.AbstractC7350t.e(cVarL3, "toSafe(...)");
        java.util.List listD2 = p097j7.AbstractC6879v.D0(listD1, cVarL3);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it2 = listD2.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(p138n8.b.m((p138n8.c) it2.next()));
        }
        f6244b = linkedHashSet;
    }

    private c() {
    }

    public final java.util.Set a() {
        return f6244b;
    }

    public final java.util.Set b() {
        return f6244b;
    }
}
