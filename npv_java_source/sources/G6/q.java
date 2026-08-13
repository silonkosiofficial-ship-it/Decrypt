package G6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3124a;

        static {
            int[] iArr = new int[H9.y.values().length];
            try {
                iArr[H9.y.HTTP_1_0.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[H9.y.HTTP_1_1.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[H9.y.SPDY_3.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[H9.y.HTTP_2.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[H9.y.H2_PRIOR_KNOWLEDGE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[H9.y.QUIC.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            f3124a = iArr;
        }
    }

    static final class b implements p237x7.l {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ H9.InterfaceC1239e f3125C;

        b(H9.InterfaceC1239e interfaceC1239e) {
            this.f3125C = interfaceC1239e;
        }

        public final void a(java.lang.Throwable th) {
            this.f3125C.cancel();
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((java.lang.Throwable) obj);
            return p087i7.M.f46721a;
        }
    }

    public static final class c implements T6.InterfaceC1668p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f3126c = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ H9.t f3127d;

        c(H9.t tVar) {
            this.f3127d = tVar;
        }

        @Override // W6.y
        public java.util.Set a() {
            return this.f3127d.o().entrySet();
        }

        @Override // W6.y
        public boolean b() {
            return this.f3126c;
        }

        @Override // W6.y
        public java.util.List c(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "name");
            java.util.List listC = this.f3127d.C(str);
            if (!listC.isEmpty()) {
                return listC;
            }
            return null;
        }

        @Override // W6.y
        public java.lang.String d(java.lang.String str) {
            return T6.InterfaceC1668p.b.b(this, str);
        }

        @Override // W6.y
        public void e(p237x7.p pVar) {
            T6.InterfaceC1668p.b.a(this, pVar);
        }

        @Override // W6.y
        public java.util.Set names() {
            return this.f3127d.f();
        }
    }

    public static final java.lang.Object b(H9.x xVar, H9.z zVar, O6.e eVar, p127m7.i iVar, p127m7.e eVar2) {
        W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(eVar2), 1);
        c1798n.E();
        H9.InterfaceC1239e interfaceC1239eE = xVar.E(zVar);
        m7.i.b bVarI = iVar.i(W8.InterfaceC1822z0.f15544h);
        p247y7.AbstractC7350t.c(bVarI);
        W8.InterfaceC1822z0.a.d((W8.InterfaceC1822z0) bVarI, true, false, new G6.q.b(interfaceC1239eE), 2, null);
        interfaceC1239eE.N(new G6.b(eVar, c1798n));
        java.lang.Object objX = c1798n.x();
        if (objX == p137n7.b.g()) {
            p147o7.h.c(eVar2);
        }
        return objX;
    }

    public static final T6.InterfaceC1668p c(H9.t tVar) {
        p247y7.AbstractC7350t.f(tVar, "<this>");
        return new G6.q.c(tVar);
    }

    public static final T6.B d(H9.y yVar) {
        p247y7.AbstractC7350t.f(yVar, "<this>");
        switch (G6.q.a.f3124a[yVar.ordinal()]) {
            case 1:
                return T6.B.f12985d.a();
            case 2:
                return T6.B.f12985d.b();
            case 3:
                return T6.B.f12985d.e();
            case 4:
            case 5:
                return T6.B.f12985d.c();
            case 6:
                return T6.B.f12985d.d();
            default:
                throw new p087i7.s();
        }
    }

    private static final boolean e(java.io.IOException iOException) {
        java.lang.String message = iOException.getMessage();
        return message != null && S8.r.a0(message, "connect", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Throwable f(O6.e eVar, java.io.IOException iOException) {
        java.lang.Throwable thB;
        if (iOException instanceof G6.r) {
            thB = iOException.getCause();
            if (thB == null) {
                return iOException;
            }
        } else {
            if (!(iOException instanceof java.net.SocketTimeoutException)) {
                return iOException;
            }
            thB = e(iOException) ? I6.I.b(eVar, iOException) : I6.I.e(eVar, iOException);
        }
        return thB;
    }
}
