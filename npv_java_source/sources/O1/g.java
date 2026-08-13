package O1;

/* JADX INFO: loaded from: classes.dex */
public final class g extends O1.b implements M1.B {

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f7996F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f7997G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f7998H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f7999I;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        int f8001K;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f7999I = obj;
            this.f8001K |= Integer.MIN_VALUE;
            return O1.g.this.e(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(X9.AbstractC1843k abstractC1843k, X9.Q q6, O1.c cVar) {
        super(abstractC1843k, q6, cVar);
        p247y7.AbstractC7350t.f(abstractC1843k, "fileSystem");
        p247y7.AbstractC7350t.f(q6, "path");
        p247y7.AbstractC7350t.f(cVar, "serializer");
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [O1.g$a, m7.e] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v6, types: [X9.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [X9.i] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [O1.c] */
    @Override // M1.B
    public java.lang.Object e(java.lang.Object obj, p127m7.e eVar) throws java.lang.Throwable {
        ?? aVar;
        ?? J10;
        p087i7.M m6;
        java.lang.Throwable th;
        java.io.Closeable closeable;
        ?? r6;
        java.lang.Throwable th2;
        p087i7.M m10;
        if (eVar instanceof O1.g.a) {
            O1.g.a aVar2 = (O1.g.a) eVar;
            int i6 = aVar2.f8001K;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar2.f8001K = i6 - Integer.MIN_VALUE;
                aVar = aVar2;
            } else {
                aVar = new O1.g.a(eVar);
            }
        } else {
            aVar = new O1.g.a(eVar);
        }
        java.lang.Object obj2 = aVar.f7999I;
        java.lang.Object objG = p137n7.b.g();
        int i10 = aVar.f8001K;
        java.lang.Throwable th3 = null;
        try {
            if (i10 == 0) {
                p087i7.x.b(obj2);
                f();
                J10 = g().j(h());
                try {
                    X9.InterfaceC1837e interfaceC1837eA = X9.K.a(X9.AbstractC1841i.g0(J10, 0L, 1, null));
                    try {
                        ?? I10 = i();
                        aVar.f7996F = J10;
                        aVar.f7997G = J10;
                        aVar.f7998H = interfaceC1837eA;
                        aVar.f8001K = 1;
                        if (I10.b(obj, interfaceC1837eA, aVar) == objG) {
                            return objG;
                        }
                        ?? r10 = J10;
                        r6 = r10;
                        closeable = interfaceC1837eA;
                        aVar = r10;
                    } catch (java.lang.Throwable th4) {
                        aVar = J10;
                        th = th4;
                        closeable = interfaceC1837eA;
                        if (closeable != null) {
                            closeable.close();
                        }
                        th2 = th;
                        m10 = null;
                    }
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    if (J10 != 0) {
                        try {
                            J10.close();
                        } catch (java.lang.Throwable th6) {
                            p087i7.AbstractC6661g.a(th, th6);
                        }
                    }
                    th3 = th;
                    m6 = null;
                }
            } else {
                if (i10 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (java.io.Closeable) aVar.f7998H;
                X9.AbstractC1841i abstractC1841i = (X9.AbstractC1841i) aVar.f7997G;
                aVar = (java.io.Closeable) aVar.f7996F;
                try {
                    p087i7.x.b(obj2);
                    aVar = aVar;
                    r6 = abstractC1841i;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    if (closeable != null) {
                        try {
                            closeable.close();
                        } catch (java.lang.Throwable th8) {
                            p087i7.AbstractC6661g.a(th, th8);
                        }
                    }
                    th2 = th;
                    m10 = null;
                }
            }
            r6.flush();
            m10 = p087i7.M.f46721a;
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (java.lang.Throwable th9) {
                    th2 = th9;
                }
            }
            th2 = null;
            if (th2 != null) {
                throw th2;
            }
            p247y7.AbstractC7350t.c(m10);
            m6 = p087i7.M.f46721a;
            if (aVar != 0) {
                try {
                    aVar.close();
                } catch (java.lang.Throwable th10) {
                    th3 = th10;
                }
            }
            if (th3 != null) {
                throw th3;
            }
            p247y7.AbstractC7350t.c(m6);
            return p087i7.M.f46721a;
        } catch (java.lang.Throwable th11) {
            th = th11;
            J10 = aVar;
        }
    }
}
