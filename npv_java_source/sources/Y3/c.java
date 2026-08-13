package Y3;

/* JADX INFO: loaded from: classes.dex */
final class c extends java.lang.Thread {
    c(java.lang.ThreadGroup threadGroup, java.lang.String str) {
        super(threadGroup, "GmsDynamite");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        android.os.Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (java.lang.InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
