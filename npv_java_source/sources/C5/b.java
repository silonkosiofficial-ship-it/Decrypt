package C5;

/* JADX INFO: loaded from: classes3.dex */
final class b extends java.io.OutputStream {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f1306C = 0;

    b() {
    }

    long a() {
        return this.f1306C;
    }

    @Override // java.io.OutputStream
    public void write(int i6) {
        this.f1306C++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f1306C += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i6, int i10) {
        int i11;
        if (i6 < 0 || i6 > bArr.length || i10 < 0 || (i11 = i6 + i10) > bArr.length || i11 < 0) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        this.f1306C += (long) i10;
    }
}
