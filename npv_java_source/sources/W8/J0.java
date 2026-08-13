package W8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class J0 extends W8.J {
    protected final java.lang.String A1() {
        W8.J0 j0Z1;
        W8.J0 j0C = W8.C1779d0.c();
        if (this == j0C) {
            return "Dispatchers.Main";
        }
        try {
            j0Z1 = j0C.z1();
        } catch (java.lang.UnsupportedOperationException unused) {
            j0Z1 = null;
        }
        if (this == j0Z1) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // W8.J
    public W8.J x1(int i6, java.lang.String str) {
        p019b9.AbstractC2125l.a(i6);
        return p019b9.AbstractC2125l.b(this, str);
    }

    public abstract W8.J0 z1();
}
