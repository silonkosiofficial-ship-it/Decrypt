package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class Z implements p199t9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p199t9.b f56984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p219v9.f f56985b;

    public Z(p199t9.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "serializer");
        this.f56984a = bVar;
        this.f56985b = new p239x9.t0(bVar.a());
    }

    @Override // p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return this.f56985b;
    }

    @Override // p199t9.a
    public java.lang.Object b(p229w9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "decoder");
        return hVar.s() ? hVar.x(this.f56984a) : hVar.n();
    }

    @Override // p199t9.e
    public void e(p229w9.j jVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(jVar, "encoder");
        if (obj == null) {
            jVar.d();
        } else {
            jVar.q();
            jVar.t(this.f56984a, obj);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && p239x9.Z.class == obj.getClass() && p247y7.AbstractC7350t.b(this.f56984a, ((p239x9.Z) obj).f56984a);
    }

    public int hashCode() {
        return this.f56984a.hashCode();
    }
}
