package R0;

/* JADX INFO: loaded from: classes.dex */
final class C implements R0.z {
    private final android.graphics.Typeface c(java.lang.String str, R0.q qVar, int i6) {
        if (R0.o.f(i6, R0.o.f9321b.b()) && p247y7.AbstractC7350t.b(qVar, R0.q.f9331D.d()) && (str == null || str.length() == 0)) {
            return android.graphics.Typeface.DEFAULT;
        }
        int iC = R0.AbstractC1490d.c(qVar, i6);
        return (str == null || str.length() == 0) ? android.graphics.Typeface.defaultFromStyle(iC) : android.graphics.Typeface.create(str, iC);
    }

    private final android.graphics.Typeface d(java.lang.String str, R0.q qVar, int i6) {
        if (str.length() == 0) {
            return null;
        }
        android.graphics.Typeface typefaceC = c(str, qVar, i6);
        if (p247y7.AbstractC7350t.b(typefaceC, android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, R0.AbstractC1490d.c(qVar, i6))) || p247y7.AbstractC7350t.b(typefaceC, c(null, qVar, i6))) {
            return null;
        }
        return typefaceC;
    }

    @Override // R0.z
    public android.graphics.Typeface a(R0.q qVar, int i6) {
        return c(null, qVar, i6);
    }

    @Override // R0.z
    public android.graphics.Typeface b(R0.u uVar, R0.q qVar, int i6) {
        android.graphics.Typeface typefaceD = d(R0.D.b(uVar.c(), qVar), qVar, i6);
        return typefaceD == null ? c(uVar.c(), qVar, i6) : typefaceD;
    }
}
