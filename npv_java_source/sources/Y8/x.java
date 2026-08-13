package Y8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x {

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f16569F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f16570G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f16571H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f16572I;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f16571H = obj;
            this.f16572I |= Integer.MIN_VALUE;
            return Y8.x.a(null, null, this);
        }
    }

    static final class b implements p237x7.l {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ W8.InterfaceC1794l f16573C;

        b(W8.InterfaceC1794l interfaceC1794l) {
            this.f16573C = interfaceC1794l;
        }

        public final void a(java.lang.Throwable th) {
            W8.InterfaceC1794l interfaceC1794l = this.f16573C;
            i7.w.a aVar = p087i7.w.f46751D;
            interfaceC1794l.t(p087i7.w.b(p087i7.M.f46721a));
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((java.lang.Throwable) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object a(Y8.z zVar, p237x7.a aVar, p127m7.e eVar) {
        Y8.x.a aVar2;
        if (eVar instanceof Y8.x.a) {
            aVar2 = (Y8.x.a) eVar;
            int i6 = aVar2.f16572I;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar2.f16572I = i6 - Integer.MIN_VALUE;
            } else {
                aVar2 = new Y8.x.a(eVar);
            }
        } else {
            aVar2 = new Y8.x.a(eVar);
        }
        java.lang.Object obj = aVar2.f16571H;
        java.lang.Object objG = p137n7.b.g();
        int i10 = aVar2.f16572I;
        try {
            if (i10 == 0) {
                p087i7.x.b(obj);
                if (aVar2.getContext().i(W8.InterfaceC1822z0.f15544h) != zVar) {
                    throw new java.lang.IllegalStateException("awaitClose() can only be invoked from the producer context".toString());
                }
                aVar2.f16569F = zVar;
                aVar2.f16570G = aVar;
                aVar2.f16572I = 1;
                W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(aVar2), 1);
                c1798n.E();
                zVar.d(new Y8.x.b(c1798n));
                java.lang.Object objX = c1798n.x();
                if (objX == p137n7.b.g()) {
                    p147o7.h.c(aVar2);
                }
                if (objX == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (p237x7.a) aVar2.f16570G;
                p087i7.x.b(obj);
            }
            aVar.b();
            return p087i7.M.f46721a;
        } catch (java.lang.Throwable th) {
            aVar.b();
            throw th;
        }
    }

    public static final Y8.B b(W8.N n6, p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d, W8.P p6, p237x7.l lVar, p237x7.p pVar) {
        Y8.y yVar = new Y8.y(W8.H.j(n6, iVar), Y8.m.b(i6, enumC1863d, null, 4, null));
        if (lVar != null) {
            yVar.e1(lVar);
        }
        yVar.j1(p6, yVar, pVar);
        return yVar;
    }

    public static final Y8.B c(W8.N n6, p127m7.i iVar, int i6, p237x7.p pVar) {
        return b(n6, iVar, i6, Y8.EnumC1863d.SUSPEND, W8.P.DEFAULT, null, pVar);
    }

    public static /* synthetic */ Y8.B d(W8.N n6, p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d, W8.P p6, p237x7.l lVar, p237x7.p pVar, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            iVar = p127m7.j.f51198C;
        }
        p127m7.i iVar2 = iVar;
        if ((i10 & 2) != 0) {
            i6 = 0;
        }
        int i11 = i6;
        if ((i10 & 4) != 0) {
            enumC1863d = Y8.EnumC1863d.SUSPEND;
        }
        Y8.EnumC1863d enumC1863d2 = enumC1863d;
        if ((i10 & 8) != 0) {
            p6 = W8.P.DEFAULT;
        }
        W8.P p10 = p6;
        if ((i10 & 16) != 0) {
            lVar = null;
        }
        return b(n6, iVar2, i11, enumC1863d2, p10, lVar, pVar);
    }
}
