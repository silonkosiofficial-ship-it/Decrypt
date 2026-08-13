package Y2;

/* JADX INFO: loaded from: classes.dex */
public final class a implements A5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A5.a f16251a = new Y2.a();

    /* JADX INFO: renamed from: Y2.a$a, reason: collision with other inner class name */
    private static final class C0306a implements z5.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Y2.a.C0306a f16252a = new Y2.a.C0306a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final z5.c f16253b = z5.c.a("window").b(C5.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final z5.c f16254c = z5.c.a("logSourceMetrics").b(C5.a.b().c(2).a()).a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final z5.c f16255d = z5.c.a("globalMetrics").b(C5.a.b().c(3).a()).a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final z5.c f16256e = z5.c.a("appNamespace").b(C5.a.b().c(4).a()).a();

        private C0306a() {
        }

        @Override // z5.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p014b3.a aVar, z5.e eVar) {
            eVar.g(f16253b, aVar.d());
            eVar.g(f16254c, aVar.c());
            eVar.g(f16255d, aVar.b());
            eVar.g(f16256e, aVar.a());
        }
    }

    private static final class b implements z5.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Y2.a.b f16257a = new Y2.a.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final z5.c f16258b = z5.c.a("storageMetrics").b(C5.a.b().c(1).a()).a();

        private b() {
        }

        @Override // z5.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p014b3.b bVar, z5.e eVar) {
            eVar.g(f16258b, bVar.a());
        }
    }

    private static final class c implements z5.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Y2.a.c f16259a = new Y2.a.c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final z5.c f16260b = z5.c.a("eventsDroppedCount").b(C5.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final z5.c f16261c = z5.c.a("reason").b(C5.a.b().c(3).a()).a();

        private c() {
        }

        @Override // z5.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p014b3.c cVar, z5.e eVar) {
            eVar.a(f16260b, cVar.a());
            eVar.g(f16261c, cVar.b());
        }
    }

    private static final class d implements z5.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Y2.a.d f16262a = new Y2.a.d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final z5.c f16263b = z5.c.a("logSource").b(C5.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final z5.c f16264c = z5.c.a("logEventDropped").b(C5.a.b().c(2).a()).a();

        private d() {
        }

        @Override // z5.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p014b3.d dVar, z5.e eVar) {
            eVar.g(f16263b, dVar.b());
            eVar.g(f16264c, dVar.a());
        }
    }

    private static final class e implements z5.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Y2.a.e f16265a = new Y2.a.e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final z5.c f16266b = z5.c.d("clientMetrics");

        private e() {
        }

        @Override // z5.d
        public /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Object obj2) {
            androidx.appcompat.app.D.a(obj);
            b(null, (z5.e) obj2);
        }

        public void b(Y2.m mVar, z5.e eVar) {
            throw null;
        }
    }

    private static final class f implements z5.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Y2.a.f f16267a = new Y2.a.f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final z5.c f16268b = z5.c.a("currentCacheSizeBytes").b(C5.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final z5.c f16269c = z5.c.a("maxCacheSizeBytes").b(C5.a.b().c(2).a()).a();

        private f() {
        }

        @Override // z5.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p014b3.e eVar, z5.e eVar2) {
            eVar2.a(f16268b, eVar.a());
            eVar2.a(f16269c, eVar.b());
        }
    }

    private static final class g implements z5.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Y2.a.g f16270a = new Y2.a.g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final z5.c f16271b = z5.c.a("startMs").b(C5.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final z5.c f16272c = z5.c.a("endMs").b(C5.a.b().c(2).a()).a();

        private g() {
        }

        @Override // z5.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p014b3.f fVar, z5.e eVar) {
            eVar.a(f16271b, fVar.b());
            eVar.a(f16272c, fVar.a());
        }
    }

    private a() {
    }

    @Override // A5.a
    public void a(A5.b bVar) {
        bVar.a(Y2.m.class, Y2.a.e.f16265a);
        bVar.a(p014b3.a.class, Y2.a.C0306a.f16252a);
        bVar.a(p014b3.f.class, Y2.a.g.f16270a);
        bVar.a(p014b3.d.class, Y2.a.d.f16262a);
        bVar.a(p014b3.c.class, Y2.a.c.f16259a);
        bVar.a(p014b3.b.class, Y2.a.b.f16257a);
        bVar.a(p014b3.e.class, Y2.a.f.f16267a);
    }
}
