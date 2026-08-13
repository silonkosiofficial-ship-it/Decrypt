package X7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p138n8.c f15919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p138n8.c f15920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p138n8.c f15921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p138n8.c f15922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p138n8.c f15923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p138n8.c f15924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.util.List f15925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final p138n8.c f15926h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final p138n8.c f15927i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final java.util.List f15928j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final p138n8.c f15929k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final p138n8.c f15930l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final p138n8.c f15931m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final p138n8.c f15932n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final java.util.Set f15933o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final java.util.Set f15934p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final java.util.Set f15935q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final java.util.Map f15936r;

    static {
        p138n8.c cVar = new p138n8.c("org.jspecify.nullness.Nullable");
        f15919a = cVar;
        f15920b = new p138n8.c("org.jspecify.nullness.NullnessUnspecified");
        p138n8.c cVar2 = new p138n8.c("org.jspecify.nullness.NullMarked");
        f15921c = cVar2;
        p138n8.c cVar3 = new p138n8.c("org.jspecify.annotations.Nullable");
        f15922d = cVar3;
        f15923e = new p138n8.c("org.jspecify.annotations.NullnessUnspecified");
        p138n8.c cVar4 = new p138n8.c("org.jspecify.annotations.NullMarked");
        f15924f = cVar4;
        java.util.List listP = p097j7.AbstractC6879v.p(X7.B.f15908m, new p138n8.c("androidx.annotation.Nullable"), new p138n8.c("android.support.annotation.Nullable"), new p138n8.c("android.annotation.Nullable"), new p138n8.c("com.android.annotations.Nullable"), new p138n8.c("org.eclipse.jdt.annotation.Nullable"), new p138n8.c("org.checkerframework.checker.nullness.qual.Nullable"), new p138n8.c("javax.annotation.Nullable"), new p138n8.c("javax.annotation.CheckForNull"), new p138n8.c("edu.umd.cs.findbugs.annotations.CheckForNull"), new p138n8.c("edu.umd.cs.findbugs.annotations.Nullable"), new p138n8.c("edu.umd.cs.findbugs.annotations.PossiblyNull"), new p138n8.c("io.reactivex.annotations.Nullable"), new p138n8.c("io.reactivex.rxjava3.annotations.Nullable"));
        f15925g = listP;
        p138n8.c cVar5 = new p138n8.c("javax.annotation.Nonnull");
        f15926h = cVar5;
        f15927i = new p138n8.c("javax.annotation.CheckForNull");
        java.util.List listP2 = p097j7.AbstractC6879v.p(X7.B.f15907l, new p138n8.c("edu.umd.cs.findbugs.annotations.NonNull"), new p138n8.c("androidx.annotation.NonNull"), new p138n8.c("android.support.annotation.NonNull"), new p138n8.c("android.annotation.NonNull"), new p138n8.c("com.android.annotations.NonNull"), new p138n8.c("org.eclipse.jdt.annotation.NonNull"), new p138n8.c("org.checkerframework.checker.nullness.qual.NonNull"), new p138n8.c("lombok.NonNull"), new p138n8.c("io.reactivex.annotations.NonNull"), new p138n8.c("io.reactivex.rxjava3.annotations.NonNull"));
        f15928j = listP2;
        p138n8.c cVar6 = new p138n8.c("org.checkerframework.checker.nullness.compatqual.NullableDecl");
        f15929k = cVar6;
        p138n8.c cVar7 = new p138n8.c("org.checkerframework.checker.nullness.compatqual.NonNullDecl");
        f15930l = cVar7;
        p138n8.c cVar8 = new p138n8.c("androidx.annotation.RecentlyNullable");
        f15931m = cVar8;
        p138n8.c cVar9 = new p138n8.c("androidx.annotation.RecentlyNonNull");
        f15932n = cVar9;
        f15933o = p097j7.Z.k(p097j7.Z.k(p097j7.Z.k(p097j7.Z.k(p097j7.Z.k(p097j7.Z.k(p097j7.Z.k(p097j7.Z.k(p097j7.Z.j(p097j7.Z.k(p097j7.Z.j(new java.util.LinkedHashSet(), listP), cVar5), listP2), cVar6), cVar7), cVar8), cVar9), cVar), cVar2), cVar3), cVar4);
        f15934p = p097j7.Z.g(X7.B.f15910o, X7.B.f15911p);
        f15935q = p097j7.Z.g(X7.B.f15909n, X7.B.f15912q);
        f15936r = p097j7.S.k(p087i7.B.a(X7.B.f15899d, L7.j.a.f6341H), p087i7.B.a(X7.B.f15901f, L7.j.a.f6349L), p087i7.B.a(X7.B.f15903h, L7.j.a.f6413y), p087i7.B.a(X7.B.f15904i, L7.j.a.f6354P));
    }

    public static final p138n8.c a() {
        return f15932n;
    }

    public static final p138n8.c b() {
        return f15931m;
    }

    public static final p138n8.c c() {
        return f15930l;
    }

    public static final p138n8.c d() {
        return f15929k;
    }

    public static final p138n8.c e() {
        return f15927i;
    }

    public static final p138n8.c f() {
        return f15926h;
    }

    public static final p138n8.c g() {
        return f15922d;
    }

    public static final p138n8.c h() {
        return f15923e;
    }

    public static final p138n8.c i() {
        return f15924f;
    }

    public static final p138n8.c j() {
        return f15919a;
    }

    public static final p138n8.c k() {
        return f15920b;
    }

    public static final p138n8.c l() {
        return f15921c;
    }

    public static final java.util.Set m() {
        return f15935q;
    }

    public static final java.util.List n() {
        return f15928j;
    }

    public static final java.util.List o() {
        return f15925g;
    }

    public static final java.util.Set p() {
        return f15934p;
    }
}
