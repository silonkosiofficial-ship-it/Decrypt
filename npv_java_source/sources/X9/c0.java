package X9;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 extends X9.AbstractC1843k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final X9.c0.a f16132i = new X9.c0.a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final X9.Q f16133j = X9.Q.a.e(X9.Q.f16083D, "/", false, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final X9.Q f16134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final X9.AbstractC1843k f16135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.Map f16136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.String f16137h;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public c0(X9.Q q6, X9.AbstractC1843k abstractC1843k, java.util.Map map, java.lang.String str) {
        p247y7.AbstractC7350t.f(q6, "zipPath");
        p247y7.AbstractC7350t.f(abstractC1843k, "fileSystem");
        p247y7.AbstractC7350t.f(map, "entries");
        this.f16134e = q6;
        this.f16135f = abstractC1843k;
        this.f16136g = map;
        this.f16137h = str;
    }

    private final X9.Q m(X9.Q q6) {
        return f16133j.u(q6, true);
    }

    @Override // X9.AbstractC1843k
    public void a(X9.Q q6, X9.Q q10) throws java.io.IOException {
        p247y7.AbstractC7350t.f(q6, "source");
        p247y7.AbstractC7350t.f(q10, "target");
        throw new java.io.IOException("zip file systems are read-only");
    }

    @Override // X9.AbstractC1843k
    public void d(X9.Q q6, boolean z6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(q6, "dir");
        throw new java.io.IOException("zip file systems are read-only");
    }

    @Override // X9.AbstractC1843k
    public void f(X9.Q q6, boolean z6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(q6, "path");
        throw new java.io.IOException("zip file systems are read-only");
    }

    @Override // X9.AbstractC1843k
    public X9.C1842j h(X9.Q q6) throws java.lang.Throwable {
        java.lang.Throwable th;
        java.lang.Throwable th2;
        p247y7.AbstractC7350t.f(q6, "path");
        Y9.i iVarJ = (Y9.i) this.f16136g.get(m(q6));
        if (iVarJ == null) {
            return null;
        }
        if (iVarJ.i() != -1) {
            X9.AbstractC1841i abstractC1841iI = this.f16135f.i(this.f16134e);
            try {
                X9.InterfaceC1838f interfaceC1838fB = X9.K.b(abstractC1841iI.o0(iVarJ.i()));
                try {
                    iVarJ = Y9.j.j(interfaceC1838fB, iVarJ);
                    if (interfaceC1838fB != null) {
                        try {
                            interfaceC1838fB.close();
                        } catch (java.lang.Throwable th3) {
                            th2 = th3;
                        }
                    }
                    th2 = null;
                } catch (java.lang.Throwable th4) {
                    if (interfaceC1838fB != null) {
                        try {
                            interfaceC1838fB.close();
                        } catch (java.lang.Throwable th5) {
                            p087i7.AbstractC6661g.a(th4, th5);
                        }
                    }
                    th2 = th4;
                    iVarJ = null;
                }
                if (th2 != null) {
                    throw th2;
                }
                if (abstractC1841iI != null) {
                    try {
                        abstractC1841iI.close();
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                    }
                }
                th = null;
            } catch (java.lang.Throwable th7) {
                if (abstractC1841iI != null) {
                    try {
                        abstractC1841iI.close();
                    } catch (java.lang.Throwable th8) {
                        p087i7.AbstractC6661g.a(th7, th8);
                    }
                }
                th = th7;
                iVarJ = null;
            }
            if (th != null) {
                throw th;
            }
        }
        return new X9.C1842j(!iVarJ.k(), iVarJ.k(), null, iVarJ.k() ? null : java.lang.Long.valueOf(iVarJ.j()), iVarJ.f(), iVarJ.h(), iVarJ.g(), null, 128, null);
    }

    @Override // X9.AbstractC1843k
    public X9.AbstractC1841i i(X9.Q q6) {
        p247y7.AbstractC7350t.f(q6, "file");
        throw new java.lang.UnsupportedOperationException("not implemented yet!");
    }

    @Override // X9.AbstractC1843k
    public X9.AbstractC1841i k(X9.Q q6, boolean z6, boolean z10) throws java.io.IOException {
        p247y7.AbstractC7350t.f(q6, "file");
        throw new java.io.IOException("zip entries are not writable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // X9.AbstractC1843k
    public X9.Z l(X9.Q q6) throws java.io.FileNotFoundException {
        p247y7.AbstractC7350t.f(q6, "file");
        Y9.i iVar = (Y9.i) this.f16136g.get(m(q6));
        if (iVar == null) {
            throw new java.io.FileNotFoundException("no such file: " + q6);
        }
        X9.AbstractC1841i abstractC1841iI = this.f16135f.i(this.f16134e);
        X9.InterfaceC1838f th = null;
        try {
            X9.InterfaceC1838f interfaceC1838fB = X9.K.b(abstractC1841iI.o0(iVar.i()));
            if (abstractC1841iI != null) {
                try {
                    abstractC1841iI.close();
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            }
            th = th;
            th = interfaceC1838fB;
        } catch (java.lang.Throwable th3) {
            th = th3;
            if (abstractC1841iI != null) {
                try {
                    abstractC1841iI.close();
                } catch (java.lang.Throwable th4) {
                    p087i7.AbstractC6661g.a(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        Y9.j.m(th);
        return iVar.e() == 0 ? new Y9.g(th, iVar.j(), true) : new Y9.g(new X9.C1848p(new Y9.g(th, iVar.d(), true), new java.util.zip.Inflater(true)), iVar.j(), false);
    }
}
