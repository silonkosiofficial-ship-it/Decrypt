package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p043e2.f f22788a = new p043e2.f();

    public final void d(java.lang.String str, java.lang.AutoCloseable autoCloseable) {
        p247y7.AbstractC7350t.f(str, "key");
        p247y7.AbstractC7350t.f(autoCloseable, "closeable");
        p043e2.f fVar = this.f22788a;
        if (fVar != null) {
            fVar.d(str, autoCloseable);
        }
    }

    public final void e() {
        p043e2.f fVar = this.f22788a;
        if (fVar != null) {
            fVar.e();
        }
        g();
    }

    public final java.lang.AutoCloseable f(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "key");
        p043e2.f fVar = this.f22788a;
        if (fVar != null) {
            return fVar.g(str);
        }
        return null;
    }

    protected void g() {
    }
}
