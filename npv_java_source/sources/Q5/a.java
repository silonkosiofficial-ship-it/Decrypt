package Q5;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements A5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A5.a f9058a = new Q5.a();

    /* JADX INFO: renamed from: Q5.a$a, reason: collision with other inner class name */
    private static final class C0207a implements z5.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Q5.a.C0207a f9059a = new Q5.a.C0207a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final z5.c f9060b = z5.c.d("rolloutId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final z5.c f9061c = z5.c.d("variantId");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final z5.c f9062d = z5.c.d("parameterKey");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final z5.c f9063e = z5.c.d("parameterValue");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final z5.c f9064f = z5.c.d("templateVersion");

        private C0207a() {
        }

        @Override // z5.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Q5.d dVar, z5.e eVar) {
            eVar.g(f9060b, dVar.d());
            eVar.g(f9061c, dVar.f());
            eVar.g(f9062d, dVar.b());
            eVar.g(f9063e, dVar.c());
            eVar.a(f9064f, dVar.e());
        }
    }

    private a() {
    }

    @Override // A5.a
    public void a(A5.b bVar) {
        Q5.a.C0207a c0207a = Q5.a.C0207a.f9059a;
        bVar.a(Q5.d.class, c0207a);
        bVar.a(Q5.b.class, c0207a);
    }
}
