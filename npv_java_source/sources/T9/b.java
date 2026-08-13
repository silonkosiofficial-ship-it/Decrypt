package T9;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final T9.b.C0280b f13337d = new T9.b.C0280b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final X9.N f13338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final X9.C1839g f13339f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X9.InterfaceC1838f f13340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T9.b.a f13341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.String f13342c;

    public interface a {
        void a(long j6);

        void b(java.lang.String str, java.lang.String str2, java.lang.String str3);
    }

    /* JADX INFO: renamed from: T9.b$b, reason: collision with other inner class name */
    public static final class C0280b {
        private C0280b() {
        }

        public /* synthetic */ C0280b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(X9.InterfaceC1838f interfaceC1838f, X9.C1836d c1836d) {
            c1836d.U(10);
            interfaceC1838f.Q0(c1836d, interfaceC1838f.h0(T9.b.f13339f));
            interfaceC1838f.k0(c());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long e(X9.InterfaceC1838f interfaceC1838f) {
            return I9.d.V(interfaceC1838f.N0(), -1L);
        }

        public final X9.N c() {
            return T9.b.f13338e;
        }
    }

    static {
        X9.N.a aVar = X9.N.f16078F;
        X9.C1839g.a aVar2 = X9.C1839g.f16149F;
        f13338e = aVar.d(aVar2.c("\r\n"), aVar2.c("\r"), aVar2.c("\n"), aVar2.c("data: "), aVar2.c("data:"), aVar2.c("data\r\n"), aVar2.c("data\r"), aVar2.c("data\n"), aVar2.c("id: "), aVar2.c("id:"), aVar2.c("id\r\n"), aVar2.c("id\r"), aVar2.c("id\n"), aVar2.c("event: "), aVar2.c("event:"), aVar2.c("event\r\n"), aVar2.c("event\r"), aVar2.c("event\n"), aVar2.c("retry: "), aVar2.c("retry:"));
        f13339f = aVar2.c("\r\n");
    }

    public b(X9.InterfaceC1838f interfaceC1838f, T9.b.a aVar) {
        p247y7.AbstractC7350t.f(interfaceC1838f, "source");
        p247y7.AbstractC7350t.f(aVar, "callback");
        this.f13340a = interfaceC1838f;
        this.f13341b = aVar;
    }

    private final void c(java.lang.String str, java.lang.String str2, X9.C1836d c1836d) throws java.io.EOFException {
        if (c1836d.d1() != 0) {
            this.f13342c = str;
            c1836d.skip(1L);
            this.f13341b.b(str, str2, c1836d.Y0());
        }
    }

    public final boolean d() throws java.io.EOFException {
        java.lang.String strN0 = this.f13342c;
        X9.C1836d c1836d = new X9.C1836d();
        while (true) {
            java.lang.String strN1 = null;
            while (true) {
                X9.InterfaceC1838f interfaceC1838f = this.f13340a;
                X9.N n6 = f13338e;
                int iK0 = interfaceC1838f.k0(n6);
                if (iK0 >= 0 && iK0 < 3) {
                    c(strN0, strN1, c1836d);
                    return true;
                }
                if (3 <= iK0 && iK0 < 5) {
                    f13337d.d(this.f13340a, c1836d);
                } else if (5 <= iK0 && iK0 < 8) {
                    c1836d.U(10);
                } else if (8 <= iK0 && iK0 < 10) {
                    strN0 = this.f13340a.N0();
                    if (strN0.length() <= 0) {
                        strN0 = null;
                    }
                } else if (10 <= iK0 && iK0 < 13) {
                    strN0 = null;
                } else if (13 <= iK0 && iK0 < 15) {
                    strN1 = this.f13340a.N0();
                    if (strN1.length() <= 0) {
                        break;
                    }
                } else {
                    if (15 <= iK0 && iK0 < 18) {
                        break;
                    }
                    if (18 <= iK0 && iK0 < 20) {
                        long jE = f13337d.e(this.f13340a);
                        if (jE != -1) {
                            this.f13341b.a(jE);
                        }
                    } else {
                        if (iK0 != -1) {
                            throw new java.lang.AssertionError();
                        }
                        long jH0 = this.f13340a.h0(f13339f);
                        if (jH0 == -1) {
                            return false;
                        }
                        this.f13340a.skip(jH0);
                        this.f13340a.k0(n6);
                    }
                }
            }
        }
    }
}
