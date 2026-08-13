package D0;

/* JADX INFO: renamed from: D0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0890i {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(long j6, long j10) {
        return p131n0.m.g(j10) / p131n0.m.g(j6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(long j6, long j10) {
        return java.lang.Math.max(h(j6, j10), e(j6, j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(long j6, long j10) {
        return java.lang.Math.min(h(j6, j10), e(j6, j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(long j6, long j10) {
        return p131n0.m.i(j10) / p131n0.m.i(j6);
    }
}
