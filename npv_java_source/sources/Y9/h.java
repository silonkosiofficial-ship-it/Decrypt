package Y9;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends X9.AbstractC1843k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Y9.h.a f16587h = new Y9.h.a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final X9.Q f16588i = X9.Q.a.e(X9.Q.f16083D, "/", false, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.ClassLoader f16589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final X9.AbstractC1843k f16590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f16591g;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(X9.Q q6) {
            return !S8.r.I(q6.o(), ".class", true);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {
        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            Y9.h hVar = Y9.h.this;
            return hVar.r(hVar.f16589e);
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final Y9.h.c f16593D = new Y9.h.c();

        c() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(Y9.i iVar) {
            p247y7.AbstractC7350t.f(iVar, "entry");
            return java.lang.Boolean.valueOf(Y9.h.f16587h.b(iVar.b()));
        }
    }

    public h(java.lang.ClassLoader classLoader, boolean z6, X9.AbstractC1843k abstractC1843k) {
        p247y7.AbstractC7350t.f(classLoader, "classLoader");
        p247y7.AbstractC7350t.f(abstractC1843k, "systemFileSystem");
        this.f16589e = classLoader;
        this.f16590f = abstractC1843k;
        this.f16591g = p087i7.AbstractC6669o.b(new Y9.h.b());
        if (z6) {
            q().size();
        }
    }

    public /* synthetic */ h(java.lang.ClassLoader classLoader, boolean z6, X9.AbstractC1843k abstractC1843k, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(classLoader, z6, (i6 & 4) != 0 ? X9.AbstractC1843k.f16176b : abstractC1843k);
    }

    private final X9.Q p(X9.Q q6) {
        return f16588i.u(q6, true);
    }

    private final java.util.List q() {
        return (java.util.List) this.f16591g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List r(java.lang.ClassLoader classLoader) throws java.io.IOException {
        java.util.Enumeration<java.net.URL> resources = classLoader.getResources("");
        p247y7.AbstractC7350t.e(resources, "getResources(...)");
        java.util.ArrayList<java.net.URL> list = java.util.Collections.list(resources);
        p247y7.AbstractC7350t.e(list, "list(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.net.URL url : list) {
            p247y7.AbstractC7350t.c(url);
            p087i7.u uVarS = s(url);
            if (uVarS != null) {
                arrayList.add(uVarS);
            }
        }
        java.util.Enumeration<java.net.URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        p247y7.AbstractC7350t.e(resources2, "getResources(...)");
        java.util.ArrayList<java.net.URL> list2 = java.util.Collections.list(resources2);
        p247y7.AbstractC7350t.e(list2, "list(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.net.URL url2 : list2) {
            p247y7.AbstractC7350t.c(url2);
            p087i7.u uVarT = t(url2);
            if (uVarT != null) {
                arrayList2.add(uVarT);
            }
        }
        return p097j7.AbstractC6879v.C0(arrayList, arrayList2);
    }

    private final p087i7.u s(java.net.URL url) {
        if (p247y7.AbstractC7350t.b(url.getProtocol(), "file")) {
            return p087i7.B.a(this.f16590f, X9.Q.a.d(X9.Q.f16083D, new java.io.File(url.toURI()), false, 1, null));
        }
        return null;
    }

    private final p087i7.u t(java.net.URL url) {
        int iW0;
        java.lang.String string = url.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        if (!S8.r.V(string, "jar:file:", false, 2, null) || (iW0 = S8.r.w0(string, "!", 0, false, 6, null)) == -1) {
            return null;
        }
        X9.Q.a aVar = X9.Q.f16083D;
        java.lang.String strSubstring = string.substring(4, iW0);
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        return p087i7.B.a(Y9.j.f(X9.Q.a.d(aVar, new java.io.File(java.net.URI.create(strSubstring)), false, 1, null), this.f16590f, Y9.h.c.f16593D), f16588i);
    }

    private final java.lang.String u(X9.Q q6) {
        return p(q6).t(f16588i).toString();
    }

    @Override // X9.AbstractC1843k
    public void a(X9.Q q6, X9.Q q10) throws java.io.IOException {
        p247y7.AbstractC7350t.f(q6, "source");
        p247y7.AbstractC7350t.f(q10, "target");
        throw new java.io.IOException(this + " is read-only");
    }

    @Override // X9.AbstractC1843k
    public void d(X9.Q q6, boolean z6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(q6, "dir");
        throw new java.io.IOException(this + " is read-only");
    }

    @Override // X9.AbstractC1843k
    public void f(X9.Q q6, boolean z6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(q6, "path");
        throw new java.io.IOException(this + " is read-only");
    }

    @Override // X9.AbstractC1843k
    public X9.C1842j h(X9.Q q6) {
        p247y7.AbstractC7350t.f(q6, "path");
        if (!f16587h.b(q6)) {
            return null;
        }
        java.lang.String strU = u(q6);
        for (p087i7.u uVar : q()) {
            X9.C1842j c1842jH = ((X9.AbstractC1843k) uVar.a()).h(((X9.Q) uVar.b()).v(strU));
            if (c1842jH != null) {
                return c1842jH;
            }
        }
        return null;
    }

    @Override // X9.AbstractC1843k
    public X9.AbstractC1841i i(X9.Q q6) throws java.io.FileNotFoundException {
        p247y7.AbstractC7350t.f(q6, "file");
        if (!f16587h.b(q6)) {
            throw new java.io.FileNotFoundException("file not found: " + q6);
        }
        java.lang.String strU = u(q6);
        for (p087i7.u uVar : q()) {
            try {
                return ((X9.AbstractC1843k) uVar.a()).i(((X9.Q) uVar.b()).v(strU));
            } catch (java.io.FileNotFoundException unused) {
            }
        }
        throw new java.io.FileNotFoundException("file not found: " + q6);
    }

    @Override // X9.AbstractC1843k
    public X9.AbstractC1841i k(X9.Q q6, boolean z6, boolean z10) throws java.io.IOException {
        p247y7.AbstractC7350t.f(q6, "file");
        throw new java.io.IOException("resources are not writable");
    }

    @Override // X9.AbstractC1843k
    public X9.Z l(X9.Q q6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(q6, "file");
        if (!f16587h.b(q6)) {
            throw new java.io.FileNotFoundException("file not found: " + q6);
        }
        X9.Q q10 = f16588i;
        java.net.URL resource = this.f16589e.getResource(X9.Q.w(q10, q6, false, 2, null).t(q10).toString());
        if (resource == null) {
            throw new java.io.FileNotFoundException("file not found: " + q6);
        }
        java.net.URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof java.net.JarURLConnection) {
            ((java.net.JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        java.io.InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        p247y7.AbstractC7350t.e(inputStream, "getInputStream(...)");
        return X9.K.f(inputStream);
    }
}
