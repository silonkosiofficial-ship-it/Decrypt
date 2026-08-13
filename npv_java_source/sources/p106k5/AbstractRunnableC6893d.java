package p106k5;

/* JADX INFO: renamed from: k5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRunnableC6893d implements java.lang.Runnable {
    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Process.setThreadPriority(10);
        a();
    }
}
