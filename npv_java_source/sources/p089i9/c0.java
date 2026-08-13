package p089i9;

/* JADX INFO: loaded from: classes2.dex */
final class c0 extends p109k9.A {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p089i9.K f47510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f47511g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(p089i9.K k6, boolean z6) {
        super(p089i9.C6678i.f47516a.d(), java.lang.Integer.valueOf(k6 != p089i9.K.ZERO ? 1 : 4), null, k6 == p089i9.K.SPACE ? 4 : null, 4);
        p247y7.AbstractC7350t.f(k6, "padding");
        this.f47510f = k6;
        this.f47511g = z6;
    }

    public /* synthetic */ c0(p089i9.K k6, boolean z6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(k6, (i6 & 2) != 0 ? false : z6);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p089i9.c0) {
            p089i9.c0 c0Var = (p089i9.c0) obj;
            if (this.f47510f == c0Var.f47510f && this.f47511g == c0Var.f47511g) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f47510f.hashCode() * 31) + p190t.h.a(this.f47511g);
    }
}
