package androidx.appcompat.app;

/* JADX INFO: renamed from: androidx.appcompat.app.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1894e {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    static androidx.appcompat.app.w f17521C = new androidx.appcompat.app.w(new androidx.appcompat.app.x());

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static int f17522D = -100;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static androidx.core.os.i f17523E = null;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static androidx.core.os.i f17524F = null;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static java.lang.Boolean f17525G = null;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static boolean f17526H = false;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final p170r.C7027b f17527I = new p170r.C7027b();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final java.lang.Object f17528J = new java.lang.Object();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final java.lang.Object f17529K = new java.lang.Object();

    AbstractC1894e() {
    }

    static void c(androidx.appcompat.app.AbstractC1894e abstractC1894e) {
        synchronized (f17528J) {
            o(abstractC1894e);
            f17527I.add(new java.lang.ref.WeakReference(abstractC1894e));
        }
    }

    public static androidx.appcompat.app.AbstractC1894e e(android.app.Dialog dialog, androidx.appcompat.app.InterfaceC1893d interfaceC1893d) {
        return new androidx.appcompat.app.f(dialog, interfaceC1893d);
    }

    public static int g() {
        return f17522D;
    }

    static androidx.core.os.i h() {
        return f17523E;
    }

    static void n(androidx.appcompat.app.AbstractC1894e abstractC1894e) {
        synchronized (f17528J) {
            o(abstractC1894e);
        }
    }

    private static void o(androidx.appcompat.app.AbstractC1894e abstractC1894e) {
        synchronized (f17528J) {
            try {
                java.util.Iterator it = f17527I.iterator();
                while (it.hasNext()) {
                    androidx.appcompat.app.AbstractC1894e abstractC1894e2 = (androidx.appcompat.app.AbstractC1894e) ((java.lang.ref.WeakReference) it.next()).get();
                    if (abstractC1894e2 == abstractC1894e || abstractC1894e2 == null) {
                        it.remove();
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public abstract void d(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams);

    public abstract android.view.View f(int i6);

    public abstract void i();

    public abstract void j();

    public abstract void k(android.os.Bundle bundle);

    public abstract void l();

    public abstract void m();

    public abstract boolean p(int i6);

    public abstract void q(int i6);

    public abstract void r(android.view.View view);

    public abstract void s(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams);

    public void t(android.window.OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void u(int i6);

    public abstract void v(java.lang.CharSequence charSequence);
}
