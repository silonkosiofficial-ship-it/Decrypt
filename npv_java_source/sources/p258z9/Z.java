package p258z9;

/* JADX INFO: loaded from: classes2.dex */
public final class Z extends p229w9.b implements p249y9.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p258z9.C7401n f57725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p249y9.AbstractC7358b f57726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p258z9.i0 f57727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p249y9.s[] f57728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final A9.b f57729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p249y9.C7363g f57730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f57731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private java.lang.String f57732h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private java.lang.String f57733i;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f57734a;

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
            f57734a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Z(p258z9.A a6, p249y9.AbstractC7358b abstractC7358b, p258z9.i0 i0Var, p249y9.s[] sVarArr) {
        this(p258z9.AbstractC7410x.a(a6, abstractC7358b), abstractC7358b, i0Var, sVarArr);
        p247y7.AbstractC7350t.f(a6, "output");
        p247y7.AbstractC7350t.f(abstractC7358b, "json");
        p247y7.AbstractC7350t.f(i0Var, "mode");
        p247y7.AbstractC7350t.f(sVarArr, "modeReuseCache");
    }

    public Z(p258z9.C7401n c7401n, p249y9.AbstractC7358b abstractC7358b, p258z9.i0 i0Var, p249y9.s[] sVarArr) {
        p247y7.AbstractC7350t.f(c7401n, "composer");
        p247y7.AbstractC7350t.f(abstractC7358b, "json");
        p247y7.AbstractC7350t.f(i0Var, "mode");
        this.f57725a = c7401n;
        this.f57726b = abstractC7358b;
        this.f57727c = i0Var;
        this.f57728d = sVarArr;
        this.f57729e = z().f();
        this.f57730f = z().e();
        int iOrdinal = i0Var.ordinal();
        if (sVarArr != null) {
            p249y9.s sVar = sVarArr[iOrdinal];
            if (sVar == null && sVar == this) {
                return;
            }
            sVarArr[iOrdinal] = this;
        }
    }

    private final void I(java.lang.String str, java.lang.String str2) {
        this.f57725a.c();
        E(str);
        this.f57725a.f(':');
        this.f57725a.p();
        E(str2);
    }

    @Override // p229w9.b, p229w9.j
    public void A(int i6) {
        if (this.f57731g) {
            E(java.lang.String.valueOf(i6));
        } else {
            this.f57725a.i(i6);
        }
    }

    @Override // p229w9.b, p229w9.j
    public void D(long j6) {
        if (this.f57731g) {
            E(java.lang.String.valueOf(j6));
        } else {
            this.f57725a.j(j6);
        }
    }

    @Override // p229w9.b, p229w9.j
    public void E(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "value");
        this.f57725a.n(str);
    }

    @Override // p229w9.b
    public boolean F(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        int i10 = z9.Z.a.f57734a[this.f57727c.ordinal()];
        if (i10 != 1) {
            boolean z6 = false;
            if (i10 != 2) {
                if (i10 != 3) {
                    if (!this.f57725a.a()) {
                        this.f57725a.f(',');
                    }
                    this.f57725a.c();
                    E(p258z9.I.h(fVar, z(), i6));
                    this.f57725a.f(':');
                    this.f57725a.p();
                } else {
                    if (i6 == 0) {
                        this.f57731g = true;
                    }
                    if (i6 == 1) {
                        this.f57725a.f(',');
                    }
                }
                return true;
            }
            if (!this.f57725a.a()) {
                int i11 = i6 % 2;
                p258z9.C7401n c7401n = this.f57725a;
                if (i11 == 0) {
                    c7401n.f(',');
                    this.f57725a.c();
                    z6 = true;
                } else {
                    c7401n.f(':');
                }
                this.f57731g = z6;
                return true;
            }
            this.f57731g = true;
            this.f57725a.p();
            this.f57731g = z6;
            return true;
        }
        if (!this.f57725a.a()) {
            this.f57725a.f(',');
        }
        this.f57725a.c();
        return true;
    }

    @Override // p229w9.b, p229w9.j
    public p229w9.f a(p219v9.f fVar) {
        p249y9.s sVar;
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        p258z9.i0 i0VarB = p258z9.j0.b(z(), fVar);
        char c6 = i0VarB.f57766C;
        if (c6 != 0) {
            this.f57725a.f(c6);
            this.f57725a.b();
        }
        java.lang.String str = this.f57732h;
        if (str != null) {
            java.lang.String strA = this.f57733i;
            if (strA == null) {
                strA = fVar.a();
            }
            I(str, strA);
            this.f57732h = null;
            this.f57733i = null;
        }
        if (this.f57727c == i0VarB) {
            return this;
        }
        p249y9.s[] sVarArr = this.f57728d;
        return (sVarArr == null || (sVar = sVarArr[i0VarB.ordinal()]) == null) ? new p258z9.Z(this.f57725a, z(), i0VarB, this.f57728d) : sVar;
    }

    @Override // p229w9.b, p229w9.f
    public void b(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        if (this.f57727c.f57767D != 0) {
            this.f57725a.q();
            this.f57725a.d();
            this.f57725a.f(this.f57727c.f57767D);
        }
    }

    @Override // p229w9.b, p229w9.j
    public void d() {
        this.f57725a.k("null");
    }

    @Override // p229w9.b, p229w9.j
    public void g(double d6) {
        if (this.f57731g) {
            E(java.lang.String.valueOf(d6));
        } else {
            this.f57725a.g(d6);
        }
        if (this.f57730f.b()) {
            return;
        }
        if (java.lang.Double.isInfinite(d6) || java.lang.Double.isNaN(d6)) {
            throw p258z9.G.b(java.lang.Double.valueOf(d6), this.f57725a.f57775a.toString());
        }
    }

    @Override // p229w9.b, p229w9.j
    public void h(short s6) {
        if (this.f57731g) {
            E(java.lang.String.valueOf((int) s6));
        } else {
            this.f57725a.l(s6);
        }
    }

    @Override // p229w9.b, p229w9.j
    public void i(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "enumDescriptor");
        E(fVar.f(i6));
    }

    @Override // p229w9.b, p229w9.j
    public void j(byte b6) {
        if (this.f57731g) {
            E(java.lang.String.valueOf((int) b6));
        } else {
            this.f57725a.e(b6);
        }
    }

    @Override // p229w9.b, p229w9.j
    public void l(boolean z6) {
        if (this.f57731g) {
            E(java.lang.String.valueOf(z6));
        } else {
            this.f57725a.m(z6);
        }
    }

    @Override // p229w9.b, p229w9.j
    public void n(float f6) {
        if (this.f57731g) {
            E(java.lang.String.valueOf(f6));
        } else {
            this.f57725a.h(f6);
        }
        if (this.f57730f.b()) {
            return;
        }
        if (java.lang.Float.isInfinite(f6) || java.lang.Float.isNaN(f6)) {
            throw p258z9.G.b(java.lang.Float.valueOf(f6), this.f57725a.f57775a.toString());
        }
    }

    @Override // p229w9.b, p229w9.f
    public boolean o(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return this.f57730f.i();
    }

    @Override // p229w9.b, p229w9.j
    public void p(char c6) {
        E(java.lang.String.valueOf(c6));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005f  */
    @Override // p229w9.b, p229w9.j
    public void t(p199t9.e eVar, java.lang.Object obj) {
        java.lang.String strA;
        p247y7.AbstractC7350t.f(eVar, "serializer");
        if (!z().e().p()) {
            int i6 = z9.X.a.f57714a[z().e().f().ordinal()];
            if (i6 == 1 || i6 == 2) {
                strA = null;
            } else {
                if (i6 != 3) {
                    throw new p087i7.s();
                }
                p219v9.m mVarJ = eVar.a().j();
                if (p247y7.AbstractC7350t.b(mVarJ, v9.n.a.f56058a) || p247y7.AbstractC7350t.b(mVarJ, v9.n.d.f56061a)) {
                    strA = p258z9.X.a(eVar.a(), z());
                } else {
                    strA = null;
                }
            }
            if (strA != null) {
                java.lang.String strA2 = eVar.a().a();
                this.f57732h = strA;
                this.f57733i = strA2;
            }
        }
        eVar.e(this, obj);
    }

    @Override // p229w9.b, p229w9.j
    public p229w9.j w(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        if (p258z9.a0.b(fVar)) {
            p258z9.C7401n c7408v = this.f57725a;
            if (!(c7408v instanceof p258z9.C7408v)) {
                c7408v = new p258z9.C7408v(c7408v.f57775a, this.f57731g);
            }
            return new p258z9.Z(c7408v, z(), this.f57727c, (p249y9.s[]) null);
        }
        if (p258z9.a0.a(fVar)) {
            p258z9.C7401n c7402o = this.f57725a;
            if (!(c7402o instanceof p258z9.C7402o)) {
                c7402o = new p258z9.C7402o(c7402o.f57775a, this.f57731g);
            }
            return new p258z9.Z(c7402o, z(), this.f57727c, (p249y9.s[]) null);
        }
        if (this.f57732h == null) {
            return super.w(fVar);
        }
        this.f57733i = fVar.a();
        return this;
    }

    @Override // p229w9.b, p229w9.f
    public void x(p219v9.f fVar, int i6, p199t9.e eVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        p247y7.AbstractC7350t.f(eVar, "serializer");
        if (obj != null || this.f57730f.j()) {
            super.x(fVar, i6, eVar, obj);
        }
    }

    @Override // p249y9.s
    public p249y9.AbstractC7358b z() {
        return this.f57726b;
    }
}
