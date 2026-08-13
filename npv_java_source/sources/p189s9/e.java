package p189s9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p189s9.b f54411a = new s9.e.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p189s9.c f54412b = new s9.e.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p189s9.a f54413c = new s9.e.a();

    public static final class a implements p189s9.a {
        a() {
        }

        @Override // p189s9.b
        public byte a(p149o9.k kVar, int i6) {
            p247y7.AbstractC7350t.f(kVar, "segment");
            return p189s9.e.f54411a.a(kVar, i6);
        }
    }

    public static final class b implements p189s9.b {
        b() {
        }

        @Override // p189s9.b
        public byte a(p149o9.k kVar, int i6) {
            p247y7.AbstractC7350t.f(kVar, "segment");
            return kVar.k(i6);
        }
    }

    public static final class c implements p189s9.c {
        c() {
        }

        @Override // p189s9.c
        public void a(p149o9.k kVar, int i6, byte b6, byte b10) {
            p247y7.AbstractC7350t.f(kVar, "segment");
            kVar.v(i6, b6, b10);
        }

        @Override // p189s9.c
        public void b(p149o9.k kVar, int i6, byte b6, byte b10, byte b11, byte b12) {
            p247y7.AbstractC7350t.f(kVar, "segment");
            kVar.x(i6, b6, b10, b11, b12);
        }

        @Override // p189s9.c
        public void c(p149o9.k kVar, int i6, byte b6) {
            p247y7.AbstractC7350t.f(kVar, "segment");
            kVar.u(i6, b6);
        }

        @Override // p189s9.c
        public void d(p149o9.k kVar, int i6, byte b6, byte b10, byte b11) {
            p247y7.AbstractC7350t.f(kVar, "segment");
            kVar.w(i6, b6, b10, b11);
        }
    }
}
