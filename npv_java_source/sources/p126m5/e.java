package p126m5;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final m5.e.b f51139c = new m5.e.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p166q5.g f51140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p126m5.c f51141b;

    private static final class b implements p126m5.c {
        private b() {
        }

        @Override // p126m5.c
        public void a() {
        }

        @Override // p126m5.c
        public java.lang.String b() {
            return null;
        }

        @Override // p126m5.c
        public byte[] c() {
            return null;
        }

        @Override // p126m5.c
        public void d() {
        }

        @Override // p126m5.c
        public void e(long j6, java.lang.String str) {
        }
    }

    public e(p166q5.g gVar) {
        this.f51140a = gVar;
        this.f51141b = f51139c;
    }

    public e(p166q5.g gVar, java.lang.String str) {
        this(gVar);
        e(str);
    }

    private java.io.File d(java.lang.String str) {
        return this.f51140a.q(str, "userlog");
    }

    public void a() {
        this.f51141b.d();
    }

    public byte[] b() {
        return this.f51141b.c();
    }

    public java.lang.String c() {
        return this.f51141b.b();
    }

    public final void e(java.lang.String str) {
        this.f51141b.a();
        this.f51141b = f51139c;
        if (str == null) {
            return;
        }
        f(d(str), 65536);
    }

    void f(java.io.File file, int i6) {
        this.f51141b = new p126m5.h(file, i6);
    }

    public void g(long j6, java.lang.String str) {
        this.f51141b.e(j6, str);
    }
}
