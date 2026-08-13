package B8;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements B8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p108k8.c f961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p108k8.a f962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p237x7.l f963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.Map f964d;

    public z(p088i8.m mVar, p108k8.c cVar, p108k8.a aVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(mVar, "proto");
        p247y7.AbstractC7350t.f(cVar, "nameResolver");
        p247y7.AbstractC7350t.f(aVar, "metadataVersion");
        p247y7.AbstractC7350t.f(lVar, "classSource");
        this.f961a = cVar;
        this.f962b = aVar;
        this.f963c = lVar;
        java.util.List listJ = mVar.J();
        p247y7.AbstractC7350t.e(listJ, "getClass_List(...)");
        java.util.List list = listJ;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(E7.j.d(p097j7.S.d(p097j7.AbstractC6879v.x(list, 10)), 16));
        for (java.lang.Object obj : list) {
            linkedHashMap.put(B8.y.a(this.f961a, ((p088i8.c) obj).F0()), obj);
        }
        this.f964d = linkedHashMap;
    }

    @Override // B8.h
    public B8.C0826g a(p138n8.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "classId");
        p088i8.c cVar = (p088i8.c) this.f964d.get(bVar);
        if (cVar == null) {
            return null;
        }
        return new B8.C0826g(this.f961a, cVar, this.f962b, (O7.a0) this.f963c.l(bVar));
    }

    public final java.util.Collection b() {
        return this.f964d.keySet();
    }
}
