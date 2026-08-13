package p190t;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p071h0.c f54492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.l f54493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p200u.I f54494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f54495d;

    public i(p071h0.c cVar, p237x7.l lVar, p200u.I i6, boolean z6) {
        this.f54492a = cVar;
        this.f54493b = lVar;
        this.f54494c = i6;
        this.f54495d = z6;
    }

    public final p071h0.c a() {
        return this.f54492a;
    }

    public final p200u.I b() {
        return this.f54494c;
    }

    public final boolean c() {
        return this.f54495d;
    }

    public final p237x7.l d() {
        return this.f54493b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p190t.i)) {
            return false;
        }
        p190t.i iVar = (p190t.i) obj;
        return p247y7.AbstractC7350t.b(this.f54492a, iVar.f54492a) && p247y7.AbstractC7350t.b(this.f54493b, iVar.f54493b) && p247y7.AbstractC7350t.b(this.f54494c, iVar.f54494c) && this.f54495d == iVar.f54495d;
    }

    public int hashCode() {
        return (((((this.f54492a.hashCode() * 31) + this.f54493b.hashCode()) * 31) + this.f54494c.hashCode()) * 31) + p190t.h.a(this.f54495d);
    }

    public java.lang.String toString() {
        return "ChangeSize(alignment=" + this.f54492a + ", size=" + this.f54493b + ", animationSpec=" + this.f54494c + ", clip=" + this.f54495d + ')';
    }
}
