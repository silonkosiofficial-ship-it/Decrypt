package p231x0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.view.KeyEvent f56892a;

    private /* synthetic */ b(android.view.KeyEvent keyEvent) {
        this.f56892a = keyEvent;
    }

    public static final /* synthetic */ p231x0.b a(android.view.KeyEvent keyEvent) {
        return new p231x0.b(keyEvent);
    }

    public static android.view.KeyEvent b(android.view.KeyEvent keyEvent) {
        return keyEvent;
    }

    public static boolean c(android.view.KeyEvent keyEvent, java.lang.Object obj) {
        return (obj instanceof p231x0.b) && p247y7.AbstractC7350t.b(keyEvent, ((p231x0.b) obj).f());
    }

    public static int d(android.view.KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    public static java.lang.String e(android.view.KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public boolean equals(java.lang.Object obj) {
        return c(this.f56892a, obj);
    }

    public final /* synthetic */ android.view.KeyEvent f() {
        return this.f56892a;
    }

    public int hashCode() {
        return d(this.f56892a);
    }

    public java.lang.String toString() {
        return e(this.f56892a);
    }
}
