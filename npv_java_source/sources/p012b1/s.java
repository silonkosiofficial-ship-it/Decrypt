package p012b1;

/* JADX INFO: loaded from: classes.dex */
public final class s implements b1.r.a, p012b1.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p012b1.t f24105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p012b1.t f24106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p012b1.t f24107d;

    /* JADX WARN: Multi-variable type inference failed */
    private s(Y0.i iVar, java.lang.String str) {
        this.f24105b = new p012b1.t(iVar, str, "base", null);
        this.f24106c = new p012b1.t(0 == true ? 1 : 0, 0 == true ? 1 : 0, "min", 0 == true ? 1 : 0);
        this.f24107d = new p012b1.t(0 == true ? 1 : 0, 0 == true ? 1 : 0, "max", 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(java.lang.String str) {
        this(null, str);
        p247y7.AbstractC7350t.f(str, "valueSymbol");
    }

    public final p082i1.c a() {
        if (this.f24106c.b() && this.f24107d.b()) {
            return this.f24105b.a();
        }
        p082i1.f fVar = new p082i1.f(new char[0]);
        if (!this.f24106c.b()) {
            fVar.k0("min", this.f24106c.a());
        }
        if (!this.f24107d.b()) {
            fVar.k0("max", this.f24107d.a());
        }
        fVar.k0("value", this.f24105b.a());
        return fVar;
    }
}
