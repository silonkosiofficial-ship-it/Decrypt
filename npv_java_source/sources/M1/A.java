package M1;

/* JADX INFO: loaded from: classes.dex */
public final class A implements m7.i.b {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final M1.A.a f6771E = new M1.A.a(null);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final java.lang.String f6772F = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final M1.A f6773C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final M1.j f6774D;

    public static final class a {

        /* JADX INFO: renamed from: M1.A$a$a, reason: collision with other inner class name */
        public static final class C0162a implements m7.i.c {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            public static final M1.A.a.C0162a f6775C = new M1.A.a.C0162a();

            private C0162a() {
            }
        }

        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public A(M1.A a6, M1.j jVar) {
        p247y7.AbstractC7350t.f(jVar, "instance");
        this.f6773C = a6;
        this.f6774D = jVar;
    }

    @Override // p127m7.i
    public java.lang.Object D(java.lang.Object obj, p237x7.p pVar) {
        return m7.i.b.a.a(this, obj, pVar);
    }

    public final void a(M1.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "candidate");
        if (this.f6774D == hVar) {
            throw new java.lang.IllegalStateException(f6772F.toString());
        }
        M1.A a6 = this.f6773C;
        if (a6 != null) {
            a6.a(hVar);
        }
    }

    @Override // m7.i.b
    public m7.i.c getKey() {
        return M1.A.a.C0162a.f6775C;
    }

    @Override // m7.i.b, p127m7.i
    public m7.i.b i(m7.i.c cVar) {
        return m7.i.b.a.b(this, cVar);
    }

    @Override // p127m7.i
    public p127m7.i o0(p127m7.i iVar) {
        return m7.i.b.a.d(this, iVar);
    }

    @Override // p127m7.i
    public p127m7.i y0(m7.i.c cVar) {
        return m7.i.b.a.c(this, cVar);
    }
}
