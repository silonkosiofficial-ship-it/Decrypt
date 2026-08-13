package p249y9;

/* JADX INFO: renamed from: y9.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7360d implements p199t9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p249y9.C7360d f57398a = new p249y9.C7360d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p219v9.f f57399b = p249y9.C7360d.a.f57400b;

    /* JADX INFO: renamed from: y9.d$a */
    private static final class a implements p219v9.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final p249y9.C7360d.a f57400b = new p249y9.C7360d.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final java.lang.String f57401c = "kotlinx.serialization.json.JsonArray";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ p219v9.f f57402a = p209u9.a.g(p249y9.q.f57437a).a();

        private a() {
        }

        @Override // p219v9.f
        public java.lang.String a() {
            return f57401c;
        }

        @Override // p219v9.f
        public boolean c() {
            return this.f57402a.c();
        }

        @Override // p219v9.f
        public int d(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "name");
            return this.f57402a.d(str);
        }

        @Override // p219v9.f
        public int e() {
            return this.f57402a.e();
        }

        @Override // p219v9.f
        public java.lang.String f(int i6) {
            return this.f57402a.f(i6);
        }

        @Override // p219v9.f
        public java.util.List g(int i6) {
            return this.f57402a.g(i6);
        }

        @Override // p219v9.f
        public p219v9.f h(int i6) {
            return this.f57402a.h(i6);
        }

        @Override // p219v9.f
        public boolean i(int i6) {
            return this.f57402a.i(i6);
        }

        @Override // p219v9.f
        public p219v9.m j() {
            return this.f57402a.j();
        }

        @Override // p219v9.f
        public java.util.List k() {
            return this.f57402a.k();
        }

        @Override // p219v9.f
        public boolean m() {
            return this.f57402a.m();
        }
    }

    private C7360d() {
    }

    @Override // p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return f57399b;
    }

    @Override // p199t9.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public p249y9.C7359c b(p229w9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "decoder");
        p249y9.r.g(hVar);
        return new p249y9.C7359c((java.util.List) p209u9.a.g(p249y9.q.f57437a).b(hVar));
    }

    @Override // p199t9.e
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(p229w9.j jVar, p249y9.C7359c c7359c) {
        p247y7.AbstractC7350t.f(jVar, "encoder");
        p247y7.AbstractC7350t.f(c7359c, "value");
        p249y9.r.h(jVar);
        p209u9.a.g(p249y9.q.f57437a).e(jVar, c7359c);
    }
}
