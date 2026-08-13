package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4841pq0 extends com.google.android.gms.internal.ads.AbstractC2493Je0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.io.RandomAccessFile f38088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private android.net.Uri f38089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f38090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f38091h;

    public C4841pq0() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4884qB0
    public final int H(byte[] bArr, int i6, int i10) throws com.google.android.gms.internal.ads.Op0 {
        if (i10 == 0) {
            return 0;
        }
        long j6 = this.f38090g;
        if (j6 == 0) {
            return -1;
        }
        try {
            java.io.RandomAccessFile randomAccessFile = this.f38088e;
            int i11 = com.google.android.gms.internal.ads.EW.f27061a;
            int i12 = randomAccessFile.read(bArr, i6, (int) java.lang.Math.min(j6, i10));
            if (i12 > 0) {
                this.f38090g -= (long) i12;
                D(i12);
            }
            return i12;
        } catch (java.io.IOException e6) {
            throw new com.google.android.gms.internal.ads.Op0(e6, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final long a(com.google.android.gms.internal.ads.C3843gl0 c3843gl0) throws com.google.android.gms.internal.ads.Op0 {
        android.net.Uri uri = c3843gl0.f35675a;
        this.f38089f = uri;
        h(c3843gl0);
        try {
            java.lang.String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(path, "r");
            this.f38088e = randomAccessFile;
            try {
                randomAccessFile.seek(c3843gl0.f35679e);
                long length = c3843gl0.f35680f;
                if (length == -1) {
                    length = this.f38088e.length() - c3843gl0.f35679e;
                }
                this.f38090g = length;
                if (length < 0) {
                    throw new com.google.android.gms.internal.ads.Op0(null, null, 2008);
                }
                this.f38091h = true;
                i(c3843gl0);
                return this.f38090g;
            } catch (java.io.IOException e6) {
                throw new com.google.android.gms.internal.ads.Op0(e6, 2000);
            }
        } catch (java.io.FileNotFoundException e10) {
            if (android.text.TextUtils.isEmpty(uri.getQuery()) && android.text.TextUtils.isEmpty(uri.getFragment())) {
                throw new com.google.android.gms.internal.ads.Op0(e10, ((e10.getCause() instanceof android.system.ErrnoException) && ((android.system.ErrnoException) e10.getCause()).errno == android.system.OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new com.google.android.gms.internal.ads.Op0(java.lang.String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e10, 1004);
        } catch (java.lang.SecurityException e11) {
            throw new com.google.android.gms.internal.ads.Op0(e11, 2006);
        } catch (java.lang.RuntimeException e12) {
            throw new com.google.android.gms.internal.ads.Op0(e12, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final android.net.Uri c() {
        return this.f38089f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final void f() {
        this.f38089f = null;
        try {
            try {
                java.io.RandomAccessFile randomAccessFile = this.f38088e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f38088e = null;
                if (this.f38091h) {
                    this.f38091h = false;
                    g();
                }
            } catch (java.io.IOException e6) {
                throw new com.google.android.gms.internal.ads.Op0(e6, 2000);
            }
        } catch (java.lang.Throwable th) {
            this.f38088e = null;
            if (this.f38091h) {
                this.f38091h = false;
                g();
            }
            throw th;
        }
    }
}
