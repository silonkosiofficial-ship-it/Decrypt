package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Vu0 extends com.google.android.gms.internal.ads.AbstractC2493Je0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.content.Context f32608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3843gl0 f32609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private android.content.res.AssetFileDescriptor f32610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private java.io.InputStream f32611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f32612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f32613j;

    public Vu0(android.content.Context context) {
        super(false);
        this.f32608e = context.getApplicationContext();
    }

    private static int k(java.lang.String str) throws com.google.android.gms.internal.ads.C5618wu0 {
        try {
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
            throw new com.google.android.gms.internal.ads.C5618wu0("Resource identifier must be an integer.", null, 1004);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c1  */
    private static android.content.res.AssetFileDescriptor l(android.content.Context context, com.google.android.gms.internal.ads.C3843gl0 c3843gl0) throws com.google.android.gms.internal.ads.C5618wu0 {
        java.lang.String path;
        android.content.res.Resources resourcesForApplication;
        int identifier;
        android.content.res.AssetFileDescriptor assetFileDescriptorOpenRawResourceFd;
        android.net.Uri uriNormalizeScheme = c3843gl0.f35675a.normalizeScheme();
        try {
            if (!android.text.TextUtils.equals("rawresource", uriNormalizeScheme.getScheme())) {
                if (!android.text.TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                    throw new com.google.android.gms.internal.ads.C5618wu0("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
                }
                path = uriNormalizeScheme.getPath();
                path.getClass();
                if (path.startsWith("/")) {
                    path = path.substring(1);
                }
                java.lang.String packageName = android.text.TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
                if (packageName.equals(context.getPackageName())) {
                    resourcesForApplication = context.getResources();
                } else {
                    try {
                        resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                    } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
                        throw new com.google.android.gms.internal.ads.C5618wu0("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e6, 2005);
                    }
                }
                if (!path.matches("\\d+")) {
                    identifier = resourcesForApplication.getIdentifier(packageName + ":" + path, "raw", null);
                    if (identifier == 0) {
                        throw new com.google.android.gms.internal.ads.C5618wu0("Resource not found.", null, 2005);
                    }
                }
                assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
                if (assetFileDescriptorOpenRawResourceFd != null) {
                    return assetFileDescriptorOpenRawResourceFd;
                }
                throw new com.google.android.gms.internal.ads.C5618wu0("Resource is compressed: ".concat(java.lang.String.valueOf(uriNormalizeScheme)), null, 2000);
            }
            resourcesForApplication = context.getResources();
            java.util.List<java.lang.String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new com.google.android.gms.internal.ads.C5618wu0("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            path = pathSegments.get(0);
            assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new com.google.android.gms.internal.ads.C5618wu0("Resource is compressed: ".concat(java.lang.String.valueOf(uriNormalizeScheme)), null, 2000);
        } catch (android.content.res.Resources.NotFoundException e10) {
            throw new com.google.android.gms.internal.ads.C5618wu0(null, e10, 2005);
        }
        identifier = k(path);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4884qB0
    public final int H(byte[] bArr, int i6, int i10) throws com.google.android.gms.internal.ads.C5618wu0 {
        if (i10 == 0) {
            return 0;
        }
        long j6 = this.f32612i;
        if (j6 == 0) {
            return -1;
        }
        if (j6 != -1) {
            try {
                i10 = (int) java.lang.Math.min(j6, i10);
            } catch (java.io.IOException e6) {
                throw new com.google.android.gms.internal.ads.C5618wu0(null, e6, 2000);
            }
        }
        java.io.InputStream inputStream = this.f32611h;
        int i11 = com.google.android.gms.internal.ads.EW.f27061a;
        int i12 = inputStream.read(bArr, i6, i10);
        if (i12 == -1) {
            if (this.f32612i == -1) {
                return -1;
            }
            throw new com.google.android.gms.internal.ads.C5618wu0("End of stream reached having not read sufficient data.", new java.io.EOFException(), 2000);
        }
        long j10 = this.f32612i;
        if (j10 != -1) {
            this.f32612i = j10 - ((long) i12);
        }
        D(i12);
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final long a(com.google.android.gms.internal.ads.C3843gl0 c3843gl0) throws com.google.android.gms.internal.ads.C5618wu0 {
        long size;
        this.f32609f = c3843gl0;
        h(c3843gl0);
        android.content.res.AssetFileDescriptor assetFileDescriptorL = l(this.f32608e, c3843gl0);
        this.f32610g = assetFileDescriptorL;
        long length = assetFileDescriptorL.getLength();
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(this.f32610g.getFileDescriptor());
        this.f32611h = fileInputStream;
        if (length != -1) {
            try {
                if (c3843gl0.f35679e > length) {
                    throw new com.google.android.gms.internal.ads.C5618wu0(null, null, 2008);
                }
            } catch (com.google.android.gms.internal.ads.C5618wu0 e6) {
                throw e6;
            } catch (java.io.IOException e10) {
                throw new com.google.android.gms.internal.ads.C5618wu0(null, e10, 2000);
            }
        }
        long startOffset = this.f32610g.getStartOffset();
        long jSkip = fileInputStream.skip(c3843gl0.f35679e + startOffset) - startOffset;
        if (jSkip != c3843gl0.f35679e) {
            throw new com.google.android.gms.internal.ads.C5618wu0(null, null, 2008);
        }
        if (length == -1) {
            java.nio.channels.FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.f32612i = -1L;
                size = -1;
            } else {
                size = channel.size() - channel.position();
                this.f32612i = size;
                if (size < 0) {
                    throw new com.google.android.gms.internal.ads.C5618wu0(null, null, 2008);
                }
            }
        } else {
            size = length - jSkip;
            this.f32612i = size;
            if (size < 0) {
                throw new com.google.android.gms.internal.ads.C2722Pi0(2008);
            }
        }
        long jMin = c3843gl0.f35680f;
        if (jMin != -1) {
            if (size != -1) {
                jMin = java.lang.Math.min(size, jMin);
            }
            this.f32612i = jMin;
        }
        this.f32613j = true;
        i(c3843gl0);
        long j6 = c3843gl0.f35680f;
        return j6 != -1 ? j6 : this.f32612i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final android.net.Uri c() {
        com.google.android.gms.internal.ads.C3843gl0 c3843gl0 = this.f32609f;
        if (c3843gl0 != null) {
            return c3843gl0.f35675a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final void f() {
        this.f32609f = null;
        try {
            try {
                try {
                    java.io.InputStream inputStream = this.f32611h;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    this.f32611h = null;
                    try {
                        android.content.res.AssetFileDescriptor assetFileDescriptor = this.f32610g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.f32610g = null;
                        if (this.f32613j) {
                            this.f32613j = false;
                            g();
                        }
                    } catch (java.io.IOException e6) {
                        throw new com.google.android.gms.internal.ads.C5618wu0(null, e6, 2000);
                    }
                } catch (java.io.IOException e10) {
                    throw new com.google.android.gms.internal.ads.C5618wu0(null, e10, 2000);
                }
            } catch (java.lang.Throwable th) {
                this.f32611h = null;
                try {
                    android.content.res.AssetFileDescriptor assetFileDescriptor2 = this.f32610g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f32610g = null;
                    if (this.f32613j) {
                        this.f32613j = false;
                        g();
                    }
                    throw th;
                } catch (java.io.IOException e11) {
                    throw new com.google.android.gms.internal.ads.C5618wu0(null, e11, 2000);
                }
            }
        } catch (java.lang.Throwable th2) {
            this.f32610g = null;
            if (this.f32613j) {
                this.f32613j = false;
                g();
            }
            throw th2;
        }
    }
}
