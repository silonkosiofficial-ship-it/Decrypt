package H;

/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private H.Y.a f3785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private H.Y.a f3786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.Long f3788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f3789f;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private H.Y.a f3790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private S0.V f3791b;

        public a(H.Y.a aVar, S0.V v6) {
            this.f3790a = aVar;
            this.f3791b = v6;
        }

        public final H.Y.a a() {
            return this.f3790a;
        }

        public final S0.V b() {
            return this.f3791b;
        }

        public final void c(H.Y.a aVar) {
            this.f3790a = aVar;
        }

        public final void d(S0.V v6) {
            this.f3791b = v6;
        }
    }

    public Y(int i6) {
        this.f3784a = i6;
    }

    public /* synthetic */ Y(int i6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this((i10 & 1) != 0 ? 100000 : i6);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    private final void d() {
        H.Y.a aVarA;
        H.Y.a aVarA2 = this.f3785b;
        if ((aVarA2 != null ? aVarA2.a() : null) == null) {
            return;
        }
        while (true) {
            if (aVarA2 == null) {
                aVarA = null;
            } else {
                H.Y.a aVarA3 = aVarA2.a();
                if (aVarA3 != null) {
                    aVarA = aVarA3.a();
                } else {
                    aVarA = null;
                }
            }
            if (aVarA == null) {
                break;
            } else {
                aVarA2 = aVarA2.a();
            }
        }
        if (aVarA2 == null) {
            return;
        }
        aVarA2.c(null);
    }

    public static /* synthetic */ void f(H.Y y6, S0.V v6, long j6, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            j6 = H.a0.a();
        }
        y6.e(v6, j6);
    }

    public final void a() {
        this.f3789f = true;
    }

    public final void b(S0.V v6) {
        S0.V vB;
        this.f3789f = false;
        H.Y.a aVar = this.f3785b;
        if (p247y7.AbstractC7350t.b(v6, aVar != null ? aVar.b() : null)) {
            return;
        }
        java.lang.String strI = v6.i();
        H.Y.a aVar2 = this.f3785b;
        if (p247y7.AbstractC7350t.b(strI, (aVar2 == null || (vB = aVar2.b()) == null) ? null : vB.i())) {
            H.Y.a aVar3 = this.f3785b;
            if (aVar3 == null) {
                return;
            }
            aVar3.d(v6);
            return;
        }
        this.f3785b = new H.Y.a(this.f3785b, v6);
        this.f3786c = null;
        int length = this.f3787d + v6.i().length();
        this.f3787d = length;
        if (length > this.f3784a) {
            d();
        }
    }

    public final S0.V c() {
        H.Y.a aVar = this.f3786c;
        if (aVar == null) {
            return null;
        }
        this.f3786c = aVar.a();
        this.f3785b = new H.Y.a(this.f3785b, aVar.b());
        this.f3787d += aVar.b().i().length();
        return aVar.b();
    }

    public final void e(S0.V v6, long j6) {
        if (!this.f3789f) {
            java.lang.Long l6 = this.f3788e;
            if (j6 <= (l6 != null ? l6.longValue() : 0L) + ((long) H.Z.a())) {
                return;
            }
        }
        this.f3788e = java.lang.Long.valueOf(j6);
        b(v6);
    }

    public final S0.V g() {
        H.Y.a aVarA;
        H.Y.a aVar = this.f3785b;
        if (aVar == null || (aVarA = aVar.a()) == null) {
            return null;
        }
        this.f3785b = aVarA;
        this.f3787d -= aVar.b().i().length();
        this.f3786c = new H.Y.a(this.f3786c, aVar.b());
        return aVarA.b();
    }
}
