package S;

/* JADX INFO: renamed from: S.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1583v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f11819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f11820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f11821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f11822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f11823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f11824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f11825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f11826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f11827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f11828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f11829k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f11830l;

    /* JADX INFO: renamed from: S.v$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11831a;

        static {
            int[] iArr = new int[L0.a.values().length];
            try {
                iArr[L0.a.On.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[L0.a.Indeterminate.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[L0.a.Off.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f11831a = iArr;
        }
    }

    private C1583v(long j6, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20) {
        this.f11819a = j6;
        this.f11820b = j10;
        this.f11821c = j11;
        this.f11822d = j12;
        this.f11823e = j13;
        this.f11824f = j14;
        this.f11825g = j15;
        this.f11826h = j16;
        this.f11827i = j17;
        this.f11828j = j18;
        this.f11829k = j19;
        this.f11830l = j20;
    }

    public /* synthetic */ C1583v(long j6, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20);
    }

    public final V.G1 a(boolean z6, L0.a aVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        long j6;
        V.G1 g1N;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(1009643462, i6, -1, "androidx.compose.material3.CheckboxColors.borderColor (Checkbox.kt:534)");
        }
        int[] iArr = S.C1583v.a.f11831a;
        int iOrdinal = aVar.ordinal();
        if (z6) {
            int i10 = iArr[iOrdinal];
            if (i10 == 1 || i10 == 2) {
                j6 = this.f11826h;
            } else {
                if (i10 != 3) {
                    throw new p087i7.s();
                }
                j6 = this.f11827i;
            }
        } else {
            int i11 = iArr[iOrdinal];
            if (i11 == 1) {
                j6 = this.f11828j;
            } else if (i11 == 2) {
                j6 = this.f11830l;
            } else {
                if (i11 != 3) {
                    throw new p087i7.s();
                }
                j6 = this.f11829k;
            }
        }
        long j10 = j6;
        if (z6) {
            interfaceC1734n.T(-1725816497);
            g1N = p190t.w.a(j10, p200u.AbstractC7177k.l(aVar == L0.a.Off ? 100 : 50, 0, null, 6, null), null, null, interfaceC1734n, 0, 12);
        } else {
            interfaceC1734n.T(-1725635953);
            g1N = V.v1.n(p141o0.C7016y0.i(j10), interfaceC1734n, 0);
        }
        interfaceC1734n.J();
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return g1N;
    }

    public final V.G1 b(boolean z6, L0.a aVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        long j6;
        V.G1 g1N;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(360729865, i6, -1, "androidx.compose.material3.CheckboxColors.boxColor (Checkbox.kt:501)");
        }
        int[] iArr = S.C1583v.a.f11831a;
        int iOrdinal = aVar.ordinal();
        if (z6) {
            int i10 = iArr[iOrdinal];
            if (i10 == 1 || i10 == 2) {
                j6 = this.f11821c;
            } else {
                if (i10 != 3) {
                    throw new p087i7.s();
                }
                j6 = this.f11822d;
            }
        } else {
            int i11 = iArr[iOrdinal];
            if (i11 == 1) {
                j6 = this.f11823e;
            } else if (i11 == 2) {
                j6 = this.f11825g;
            } else {
                if (i11 != 3) {
                    throw new p087i7.s();
                }
                j6 = this.f11824f;
            }
        }
        long j10 = j6;
        if (z6) {
            interfaceC1734n.T(-392211906);
            g1N = p190t.w.a(j10, p200u.AbstractC7177k.l(aVar == L0.a.Off ? 100 : 50, 0, null, 6, null), null, null, interfaceC1734n, 0, 12);
        } else {
            interfaceC1734n.T(-392031362);
            g1N = V.v1.n(p141o0.C7016y0.i(j10), interfaceC1734n, 0);
        }
        interfaceC1734n.J();
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return g1N;
    }

    public final V.G1 c(L0.a aVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-507585681, i6, -1, "androidx.compose.material3.CheckboxColors.checkmarkColor (Checkbox.kt:481)");
        }
        L0.a aVar2 = L0.a.Off;
        V.G1 g1A = p190t.w.a(aVar == aVar2 ? this.f11820b : this.f11819a, p200u.AbstractC7177k.l(aVar == aVar2 ? 100 : 50, 0, null, 6, null), null, null, interfaceC1734n, 0, 12);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return g1A;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof S.C1583v)) {
            return false;
        }
        S.C1583v c1583v = (S.C1583v) obj;
        return p141o0.C7016y0.o(this.f11819a, c1583v.f11819a) && p141o0.C7016y0.o(this.f11820b, c1583v.f11820b) && p141o0.C7016y0.o(this.f11821c, c1583v.f11821c) && p141o0.C7016y0.o(this.f11822d, c1583v.f11822d) && p141o0.C7016y0.o(this.f11823e, c1583v.f11823e) && p141o0.C7016y0.o(this.f11824f, c1583v.f11824f) && p141o0.C7016y0.o(this.f11825g, c1583v.f11825g) && p141o0.C7016y0.o(this.f11826h, c1583v.f11826h) && p141o0.C7016y0.o(this.f11827i, c1583v.f11827i) && p141o0.C7016y0.o(this.f11828j, c1583v.f11828j) && p141o0.C7016y0.o(this.f11829k, c1583v.f11829k) && p141o0.C7016y0.o(this.f11830l, c1583v.f11830l);
    }

    public int hashCode() {
        return (((((((((((((((((((((p141o0.C7016y0.u(this.f11819a) * 31) + p141o0.C7016y0.u(this.f11820b)) * 31) + p141o0.C7016y0.u(this.f11821c)) * 31) + p141o0.C7016y0.u(this.f11822d)) * 31) + p141o0.C7016y0.u(this.f11823e)) * 31) + p141o0.C7016y0.u(this.f11824f)) * 31) + p141o0.C7016y0.u(this.f11825g)) * 31) + p141o0.C7016y0.u(this.f11826h)) * 31) + p141o0.C7016y0.u(this.f11827i)) * 31) + p141o0.C7016y0.u(this.f11828j)) * 31) + p141o0.C7016y0.u(this.f11829k)) * 31) + p141o0.C7016y0.u(this.f11830l);
    }
}
