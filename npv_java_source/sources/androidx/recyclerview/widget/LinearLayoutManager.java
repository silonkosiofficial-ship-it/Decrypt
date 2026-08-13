package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends androidx.recyclerview.widget.RecyclerView.p implements androidx.recyclerview.widget.RecyclerView.z.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    int f22980A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    int f22981B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f22982C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    androidx.recyclerview.widget.LinearLayoutManager.d f22983D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final androidx.recyclerview.widget.LinearLayoutManager.a f22984E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final androidx.recyclerview.widget.LinearLayoutManager.b f22985F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f22986G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int[] f22987H;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f22988s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private androidx.recyclerview.widget.LinearLayoutManager.c f22989t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    androidx.recyclerview.widget.i f22990u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f22991v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f22992w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    boolean f22993x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f22994y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f22995z;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.recyclerview.widget.i f22996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f22997b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f22998c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f22999d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f23000e;

        a() {
            e();
        }

        void a() {
            this.f22998c = this.f22999d ? this.f22996a.i() : this.f22996a.m();
        }

        public void b(android.view.View view, int i6) {
            this.f22998c = this.f22999d ? this.f22996a.d(view) + this.f22996a.o() : this.f22996a.g(view);
            this.f22997b = i6;
        }

        public void c(android.view.View view, int i6) {
            int iO = this.f22996a.o();
            if (iO >= 0) {
                b(view, i6);
                return;
            }
            this.f22997b = i6;
            if (this.f22999d) {
                int i10 = (this.f22996a.i() - iO) - this.f22996a.d(view);
                this.f22998c = this.f22996a.i() - i10;
                if (i10 > 0) {
                    int iE = this.f22998c - this.f22996a.e(view);
                    int iM = this.f22996a.m();
                    int iMin = iE - (iM + java.lang.Math.min(this.f22996a.g(view) - iM, 0));
                    if (iMin < 0) {
                        this.f22998c += java.lang.Math.min(i10, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG = this.f22996a.g(view);
            int iM2 = iG - this.f22996a.m();
            this.f22998c = iG;
            if (iM2 > 0) {
                int i11 = (this.f22996a.i() - java.lang.Math.min(0, (this.f22996a.i() - iO) - this.f22996a.d(view))) - (iG + this.f22996a.e(view));
                if (i11 < 0) {
                    this.f22998c -= java.lang.Math.min(iM2, -i11);
                }
            }
        }

        boolean d(android.view.View view, androidx.recyclerview.widget.RecyclerView.A a6) {
            androidx.recyclerview.widget.RecyclerView.q qVar = (androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams();
            return !qVar.c() && qVar.a() >= 0 && qVar.a() < a6.b();
        }

        void e() {
            this.f22997b = -1;
            this.f22998c = Integer.MIN_VALUE;
            this.f22999d = false;
            this.f23000e = false;
        }

        public java.lang.String toString() {
            return "AnchorInfo{mPosition=" + this.f22997b + ", mCoordinate=" + this.f22998c + ", mLayoutFromEnd=" + this.f22999d + ", mValid=" + this.f23000e + '}';
        }
    }

    protected static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f23002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f23003c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f23004d;

        protected b() {
        }

        void a() {
            this.f23001a = 0;
            this.f23002b = false;
            this.f23003c = false;
            this.f23004d = false;
        }
    }

    static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f23007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f23008d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23009e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f23010f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f23011g;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f23015k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f23017m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f23005a = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f23012h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f23013i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f23014j = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        java.util.List f23016l = null;

        c() {
        }

        private android.view.View e() {
            int size = this.f23016l.size();
            for (int i6 = 0; i6 < size; i6++) {
                android.view.View view = ((androidx.recyclerview.widget.RecyclerView.D) this.f23016l.get(i6)).f23130a;
                androidx.recyclerview.widget.RecyclerView.q qVar = (androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams();
                if (!qVar.c() && this.f23008d == qVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(android.view.View view) {
            android.view.View viewF = f(view);
            this.f23008d = viewF == null ? -1 : ((androidx.recyclerview.widget.RecyclerView.q) viewF.getLayoutParams()).a();
        }

        boolean c(androidx.recyclerview.widget.RecyclerView.A a6) {
            int i6 = this.f23008d;
            return i6 >= 0 && i6 < a6.b();
        }

        android.view.View d(androidx.recyclerview.widget.RecyclerView.v vVar) {
            if (this.f23016l != null) {
                return e();
            }
            android.view.View viewO = vVar.o(this.f23008d);
            this.f23008d += this.f23009e;
            return viewO;
        }

        public android.view.View f(android.view.View view) {
            int iA;
            int size = this.f23016l.size();
            android.view.View view2 = null;
            int i6 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < size; i10++) {
                android.view.View view3 = ((androidx.recyclerview.widget.RecyclerView.D) this.f23016l.get(i10)).f23130a;
                androidx.recyclerview.widget.RecyclerView.q qVar = (androidx.recyclerview.widget.RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.c() && (iA = (qVar.a() - this.f23008d) * this.f23009e) >= 0 && iA < i6) {
                    view2 = view3;
                    if (iA == 0) {
                        break;
                    }
                    i6 = iA;
                }
            }
            return view2;
        }
    }

    public static class d implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.LinearLayoutManager.d> CREATOR = new androidx.recyclerview.widget.LinearLayoutManager.d.a();

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        int f23018C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        int f23019D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        boolean f23020E;

        class a implements android.os.Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public androidx.recyclerview.widget.LinearLayoutManager.d createFromParcel(android.os.Parcel parcel) {
                return new androidx.recyclerview.widget.LinearLayoutManager.d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public androidx.recyclerview.widget.LinearLayoutManager.d[] newArray(int i6) {
                return new androidx.recyclerview.widget.LinearLayoutManager.d[i6];
            }
        }

        public d() {
        }

        d(android.os.Parcel parcel) {
            this.f23018C = parcel.readInt();
            this.f23019D = parcel.readInt();
            this.f23020E = parcel.readInt() == 1;
        }

        public d(androidx.recyclerview.widget.LinearLayoutManager.d dVar) {
            this.f23018C = dVar.f23018C;
            this.f23019D = dVar.f23019D;
            this.f23020E = dVar.f23020E;
        }

        boolean a() {
            return this.f23018C >= 0;
        }

        void b() {
            this.f23018C = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i6) {
            parcel.writeInt(this.f23018C);
            parcel.writeInt(this.f23019D);
            parcel.writeInt(this.f23020E ? 1 : 0);
        }
    }

    public LinearLayoutManager(android.content.Context context, int i6, boolean z6) {
        this.f22988s = 1;
        this.f22992w = false;
        this.f22993x = false;
        this.f22994y = false;
        this.f22995z = true;
        this.f22980A = -1;
        this.f22981B = Integer.MIN_VALUE;
        this.f22983D = null;
        this.f22984E = new androidx.recyclerview.widget.LinearLayoutManager.a();
        this.f22985F = new androidx.recyclerview.widget.LinearLayoutManager.b();
        this.f22986G = 2;
        this.f22987H = new int[2];
        C2(i6);
        D2(z6);
    }

    public LinearLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i6, int i10) {
        this.f22988s = 1;
        this.f22992w = false;
        this.f22993x = false;
        this.f22994y = false;
        this.f22995z = true;
        this.f22980A = -1;
        this.f22981B = Integer.MIN_VALUE;
        this.f22983D = null;
        this.f22984E = new androidx.recyclerview.widget.LinearLayoutManager.a();
        this.f22985F = new androidx.recyclerview.widget.LinearLayoutManager.b();
        this.f22986G = 2;
        this.f22987H = new int[2];
        androidx.recyclerview.widget.RecyclerView.p.d dVarM0 = androidx.recyclerview.widget.RecyclerView.p.m0(context, attributeSet, i6, i10);
        C2(dVarM0.f23193a);
        D2(dVarM0.f23195c);
        E2(dVarM0.f23196d);
    }

    private void A2() {
        this.f22993x = (this.f22988s == 1 || !q2()) ? this.f22992w : !this.f22992w;
    }

    private boolean F2(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6, androidx.recyclerview.widget.LinearLayoutManager.a aVar) {
        android.view.View viewJ2;
        boolean z6 = false;
        if (O() == 0) {
            return false;
        }
        android.view.View viewA0 = a0();
        if (viewA0 != null && aVar.d(viewA0, a6)) {
            aVar.c(viewA0, l0(viewA0));
            return true;
        }
        boolean z10 = this.f22991v;
        boolean z11 = this.f22994y;
        if (z10 != z11 || (viewJ2 = j2(vVar, a6, aVar.f22999d, z11)) == null) {
            return false;
        }
        aVar.b(viewJ2, l0(viewJ2));
        if (!a6.e() && P1()) {
            int iG = this.f22990u.g(viewJ2);
            int iD = this.f22990u.d(viewJ2);
            int iM = this.f22990u.m();
            int i6 = this.f22990u.i();
            boolean z12 = iD <= iM && iG < iM;
            if (iG >= i6 && iD > i6) {
                z6 = true;
            }
            if (z12 || z6) {
                if (aVar.f22999d) {
                    iM = i6;
                }
                aVar.f22998c = iM;
            }
        }
        return true;
    }

    private boolean G2(androidx.recyclerview.widget.RecyclerView.A a6, androidx.recyclerview.widget.LinearLayoutManager.a aVar) {
        int i6;
        if (!a6.e() && (i6 = this.f22980A) != -1) {
            if (i6 >= 0 && i6 < a6.b()) {
                aVar.f22997b = this.f22980A;
                androidx.recyclerview.widget.LinearLayoutManager.d dVar = this.f22983D;
                if (dVar != null && dVar.a()) {
                    boolean z6 = this.f22983D.f23020E;
                    aVar.f22999d = z6;
                    aVar.f22998c = z6 ? this.f22990u.i() - this.f22983D.f23019D : this.f22990u.m() + this.f22983D.f23019D;
                    return true;
                }
                if (this.f22981B != Integer.MIN_VALUE) {
                    boolean z10 = this.f22993x;
                    aVar.f22999d = z10;
                    aVar.f22998c = z10 ? this.f22990u.i() - this.f22981B : this.f22990u.m() + this.f22981B;
                    return true;
                }
                android.view.View viewH = H(this.f22980A);
                if (viewH == null) {
                    if (O() > 0) {
                        aVar.f22999d = (this.f22980A < l0(N(0))) == this.f22993x;
                    }
                    aVar.a();
                } else {
                    if (this.f22990u.e(viewH) > this.f22990u.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.f22990u.g(viewH) - this.f22990u.m() < 0) {
                        aVar.f22998c = this.f22990u.m();
                        aVar.f22999d = false;
                        return true;
                    }
                    if (this.f22990u.i() - this.f22990u.d(viewH) < 0) {
                        aVar.f22998c = this.f22990u.i();
                        aVar.f22999d = true;
                        return true;
                    }
                    aVar.f22998c = aVar.f22999d ? this.f22990u.d(viewH) + this.f22990u.o() : this.f22990u.g(viewH);
                }
                return true;
            }
            this.f22980A = -1;
            this.f22981B = Integer.MIN_VALUE;
        }
        return false;
    }

    private void H2(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6, androidx.recyclerview.widget.LinearLayoutManager.a aVar) {
        if (G2(a6, aVar) || F2(vVar, a6, aVar)) {
            return;
        }
        aVar.a();
        aVar.f22997b = this.f22994y ? a6.b() - 1 : 0;
    }

    private void I2(int i6, int i10, boolean z6, androidx.recyclerview.widget.RecyclerView.A a6) {
        int iM;
        this.f22989t.f23017m = z2();
        this.f22989t.f23010f = i6;
        int[] iArr = this.f22987H;
        iArr[0] = 0;
        iArr[1] = 0;
        Q1(a6, iArr);
        int iMax = java.lang.Math.max(0, this.f22987H[0]);
        int iMax2 = java.lang.Math.max(0, this.f22987H[1]);
        boolean z10 = i6 == 1;
        androidx.recyclerview.widget.LinearLayoutManager.c cVar = this.f22989t;
        int i11 = z10 ? iMax2 : iMax;
        cVar.f23012h = i11;
        if (!z10) {
            iMax = iMax2;
        }
        cVar.f23013i = iMax;
        if (z10) {
            cVar.f23012h = i11 + this.f22990u.j();
            android.view.View viewM2 = m2();
            androidx.recyclerview.widget.LinearLayoutManager.c cVar2 = this.f22989t;
            cVar2.f23009e = this.f22993x ? -1 : 1;
            int iL0 = l0(viewM2);
            androidx.recyclerview.widget.LinearLayoutManager.c cVar3 = this.f22989t;
            cVar2.f23008d = iL0 + cVar3.f23009e;
            cVar3.f23006b = this.f22990u.d(viewM2);
            iM = this.f22990u.d(viewM2) - this.f22990u.i();
        } else {
            android.view.View viewN2 = n2();
            this.f22989t.f23012h += this.f22990u.m();
            androidx.recyclerview.widget.LinearLayoutManager.c cVar4 = this.f22989t;
            cVar4.f23009e = this.f22993x ? 1 : -1;
            int iL1 = l0(viewN2);
            androidx.recyclerview.widget.LinearLayoutManager.c cVar5 = this.f22989t;
            cVar4.f23008d = iL1 + cVar5.f23009e;
            cVar5.f23006b = this.f22990u.g(viewN2);
            iM = (-this.f22990u.g(viewN2)) + this.f22990u.m();
        }
        androidx.recyclerview.widget.LinearLayoutManager.c cVar6 = this.f22989t;
        cVar6.f23007c = i10;
        if (z6) {
            cVar6.f23007c = i10 - iM;
        }
        cVar6.f23011g = iM;
    }

    private void J2(int i6, int i10) {
        this.f22989t.f23007c = this.f22990u.i() - i10;
        androidx.recyclerview.widget.LinearLayoutManager.c cVar = this.f22989t;
        cVar.f23009e = this.f22993x ? -1 : 1;
        cVar.f23008d = i6;
        cVar.f23010f = 1;
        cVar.f23006b = i10;
        cVar.f23011g = Integer.MIN_VALUE;
    }

    private void K2(androidx.recyclerview.widget.LinearLayoutManager.a aVar) {
        J2(aVar.f22997b, aVar.f22998c);
    }

    private void L2(int i6, int i10) {
        this.f22989t.f23007c = i10 - this.f22990u.m();
        androidx.recyclerview.widget.LinearLayoutManager.c cVar = this.f22989t;
        cVar.f23008d = i6;
        cVar.f23009e = this.f22993x ? 1 : -1;
        cVar.f23010f = -1;
        cVar.f23006b = i10;
        cVar.f23011g = Integer.MIN_VALUE;
    }

    private void M2(androidx.recyclerview.widget.LinearLayoutManager.a aVar) {
        L2(aVar.f22997b, aVar.f22998c);
    }

    private int S1(androidx.recyclerview.widget.RecyclerView.A a6) {
        if (O() == 0) {
            return 0;
        }
        X1();
        return androidx.recyclerview.widget.l.a(a6, this.f22990u, b2(!this.f22995z, true), a2(!this.f22995z, true), this, this.f22995z);
    }

    private int T1(androidx.recyclerview.widget.RecyclerView.A a6) {
        if (O() == 0) {
            return 0;
        }
        X1();
        return androidx.recyclerview.widget.l.b(a6, this.f22990u, b2(!this.f22995z, true), a2(!this.f22995z, true), this, this.f22995z, this.f22993x);
    }

    private int U1(androidx.recyclerview.widget.RecyclerView.A a6) {
        if (O() == 0) {
            return 0;
        }
        X1();
        return androidx.recyclerview.widget.l.c(a6, this.f22990u, b2(!this.f22995z, true), a2(!this.f22995z, true), this, this.f22995z);
    }

    private android.view.View Z1() {
        return f2(0, O());
    }

    private android.view.View d2() {
        return f2(O() - 1, -1);
    }

    private android.view.View h2() {
        return this.f22993x ? Z1() : d2();
    }

    private android.view.View i2() {
        return this.f22993x ? d2() : Z1();
    }

    private int k2(int i6, androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6, boolean z6) {
        int i10;
        int i11 = this.f22990u.i() - i6;
        if (i11 <= 0) {
            return 0;
        }
        int i12 = -B2(-i11, vVar, a6);
        int i13 = i6 + i12;
        if (!z6 || (i10 = this.f22990u.i() - i13) <= 0) {
            return i12;
        }
        this.f22990u.r(i10);
        return i10 + i12;
    }

    private int l2(int i6, androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6, boolean z6) {
        int iM;
        int iM2 = i6 - this.f22990u.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i10 = -B2(iM2, vVar, a6);
        int i11 = i6 + i10;
        if (!z6 || (iM = i11 - this.f22990u.m()) <= 0) {
            return i10;
        }
        this.f22990u.r(-iM);
        return i10 - iM;
    }

    private android.view.View m2() {
        return N(this.f22993x ? 0 : O() - 1);
    }

    private android.view.View n2() {
        return N(this.f22993x ? O() - 1 : 0);
    }

    private void t2(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6, int i6, int i10) {
        if (!a6.g() || O() == 0 || a6.e() || !P1()) {
            return;
        }
        java.util.List listK = vVar.k();
        int size = listK.size();
        int iL0 = l0(N(0));
        int iE = 0;
        int iE2 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            androidx.recyclerview.widget.RecyclerView.D d6 = (androidx.recyclerview.widget.RecyclerView.D) listK.get(i11);
            if (!d6.v()) {
                if ((d6.m() < iL0) != this.f22993x) {
                    iE += this.f22990u.e(d6.f23130a);
                } else {
                    iE2 += this.f22990u.e(d6.f23130a);
                }
            }
        }
        this.f22989t.f23016l = listK;
        if (iE > 0) {
            L2(l0(n2()), i6);
            androidx.recyclerview.widget.LinearLayoutManager.c cVar = this.f22989t;
            cVar.f23012h = iE;
            cVar.f23007c = 0;
            cVar.a();
            Y1(vVar, this.f22989t, a6, false);
        }
        if (iE2 > 0) {
            J2(l0(m2()), i10);
            androidx.recyclerview.widget.LinearLayoutManager.c cVar2 = this.f22989t;
            cVar2.f23012h = iE2;
            cVar2.f23007c = 0;
            cVar2.a();
            Y1(vVar, this.f22989t, a6, false);
        }
        this.f22989t.f23016l = null;
    }

    private void v2(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.LinearLayoutManager.c cVar) {
        if (!cVar.f23005a || cVar.f23017m) {
            return;
        }
        int i6 = cVar.f23011g;
        int i10 = cVar.f23013i;
        if (cVar.f23010f == -1) {
            x2(vVar, i6, i10);
        } else {
            y2(vVar, i6, i10);
        }
    }

    private void w2(androidx.recyclerview.widget.RecyclerView.v vVar, int i6, int i10) {
        if (i6 == i10) {
            return;
        }
        if (i10 <= i6) {
            while (i6 > i10) {
                r1(i6, vVar);
                i6--;
            }
        } else {
            for (int i11 = i10 - 1; i11 >= i6; i11--) {
                r1(i11, vVar);
            }
        }
    }

    private void x2(androidx.recyclerview.widget.RecyclerView.v vVar, int i6, int i10) {
        int iO = O();
        if (i6 < 0) {
            return;
        }
        int iH = (this.f22990u.h() - i6) + i10;
        if (this.f22993x) {
            for (int i11 = 0; i11 < iO; i11++) {
                android.view.View viewN = N(i11);
                if (this.f22990u.g(viewN) < iH || this.f22990u.q(viewN) < iH) {
                    w2(vVar, 0, i11);
                    return;
                }
            }
            return;
        }
        int i12 = iO - 1;
        for (int i13 = i12; i13 >= 0; i13--) {
            android.view.View viewN2 = N(i13);
            if (this.f22990u.g(viewN2) < iH || this.f22990u.q(viewN2) < iH) {
                w2(vVar, i12, i13);
                return;
            }
        }
    }

    private void y2(androidx.recyclerview.widget.RecyclerView.v vVar, int i6, int i10) {
        if (i6 < 0) {
            return;
        }
        int i11 = i6 - i10;
        int iO = O();
        if (!this.f22993x) {
            for (int i12 = 0; i12 < iO; i12++) {
                android.view.View viewN = N(i12);
                if (this.f22990u.d(viewN) > i11 || this.f22990u.p(viewN) > i11) {
                    w2(vVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = iO - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            android.view.View viewN2 = N(i14);
            if (this.f22990u.d(viewN2) > i11 || this.f22990u.p(viewN2) > i11) {
                w2(vVar, i13, i14);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A(androidx.recyclerview.widget.RecyclerView.A a6) {
        return U1(a6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A1(int i6, androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6) {
        if (this.f22988s == 1) {
            return 0;
        }
        return B2(i6, vVar, a6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void B1(int i6) {
        this.f22980A = i6;
        this.f22981B = Integer.MIN_VALUE;
        androidx.recyclerview.widget.LinearLayoutManager.d dVar = this.f22983D;
        if (dVar != null) {
            dVar.b();
        }
        x1();
    }

    int B2(int i6, androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6) {
        if (O() == 0 || i6 == 0) {
            return 0;
        }
        X1();
        this.f22989t.f23005a = true;
        int i10 = i6 > 0 ? 1 : -1;
        int iAbs = java.lang.Math.abs(i6);
        I2(i10, iAbs, true, a6);
        androidx.recyclerview.widget.LinearLayoutManager.c cVar = this.f22989t;
        int iY1 = cVar.f23011g + Y1(vVar, cVar, a6, false);
        if (iY1 < 0) {
            return 0;
        }
        if (iAbs > iY1) {
            i6 = i10 * iY1;
        }
        this.f22990u.r(-i6);
        this.f22989t.f23015k = i6;
        return i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C1(int i6, androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6) {
        if (this.f22988s == 0) {
            return 0;
        }
        return B2(i6, vVar, a6);
    }

    public void C2(int i6) {
        if (i6 != 0 && i6 != 1) {
            throw new java.lang.IllegalArgumentException("invalid orientation:" + i6);
        }
        l(null);
        if (i6 != this.f22988s || this.f22990u == null) {
            androidx.recyclerview.widget.i iVarB = androidx.recyclerview.widget.i.b(this, i6);
            this.f22990u = iVarB;
            this.f22984E.f22996a = iVarB;
            this.f22988s = i6;
            x1();
        }
    }

    public void D2(boolean z6) {
        l(null);
        if (z6 == this.f22992w) {
            return;
        }
        this.f22992w = z6;
        x1();
    }

    public void E2(boolean z6) {
        l(null);
        if (this.f22994y == z6) {
            return;
        }
        this.f22994y = z6;
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public android.view.View H(int i6) {
        int iO = O();
        if (iO == 0) {
            return null;
        }
        int iL0 = i6 - l0(N(0));
        if (iL0 >= 0 && iL0 < iO) {
            android.view.View viewN = N(iL0);
            if (l0(viewN) == i6) {
                return viewN;
            }
        }
        return super.H(i6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public androidx.recyclerview.widget.RecyclerView.q I() {
        return new androidx.recyclerview.widget.RecyclerView.q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    boolean K1() {
        return (c0() == 1073741824 || t0() == 1073741824 || !u0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M0(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.v vVar) {
        super.M0(recyclerView, vVar);
        if (this.f22982C) {
            o1(vVar);
            vVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M1(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.A a6, int i6) {
        androidx.recyclerview.widget.g gVar = new androidx.recyclerview.widget.g(recyclerView.getContext());
        gVar.p(i6);
        N1(gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public android.view.View N0(android.view.View view, int i6, androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6) {
        int iV1;
        A2();
        if (O() == 0 || (iV1 = V1(i6)) == Integer.MIN_VALUE) {
            return null;
        }
        X1();
        I2(iV1, (int) (this.f22990u.n() * 0.33333334f), false, a6);
        androidx.recyclerview.widget.LinearLayoutManager.c cVar = this.f22989t;
        cVar.f23011g = Integer.MIN_VALUE;
        cVar.f23005a = false;
        Y1(vVar, cVar, a6, true);
        android.view.View viewI2 = iV1 == -1 ? i2() : h2();
        android.view.View viewN2 = iV1 == -1 ? n2() : m2();
        if (!viewN2.hasFocusable()) {
            return viewI2;
        }
        if (viewI2 == null) {
            return null;
        }
        return viewN2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void O0(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.O0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(c2());
            accessibilityEvent.setToIndex(e2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean P1() {
        return this.f22983D == null && this.f22991v == this.f22994y;
    }

    protected void Q1(androidx.recyclerview.widget.RecyclerView.A a6, int[] iArr) {
        int i6;
        int iO2 = o2(a6);
        if (this.f22989t.f23010f == -1) {
            i6 = 0;
        } else {
            i6 = iO2;
            iO2 = 0;
        }
        iArr[0] = iO2;
        iArr[1] = i6;
    }

    void R1(androidx.recyclerview.widget.RecyclerView.A a6, androidx.recyclerview.widget.LinearLayoutManager.c cVar, androidx.recyclerview.widget.RecyclerView.p.c cVar2) {
        int i6 = cVar.f23008d;
        if (i6 < 0 || i6 >= a6.b()) {
            return;
        }
        cVar2.a(i6, java.lang.Math.max(0, cVar.f23011g));
    }

    int V1(int i6) {
        if (i6 == 1) {
            return (this.f22988s != 1 && q2()) ? 1 : -1;
        }
        if (i6 == 2) {
            return (this.f22988s != 1 && q2()) ? -1 : 1;
        }
        if (i6 == 17) {
            return this.f22988s == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i6 == 33) {
            return this.f22988s == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i6 != 66) {
            return (i6 == 130 && this.f22988s == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f22988s == 0 ? 1 : Integer.MIN_VALUE;
    }

    androidx.recyclerview.widget.LinearLayoutManager.c W1() {
        return new androidx.recyclerview.widget.LinearLayoutManager.c();
    }

    void X1() {
        if (this.f22989t == null) {
            this.f22989t = W1();
        }
    }

    int Y1(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.LinearLayoutManager.c cVar, androidx.recyclerview.widget.RecyclerView.A a6, boolean z6) {
        int i6 = cVar.f23007c;
        int i10 = cVar.f23011g;
        if (i10 != Integer.MIN_VALUE) {
            if (i6 < 0) {
                cVar.f23011g = i10 + i6;
            }
            v2(vVar, cVar);
        }
        int i11 = cVar.f23007c + cVar.f23012h;
        androidx.recyclerview.widget.LinearLayoutManager.b bVar = this.f22985F;
        while (true) {
            if ((!cVar.f23017m && i11 <= 0) || !cVar.c(a6)) {
                break;
            }
            bVar.a();
            s2(vVar, a6, cVar, bVar);
            if (!bVar.f23002b) {
                cVar.f23006b += bVar.f23001a * cVar.f23010f;
                if (!bVar.f23003c || cVar.f23016l != null || !a6.e()) {
                    int i12 = cVar.f23007c;
                    int i13 = bVar.f23001a;
                    cVar.f23007c = i12 - i13;
                    i11 -= i13;
                }
                int i14 = cVar.f23011g;
                if (i14 != Integer.MIN_VALUE) {
                    int i15 = i14 + bVar.f23001a;
                    cVar.f23011g = i15;
                    int i16 = cVar.f23007c;
                    if (i16 < 0) {
                        cVar.f23011g = i15 + i16;
                    }
                    v2(vVar, cVar);
                }
                if (z6 && bVar.f23004d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i6 - cVar.f23007c;
    }

    android.view.View a2(boolean z6, boolean z10) {
        int iO;
        int iO2;
        if (this.f22993x) {
            iO = 0;
            iO2 = O();
        } else {
            iO = O() - 1;
            iO2 = -1;
        }
        return g2(iO, iO2, z6, z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6) {
        int i6;
        int i10;
        int i11;
        int i12;
        int iK2;
        int i13;
        android.view.View viewH;
        int iG;
        int i14;
        int i15 = -1;
        if (!(this.f22983D == null && this.f22980A == -1) && a6.b() == 0) {
            o1(vVar);
            return;
        }
        androidx.recyclerview.widget.LinearLayoutManager.d dVar = this.f22983D;
        if (dVar != null && dVar.a()) {
            this.f22980A = this.f22983D.f23018C;
        }
        X1();
        this.f22989t.f23005a = false;
        A2();
        android.view.View viewA0 = a0();
        androidx.recyclerview.widget.LinearLayoutManager.a aVar = this.f22984E;
        if (!aVar.f23000e || this.f22980A != -1 || this.f22983D != null) {
            aVar.e();
            androidx.recyclerview.widget.LinearLayoutManager.a aVar2 = this.f22984E;
            aVar2.f22999d = this.f22993x ^ this.f22994y;
            H2(vVar, a6, aVar2);
            this.f22984E.f23000e = true;
        } else if (viewA0 != null && (this.f22990u.g(viewA0) >= this.f22990u.i() || this.f22990u.d(viewA0) <= this.f22990u.m())) {
            this.f22984E.c(viewA0, l0(viewA0));
        }
        androidx.recyclerview.widget.LinearLayoutManager.c cVar = this.f22989t;
        cVar.f23010f = cVar.f23015k >= 0 ? 1 : -1;
        int[] iArr = this.f22987H;
        iArr[0] = 0;
        iArr[1] = 0;
        Q1(a6, iArr);
        int iMax = java.lang.Math.max(0, this.f22987H[0]) + this.f22990u.m();
        int iMax2 = java.lang.Math.max(0, this.f22987H[1]) + this.f22990u.j();
        if (a6.e() && (i13 = this.f22980A) != -1 && this.f22981B != Integer.MIN_VALUE && (viewH = H(i13)) != null) {
            if (this.f22993x) {
                i14 = this.f22990u.i() - this.f22990u.d(viewH);
                iG = this.f22981B;
            } else {
                iG = this.f22990u.g(viewH) - this.f22990u.m();
                i14 = this.f22981B;
            }
            int i16 = i14 - iG;
            if (i16 > 0) {
                iMax += i16;
            } else {
                iMax2 -= i16;
            }
        }
        androidx.recyclerview.widget.LinearLayoutManager.a aVar3 = this.f22984E;
        if (!aVar3.f22999d ? !this.f22993x : this.f22993x) {
            i15 = 1;
        }
        u2(vVar, a6, aVar3, i15);
        B(vVar);
        this.f22989t.f23017m = z2();
        this.f22989t.f23014j = a6.e();
        this.f22989t.f23013i = 0;
        androidx.recyclerview.widget.LinearLayoutManager.a aVar4 = this.f22984E;
        if (aVar4.f22999d) {
            M2(aVar4);
            androidx.recyclerview.widget.LinearLayoutManager.c cVar2 = this.f22989t;
            cVar2.f23012h = iMax;
            Y1(vVar, cVar2, a6, false);
            androidx.recyclerview.widget.LinearLayoutManager.c cVar3 = this.f22989t;
            i10 = cVar3.f23006b;
            int i17 = cVar3.f23008d;
            int i18 = cVar3.f23007c;
            if (i18 > 0) {
                iMax2 += i18;
            }
            K2(this.f22984E);
            androidx.recyclerview.widget.LinearLayoutManager.c cVar4 = this.f22989t;
            cVar4.f23012h = iMax2;
            cVar4.f23008d += cVar4.f23009e;
            Y1(vVar, cVar4, a6, false);
            androidx.recyclerview.widget.LinearLayoutManager.c cVar5 = this.f22989t;
            i6 = cVar5.f23006b;
            int i19 = cVar5.f23007c;
            if (i19 > 0) {
                L2(i17, i10);
                androidx.recyclerview.widget.LinearLayoutManager.c cVar6 = this.f22989t;
                cVar6.f23012h = i19;
                Y1(vVar, cVar6, a6, false);
                i10 = this.f22989t.f23006b;
            }
        } else {
            K2(aVar4);
            androidx.recyclerview.widget.LinearLayoutManager.c cVar7 = this.f22989t;
            cVar7.f23012h = iMax2;
            Y1(vVar, cVar7, a6, false);
            androidx.recyclerview.widget.LinearLayoutManager.c cVar8 = this.f22989t;
            i6 = cVar8.f23006b;
            int i20 = cVar8.f23008d;
            int i21 = cVar8.f23007c;
            if (i21 > 0) {
                iMax += i21;
            }
            M2(this.f22984E);
            androidx.recyclerview.widget.LinearLayoutManager.c cVar9 = this.f22989t;
            cVar9.f23012h = iMax;
            cVar9.f23008d += cVar9.f23009e;
            Y1(vVar, cVar9, a6, false);
            androidx.recyclerview.widget.LinearLayoutManager.c cVar10 = this.f22989t;
            i10 = cVar10.f23006b;
            int i22 = cVar10.f23007c;
            if (i22 > 0) {
                J2(i20, i6);
                androidx.recyclerview.widget.LinearLayoutManager.c cVar11 = this.f22989t;
                cVar11.f23012h = i22;
                Y1(vVar, cVar11, a6, false);
                i6 = this.f22989t.f23006b;
            }
        }
        if (O() > 0) {
            if (this.f22993x ^ this.f22994y) {
                int iK3 = k2(i6, vVar, a6, true);
                i11 = i10 + iK3;
                i12 = i6 + iK3;
                iK2 = l2(i11, vVar, a6, false);
            } else {
                int iL2 = l2(i10, vVar, a6, true);
                i11 = i10 + iL2;
                i12 = i6 + iL2;
                iK2 = k2(i12, vVar, a6, false);
            }
            i10 = i11 + iK2;
            i6 = i12 + iK2;
        }
        t2(vVar, a6, i10, i6);
        if (a6.e()) {
            this.f22984E.e();
        } else {
            this.f22990u.s();
        }
        this.f22991v = this.f22994y;
    }

    android.view.View b2(boolean z6, boolean z10) {
        int iO;
        int iO2;
        if (this.f22993x) {
            iO = O() - 1;
            iO2 = -1;
        } else {
            iO = 0;
            iO2 = O();
        }
        return g2(iO, iO2, z6, z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(androidx.recyclerview.widget.RecyclerView.A a6) {
        super.c1(a6);
        this.f22983D = null;
        this.f22980A = -1;
        this.f22981B = Integer.MIN_VALUE;
        this.f22984E.e();
    }

    public int c2() {
        android.view.View viewG2 = g2(0, O(), false, true);
        if (viewG2 == null) {
            return -1;
        }
        return l0(viewG2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public android.graphics.PointF d(int i6) {
        if (O() == 0) {
            return null;
        }
        int i10 = (i6 < l0(N(0))) != this.f22993x ? -1 : 1;
        return this.f22988s == 0 ? new android.graphics.PointF(i10, 0.0f) : new android.graphics.PointF(0.0f, i10);
    }

    public int e2() {
        android.view.View viewG2 = g2(O() - 1, -1, false, true);
        if (viewG2 == null) {
            return -1;
        }
        return l0(viewG2);
    }

    android.view.View f2(int i6, int i10) {
        int i11;
        int i12;
        X1();
        if (i10 <= i6 && i10 >= i6) {
            return N(i6);
        }
        if (this.f22990u.g(N(i6)) < this.f22990u.m()) {
            i11 = 16644;
            i12 = 16388;
        } else {
            i11 = 4161;
            i12 = 4097;
        }
        return (this.f22988s == 0 ? this.f23177e : this.f23178f).a(i6, i10, i11, i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g1(android.os.Parcelable parcelable) {
        if (parcelable instanceof androidx.recyclerview.widget.LinearLayoutManager.d) {
            androidx.recyclerview.widget.LinearLayoutManager.d dVar = (androidx.recyclerview.widget.LinearLayoutManager.d) parcelable;
            this.f22983D = dVar;
            if (this.f22980A != -1) {
                dVar.b();
            }
            x1();
        }
    }

    android.view.View g2(int i6, int i10, boolean z6, boolean z10) {
        X1();
        return (this.f22988s == 0 ? this.f23177e : this.f23178f).a(i6, i10, z6 ? 24579 : 320, z10 ? 320 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public android.os.Parcelable h1() {
        if (this.f22983D != null) {
            return new androidx.recyclerview.widget.LinearLayoutManager.d(this.f22983D);
        }
        androidx.recyclerview.widget.LinearLayoutManager.d dVar = new androidx.recyclerview.widget.LinearLayoutManager.d();
        if (O() > 0) {
            X1();
            boolean z6 = this.f22991v ^ this.f22993x;
            dVar.f23020E = z6;
            if (z6) {
                android.view.View viewM2 = m2();
                dVar.f23019D = this.f22990u.i() - this.f22990u.d(viewM2);
                dVar.f23018C = l0(viewM2);
            } else {
                android.view.View viewN2 = n2();
                dVar.f23018C = l0(viewN2);
                dVar.f23019D = this.f22990u.g(viewN2) - this.f22990u.m();
            }
        } else {
            dVar.b();
        }
        return dVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    android.view.View j2(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6, boolean z6, boolean z10) {
        int i6;
        int iO;
        int i10;
        X1();
        int iO2 = O();
        if (z10) {
            iO = O() - 1;
            i6 = -1;
            i10 = -1;
        } else {
            i6 = iO2;
            iO = 0;
            i10 = 1;
        }
        int iB = a6.b();
        int iM = this.f22990u.m();
        int i11 = this.f22990u.i();
        android.view.View view = null;
        android.view.View view2 = null;
        android.view.View view3 = null;
        while (iO != i6) {
            android.view.View viewN = N(iO);
            int iL0 = l0(viewN);
            int iG = this.f22990u.g(viewN);
            int iD = this.f22990u.d(viewN);
            if (iL0 >= 0 && iL0 < iB) {
                if (!((androidx.recyclerview.widget.RecyclerView.q) viewN.getLayoutParams()).c()) {
                    boolean z11 = iD <= iM && iG < iM;
                    boolean z12 = iG >= i11 && iD > i11;
                    if (!z11 && !z12) {
                        return viewN;
                    }
                    if (z6) {
                        if (z12) {
                            view2 = viewN;
                        } else if (view == null) {
                            view = viewN;
                        }
                    } else if (z11) {
                        view2 = viewN;
                    } else if (view == null) {
                        view = viewN;
                    }
                } else if (view3 == null) {
                    view3 = viewN;
                }
            }
            iO += i10;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void l(java.lang.String str) {
        if (this.f22983D == null) {
            super.l(str);
        }
    }

    protected int o2(androidx.recyclerview.widget.RecyclerView.A a6) {
        if (a6.d()) {
            return this.f22990u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean p() {
        return this.f22988s == 0;
    }

    public int p2() {
        return this.f22988s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean q() {
        return this.f22988s == 1;
    }

    protected boolean q2() {
        return d0() == 1;
    }

    public boolean r2() {
        return this.f22995z;
    }

    void s2(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6, androidx.recyclerview.widget.LinearLayoutManager.c cVar, androidx.recyclerview.widget.LinearLayoutManager.b bVar) {
        int i6;
        int i10;
        int i11;
        int iI0;
        int iF;
        android.view.View viewD = cVar.d(vVar);
        if (viewD == null) {
            bVar.f23002b = true;
            return;
        }
        androidx.recyclerview.widget.RecyclerView.q qVar = (androidx.recyclerview.widget.RecyclerView.q) viewD.getLayoutParams();
        if (cVar.f23016l == null) {
            if (this.f22993x == (cVar.f23010f == -1)) {
                i(viewD);
            } else {
                j(viewD, 0);
            }
        } else {
            if (this.f22993x == (cVar.f23010f == -1)) {
                g(viewD);
            } else {
                h(viewD, 0);
            }
        }
        E0(viewD, 0, 0);
        bVar.f23001a = this.f22990u.e(viewD);
        if (this.f22988s == 1) {
            if (q2()) {
                iF = s0() - j0();
                iI0 = iF - this.f22990u.f(viewD);
            } else {
                iI0 = i0();
                iF = this.f22990u.f(viewD) + iI0;
            }
            int i12 = cVar.f23010f;
            int i13 = cVar.f23006b;
            if (i12 == -1) {
                i11 = i13;
                i10 = iF;
                i6 = i13 - bVar.f23001a;
            } else {
                i6 = i13;
                i10 = iF;
                i11 = bVar.f23001a + i13;
            }
        } else {
            int iK0 = k0();
            int iF2 = this.f22990u.f(viewD) + iK0;
            int i14 = cVar.f23010f;
            int i15 = cVar.f23006b;
            if (i14 == -1) {
                i10 = i15;
                i6 = iK0;
                i11 = iF2;
                iI0 = i15 - bVar.f23001a;
            } else {
                i6 = iK0;
                i10 = bVar.f23001a + i15;
                i11 = iF2;
                iI0 = i15;
            }
        }
        D0(viewD, iI0, i6, i10, i11);
        if (qVar.c() || qVar.b()) {
            bVar.f23003c = true;
        }
        bVar.f23004d = viewD.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void t(int i6, int i10, androidx.recyclerview.widget.RecyclerView.A a6, androidx.recyclerview.widget.RecyclerView.p.c cVar) {
        if (this.f22988s != 0) {
            i6 = i10;
        }
        if (O() == 0 || i6 == 0) {
            return;
        }
        X1();
        I2(i6 > 0 ? 1 : -1, java.lang.Math.abs(i6), true, a6);
        R1(a6, this.f22989t, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void u(int i6, androidx.recyclerview.widget.RecyclerView.p.c cVar) {
        boolean z6;
        int i10;
        androidx.recyclerview.widget.LinearLayoutManager.d dVar = this.f22983D;
        if (dVar == null || !dVar.a()) {
            A2();
            z6 = this.f22993x;
            i10 = this.f22980A;
            if (i10 == -1) {
                i10 = z6 ? i6 - 1 : 0;
            }
        } else {
            androidx.recyclerview.widget.LinearLayoutManager.d dVar2 = this.f22983D;
            z6 = dVar2.f23020E;
            i10 = dVar2.f23018C;
        }
        int i11 = z6 ? -1 : 1;
        for (int i12 = 0; i12 < this.f22986G && i10 >= 0 && i10 < i6; i12++) {
            cVar.a(i10, 0);
            i10 += i11;
        }
    }

    void u2(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6, androidx.recyclerview.widget.LinearLayoutManager.a aVar, int i6) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(androidx.recyclerview.widget.RecyclerView.A a6) {
        return S1(a6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w(androidx.recyclerview.widget.RecyclerView.A a6) {
        return T1(a6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int x(androidx.recyclerview.widget.RecyclerView.A a6) {
        return U1(a6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int y(androidx.recyclerview.widget.RecyclerView.A a6) {
        return S1(a6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z(androidx.recyclerview.widget.RecyclerView.A a6) {
        return T1(a6);
    }

    boolean z2() {
        return this.f22990u.k() == 0 && this.f22990u.h() == 0;
    }
}
