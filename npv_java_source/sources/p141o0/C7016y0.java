package p141o0;

/* JADX INFO: renamed from: o0.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7016y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p141o0.C7016y0.a f52264b = new p141o0.C7016y0.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f52265c = p141o0.A0.d(4278190080L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f52266d = p141o0.A0.d(4282664004L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f52267e = p141o0.A0.d(4287137928L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f52268f = p141o0.A0.d(4291611852L);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f52269g = p141o0.A0.d(4294967295L);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f52270h = p141o0.A0.d(4294901760L);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f52271i = p141o0.A0.d(4278255360L);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f52272j = p141o0.A0.d(4278190335L);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f52273k = p141o0.A0.d(4294967040L);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f52274l = p141o0.A0.d(4278255615L);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f52275m = p141o0.A0.d(4294902015L);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f52276n = p141o0.A0.b(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f52277o = p141o0.A0.a(0.0f, 0.0f, 0.0f, 0.0f, p151p0.g.f52623a.y());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f52278a;

    /* JADX INFO: renamed from: o0.y0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final long a() {
            return p141o0.C7016y0.f52265c;
        }

        public final long b() {
            return p141o0.C7016y0.f52272j;
        }

        public final long c() {
            return p141o0.C7016y0.f52267e;
        }

        public final long d() {
            return p141o0.C7016y0.f52268f;
        }

        public final long e() {
            return p141o0.C7016y0.f52270h;
        }

        public final long f() {
            return p141o0.C7016y0.f52276n;
        }

        public final long g() {
            return p141o0.C7016y0.f52277o;
        }

        public final long h() {
            return p141o0.C7016y0.f52269g;
        }
    }

    private /* synthetic */ C7016y0(long j6) {
        this.f52278a = j6;
    }

    public static final /* synthetic */ p141o0.C7016y0 i(long j6) {
        return new p141o0.C7016y0(j6);
    }

    public static long j(long j6) {
        return j6;
    }

    public static final long k(long j6, p151p0.c cVar) {
        return p151p0.d.i(r(j6), cVar, 0, 2, null).a(j6);
    }

    public static final long l(long j6, float f6, float f10, float f11, float f12) {
        return p141o0.A0.a(f10, f11, f12, f6, r(j6));
    }

    public static /* synthetic */ long m(long j6, float f6, float f10, float f11, float f12, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            f6 = p(j6);
        }
        float f13 = f6;
        if ((i6 & 2) != 0) {
            f10 = t(j6);
        }
        float f14 = f10;
        if ((i6 & 4) != 0) {
            f11 = s(j6);
        }
        float f15 = f11;
        if ((i6 & 8) != 0) {
            f12 = q(j6);
        }
        return l(j6, f13, f14, f15, f12);
    }

    public static boolean n(long j6, java.lang.Object obj) {
        return (obj instanceof p141o0.C7016y0) && j6 == ((p141o0.C7016y0) obj).w();
    }

    public static final boolean o(long j6, long j10) {
        return p087i7.G.m(j6, j10);
    }

    public static final float p(long j6) {
        float fC;
        float f6;
        if (p087i7.G.g(63 & j6) == 0) {
            fC = (float) p087i7.O.c(p087i7.G.g(p087i7.G.g(j6 >>> 56) & 255));
            f6 = 255.0f;
        } else {
            fC = (float) p087i7.O.c(p087i7.G.g(p087i7.G.g(j6 >>> 6) & 1023));
            f6 = 1023.0f;
        }
        return fC / f6;
    }

    public static final float q(long j6) {
        int i6;
        int i10;
        int i11;
        if (p087i7.G.g(63 & j6) == 0) {
            return ((float) p087i7.O.c(p087i7.G.g(p087i7.G.g(j6 >>> 32) & 255))) / 255.0f;
        }
        short sG = (short) p087i7.G.g(p087i7.G.g(j6 >>> 16) & 65535);
        int i12 = Short.MIN_VALUE & sG;
        int i13 = ((65535 & sG) >>> 10) & 31;
        int i14 = sG & 1023;
        if (i13 != 0) {
            int i15 = i14 << 13;
            if (i13 == 31) {
                i6 = 255;
                if (i15 != 0) {
                    i15 |= 4194304;
                }
            } else {
                i6 = i13 + 112;
            }
            int i16 = i6;
            i10 = i15;
            i11 = i16;
        } else {
            if (i14 != 0) {
                float fIntBitsToFloat = java.lang.Float.intBitsToFloat(i14 + 1056964608) - p141o0.B1.f52115c;
                return i12 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i11 = 0;
            i10 = 0;
        }
        return java.lang.Float.intBitsToFloat((i11 << 23) | (i12 << 16) | i10);
    }

    public static final p151p0.c r(long j6) {
        p151p0.g gVar = p151p0.g.f52623a;
        return gVar.l()[(int) p087i7.G.g(j6 & 63)];
    }

    public static final float s(long j6) {
        int i6;
        int i10;
        int i11;
        if (p087i7.G.g(63 & j6) == 0) {
            return ((float) p087i7.O.c(p087i7.G.g(p087i7.G.g(j6 >>> 40) & 255))) / 255.0f;
        }
        short sG = (short) p087i7.G.g(p087i7.G.g(j6 >>> 32) & 65535);
        int i12 = Short.MIN_VALUE & sG;
        int i13 = ((65535 & sG) >>> 10) & 31;
        int i14 = sG & 1023;
        if (i13 != 0) {
            int i15 = i14 << 13;
            if (i13 == 31) {
                i6 = 255;
                if (i15 != 0) {
                    i15 |= 4194304;
                }
            } else {
                i6 = i13 + 112;
            }
            int i16 = i6;
            i10 = i15;
            i11 = i16;
        } else {
            if (i14 != 0) {
                float fIntBitsToFloat = java.lang.Float.intBitsToFloat(i14 + 1056964608) - p141o0.B1.f52115c;
                return i12 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i11 = 0;
            i10 = 0;
        }
        return java.lang.Float.intBitsToFloat((i11 << 23) | (i12 << 16) | i10);
    }

    public static final float t(long j6) {
        int i6;
        int i10;
        int i11;
        long jG = p087i7.G.g(63 & j6);
        long jG2 = p087i7.G.g(j6 >>> 48);
        if (jG == 0) {
            return ((float) p087i7.O.c(p087i7.G.g(jG2 & 255))) / 255.0f;
        }
        short sG = (short) p087i7.G.g(jG2 & 65535);
        int i12 = Short.MIN_VALUE & sG;
        int i13 = ((65535 & sG) >>> 10) & 31;
        int i14 = sG & 1023;
        if (i13 != 0) {
            int i15 = i14 << 13;
            if (i13 == 31) {
                i6 = 255;
                if (i15 != 0) {
                    i15 |= 4194304;
                }
            } else {
                i6 = i13 + 112;
            }
            int i16 = i6;
            i10 = i15;
            i11 = i16;
        } else {
            if (i14 != 0) {
                float fIntBitsToFloat = java.lang.Float.intBitsToFloat(i14 + 1056964608) - p141o0.B1.f52115c;
                return i12 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i11 = 0;
            i10 = 0;
        }
        return java.lang.Float.intBitsToFloat((i11 << 23) | (i12 << 16) | i10);
    }

    public static int u(long j6) {
        return p087i7.G.n(j6);
    }

    public static java.lang.String v(long j6) {
        return "Color(" + t(j6) + ", " + s(j6) + ", " + q(j6) + ", " + p(j6) + ", " + r(j6).f() + ')';
    }

    public boolean equals(java.lang.Object obj) {
        return n(this.f52278a, obj);
    }

    public int hashCode() {
        return u(this.f52278a);
    }

    public java.lang.String toString() {
        return v(this.f52278a);
    }

    public final /* synthetic */ long w() {
        return this.f52278a;
    }
}
