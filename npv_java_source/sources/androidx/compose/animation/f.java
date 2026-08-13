package androidx.compose.animation;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p200u.x0 f18733a = p200u.z0.a(androidx.compose.animation.f.a.f18737D, androidx.compose.animation.f.b.f18738D);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p200u.C7180l0 f18734b = p200u.AbstractC7177k.j(0.0f, 400.0f, null, 5, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p200u.C7180l0 f18735c = p200u.AbstractC7177k.j(0.0f, 400.0f, Y0.p.b(p200u.Q0.c(Y0.p.f16221b)), 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p200u.C7180l0 f18736d = p200u.AbstractC7177k.j(0.0f, 400.0f, Y0.t.b(p200u.Q0.d(Y0.t.f16230b)), 1, null);

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.animation.f.a f18737D = new androidx.compose.animation.f.a();

        a() {
            super(1);
        }

        public final p200u.C7185o a(long j6) {
            return new p200u.C7185o(androidx.compose.ui.graphics.f.f(j6), androidx.compose.ui.graphics.f.g(j6));
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((androidx.compose.ui.graphics.f) obj).j());
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.animation.f.b f18738D = new androidx.compose.animation.f.b();

        b() {
            super(1);
        }

        public final long a(p200u.C7185o c7185o) {
            return p141o0.m2.a(c7185o.f(), c7185o.g());
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return androidx.compose.ui.graphics.f.b(a((p200u.C7185o) obj));
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.h f18739D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.j f18740E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.animation.h hVar, androidx.compose.animation.j jVar) {
            super(1);
            this.f18739D = hVar;
            this.f18740E = jVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p200u.I l(u.s0.b bVar) {
            p190t.o oVarC;
            p200u.I iB;
            p200u.I iB2;
            p190t.m mVar = p190t.m.PreEnter;
            p190t.m mVar2 = p190t.m.Visible;
            if (bVar.c(mVar, mVar2)) {
                p190t.o oVarC2 = this.f18739D.b().c();
                if (oVarC2 != null && (iB2 = oVarC2.b()) != null) {
                    return iB2;
                }
            } else if (bVar.c(mVar2, p190t.m.PostExit) && (oVarC = this.f18740E.b().c()) != null && (iB = oVarC.b()) != null) {
                return iB;
            }
            return androidx.compose.animation.f.f18734b;
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.h f18741D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.j f18742E;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f18743a;

            static {
                int[] iArr = new int[p190t.m.values().length];
                try {
                    iArr[p190t.m.Visible.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[p190t.m.PreEnter.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[p190t.m.PostExit.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                f18743a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.animation.h hVar, androidx.compose.animation.j jVar) {
            super(1);
            this.f18741D = hVar;
            this.f18742E = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001f A[PHI: r3
  0x001f: PHI (r3v7 t.o) = (r3v6 t.o), (r3v11 t.o) binds: [B:14:0x0034, B:9:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Float l(p190t.m mVar) {
            p190t.o oVarC;
            int i6 = androidx.compose.animation.f.d.a.f18743a[mVar.ordinal()];
            float fA = 1.0f;
            if (i6 != 1) {
                if (i6 == 2) {
                    oVarC = this.f18741D.b().c();
                    if (oVarC != null) {
                        fA = oVarC.a();
                    }
                } else {
                    if (i6 != 3) {
                        throw new p087i7.s();
                    }
                    oVarC = this.f18742E.b().c();
                    if (oVarC != null) {
                        fA = oVarC.a();
                    }
                }
            }
            return java.lang.Float.valueOf(fA);
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.G1 f18744D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ V.G1 f18745E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ V.G1 f18746F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(V.G1 g6, V.G1 g10, V.G1 g11) {
            super(1);
            this.f18744D = g6;
            this.f18745E = g10;
            this.f18746F = g11;
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            V.G1 g6 = this.f18744D;
            cVar.b(g6 != null ? ((java.lang.Number) g6.getValue()).floatValue() : 1.0f);
            V.G1 g10 = this.f18745E;
            cVar.h(g10 != null ? ((java.lang.Number) g10.getValue()).floatValue() : 1.0f);
            V.G1 g11 = this.f18745E;
            cVar.g(g11 != null ? ((java.lang.Number) g11.getValue()).floatValue() : 1.0f);
            V.G1 g12 = this.f18746F;
            cVar.T0(g12 != null ? ((androidx.compose.ui.graphics.f) g12.getValue()).j() : androidx.compose.ui.graphics.f.f19784b.a());
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((androidx.compose.ui.graphics.c) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.f$f, reason: collision with other inner class name */
    static final class C0353f extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.h f18747D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.j f18748E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0353f(androidx.compose.animation.h hVar, androidx.compose.animation.j jVar) {
            super(1);
            this.f18747D = hVar;
            this.f18748E = jVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p200u.I l(u.s0.b bVar) {
            p190t.v vVarE;
            p200u.I iA;
            p200u.I iA2;
            p190t.m mVar = p190t.m.PreEnter;
            p190t.m mVar2 = p190t.m.Visible;
            if (bVar.c(mVar, mVar2)) {
                p190t.v vVarE2 = this.f18747D.b().e();
                if (vVarE2 != null && (iA2 = vVarE2.a()) != null) {
                    return iA2;
                }
            } else if (bVar.c(mVar2, p190t.m.PostExit) && (vVarE = this.f18748E.b().e()) != null && (iA = vVarE.a()) != null) {
                return iA;
            }
            return androidx.compose.animation.f.f18734b;
        }
    }

    static final class g extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.h f18749D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.j f18750E;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f18751a;

            static {
                int[] iArr = new int[p190t.m.values().length];
                try {
                    iArr[p190t.m.Visible.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[p190t.m.PreEnter.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[p190t.m.PostExit.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                f18751a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(androidx.compose.animation.h hVar, androidx.compose.animation.j jVar) {
            super(1);
            this.f18749D = hVar;
            this.f18750E = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001f A[PHI: r3
  0x001f: PHI (r3v7 t.v) = (r3v6 t.v), (r3v11 t.v) binds: [B:14:0x0034, B:9:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Float l(p190t.m mVar) {
            p190t.v vVarE;
            int i6 = androidx.compose.animation.f.g.a.f18751a[mVar.ordinal()];
            float fB = 1.0f;
            if (i6 != 1) {
                if (i6 == 2) {
                    vVarE = this.f18749D.b().e();
                    if (vVarE != null) {
                        fB = vVarE.b();
                    }
                } else {
                    if (i6 != 3) {
                        throw new p087i7.s();
                    }
                    vVarE = this.f18750E.b().e();
                    if (vVarE != null) {
                        fB = vVarE.b();
                    }
                }
            }
            return java.lang.Float.valueOf(fB);
        }
    }

    static final class h extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.animation.f.h f18752D = new androidx.compose.animation.f.h();

        h() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p200u.I l(u.s0.b bVar) {
            return p200u.AbstractC7177k.j(0.0f, 0.0f, null, 7, null);
        }
    }

    static final class i extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.f f18753D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.h f18754E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.j f18755F;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f18756a;

            static {
                int[] iArr = new int[p190t.m.values().length];
                try {
                    iArr[p190t.m.Visible.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[p190t.m.PreEnter.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[p190t.m.PostExit.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                f18756a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(androidx.compose.ui.graphics.f fVar, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar) {
            super(1);
            this.f18753D = fVar;
            this.f18754E = hVar;
            this.f18755F = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001e A[PHI: r3
  0x001e: PHI (r3v10 t.v) = (r3v6 t.v), (r3v9 t.v), (r3v14 t.v), (r3v17 t.v) binds: [B:17:0x0044, B:20:0x0051, B:9:0x001c, B:12:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
        public final long a(p190t.m mVar) {
            androidx.compose.ui.graphics.f fVarB;
            p190t.v vVarE;
            int i6 = androidx.compose.animation.f.i.a.f18756a[mVar.ordinal()];
            if (i6 != 1) {
                fVarB = null;
                if (i6 == 2) {
                    vVarE = this.f18754E.b().e();
                    if (vVarE != null || (vVarE = this.f18755F.b().e()) != null) {
                        fVarB = androidx.compose.ui.graphics.f.b(vVarE.c());
                    }
                } else {
                    if (i6 != 3) {
                        throw new p087i7.s();
                    }
                    vVarE = this.f18755F.b().e();
                    if (vVarE != null || (vVarE = this.f18754E.b().e()) != null) {
                        fVarB = androidx.compose.ui.graphics.f.b(vVarE.c());
                    }
                }
            } else {
                fVarB = this.f18753D;
            }
            return fVarB != null ? fVarB.j() : androidx.compose.ui.graphics.f.f19784b.a();
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return androidx.compose.ui.graphics.f.b(a((p190t.m) obj));
        }
    }

    static final class j extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.animation.f.j f18757D = new androidx.compose.animation.f.j();

        j() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean b() {
            return java.lang.Boolean.TRUE;
        }
    }

    static final class k extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ boolean f18758D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.a f18759E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z6, p237x7.a aVar) {
            super(1);
            this.f18758D = z6;
            this.f18759E = aVar;
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            cVar.A(!this.f18758D && ((java.lang.Boolean) this.f18759E.b()).booleanValue());
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((androidx.compose.ui.graphics.c) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class l extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.animation.f.l f18760D = new androidx.compose.animation.f.l();

        l() {
            super(1);
        }

        public final java.lang.Integer a(int i6) {
            return 0;
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((java.lang.Number) obj).intValue());
        }
    }

    static final class m extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.l f18761D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(p237x7.l lVar) {
            super(1);
            this.f18761D = lVar;
        }

        public final long a(long j6) {
            return Y0.u.a(((java.lang.Number) this.f18761D.l(java.lang.Integer.valueOf(Y0.t.g(j6)))).intValue(), Y0.t.f(j6));
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return Y0.t.b(a(((Y0.t) obj).j()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class n extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.animation.f.n f18762D = new androidx.compose.animation.f.n();

        n() {
            super(1);
        }

        public final long a(long j6) {
            return Y0.u.a(0, 0);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return Y0.t.b(a(((Y0.t) obj).j()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class o extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.animation.f.o f18763D = new androidx.compose.animation.f.o();

        o() {
            super(1);
        }

        public final java.lang.Integer a(int i6) {
            return 0;
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((java.lang.Number) obj).intValue());
        }
    }

    static final class p extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.l f18764D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(p237x7.l lVar) {
            super(1);
            this.f18764D = lVar;
        }

        public final long a(long j6) {
            return Y0.u.a(Y0.t.g(j6), ((java.lang.Number) this.f18764D.l(java.lang.Integer.valueOf(Y0.t.f(j6)))).intValue());
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return Y0.t.b(a(((Y0.t) obj).j()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class q extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.animation.f.q f18765D = new androidx.compose.animation.f.q();

        q() {
            super(1);
        }

        public final java.lang.Integer a(int i6) {
            return 0;
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((java.lang.Number) obj).intValue());
        }
    }

    static final class r extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.l f18766D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(p237x7.l lVar) {
            super(1);
            this.f18766D = lVar;
        }

        public final long a(long j6) {
            return Y0.u.a(((java.lang.Number) this.f18766D.l(java.lang.Integer.valueOf(Y0.t.g(j6)))).intValue(), Y0.t.f(j6));
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return Y0.t.b(a(((Y0.t) obj).j()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class s extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.animation.f.s f18767D = new androidx.compose.animation.f.s();

        s() {
            super(1);
        }

        public final long a(long j6) {
            return Y0.u.a(0, 0);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return Y0.t.b(a(((Y0.t) obj).j()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class t extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.animation.f.t f18768D = new androidx.compose.animation.f.t();

        t() {
            super(1);
        }

        public final java.lang.Integer a(int i6) {
            return 0;
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((java.lang.Number) obj).intValue());
        }
    }

    static final class u extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.l f18769D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(p237x7.l lVar) {
            super(1);
            this.f18769D = lVar;
        }

        public final long a(long j6) {
            return Y0.u.a(Y0.t.g(j6), ((java.lang.Number) this.f18769D.l(java.lang.Integer.valueOf(Y0.t.f(j6)))).intValue());
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return Y0.t.b(a(((Y0.t) obj).j()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class v extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.animation.f.v f18770D = new androidx.compose.animation.f.v();

        v() {
            super(1);
        }

        public final java.lang.Integer a(int i6) {
            return java.lang.Integer.valueOf((-i6) / 2);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((java.lang.Number) obj).intValue());
        }
    }

    static final class w extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.l f18771D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(p237x7.l lVar) {
            super(1);
            this.f18771D = lVar;
        }

        public final long a(long j6) {
            return Y0.q.a(0, ((java.lang.Number) this.f18771D.l(java.lang.Integer.valueOf(Y0.t.f(j6)))).intValue());
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return Y0.p.b(a(((Y0.t) obj).j()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class x extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.animation.f.x f18772D = new androidx.compose.animation.f.x();

        x() {
            super(1);
        }

        public final java.lang.Integer a(int i6) {
            return java.lang.Integer.valueOf((-i6) / 2);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((java.lang.Number) obj).intValue());
        }
    }

    static final class y extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.l f18773D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(p237x7.l lVar) {
            super(1);
            this.f18773D = lVar;
        }

        public final long a(long j6) {
            return Y0.q.a(0, ((java.lang.Number) this.f18773D.l(java.lang.Integer.valueOf(Y0.t.f(j6)))).intValue());
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return Y0.p.b(a(((Y0.t) obj).j()));
        }
    }

    public static /* synthetic */ androidx.compose.animation.j A(p200u.I i6, p071h0.c.InterfaceC0526c interfaceC0526c, boolean z6, p237x7.l lVar, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            i6 = p200u.AbstractC7177k.j(0.0f, 400.0f, Y0.t.b(p200u.Q0.d(Y0.t.f16230b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            interfaceC0526c = p071h0.c.f45778a.a();
        }
        if ((i10 & 4) != 0) {
            z6 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = androidx.compose.animation.f.t.f18768D;
        }
        return z(i6, interfaceC0526c, z6, lVar);
    }

    public static final androidx.compose.animation.h B(p200u.I i6, p237x7.l lVar) {
        return new androidx.compose.animation.i(new p190t.C(null, new p190t.y(lVar, i6), null, null, false, null, 61, null));
    }

    public static final androidx.compose.animation.h C(p200u.I i6, p237x7.l lVar) {
        return B(i6, new androidx.compose.animation.f.w(lVar));
    }

    public static /* synthetic */ androidx.compose.animation.h D(p200u.I i6, p237x7.l lVar, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            i6 = p200u.AbstractC7177k.j(0.0f, 400.0f, Y0.p.b(p200u.Q0.c(Y0.p.f16221b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            lVar = androidx.compose.animation.f.v.f18770D;
        }
        return C(i6, lVar);
    }

    public static final androidx.compose.animation.j E(p200u.I i6, p237x7.l lVar) {
        return new androidx.compose.animation.k(new p190t.C(null, new p190t.y(lVar, i6), null, null, false, null, 61, null));
    }

    public static final androidx.compose.animation.j F(p200u.I i6, p237x7.l lVar) {
        return E(i6, new androidx.compose.animation.f.y(lVar));
    }

    public static /* synthetic */ androidx.compose.animation.j G(p200u.I i6, p237x7.l lVar, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            i6 = p200u.AbstractC7177k.j(0.0f, 400.0f, Y0.p.b(p200u.Q0.c(Y0.p.f16221b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            lVar = androidx.compose.animation.f.x.f18772D;
        }
        return F(i6, lVar);
    }

    private static final p071h0.c H(h0.c.b bVar) {
        h0.c.a aVar = p071h0.c.f45778a;
        if (p247y7.AbstractC7350t.b(bVar, aVar.k())) {
            return aVar.h();
        }
        return p247y7.AbstractC7350t.b(bVar, aVar.j()) ? aVar.f() : aVar.e();
    }

    private static final p071h0.c I(p071h0.c.InterfaceC0526c interfaceC0526c) {
        h0.c.a aVar = p071h0.c.f45778a;
        if (p247y7.AbstractC7350t.b(interfaceC0526c, aVar.l())) {
            return aVar.m();
        }
        return p247y7.AbstractC7350t.b(interfaceC0526c, aVar.a()) ? aVar.b() : aVar.e();
    }

    public static final androidx.compose.animation.h J(p200u.s0 s0Var, androidx.compose.animation.h hVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        androidx.compose.animation.h hVarC;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(21614502, i6, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:910)");
        }
        boolean z6 = (((i6 & 14) ^ 6) > 4 && interfaceC1734n.S(s0Var)) || (i6 & 6) == 4;
        java.lang.Object objG = interfaceC1734n.g();
        if (z6 || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = V.A1.d(hVar, null, 2, null);
            interfaceC1734n.K(objG);
        }
        V.InterfaceC1753w0 interfaceC1753w0 = (V.InterfaceC1753w0) objG;
        if (s0Var.i() == s0Var.p() && s0Var.i() == p190t.m.Visible) {
            if (s0Var.u()) {
                L(interfaceC1753w0, hVar);
            } else {
                hVarC = androidx.compose.animation.h.f18804a.a();
                L(interfaceC1753w0, hVarC);
            }
        } else if (s0Var.p() == p190t.m.Visible) {
            hVarC = K(interfaceC1753w0).c(hVar);
            L(interfaceC1753w0, hVarC);
        }
        androidx.compose.animation.h hVarK = K(interfaceC1753w0);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return hVarK;
    }

    private static final androidx.compose.animation.h K(V.InterfaceC1753w0 interfaceC1753w0) {
        return (androidx.compose.animation.h) interfaceC1753w0.getValue();
    }

    private static final void L(V.InterfaceC1753w0 interfaceC1753w0, androidx.compose.animation.h hVar) {
        interfaceC1753w0.setValue(hVar);
    }

    public static final androidx.compose.animation.j M(p200u.s0 s0Var, androidx.compose.animation.j jVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        androidx.compose.animation.j jVarC;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1363864804, i6, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:930)");
        }
        boolean z6 = (((i6 & 14) ^ 6) > 4 && interfaceC1734n.S(s0Var)) || (i6 & 6) == 4;
        java.lang.Object objG = interfaceC1734n.g();
        if (z6 || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = V.A1.d(jVar, null, 2, null);
            interfaceC1734n.K(objG);
        }
        V.InterfaceC1753w0 interfaceC1753w0 = (V.InterfaceC1753w0) objG;
        if (s0Var.i() == s0Var.p() && s0Var.i() == p190t.m.Visible) {
            if (s0Var.u()) {
                O(interfaceC1753w0, jVar);
            } else {
                jVarC = androidx.compose.animation.j.f18807a.a();
                O(interfaceC1753w0, jVarC);
            }
        } else if (s0Var.p() != p190t.m.Visible) {
            jVarC = N(interfaceC1753w0).c(jVar);
            O(interfaceC1753w0, jVarC);
        }
        androidx.compose.animation.j jVarN = N(interfaceC1753w0);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return jVarN;
    }

    private static final androidx.compose.animation.j N(V.InterfaceC1753w0 interfaceC1753w0) {
        return (androidx.compose.animation.j) interfaceC1753w0.getValue();
    }

    private static final void O(V.InterfaceC1753w0 interfaceC1753w0, androidx.compose.animation.j jVar) {
        interfaceC1753w0.setValue(jVar);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0120  */
    /* JADX WARN: Code duplicated, block: B:54:0x013b  */
    private static final p190t.r e(final p200u.s0 s0Var, final androidx.compose.animation.h hVar, final androidx.compose.animation.j jVar, java.lang.String str, V.InterfaceC1734n interfaceC1734n, int i6) {
        final u.s0.a aVar;
        final u.s0.a aVar2;
        boolean z6;
        boolean z10;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(642253525, i6, -1, "androidx.compose.animation.createGraphicsLayerBlock (EnterExitTransition.kt:958)");
        }
        boolean z11 = true;
        boolean z12 = (hVar.b().c() == null && jVar.b().c() == null) ? false : true;
        boolean z13 = (hVar.b().e() == null && jVar.b().e() == null) ? false : true;
        u.s0.a aVarC = null;
        if (z12) {
            interfaceC1734n.T(-675389204);
            p200u.x0 x0VarI = p200u.z0.i(p247y7.C7344m.f57303a);
            java.lang.Object objG = interfaceC1734n.g();
            if (objG == V.InterfaceC1734n.f14931a.a()) {
                objG = str + " alpha";
                interfaceC1734n.K(objG);
            }
            u.s0.a aVarC2 = p200u.u0.c(s0Var, x0VarI, (java.lang.String) objG, interfaceC1734n, (i6 & 14) | 384, 0);
            interfaceC1734n.J();
            aVar = aVarC2;
        } else {
            interfaceC1734n.T(-675252433);
            interfaceC1734n.J();
            aVar = null;
        }
        if (z13) {
            interfaceC1734n.T(-675193780);
            p200u.x0 x0VarI2 = p200u.z0.i(p247y7.C7344m.f57303a);
            java.lang.Object objG2 = interfaceC1734n.g();
            if (objG2 == V.InterfaceC1734n.f14931a.a()) {
                objG2 = str + " scale";
                interfaceC1734n.K(objG2);
            }
            u.s0.a aVarC3 = p200u.u0.c(s0Var, x0VarI2, (java.lang.String) objG2, interfaceC1734n, (i6 & 14) | 384, 0);
            interfaceC1734n.J();
            aVar2 = aVarC3;
        } else {
            interfaceC1734n.T(-675057009);
            interfaceC1734n.J();
            aVar2 = null;
        }
        if (z13) {
            interfaceC1734n.T(-674987940);
            aVarC = p200u.u0.c(s0Var, f18733a, "TransformOriginInterruptionHandling", interfaceC1734n, (i6 & 14) | 384, 0);
        } else {
            interfaceC1734n.T(-674835793);
        }
        interfaceC1734n.J();
        boolean zL = interfaceC1734n.l(aVar);
        if (((i6 & 112) ^ 48) > 32 && interfaceC1734n.S(hVar)) {
            z6 = true;
        } else if ((i6 & 48) == 32) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean z14 = zL | z6;
        if (((i6 & 896) ^ 384) > 256 && interfaceC1734n.S(jVar)) {
            z10 = true;
        } else if ((i6 & 384) == 256) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean zL2 = z14 | z10 | interfaceC1734n.l(aVar2);
        if (((i6 & 14) ^ 6) <= 4 || !interfaceC1734n.S(s0Var)) {
            if ((i6 & 6) != 4) {
                z11 = false;
            }
        }
        boolean zL3 = zL2 | z11 | interfaceC1734n.l(aVarC);
        java.lang.Object objG3 = interfaceC1734n.g();
        if (zL3 || objG3 == V.InterfaceC1734n.f14931a.a()) {
            final u.s0.a aVar3 = aVarC;
            objG3 = new p190t.r() { // from class: t.n
                @Override // p190t.r
                public final p237x7.l a() {
                    return androidx.compose.animation.f.f(aVar, aVar2, s0Var, hVar, jVar, aVar3);
                }
            };
            interfaceC1734n.K(objG3);
        }
        p190t.r rVar = (p190t.r) objG3;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p237x7.l f(u.s0.a aVar, u.s0.a aVar2, p200u.s0 s0Var, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, u.s0.a aVar3) {
        p190t.v vVarE;
        return new androidx.compose.animation.f.e(aVar != null ? aVar.a(new androidx.compose.animation.f.c(hVar, jVar), new androidx.compose.animation.f.d(hVar, jVar)) : null, aVar2 != null ? aVar2.a(new androidx.compose.animation.f.C0353f(hVar, jVar), new androidx.compose.animation.f.g(hVar, jVar)) : null, aVar3 != null ? aVar3.a(androidx.compose.animation.f.h.f18752D, new androidx.compose.animation.f.i((s0Var.i() != p190t.m.PreEnter ? (vVarE = jVar.b().e()) == null && (vVarE = hVar.b().e()) == null : (vVarE = hVar.b().e()) == null && (vVarE = jVar.b().e()) == null) ? null : androidx.compose.ui.graphics.f.b(vVarE.c()), hVar, jVar)) : null);
    }

    public static final androidx.compose.ui.d g(p200u.s0 s0Var, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, p237x7.a aVar, java.lang.String str, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        u.s0.a aVar2;
        u.s0.a aVar3;
        p190t.i iVarA;
        p237x7.a aVar4 = (i10 & 4) != 0 ? androidx.compose.animation.f.j.f18757D : aVar;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(28261782, i6, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:869)");
        }
        int i11 = i6 & 14;
        androidx.compose.animation.h hVarJ = J(s0Var, hVar, interfaceC1734n, i6 & 126);
        int i12 = i6 >> 3;
        androidx.compose.animation.j jVarM = M(s0Var, jVar, interfaceC1734n, (i12 & 112) | i11);
        boolean z6 = true;
        boolean z10 = (hVarJ.b().f() == null && jVarM.b().f() == null) ? false : true;
        boolean z11 = (hVarJ.b().a() == null && jVarM.b().a() == null) ? false : true;
        u.s0.a aVar5 = null;
        if (z10) {
            interfaceC1734n.T(-821375963);
            p200u.x0 x0VarD = p200u.z0.d(Y0.p.f16221b);
            java.lang.Object objG = interfaceC1734n.g();
            if (objG == V.InterfaceC1734n.f14931a.a()) {
                objG = str + " slide";
                interfaceC1734n.K(objG);
            }
            u.s0.a aVarC = p200u.u0.c(s0Var, x0VarD, (java.lang.String) objG, interfaceC1734n, i11 | 384, 0);
            interfaceC1734n.J();
            aVar2 = aVarC;
        } else {
            interfaceC1734n.T(-821278096);
            interfaceC1734n.J();
            aVar2 = null;
        }
        if (z11) {
            interfaceC1734n.T(-821202177);
            p200u.x0 x0VarE = p200u.z0.e(Y0.t.f16230b);
            java.lang.Object objG2 = interfaceC1734n.g();
            if (objG2 == V.InterfaceC1734n.f14931a.a()) {
                objG2 = str + " shrink/expand";
                interfaceC1734n.K(objG2);
            }
            u.s0.a aVarC2 = p200u.u0.c(s0Var, x0VarE, (java.lang.String) objG2, interfaceC1734n, i11 | 384, 0);
            interfaceC1734n.J();
            aVar3 = aVarC2;
        } else {
            interfaceC1734n.T(-821099041);
            interfaceC1734n.J();
            aVar3 = null;
        }
        if (z11) {
            interfaceC1734n.T(-821034002);
            p200u.x0 x0VarD2 = p200u.z0.d(Y0.p.f16221b);
            java.lang.Object objG3 = interfaceC1734n.g();
            if (objG3 == V.InterfaceC1734n.f14931a.a()) {
                objG3 = str + " InterruptionHandlingOffset";
                interfaceC1734n.K(objG3);
            }
            u.s0.a aVarC3 = p200u.u0.c(s0Var, x0VarD2, (java.lang.String) objG3, interfaceC1734n, i11 | 384, 0);
            interfaceC1734n.J();
            aVar5 = aVarC3;
        } else {
            interfaceC1734n.T(-820883777);
            interfaceC1734n.J();
        }
        p190t.i iVarA2 = hVarJ.b().a();
        boolean z12 = ((iVarA2 == null || iVarA2.c()) && ((iVarA = jVarM.b().a()) == null || iVarA.c()) && z11) ? false : true;
        p190t.r rVarE = e(s0Var, hVarJ, jVarM, str, interfaceC1734n, i11 | (i12 & 7168));
        androidx.compose.ui.d.a aVar6 = androidx.compose.ui.d.f19586a;
        boolean zD = interfaceC1734n.d(z12);
        if ((((i6 & 7168) ^ 3072) <= 2048 || !interfaceC1734n.S(aVar4)) && (i6 & 3072) != 2048) {
            z6 = false;
        }
        boolean z13 = zD | z6;
        java.lang.Object objG4 = interfaceC1734n.g();
        if (z13 || objG4 == V.InterfaceC1734n.f14931a.a()) {
            objG4 = new androidx.compose.animation.f.k(z12, aVar4);
            interfaceC1734n.K(objG4);
        }
        androidx.compose.ui.d dVarB = androidx.compose.ui.graphics.b.a(aVar6, (p237x7.l) objG4).b(new androidx.compose.animation.EnterExitTransitionElement(s0Var, aVar3, aVar5, aVar2, hVarJ, jVarM, aVar4, rVarE));
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return dVarB;
    }

    public static final androidx.compose.animation.h h(p200u.I i6, h0.c.b bVar, boolean z6, p237x7.l lVar) {
        return j(i6, H(bVar), z6, new androidx.compose.animation.f.m(lVar));
    }

    public static /* synthetic */ androidx.compose.animation.h i(p200u.I i6, h0.c.b bVar, boolean z6, p237x7.l lVar, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            i6 = p200u.AbstractC7177k.j(0.0f, 400.0f, Y0.t.b(p200u.Q0.d(Y0.t.f16230b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            bVar = p071h0.c.f45778a.j();
        }
        if ((i10 & 4) != 0) {
            z6 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = androidx.compose.animation.f.l.f18760D;
        }
        return h(i6, bVar, z6, lVar);
    }

    public static final androidx.compose.animation.h j(p200u.I i6, p071h0.c cVar, boolean z6, p237x7.l lVar) {
        return new androidx.compose.animation.i(new p190t.C(null, null, new p190t.i(cVar, lVar, i6, z6), null, false, null, 59, null));
    }

    public static /* synthetic */ androidx.compose.animation.h k(p200u.I i6, p071h0.c cVar, boolean z6, p237x7.l lVar, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            i6 = p200u.AbstractC7177k.j(0.0f, 400.0f, Y0.t.b(p200u.Q0.d(Y0.t.f16230b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            cVar = p071h0.c.f45778a.c();
        }
        if ((i10 & 4) != 0) {
            z6 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = androidx.compose.animation.f.n.f18762D;
        }
        return j(i6, cVar, z6, lVar);
    }

    public static final androidx.compose.animation.h l(p200u.I i6, p071h0.c.InterfaceC0526c interfaceC0526c, boolean z6, p237x7.l lVar) {
        return j(i6, I(interfaceC0526c), z6, new androidx.compose.animation.f.p(lVar));
    }

    public static /* synthetic */ androidx.compose.animation.h m(p200u.I i6, p071h0.c.InterfaceC0526c interfaceC0526c, boolean z6, p237x7.l lVar, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            i6 = p200u.AbstractC7177k.j(0.0f, 400.0f, Y0.t.b(p200u.Q0.d(Y0.t.f16230b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            interfaceC0526c = p071h0.c.f45778a.a();
        }
        if ((i10 & 4) != 0) {
            z6 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = androidx.compose.animation.f.o.f18763D;
        }
        return l(i6, interfaceC0526c, z6, lVar);
    }

    public static final androidx.compose.animation.h n(p200u.I i6, float f6) {
        return new androidx.compose.animation.i(new p190t.C(new p190t.o(f6, i6), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ androidx.compose.animation.h o(p200u.I i6, float f6, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            i6 = p200u.AbstractC7177k.j(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f6 = 0.0f;
        }
        return n(i6, f6);
    }

    public static final androidx.compose.animation.j p(p200u.I i6, float f6) {
        return new androidx.compose.animation.k(new p190t.C(new p190t.o(f6, i6), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ androidx.compose.animation.j q(p200u.I i6, float f6, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            i6 = p200u.AbstractC7177k.j(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f6 = 0.0f;
        }
        return p(i6, f6);
    }

    public static final androidx.compose.animation.h r(p200u.I i6, float f6, long j6) {
        return new androidx.compose.animation.i(new p190t.C(null, null, null, new p190t.v(f6, j6, i6, null), false, null, 55, null));
    }

    public static /* synthetic */ androidx.compose.animation.h s(p200u.I i6, float f6, long j6, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            i6 = p200u.AbstractC7177k.j(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f6 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j6 = androidx.compose.ui.graphics.f.f19784b.a();
        }
        return r(i6, f6, j6);
    }

    public static final androidx.compose.animation.j t(p200u.I i6, float f6, long j6) {
        return new androidx.compose.animation.k(new p190t.C(null, null, null, new p190t.v(f6, j6, i6, null), false, null, 55, null));
    }

    public static /* synthetic */ androidx.compose.animation.j u(p200u.I i6, float f6, long j6, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            i6 = p200u.AbstractC7177k.j(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f6 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j6 = androidx.compose.ui.graphics.f.f19784b.a();
        }
        return t(i6, f6, j6);
    }

    public static final androidx.compose.animation.j v(p200u.I i6, h0.c.b bVar, boolean z6, p237x7.l lVar) {
        return x(i6, H(bVar), z6, new androidx.compose.animation.f.r(lVar));
    }

    public static /* synthetic */ androidx.compose.animation.j w(p200u.I i6, h0.c.b bVar, boolean z6, p237x7.l lVar, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            i6 = p200u.AbstractC7177k.j(0.0f, 400.0f, Y0.t.b(p200u.Q0.d(Y0.t.f16230b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            bVar = p071h0.c.f45778a.j();
        }
        if ((i10 & 4) != 0) {
            z6 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = androidx.compose.animation.f.q.f18765D;
        }
        return v(i6, bVar, z6, lVar);
    }

    public static final androidx.compose.animation.j x(p200u.I i6, p071h0.c cVar, boolean z6, p237x7.l lVar) {
        return new androidx.compose.animation.k(new p190t.C(null, null, new p190t.i(cVar, lVar, i6, z6), null, false, null, 59, null));
    }

    public static /* synthetic */ androidx.compose.animation.j y(p200u.I i6, p071h0.c cVar, boolean z6, p237x7.l lVar, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            i6 = p200u.AbstractC7177k.j(0.0f, 400.0f, Y0.t.b(p200u.Q0.d(Y0.t.f16230b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            cVar = p071h0.c.f45778a.c();
        }
        if ((i10 & 4) != 0) {
            z6 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = androidx.compose.animation.f.s.f18767D;
        }
        return x(i6, cVar, z6, lVar);
    }

    public static final androidx.compose.animation.j z(p200u.I i6, p071h0.c.InterfaceC0526c interfaceC0526c, boolean z6, p237x7.l lVar) {
        return x(i6, I(interfaceC0526c), z6, new androidx.compose.animation.f.u(lVar));
    }
}
