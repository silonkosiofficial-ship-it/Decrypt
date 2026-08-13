package O3;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O3.a.AbstractC0193a f8027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O3.a.g f8028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f8029c;

    /* JADX INFO: renamed from: O3.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0193a extends O3.a.e {
        public O3.a.f a(android.content.Context context, android.os.Looper looper, Q3.C1465d c1465d, java.lang.Object obj, O3.f.a aVar, O3.f.b bVar) {
            return b(context, looper, c1465d, obj, aVar, bVar);
        }

        public O3.a.f b(android.content.Context context, android.os.Looper looper, Q3.C1465d c1465d, java.lang.Object obj, P3.InterfaceC1447c interfaceC1447c, P3.h hVar) {
            throw new java.lang.UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c {
    }

    public interface d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final O3.a.d.C0194a f8030c = new O3.a.d.C0194a(null);

        /* JADX INFO: renamed from: O3.a$d$a, reason: collision with other inner class name */
        public static final class C0194a implements O3.a.d {
            /* synthetic */ C0194a(O3.m mVar) {
            }
        }
    }

    public static abstract class e {
    }

    public interface f extends O3.a.b {
        java.util.Set a();

        void c(Q3.AbstractC1464c.InterfaceC0206c interfaceC0206c);

        void d(java.lang.String str);

        boolean e();

        java.lang.String f();

        void g(Q3.AbstractC1464c.e eVar);

        void h();

        void i(Q3.InterfaceC1471j interfaceC1471j, java.util.Set set);

        boolean j();

        boolean k();

        int l();

        N3.C1391d[] m();

        java.lang.String n();

        boolean o();
    }

    public static final class g extends O3.a.c {
    }

    public a(java.lang.String str, O3.a.AbstractC0193a abstractC0193a, O3.a.g gVar) {
        Q3.AbstractC1477p.m(abstractC0193a, "Cannot construct an Api with a null ClientBuilder");
        Q3.AbstractC1477p.m(gVar, "Cannot construct an Api with a null ClientKey");
        this.f8029c = str;
        this.f8027a = abstractC0193a;
        this.f8028b = gVar;
    }

    public final O3.a.AbstractC0193a a() {
        return this.f8027a;
    }

    public final O3.a.c b() {
        return this.f8028b;
    }

    public final java.lang.String c() {
        return this.f8029c;
    }
}
