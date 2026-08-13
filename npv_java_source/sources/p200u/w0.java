package p200u;

/* JADX INFO: loaded from: classes.dex */
public final class w0 implements p200u.E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f55123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f55124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p200u.F f55125c;

    public w0(int i6, int i10, p200u.F f6) {
        this.f55123a = i6;
        this.f55124b = i10;
        this.f55125c = f6;
    }

    public /* synthetic */ w0(int i6, int i10, p200u.F f6, int i11, p247y7.AbstractC7342k abstractC7342k) {
        this((i11 & 1) != 0 ? 300 : i6, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? p200u.H.d() : f6);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p200u.w0)) {
            return false;
        }
        p200u.w0 w0Var = (p200u.w0) obj;
        return w0Var.f55123a == this.f55123a && w0Var.f55124b == this.f55124b && p247y7.AbstractC7350t.b(w0Var.f55125c, this.f55125c);
    }

    @Override // p200u.I, p200u.InterfaceC7175j
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public p200u.P0 a(p200u.x0 x0Var) {
        return new p200u.P0(this.f55123a, this.f55124b, this.f55125c);
    }

    public int hashCode() {
        return (((this.f55123a * 31) + this.f55125c.hashCode()) * 31) + this.f55124b;
    }
}
