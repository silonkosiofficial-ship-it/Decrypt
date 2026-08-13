package F0;

/* JADX INFO: loaded from: classes.dex */
public abstract class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Y0.e f2395a = Y0.g.b(1.0f, 0.0f, 2, null);

    public static final F0.o0 b(F0.J j6) {
        F0.o0 o0VarN0 = j6.n0();
        if (o0VarN0 != null) {
            return o0VarN0;
        }
        C0.a.c("LayoutNode should be attached to an owner");
        throw new p087i7.C6665k();
    }
}
