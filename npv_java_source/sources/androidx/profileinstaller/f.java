package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
abstract class f {
    static int a(int i6) {
        return ((i6 + 7) & (-8)) / 8;
    }

    static byte[] b(byte[] bArr) {
        java.util.zip.Deflater deflater = new java.util.zip.Deflater(1);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.util.zip.DeflaterOutputStream deflaterOutputStream = new java.util.zip.DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (java.lang.Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    static java.lang.RuntimeException c(java.lang.String str) {
        return new java.lang.IllegalStateException(str);
    }

    static byte[] d(java.io.InputStream inputStream, int i6) throws java.io.IOException {
        byte[] bArr = new byte[i6];
        int i10 = 0;
        while (i10 < i6) {
            int i11 = inputStream.read(bArr, i10, i6 - i10);
            if (i11 < 0) {
                throw c("Not enough bytes to read: " + i6);
            }
            i10 += i11;
        }
        return bArr;
    }

    static byte[] e(java.io.InputStream inputStream, int i6, int i10) {
        java.util.zip.Inflater inflater = new java.util.zip.Inflater();
        try {
            byte[] bArr = new byte[i10];
            byte[] bArr2 = new byte[2048];
            int i11 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i11 < i6) {
                int i12 = inputStream.read(bArr2);
                if (i12 < 0) {
                    throw c("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i6 + " bytes");
                }
                inflater.setInput(bArr2, 0, i12);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i10 - iInflate);
                    i11 += i12;
                } catch (java.util.zip.DataFormatException e6) {
                    throw c(e6.getMessage());
                }
            }
            if (i11 == i6) {
                if (!inflater.finished()) {
                    throw c("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw c("Didn't read enough bytes during decompression. expected=" + i6 + " actual=" + i11);
        } catch (java.lang.Throwable th) {
            inflater.end();
            throw th;
        }
    }

    static java.lang.String f(java.io.InputStream inputStream, int i6) {
        return new java.lang.String(d(inputStream, i6), java.nio.charset.StandardCharsets.UTF_8);
    }

    static long g(java.io.InputStream inputStream, int i6) throws java.io.IOException {
        byte[] bArrD = d(inputStream, i6);
        long j6 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            j6 += ((long) (bArrD[i10] & 255)) << (i10 * 8);
        }
        return j6;
    }

    static int h(java.io.InputStream inputStream) {
        return (int) g(inputStream, 2);
    }

    static long i(java.io.InputStream inputStream) {
        return g(inputStream, 4);
    }

    static int j(java.io.InputStream inputStream) {
        return (int) g(inputStream, 1);
    }

    static int k(java.lang.String str) {
        return str.getBytes(java.nio.charset.StandardCharsets.UTF_8).length;
    }

    static void l(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.io.IOException {
        byte[] bArr = new byte[512];
        while (true) {
            int i6 = inputStream.read(bArr);
            if (i6 <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i6);
            }
        }
    }

    static void m(java.io.OutputStream outputStream, byte[] bArr) throws java.io.IOException {
        q(outputStream, bArr.length);
        byte[] bArrB = b(bArr);
        q(outputStream, bArrB.length);
        outputStream.write(bArrB);
    }

    static void n(java.io.OutputStream outputStream, java.lang.String str) throws java.io.IOException {
        outputStream.write(str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    static void o(java.io.OutputStream outputStream, long j6, int i6) throws java.io.IOException {
        byte[] bArr = new byte[i6];
        for (int i10 = 0; i10 < i6; i10++) {
            bArr[i10] = (byte) ((j6 >> (i10 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    static void p(java.io.OutputStream outputStream, int i6) throws java.io.IOException {
        o(outputStream, i6, 2);
    }

    static void q(java.io.OutputStream outputStream, long j6) throws java.io.IOException {
        o(outputStream, j6, 4);
    }

    static void r(java.io.OutputStream outputStream, int i6) throws java.io.IOException {
        o(outputStream, i6, 1);
    }
}
