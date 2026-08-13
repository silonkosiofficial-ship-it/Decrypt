package P1;

/* JADX INFO: loaded from: classes.dex */
public final class c implements B7.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f8274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final N1.b f8275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p237x7.l f8276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final W8.N f8277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.Object f8278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile M1.h f8279f;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ android.content.Context f8280D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ P1.c f8281E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(android.content.Context context, P1.c cVar) {
            super(0);
            this.f8280D = context;
            this.f8281E = cVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.io.File b() {
            android.content.Context context = this.f8280D;
            p247y7.AbstractC7350t.e(context, "applicationContext");
            return P1.b.a(context, this.f8281E.f8274a);
        }
    }

    public c(java.lang.String str, N1.b bVar, p237x7.l lVar, W8.N n6) {
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(lVar, "produceMigrations");
        p247y7.AbstractC7350t.f(n6, "scope");
        this.f8274a = str;
        this.f8275b = bVar;
        this.f8276c = lVar;
        this.f8277d = n6;
        this.f8278e = new java.lang.Object();
    }

    @Override // B7.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public M1.h a(android.content.Context context, F7.k kVar) {
        M1.h hVar;
        p247y7.AbstractC7350t.f(context, "thisRef");
        p247y7.AbstractC7350t.f(kVar, "property");
        M1.h hVar2 = this.f8279f;
        if (hVar2 != null) {
            return hVar2;
        }
        synchronized (this.f8278e) {
            try {
                if (this.f8279f == null) {
                    android.content.Context applicationContext = context.getApplicationContext();
                    Q1.e eVar = Q1.e.f8762a;
                    N1.b bVar = this.f8275b;
                    p237x7.l lVar = this.f8276c;
                    p247y7.AbstractC7350t.e(applicationContext, "applicationContext");
                    this.f8279f = eVar.b(bVar, (java.util.List) lVar.l(applicationContext), this.f8277d, new P1.c.a(applicationContext, this));
                }
                hVar = this.f8279f;
                p247y7.AbstractC7350t.c(hVar);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return hVar;
    }
}
