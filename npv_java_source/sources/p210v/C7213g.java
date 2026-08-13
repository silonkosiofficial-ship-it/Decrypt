package p210v;

/* JADX INFO: renamed from: v.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7213g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f55711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p141o0.AbstractC6984n0 f55712b;

    private C7213g(float f6, p141o0.AbstractC6984n0 abstractC6984n0) {
        this.f55711a = f6;
        this.f55712b = abstractC6984n0;
    }

    public /* synthetic */ C7213g(float f6, p141o0.AbstractC6984n0 abstractC6984n0, p247y7.AbstractC7342k abstractC7342k) {
        this(f6, abstractC6984n0);
    }

    public final p141o0.AbstractC6984n0 a() {
        return this.f55712b;
    }

    public final float b() {
        return this.f55711a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p210v.C7213g)) {
            return false;
        }
        p210v.C7213g c7213g = (p210v.C7213g) obj;
        return Y0.i.s(this.f55711a, c7213g.f55711a) && p247y7.AbstractC7350t.b(this.f55712b, c7213g.f55712b);
    }

    public int hashCode() {
        return (Y0.i.t(this.f55711a) * 31) + this.f55712b.hashCode();
    }

    public java.lang.String toString() {
        return "BorderStroke(width=" + ((java.lang.Object) Y0.i.u(this.f55711a)) + ", brush=" + this.f55712b + ')';
    }
}
