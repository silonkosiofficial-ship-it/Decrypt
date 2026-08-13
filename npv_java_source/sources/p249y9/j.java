package p249y9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p219v9.f f57436a = p239x9.G.a("kotlinx.serialization.json.JsonUnquotedLiteral", p209u9.a.F(p247y7.V.f57259a));

    public static final p249y9.F a(java.lang.Boolean bool) {
        return bool == null ? p249y9.A.INSTANCE : new p249y9.w(bool, false, null, 4, null);
    }

    public static final p249y9.F b(java.lang.Number number) {
        return number == null ? p249y9.A.INSTANCE : new p249y9.w(number, false, null, 4, null);
    }

    public static final p249y9.F c(java.lang.String str) {
        return str == null ? p249y9.A.INSTANCE : new p249y9.w(str, true, null, 4, null);
    }

    public static final java.lang.Boolean d(p249y9.F f6) {
        p247y7.AbstractC7350t.f(f6, "<this>");
        return p258z9.e0.d(f6.d());
    }

    public static final java.lang.String e(p249y9.F f6) {
        p247y7.AbstractC7350t.f(f6, "<this>");
        if (f6 instanceof p249y9.A) {
            return null;
        }
        return f6.d();
    }

    public static final double f(p249y9.F f6) {
        p247y7.AbstractC7350t.f(f6, "<this>");
        return java.lang.Double.parseDouble(f6.d());
    }

    public static final float g(p249y9.F f6) {
        p247y7.AbstractC7350t.f(f6, "<this>");
        return java.lang.Float.parseFloat(f6.d());
    }

    public static final p219v9.f h() {
        return f57436a;
    }

    public static final long i(p249y9.F f6) {
        p247y7.AbstractC7350t.f(f6, "<this>");
        return new p258z9.b0(f6.d()).p();
    }
}
