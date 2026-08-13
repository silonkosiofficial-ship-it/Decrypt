package R0;

/* JADX INFO: loaded from: classes.dex */
final class B implements R0.z {
    private final android.graphics.Typeface c(java.lang.String str, R0.q qVar, int i6) {
        R0.o.a aVar = R0.o.f9321b;
        if (R0.o.f(i6, aVar.b()) && p247y7.AbstractC7350t.b(qVar, R0.q.f9331D.d()) && (str == null || str.length() == 0)) {
            return android.graphics.Typeface.DEFAULT;
        }
        return android.graphics.Typeface.create(str == null ? android.graphics.Typeface.DEFAULT : android.graphics.Typeface.create(str, 0), qVar.q(), R0.o.f(i6, aVar.a()));
    }

    @Override // R0.z
    public android.graphics.Typeface a(R0.q qVar, int i6) {
        return c(null, qVar, i6);
    }

    @Override // R0.z
    public android.graphics.Typeface b(R0.u uVar, R0.q qVar, int i6) {
        return c(uVar.c(), qVar, i6);
    }
}
