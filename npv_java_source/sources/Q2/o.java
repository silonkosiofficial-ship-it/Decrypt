package Q2;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Q2.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p143o2.n f8794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p143o2.g f8795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p143o2.w f8796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p143o2.w f8797d;

    class a extends p143o2.g {
        a(p143o2.n nVar) {
            super(nVar);
        }

        @Override // p143o2.w
        public java.lang.String e() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // p143o2.g
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(p253z2.h hVar, Q2.m mVar) throws java.lang.Throwable {
            java.lang.String str = mVar.f8792a;
            if (str == null) {
                hVar.M0(1);
            } else {
                hVar.C(1, str);
            }
            byte[] bArrK = androidx.work.b.k(mVar.f8793b);
            if (bArrK == null) {
                hVar.M0(2);
            } else {
                hVar.p0(2, bArrK);
            }
        }
    }

    class b extends p143o2.w {
        b(p143o2.n nVar) {
            super(nVar);
        }

        @Override // p143o2.w
        public java.lang.String e() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    class c extends p143o2.w {
        c(p143o2.n nVar) {
            super(nVar);
        }

        @Override // p143o2.w
        public java.lang.String e() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(p143o2.n nVar) {
        this.f8794a = nVar;
        this.f8795b = new Q2.o.a(nVar);
        this.f8796c = new Q2.o.b(nVar);
        this.f8797d = new Q2.o.c(nVar);
    }

    @Override // Q2.n
    public void a(java.lang.String str) {
        this.f8794a.f();
        p253z2.h hVarB = this.f8796c.b();
        if (str == null) {
            hVarB.M0(1);
        } else {
            hVarB.C(1, str);
        }
        this.f8794a.g();
        try {
            hVarB.I();
            this.f8794a.N();
        } finally {
            this.f8794a.n();
            this.f8796c.h(hVarB);
        }
    }

    @Override // Q2.n
    public void b(Q2.m mVar) {
        this.f8794a.f();
        this.f8794a.g();
        try {
            this.f8795b.j(mVar);
            this.f8794a.N();
        } finally {
            this.f8794a.n();
        }
    }

    @Override // Q2.n
    public void c() {
        this.f8794a.f();
        p253z2.h hVarB = this.f8797d.b();
        this.f8794a.g();
        try {
            hVarB.I();
            this.f8794a.N();
        } finally {
            this.f8794a.n();
            this.f8797d.h(hVarB);
        }
    }
}
