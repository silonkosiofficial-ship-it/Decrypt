package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C2049i implements androidx.datastore.preferences.protobuf.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.datastore.preferences.protobuf.AbstractC2048h f22046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22049d = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22050a;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.r0.b.values().length];
            f22050a = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.r0.b.f22121L.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f22050a[androidx.datastore.preferences.protobuf.r0.b.f22125P.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f22050a[androidx.datastore.preferences.protobuf.r0.b.f22114E.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f22050a[androidx.datastore.preferences.protobuf.r0.b.f22127R.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f22050a[androidx.datastore.preferences.protobuf.r0.b.f22120K.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f22050a[androidx.datastore.preferences.protobuf.r0.b.f22119J.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f22050a[androidx.datastore.preferences.protobuf.r0.b.f22115F.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                f22050a[androidx.datastore.preferences.protobuf.r0.b.f22118I.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                f22050a[androidx.datastore.preferences.protobuf.r0.b.f22116G.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                f22050a[androidx.datastore.preferences.protobuf.r0.b.f22124O.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                f22050a[androidx.datastore.preferences.protobuf.r0.b.f22128S.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                f22050a[androidx.datastore.preferences.protobuf.r0.b.f22129T.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                f22050a[androidx.datastore.preferences.protobuf.r0.b.f22130U.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                f22050a[androidx.datastore.preferences.protobuf.r0.b.f22131V.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                f22050a[androidx.datastore.preferences.protobuf.r0.b.f22122M.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                f22050a[androidx.datastore.preferences.protobuf.r0.b.f22126Q.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                f22050a[androidx.datastore.preferences.protobuf.r0.b.f22117H.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
        }
    }

    private C2049i(androidx.datastore.preferences.protobuf.AbstractC2048h abstractC2048h) {
        androidx.datastore.preferences.protobuf.AbstractC2048h abstractC2048h2 = (androidx.datastore.preferences.protobuf.AbstractC2048h) androidx.datastore.preferences.protobuf.AbstractC2064y.b(abstractC2048h, "input");
        this.f22046a = abstractC2048h2;
        abstractC2048h2.f22006d = this;
    }

    public static androidx.datastore.preferences.protobuf.C2049i Q(androidx.datastore.preferences.protobuf.AbstractC2048h abstractC2048h) {
        androidx.datastore.preferences.protobuf.C2049i c2049i = abstractC2048h.f22006d;
        return c2049i != null ? c2049i : new androidx.datastore.preferences.protobuf.C2049i(abstractC2048h);
    }

    private void R(java.lang.Object obj, androidx.datastore.preferences.protobuf.e0 e0Var, androidx.datastore.preferences.protobuf.C2055o c2055o) {
        int i6 = this.f22048c;
        this.f22048c = androidx.datastore.preferences.protobuf.r0.c(androidx.datastore.preferences.protobuf.r0.a(this.f22047b), 4);
        try {
            e0Var.b(obj, this, c2055o);
            if (this.f22047b != this.f22048c) {
                throw androidx.datastore.preferences.protobuf.C2065z.h();
            }
            this.f22048c = i6;
        } catch (java.lang.Throwable th) {
            this.f22048c = i6;
            throw th;
        }
    }

    private void S(java.lang.Object obj, androidx.datastore.preferences.protobuf.e0 e0Var, androidx.datastore.preferences.protobuf.C2055o c2055o) throws androidx.datastore.preferences.protobuf.C2065z {
        int iC = this.f22046a.C();
        androidx.datastore.preferences.protobuf.AbstractC2048h abstractC2048h = this.f22046a;
        if (abstractC2048h.f22003a >= abstractC2048h.f22004b) {
            throw androidx.datastore.preferences.protobuf.C2065z.i();
        }
        int iL = abstractC2048h.l(iC);
        this.f22046a.f22003a++;
        e0Var.b(obj, this, c2055o);
        this.f22046a.a(0);
        androidx.datastore.preferences.protobuf.AbstractC2048h abstractC2048h2 = this.f22046a;
        abstractC2048h2.f22003a--;
        abstractC2048h2.k(iL);
    }

    private java.lang.Object T(androidx.datastore.preferences.protobuf.r0.b bVar, java.lang.Class cls, androidx.datastore.preferences.protobuf.C2055o c2055o) {
        switch (androidx.datastore.preferences.protobuf.C2049i.a.f22050a[bVar.ordinal()]) {
            case 1:
                return java.lang.Boolean.valueOf(h());
            case 2:
                return D();
            case 3:
                return java.lang.Double.valueOf(l());
            case 4:
                return java.lang.Integer.valueOf(s());
            case 5:
                return java.lang.Integer.valueOf(g());
            case 6:
                return java.lang.Long.valueOf(c());
            case 7:
                return java.lang.Float.valueOf(I());
            case 8:
                return java.lang.Integer.valueOf(F());
            case 9:
                return java.lang.Long.valueOf(N());
            case 10:
                return W(cls, c2055o);
            case 11:
                return java.lang.Integer.valueOf(J());
            case 12:
                return java.lang.Long.valueOf(i());
            case 13:
                return java.lang.Integer.valueOf(w());
            case 14:
                return java.lang.Long.valueOf(x());
            case 15:
                return O();
            case 16:
                return java.lang.Integer.valueOf(k());
            case 17:
                return java.lang.Long.valueOf(b());
            default:
                throw new java.lang.IllegalArgumentException("unsupported field type.");
        }
    }

    private java.lang.Object U(androidx.datastore.preferences.protobuf.e0 e0Var, androidx.datastore.preferences.protobuf.C2055o c2055o) {
        java.lang.Object objH = e0Var.h();
        R(objH, e0Var, c2055o);
        e0Var.c(objH);
        return objH;
    }

    private java.lang.Object V(androidx.datastore.preferences.protobuf.e0 e0Var, androidx.datastore.preferences.protobuf.C2055o c2055o) throws androidx.datastore.preferences.protobuf.C2065z {
        java.lang.Object objH = e0Var.h();
        S(objH, e0Var, c2055o);
        e0Var.c(objH);
        return objH;
    }

    private void Y(int i6) throws androidx.datastore.preferences.protobuf.C2065z {
        if (this.f22046a.d() != i6) {
            throw androidx.datastore.preferences.protobuf.C2065z.m();
        }
    }

    private void Z(int i6) throws androidx.datastore.preferences.protobuf.C2065z.a {
        if (androidx.datastore.preferences.protobuf.r0.b(this.f22047b) != i6) {
            throw androidx.datastore.preferences.protobuf.C2065z.e();
        }
    }

    private void a0(int i6) throws androidx.datastore.preferences.protobuf.C2065z {
        if ((i6 & 3) != 0) {
            throw androidx.datastore.preferences.protobuf.C2065z.h();
        }
    }

    private void b0(int i6) throws androidx.datastore.preferences.protobuf.C2065z {
        if ((i6 & 7) != 0) {
            throw androidx.datastore.preferences.protobuf.C2065z.h();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int A() {
        int i6 = this.f22049d;
        if (i6 != 0) {
            this.f22047b = i6;
            this.f22049d = 0;
        } else {
            this.f22047b = this.f22046a.B();
        }
        int i10 = this.f22047b;
        if (i10 == 0 || i10 == this.f22048c) {
            return Integer.MAX_VALUE;
        }
        return androidx.datastore.preferences.protobuf.r0.a(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void B(java.util.List list) throws androidx.datastore.preferences.protobuf.C2065z.a {
        X(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void C(java.util.List list) throws androidx.datastore.preferences.protobuf.C2065z.a {
        X(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public androidx.datastore.preferences.protobuf.AbstractC2047g D() throws androidx.datastore.preferences.protobuf.C2065z.a {
        Z(2);
        return this.f22046a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void E(java.util.List list) throws androidx.datastore.preferences.protobuf.C2065z {
        int iB;
        if (list instanceof androidx.datastore.preferences.protobuf.AbstractC2060u) {
            androidx.appcompat.app.D.a(list);
            int iB2 = androidx.datastore.preferences.protobuf.r0.b(this.f22047b);
            if (iB2 != 2) {
                if (iB2 != 5) {
                    throw androidx.datastore.preferences.protobuf.C2065z.e();
                }
                this.f22046a.s();
                throw null;
            }
            a0(this.f22046a.C());
            this.f22046a.d();
            this.f22046a.s();
            throw null;
        }
        int iB3 = androidx.datastore.preferences.protobuf.r0.b(this.f22047b);
        if (iB3 == 2) {
            int iC = this.f22046a.C();
            a0(iC);
            int iD = this.f22046a.d() + iC;
            do {
                list.add(java.lang.Float.valueOf(this.f22046a.s()));
            } while (this.f22046a.d() < iD);
            return;
        }
        if (iB3 != 5) {
            throw androidx.datastore.preferences.protobuf.C2065z.e();
        }
        do {
            list.add(java.lang.Float.valueOf(this.f22046a.s()));
            if (this.f22046a.e()) {
                return;
            } else {
                iB = this.f22046a.B();
            }
        } while (iB == this.f22047b);
        this.f22049d = iB;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int F() throws androidx.datastore.preferences.protobuf.C2065z.a {
        Z(0);
        return this.f22046a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void G(java.util.List list, androidx.datastore.preferences.protobuf.e0 e0Var, androidx.datastore.preferences.protobuf.C2055o c2055o) throws androidx.datastore.preferences.protobuf.C2065z.a {
        int iB;
        if (androidx.datastore.preferences.protobuf.r0.b(this.f22047b) != 3) {
            throw androidx.datastore.preferences.protobuf.C2065z.e();
        }
        int i6 = this.f22047b;
        do {
            list.add(U(e0Var, c2055o));
            if (this.f22046a.e() || this.f22049d != 0) {
                return;
            } else {
                iB = this.f22046a.B();
            }
        } while (iB == i6);
        this.f22049d = iB;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public boolean H() {
        int i6;
        if (this.f22046a.e() || (i6 = this.f22047b) == this.f22048c) {
            return false;
        }
        return this.f22046a.E(i6);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public float I() throws androidx.datastore.preferences.protobuf.C2065z.a {
        Z(5);
        return this.f22046a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int J() throws androidx.datastore.preferences.protobuf.C2065z.a {
        Z(5);
        return this.f22046a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void K(java.util.List list) throws androidx.datastore.preferences.protobuf.C2065z.a {
        int iB;
        if (androidx.datastore.preferences.protobuf.r0.b(this.f22047b) != 2) {
            throw androidx.datastore.preferences.protobuf.C2065z.e();
        }
        do {
            list.add(D());
            if (this.f22046a.e()) {
                return;
            } else {
                iB = this.f22046a.B();
            }
        } while (iB == this.f22047b);
        this.f22049d = iB;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void L(java.util.List list) throws androidx.datastore.preferences.protobuf.C2065z {
        int iB;
        if (list instanceof androidx.datastore.preferences.protobuf.AbstractC2052l) {
            androidx.appcompat.app.D.a(list);
            int iB2 = androidx.datastore.preferences.protobuf.r0.b(this.f22047b);
            if (iB2 == 1) {
                this.f22046a.o();
                throw null;
            }
            if (iB2 != 2) {
                throw androidx.datastore.preferences.protobuf.C2065z.e();
            }
            b0(this.f22046a.C());
            this.f22046a.d();
            this.f22046a.o();
            throw null;
        }
        int iB3 = androidx.datastore.preferences.protobuf.r0.b(this.f22047b);
        if (iB3 == 1) {
            do {
                list.add(java.lang.Double.valueOf(this.f22046a.o()));
                if (this.f22046a.e()) {
                    return;
                } else {
                    iB = this.f22046a.B();
                }
            } while (iB == this.f22047b);
            this.f22049d = iB;
            return;
        }
        if (iB3 != 2) {
            throw androidx.datastore.preferences.protobuf.C2065z.e();
        }
        int iC = this.f22046a.C();
        b0(iC);
        int iD = this.f22046a.d() + iC;
        do {
            list.add(java.lang.Double.valueOf(this.f22046a.o()));
        } while (this.f22046a.d() < iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void M(java.util.List list, androidx.datastore.preferences.protobuf.e0 e0Var, androidx.datastore.preferences.protobuf.C2055o c2055o) throws androidx.datastore.preferences.protobuf.C2065z.a {
        int iB;
        if (androidx.datastore.preferences.protobuf.r0.b(this.f22047b) != 2) {
            throw androidx.datastore.preferences.protobuf.C2065z.e();
        }
        int i6 = this.f22047b;
        do {
            list.add(V(e0Var, c2055o));
            if (this.f22046a.e() || this.f22049d != 0) {
                return;
            } else {
                iB = this.f22046a.B();
            }
        } while (iB == i6);
        this.f22049d = iB;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public long N() throws androidx.datastore.preferences.protobuf.C2065z.a {
        Z(0);
        return this.f22046a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public java.lang.String O() throws androidx.datastore.preferences.protobuf.C2065z.a {
        Z(2);
        return this.f22046a.A();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void P(java.util.List list) throws androidx.datastore.preferences.protobuf.C2065z {
        int iB;
        if (list instanceof androidx.datastore.preferences.protobuf.F) {
            androidx.appcompat.app.D.a(list);
            int iB2 = androidx.datastore.preferences.protobuf.r0.b(this.f22047b);
            if (iB2 == 1) {
                this.f22046a.r();
                throw null;
            }
            if (iB2 != 2) {
                throw androidx.datastore.preferences.protobuf.C2065z.e();
            }
            b0(this.f22046a.C());
            this.f22046a.d();
            this.f22046a.r();
            throw null;
        }
        int iB3 = androidx.datastore.preferences.protobuf.r0.b(this.f22047b);
        if (iB3 == 1) {
            do {
                list.add(java.lang.Long.valueOf(this.f22046a.r()));
                if (this.f22046a.e()) {
                    return;
                } else {
                    iB = this.f22046a.B();
                }
            } while (iB == this.f22047b);
            this.f22049d = iB;
            return;
        }
        if (iB3 != 2) {
            throw androidx.datastore.preferences.protobuf.C2065z.e();
        }
        int iC = this.f22046a.C();
        b0(iC);
        int iD = this.f22046a.d() + iC;
        do {
            list.add(java.lang.Long.valueOf(this.f22046a.r()));
        } while (this.f22046a.d() < iD);
    }

    public java.lang.Object W(java.lang.Class cls, androidx.datastore.preferences.protobuf.C2055o c2055o) throws androidx.datastore.preferences.protobuf.C2065z.a {
        Z(2);
        return V(androidx.datastore.preferences.protobuf.a0.a().c(cls), c2055o);
    }

    public void X(java.util.List list, boolean z6) throws androidx.datastore.preferences.protobuf.C2065z.a {
        int iB;
        int iB2;
        if (androidx.datastore.preferences.protobuf.r0.b(this.f22047b) != 2) {
            throw androidx.datastore.preferences.protobuf.C2065z.e();
        }
        if (!(list instanceof androidx.datastore.preferences.protobuf.D) || z6) {
            do {
                list.add(z6 ? O() : z());
                if (this.f22046a.e()) {
                    return;
                } else {
                    iB = this.f22046a.B();
                }
            } while (iB == this.f22047b);
            this.f22049d = iB;
            return;
        }
        androidx.datastore.preferences.protobuf.D d6 = (androidx.datastore.preferences.protobuf.D) list;
        do {
            d6.x(D());
            if (this.f22046a.e()) {
                return;
            } else {
                iB2 = this.f22046a.B();
            }
        } while (iB2 == this.f22047b);
        this.f22049d = iB2;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void a(java.util.List list) throws androidx.datastore.preferences.protobuf.C2065z {
        int iB;
        if (list instanceof androidx.datastore.preferences.protobuf.AbstractC2063x) {
            androidx.appcompat.app.D.a(list);
            int iB2 = androidx.datastore.preferences.protobuf.r0.b(this.f22047b);
            if (iB2 == 0) {
                this.f22046a.x();
                throw null;
            }
            if (iB2 != 2) {
                throw androidx.datastore.preferences.protobuf.C2065z.e();
            }
            this.f22046a.C();
            this.f22046a.d();
            this.f22046a.x();
            throw null;
        }
        int iB3 = androidx.datastore.preferences.protobuf.r0.b(this.f22047b);
        if (iB3 == 0) {
            do {
                list.add(java.lang.Integer.valueOf(this.f22046a.x()));
                if (this.f22046a.e()) {
                    return;
                } else {
                    iB = this.f22046a.B();
                }
            } while (iB == this.f22047b);
            this.f22049d = iB;
            return;
        }
        if (iB3 != 2) {
            throw androidx.datastore.preferences.protobuf.C2065z.e();
        }
        int iD = this.f22046a.d() + this.f22046a.C();
        do {
            list.add(java.lang.Integer.valueOf(this.f22046a.x()));
        } while (this.f22046a.d() < iD);
        Y(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public long b() throws androidx.datastore.preferences.protobuf.C2065z.a {
        Z(0);
        return this.f22046a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public long c() throws androidx.datastore.preferences.protobuf.C2065z.a {
        Z(1);
        return this.f22046a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void d(java.util.List list) throws androidx.datastore.preferences.protobuf.C2065z {
        int iB;
        if (list instanceof androidx.datastore.preferences.protobuf.AbstractC2063x) {
            androidx.appcompat.app.D.a(list);
            int iB2 = androidx.datastore.preferences.protobuf.r0.b(this.f22047b);
            if (iB2 != 2) {
                if (iB2 != 5) {
                    throw androidx.datastore.preferences.protobuf.C2065z.e();
                }
                this.f22046a.v();
                throw null;
            }
            a0(this.f22046a.C());
            this.f22046a.d();
            this.f22046a.v();
            throw null;
        }
        int iB3 = androidx.datastore.preferences.protobuf.r0.b(this.f22047b);
        if (iB3 == 2) {
            int iC = this.f22046a.C();
            a0(iC);
            int iD = this.f22046a.d() + iC;
            do {
                list.add(java.lang.Integer.valueOf(this.f22046a.v()));
            } while (this.f22046a.d() < iD);
            return;
        }
        if (iB3 != 5) {
            throw androidx.datastore.preferences.protobuf.C2065z.e();
        }
        do {
            list.add(java.lang.Integer.valueOf(this.f22046a.v()));
            if (this.f22046a.e()) {
                return;
            } else {
                iB = this.f22046a.B();
            }
        } while (iB == this.f22047b);
        this.f22049d = iB;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void e(java.util.List list) throws androidx.datastore.preferences.protobuf.C2065z {
        int iB;
        if (list instanceof androidx.datastore.preferences.protobuf.F) {
            androidx.appcompat.app.D.a(list);
            int iB2 = androidx.datastore.preferences.protobuf.r0.b(this.f22047b);
            if (iB2 == 0) {
                this.f22046a.y();
                throw null;
            }
            if (iB2 != 2) {
                throw androidx.datastore.preferences.protobuf.C2065z.e();
            }
            this.f22046a.C();
            this.f22046a.d();
            this.f22046a.y();
            throw null;
        }
        int iB3 = androidx.datastore.preferences.protobuf.r0.b(this.f22047b);
        if (iB3 == 0) {
            do {
                list.add(java.lang.Long.valueOf(this.f22046a.y()));
                if (this.f22046a.e()) {
                    return;
                } else {
                    iB = this.f22046a.B();
                }
            } while (iB == this.f22047b);
            this.f22049d = iB;
            return;
        }
        if (iB3 != 2) {
            throw androidx.datastore.preferences.protobuf.C2065z.e();
        }
        int iD = this.f22046a.d() + this.f22046a.C();
        do {
            list.add(java.lang.Long.valueOf(this.f22046a.y()));
        } while (this.f22046a.d() < iD);
        Y(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void f(java.util.List list) throws androidx.datastore.preferences.protobuf.C2065z {
        int iB;
        if (list instanceof androidx.datastore.preferences.protobuf.AbstractC2063x) {
            androidx.appcompat.app.D.a(list);
            int iB2 = androidx.datastore.preferences.protobuf.r0.b(this.f22047b);
            if (iB2 == 0) {
                this.f22046a.C();
                throw null;
            }
            if (iB2 != 2) {
                throw androidx.datastore.preferences.protobuf.C2065z.e();
            }
            this.f22046a.C();
            this.f22046a.d();
            this.f22046a.C();
            throw null;
        }
        int iB3 = androidx.datastore.preferences.protobuf.r0.b(this.f22047b);
        if (iB3 == 0) {
            do {
                list.add(java.lang.Integer.valueOf(this.f22046a.C()));
                if (this.f22046a.e()) {
                    return;
                } else {
                    iB = this.f22046a.B();
                }
            } while (iB == this.f22047b);
            this.f22049d = iB;
            return;
        }
        if (iB3 != 2) {
            throw androidx.datastore.preferences.protobuf.C2065z.e();
        }
        int iD = this.f22046a.d() + this.f22046a.C();
        do {
            list.add(java.lang.Integer.valueOf(this.f22046a.C()));
        } while (this.f22046a.d() < iD);
        Y(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int g() throws androidx.datastore.preferences.protobuf.C2065z.a {
        Z(5);
        return this.f22046a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public boolean h() throws androidx.datastore.preferences.protobuf.C2065z.a {
        Z(0);
        return this.f22046a.m();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public long i() throws androidx.datastore.preferences.protobuf.C2065z.a {
        Z(1);
        return this.f22046a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void j(java.util.List list) throws androidx.datastore.preferences.protobuf.C2065z {
        int iB;
        if (list instanceof androidx.datastore.preferences.protobuf.F) {
            androidx.appcompat.app.D.a(list);
            int iB2 = androidx.datastore.preferences.protobuf.r0.b(this.f22047b);
            if (iB2 == 0) {
                this.f22046a.D();
                throw null;
            }
            if (iB2 != 2) {
                throw androidx.datastore.preferences.protobuf.C2065z.e();
            }
            this.f22046a.C();
            this.f22046a.d();
            this.f22046a.D();
            throw null;
        }
        int iB3 = androidx.datastore.preferences.protobuf.r0.b(this.f22047b);
        if (iB3 == 0) {
            do {
                list.add(java.lang.Long.valueOf(this.f22046a.D()));
                if (this.f22046a.e()) {
                    return;
                } else {
                    iB = this.f22046a.B();
                }
            } while (iB == this.f22047b);
            this.f22049d = iB;
            return;
        }
        if (iB3 != 2) {
            throw androidx.datastore.preferences.protobuf.C2065z.e();
        }
        int iD = this.f22046a.d() + this.f22046a.C();
        do {
            list.add(java.lang.Long.valueOf(this.f22046a.D()));
        } while (this.f22046a.d() < iD);
        Y(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int k() throws androidx.datastore.preferences.protobuf.C2065z.a {
        Z(0);
        return this.f22046a.C();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public double l() throws androidx.datastore.preferences.protobuf.C2065z.a {
        Z(1);
        return this.f22046a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void m(java.util.List list) throws androidx.datastore.preferences.protobuf.C2065z {
        int iB;
        if (list instanceof androidx.datastore.preferences.protobuf.F) {
            androidx.appcompat.app.D.a(list);
            int iB2 = androidx.datastore.preferences.protobuf.r0.b(this.f22047b);
            if (iB2 == 0) {
                this.f22046a.u();
                throw null;
            }
            if (iB2 != 2) {
                throw androidx.datastore.preferences.protobuf.C2065z.e();
            }
            this.f22046a.C();
            this.f22046a.d();
            this.f22046a.u();
            throw null;
        }
        int iB3 = androidx.datastore.preferences.protobuf.r0.b(this.f22047b);
        if (iB3 == 0) {
            do {
                list.add(java.lang.Long.valueOf(this.f22046a.u()));
                if (this.f22046a.e()) {
                    return;
                } else {
                    iB = this.f22046a.B();
                }
            } while (iB == this.f22047b);
            this.f22049d = iB;
            return;
        }
        if (iB3 != 2) {
            throw androidx.datastore.preferences.protobuf.C2065z.e();
        }
        int iD = this.f22046a.d() + this.f22046a.C();
        do {
            list.add(java.lang.Long.valueOf(this.f22046a.u()));
        } while (this.f22046a.d() < iD);
        Y(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void n(java.util.List list) throws androidx.datastore.preferences.protobuf.C2065z {
        int iB;
        if (list instanceof androidx.datastore.preferences.protobuf.F) {
            androidx.appcompat.app.D.a(list);
            int iB2 = androidx.datastore.preferences.protobuf.r0.b(this.f22047b);
            if (iB2 == 1) {
                this.f22046a.w();
                throw null;
            }
            if (iB2 != 2) {
                throw androidx.datastore.preferences.protobuf.C2065z.e();
            }
            b0(this.f22046a.C());
            this.f22046a.d();
            this.f22046a.w();
            throw null;
        }
        int iB3 = androidx.datastore.preferences.protobuf.r0.b(this.f22047b);
        if (iB3 == 1) {
            do {
                list.add(java.lang.Long.valueOf(this.f22046a.w()));
                if (this.f22046a.e()) {
                    return;
                } else {
                    iB = this.f22046a.B();
                }
            } while (iB == this.f22047b);
            this.f22049d = iB;
            return;
        }
        if (iB3 != 2) {
            throw androidx.datastore.preferences.protobuf.C2065z.e();
        }
        int iC = this.f22046a.C();
        b0(iC);
        int iD = this.f22046a.d() + iC;
        do {
            list.add(java.lang.Long.valueOf(this.f22046a.w()));
        } while (this.f22046a.d() < iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void o(java.lang.Object obj, androidx.datastore.preferences.protobuf.e0 e0Var, androidx.datastore.preferences.protobuf.C2055o c2055o) throws androidx.datastore.preferences.protobuf.C2065z {
        Z(2);
        S(obj, e0Var, c2055o);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void p(java.util.List list) throws androidx.datastore.preferences.protobuf.C2065z {
        int iB;
        if (list instanceof androidx.datastore.preferences.protobuf.AbstractC2063x) {
            androidx.appcompat.app.D.a(list);
            int iB2 = androidx.datastore.preferences.protobuf.r0.b(this.f22047b);
            if (iB2 == 0) {
                this.f22046a.t();
                throw null;
            }
            if (iB2 != 2) {
                throw androidx.datastore.preferences.protobuf.C2065z.e();
            }
            this.f22046a.C();
            this.f22046a.d();
            this.f22046a.t();
            throw null;
        }
        int iB3 = androidx.datastore.preferences.protobuf.r0.b(this.f22047b);
        if (iB3 == 0) {
            do {
                list.add(java.lang.Integer.valueOf(this.f22046a.t()));
                if (this.f22046a.e()) {
                    return;
                } else {
                    iB = this.f22046a.B();
                }
            } while (iB == this.f22047b);
            this.f22049d = iB;
            return;
        }
        if (iB3 != 2) {
            throw androidx.datastore.preferences.protobuf.C2065z.e();
        }
        int iD = this.f22046a.d() + this.f22046a.C();
        do {
            list.add(java.lang.Integer.valueOf(this.f22046a.t()));
        } while (this.f22046a.d() < iD);
        Y(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void q(java.util.List list) throws androidx.datastore.preferences.protobuf.C2065z {
        int iB;
        if (list instanceof androidx.datastore.preferences.protobuf.AbstractC2063x) {
            androidx.appcompat.app.D.a(list);
            int iB2 = androidx.datastore.preferences.protobuf.r0.b(this.f22047b);
            if (iB2 == 0) {
                this.f22046a.p();
                throw null;
            }
            if (iB2 != 2) {
                throw androidx.datastore.preferences.protobuf.C2065z.e();
            }
            this.f22046a.C();
            this.f22046a.d();
            this.f22046a.p();
            throw null;
        }
        int iB3 = androidx.datastore.preferences.protobuf.r0.b(this.f22047b);
        if (iB3 == 0) {
            do {
                list.add(java.lang.Integer.valueOf(this.f22046a.p()));
                if (this.f22046a.e()) {
                    return;
                } else {
                    iB = this.f22046a.B();
                }
            } while (iB == this.f22047b);
            this.f22049d = iB;
            return;
        }
        if (iB3 != 2) {
            throw androidx.datastore.preferences.protobuf.C2065z.e();
        }
        int iD = this.f22046a.d() + this.f22046a.C();
        do {
            list.add(java.lang.Integer.valueOf(this.f22046a.p()));
        } while (this.f22046a.d() < iD);
        Y(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void r(java.util.Map map, androidx.datastore.preferences.protobuf.H.a aVar, androidx.datastore.preferences.protobuf.C2055o c2055o) throws androidx.datastore.preferences.protobuf.C2065z.a {
        Z(2);
        int iL = this.f22046a.l(this.f22046a.C());
        java.lang.Object objT = aVar.f21937b;
        java.lang.Object objT2 = aVar.f21939d;
        while (true) {
            try {
                int iA = A();
                if (iA == Integer.MAX_VALUE || this.f22046a.e()) {
                    break;
                }
                if (iA == 1) {
                    objT = T(aVar.f21936a, null, null);
                } else if (iA != 2) {
                    try {
                        if (!H()) {
                            throw new androidx.datastore.preferences.protobuf.C2065z("Unable to parse map entry.");
                        }
                    } catch (androidx.datastore.preferences.protobuf.C2065z.a unused) {
                        if (!H()) {
                            throw new androidx.datastore.preferences.protobuf.C2065z("Unable to parse map entry.");
                        }
                    }
                } else {
                    objT2 = T(aVar.f21938c, aVar.f21939d.getClass(), c2055o);
                }
            } catch (java.lang.Throwable th) {
                this.f22046a.k(iL);
                throw th;
            }
        }
        map.put(objT, objT2);
        this.f22046a.k(iL);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int s() throws androidx.datastore.preferences.protobuf.C2065z.a {
        Z(0);
        return this.f22046a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void t(java.lang.Object obj, androidx.datastore.preferences.protobuf.e0 e0Var, androidx.datastore.preferences.protobuf.C2055o c2055o) throws androidx.datastore.preferences.protobuf.C2065z.a {
        Z(3);
        R(obj, e0Var, c2055o);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int u() {
        return this.f22047b;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void v(java.util.List list) throws androidx.datastore.preferences.protobuf.C2065z {
        int iB;
        if (list instanceof androidx.datastore.preferences.protobuf.AbstractC2063x) {
            androidx.appcompat.app.D.a(list);
            int iB2 = androidx.datastore.preferences.protobuf.r0.b(this.f22047b);
            if (iB2 != 2) {
                if (iB2 != 5) {
                    throw androidx.datastore.preferences.protobuf.C2065z.e();
                }
                this.f22046a.q();
                throw null;
            }
            a0(this.f22046a.C());
            this.f22046a.d();
            this.f22046a.q();
            throw null;
        }
        int iB3 = androidx.datastore.preferences.protobuf.r0.b(this.f22047b);
        if (iB3 == 2) {
            int iC = this.f22046a.C();
            a0(iC);
            int iD = this.f22046a.d() + iC;
            do {
                list.add(java.lang.Integer.valueOf(this.f22046a.q()));
            } while (this.f22046a.d() < iD);
            return;
        }
        if (iB3 != 5) {
            throw androidx.datastore.preferences.protobuf.C2065z.e();
        }
        do {
            list.add(java.lang.Integer.valueOf(this.f22046a.q()));
            if (this.f22046a.e()) {
                return;
            } else {
                iB = this.f22046a.B();
            }
        } while (iB == this.f22047b);
        this.f22049d = iB;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int w() throws androidx.datastore.preferences.protobuf.C2065z.a {
        Z(0);
        return this.f22046a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public long x() throws androidx.datastore.preferences.protobuf.C2065z.a {
        Z(0);
        return this.f22046a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void y(java.util.List list) throws androidx.datastore.preferences.protobuf.C2065z {
        int iB;
        if (list instanceof androidx.datastore.preferences.protobuf.AbstractC2045e) {
            androidx.appcompat.app.D.a(list);
            int iB2 = androidx.datastore.preferences.protobuf.r0.b(this.f22047b);
            if (iB2 == 0) {
                this.f22046a.m();
                throw null;
            }
            if (iB2 != 2) {
                throw androidx.datastore.preferences.protobuf.C2065z.e();
            }
            this.f22046a.C();
            this.f22046a.d();
            this.f22046a.m();
            throw null;
        }
        int iB3 = androidx.datastore.preferences.protobuf.r0.b(this.f22047b);
        if (iB3 == 0) {
            do {
                list.add(java.lang.Boolean.valueOf(this.f22046a.m()));
                if (this.f22046a.e()) {
                    return;
                } else {
                    iB = this.f22046a.B();
                }
            } while (iB == this.f22047b);
            this.f22049d = iB;
            return;
        }
        if (iB3 != 2) {
            throw androidx.datastore.preferences.protobuf.C2065z.e();
        }
        int iD = this.f22046a.d() + this.f22046a.C();
        do {
            list.add(java.lang.Boolean.valueOf(this.f22046a.m()));
        } while (this.f22046a.d() < iD);
        Y(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public java.lang.String z() throws androidx.datastore.preferences.protobuf.C2065z.a {
        Z(2);
        return this.f22046a.z();
    }
}
