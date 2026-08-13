package R7;

/* JADX INFO: loaded from: classes2.dex */
public interface A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final R7.A.a f9501a = R7.A.a.f9502a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ R7.A.a f9502a = new R7.A.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final O7.F f9503b = new O7.F("PackageViewDescriptorFactory");

        private a() {
        }

        public final O7.F a() {
            return f9503b;
        }
    }

    public static final class b implements R7.A {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final R7.A.b f9504b = new R7.A.b();

        private b() {
        }

        @Override // R7.A
        public O7.P a(R7.x xVar, p138n8.c cVar, E8.n nVar) {
            p247y7.AbstractC7350t.f(xVar, "module");
            p247y7.AbstractC7350t.f(cVar, "fqName");
            p247y7.AbstractC7350t.f(nVar, "storageManager");
            return new R7.r(xVar, cVar, nVar);
        }
    }

    O7.P a(R7.x xVar, p138n8.c cVar, E8.n nVar);
}
