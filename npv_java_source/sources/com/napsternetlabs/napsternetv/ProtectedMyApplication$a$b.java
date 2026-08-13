package com.napsternetlabs.napsternetv;

/* JADX INFO: loaded from: classes.dex */
public class ProtectedMyApplication$a$b {
    private int hFd;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final byte[] f44250m;

    public ProtectedMyApplication$a$b(byte[] bArr) {
        this.f44250m = bArr;
        this.hFd = 0;
    }

    public ProtectedMyApplication$a$b(byte[] bArr, int i6) {
        this.f44250m = bArr;
        this.hFd = i6;
    }

    int D(int i6) {
        return com.napsternetlabs.napsternetv.ProtectedMyApplication$MyApplication$a.spw(this.f44250m[this.hFd + i6]);
    }

    byte aH(int i6) {
        return this.f44250m[this.hFd + i6];
    }

    public void g(int i6, int i10) {
        byte[] bArr = this.f44250m;
        int i11 = this.hFd;
        java.util.Arrays.fill(bArr, i11, i11 + i10, (byte) i6);
    }

    public void k(int i6) {
        this.hFd += i6;
    }

    public com.napsternetlabs.napsternetv.ProtectedMyApplication$a$b lnE(int i6) {
        return new com.napsternetlabs.napsternetv.ProtectedMyApplication$a$b(this.f44250m, this.hFd + i6);
    }

    byte[] ml(int i6, int i10) {
        byte[] bArr = new byte[i10];
        java.lang.System.arraycopy(this.f44250m, this.hFd + i6, bArr, 0, i10);
        return bArr;
    }

    void mon(int i6, byte b6) {
        this.f44250m[this.hFd + i6] = b6;
    }

    void wl(byte[] bArr, int i6) {
        java.lang.System.arraycopy(bArr, 0, this.f44250m, this.hFd + i6, bArr.length);
    }
}
