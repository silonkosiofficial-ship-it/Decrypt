package p197t7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final long a(java.io.InputStream inputStream, java.io.OutputStream outputStream, int i6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(inputStream, "<this>");
        p247y7.AbstractC7350t.f(outputStream, "out");
        byte[] bArr = new byte[i6];
        int i10 = inputStream.read(bArr);
        long j6 = 0;
        while (i10 >= 0) {
            outputStream.write(bArr, 0, i10);
            j6 += (long) i10;
            i10 = inputStream.read(bArr);
        }
        return j6;
    }

    public static /* synthetic */ long b(java.io.InputStream inputStream, java.io.OutputStream outputStream, int i6, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            i6 = 8192;
        }
        return a(inputStream, outputStream, i6);
    }

    public static final byte[] c(java.io.InputStream inputStream) {
        p247y7.AbstractC7350t.f(inputStream, "<this>");
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(java.lang.Math.max(8192, inputStream.available()));
        b(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        p247y7.AbstractC7350t.e(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
