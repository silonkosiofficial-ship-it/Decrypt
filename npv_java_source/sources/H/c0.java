package H;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final S0.L f3875a = new H.b0(S0.L.f12263a.a(), 0, 0);

    public static final S0.e0 c(S0.g0 g0Var, M0.C1332d c1332d) {
        S0.e0 e0VarA = g0Var.a(c1332d);
        f(e0VarA, c1332d.length(), 0, 2, null);
        return new S0.e0(e0VarA.b(), new H.b0(e0VarA.a(), c1332d.length(), e0VarA.b().length()));
    }

    public static final S0.L d() {
        return f3875a;
    }

    public static final void e(S0.e0 e0Var, int i6, int i10) {
        int length = e0Var.b().length();
        int iMin = java.lang.Math.min(i6, i10);
        for (int i11 = 0; i11 < iMin; i11++) {
            g(e0Var.a().b(i11), length, i11);
        }
        g(e0Var.a().b(i6), length, i6);
        int iMin2 = java.lang.Math.min(length, i10);
        for (int i12 = 0; i12 < iMin2; i12++) {
            h(e0Var.a().a(i12), i6, i12);
        }
        h(e0Var.a().a(length), i6, length);
    }

    public static /* synthetic */ void f(S0.e0 e0Var, int i6, int i10, int i11, java.lang.Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 100;
        }
        e(e0Var, i6, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(int i6, int i10, int i11) {
        if (i6 < 0 || i6 > i10) {
            throw new java.lang.IllegalStateException(("OffsetMapping.originalToTransformed returned invalid mapping: " + i11 + " -> " + i6 + " is not in range of transformed text [0, " + i10 + ']').toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(int i6, int i10, int i11) {
        if (i6 < 0 || i6 > i10) {
            throw new java.lang.IllegalStateException(("OffsetMapping.transformedToOriginal returned invalid mapping: " + i11 + " -> " + i6 + " is not in range of original text [0, " + i10 + ']').toString());
        }
    }
}
