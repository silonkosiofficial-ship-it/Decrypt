package p126m5;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements A5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A5.a f51124a = new p126m5.a();

    /* JADX INFO: renamed from: m5.a$a, reason: collision with other inner class name */
    private static final class C0647a implements z5.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final p126m5.a.C0647a f51125a = new p126m5.a.C0647a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final z5.c f51126b = z5.c.d("rolloutId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final z5.c f51127c = z5.c.d("parameterKey");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final z5.c f51128d = z5.c.d("parameterValue");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final z5.c f51129e = z5.c.d("variantId");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final z5.c f51130f = z5.c.d("templateVersion");

        private C0647a() {
        }

        @Override // z5.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p126m5.i iVar, z5.e eVar) {
            eVar.g(f51126b, iVar.e());
            eVar.g(f51127c, iVar.c());
            eVar.g(f51128d, iVar.d());
            eVar.g(f51129e, iVar.g());
            eVar.a(f51130f, iVar.f());
        }
    }

    private a() {
    }

    @Override // A5.a
    public void a(A5.b bVar) {
        p126m5.a.C0647a c0647a = p126m5.a.C0647a.f51125a;
        bVar.a(p126m5.i.class, c0647a);
        bVar.a(p126m5.b.class, c0647a);
    }
}
