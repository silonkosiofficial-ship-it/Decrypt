package p231x0;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final long a(android.view.KeyEvent keyEvent) {
        return p231x0.f.a(keyEvent.getKeyCode());
    }

    public static final int b(android.view.KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? p231x0.c.f56893a.c() : p231x0.c.f56893a.b();
        }
        return p231x0.c.f56893a.a();
    }

    public static final int c(android.view.KeyEvent keyEvent) {
        return keyEvent.getUnicodeChar();
    }

    public static final boolean d(android.view.KeyEvent keyEvent) {
        return keyEvent.isAltPressed();
    }

    public static final boolean e(android.view.KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    public static final boolean f(android.view.KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }
}
