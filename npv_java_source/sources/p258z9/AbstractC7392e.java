package p258z9;

/* JADX INFO: renamed from: z9.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC7392e extends p239x9.V implements p249y9.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p249y9.AbstractC7358b f57746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p237x7.l f57747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final p249y9.C7363g f57748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.String f57749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.lang.String f57750f;

    /* JADX INFO: renamed from: z9.e$a */
    public static final class a extends p229w9.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.String f57752b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p219v9.f f57753c;

        a(java.lang.String str, p219v9.f fVar) {
            this.f57752b = str;
            this.f57753c = fVar;
        }

        @Override // p229w9.b, p229w9.j
        public void E(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "value");
            p258z9.AbstractC7392e.this.v0(this.f57752b, new p249y9.w(str, false, this.f57753c));
        }
    }

    /* JADX INFO: renamed from: z9.e$b */
    public static final class b extends p229w9.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final A9.b f57754a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.lang.String f57756c;

        b(java.lang.String str) {
            this.f57756c = str;
            this.f57754a = p258z9.AbstractC7392e.this.z().f();
        }

        @Override // p229w9.b, p229w9.j
        public void A(int i6) {
            I(java.lang.Long.toString(((long) p087i7.E.g(i6)) & 4294967295L, 10));
        }

        @Override // p229w9.b, p229w9.j
        public void D(long j6) {
            I(p258z9.AbstractC7395h.a(p087i7.G.g(j6), 10));
        }

        public final void I(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "s");
            p258z9.AbstractC7392e.this.v0(this.f57756c, new p249y9.w(str, false, null, 4, null));
        }

        @Override // p229w9.b, p229w9.j
        public void h(short s6) {
            I(p087i7.J.n(p087i7.J.g(s6)));
        }

        @Override // p229w9.b, p229w9.j
        public void j(byte b6) {
            I(p087i7.C.n(p087i7.C.g(b6)));
        }
    }

    private AbstractC7392e(p249y9.AbstractC7358b abstractC7358b, p237x7.l lVar) {
        this.f57746b = abstractC7358b;
        this.f57747c = lVar;
        this.f57748d = abstractC7358b.e();
    }

    public /* synthetic */ AbstractC7392e(p249y9.AbstractC7358b abstractC7358b, p237x7.l lVar, p247y7.AbstractC7342k abstractC7342k) {
        this(abstractC7358b, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M d0(p258z9.AbstractC7392e abstractC7392e, p249y9.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "node");
        abstractC7392e.v0((java.lang.String) abstractC7392e.T(), iVar);
        return p087i7.M.f46721a;
    }

    private final p258z9.AbstractC7392e.a t0(java.lang.String str, p219v9.f fVar) {
        return new p258z9.AbstractC7392e.a(str, fVar);
    }

    private final p258z9.AbstractC7392e.b u0(java.lang.String str) {
        return new p258z9.AbstractC7392e.b(str);
    }

    @Override // p239x9.C0
    protected void S(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        this.f57747c.l(q0());
    }

    @Override // p239x9.V
    protected java.lang.String Y(java.lang.String str, java.lang.String str2) {
        p247y7.AbstractC7350t.f(str, "parentName");
        p247y7.AbstractC7350t.f(str2, "childName");
        return str2;
    }

    @Override // p239x9.V
    protected java.lang.String Z(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return p258z9.I.h(fVar, this.f57746b, i6);
    }

    @Override // p229w9.j
    public p229w9.f a(p219v9.f fVar) {
        p258z9.AbstractC7392e t6;
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        p237x7.l lVar = U() == null ? this.f57747c : new p237x7.l() { // from class: z9.d
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return p258z9.AbstractC7392e.d0(this.f57745C, (p249y9.i) obj);
            }
        };
        p219v9.m mVarJ = fVar.j();
        if (p247y7.AbstractC7350t.b(mVarJ, v9.n.b.f56059a) || (mVarJ instanceof p219v9.c)) {
            t6 = new p258z9.T(this.f57746b, lVar);
        } else if (p247y7.AbstractC7350t.b(mVarJ, v9.n.c.f56060a)) {
            p249y9.AbstractC7358b abstractC7358b = this.f57746b;
            p219v9.f fVarA = p258z9.j0.a(fVar.h(0), abstractC7358b.f());
            p219v9.m mVarJ2 = fVarA.j();
            if ((mVarJ2 instanceof p219v9.d) || p247y7.AbstractC7350t.b(mVarJ2, v9.m.b.f56057a)) {
                t6 = new p258z9.V(this.f57746b, lVar);
            } else {
                if (!abstractC7358b.e().c()) {
                    throw p258z9.G.d(fVarA);
                }
                t6 = new p258z9.T(this.f57746b, lVar);
            }
        } else {
            t6 = new p258z9.Q(this.f57746b, lVar);
        }
        java.lang.String str = this.f57749e;
        if (str != null) {
            if (t6 instanceof p258z9.V) {
                p258z9.V v6 = (p258z9.V) t6;
                v6.v0("key", p249y9.j.c(str));
                java.lang.String strA = this.f57750f;
                if (strA == null) {
                    strA = fVar.a();
                }
                v6.v0("value", p249y9.j.c(strA));
            } else {
                java.lang.String strA2 = this.f57750f;
                if (strA2 == null) {
                    strA2 = fVar.a();
                }
                t6.v0(str, p249y9.j.c(strA2));
            }
            this.f57749e = null;
            this.f57750f = null;
        }
        return t6;
    }

    @Override // p229w9.j
    public void d() {
        java.lang.String str = (java.lang.String) U();
        if (str == null) {
            this.f57747c.l(p249y9.A.INSTANCE);
        } else {
            n0(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.C0
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void H(java.lang.String str, boolean z6) {
        p247y7.AbstractC7350t.f(str, "tag");
        v0(str, p249y9.j.a(java.lang.Boolean.valueOf(z6)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.C0
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void I(java.lang.String str, byte b6) {
        p247y7.AbstractC7350t.f(str, "tag");
        v0(str, p249y9.j.b(java.lang.Byte.valueOf(b6)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.C0
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void J(java.lang.String str, char c6) {
        p247y7.AbstractC7350t.f(str, "tag");
        v0(str, p249y9.j.c(java.lang.String.valueOf(c6)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.C0
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void K(java.lang.String str, double d6) {
        p247y7.AbstractC7350t.f(str, "tag");
        v0(str, p249y9.j.b(java.lang.Double.valueOf(d6)));
        if (this.f57748d.b()) {
            return;
        }
        if (java.lang.Double.isInfinite(d6) || java.lang.Double.isNaN(d6)) {
            throw p258z9.G.c(java.lang.Double.valueOf(d6), str, q0().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.C0
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void L(java.lang.String str, p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(str, "tag");
        p247y7.AbstractC7350t.f(fVar, "enumDescriptor");
        v0(str, p249y9.j.c(fVar.f(i6)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.C0
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void M(java.lang.String str, float f6) {
        p247y7.AbstractC7350t.f(str, "tag");
        v0(str, p249y9.j.b(java.lang.Float.valueOf(f6)));
        if (this.f57748d.b()) {
            return;
        }
        if (java.lang.Float.isInfinite(f6) || java.lang.Float.isNaN(f6)) {
            throw p258z9.G.c(java.lang.Float.valueOf(f6), str, q0().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.C0
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public p229w9.j N(java.lang.String str, p219v9.f fVar) {
        p247y7.AbstractC7350t.f(str, "tag");
        p247y7.AbstractC7350t.f(fVar, "inlineDescriptor");
        if (p258z9.a0.b(fVar)) {
            return u0(str);
        }
        return p258z9.a0.a(fVar) ? t0(str, fVar) : super.N(str, fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.C0
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void O(java.lang.String str, int i6) {
        p247y7.AbstractC7350t.f(str, "tag");
        v0(str, p249y9.j.b(java.lang.Integer.valueOf(i6)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.C0
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void P(java.lang.String str, long j6) {
        p247y7.AbstractC7350t.f(str, "tag");
        v0(str, p249y9.j.b(java.lang.Long.valueOf(j6)));
    }

    protected void n0(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "tag");
        v0(str, p249y9.A.INSTANCE);
    }

    @Override // p229w9.f
    public boolean o(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return this.f57748d.i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.C0
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public void Q(java.lang.String str, short s6) {
        p247y7.AbstractC7350t.f(str, "tag");
        v0(str, p249y9.j.b(java.lang.Short.valueOf(s6)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.C0
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void R(java.lang.String str, java.lang.String str2) {
        p247y7.AbstractC7350t.f(str, "tag");
        p247y7.AbstractC7350t.f(str2, "value");
        v0(str, p249y9.j.c(str2));
    }

    @Override // p229w9.j
    public void q() {
    }

    public abstract p249y9.i q0();

    protected final p237x7.l r0() {
        return this.f57747c;
    }

    public final A9.b s0() {
        return this.f57746b.f();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0085  */
    @Override // p239x9.C0, p229w9.j
    public void t(p199t9.e eVar, java.lang.Object obj) {
        java.lang.String strA;
        p247y7.AbstractC7350t.f(eVar, "serializer");
        if (U() == null && p258z9.h0.c(p258z9.j0.a(eVar.a(), s0()))) {
            new p258z9.L(this.f57746b, this.f57747c).t(eVar, obj);
            return;
        }
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
                this.f57749e = strA;
                this.f57750f = strA2;
            }
        }
        eVar.e(this, obj);
    }

    public abstract void v0(java.lang.String str, p249y9.i iVar);

    @Override // p239x9.C0, p229w9.j
    public p229w9.j w(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        if (U() == null) {
            return new p258z9.L(this.f57746b, this.f57747c).w(fVar);
        }
        if (this.f57749e != null) {
            this.f57750f = fVar.a();
        }
        return super.w(fVar);
    }

    @Override // p249y9.s
    public final p249y9.AbstractC7358b z() {
        return this.f57746b;
    }
}
