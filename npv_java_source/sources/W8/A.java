package W8;

/* JADX INFO: loaded from: classes2.dex */
public class A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f15422b = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(W8.A.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Throwable f15423a;

    public A(java.lang.Throwable th, boolean z6) {
        this.f15423a = th;
        this._handled$volatile = z6 ? 1 : 0;
    }

    public /* synthetic */ A(java.lang.Throwable th, boolean z6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(th, (i6 & 2) != 0 ? false : z6);
    }

    public final boolean a() {
        return f15422b.get(this) != 0;
    }

    public final boolean c() {
        return f15422b.compareAndSet(this, 0, 1);
    }

    public java.lang.String toString() {
        return W8.S.a(this) + '[' + this.f15423a + ']';
    }
}
