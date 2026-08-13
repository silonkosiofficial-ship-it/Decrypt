package O0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements O0.f {
    @Override // O0.f
    public int a(int i6) {
        int iE = e(i6);
        if (iE == -1 || e(iE) == -1) {
            return -1;
        }
        return iE;
    }

    @Override // O0.f
    public int b(int i6) {
        int iF = f(i6);
        if (iF == -1 || f(iF) == -1) {
            return -1;
        }
        return iF;
    }

    @Override // O0.f
    public int c(int i6) {
        return f(i6);
    }

    @Override // O0.f
    public int d(int i6) {
        return e(i6);
    }

    public abstract int e(int i6);

    public abstract int f(int i6);
}
