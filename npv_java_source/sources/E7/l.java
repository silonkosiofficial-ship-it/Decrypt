package E7;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l extends E7.k {
    public static float c(float f6, float f10) {
        return f6 < f10 ? f10 : f6;
    }

    public static int d(int i6, int i10) {
        return i6 < i10 ? i10 : i6;
    }

    public static long e(long j6, long j10) {
        return j6 < j10 ? j10 : j6;
    }

    public static float f(float f6, float f10) {
        return f6 > f10 ? f10 : f6;
    }

    public static int g(int i6, int i10) {
        return i6 > i10 ? i10 : i6;
    }

    public static long h(long j6, long j10) {
        return j6 > j10 ? j10 : j6;
    }

    public static double i(double d6, double d10, double d11) {
        if (d10 <= d11) {
            if (d6 < d10) {
                return d10;
            }
            return d6 > d11 ? d11 : d6;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d11 + " is less than minimum " + d10 + '.');
    }

    public static float j(float f6, float f10, float f11) {
        if (f10 <= f11) {
            if (f6 < f10) {
                return f10;
            }
            return f6 > f11 ? f11 : f6;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f11 + " is less than minimum " + f10 + '.');
    }

    public static int k(int i6, int i10, int i11) {
        if (i10 <= i11) {
            if (i6 < i10) {
                return i10;
            }
            return i6 > i11 ? i11 : i6;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i11 + " is less than minimum " + i10 + '.');
    }

    public static long l(long j6, long j10, long j11) {
        if (j10 <= j11) {
            if (j6 < j10) {
                return j10;
            }
            return j6 > j11 ? j11 : j6;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j11 + " is less than minimum " + j10 + '.');
    }

    public static java.lang.Comparable m(java.lang.Comparable comparable, java.lang.Comparable comparable2, java.lang.Comparable comparable3) {
        p247y7.AbstractC7350t.f(comparable, "<this>");
        if (comparable2 == null || comparable3 == null) {
            if (comparable2 != null && comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable3 != null && comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        } else {
            if (comparable2.compareTo(comparable3) > 0) {
                throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + comparable3 + " is less than minimum " + comparable2 + '.');
            }
            if (comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        }
        return comparable;
    }

    public static E7.g n(int i6, int i10) {
        return E7.g.f2258F.a(i6, i10, -1);
    }

    public static E7.g o(E7.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "<this>");
        return E7.g.f2258F.a(gVar.g(), gVar.f(), -gVar.o());
    }

    public static E7.g p(E7.g gVar, int i6) {
        p247y7.AbstractC7350t.f(gVar, "<this>");
        E7.k.a(i6 > 0, java.lang.Integer.valueOf(i6));
        E7.g.a aVar = E7.g.f2258F;
        int iF = gVar.f();
        int iG = gVar.g();
        if (gVar.o() <= 0) {
            i6 = -i6;
        }
        return aVar.a(iF, iG, i6);
    }

    public static E7.i q(int i6, int i10) {
        return i10 <= Integer.MIN_VALUE ? E7.i.f2266G.a() : new E7.i(i6, i10 - 1);
    }
}
