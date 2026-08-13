package M1;

/* JADX INFO: loaded from: classes.dex */
public final class u implements M1.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f6967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p059f9.a f6968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final M1.C1349a f6969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Z8.InterfaceC1869f f6970d;

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f6971F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f6972G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f6973H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f6975J;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f6973H = obj;
            this.f6975J |= Integer.MIN_VALUE;
            return M1.u.this.d(null, this);
        }
    }

    static final class b extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f6976F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        boolean f6977G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f6978H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f6980J;

        b(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f6978H = obj;
            this.f6980J |= Integer.MIN_VALUE;
            return M1.u.this.c(null, this);
        }
    }

    static final class c extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f6981G;

        c(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f6981G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            return ((M1.u.c) x(interfaceC1870g, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new M1.u.c(eVar);
        }
    }

    public u(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "filePath");
        this.f6967a = str;
        this.f6968b = p059f9.g.b(false, 1, null);
        this.f6969c = new M1.C1349a(0);
        this.f6970d = Z8.AbstractC1871h.x(new M1.u.c(null));
    }

    @Override // M1.n
    public java.lang.Object a(p127m7.e eVar) {
        return p147o7.b.c(this.f6969c.b());
    }

    @Override // M1.n
    public java.lang.Object b(p127m7.e eVar) {
        return p147o7.b.c(this.f6969c.d());
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // M1.n
    public java.lang.Object c(p237x7.p pVar, p127m7.e eVar) throws java.lang.Throwable {
        M1.u.b bVar;
        p059f9.a aVar;
        java.lang.Throwable th;
        boolean z6;
        if (eVar instanceof M1.u.b) {
            bVar = (M1.u.b) eVar;
            int i6 = bVar.f6980J;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                bVar.f6980J = i6 - Integer.MIN_VALUE;
            } else {
                bVar = new M1.u.b(eVar);
            }
        } else {
            bVar = new M1.u.b(eVar);
        }
        java.lang.Object obj = bVar.f6978H;
        java.lang.Object objG = p137n7.b.g();
        int i10 = bVar.f6980J;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z6 = bVar.f6977G;
            aVar = (p059f9.a) bVar.f6976F;
            try {
                p087i7.x.b(obj);
                if (z6) {
                    aVar.d(null);
                }
                return obj;
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (z6) {
                    aVar.d(null);
                }
                throw th;
            }
        }
        p087i7.x.b(obj);
        p059f9.a aVar2 = this.f6968b;
        boolean zA = aVar2.a(null);
        try {
            java.lang.Object objA = p147o7.b.a(zA);
            bVar.f6976F = aVar2;
            bVar.f6977G = zA;
            bVar.f6980J = 1;
            java.lang.Object objU = pVar.u(objA, bVar);
            if (objU == objG) {
                return objG;
            }
            aVar = aVar2;
            obj = objU;
            z6 = zA;
            if (z6) {
                aVar.d(null);
            }
            return obj;
        } catch (java.lang.Throwable th3) {
            aVar = aVar2;
            th = th3;
            z6 = zA;
            if (z6) {
                aVar.d(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // M1.n
    public java.lang.Object d(p237x7.l lVar, p127m7.e eVar) throws java.lang.Throwable {
        M1.u.a aVar;
        p059f9.a aVar2;
        java.lang.Throwable th;
        p059f9.a aVar3;
        if (eVar instanceof M1.u.a) {
            aVar = (M1.u.a) eVar;
            int i6 = aVar.f6975J;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f6975J = i6 - Integer.MIN_VALUE;
            } else {
                aVar = new M1.u.a(eVar);
            }
        } else {
            aVar = new M1.u.a(eVar);
        }
        java.lang.Object obj = aVar.f6973H;
        java.lang.Object objG = p137n7.b.g();
        int i10 = aVar.f6975J;
        try {
            if (i10 == 0) {
                p087i7.x.b(obj);
                aVar2 = this.f6968b;
                aVar.f6971F = lVar;
                aVar.f6972G = aVar2;
                aVar.f6975J = 1;
                if (aVar2.c(null, aVar) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar3 = (p059f9.a) aVar.f6971F;
                    try {
                        p087i7.x.b(obj);
                        aVar3.d(null);
                        return obj;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        aVar3.d(null);
                        throw th;
                    }
                }
                p059f9.a aVar4 = (p059f9.a) aVar.f6972G;
                p237x7.l lVar2 = (p237x7.l) aVar.f6971F;
                p087i7.x.b(obj);
                aVar2 = aVar4;
                lVar = lVar2;
            }
            aVar.f6971F = aVar2;
            aVar.f6972G = null;
            aVar.f6975J = 2;
            java.lang.Object objL = lVar.l(aVar);
            if (objL == objG) {
                return objG;
            }
            p059f9.a aVar5 = aVar2;
            obj = objL;
            aVar3 = aVar5;
            aVar3.d(null);
            return obj;
        } catch (java.lang.Throwable th3) {
            p059f9.a aVar6 = aVar2;
            th = th3;
            aVar3 = aVar6;
            aVar3.d(null);
            throw th;
        }
    }

    @Override // M1.n
    public Z8.InterfaceC1869f e() {
        return this.f6970d;
    }
}
