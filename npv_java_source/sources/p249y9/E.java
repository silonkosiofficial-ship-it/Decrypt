package p249y9;

/* JADX INFO: loaded from: classes2.dex */
public final class E implements p199t9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p249y9.E f57381a = new p249y9.E();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p219v9.f f57382b = y9.E.a.f57383b;

    private static final class a implements p219v9.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final y9.E.a f57383b = new y9.E.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final java.lang.String f57384c = "kotlinx.serialization.json.JsonObject";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ p219v9.f f57385a = p209u9.a.i(p209u9.a.F(p247y7.V.f57259a), p249y9.q.f57437a).a();

        private a() {
        }

        @Override // p219v9.f
        public java.lang.String a() {
            return f57384c;
        }

        @Override // p219v9.f
        public boolean c() {
            return this.f57385a.c();
        }

        @Override // p219v9.f
        public int d(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "name");
            return this.f57385a.d(str);
        }

        @Override // p219v9.f
        public int e() {
            return this.f57385a.e();
        }

        @Override // p219v9.f
        public java.lang.String f(int i6) {
            return this.f57385a.f(i6);
        }

        @Override // p219v9.f
        public java.util.List g(int i6) {
            return this.f57385a.g(i6);
        }

        @Override // p219v9.f
        public p219v9.f h(int i6) {
            return this.f57385a.h(i6);
        }

        @Override // p219v9.f
        public boolean i(int i6) {
            return this.f57385a.i(i6);
        }

        @Override // p219v9.f
        public p219v9.m j() {
            return this.f57385a.j();
        }

        @Override // p219v9.f
        public java.util.List k() {
            return this.f57385a.k();
        }

        @Override // p219v9.f
        public boolean m() {
            return this.f57385a.m();
        }
    }

    private E() {
    }

    @Override // p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return f57382b;
    }

    @Override // p199t9.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public p249y9.D b(p229w9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "decoder");
        p249y9.r.g(hVar);
        return new p249y9.D((java.util.Map) p209u9.a.i(p209u9.a.F(p247y7.V.f57259a), p249y9.q.f57437a).b(hVar));
    }

    @Override // p199t9.e
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(p229w9.j jVar, p249y9.D d6) {
        p247y7.AbstractC7350t.f(jVar, "encoder");
        p247y7.AbstractC7350t.f(d6, "value");
        p249y9.r.h(jVar);
        p209u9.a.i(p209u9.a.F(p247y7.V.f57259a), p249y9.q.f57437a).e(jVar, d6);
    }
}
