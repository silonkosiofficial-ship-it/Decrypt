package S;

/* JADX INFO: loaded from: classes.dex */
public final class Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p059f9.a f10610a = p059f9.g.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V.InterfaceC1753w0 f10611b = V.A1.d(null, null, 2, null);

    private static final class a implements S.U0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final S.InterfaceC1536b1 f10612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final W8.InterfaceC1794l f10613b;

        public a(S.InterfaceC1536b1 interfaceC1536b1, W8.InterfaceC1794l interfaceC1794l) {
            this.f10612a = interfaceC1536b1;
            this.f10613b = interfaceC1794l;
        }

        @Override // S.U0
        public void a() {
            if (this.f10613b.f()) {
                W8.InterfaceC1794l interfaceC1794l = this.f10613b;
                i7.w.a aVar = p087i7.w.f46751D;
                interfaceC1794l.t(p087i7.w.b(S.EnumC1533a1.ActionPerformed));
            }
        }

        @Override // S.U0
        public S.InterfaceC1536b1 b() {
            return this.f10612a;
        }

        @Override // S.U0
        public void dismiss() {
            if (this.f10613b.f()) {
                W8.InterfaceC1794l interfaceC1794l = this.f10613b;
                i7.w.a aVar = p087i7.w.f46751D;
                interfaceC1794l.t(p087i7.w.b(S.EnumC1533a1.Dismissed));
            }
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || S.Y0.a.class != obj.getClass()) {
                return false;
            }
            S.Y0.a aVar = (S.Y0.a) obj;
            return p247y7.AbstractC7350t.b(b(), aVar.b()) && p247y7.AbstractC7350t.b(this.f10613b, aVar.f10613b);
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f10613b.hashCode();
        }
    }

    private static final class b implements S.InterfaceC1536b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f10614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.lang.String f10615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f10616c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final S.W0 f10617d;

        public b(java.lang.String str, java.lang.String str2, boolean z6, S.W0 w6) {
            this.f10614a = str;
            this.f10615b = str2;
            this.f10616c = z6;
            this.f10617d = w6;
        }

        @Override // S.InterfaceC1536b1
        public java.lang.String a() {
            return this.f10614a;
        }

        @Override // S.InterfaceC1536b1
        public java.lang.String b() {
            return this.f10615b;
        }

        @Override // S.InterfaceC1536b1
        public S.W0 c() {
            return this.f10617d;
        }

        @Override // S.InterfaceC1536b1
        public boolean d() {
            return this.f10616c;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || S.Y0.b.class != obj.getClass()) {
                return false;
            }
            S.Y0.b bVar = (S.Y0.b) obj;
            return p247y7.AbstractC7350t.b(a(), bVar.a()) && p247y7.AbstractC7350t.b(b(), bVar.b()) && d() == bVar.d() && c() == bVar.c();
        }

        public int hashCode() {
            int iHashCode = a().hashCode() * 31;
            java.lang.String strB = b();
            return ((((iHashCode + (strB != null ? strB.hashCode() : 0)) * 31) + p190t.h.a(d())) * 31) + c().hashCode();
        }
    }

    static final class c extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f10618F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f10619G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f10620H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f10621I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        /* synthetic */ java.lang.Object f10622J;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        int f10624L;

        c(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f10622J = obj;
            this.f10624L |= Integer.MIN_VALUE;
            return S.Y0.this.d(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(S.U0 u6) {
        this.f10611b.setValue(u6);
    }

    public static /* synthetic */ java.lang.Object f(S.Y0 y6, java.lang.String str, java.lang.String str2, boolean z6, S.W0 w6, p127m7.e eVar, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            str2 = null;
        }
        java.lang.String str3 = str2;
        if ((i6 & 4) != 0) {
            z6 = false;
        }
        boolean z10 = z6;
        if ((i6 & 8) != 0) {
            w6 = str3 == null ? S.W0.Short : S.W0.Indefinite;
        }
        return y6.e(str, str3, z10, w6, eVar);
    }

    public final S.U0 b() {
        return (S.U0) this.f10611b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object d(S.InterfaceC1536b1 interfaceC1536b1, p127m7.e eVar) {
        S.Y0.c cVar;
        p059f9.a aVar;
        S.Y0 y6;
        S.InterfaceC1536b1 interfaceC1536b2;
        S.Y0 y10;
        java.lang.Throwable th;
        p059f9.a aVar2;
        if (eVar instanceof S.Y0.c) {
            cVar = (S.Y0.c) eVar;
            int i6 = cVar.f10624L;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                cVar.f10624L = i6 - Integer.MIN_VALUE;
            } else {
                cVar = new S.Y0.c(eVar);
            }
        } else {
            cVar = new S.Y0.c(eVar);
        }
        java.lang.Object obj = cVar.f10622J;
        java.lang.Object objG = p137n7.b.g();
        int i10 = cVar.f10624L;
        try {
            try {
                if (i10 == 0) {
                    p087i7.x.b(obj);
                    aVar = this.f10610a;
                    cVar.f10618F = this;
                    cVar.f10619G = interfaceC1536b1;
                    cVar.f10620H = aVar;
                    cVar.f10624L = 1;
                    if (aVar.c(null, cVar) == objG) {
                        return objG;
                    }
                    y6 = this;
                    interfaceC1536b2 = interfaceC1536b1;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (p059f9.a) cVar.f10620H;
                        y10 = (S.Y0) cVar.f10618F;
                        try {
                            p087i7.x.b(obj);
                            y10.c(null);
                            aVar2.d(null);
                            return obj;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            y10.c(null);
                            throw th;
                        }
                    }
                    p059f9.a aVar3 = (p059f9.a) cVar.f10620H;
                    S.InterfaceC1536b1 interfaceC1536b3 = (S.InterfaceC1536b1) cVar.f10619G;
                    y6 = (S.Y0) cVar.f10618F;
                    p087i7.x.b(obj);
                    aVar = aVar3;
                    interfaceC1536b2 = interfaceC1536b3;
                }
                cVar.f10618F = y6;
                cVar.f10619G = interfaceC1536b2;
                cVar.f10620H = aVar;
                cVar.f10621I = cVar;
                cVar.f10624L = 2;
                W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(cVar), 1);
                c1798n.E();
                y6.c(new S.Y0.a(interfaceC1536b2, c1798n));
                java.lang.Object objX = c1798n.x();
                if (objX == p137n7.b.g()) {
                    p147o7.h.c(cVar);
                }
                if (objX == objG) {
                    return objG;
                }
                y10 = y6;
                p059f9.a aVar4 = aVar;
                obj = objX;
                aVar2 = aVar4;
                y10.c(null);
                aVar2.d(null);
                return obj;
            } catch (java.lang.Throwable th3) {
                y10 = y6;
                th = th3;
                y10.c(null);
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            interfaceC1536b1.d(null);
            throw th4;
        }
    }

    public final java.lang.Object e(java.lang.String str, java.lang.String str2, boolean z6, S.W0 w6, p127m7.e eVar) {
        return d(new S.Y0.b(str, str2, z6, w6), eVar);
    }
}
