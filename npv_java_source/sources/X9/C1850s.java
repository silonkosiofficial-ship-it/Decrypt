package X9;

/* JADX INFO: renamed from: X9.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1850s extends X9.AbstractC1843k {
    private final void m(X9.Q q6) throws java.io.IOException {
        if (g(q6)) {
            throw new java.io.IOException(q6 + " already exists.");
        }
    }

    private final void n(X9.Q q6) throws java.io.IOException {
        if (g(q6)) {
            return;
        }
        throw new java.io.IOException(q6 + " doesn't exist.");
    }

    @Override // X9.AbstractC1843k
    public void a(X9.Q q6, X9.Q q10) throws java.io.IOException {
        p247y7.AbstractC7350t.f(q6, "source");
        p247y7.AbstractC7350t.f(q10, "target");
        if (q6.x().renameTo(q10.x())) {
            return;
        }
        throw new java.io.IOException("failed to move " + q6 + " to " + q10);
    }

    @Override // X9.AbstractC1843k
    public void d(X9.Q q6, boolean z6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(q6, "dir");
        if (q6.x().mkdir()) {
            return;
        }
        X9.C1842j c1842jH = h(q6);
        if (c1842jH == null || !c1842jH.a()) {
            throw new java.io.IOException("failed to create directory: " + q6);
        }
        if (z6) {
            throw new java.io.IOException(q6 + " already exists.");
        }
    }

    @Override // X9.AbstractC1843k
    public void f(X9.Q q6, boolean z6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(q6, "path");
        if (java.lang.Thread.interrupted()) {
            throw new java.io.InterruptedIOException("interrupted");
        }
        java.io.File fileX = q6.x();
        if (fileX.delete()) {
            return;
        }
        if (fileX.exists()) {
            throw new java.io.IOException("failed to delete " + q6);
        }
        if (z6) {
            throw new java.io.FileNotFoundException("no such file: " + q6);
        }
    }

    @Override // X9.AbstractC1843k
    public X9.C1842j h(X9.Q q6) {
        p247y7.AbstractC7350t.f(q6, "path");
        java.io.File fileX = q6.x();
        boolean zIsFile = fileX.isFile();
        boolean zIsDirectory = fileX.isDirectory();
        long jLastModified = fileX.lastModified();
        long length = fileX.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || fileX.exists()) {
            return new X9.C1842j(zIsFile, zIsDirectory, null, java.lang.Long.valueOf(length), null, java.lang.Long.valueOf(jLastModified), null, null, 128, null);
        }
        return null;
    }

    @Override // X9.AbstractC1843k
    public X9.AbstractC1841i i(X9.Q q6) {
        p247y7.AbstractC7350t.f(q6, "file");
        return new X9.r(false, new java.io.RandomAccessFile(q6.x(), "r"));
    }

    @Override // X9.AbstractC1843k
    public X9.AbstractC1841i k(X9.Q q6, boolean z6, boolean z10) throws java.io.IOException {
        p247y7.AbstractC7350t.f(q6, "file");
        if (z6 && z10) {
            throw new java.lang.IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.".toString());
        }
        if (z6) {
            m(q6);
        }
        if (z10) {
            n(q6);
        }
        return new X9.r(true, new java.io.RandomAccessFile(q6.x(), "rw"));
    }

    @Override // X9.AbstractC1843k
    public X9.Z l(X9.Q q6) {
        p247y7.AbstractC7350t.f(q6, "file");
        return X9.K.e(q6.x());
    }

    public java.lang.String toString() {
        return "JvmSystemFileSystem";
    }
}
