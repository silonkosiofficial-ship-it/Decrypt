package W8;

/* JADX INFO: renamed from: W8.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1795l0 extends W8.AbstractC1791j0 {
    protected abstract java.lang.Thread L1();

    protected void M1(long j6, W8.AbstractC1793k0.c cVar) {
        W8.T.f15472K.a2(j6, cVar);
    }

    protected final void N1() {
        java.lang.Thread threadL1 = L1();
        if (java.lang.Thread.currentThread() != threadL1) {
            W8.AbstractC1776c.a();
            java.util.concurrent.locks.LockSupport.unpark(threadL1);
        }
    }
}
