package E7;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k {
    public static final void a(boolean z6, java.lang.Number number) {
        p247y7.AbstractC7350t.f(number, "step");
        if (z6) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Step must be positive, was: " + number + '.');
    }

    public static E7.e b(float f6, float f10) {
        return new E7.d(f6, f10);
    }
}
