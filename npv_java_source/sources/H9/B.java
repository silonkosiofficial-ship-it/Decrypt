package H9;

/* JADX INFO: loaded from: classes2.dex */
public final class B implements java.io.Closeable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final H9.z f4540C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final H9.y f4541D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.String f4542E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f4543F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final H9.s f4544G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final H9.t f4545H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final H9.C f4546I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final H9.B f4547J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final H9.B f4548K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final H9.B f4549L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final long f4550M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final long f4551N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final M9.c f4552O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private H9.C1238d f4553P;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private H9.z f4554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private H9.y f4555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f4556c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private java.lang.String f4557d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private H9.s f4558e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private H9.t.a f4559f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private H9.C f4560g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private H9.B f4561h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private H9.B f4562i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private H9.B f4563j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f4564k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f4565l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private M9.c f4566m;

        public a() {
            this.f4556c = -1;
            this.f4559f = new H9.t.a();
        }

        public a(H9.B b6) {
            p247y7.AbstractC7350t.f(b6, "response");
            this.f4556c = -1;
            this.f4554a = b6.r0();
            this.f4555b = b6.o0();
            this.f4556c = b6.o();
            this.f4557d = b6.R();
            this.f4558e = b6.s();
            this.f4559f = b6.H().g();
            this.f4560g = b6.a();
            this.f4561h = b6.e0();
            this.f4562i = b6.g();
            this.f4563j = b6.n0();
            this.f4564k = b6.s0();
            this.f4565l = b6.q0();
            this.f4566m = b6.r();
        }

        private final void e(H9.B b6) {
            if (b6 != null && b6.a() != null) {
                throw new java.lang.IllegalArgumentException("priorResponse.body != null".toString());
            }
        }

        private final void f(java.lang.String str, H9.B b6) {
            if (b6 != null) {
                if (b6.a() != null) {
                    throw new java.lang.IllegalArgumentException((str + ".body != null").toString());
                }
                if (b6.e0() != null) {
                    throw new java.lang.IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (b6.g() != null) {
                    throw new java.lang.IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (b6.n0() == null) {
                    return;
                }
                throw new java.lang.IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        public H9.B.a a(java.lang.String str, java.lang.String str2) {
            p247y7.AbstractC7350t.f(str, "name");
            p247y7.AbstractC7350t.f(str2, "value");
            this.f4559f.a(str, str2);
            return this;
        }

        public H9.B.a b(H9.C c6) {
            this.f4560g = c6;
            return this;
        }

        public H9.B c() {
            int i6 = this.f4556c;
            if (i6 < 0) {
                throw new java.lang.IllegalStateException(("code < 0: " + this.f4556c).toString());
            }
            H9.z zVar = this.f4554a;
            if (zVar == null) {
                throw new java.lang.IllegalStateException("request == null".toString());
            }
            H9.y yVar = this.f4555b;
            if (yVar == null) {
                throw new java.lang.IllegalStateException("protocol == null".toString());
            }
            java.lang.String str = this.f4557d;
            if (str != null) {
                return new H9.B(zVar, yVar, str, i6, this.f4558e, this.f4559f.d(), this.f4560g, this.f4561h, this.f4562i, this.f4563j, this.f4564k, this.f4565l, this.f4566m);
            }
            throw new java.lang.IllegalStateException("message == null".toString());
        }

        public H9.B.a d(H9.B b6) {
            f("cacheResponse", b6);
            this.f4562i = b6;
            return this;
        }

        public H9.B.a g(int i6) {
            this.f4556c = i6;
            return this;
        }

        public final int h() {
            return this.f4556c;
        }

        public H9.B.a i(H9.s sVar) {
            this.f4558e = sVar;
            return this;
        }

        public H9.B.a j(java.lang.String str, java.lang.String str2) {
            p247y7.AbstractC7350t.f(str, "name");
            p247y7.AbstractC7350t.f(str2, "value");
            this.f4559f.g(str, str2);
            return this;
        }

        public H9.B.a k(H9.t tVar) {
            p247y7.AbstractC7350t.f(tVar, "headers");
            this.f4559f = tVar.g();
            return this;
        }

        public final void l(M9.c cVar) {
            p247y7.AbstractC7350t.f(cVar, "deferredTrailers");
            this.f4566m = cVar;
        }

        public H9.B.a m(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "message");
            this.f4557d = str;
            return this;
        }

        public H9.B.a n(H9.B b6) {
            f("networkResponse", b6);
            this.f4561h = b6;
            return this;
        }

        public H9.B.a o(H9.B b6) {
            e(b6);
            this.f4563j = b6;
            return this;
        }

        public H9.B.a p(H9.y yVar) {
            p247y7.AbstractC7350t.f(yVar, "protocol");
            this.f4555b = yVar;
            return this;
        }

        public H9.B.a q(long j6) {
            this.f4565l = j6;
            return this;
        }

        public H9.B.a r(H9.z zVar) {
            p247y7.AbstractC7350t.f(zVar, "request");
            this.f4554a = zVar;
            return this;
        }

        public H9.B.a s(long j6) {
            this.f4564k = j6;
            return this;
        }
    }

    public B(H9.z zVar, H9.y yVar, java.lang.String str, int i6, H9.s sVar, H9.t tVar, H9.C c6, H9.B b6, H9.B b10, H9.B b11, long j6, long j10, M9.c cVar) {
        p247y7.AbstractC7350t.f(zVar, "request");
        p247y7.AbstractC7350t.f(yVar, "protocol");
        p247y7.AbstractC7350t.f(str, "message");
        p247y7.AbstractC7350t.f(tVar, "headers");
        this.f4540C = zVar;
        this.f4541D = yVar;
        this.f4542E = str;
        this.f4543F = i6;
        this.f4544G = sVar;
        this.f4545H = tVar;
        this.f4546I = c6;
        this.f4547J = b6;
        this.f4548K = b10;
        this.f4549L = b11;
        this.f4550M = j6;
        this.f4551N = j10;
        this.f4552O = cVar;
    }

    public static /* synthetic */ java.lang.String D(H9.B b6, java.lang.String str, java.lang.String str2, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            str2 = null;
        }
        return b6.y(str, str2);
    }

    public final H9.t H() {
        return this.f4545H;
    }

    public final boolean N() {
        int i6 = this.f4543F;
        return 200 <= i6 && i6 < 300;
    }

    public final java.lang.String R() {
        return this.f4542E;
    }

    public final H9.C a() {
        return this.f4546I;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        H9.C c6 = this.f4546I;
        if (c6 == null) {
            throw new java.lang.IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        c6.close();
    }

    public final H9.B e0() {
        return this.f4547J;
    }

    public final H9.C1238d f() {
        H9.C1238d c1238d = this.f4553P;
        if (c1238d != null) {
            return c1238d;
        }
        H9.C1238d c1238dB = H9.C1238d.f4597n.b(this.f4545H);
        this.f4553P = c1238dB;
        return c1238dB;
    }

    public final H9.B g() {
        return this.f4548K;
    }

    public final H9.B.a g0() {
        return new H9.B.a(this);
    }

    public final java.util.List i() {
        java.lang.String str;
        H9.t tVar = this.f4545H;
        int i6 = this.f4543F;
        if (i6 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i6 != 407) {
                return p097j7.AbstractC6879v.m();
            }
            str = "Proxy-Authenticate";
        }
        return N9.e.a(tVar, str);
    }

    public final H9.B n0() {
        return this.f4549L;
    }

    public final int o() {
        return this.f4543F;
    }

    public final H9.y o0() {
        return this.f4541D;
    }

    public final long q0() {
        return this.f4551N;
    }

    public final M9.c r() {
        return this.f4552O;
    }

    public final H9.z r0() {
        return this.f4540C;
    }

    public final H9.s s() {
        return this.f4544G;
    }

    public final long s0() {
        return this.f4550M;
    }

    public java.lang.String toString() {
        return "Response{protocol=" + this.f4541D + ", code=" + this.f4543F + ", message=" + this.f4542E + ", url=" + this.f4540C.i() + '}';
    }

    public final java.lang.String y(java.lang.String str, java.lang.String str2) {
        p247y7.AbstractC7350t.f(str, "name");
        java.lang.String strD = this.f4545H.d(str);
        return strD == null ? str2 : strD;
    }
}
