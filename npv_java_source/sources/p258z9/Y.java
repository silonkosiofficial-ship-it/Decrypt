package p258z9;

/* JADX INFO: loaded from: classes2.dex */
public class Y extends p229w9.a implements p249y9.InterfaceC7364h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p249y9.AbstractC7358b f57715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p258z9.i0 f57716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p258z9.AbstractC7388a f57717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final A9.b f57718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f57719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private z9.Y.a f57720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p249y9.C7363g f57721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p258z9.D f57722i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.String f57723a;
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f57724a;

        static {
            int[] iArr = new int[p258z9.i0.values().length];
            try {
                iArr[p258z9.i0.LIST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[p258z9.i0.MAP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[p258z9.i0.POLY_OBJ.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[p258z9.i0.OBJ.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            f57724a = iArr;
        }
    }

    public Y(p249y9.AbstractC7358b abstractC7358b, p258z9.i0 i0Var, p258z9.AbstractC7388a abstractC7388a, p219v9.f fVar, z9.Y.a aVar) {
        p247y7.AbstractC7350t.f(abstractC7358b, "json");
        p247y7.AbstractC7350t.f(i0Var, "mode");
        p247y7.AbstractC7350t.f(abstractC7388a, "lexer");
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        this.f57715b = abstractC7358b;
        this.f57716c = i0Var;
        this.f57717d = abstractC7388a;
        this.f57718e = abstractC7358b.f();
        this.f57719f = -1;
        p249y9.C7363g c7363gE = abstractC7358b.e();
        this.f57721h = c7363gE;
        this.f57722i = c7363gE.j() ? null : new p258z9.D(fVar);
    }

    private final void I() {
        if (this.f57717d.D() != 4) {
            return;
        }
        p258z9.AbstractC7388a.y(this.f57717d, "Unexpected leading comma", 0, null, 6, null);
        throw new p087i7.C6665k();
    }

    private final boolean J(p219v9.f fVar, int i6) {
        java.lang.String strE;
        p249y9.AbstractC7358b abstractC7358b = this.f57715b;
        boolean zI = fVar.i(i6);
        p219v9.f fVarH = fVar.h(i6);
        if (zI && !fVarH.c() && this.f57717d.L(true)) {
            return true;
        }
        if (p247y7.AbstractC7350t.b(fVarH.j(), v9.m.b.f56057a) && ((!fVarH.c() || !this.f57717d.L(false)) && (strE = this.f57717d.E(this.f57721h.q())) != null)) {
            int i10 = p258z9.I.i(fVarH, abstractC7358b, strE);
            boolean z6 = !abstractC7358b.e().j() && fVarH.c();
            if (i10 == -3 && (zI || z6)) {
                this.f57717d.q();
                return true;
            }
        }
        return false;
    }

    private final int K() {
        boolean zK = this.f57717d.K();
        if (!this.f57717d.f()) {
            if (!zK || this.f57715b.e().d()) {
                return -1;
            }
            p258z9.G.g(this.f57717d, "array");
            throw new p087i7.C6665k();
        }
        int i6 = this.f57719f;
        if (i6 != -1 && !zK) {
            p258z9.AbstractC7388a.y(this.f57717d, "Expected end of the array or comma", 0, null, 6, null);
            throw new p087i7.C6665k();
        }
        int i10 = i6 + 1;
        this.f57719f = i10;
        return i10;
    }

    private final int L() {
        int i6 = this.f57719f;
        boolean zK = false;
        boolean z6 = i6 % 2 != 0;
        if (!z6) {
            this.f57717d.m(':');
        } else if (i6 != -1) {
            zK = this.f57717d.K();
        }
        if (!this.f57717d.f()) {
            if (!zK || this.f57715b.e().d()) {
                return -1;
            }
            p258z9.G.h(this.f57717d, null, 1, null);
            throw new p087i7.C6665k();
        }
        if (z6) {
            if (this.f57719f == -1) {
                p258z9.AbstractC7388a abstractC7388a = this.f57717d;
                boolean z10 = !zK;
                int i10 = abstractC7388a.f57735a;
                if (!z10) {
                    p258z9.AbstractC7388a.y(abstractC7388a, "Unexpected leading comma", i10, null, 4, null);
                    throw new p087i7.C6665k();
                }
            } else {
                p258z9.AbstractC7388a abstractC7388a2 = this.f57717d;
                int i11 = abstractC7388a2.f57735a;
                if (!zK) {
                    p258z9.AbstractC7388a.y(abstractC7388a2, "Expected comma after the key-value pair", i11, null, 4, null);
                    throw new p087i7.C6665k();
                }
            }
        }
        int i12 = this.f57719f + 1;
        this.f57719f = i12;
        return i12;
    }

    private final int M(p219v9.f fVar) {
        boolean zK;
        boolean zK2 = this.f57717d.K();
        while (true) {
            boolean z6 = true;
            if (!this.f57717d.f()) {
                if (zK2 && !this.f57715b.e().d()) {
                    p258z9.G.h(this.f57717d, null, 1, null);
                    throw new p087i7.C6665k();
                }
                p258z9.D d6 = this.f57722i;
                if (d6 != null) {
                    return d6.d();
                }
                return -1;
            }
            java.lang.String strN = N();
            this.f57717d.m(':');
            int i6 = p258z9.I.i(fVar, this.f57715b, strN);
            if (i6 == -3) {
                zK = false;
            } else {
                if (!this.f57721h.g() || !J(fVar, i6)) {
                    p258z9.D d10 = this.f57722i;
                    if (d10 != null) {
                        d10.c(i6);
                    }
                    return i6;
                }
                zK = this.f57717d.K();
                z6 = false;
            }
            zK2 = z6 ? O(fVar, strN) : zK;
        }
    }

    private final java.lang.String N() {
        return this.f57721h.q() ? this.f57717d.t() : this.f57717d.j();
    }

    private final boolean O(p219v9.f fVar, java.lang.String str) {
        if (p258z9.I.m(fVar, this.f57715b) || Q(this.f57720g, str)) {
            this.f57717d.G(this.f57721h.q());
        } else {
            this.f57717d.f57736b.b();
            this.f57717d.z(str);
        }
        return this.f57717d.K();
    }

    private final void P(p219v9.f fVar) {
        while (r(fVar) != -1) {
        }
    }

    private final boolean Q(z9.Y.a aVar, java.lang.String str) {
        return false;
    }

    @Override // p229w9.a, p229w9.h
    public short A() {
        long jN = this.f57717d.n();
        short s6 = (short) jN;
        if (jN == s6) {
            return s6;
        }
        p258z9.AbstractC7388a.y(this.f57717d, "Failed to parse short for input '" + jN + '\'', 0, null, 6, null);
        throw new p087i7.C6665k();
    }

    @Override // p229w9.a, p229w9.d
    public java.lang.Object B(p219v9.f fVar, int i6, p199t9.a aVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        p247y7.AbstractC7350t.f(aVar, "deserializer");
        boolean z6 = this.f57716c == p258z9.i0.MAP && (i6 & 1) == 0;
        if (z6) {
            this.f57717d.f57736b.d();
        }
        java.lang.Object objB = super.B(fVar, i6, aVar, obj);
        if (z6) {
            this.f57717d.f57736b.f(objB);
        }
        return objB;
    }

    @Override // p229w9.a, p229w9.h
    public float C() {
        p258z9.AbstractC7388a abstractC7388a = this.f57717d;
        java.lang.String strS = abstractC7388a.s();
        try {
            float f6 = java.lang.Float.parseFloat(strS);
            if (this.f57715b.e().b() || !(java.lang.Float.isInfinite(f6) || java.lang.Float.isNaN(f6))) {
                return f6;
            }
            p258z9.G.k(this.f57717d, java.lang.Float.valueOf(f6));
            throw new p087i7.C6665k();
        } catch (java.lang.IllegalArgumentException unused) {
            p258z9.AbstractC7388a.y(abstractC7388a, "Failed to parse type 'float' for input '" + strS + '\'', 0, null, 6, null);
            throw new p087i7.C6665k();
        }
    }

    @Override // p229w9.a, p229w9.h
    public double F() {
        p258z9.AbstractC7388a abstractC7388a = this.f57717d;
        java.lang.String strS = abstractC7388a.s();
        try {
            double d6 = java.lang.Double.parseDouble(strS);
            if (this.f57715b.e().b() || !(java.lang.Double.isInfinite(d6) || java.lang.Double.isNaN(d6))) {
                return d6;
            }
            p258z9.G.k(this.f57717d, java.lang.Double.valueOf(d6));
            throw new p087i7.C6665k();
        } catch (java.lang.IllegalArgumentException unused) {
            p258z9.AbstractC7388a.y(abstractC7388a, "Failed to parse type 'double' for input '" + strS + '\'', 0, null, 6, null);
            throw new p087i7.C6665k();
        }
    }

    @Override // p229w9.a, p229w9.h
    public p229w9.d a(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        p258z9.i0 i0VarB = p258z9.j0.b(this.f57715b, fVar);
        this.f57717d.f57736b.c(fVar);
        this.f57717d.m(i0VarB.f57766C);
        I();
        int i6 = z9.Y.b.f57724a[i0VarB.ordinal()];
        if (i6 == 1 || i6 == 2 || i6 == 3) {
            return new p258z9.Y(this.f57715b, i0VarB, this.f57717d, fVar, this.f57720g);
        }
        return (this.f57716c == i0VarB && this.f57715b.e().j()) ? this : new p258z9.Y(this.f57715b, i0VarB, this.f57717d, fVar, this.f57720g);
    }

    @Override // p229w9.a, p229w9.d
    public void b(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        if (fVar.e() == 0 && p258z9.I.m(fVar, this.f57715b)) {
            P(fVar);
        }
        if (this.f57717d.K() && !this.f57715b.e().d()) {
            p258z9.G.g(this.f57717d, "");
            throw new p087i7.C6665k();
        }
        this.f57717d.m(this.f57716c.f57767D);
        this.f57717d.f57736b.b();
    }

    @Override // p229w9.a, p229w9.h
    public boolean e() {
        return this.f57717d.h();
    }

    @Override // p229w9.a, p229w9.h
    public char f() {
        java.lang.String strS = this.f57717d.s();
        if (strS.length() == 1) {
            return strS.charAt(0);
        }
        p258z9.AbstractC7388a.y(this.f57717d, "Expected single char, but got '" + strS + '\'', 0, null, 6, null);
        throw new p087i7.C6665k();
    }

    @Override // p229w9.a, p229w9.h
    public int k(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "enumDescriptor");
        return p258z9.I.j(fVar, this.f57715b, o(), " at path " + this.f57717d.f57736b.a());
    }

    @Override // p249y9.InterfaceC7364h
    public p249y9.i l() {
        return new p258z9.W(this.f57715b.e(), this.f57717d).e();
    }

    @Override // p229w9.a, p229w9.h
    public int m() {
        long jN = this.f57717d.n();
        int i6 = (int) jN;
        if (jN == i6) {
            return i6;
        }
        p258z9.AbstractC7388a.y(this.f57717d, "Failed to parse int for input '" + jN + '\'', 0, null, 6, null);
        throw new p087i7.C6665k();
    }

    @Override // p229w9.a, p229w9.h
    public java.lang.Void n() {
        return null;
    }

    @Override // p229w9.a, p229w9.h
    public java.lang.String o() {
        return this.f57721h.q() ? this.f57717d.t() : this.f57717d.q();
    }

    @Override // p229w9.a, p229w9.h
    public p229w9.h p(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return p258z9.a0.b(fVar) ? new p258z9.B(this.f57717d, this.f57715b) : super.p(fVar);
    }

    @Override // p229w9.a, p229w9.h
    public long q() {
        return this.f57717d.n();
    }

    @Override // p229w9.d
    public int r(p219v9.f fVar) {
        int iL;
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        int i6 = z9.Y.b.f57724a[this.f57716c.ordinal()];
        if (i6 != 2) {
            iL = i6 != 4 ? K() : M(fVar);
        } else {
            iL = L();
        }
        if (this.f57716c != p258z9.i0.MAP) {
            this.f57717d.f57736b.g(iL);
        }
        return iL;
    }

    @Override // p229w9.a, p229w9.h
    public boolean s() {
        p258z9.D d6 = this.f57722i;
        return ((d6 != null ? d6.b() : false) || p258z9.AbstractC7388a.M(this.f57717d, false, 1, null)) ? false : true;
    }

    @Override // p229w9.a, p229w9.h
    public java.lang.Object x(p199t9.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "deserializer");
        try {
            return aVar.b(this);
        } catch (p199t9.c e6) {
            java.lang.String message = e6.getMessage();
            p247y7.AbstractC7350t.c(message);
            if (S8.r.c0(message, "at path", false, 2, null)) {
                throw e6;
            }
            throw new p199t9.c(e6.a(), e6.getMessage() + " at path: " + this.f57717d.f57736b.a(), e6);
        }
    }

    @Override // p229w9.a, p229w9.h
    public byte y() {
        long jN = this.f57717d.n();
        byte b6 = (byte) jN;
        if (jN == b6) {
            return b6;
        }
        p258z9.AbstractC7388a.y(this.f57717d, "Failed to parse byte for input '" + jN + '\'', 0, null, 6, null);
        throw new p087i7.C6665k();
    }
}
