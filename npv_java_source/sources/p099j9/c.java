package p099j9;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class c {
    public static /* synthetic */ long a(long j6, long j10) {
        long j11 = j6 + j10;
        if (((j10 ^ j6) < 0) || ((j6 ^ j11) >= 0)) {
            return j11;
        }
        throw new java.lang.ArithmeticException();
    }
}
