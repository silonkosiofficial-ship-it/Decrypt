package p149o9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f52597a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final void a(long j6, long j10, long j11) {
        if (j10 < 0 || j11 > j6) {
            throw new java.lang.IndexOutOfBoundsException("startIndex (" + j10 + ") and endIndex (" + j11 + ") are not within the range [0..size(" + j6 + "))");
        }
        if (j10 <= j11) {
            return;
        }
        throw new java.lang.IllegalArgumentException("startIndex (" + j10 + ") > endIndex (" + j11 + ')');
    }

    public static final void b(long j6, long j10, long j11) {
        if (j10 < 0 || j10 > j6 || j6 - j10 < j11 || j11 < 0) {
            throw new java.lang.IllegalArgumentException("offset (" + j10 + ") and byteCount (" + j11 + ") are not within the range [0..size(" + j6 + "))");
        }
    }

    public static final char[] c() {
        return f52597a;
    }
}
