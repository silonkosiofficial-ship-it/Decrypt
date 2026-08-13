package p258z9;

/* JADX INFO: renamed from: z9.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC7390c extends p239x9.U implements p249y9.InterfaceC7364h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p249y9.AbstractC7358b f57741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p249y9.i f57742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.String f57743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final p249y9.C7363g f57744g;

    private AbstractC7390c(p249y9.AbstractC7358b abstractC7358b, p249y9.i iVar, java.lang.String str) {
        this.f57741d = abstractC7358b;
        this.f57742e = iVar;
        this.f57743f = str;
        this.f57744g = w0().e();
    }

    public /* synthetic */ AbstractC7390c(p249y9.AbstractC7358b abstractC7358b, p249y9.i iVar, java.lang.String str, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(abstractC7358b, iVar, (i6 & 4) != 0 ? null : str, null);
    }

    public /* synthetic */ AbstractC7390c(p249y9.AbstractC7358b abstractC7358b, p249y9.i iVar, java.lang.String str, p247y7.AbstractC7342k abstractC7342k) {
        this(abstractC7358b, iVar, str);
    }

    private final java.lang.Void A0(p249y9.F f6, java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb;
        java.lang.String str3;
        if (S8.r.V(str, "i", false, 2, null)) {
            sb = new java.lang.StringBuilder();
            str3 = "an ";
        } else {
            sb = new java.lang.StringBuilder();
            str3 = "a ";
        }
        sb.append(str3);
        sb.append(str);
        throw p258z9.G.f(-1, "Failed to parse literal '" + f6 + "' as " + sb.toString() + " value at element: " + z0(str2), k0().toString());
    }

    @Override // p229w9.h
    public p229w9.d a(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        p249y9.i iVarK0 = k0();
        p219v9.m mVarJ = fVar.j();
        if (p247y7.AbstractC7350t.b(mVarJ, v9.n.b.f56059a) || (mVarJ instanceof p219v9.c)) {
            p249y9.AbstractC7358b abstractC7358bW0 = w0();
            java.lang.String strA = fVar.a();
            if (iVarK0 instanceof p249y9.C7359c) {
                return new p258z9.S(abstractC7358bW0, (p249y9.C7359c) iVarK0);
            }
            throw p258z9.G.f(-1, "Expected " + p247y7.P.b(p249y9.C7359c.class).c() + ", but had " + p247y7.P.b(iVarK0.getClass()).c() + " as the serialized body of " + strA + " at element: " + g0(), iVarK0.toString());
        }
        if (!p247y7.AbstractC7350t.b(mVarJ, v9.n.c.f56060a)) {
            p249y9.AbstractC7358b abstractC7358bW1 = w0();
            java.lang.String strA2 = fVar.a();
            if (iVarK0 instanceof p249y9.D) {
                return new p258z9.P(abstractC7358bW1, (p249y9.D) iVarK0, this.f57743f, null, 8, null);
            }
            throw p258z9.G.f(-1, "Expected " + p247y7.P.b(p249y9.D.class).c() + ", but had " + p247y7.P.b(iVarK0.getClass()).c() + " as the serialized body of " + strA2 + " at element: " + g0(), iVarK0.toString());
        }
        p249y9.AbstractC7358b abstractC7358bW2 = w0();
        p219v9.f fVarA = p258z9.j0.a(fVar.h(0), abstractC7358bW2.f());
        p219v9.m mVarJ2 = fVarA.j();
        if ((mVarJ2 instanceof p219v9.d) || p247y7.AbstractC7350t.b(mVarJ2, v9.m.b.f56057a)) {
            p249y9.AbstractC7358b abstractC7358bW3 = w0();
            java.lang.String strA3 = fVar.a();
            if (iVarK0 instanceof p249y9.D) {
                return new p258z9.U(abstractC7358bW3, (p249y9.D) iVarK0);
            }
            throw p258z9.G.f(-1, "Expected " + p247y7.P.b(p249y9.D.class).c() + ", but had " + p247y7.P.b(iVarK0.getClass()).c() + " as the serialized body of " + strA3 + " at element: " + g0(), iVarK0.toString());
        }
        if (!abstractC7358bW2.e().c()) {
            throw p258z9.G.d(fVarA);
        }
        p249y9.AbstractC7358b abstractC7358bW4 = w0();
        java.lang.String strA4 = fVar.a();
        if (iVarK0 instanceof p249y9.C7359c) {
            return new p258z9.S(abstractC7358bW4, (p249y9.C7359c) iVarK0);
        }
        throw p258z9.G.f(-1, "Expected " + p247y7.P.b(p249y9.C7359c.class).c() + ", but had " + p247y7.P.b(iVarK0.getClass()).c() + " as the serialized body of " + strA4 + " at element: " + g0(), iVarK0.toString());
    }

    public void b(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
    }

    @Override // p239x9.U
    protected java.lang.String c0(java.lang.String str, java.lang.String str2) {
        p247y7.AbstractC7350t.f(str, "parentName");
        p247y7.AbstractC7350t.f(str2, "childName");
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract p249y9.i j0(java.lang.String str);

    protected final p249y9.i k0() {
        p249y9.i iVarJ0;
        java.lang.String str = (java.lang.String) W();
        return (str == null || (iVarJ0 = j0(str)) == null) ? y0() : iVarJ0;
    }

    @Override // p249y9.InterfaceC7364h
    public p249y9.i l() {
        return k0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.B0
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public boolean L(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "tag");
        p249y9.i iVarJ0 = j0(str);
        if (iVarJ0 instanceof p249y9.F) {
            p249y9.F f6 = (p249y9.F) iVarJ0;
            try {
                java.lang.Boolean boolD = p249y9.j.d(f6);
                if (boolD != null) {
                    return boolD.booleanValue();
                }
                A0(f6, "boolean", str);
                throw new p087i7.C6665k();
            } catch (java.lang.IllegalArgumentException unused) {
                A0(f6, "boolean", str);
                throw new p087i7.C6665k();
            }
        }
        throw p258z9.G.f(-1, "Expected " + p247y7.P.b(p249y9.F.class).c() + ", but had " + p247y7.P.b(iVarJ0.getClass()).c() + " as the serialized body of boolean at element: " + z0(str), iVarJ0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.B0
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public byte M(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "tag");
        p249y9.i iVarJ0 = j0(str);
        if (iVarJ0 instanceof p249y9.F) {
            p249y9.F f6 = (p249y9.F) iVarJ0;
            try {
                long jI = p249y9.j.i(f6);
                java.lang.Byte bValueOf = (-128 > jI || jI > 127) ? null : java.lang.Byte.valueOf((byte) jI);
                if (bValueOf != null) {
                    return bValueOf.byteValue();
                }
                A0(f6, "byte", str);
                throw new p087i7.C6665k();
            } catch (java.lang.IllegalArgumentException unused) {
                A0(f6, "byte", str);
                throw new p087i7.C6665k();
            }
        }
        throw p258z9.G.f(-1, "Expected " + p247y7.P.b(p249y9.F.class).c() + ", but had " + p247y7.P.b(iVarJ0.getClass()).c() + " as the serialized body of byte at element: " + z0(str), iVarJ0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.B0
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public char N(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "tag");
        p249y9.i iVarJ0 = j0(str);
        if (iVarJ0 instanceof p249y9.F) {
            p249y9.F f6 = (p249y9.F) iVarJ0;
            try {
                return S8.r.A1(f6.d());
            } catch (java.lang.IllegalArgumentException unused) {
                A0(f6, "char", str);
                throw new p087i7.C6665k();
            }
        }
        throw p258z9.G.f(-1, "Expected " + p247y7.P.b(p249y9.F.class).c() + ", but had " + p247y7.P.b(iVarJ0.getClass()).c() + " as the serialized body of char at element: " + z0(str), iVarJ0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.B0
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public double O(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "tag");
        p249y9.i iVarJ0 = j0(str);
        if (iVarJ0 instanceof p249y9.F) {
            p249y9.F f6 = (p249y9.F) iVarJ0;
            try {
                double dF = p249y9.j.f(f6);
                if (w0().e().b() || !(java.lang.Double.isInfinite(dF) || java.lang.Double.isNaN(dF))) {
                    return dF;
                }
                throw p258z9.G.a(java.lang.Double.valueOf(dF), str, k0().toString());
            } catch (java.lang.IllegalArgumentException unused) {
                A0(f6, "double", str);
                throw new p087i7.C6665k();
            }
        }
        throw p258z9.G.f(-1, "Expected " + p247y7.P.b(p249y9.F.class).c() + ", but had " + p247y7.P.b(iVarJ0.getClass()).c() + " as the serialized body of double at element: " + z0(str), iVarJ0.toString());
    }

    @Override // p239x9.B0, p229w9.h
    public p229w9.h p(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return W() != null ? super.p(fVar) : new p258z9.K(w0(), y0(), this.f57743f).p(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.B0
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public int P(java.lang.String str, p219v9.f fVar) {
        p247y7.AbstractC7350t.f(str, "tag");
        p247y7.AbstractC7350t.f(fVar, "enumDescriptor");
        p249y9.AbstractC7358b abstractC7358bW0 = w0();
        p249y9.i iVarJ0 = j0(str);
        java.lang.String strA = fVar.a();
        if (iVarJ0 instanceof p249y9.F) {
            return p258z9.I.k(fVar, abstractC7358bW0, ((p249y9.F) iVarJ0).d(), null, 4, null);
        }
        throw p258z9.G.f(-1, "Expected " + p247y7.P.b(p249y9.F.class).c() + ", but had " + p247y7.P.b(iVarJ0.getClass()).c() + " as the serialized body of " + strA + " at element: " + z0(str), iVarJ0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.B0
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public float Q(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "tag");
        p249y9.i iVarJ0 = j0(str);
        if (iVarJ0 instanceof p249y9.F) {
            p249y9.F f6 = (p249y9.F) iVarJ0;
            try {
                float fG = p249y9.j.g(f6);
                if (w0().e().b() || !(java.lang.Float.isInfinite(fG) || java.lang.Float.isNaN(fG))) {
                    return fG;
                }
                throw p258z9.G.a(java.lang.Float.valueOf(fG), str, k0().toString());
            } catch (java.lang.IllegalArgumentException unused) {
                A0(f6, "float", str);
                throw new p087i7.C6665k();
            }
        }
        throw p258z9.G.f(-1, "Expected " + p247y7.P.b(p249y9.F.class).c() + ", but had " + p247y7.P.b(iVarJ0.getClass()).c() + " as the serialized body of float at element: " + z0(str), iVarJ0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.B0
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public p229w9.h R(java.lang.String str, p219v9.f fVar) {
        p247y7.AbstractC7350t.f(str, "tag");
        p247y7.AbstractC7350t.f(fVar, "inlineDescriptor");
        if (!p258z9.a0.b(fVar)) {
            return super.R(str, fVar);
        }
        p249y9.AbstractC7358b abstractC7358bW0 = w0();
        p249y9.i iVarJ0 = j0(str);
        java.lang.String strA = fVar.a();
        if (iVarJ0 instanceof p249y9.F) {
            return new p258z9.B(p258z9.c0.a(abstractC7358bW0, ((p249y9.F) iVarJ0).d()), w0());
        }
        throw p258z9.G.f(-1, "Expected " + p247y7.P.b(p249y9.F.class).c() + ", but had " + p247y7.P.b(iVarJ0.getClass()).c() + " as the serialized body of " + strA + " at element: " + z0(str), iVarJ0.toString());
    }

    @Override // p229w9.h
    public boolean s() {
        return !(k0() instanceof p249y9.A);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.B0
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public int S(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "tag");
        p249y9.i iVarJ0 = j0(str);
        if (iVarJ0 instanceof p249y9.F) {
            p249y9.F f6 = (p249y9.F) iVarJ0;
            try {
                long jI = p249y9.j.i(f6);
                java.lang.Integer numValueOf = (-2147483648L > jI || jI > 2147483647L) ? null : java.lang.Integer.valueOf((int) jI);
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                A0(f6, "int", str);
                throw new p087i7.C6665k();
            } catch (java.lang.IllegalArgumentException unused) {
                A0(f6, "int", str);
                throw new p087i7.C6665k();
            }
        }
        throw p258z9.G.f(-1, "Expected " + p247y7.P.b(p249y9.F.class).c() + ", but had " + p247y7.P.b(iVarJ0.getClass()).c() + " as the serialized body of int at element: " + z0(str), iVarJ0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.B0
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public long T(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "tag");
        p249y9.i iVarJ0 = j0(str);
        if (iVarJ0 instanceof p249y9.F) {
            p249y9.F f6 = (p249y9.F) iVarJ0;
            try {
                return p249y9.j.i(f6);
            } catch (java.lang.IllegalArgumentException unused) {
                A0(f6, "long", str);
                throw new p087i7.C6665k();
            }
        }
        throw p258z9.G.f(-1, "Expected " + p247y7.P.b(p249y9.F.class).c() + ", but had " + p247y7.P.b(iVarJ0.getClass()).c() + " as the serialized body of long at element: " + z0(str), iVarJ0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.B0
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public short U(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "tag");
        p249y9.i iVarJ0 = j0(str);
        if (iVarJ0 instanceof p249y9.F) {
            p249y9.F f6 = (p249y9.F) iVarJ0;
            try {
                long jI = p249y9.j.i(f6);
                java.lang.Short shValueOf = (-32768 > jI || jI > 32767) ? null : java.lang.Short.valueOf((short) jI);
                if (shValueOf != null) {
                    return shValueOf.shortValue();
                }
                A0(f6, "short", str);
                throw new p087i7.C6665k();
            } catch (java.lang.IllegalArgumentException unused) {
                A0(f6, "short", str);
                throw new p087i7.C6665k();
            }
        }
        throw p258z9.G.f(-1, "Expected " + p247y7.P.b(p249y9.F.class).c() + ", but had " + p247y7.P.b(iVarJ0.getClass()).c() + " as the serialized body of short at element: " + z0(str), iVarJ0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.B0
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public java.lang.String V(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "tag");
        p249y9.i iVarJ0 = j0(str);
        if (!(iVarJ0 instanceof p249y9.F)) {
            throw p258z9.G.f(-1, "Expected " + p247y7.P.b(p249y9.F.class).c() + ", but had " + p247y7.P.b(iVarJ0.getClass()).c() + " as the serialized body of string at element: " + z0(str), iVarJ0.toString());
        }
        p249y9.F f6 = (p249y9.F) iVarJ0;
        if (!(f6 instanceof p249y9.w)) {
            throw p258z9.G.f(-1, "Expected string value for a non-null key '" + str + "', got null literal instead at element: " + z0(str), k0().toString());
        }
        p249y9.w wVar = (p249y9.w) f6;
        if (wVar.f() || w0().e().q()) {
            return wVar.d();
        }
        throw p258z9.G.f(-1, "String literal for key '" + str + "' should be quoted at element: " + z0(str) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", k0().toString());
    }

    public p249y9.AbstractC7358b w0() {
        return this.f57741d;
    }

    @Override // p239x9.B0, p229w9.h
    public java.lang.Object x(p199t9.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "deserializer");
        return aVar.b(this);
    }

    protected final java.lang.String x0() {
        return this.f57743f;
    }

    public abstract p249y9.i y0();

    public final java.lang.String z0(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "currentTag");
        return g0() + '.' + str;
    }
}
