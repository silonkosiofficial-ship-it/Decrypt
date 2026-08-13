package p012b1;

/* JADX INFO: loaded from: classes.dex */
final class k implements D0.InterfaceC0903w {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p012b1.f f24077C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p237x7.l f24078D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.Object f24079E;

    public k(p012b1.f fVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(fVar, "ref");
        p247y7.AbstractC7350t.f(lVar, "constrain");
        this.f24077C = fVar;
        this.f24078D = lVar;
        this.f24079E = fVar.a();
    }

    @Override // D0.InterfaceC0903w
    public java.lang.Object Q() {
        return this.f24079E;
    }

    public final p237x7.l a() {
        return this.f24078D;
    }

    public final p012b1.f b() {
        return this.f24077C;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p012b1.k) {
            p012b1.k kVar = (p012b1.k) obj;
            if (p247y7.AbstractC7350t.b(this.f24077C.a(), kVar.f24077C.a()) && p247y7.AbstractC7350t.b(this.f24078D, kVar.f24078D)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f24077C.a().hashCode() * 31) + this.f24078D.hashCode();
    }
}
