package W8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f15474a = p019b9.E.f("kotlinx.coroutines.main.delay", false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final W8.X f15475b = b();

    public static final W8.X a() {
        return f15475b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final W8.X b() {
        if (!f15474a) {
            return W8.T.f15472K;
        }
        W8.J0 j0C = W8.C1779d0.c();
        return (p019b9.t.c(j0C) || !(j0C instanceof W8.X)) ? W8.T.f15472K : (W8.X) j0C;
    }
}
