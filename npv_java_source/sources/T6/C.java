package T6;

/* JADX INFO: loaded from: classes3.dex */
public final class C implements java.lang.Comparable {

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private static final java.util.List f13003G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private static final java.util.Map f13005H0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f13050C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f13051D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final T6.C.a f12998E = new T6.C.a(null);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final T6.C f13000F = new T6.C(100, "Continue");

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final T6.C f13002G = new T6.C(101, "Switching Protocols");

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final T6.C f13004H = new T6.C(102, "Processing");

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final T6.C f13006I = new T6.C(200, "OK");

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final T6.C f13007J = new T6.C(201, "Created");

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final T6.C f13008K = new T6.C(202, "Accepted");

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final T6.C f13009L = new T6.C(203, "Non-Authoritative Information");

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final T6.C f13010M = new T6.C(204, "No Content");

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final T6.C f13011N = new T6.C(205, "Reset Content");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final T6.C f13012O = new T6.C(206, "Partial Content");

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final T6.C f13013P = new T6.C(207, "Multi-Status");

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final T6.C f13014Q = new T6.C(300, "Multiple Choices");

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final T6.C f13015R = new T6.C(301, "Moved Permanently");

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final T6.C f13016S = new T6.C(302, "Found");

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final T6.C f13017T = new T6.C(303, "See Other");

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final T6.C f13018U = new T6.C(304, "Not Modified");

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static final T6.C f13019V = new T6.C(305, "Use Proxy");

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static final T6.C f13020W = new T6.C(306, "Switch Proxy");

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final T6.C f13021X = new T6.C(307, "Temporary Redirect");

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static final T6.C f13022Y = new T6.C(308, "Permanent Redirect");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final T6.C f13023Z = new T6.C(400, "Bad Request");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final T6.C f13024a0 = new T6.C(401, "Unauthorized");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final T6.C f13025b0 = new T6.C(402, "Payment Required");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final T6.C f13026c0 = new T6.C(403, "Forbidden");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final T6.C f13027d0 = new T6.C(404, "Not Found");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final T6.C f13028e0 = new T6.C(405, "Method Not Allowed");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final T6.C f13029f0 = new T6.C(406, "Not Acceptable");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final T6.C f13030g0 = new T6.C(407, "Proxy Authentication Required");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final T6.C f13031h0 = new T6.C(408, "Request Timeout");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final T6.C f13032i0 = new T6.C(409, "Conflict");

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final T6.C f13033j0 = new T6.C(410, "Gone");

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final T6.C f13034k0 = new T6.C(411, "Length Required");

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final T6.C f13035l0 = new T6.C(412, "Precondition Failed");

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final T6.C f13036m0 = new T6.C(413, "Payload Too Large");

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final T6.C f13037n0 = new T6.C(414, "Request-URI Too Long");

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final T6.C f13038o0 = new T6.C(415, "Unsupported Media Type");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final T6.C f13039p0 = new T6.C(416, "Requested Range Not Satisfiable");

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final T6.C f13040q0 = new T6.C(417, "Expectation Failed");

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final T6.C f13041r0 = new T6.C(422, "Unprocessable Entity");

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final T6.C f13042s0 = new T6.C(423, "Locked");

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final T6.C f13043t0 = new T6.C(424, "Failed Dependency");

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final T6.C f13044u0 = new T6.C(425, "Too Early");

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final T6.C f13045v0 = new T6.C(426, "Upgrade Required");

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final T6.C f13046w0 = new T6.C(429, "Too Many Requests");

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final T6.C f13047x0 = new T6.C(431, "Request Header Fields Too Large");

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final T6.C f13048y0 = new T6.C(500, "Internal Server Error");

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private static final T6.C f13049z0 = new T6.C(501, "Not Implemented");

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private static final T6.C f12994A0 = new T6.C(502, "Bad Gateway");

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private static final T6.C f12995B0 = new T6.C(503, "Service Unavailable");

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private static final T6.C f12996C0 = new T6.C(504, "Gateway Timeout");

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private static final T6.C f12997D0 = new T6.C(505, "HTTP Version Not Supported");

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private static final T6.C f12999E0 = new T6.C(506, "Variant Also Negotiates");

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private static final T6.C f13001F0 = new T6.C(507, "Insufficient Storage");

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final T6.C A() {
            return T6.C.f13006I;
        }

        public final T6.C B() {
            return T6.C.f13012O;
        }

        public final T6.C C() {
            return T6.C.f13036m0;
        }

        public final T6.C D() {
            return T6.C.f13025b0;
        }

        public final T6.C E() {
            return T6.C.f13022Y;
        }

        public final T6.C F() {
            return T6.C.f13035l0;
        }

        public final T6.C G() {
            return T6.C.f13004H;
        }

        public final T6.C H() {
            return T6.C.f13030g0;
        }

        public final T6.C I() {
            return T6.C.f13047x0;
        }

        public final T6.C J() {
            return T6.C.f13031h0;
        }

        public final T6.C K() {
            return T6.C.f13037n0;
        }

        public final T6.C L() {
            return T6.C.f13039p0;
        }

        public final T6.C M() {
            return T6.C.f13011N;
        }

        public final T6.C N() {
            return T6.C.f13017T;
        }

        public final T6.C O() {
            return T6.C.f12995B0;
        }

        public final T6.C P() {
            return T6.C.f13020W;
        }

        public final T6.C Q() {
            return T6.C.f13002G;
        }

        public final T6.C R() {
            return T6.C.f13021X;
        }

        public final T6.C S() {
            return T6.C.f13044u0;
        }

        public final T6.C T() {
            return T6.C.f13046w0;
        }

        public final T6.C U() {
            return T6.C.f13024a0;
        }

        public final T6.C V() {
            return T6.C.f13041r0;
        }

        public final T6.C W() {
            return T6.C.f13038o0;
        }

        public final T6.C X() {
            return T6.C.f13045v0;
        }

        public final T6.C Y() {
            return T6.C.f13019V;
        }

        public final T6.C Z() {
            return T6.C.f12999E0;
        }

        public final T6.C a() {
            return T6.C.f13008K;
        }

        public final T6.C a0() {
            return T6.C.f12997D0;
        }

        public final T6.C b() {
            return T6.C.f12994A0;
        }

        public final T6.C c() {
            return T6.C.f13023Z;
        }

        public final T6.C d() {
            return T6.C.f13032i0;
        }

        public final T6.C e() {
            return T6.C.f13000F;
        }

        public final T6.C f() {
            return T6.C.f13007J;
        }

        public final T6.C g() {
            return T6.C.f13040q0;
        }

        public final T6.C h() {
            return T6.C.f13043t0;
        }

        public final T6.C i() {
            return T6.C.f13026c0;
        }

        public final T6.C j() {
            return T6.C.f13016S;
        }

        public final T6.C k() {
            return T6.C.f12996C0;
        }

        public final T6.C l() {
            return T6.C.f13033j0;
        }

        public final T6.C m() {
            return T6.C.f13001F0;
        }

        public final T6.C n() {
            return T6.C.f13048y0;
        }

        public final T6.C o() {
            return T6.C.f13034k0;
        }

        public final T6.C p() {
            return T6.C.f13042s0;
        }

        public final T6.C q() {
            return T6.C.f13028e0;
        }

        public final T6.C r() {
            return T6.C.f13015R;
        }

        public final T6.C s() {
            return T6.C.f13013P;
        }

        public final T6.C t() {
            return T6.C.f13014Q;
        }

        public final T6.C u() {
            return T6.C.f13010M;
        }

        public final T6.C v() {
            return T6.C.f13009L;
        }

        public final T6.C w() {
            return T6.C.f13029f0;
        }

        public final T6.C x() {
            return T6.C.f13027d0;
        }

        public final T6.C y() {
            return T6.C.f13049z0;
        }

        public final T6.C z() {
            return T6.C.f13018U;
        }
    }

    static {
        java.util.List listA = T6.D.a();
        f13003G0 = listA;
        java.util.List list = listA;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(E7.j.d(p097j7.S.d(p097j7.AbstractC6879v.x(list, 10)), 16));
        for (java.lang.Object obj : list) {
            linkedHashMap.put(java.lang.Integer.valueOf(((T6.C) obj).f13050C), obj);
        }
        f13005H0 = linkedHashMap;
    }

    public C(int i6, java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "description");
        this.f13050C = i6;
        this.f13051D = str;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof T6.C) && ((T6.C) obj).f13050C == this.f13050C;
    }

    public int hashCode() {
        return this.f13050C;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public int compareTo(T6.C c6) {
        p247y7.AbstractC7350t.f(c6, "other");
        return this.f13050C - c6.f13050C;
    }

    public final int m0() {
        return this.f13050C;
    }

    public java.lang.String toString() {
        return this.f13050C + ' ' + this.f13051D;
    }
}
