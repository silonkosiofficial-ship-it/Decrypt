package W8;

/* JADX INFO: renamed from: W8.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class ExecutorC1777c0 implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final W8.J f15489C;

    public ExecutorC1777c0(W8.J j6) {
        this.f15489C = j6;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        W8.J j6 = this.f15489C;
        p127m7.j jVar = p127m7.j.f51198C;
        if (j6.v1(jVar)) {
            this.f15489C.t1(jVar, runnable);
        } else {
            runnable.run();
        }
    }

    public java.lang.String toString() {
        return this.f15489C.toString();
    }
}
