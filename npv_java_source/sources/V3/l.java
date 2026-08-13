package V3;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static void a(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static long b(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        return c(inputStream, outputStream, false, 1024);
    }

    public static long c(java.io.InputStream inputStream, java.io.OutputStream outputStream, boolean z6, int i6) {
        byte[] bArr = new byte[i6];
        long j6 = 0;
        while (true) {
            try {
                int i10 = inputStream.read(bArr, 0, i6);
                if (i10 == -1) {
                    break;
                }
                j6 += (long) i10;
                outputStream.write(bArr, 0, i10);
            } catch (java.lang.Throwable th) {
                if (z6) {
                    a(inputStream);
                    a(outputStream);
                }
                throw th;
            }
        }
        if (z6) {
            a(inputStream);
            a(outputStream);
        }
        return j6;
    }

    public static byte[] d(java.io.InputStream inputStream, boolean z6) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        c(inputStream, byteArrayOutputStream, z6, 1024);
        return byteArrayOutputStream.toByteArray();
    }
}
