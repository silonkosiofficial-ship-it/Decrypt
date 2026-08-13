package X7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p138n8.c f16040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p138n8.c f16041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p138n8.c f16042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p138n8.c f16043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.lang.String f16044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p138n8.c[] f16045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final X7.D f16046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final X7.w f16047h;

    static {
        p138n8.c cVar = new p138n8.c("org.jspecify.nullness");
        f16040a = cVar;
        p138n8.c cVar2 = new p138n8.c("org.jspecify.annotations");
        f16041b = cVar2;
        p138n8.c cVar3 = new p138n8.c("io.reactivex.rxjava3.annotations");
        f16042c = cVar3;
        p138n8.c cVar4 = new p138n8.c("org.checkerframework.checker.nullness.compatqual");
        f16043d = cVar4;
        java.lang.String strB = cVar3.b();
        p247y7.AbstractC7350t.e(strB, "asString(...)");
        f16044e = strB;
        f16045f = new p138n8.c[]{new p138n8.c(strB + ".Nullable"), new p138n8.c(strB + ".NonNull")};
        p138n8.c cVar5 = new p138n8.c("org.jetbrains.annotations");
        X7.w.a aVar = X7.w.f16048d;
        p087i7.u uVarA = p087i7.B.a(cVar5, aVar.a());
        p087i7.u uVarA2 = p087i7.B.a(new p138n8.c("androidx.annotation"), aVar.a());
        p087i7.u uVarA3 = p087i7.B.a(new p138n8.c("android.support.annotation"), aVar.a());
        p087i7.u uVarA4 = p087i7.B.a(new p138n8.c("android.annotation"), aVar.a());
        p087i7.u uVarA5 = p087i7.B.a(new p138n8.c("com.android.annotations"), aVar.a());
        p087i7.u uVarA6 = p087i7.B.a(new p138n8.c("org.eclipse.jdt.annotation"), aVar.a());
        p087i7.u uVarA7 = p087i7.B.a(new p138n8.c("org.checkerframework.checker.nullness.qual"), aVar.a());
        p087i7.u uVarA8 = p087i7.B.a(cVar4, aVar.a());
        p087i7.u uVarA9 = p087i7.B.a(new p138n8.c("javax.annotation"), aVar.a());
        p087i7.u uVarA10 = p087i7.B.a(new p138n8.c("edu.umd.cs.findbugs.annotations"), aVar.a());
        p087i7.u uVarA11 = p087i7.B.a(new p138n8.c("io.reactivex.annotations"), aVar.a());
        p138n8.c cVar6 = new p138n8.c("androidx.annotation.RecentlyNullable");
        X7.G g6 = X7.G.WARN;
        p087i7.u uVarA12 = p087i7.B.a(cVar6, new X7.w(g6, null, null, 4, null));
        p087i7.u uVarA13 = p087i7.B.a(new p138n8.c("androidx.annotation.RecentlyNonNull"), new X7.w(g6, null, null, 4, null));
        p087i7.u uVarA14 = p087i7.B.a(new p138n8.c("lombok"), aVar.a());
        p087i7.C6666l c6666l = new p087i7.C6666l(2, 0);
        X7.G g10 = X7.G.STRICT;
        f16046g = new X7.E(p097j7.S.k(uVarA, uVarA2, uVarA3, uVarA4, uVarA5, uVarA6, uVarA7, uVarA8, uVarA9, uVarA10, uVarA11, uVarA12, uVarA13, uVarA14, p087i7.B.a(cVar, new X7.w(g6, c6666l, g10)), p087i7.B.a(cVar2, new X7.w(g6, new p087i7.C6666l(2, 0), g10)), p087i7.B.a(cVar3, new X7.w(g6, new p087i7.C6666l(1, 8), g10))));
        f16047h = new X7.w(g6, null, null, 4, null);
    }

    public static final X7.z a(p087i7.C6666l c6666l) {
        p247y7.AbstractC7350t.f(c6666l, "configuredKotlinVersion");
        X7.w wVar = f16047h;
        X7.G gC = (wVar.d() == null || wVar.d().compareTo(c6666l) > 0) ? wVar.c() : wVar.b();
        return new X7.z(gC, c(gC), null, 4, null);
    }

    public static /* synthetic */ X7.z b(p087i7.C6666l c6666l, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            c6666l = p087i7.C6666l.f46737H;
        }
        return a(c6666l);
    }

    public static final X7.G c(X7.G g6) {
        p247y7.AbstractC7350t.f(g6, "globalReportLevel");
        if (g6 == X7.G.WARN) {
            return null;
        }
        return g6;
    }

    public static final X7.G d(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "annotationFqName");
        return h(cVar, X7.D.f15937a.a(), null, 4, null);
    }

    public static final p138n8.c e() {
        return f16041b;
    }

    public static final p138n8.c[] f() {
        return f16045f;
    }

    public static final X7.G g(p138n8.c cVar, X7.D d6, p087i7.C6666l c6666l) {
        p247y7.AbstractC7350t.f(cVar, "annotation");
        p247y7.AbstractC7350t.f(d6, "configuredReportLevels");
        p247y7.AbstractC7350t.f(c6666l, "configuredKotlinVersion");
        X7.G g6 = (X7.G) d6.a(cVar);
        if (g6 != null) {
            return g6;
        }
        X7.w wVar = (X7.w) f16046g.a(cVar);
        if (wVar == null) {
            return X7.G.IGNORE;
        }
        return (wVar.d() == null || wVar.d().compareTo(c6666l) > 0) ? wVar.c() : wVar.b();
    }

    public static /* synthetic */ X7.G h(p138n8.c cVar, X7.D d6, p087i7.C6666l c6666l, int i6, java.lang.Object obj) {
        if ((i6 & 4) != 0) {
            c6666l = new p087i7.C6666l(1, 7, 20);
        }
        return g(cVar, d6, c6666l);
    }
}
