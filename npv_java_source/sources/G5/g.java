package G5;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte f3039a = java.lang.Byte.parseByte("01110000", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte f3040b = java.lang.Byte.parseByte("00001111", 2);

    private static java.lang.String b(byte[] bArr) {
        return new java.lang.String(android.util.Base64.encode(bArr, 11), java.nio.charset.Charset.defaultCharset()).substring(0, 22);
    }

    private static byte[] c(java.util.UUID uuid, byte[] bArr) {
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        return byteBufferWrap.array();
    }

    public java.lang.String a() {
        byte[] bArrC = c(java.util.UUID.randomUUID(), new byte[17]);
        byte b6 = bArrC[0];
        bArrC[16] = b6;
        bArrC[0] = (byte) ((b6 & f3040b) | f3039a);
        return b(bArrC);
    }
}
