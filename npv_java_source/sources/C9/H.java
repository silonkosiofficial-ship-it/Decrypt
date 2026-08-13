package C9;

/* JADX INFO: loaded from: classes2.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f1392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.ArrayList f1393b;

    public H(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "initialRoute");
        this.f1392a = str;
        this.f1393b = new java.util.ArrayList();
    }

    public static /* synthetic */ void d(C9.H h6, java.lang.String str, java.util.List list, E9.a aVar, C9.O o6, p237x7.r rVar, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            list = p097j7.AbstractC6879v.m();
        }
        h6.c(str, list, (i6 & 4) != 0 ? null : aVar, (i6 & 8) != 0 ? null : o6, rVar);
    }

    public final void a(D9.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "route");
        this.f1393b.add(cVar);
    }

    public final C9.I b() {
        if (this.f1392a.length() == 0) {
            this.f1393b.isEmpty();
        }
        java.util.ArrayList arrayList = this.f1393b;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : arrayList) {
            java.lang.String strB = ((D9.c) obj).b();
            java.lang.Object arrayList2 = linkedHashMap.get(strB);
            if (arrayList2 == null) {
                arrayList2 = new java.util.ArrayList();
                linkedHashMap.put(strB, arrayList2);
            }
            ((java.util.List) arrayList2).add(obj);
        }
        boolean z6 = false;
        if (!linkedHashMap.isEmpty()) {
            java.util.Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                if (((java.util.List) ((java.util.Map.Entry) it.next()).getValue()).size() > 1) {
                    z6 = true;
                    break;
                }
            }
        }
        if (!z6) {
            return new C9.I(this.f1392a, p097j7.AbstractC6879v.T0(this.f1393b));
        }
        throw new java.lang.IllegalArgumentException("Duplicate route can not be applied".toString());
    }

    public final void c(java.lang.String str, java.util.List list, E9.a aVar, C9.O o6, p237x7.r rVar) {
        p247y7.AbstractC7350t.f(str, "route");
        p247y7.AbstractC7350t.f(list, "deepLinks");
        p247y7.AbstractC7350t.f(rVar, "content");
        a(new D9.d(str, list, aVar, o6, rVar));
    }
}
