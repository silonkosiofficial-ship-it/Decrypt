package O1;

/* JADX INFO: loaded from: classes.dex */
public final class e implements M1.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X9.AbstractC1843k f7976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X9.Q f7977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O1.c f7978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final M1.n f7979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p237x7.a f7980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final O1.a f7981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p059f9.a f7982g;

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f7983F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f7984G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        boolean f7985H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f7986I;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        int f7988K;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f7986I = obj;
            this.f7988K |= Integer.MIN_VALUE;
            return O1.e.this.a(null, this);
        }
    }

    static final class b extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f7989F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f7990G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f7991H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f7992I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        /* synthetic */ java.lang.Object f7993J;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        int f7995L;

        b(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f7993J = obj;
            this.f7995L |= Integer.MIN_VALUE;
            return O1.e.this.c(null, this);
        }
    }

    public e(X9.AbstractC1843k abstractC1843k, X9.Q q6, O1.c cVar, M1.n nVar, p237x7.a aVar) {
        p247y7.AbstractC7350t.f(abstractC1843k, "fileSystem");
        p247y7.AbstractC7350t.f(q6, "path");
        p247y7.AbstractC7350t.f(cVar, "serializer");
        p247y7.AbstractC7350t.f(nVar, "coordinator");
        p247y7.AbstractC7350t.f(aVar, "onClose");
        this.f7976a = abstractC1843k;
        this.f7977b = q6;
        this.f7978c = cVar;
        this.f7979d = nVar;
        this.f7980e = aVar;
        this.f7981f = new O1.a(false);
        this.f7982g = p059f9.g.b(false, 1, null);
    }

    private final void f() {
        if (!(!this.f7981f.a())) {
            throw new java.lang.IllegalStateException("StorageConnection has already been disposed.".toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:31:0x007d A[Catch: all -> 0x007e, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x007e, blocks: (B:31:0x007d, B:40:0x008e, B:39:0x008b, B:36:0x0086), top: B:54:0x0022, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [O1.e] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [O1.e$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [O1.e] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [O1.e] */
    /* JADX WARN: Type inference failed for: r10v0, types: [x7.q] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // M1.x
    public java.lang.Object a(p237x7.q qVar, p127m7.e eVar) throws java.lang.Throwable {
        ?? aVar;
        M1.InterfaceC1350b interfaceC1350b;
        java.lang.Throwable th;
        ?? r6;
        ?? r10;
        if (eVar instanceof O1.e.a) {
            O1.e.a aVar2 = (O1.e.a) eVar;
            int i6 = aVar2.f7988K;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar2.f7988K = i6 - Integer.MIN_VALUE;
                aVar = aVar2;
            } else {
                aVar = new O1.e.a(eVar);
            }
        } else {
            aVar = new O1.e.a(eVar);
        }
        java.lang.Object obj = aVar.f7986I;
        java.lang.Object objG = p137n7.b.g();
        int i10 = aVar.f7988K;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qVar = aVar.f7985H;
                interfaceC1350b = (M1.InterfaceC1350b) aVar.f7984G;
                aVar = (O1.e) aVar.f7983F;
                try {
                    p087i7.x.b(obj);
                    r6 = aVar;
                    r10 = qVar;
                    try {
                        interfaceC1350b.close();
                        th = null;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r10 != 0) {
                        p059f9.a.C0508a.c(r6.f7982g, null, 1, null);
                    }
                    return obj;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    try {
                        interfaceC1350b.close();
                    } catch (java.lang.Throwable th4) {
                        p087i7.AbstractC6661g.a(th, th4);
                    }
                    throw th;
                }
            }
            p087i7.x.b(obj);
            f();
            boolean zB = p059f9.a.C0508a.b(this.f7982g, null, 1, null);
            try {
                O1.b bVar = new O1.b(this.f7976a, this.f7977b, this.f7978c);
                try {
                    java.lang.Boolean boolA = p147o7.b.a(zB);
                    aVar.f7983F = this;
                    aVar.f7984G = bVar;
                    aVar.f7985H = zB;
                    aVar.f7988K = 1;
                    java.lang.Object objJ = qVar.j(bVar, boolA, aVar);
                    if (objJ == objG) {
                        return objG;
                    }
                    r6 = this;
                    interfaceC1350b = bVar;
                    obj = objJ;
                    r10 = zB;
                    interfaceC1350b.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r10 != 0) {
                        p059f9.a.C0508a.c(r6.f7982g, null, 1, null);
                    }
                    return obj;
                } catch (java.lang.Throwable th5) {
                    aVar = this;
                    interfaceC1350b = bVar;
                    th = th5;
                    qVar = zB;
                    interfaceC1350b.close();
                    throw th;
                }
            } catch (java.lang.Throwable th6) {
                aVar = this;
                th = th6;
                qVar = zB;
                if (qVar != 0) {
                    p059f9.a.C0508a.c(aVar.f7982g, null, 1, null);
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            if (qVar != 0) {
                p059f9.a.C0508a.c(aVar.f7982g, null, 1, null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00cf A[Catch: all -> 0x00df, IOException -> 0x00e2, TRY_ENTER, TryCatch #2 {IOException -> 0x00e2, blocks: (B:37:0x00cf, B:39:0x00d7, B:48:0x00ef, B:55:0x00fe, B:54:0x00fb), top: B:72:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7 A[Catch: all -> 0x00df, IOException -> 0x00e2, TRY_LEAVE, TryCatch #2 {IOException -> 0x00e2, blocks: (B:37:0x00cf, B:39:0x00d7, B:48:0x00ef, B:55:0x00fe, B:54:0x00fb), top: B:72:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ef A[Catch: all -> 0x00df, IOException -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x00e2, blocks: (B:37:0x00cf, B:39:0x00d7, B:48:0x00ef, B:55:0x00fe, B:54:0x00fb), top: B:72:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3, types: [X9.k] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X9.k] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [O1.e] */
    /* JADX WARN: Type inference failed for: r10v19, types: [X9.k] */
    /* JADX WARN: Type inference failed for: r10v23, types: [X9.k] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [f9.a] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [X9.Q] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [X9.Q] */
    /* JADX WARN: Type inference failed for: r2v5, types: [X9.Q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [f9.a] */
    /* JADX WARN: Type inference failed for: r5v4, types: [X9.k] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [O1.e] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [O1.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // M1.x
    public java.lang.Object c(p237x7.p pVar, p127m7.e eVar) throws java.lang.Throwable {
        O1.e.b bVar;
        ?? r11;
        ?? r10;
        ?? V10;
        X9.Q qS;
        O1.g gVar;
        java.lang.Throwable th;
        M1.InterfaceC1350b interfaceC1350b;
        ?? r6;
        ?? r12;
        ?? r13;
        if (eVar instanceof O1.e.b) {
            bVar = (O1.e.b) eVar;
            int i6 = bVar.f7995L;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                bVar.f7995L = i6 - Integer.MIN_VALUE;
            } else {
                bVar = new O1.e.b(eVar);
            }
        } else {
            bVar = new O1.e.b(eVar);
        }
        java.lang.Object obj = bVar.f7993J;
        java.lang.Object objG = p137n7.b.g();
        ?? r14 = bVar.f7995L;
        try {
            try {
                try {
                    try {
                        try {
                            if (r14 == 0) {
                                p087i7.x.b(obj);
                                f();
                                qS = this.f7977b.s();
                                if (qS == null) {
                                    throw new java.lang.IllegalStateException("must have a parent path".toString());
                                }
                                this.f7976a.b(qS, false);
                                p059f9.a aVar = this.f7982g;
                                bVar.f7989F = this;
                                bVar.f7990G = pVar;
                                bVar.f7991H = qS;
                                bVar.f7992I = aVar;
                                bVar.f7995L = 1;
                                if (aVar.c(null, bVar) == objG) {
                                    return objG;
                                }
                                r10 = this;
                                r11 = aVar;
                            } else {
                                if (r14 != 1) {
                                    if (r14 != 2) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    interfaceC1350b = (M1.InterfaceC1350b) bVar.f7992I;
                                    X9.Q q6 = (X9.Q) bVar.f7991H;
                                    p059f9.a aVar2 = (p059f9.a) bVar.f7990G;
                                    O1.e eVar2 = (O1.e) bVar.f7989F;
                                    try {
                                        p087i7.x.b(obj);
                                        r12 = eVar2;
                                        r6 = q6;
                                        r13 = aVar2;
                                        p087i7.M m6 = p087i7.M.f46721a;
                                        try {
                                            interfaceC1350b.close();
                                            th = null;
                                        } catch (java.lang.Throwable th2) {
                                            th = th2;
                                        }
                                        if (th == null) {
                                            throw th;
                                        }
                                        if (r12.f7976a.g(r6)) {
                                            r12.f7976a.a(r6, r12.f7977b);
                                        }
                                        p087i7.M m10 = p087i7.M.f46721a;
                                        r13.d(null);
                                        return p087i7.M.f46721a;
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        try {
                                            interfaceC1350b.close();
                                        } catch (java.lang.Throwable th4) {
                                            p087i7.AbstractC6661g.a(th, th4);
                                        }
                                        throw th;
                                    }
                                }
                                p059f9.a aVar3 = (p059f9.a) bVar.f7992I;
                                qS = (X9.Q) bVar.f7991H;
                                p237x7.p pVar2 = (p237x7.p) bVar.f7990G;
                                O1.e eVar3 = (O1.e) bVar.f7989F;
                                p087i7.x.b(obj);
                                r11 = aVar3;
                                pVar = pVar2;
                                r10 = eVar3;
                            }
                            bVar.f7989F = r10;
                            bVar.f7990G = r11;
                            bVar.f7991H = V10;
                            bVar.f7992I = gVar;
                            bVar.f7995L = 2;
                            if (pVar.u(gVar, bVar) == objG) {
                                return objG;
                            }
                            r6 = V10;
                            interfaceC1350b = gVar;
                            r12 = r10;
                            r13 = r11;
                            p087i7.M m11 = p087i7.M.f46721a;
                            interfaceC1350b.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (r12.f7976a.g(r6)) {
                                r12.f7976a.a(r6, r12.f7977b);
                            }
                            p087i7.M m12 = p087i7.M.f46721a;
                            r13.d(null);
                            return p087i7.M.f46721a;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            interfaceC1350b = gVar;
                            interfaceC1350b.close();
                            throw th;
                        }
                        r10.f7976a.f(V10, false);
                        gVar = new O1.g(r10.f7976a, V10, r10.f7978c);
                    } catch (java.io.IOException e6) {
                        e = e6;
                        if (r10.f7976a.g(V10)) {
                            try {
                                r10.f7976a.e(V10);
                            } catch (java.io.IOException unused) {
                            }
                        }
                        throw e;
                    }
                    V10 = qS.v(r10.f7977b.o() + ".tmp");
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    r11.d(null);
                    throw th;
                }
            } catch (java.io.IOException e10) {
                e = e10;
                r10 = bVar;
                r11 = r14;
                V10 = objG;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            r11 = r14;
            r11.d(null);
            throw th;
        }
    }

    @Override // M1.InterfaceC1350b
    public void close() {
        this.f7981f.b(true);
        this.f7980e.b();
    }

    @Override // M1.x
    public M1.n d() {
        return this.f7979d;
    }
}
