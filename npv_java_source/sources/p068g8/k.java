package p068g8;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements B8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p068g8.r f45677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p068g8.j f45678b;

    public k(p068g8.r rVar, p068g8.j jVar) {
        p247y7.AbstractC7350t.f(rVar, "kotlinClassFinder");
        p247y7.AbstractC7350t.f(jVar, "deserializedDescriptorResolver");
        this.f45677a = rVar;
        this.f45678b = jVar;
    }

    @Override // B8.h
    public B8.C0826g a(p138n8.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "classId");
        p068g8.t tVarB = p068g8.s.b(this.f45677a, bVar, P8.c.a(this.f45678b.d().g()));
        if (tVarB == null) {
            return null;
        }
        p247y7.AbstractC7350t.b(tVarB.c(), bVar);
        return this.f45678b.j(tVarB);
    }
}
