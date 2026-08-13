package W8;

/* JADX INFO: renamed from: W8.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1799n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p019b9.D f15525a = new p019b9.D("REMOVED_TASK");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p019b9.D f15526b = new p019b9.D("CLOSED_EMPTY");

    public static final long c(long j6) {
        if (j6 <= 0) {
            return 0L;
        }
        if (j6 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j6;
    }
}
