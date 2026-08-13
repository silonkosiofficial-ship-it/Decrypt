package p106k5;

/* JADX INFO: renamed from: k5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C6897h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.String f49617b = p106k5.AbstractC6898i.z(java.util.UUID.randomUUID().toString() + java.lang.System.currentTimeMillis());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicLong f49618c = new java.util.concurrent.atomic.AtomicLong(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f49619a;

    C6897h() {
        byte[] bArr = new byte[10];
        f(bArr);
        e(bArr);
        d(bArr);
        java.lang.String strT = p106k5.AbstractC6898i.t(bArr);
        java.util.Locale locale = java.util.Locale.US;
        this.f49619a = java.lang.String.format(locale, "%s%s%s%s", strT.substring(0, 12), strT.substring(12, 16), strT.subSequence(16, 20), f49617b.substring(0, 12)).toUpperCase(locale);
    }

    private static byte[] a(long j6) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) j6);
        byteBufferAllocate.order(java.nio.ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    private static byte[] b(long j6) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j6);
        byteBufferAllocate.order(java.nio.ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    private void d(byte[] bArr) {
        byte[] bArrB = b(java.lang.Integer.valueOf(android.os.Process.myPid()).shortValue());
        bArr[8] = bArrB[0];
        bArr[9] = bArrB[1];
    }

    private void e(byte[] bArr) {
        byte[] bArrB = b(f49618c.incrementAndGet());
        bArr[6] = bArrB[0];
        bArr[7] = bArrB[1];
    }

    private void f(byte[] bArr) {
        long time = new java.util.Date().getTime();
        byte[] bArrA = a(time / 1000);
        bArr[0] = bArrA[0];
        bArr[1] = bArrA[1];
        bArr[2] = bArrA[2];
        bArr[3] = bArrA[3];
        byte[] bArrB = b(time % 1000);
        bArr[4] = bArrB[0];
        bArr[5] = bArrB[1];
    }

    public java.lang.String c() {
        return this.f49619a;
    }

    public java.lang.String toString() {
        return this.f49619a;
    }
}
