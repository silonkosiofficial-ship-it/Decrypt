package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
final class z extends java.io.Writer {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f22734C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.lang.StringBuilder f22735D = new java.lang.StringBuilder(128);

    z(java.lang.String str) {
        this.f22734C = str;
    }

    private void a() {
        if (this.f22735D.length() > 0) {
            java.lang.String str = this.f22734C;
            this.f22735D.toString();
            java.lang.StringBuilder sb = this.f22735D;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i6, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            char c6 = cArr[i6 + i11];
            if (c6 == '\n') {
                a();
            } else {
                this.f22735D.append(c6);
            }
        }
    }
}
