package p141o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final android.graphics.Canvas f52128a = new android.graphics.Canvas();

    public static final p141o0.InterfaceC6993q0 a(p141o0.E1 e6) {
        p141o0.G g6 = new p141o0.G();
        g6.w(new android.graphics.Canvas(p141o0.Q.b(e6)));
        return g6;
    }

    public static final p141o0.InterfaceC6993q0 b(android.graphics.Canvas canvas) {
        p141o0.G g6 = new p141o0.G();
        g6.w(canvas);
        return g6;
    }

    public static final android.graphics.Canvas d(p141o0.InterfaceC6993q0 interfaceC6993q0) {
        p247y7.AbstractC7350t.d(interfaceC6993q0, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((p141o0.G) interfaceC6993q0).a();
    }
}
