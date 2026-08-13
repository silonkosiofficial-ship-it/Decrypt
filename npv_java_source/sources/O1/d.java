package O1;

/* JADX INFO: loaded from: classes.dex */
public final class d implements M1.w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final O1.d.b f7965f = new O1.d.b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.util.Set f7966g = new java.util.LinkedHashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final O1.h f7967h = new O1.h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X9.AbstractC1843k f7968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O1.c f7969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p237x7.p f7970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p237x7.a f7971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f7972e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final O1.d.a f7973D = new O1.d.a();

        a() {
            super(2);
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M1.n u(X9.Q q6, X9.AbstractC1843k abstractC1843k) {
            p247y7.AbstractC7350t.f(q6, "path");
            p247y7.AbstractC7350t.f(abstractC1843k, "<anonymous parameter 1>");
            return O1.f.a(q6);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final java.util.Set a() {
            return O1.d.f7966g;
        }

        public final O1.h b() {
            return O1.d.f7967h;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {
        c() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X9.Q b() {
            X9.Q q6 = (X9.Q) O1.d.this.f7971d.b();
            boolean zN = q6.n();
            O1.d dVar = O1.d.this;
            if (zN) {
                return q6.r();
            }
            throw new java.lang.IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + dVar.f7971d + ", instead got " + q6).toString());
        }
    }

    /* JADX INFO: renamed from: O1.d$d, reason: collision with other inner class name */
    static final class C0192d extends p247y7.AbstractC7352v implements p237x7.a {
        C0192d() {
            super(0);
        }

        public final void a() {
            O1.d.b bVar = O1.d.f7965f;
            O1.h hVarB = bVar.b();
            O1.d dVar = O1.d.this;
            synchronized (hVarB) {
                bVar.a().remove(dVar.f().toString());
                p087i7.M m6 = p087i7.M.f46721a;
            }
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    public d(X9.AbstractC1843k abstractC1843k, O1.c cVar, p237x7.p pVar, p237x7.a aVar) {
        p247y7.AbstractC7350t.f(abstractC1843k, "fileSystem");
        p247y7.AbstractC7350t.f(cVar, "serializer");
        p247y7.AbstractC7350t.f(pVar, "coordinatorProducer");
        p247y7.AbstractC7350t.f(aVar, "producePath");
        this.f7968a = abstractC1843k;
        this.f7969b = cVar;
        this.f7970c = pVar;
        this.f7971d = aVar;
        this.f7972e = p087i7.AbstractC6669o.b(new O1.d.c());
    }

    public /* synthetic */ d(X9.AbstractC1843k abstractC1843k, O1.c cVar, p237x7.p pVar, p237x7.a aVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(abstractC1843k, cVar, (i6 & 4) != 0 ? O1.d.a.f7973D : pVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final X9.Q f() {
        return (X9.Q) this.f7972e.getValue();
    }

    @Override // M1.w
    public M1.x a() {
        java.lang.String string = f().toString();
        synchronized (f7967h) {
            java.util.Set set = f7966g;
            if (!(!set.contains(string))) {
                throw new java.lang.IllegalStateException(("There are multiple DataStores active for the same file: " + string + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            set.add(string);
        }
        return new O1.e(this.f7968a, f(), this.f7969b, (M1.n) this.f7970c.u(f(), this.f7968a), new O1.d.C0192d());
    }
}
