package p240y;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f57103a = Y0.i.q(400);

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        float f57104F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f57105G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f57106H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f57107I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f57108J;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f57107I = obj;
            this.f57108J |= Integer.MIN_VALUE;
            return p240y.h.f(null, 0.0f, null, null, null, this);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ float f57109D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p247y7.L f57110E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p230x.w f57111F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.l f57112G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f6, p247y7.L l6, p230x.w wVar, p237x7.l lVar) {
            super(1);
            this.f57109D = f6;
            this.f57110E = l6;
            this.f57111F = wVar;
            this.f57112G = lVar;
        }

        public final void a(p200u.C7173i c7173i) {
            if (java.lang.Math.abs(((java.lang.Number) c7173i.e()).floatValue()) < java.lang.Math.abs(this.f57109D)) {
                p240y.h.g(c7173i, this.f57111F, this.f57112G, ((java.lang.Number) c7173i.e()).floatValue() - this.f57110E.f57251C);
                this.f57110E.f57251C = ((java.lang.Number) c7173i.e()).floatValue();
                return;
            }
            float fL = p240y.h.l(((java.lang.Number) c7173i.e()).floatValue(), this.f57109D);
            p240y.h.g(c7173i, this.f57111F, this.f57112G, fL - this.f57110E.f57251C);
            c7173i.a();
            this.f57110E.f57251C = fL;
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p200u.C7173i) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class c extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        float f57113F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        float f57114G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f57115H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f57116I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        /* synthetic */ java.lang.Object f57117J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        int f57118K;

        c(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f57117J = obj;
            this.f57118K |= Integer.MIN_VALUE;
            return p240y.h.h(null, 0.0f, 0.0f, null, null, null, this);
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ float f57119D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p247y7.L f57120E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p230x.w f57121F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.l f57122G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(float f6, p247y7.L l6, p230x.w wVar, p237x7.l lVar) {
            super(1);
            this.f57119D = f6;
            this.f57120E = l6;
            this.f57121F = wVar;
            this.f57122G = lVar;
        }

        public final void a(p200u.C7173i c7173i) {
            float fL = p240y.h.l(((java.lang.Number) c7173i.e()).floatValue(), this.f57119D);
            float f6 = fL - this.f57120E.f57251C;
            float fA = this.f57121F.a(f6);
            this.f57122G.l(java.lang.Float.valueOf(fA));
            if (java.lang.Math.abs(f6 - fA) > 0.5f || fL != ((java.lang.Number) c7173i.e()).floatValue()) {
                c7173i.a();
            }
            this.f57120E.f57251C += fA;
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p200u.C7173i) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object f(p230x.w wVar, float f6, p200u.C7179l c7179l, p200u.B b6, p237x7.l lVar, p127m7.e eVar) {
        y.h.a aVar;
        p247y7.L l6;
        if (eVar instanceof y.h.a) {
            aVar = (y.h.a) eVar;
            int i6 = aVar.f57108J;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f57108J = i6 - Integer.MIN_VALUE;
            } else {
                aVar = new y.h.a(eVar);
            }
        } else {
            aVar = new y.h.a(eVar);
        }
        java.lang.Object obj = aVar.f57107I;
        java.lang.Object objG = p137n7.b.g();
        int i10 = aVar.f57108J;
        if (i10 == 0) {
            p087i7.x.b(obj);
            p247y7.L l10 = new p247y7.L();
            boolean z6 = ((java.lang.Number) c7179l.o()).floatValue() == 0.0f;
            y.h.b bVar = new y.h.b(f6, l10, wVar, lVar);
            aVar.f57105G = c7179l;
            aVar.f57106H = l10;
            aVar.f57104F = f6;
            aVar.f57108J = 1;
            if (p200u.AbstractC7190q0.g(c7179l, b6, !z6, bVar, aVar) == objG) {
                return objG;
            }
            l6 = l10;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f6 = aVar.f57104F;
            l6 = (p247y7.L) aVar.f57106H;
            c7179l = (p200u.C7179l) aVar.f57105G;
            p087i7.x.b(obj);
        }
        return new p240y.a(p147o7.b.b(f6 - l6.f57251C), c7179l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(p200u.C7173i c7173i, p230x.w wVar, p237x7.l lVar, float f6) {
        float fA = wVar.a(f6);
        lVar.l(java.lang.Float.valueOf(fA));
        if (java.lang.Math.abs(f6 - fA) > 0.5f) {
            c7173i.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final java.lang.Object h(p230x.w wVar, float f6, float f10, p200u.C7179l c7179l, p200u.InterfaceC7175j interfaceC7175j, p237x7.l lVar, p127m7.e eVar) {
        y.h.c cVar;
        float f11;
        p247y7.L l6;
        float f12;
        p200u.C7179l c7179l2;
        if (eVar instanceof y.h.c) {
            cVar = (y.h.c) eVar;
            int i6 = cVar.f57118K;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                cVar.f57118K = i6 - Integer.MIN_VALUE;
            } else {
                cVar = new y.h.c(eVar);
            }
        } else {
            cVar = new y.h.c(eVar);
        }
        y.h.c cVar2 = cVar;
        java.lang.Object obj = cVar2.f57117J;
        java.lang.Object objG = p137n7.b.g();
        int i10 = cVar2.f57118K;
        if (i10 == 0) {
            p087i7.x.b(obj);
            p247y7.L l10 = new p247y7.L();
            float fFloatValue = ((java.lang.Number) c7179l.o()).floatValue();
            java.lang.Float fB = p147o7.b.b(f6);
            boolean z6 = ((java.lang.Number) c7179l.o()).floatValue() == 0.0f;
            y.h.d dVar = new y.h.d(f10, l10, wVar, lVar);
            cVar2.f57115H = c7179l;
            cVar2.f57116I = l10;
            f11 = f6;
            cVar2.f57113F = f11;
            cVar2.f57114G = fFloatValue;
            cVar2.f57118K = 1;
            if (p200u.AbstractC7190q0.i(c7179l, fB, interfaceC7175j, !z6, dVar, cVar2) == objG) {
                return objG;
            }
            l6 = l10;
            f12 = fFloatValue;
            c7179l2 = c7179l;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f12 = cVar2.f57114G;
            float f13 = cVar2.f57113F;
            l6 = (p247y7.L) cVar2.f57116I;
            p200u.C7179l c7179l3 = (p200u.C7179l) cVar2.f57115H;
            p087i7.x.b(obj);
            f11 = f13;
            c7179l2 = c7179l3;
        }
        return new p240y.a(p147o7.b.b(f11 - l6.f57251C), p200u.AbstractC7181m.g(c7179l2, 0.0f, l(((java.lang.Number) c7179l2.o()).floatValue(), f12), 0L, 0L, false, 29, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object i(p230x.w wVar, float f6, float f10, p240y.b bVar, p237x7.l lVar, p127m7.e eVar) {
        return bVar.a(wVar, p147o7.b.b(f6), p147o7.b.b(f10), lVar, eVar);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public static final float j(int i6, float f6, float f10) {
        y.d.a aVar = p240y.d.f57073a;
        if (p240y.d.e(i6, aVar.a())) {
            if (java.lang.Math.abs(f10) <= java.lang.Math.abs(f6)) {
                f6 = f10;
            }
        } else if (p240y.d.e(i6, aVar.b())) {
            f6 = f10;
        } else if (!p240y.d.e(i6, aVar.c())) {
            f6 = 0.0f;
        }
        if (k(f6)) {
            return f6;
        }
        return 0.0f;
    }

    private static final boolean k(float f6) {
        return (f6 == Float.POSITIVE_INFINITY || f6 == Float.NEGATIVE_INFINITY) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float l(float f6, float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        return f10 > 0.0f ? E7.j.f(f6, f10) : E7.j.c(f6, f10);
    }

    public static final float m() {
        return f57103a;
    }

    public static final p230x.F n(p240y.i iVar, p200u.B b6, p200u.InterfaceC7175j interfaceC7175j) {
        return new p240y.g(iVar, b6, interfaceC7175j);
    }
}
