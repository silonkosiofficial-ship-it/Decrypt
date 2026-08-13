package X7;

/* JADX INFO: renamed from: X7.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1825c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p138n8.c f16001a = new p138n8.c("javax.annotation.meta.TypeQualifierNickname");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p138n8.c f16002b = new p138n8.c("javax.annotation.meta.TypeQualifier");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p138n8.c f16003c = new p138n8.c("javax.annotation.meta.TypeQualifierDefault");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p138n8.c f16004d = new p138n8.c("kotlin.annotations.jvm.UnderMigration");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.util.List f16005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.util.Map f16006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.util.Map f16007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final java.util.Set f16008h;

    static {
        X7.EnumC1824b enumC1824b = X7.EnumC1824b.VALUE_PARAMETER;
        java.util.List listP = p097j7.AbstractC6879v.p(X7.EnumC1824b.FIELD, X7.EnumC1824b.METHOD_RETURN_TYPE, enumC1824b, X7.EnumC1824b.TYPE_PARAMETER_BOUNDS, X7.EnumC1824b.TYPE_USE);
        f16005e = listP;
        p138n8.c cVarL = X7.C.l();
        p058f8.h hVar = p058f8.h.NOT_NULL;
        java.util.Map mapK = p097j7.S.k(p087i7.B.a(cVarL, new X7.r(new p058f8.i(hVar, false, 2, null), listP, false)), p087i7.B.a(X7.C.i(), new X7.r(new p058f8.i(hVar, false, 2, null), listP, false)));
        f16006f = mapK;
        f16007g = p097j7.S.n(p097j7.S.k(p087i7.B.a(new p138n8.c("javax.annotation.ParametersAreNullableByDefault"), new X7.r(new p058f8.i(p058f8.h.NULLABLE, false, 2, null), p097j7.AbstractC6879v.e(enumC1824b), false, 4, null)), p087i7.B.a(new p138n8.c("javax.annotation.ParametersAreNonnullByDefault"), new X7.r(new p058f8.i(hVar, false, 2, null), p097j7.AbstractC6879v.e(enumC1824b), false, 4, null))), mapK);
        f16008h = p097j7.Z.g(X7.C.f(), X7.C.e());
    }

    public static final java.util.Map a() {
        return f16007g;
    }

    public static final java.util.Set b() {
        return f16008h;
    }

    public static final java.util.Map c() {
        return f16006f;
    }

    public static final p138n8.c d() {
        return f16004d;
    }

    public static final p138n8.c e() {
        return f16003c;
    }

    public static final p138n8.c f() {
        return f16002b;
    }

    public static final p138n8.c g() {
        return f16001a;
    }
}
