package p210v;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f55637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A.B f55638b;

    private Q(long j6, A.B b6) {
        this.f55637a = j6;
        this.f55638b = b6;
    }

    public /* synthetic */ Q(long j6, A.B b6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? p141o0.A0.d(4284900966L) : j6, (i6 & 2) != 0 ? androidx.compose.foundation.layout.m.c(0.0f, 0.0f, 3, null) : b6, null);
    }

    public /* synthetic */ Q(long j6, A.B b6, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, b6);
    }

    public final A.B a() {
        return this.f55638b;
    }

    public final long b() {
        return this.f55637a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p247y7.AbstractC7350t.b(p210v.Q.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        p210v.Q q6 = (p210v.Q) obj;
        return p141o0.C7016y0.o(this.f55637a, q6.f55637a) && p247y7.AbstractC7350t.b(this.f55638b, q6.f55638b);
    }

    public int hashCode() {
        return (p141o0.C7016y0.u(this.f55637a) * 31) + this.f55638b.hashCode();
    }

    public java.lang.String toString() {
        return "OverscrollConfiguration(glowColor=" + ((java.lang.Object) p141o0.C7016y0.v(this.f55637a)) + ", drawPadding=" + this.f55638b + ')';
    }
}
