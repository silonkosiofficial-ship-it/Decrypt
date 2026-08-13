package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ng0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2644Ng0 extends com.google.android.gms.internal.ads.AbstractC2493Je0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.content.ContentResolver f30355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private android.net.Uri f30356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private android.content.res.AssetFileDescriptor f30357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private java.io.FileInputStream f30358h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f30359i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f30360j;

    public C2644Ng0(android.content.Context context) {
        super(false);
        this.f30355e = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4884qB0
    public final int H(byte[] bArr, int i6, int i10) throws com.google.android.gms.internal.ads.C4491mg0 {
        if (i10 == 0) {
            return 0;
        }
        long j6 = this.f30359i;
        if (j6 == 0) {
            return -1;
        }
        if (j6 != -1) {
            try {
                i10 = (int) java.lang.Math.min(j6, i10);
            } catch (java.io.IOException e6) {
                throw new com.google.android.gms.internal.ads.C4491mg0(e6, 2000);
            }
        }
        java.io.FileInputStream fileInputStream = this.f30358h;
        int i11 = com.google.android.gms.internal.ads.EW.f27061a;
        int i12 = fileInputStream.read(bArr, i6, i10);
        if (i12 == -1) {
            return -1;
        }
        long j10 = this.f30359i;
        if (j10 != -1) {
            this.f30359i = j10 - ((long) i12);
        }
        D(i12);
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final long a(com.google.android.gms.internal.ads.C3843gl0 c3843gl0) throws com.google.android.gms.internal.ads.C4491mg0 {
        int i6;
        android.content.res.AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long jPosition;
        try {
            try {
                android.net.Uri uriNormalizeScheme = c3843gl0.f35675a.normalizeScheme();
                this.f30356f = uriNormalizeScheme;
                h(c3843gl0);
                if ("content".equals(uriNormalizeScheme.getScheme())) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = this.f30355e.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = this.f30355e.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.f30357g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i6 = 2000;
                    try {
                        throw new com.google.android.gms.internal.ads.C4491mg0(new java.io.IOException("Could not open file descriptor for: " + java.lang.String.valueOf(uriNormalizeScheme)), 2000);
                    } catch (java.io.IOException e6) {
                        e = e6;
                        if (true == (e instanceof java.io.FileNotFoundException)) {
                            i6 = 2005;
                        }
                        throw new com.google.android.gms.internal.ads.C4491mg0(e, i6);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f30358h = fileInputStream;
                if (length != -1 && c3843gl0.f35679e > length) {
                    throw new com.google.android.gms.internal.ads.C4491mg0(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(c3843gl0.f35679e + startOffset) - startOffset;
                if (jSkip != c3843gl0.f35679e) {
                    throw new com.google.android.gms.internal.ads.C4491mg0(null, 2008);
                }
                if (length == -1) {
                    java.nio.channels.FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f30359i = -1L;
                        jPosition = -1;
                    } else {
                        jPosition = size - channel.position();
                        this.f30359i = jPosition;
                        if (jPosition < 0) {
                            throw new com.google.android.gms.internal.ads.C4491mg0(null, 2008);
                        }
                    }
                } else {
                    jPosition = length - jSkip;
                    this.f30359i = jPosition;
                    if (jPosition < 0) {
                        throw new com.google.android.gms.internal.ads.C4491mg0(null, 2008);
                    }
                }
                long jMin = c3843gl0.f35680f;
                if (jMin != -1) {
                    if (jPosition != -1) {
                        jMin = java.lang.Math.min(jPosition, jMin);
                    }
                    this.f30359i = jMin;
                }
                this.f30360j = true;
                i(c3843gl0);
                long j6 = c3843gl0.f35680f;
                return j6 != -1 ? j6 : this.f30359i;
            } catch (com.google.android.gms.internal.ads.C4491mg0 e10) {
                throw e10;
            }
        } catch (java.io.IOException e11) {
            e = e11;
            i6 = 2000;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final android.net.Uri c() {
        return this.f30356f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final void f() {
        this.f30356f = null;
        try {
            try {
                try {
                    java.io.FileInputStream fileInputStream = this.f30358h;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    this.f30358h = null;
                    try {
                        android.content.res.AssetFileDescriptor assetFileDescriptor = this.f30357g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.f30357g = null;
                        if (this.f30360j) {
                            this.f30360j = false;
                            g();
                        }
                    } catch (java.io.IOException e6) {
                        throw new com.google.android.gms.internal.ads.C4491mg0(e6, 2000);
                    }
                } catch (java.io.IOException e10) {
                    throw new com.google.android.gms.internal.ads.C4491mg0(e10, 2000);
                }
            } catch (java.lang.Throwable th) {
                this.f30358h = null;
                try {
                    android.content.res.AssetFileDescriptor assetFileDescriptor2 = this.f30357g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f30357g = null;
                    if (this.f30360j) {
                        this.f30360j = false;
                        g();
                    }
                    throw th;
                } catch (java.io.IOException e11) {
                    throw new com.google.android.gms.internal.ads.C4491mg0(e11, 2000);
                }
            }
        } catch (java.lang.Throwable th2) {
            this.f30357g = null;
            if (this.f30360j) {
                this.f30360j = false;
                g();
            }
            throw th2;
        }
    }
}
