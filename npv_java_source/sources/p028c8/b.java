package p028c8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final p028c8.a a(F8.p0 p0Var, boolean z6, boolean z10, O7.f0 f0Var) {
        p247y7.AbstractC7350t.f(p0Var, "<this>");
        return new p028c8.a(p0Var, null, z10, z6, f0Var != null ? p097j7.Z.c(f0Var) : null, null, 34, null);
    }

    public static /* synthetic */ p028c8.a b(F8.p0 p0Var, boolean z6, boolean z10, O7.f0 f0Var, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            z6 = false;
        }
        if ((i6 & 2) != 0) {
            z10 = false;
        }
        if ((i6 & 4) != 0) {
            f0Var = null;
        }
        return a(p0Var, z6, z10, f0Var);
    }
}
