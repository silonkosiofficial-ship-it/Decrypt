package S0;

/* JADX INFO: renamed from: S0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1610s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final S0.C1610s.a f12386g = new S0.C1610s.a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final S0.C1610s f12387h = new S0.C1610s(false, 0, false, 0, 0, null, null, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f12388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f12390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f12391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f12392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final T0.h f12393f;

    /* JADX INFO: renamed from: S0.s$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final S0.C1610s a() {
            return S0.C1610s.f12387h;
        }
    }

    private C1610s(boolean z6, int i6, boolean z10, int i10, int i11, S0.O o6, T0.h hVar) {
        this.f12388a = z6;
        this.f12389b = i6;
        this.f12390c = z10;
        this.f12391d = i10;
        this.f12392e = i11;
        this.f12393f = hVar;
    }

    public /* synthetic */ C1610s(boolean z6, int i6, boolean z10, int i10, int i11, S0.O o6, T0.h hVar, int i12, p247y7.AbstractC7342k abstractC7342k) {
        this((i12 & 1) != 0 ? false : z6, (i12 & 2) != 0 ? S0.C1615x.f12398b.b() : i6, (i12 & 4) != 0 ? true : z10, (i12 & 8) != 0 ? S0.C1616y.f12405b.h() : i10, (i12 & 16) != 0 ? S0.r.f12375b.a() : i11, (i12 & 32) != 0 ? null : o6, (i12 & 64) != 0 ? T0.h.f12889E.b() : hVar, null);
    }

    public /* synthetic */ C1610s(boolean z6, int i6, boolean z10, int i10, int i11, S0.O o6, T0.h hVar, p247y7.AbstractC7342k abstractC7342k) {
        this(z6, i6, z10, i10, i11, o6, hVar);
    }

    public final boolean b() {
        return this.f12390c;
    }

    public final int c() {
        return this.f12389b;
    }

    public final T0.h d() {
        return this.f12393f;
    }

    public final int e() {
        return this.f12392e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S0.C1610s)) {
            return false;
        }
        S0.C1610s c1610s = (S0.C1610s) obj;
        if (this.f12388a != c1610s.f12388a || !S0.C1615x.i(this.f12389b, c1610s.f12389b) || this.f12390c != c1610s.f12390c || !S0.C1616y.n(this.f12391d, c1610s.f12391d) || !S0.r.m(this.f12392e, c1610s.f12392e)) {
            return false;
        }
        c1610s.getClass();
        return p247y7.AbstractC7350t.b(null, null) && p247y7.AbstractC7350t.b(this.f12393f, c1610s.f12393f);
    }

    public final int f() {
        return this.f12391d;
    }

    public final S0.O g() {
        return null;
    }

    public final boolean h() {
        return this.f12388a;
    }

    public int hashCode() {
        return (((((((((p190t.h.a(this.f12388a) * 31) + S0.C1615x.j(this.f12389b)) * 31) + p190t.h.a(this.f12390c)) * 31) + S0.C1616y.o(this.f12391d)) * 31) + S0.r.n(this.f12392e)) * 961) + this.f12393f.hashCode();
    }

    public java.lang.String toString() {
        return "ImeOptions(singleLine=" + this.f12388a + ", capitalization=" + ((java.lang.Object) S0.C1615x.k(this.f12389b)) + ", autoCorrect=" + this.f12390c + ", keyboardType=" + ((java.lang.Object) S0.C1616y.p(this.f12391d)) + ", imeAction=" + ((java.lang.Object) S0.r.o(this.f12392e)) + ", platformImeOptions=" + ((java.lang.Object) null) + ", hintLocales=" + this.f12393f + ')';
    }
}
