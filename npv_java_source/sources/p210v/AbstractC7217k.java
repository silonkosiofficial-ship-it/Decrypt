package p210v;

/* JADX INFO: renamed from: v.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7217k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f55716a = android.view.ViewConfiguration.getTapTimeout();

    public static final long a() {
        return f55716a;
    }

    public static final boolean b(android.view.KeyEvent keyEvent) {
        return p231x0.c.e(p231x0.d.b(keyEvent), p231x0.c.f56893a.b()) && d(keyEvent);
    }

    public static final boolean c(F0.InterfaceC0924j interfaceC0924j) {
        return e(F0.AbstractC0926l.a(interfaceC0924j));
    }

    private static final boolean d(android.view.KeyEvent keyEvent) {
        int iB = p231x0.f.b(p231x0.d.a(keyEvent));
        return iB == 23 || iB == 66 || iB == 160;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.ViewGroup] */
    private static final boolean e(android.view.View view) {
        do {
            android.view.ViewParent parent = view.getParent();
            if (parent == null || !(parent instanceof android.view.ViewGroup)) {
                return false;
            }
            view = (android.view.ViewGroup) parent;
        } while (!view.shouldDelayChildPressedState());
        return true;
    }

    public static final boolean f(android.view.KeyEvent keyEvent) {
        return p231x0.c.e(p231x0.d.b(keyEvent), p231x0.c.f56893a.a()) && d(keyEvent);
    }
}
