package O1;

/* JADX INFO: loaded from: classes.dex */
public class b implements M1.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X9.AbstractC1843k f7956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X9.Q f7957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O1.c f7958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final O1.a f7959d;

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f7960F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f7961G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f7962H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f7964J;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f7962H = obj;
            this.f7964J |= Integer.MIN_VALUE;
            return O1.b.j(O1.b.this, this);
        }
    }

    public b(X9.AbstractC1843k abstractC1843k, X9.Q q6, O1.c cVar) {
        p247y7.AbstractC7350t.f(abstractC1843k, "fileSystem");
        p247y7.AbstractC7350t.f(q6, "path");
        p247y7.AbstractC7350t.f(cVar, "serializer");
        this.f7956a = abstractC1843k;
        this.f7957b = q6;
        this.f7958c = cVar;
        this.f7959d = new O1.a(false);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[Catch: FileNotFoundException -> 0x0086, TRY_ENTER, TryCatch #4 {FileNotFoundException -> 0x0086, blocks: (B:41:0x0082, B:44:0x008a, B:19:0x0042), top: B:58:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x008a A[Catch: FileNotFoundException -> 0x0086, TRY_LEAVE, TryCatch #4 {FileNotFoundException -> 0x0086, blocks: (B:41:0x0082, B:44:0x008a, B:19:0x0042), top: B:58:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0095  */
    /* JADX WARN: Code duplicated, block: B:49:0x009c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static /* synthetic */ java.lang.Object j(O1.b bVar, p127m7.e eVar) throws java.lang.Throwable {
        O1.b.a aVar;
        O1.b bVar2;
        java.io.FileNotFoundException e6;
        java.io.Closeable closeable;
        java.lang.Throwable th;
        if (eVar instanceof O1.b.a) {
            aVar = (O1.b.a) eVar;
            int i6 = aVar.f7964J;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f7964J = i6 - Integer.MIN_VALUE;
            } else {
                aVar = bVar.new a(eVar);
            }
        } else {
            aVar = bVar.new a(eVar);
        }
        java.lang.Object obj = aVar.f7962H;
        java.lang.Object objG = p137n7.b.g();
        int i10 = aVar.f7964J;
        java.lang.Throwable th2 = null;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable = (java.io.Closeable) aVar.f7961G;
            bVar2 = (O1.b) aVar.f7960F;
            try {
                p087i7.x.b(obj);
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (java.lang.Throwable th3) {
                        th2 = th3;
                    }
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (java.lang.Throwable th5) {
                        try {
                            p087i7.AbstractC6661g.a(th, th5);
                        } catch (java.io.FileNotFoundException e10) {
                            e6 = e10;
                            if (bVar2.f7956a.g(bVar2.f7957b)) {
                                throw e6;
                            }
                            return bVar2.f7958c.a();
                        }
                    }
                }
                th2 = th;
                obj = null;
            }
            if (th2 == null) {
                throw th2;
            }
            p247y7.AbstractC7350t.c(obj);
            return obj;
        }
        p087i7.x.b(obj);
        bVar.f();
        try {
            X9.InterfaceC1838f interfaceC1838fB = X9.K.b(bVar.f7956a.l(bVar.f7957b));
            try {
                O1.c cVar = bVar.f7958c;
                aVar.f7960F = bVar;
                aVar.f7961G = interfaceC1838fB;
                aVar.f7964J = 1;
                java.lang.Object objC = cVar.c(interfaceC1838fB, aVar);
                if (objC == objG) {
                    return objG;
                }
                bVar2 = bVar;
                closeable = interfaceC1838fB;
                obj = objC;
                if (closeable != null) {
                    closeable.close();
                }
                if (th2 == null) {
                    throw th2;
                }
                p247y7.AbstractC7350t.c(obj);
                return obj;
            } catch (java.lang.Throwable th6) {
                bVar2 = bVar;
                closeable = interfaceC1838fB;
                th = th6;
                if (closeable != null) {
                    closeable.close();
                }
                th2 = th;
                obj = null;
            }
        } catch (java.io.FileNotFoundException e11) {
            bVar2 = bVar;
            e6 = e11;
            if (bVar2.f7956a.g(bVar2.f7957b)) {
                return bVar2.f7958c.a();
            }
            throw e6;
        }
    }

    @Override // M1.r
    public java.lang.Object b(p127m7.e eVar) {
        return j(this, eVar);
    }

    @Override // M1.InterfaceC1350b
    public void close() {
        this.f7959d.b(true);
    }

    protected final void f() {
        if (!(!this.f7959d.a())) {
            throw new java.lang.IllegalStateException("This scope has already been closed.".toString());
        }
    }

    protected final X9.AbstractC1843k g() {
        return this.f7956a;
    }

    protected final X9.Q h() {
        return this.f7957b;
    }

    protected final O1.c i() {
        return this.f7958c;
    }
}
