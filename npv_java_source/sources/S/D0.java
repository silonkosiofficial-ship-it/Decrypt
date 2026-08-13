package S;

/* JADX INFO: loaded from: classes.dex */
public final class D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f9961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f9962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f9963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f9964d;

    private D0(long j6, long j10, long j11, long j12) {
        this.f9961a = j6;
        this.f9962b = j10;
        this.f9963c = j11;
        this.f9964d = j12;
    }

    public /* synthetic */ D0(long j6, long j10, long j11, long j12, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, j10, j11, j12);
    }

    public final V.G1 a(boolean z6, boolean z10, V.InterfaceC1734n interfaceC1734n, int i6) {
        long j6;
        V.G1 g1N;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1840145292, i6, -1, "androidx.compose.material3.RadioButtonColors.radioColor (RadioButton.kt:228)");
        }
        if (z6 && z10) {
            j6 = this.f9961a;
        } else if (!z6 || z10) {
            j6 = (z6 || !z10) ? this.f9964d : this.f9963c;
        } else {
            j6 = this.f9962b;
        }
        long j10 = j6;
        if (z6) {
            interfaceC1734n.T(350067971);
            g1N = p190t.w.a(j10, p200u.AbstractC7177k.l(100, 0, null, 6, null), null, null, interfaceC1734n, 48, 12);
        } else {
            interfaceC1734n.T(350170674);
            g1N = V.v1.n(p141o0.C7016y0.i(j10), interfaceC1734n, 0);
        }
        interfaceC1734n.J();
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return g1N;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof S.D0)) {
            return false;
        }
        S.D0 d6 = (S.D0) obj;
        return p141o0.C7016y0.o(this.f9961a, d6.f9961a) && p141o0.C7016y0.o(this.f9962b, d6.f9962b) && p141o0.C7016y0.o(this.f9963c, d6.f9963c) && p141o0.C7016y0.o(this.f9964d, d6.f9964d);
    }

    public int hashCode() {
        return (((((p141o0.C7016y0.u(this.f9961a) * 31) + p141o0.C7016y0.u(this.f9962b)) * 31) + p141o0.C7016y0.u(this.f9963c)) * 31) + p141o0.C7016y0.u(this.f9964d);
    }
}
