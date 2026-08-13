package H;

/* JADX INFO: renamed from: H.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1229v {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final H.C1229v.a f4183g = new H.C1229v.a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final H.C1229v f4184h = new H.C1229v(0, null, 0, 0, null, null, null, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final H.C1229v f4185i = new H.C1229v(0, java.lang.Boolean.FALSE, S0.C1616y.f12405b.f(), 0, null, null, null, 121, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Boolean f4187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f4188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f4189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.Boolean f4190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final T0.h f4191f;

    /* JADX INFO: renamed from: H.v$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final H.C1229v a() {
            return H.C1229v.f4184h;
        }
    }

    private C1229v(int i6, java.lang.Boolean bool, int i10, int i11, S0.O o6, java.lang.Boolean bool2, T0.h hVar) {
        this.f4186a = i6;
        this.f4187b = bool;
        this.f4188c = i10;
        this.f4189d = i11;
        this.f4190e = bool2;
        this.f4191f = hVar;
    }

    public /* synthetic */ C1229v(int i6, java.lang.Boolean bool, int i10, int i11, S0.O o6, java.lang.Boolean bool2, T0.h hVar, int i12, p247y7.AbstractC7342k abstractC7342k) {
        this((i12 & 1) != 0 ? S0.C1615x.f12398b.d() : i6, (i12 & 2) != 0 ? null : bool, (i12 & 4) != 0 ? S0.C1616y.f12405b.i() : i10, (i12 & 8) != 0 ? S0.r.f12375b.i() : i11, (i12 & 16) != 0 ? null : o6, (i12 & 32) != 0 ? null : bool2, (i12 & 64) == 0 ? hVar : null, null);
    }

    public /* synthetic */ C1229v(int i6, java.lang.Boolean bool, int i10, int i11, S0.O o6, java.lang.Boolean bool2, T0.h hVar, p247y7.AbstractC7342k abstractC7342k) {
        this(i6, bool, i10, i11, o6, bool2, hVar);
    }

    private final boolean b() {
        java.lang.Boolean bool = this.f4187b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private final int c() {
        S0.C1615x c1615xF = S0.C1615x.f(this.f4186a);
        int iL = c1615xF.l();
        S0.C1615x.a aVar = S0.C1615x.f12398b;
        if (S0.C1615x.i(iL, aVar.d())) {
            c1615xF = null;
        }
        return c1615xF != null ? c1615xF.l() : aVar.b();
    }

    private final T0.h d() {
        T0.h hVar = this.f4191f;
        return hVar == null ? T0.h.f12889E.b() : hVar;
    }

    private final int f() {
        S0.C1616y c1616yK = S0.C1616y.k(this.f4188c);
        int iQ = c1616yK.q();
        S0.C1616y.a aVar = S0.C1616y.f12405b;
        if (S0.C1616y.n(iQ, aVar.i())) {
            c1616yK = null;
        }
        return c1616yK != null ? c1616yK.q() : aVar.h();
    }

    public final int e() {
        S0.r rVarJ = S0.r.j(this.f4189d);
        int iP = rVarJ.p();
        S0.r.a aVar = S0.r.f12375b;
        if (S0.r.m(iP, aVar.i())) {
            rVarJ = null;
        }
        return rVarJ != null ? rVarJ.p() : aVar.a();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H.C1229v)) {
            return false;
        }
        H.C1229v c1229v = (H.C1229v) obj;
        if (!S0.C1615x.i(this.f4186a, c1229v.f4186a) || !p247y7.AbstractC7350t.b(this.f4187b, c1229v.f4187b) || !S0.C1616y.n(this.f4188c, c1229v.f4188c) || !S0.r.m(this.f4189d, c1229v.f4189d)) {
            return false;
        }
        c1229v.getClass();
        return p247y7.AbstractC7350t.b(null, null) && p247y7.AbstractC7350t.b(this.f4190e, c1229v.f4190e) && p247y7.AbstractC7350t.b(this.f4191f, c1229v.f4191f);
    }

    public final S0.C1610s g(boolean z6) {
        return new S0.C1610s(z6, c(), b(), f(), e(), null, d(), null);
    }

    public int hashCode() {
        int iJ = S0.C1615x.j(this.f4186a) * 31;
        java.lang.Boolean bool = this.f4187b;
        int iHashCode = (((((iJ + (bool != null ? bool.hashCode() : 0)) * 31) + S0.C1616y.o(this.f4188c)) * 31) + S0.r.n(this.f4189d)) * 961;
        java.lang.Boolean bool2 = this.f4190e;
        int iHashCode2 = (iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        T0.h hVar = this.f4191f;
        return iHashCode2 + (hVar != null ? hVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "KeyboardOptions(capitalization=" + ((java.lang.Object) S0.C1615x.k(this.f4186a)) + ", autoCorrectEnabled=" + this.f4187b + ", keyboardType=" + ((java.lang.Object) S0.C1616y.p(this.f4188c)) + ", imeAction=" + ((java.lang.Object) S0.r.o(this.f4189d)) + ", platformImeOptions=" + ((java.lang.Object) null) + "showKeyboardOnFocus=" + this.f4190e + ", hintLocales=" + this.f4191f + ')';
    }
}
