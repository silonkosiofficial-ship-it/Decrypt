package W8;

/* JADX INFO: renamed from: W8.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1808s0 {
    public static final java.util.concurrent.Executor a(W8.J j6) {
        java.util.concurrent.Executor executorZ1;
        W8.AbstractC1805q0 abstractC1805q0 = j6 instanceof W8.AbstractC1805q0 ? (W8.AbstractC1805q0) j6 : null;
        return (abstractC1805q0 == null || (executorZ1 = abstractC1805q0.z1()) == null) ? new W8.ExecutorC1777c0(j6) : executorZ1;
    }

    public static final W8.J b(java.util.concurrent.Executor executor) {
        W8.J j6;
        W8.ExecutorC1777c0 executorC1777c0 = executor instanceof W8.ExecutorC1777c0 ? (W8.ExecutorC1777c0) executor : null;
        return (executorC1777c0 == null || (j6 = executorC1777c0.f15489C) == null) ? new W8.C1806r0(executor) : j6;
    }

    public static final W8.AbstractC1805q0 c(java.util.concurrent.ExecutorService executorService) {
        return new W8.C1806r0(executorService);
    }
}
