package p251z0;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f57512a;

    private /* synthetic */ O(int i6) {
        this.f57512a = i6;
    }

    public static final /* synthetic */ p251z0.O a(int i6) {
        return new p251z0.O(i6);
    }

    public static int b(int i6) {
        return i6;
    }

    public static boolean c(int i6, java.lang.Object obj) {
        return (obj instanceof p251z0.O) && i6 == ((p251z0.O) obj).f();
    }

    public static int d(int i6) {
        return i6;
    }

    public static java.lang.String e(int i6) {
        return "PointerKeyboardModifiers(packedValue=" + i6 + ')';
    }

    public boolean equals(java.lang.Object obj) {
        return c(this.f57512a, obj);
    }

    public final /* synthetic */ int f() {
        return this.f57512a;
    }

    public int hashCode() {
        return d(this.f57512a);
    }

    public java.lang.String toString() {
        return e(this.f57512a);
    }
}
