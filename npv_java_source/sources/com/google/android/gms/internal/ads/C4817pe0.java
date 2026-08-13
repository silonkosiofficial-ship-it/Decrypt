package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pe0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4817pe0 extends com.google.android.gms.internal.ads.AbstractC2493Je0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.content.res.AssetManager f38040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private android.net.Uri f38041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private java.io.InputStream f38042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f38043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f38044i;

    public C4817pe0(android.content.Context context) {
        super(false);
        this.f38040e = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4884qB0
    public final int H(byte[] bArr, int i6, int i10) throws com.google.android.gms.internal.ads.C2675Od0 {
        if (i10 == 0) {
            return 0;
        }
        long j6 = this.f38043h;
        if (j6 == 0) {
            return -1;
        }
        if (j6 != -1) {
            try {
                i10 = (int) java.lang.Math.min(j6, i10);
            } catch (java.io.IOException e6) {
                throw new com.google.android.gms.internal.ads.C2675Od0(e6, 2000);
            }
        }
        java.io.InputStream inputStream = this.f38042g;
        int i11 = com.google.android.gms.internal.ads.EW.f27061a;
        int i12 = inputStream.read(bArr, i6, i10);
        if (i12 == -1) {
            return -1;
        }
        long j10 = this.f38043h;
        if (j10 != -1) {
            this.f38043h = j10 - ((long) i12);
        }
        D(i12);
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final long a(com.google.android.gms.internal.ads.C3843gl0 c3843gl0) throws com.google.android.gms.internal.ads.C2675Od0 {
        try {
            android.net.Uri uri = c3843gl0.f35675a;
            this.f38041f = uri;
            java.lang.String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            h(c3843gl0);
            java.io.InputStream inputStreamOpen = this.f38040e.open(path, 1);
            this.f38042g = inputStreamOpen;
            if (inputStreamOpen.skip(c3843gl0.f35679e) < c3843gl0.f35679e) {
                throw new com.google.android.gms.internal.ads.C2675Od0(null, 2008);
            }
            long j6 = c3843gl0.f35680f;
            if (j6 != -1) {
                this.f38043h = j6;
            } else {
                long jAvailable = this.f38042g.available();
                this.f38043h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f38043h = -1L;
                }
            }
            this.f38044i = true;
            i(c3843gl0);
            return this.f38043h;
        } catch (com.google.android.gms.internal.ads.C2675Od0 e6) {
            throw e6;
        } catch (java.io.IOException e10) {
            throw new com.google.android.gms.internal.ads.C2675Od0(e10, true != (e10 instanceof java.io.FileNotFoundException) ? 2000 : 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final android.net.Uri c() {
        return this.f38041f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final void f() {
        this.f38041f = null;
        try {
            try {
                java.io.InputStream inputStream = this.f38042g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f38042g = null;
                if (this.f38044i) {
                    this.f38044i = false;
                    g();
                }
            } catch (java.io.IOException e6) {
                throw new com.google.android.gms.internal.ads.C2675Od0(e6, 2000);
            }
        } catch (java.lang.Throwable th) {
            this.f38042g = null;
            if (this.f38044i) {
                this.f38044i = false;
                g();
            }
            throw th;
        }
    }
}
