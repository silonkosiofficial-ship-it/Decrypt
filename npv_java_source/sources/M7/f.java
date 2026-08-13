package M7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p138n8.c f7062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f7063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f7064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p138n8.b f7065d;

    public static final class a extends M7.f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final M7.f.a f7066e = new M7.f.a();

        private a() {
            super(L7.j.f6325y, "Function", false, null);
        }
    }

    public static final class b extends M7.f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final M7.f.b f7067e = new M7.f.b();

        private b() {
            super(L7.j.f6322v, "KFunction", true, null);
        }
    }

    public static final class c extends M7.f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final M7.f.c f7068e = new M7.f.c();

        private c() {
            super(L7.j.f6322v, "KSuspendFunction", true, null);
        }
    }

    public static final class d extends M7.f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final M7.f.d f7069e = new M7.f.d();

        private d() {
            super(L7.j.f6317q, "SuspendFunction", false, null);
        }
    }

    public f(p138n8.c cVar, java.lang.String str, boolean z6, p138n8.b bVar) {
        p247y7.AbstractC7350t.f(cVar, "packageFqName");
        p247y7.AbstractC7350t.f(str, "classNamePrefix");
        this.f7062a = cVar;
        this.f7063b = str;
        this.f7064c = z6;
        this.f7065d = bVar;
    }

    public final java.lang.String a() {
        return this.f7063b;
    }

    public final p138n8.c b() {
        return this.f7062a;
    }

    public final p138n8.f c(int i6) {
        p138n8.f fVarO = p138n8.f.o(this.f7063b + i6);
        p247y7.AbstractC7350t.e(fVarO, "identifier(...)");
        return fVarO;
    }

    public java.lang.String toString() {
        return this.f7062a + '.' + this.f7063b + 'N';
    }
}
