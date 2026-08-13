package M0;

/* JADX INFO: renamed from: M0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1330b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence j(java.lang.CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        android.text.Spannable spannableString = charSequence instanceof android.text.Spannable ? (android.text.Spannable) charSequence : new android.text.SpannableString(charSequence);
        V0.e.u(spannableString, new P0.c(), spannableString.length() - 1, spannableString.length() - 1);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(N0.l0 l0Var, int i6) {
        int iM = l0Var.m();
        for (int i10 = 0; i10 < iM; i10++) {
            if (l0Var.l(i10) > i6) {
                return i10;
            }
        }
        return l0Var.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(M0.P p6, boolean z6) {
        if (!z6 || Y0.x.e(p6.q(), Y0.y.f(0)) || Y0.x.e(p6.q(), Y0.x.f16237b.a())) {
            return false;
        }
        int iZ = p6.z();
        X0.j.a aVar = X0.j.f15622b;
        return (X0.j.k(iZ, aVar.g()) || X0.j.k(p6.z(), aVar.f()) || X0.j.k(p6.z(), aVar.c())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(int i6) {
        X0.j.a aVar = X0.j.f15622b;
        if (X0.j.k(i6, aVar.d())) {
            return 3;
        }
        if (X0.j.k(i6, aVar.e())) {
            return 4;
        }
        if (X0.j.k(i6, aVar.a())) {
            return 2;
        }
        return (!X0.j.k(i6, aVar.f()) && X0.j.k(i6, aVar.b())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n(int i6) {
        X0.f.b.a aVar = X0.f.b.f15590a;
        if (X0.f.b.e(i6, aVar.c())) {
            return 0;
        }
        if (X0.f.b.e(i6, aVar.b())) {
            return 1;
        }
        return X0.f.b.e(i6, aVar.a()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(int i6) {
        X0.e.a aVar = X0.e.f15579b;
        if (X0.e.g(i6, aVar.a())) {
            return android.os.Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        X0.e.g(i6, aVar.b());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(int i6) {
        X0.f.c.a aVar = X0.f.c.f15595a;
        if (X0.f.c.f(i6, aVar.a())) {
            return 0;
        }
        if (X0.f.c.f(i6, aVar.b())) {
            return 1;
        }
        if (X0.f.c.f(i6, aVar.c())) {
            return 2;
        }
        return X0.f.c.f(i6, aVar.d()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(int i6) {
        X0.f.d.a aVar = X0.f.d.f15601a;
        return (!X0.f.d.d(i6, aVar.a()) && X0.f.d.d(i6, aVar.b())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(int i6) {
        M0.E.a aVar = M0.E.f6635a;
        return (!M0.E.d(i6, aVar.a()) && M0.E.d(i6, aVar.b())) ? 1 : 0;
    }
}
