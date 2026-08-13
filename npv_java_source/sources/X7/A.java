package X7;

/* JADX INFO: loaded from: classes2.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X7.A f15891a = new X7.A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p138n8.c f15892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p138n8.b f15893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p138n8.b f15894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p138n8.b f15895e;

    static {
        p138n8.c cVar = new p138n8.c("kotlin.jvm.JvmField");
        f15892b = cVar;
        p138n8.b bVarM = p138n8.b.m(cVar);
        p247y7.AbstractC7350t.e(bVarM, "topLevel(...)");
        f15893c = bVarM;
        p138n8.b bVarM2 = p138n8.b.m(new p138n8.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        p247y7.AbstractC7350t.e(bVarM2, "topLevel(...)");
        f15894d = bVarM2;
        p138n8.b bVarE = p138n8.b.e("kotlin/jvm/internal/RepeatableContainer");
        p247y7.AbstractC7350t.e(bVarE, "fromString(...)");
        f15895e = bVarE;
    }

    private A() {
    }

    public static final java.lang.String b(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "propertyName");
        if (f(str)) {
            return str;
        }
        return "get" + N8.a.a(str);
    }

    public static final boolean c(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        return S8.r.V(str, "get", false, 2, null) || S8.r.V(str, "is", false, 2, null);
    }

    public static final boolean d(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        return S8.r.V(str, "set", false, 2, null);
    }

    public static final java.lang.String e(java.lang.String str) {
        java.lang.String strA;
        p247y7.AbstractC7350t.f(str, "propertyName");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("set");
        if (f(str)) {
            strA = str.substring(2);
            p247y7.AbstractC7350t.e(strA, "substring(...)");
        } else {
            strA = N8.a.a(str);
        }
        sb.append(strA);
        return sb.toString();
    }

    public static final boolean f(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        if (!S8.r.V(str, "is", false, 2, null) || str.length() == 2) {
            return false;
        }
        char cCharAt = str.charAt(2);
        return p247y7.AbstractC7350t.g(97, cCharAt) > 0 || p247y7.AbstractC7350t.g(cCharAt, 122) > 0;
    }

    public final p138n8.b a() {
        return f15895e;
    }
}
