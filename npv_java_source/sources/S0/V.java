package S0;

/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final S0.V.c f12287d = new S0.V.c(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p041e0.j f12288e = p041e0.k.a(S0.V.a.f12292D, S0.V.b.f12293D);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M0.C1332d f12289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f12290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final M0.N f12291c;

    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final S0.V.a f12292D = new S0.V.a();

        a() {
            super(2);
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(p041e0.l lVar, S0.V v6) {
            return p097j7.AbstractC6879v.g(M0.B.y(v6.f(), M0.B.h(), lVar), M0.B.y(M0.N.b(v6.h()), M0.B.j(M0.N.f6666b), lVar));
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final S0.V.b f12293D = new S0.V.b();

        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S0.V l(java.lang.Object obj) {
            p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            java.util.List list = (java.util.List) obj;
            java.lang.Object obj2 = list.get(0);
            p041e0.j jVarH = M0.B.h();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            M0.N n6 = null;
            M0.C1332d c1332d = ((!p247y7.AbstractC7350t.b(obj2, bool) || (jVarH instanceof M0.InterfaceC1342n)) && obj2 != null) ? (M0.C1332d) jVarH.a(obj2) : null;
            p247y7.AbstractC7350t.c(c1332d);
            java.lang.Object obj3 = list.get(1);
            p041e0.j jVarJ = M0.B.j(M0.N.f6666b);
            if ((!p247y7.AbstractC7350t.b(obj3, bool) || (jVarJ instanceof M0.InterfaceC1342n)) && obj3 != null) {
                n6 = (M0.N) jVarJ.a(obj3);
            }
            p247y7.AbstractC7350t.c(n6);
            return new S0.V(c1332d, n6.r(), (M0.N) null, 4, (p247y7.AbstractC7342k) null);
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p041e0.j a() {
            return S0.V.f12288e;
        }
    }

    private V(M0.C1332d c1332d, long j6, M0.N n6) {
        this.f12289a = c1332d;
        this.f12290b = M0.O.c(j6, 0, i().length());
        this.f12291c = n6 != null ? M0.N.b(M0.O.c(n6.r(), 0, i().length())) : null;
    }

    public /* synthetic */ V(M0.C1332d c1332d, long j6, M0.N n6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(c1332d, (i6 & 2) != 0 ? M0.N.f6666b.a() : j6, (i6 & 4) != 0 ? null : n6, (p247y7.AbstractC7342k) null);
    }

    public /* synthetic */ V(M0.C1332d c1332d, long j6, M0.N n6, p247y7.AbstractC7342k abstractC7342k) {
        this(c1332d, j6, n6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private V(java.lang.String str, long j6, M0.N n6) {
        p247y7.AbstractC7342k abstractC7342k = null;
        this(new M0.C1332d(str, null, null, 6, abstractC7342k), j6, n6, abstractC7342k);
    }

    public /* synthetic */ V(java.lang.String str, long j6, M0.N n6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? M0.N.f6666b.a() : j6, (i6 & 4) != 0 ? null : n6, (p247y7.AbstractC7342k) null);
    }

    public /* synthetic */ V(java.lang.String str, long j6, M0.N n6, p247y7.AbstractC7342k abstractC7342k) {
        this(str, j6, n6);
    }

    public static /* synthetic */ S0.V d(S0.V v6, M0.C1332d c1332d, long j6, M0.N n6, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            c1332d = v6.f12289a;
        }
        if ((i6 & 2) != 0) {
            j6 = v6.f12290b;
        }
        if ((i6 & 4) != 0) {
            n6 = v6.f12291c;
        }
        return v6.b(c1332d, j6, n6);
    }

    public static /* synthetic */ S0.V e(S0.V v6, java.lang.String str, long j6, M0.N n6, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            j6 = v6.f12290b;
        }
        if ((i6 & 4) != 0) {
            n6 = v6.f12291c;
        }
        return v6.c(str, j6, n6);
    }

    public final S0.V b(M0.C1332d c1332d, long j6, M0.N n6) {
        return new S0.V(c1332d, j6, n6, (p247y7.AbstractC7342k) null);
    }

    public final S0.V c(java.lang.String str, long j6, M0.N n6) {
        p247y7.AbstractC7342k abstractC7342k = null;
        return new S0.V(new M0.C1332d(str, null, null, 6, abstractC7342k), j6, n6, abstractC7342k);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S0.V)) {
            return false;
        }
        S0.V v6 = (S0.V) obj;
        return M0.N.g(this.f12290b, v6.f12290b) && p247y7.AbstractC7350t.b(this.f12291c, v6.f12291c) && p247y7.AbstractC7350t.b(this.f12289a, v6.f12289a);
    }

    public final M0.C1332d f() {
        return this.f12289a;
    }

    public final M0.N g() {
        return this.f12291c;
    }

    public final long h() {
        return this.f12290b;
    }

    public int hashCode() {
        int iHashCode = ((this.f12289a.hashCode() * 31) + M0.N.o(this.f12290b)) * 31;
        M0.N n6 = this.f12291c;
        return iHashCode + (n6 != null ? M0.N.o(n6.r()) : 0);
    }

    public final java.lang.String i() {
        return this.f12289a.i();
    }

    public java.lang.String toString() {
        return "TextFieldValue(text='" + ((java.lang.Object) this.f12289a) + "', selection=" + ((java.lang.Object) M0.N.q(this.f12290b)) + ", composition=" + this.f12291c + ')';
    }
}
