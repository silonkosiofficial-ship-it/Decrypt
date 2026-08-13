package p106k5;

/* JADX INFO: loaded from: classes3.dex */
abstract class L {
    private static void a(java.io.InputStream inputStream, java.io.File file) throws java.lang.Throwable {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        java.util.zip.GZIPOutputStream gZIPOutputStream = null;
        try {
            java.util.zip.GZIPOutputStream gZIPOutputStream2 = new java.util.zip.GZIPOutputStream(new java.io.FileOutputStream(file));
            while (true) {
                try {
                    int i6 = inputStream.read(bArr);
                    if (i6 <= 0) {
                        gZIPOutputStream2.finish();
                        p106k5.AbstractC6898i.g(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, i6);
                } catch (java.lang.Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    p106k5.AbstractC6898i.g(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    static void b(java.io.File file, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            p106k5.K k6 = (p106k5.K) it.next();
            java.io.InputStream inputStreamB = null;
            try {
                inputStreamB = k6.b();
                if (inputStreamB != null) {
                    a(inputStreamB, new java.io.File(file, k6.a()));
                }
            } catch (java.io.IOException unused) {
            } finally {
                p106k5.AbstractC6898i.g(null);
            }
        }
    }
}
