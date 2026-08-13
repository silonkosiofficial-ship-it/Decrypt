package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.df0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3502df0 extends com.google.android.gms.internal.ads.AbstractC2458If0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.os.IBinder f34762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.String f34763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f34765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f34766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.lang.String f34767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte f34768g;

    C3502df0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2458If0
    public final com.google.android.gms.internal.ads.AbstractC2458If0 a(java.lang.String str) {
        this.f34767f = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2458If0
    public final com.google.android.gms.internal.ads.AbstractC2458If0 b(java.lang.String str) {
        this.f34763b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2458If0
    public final com.google.android.gms.internal.ads.AbstractC2458If0 c(int i6) {
        this.f34768g = (byte) (this.f34768g | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2458If0
    public final com.google.android.gms.internal.ads.AbstractC2458If0 d(int i6) {
        this.f34764c = i6;
        this.f34768g = (byte) (this.f34768g | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2458If0
    public final com.google.android.gms.internal.ads.AbstractC2458If0 e(float f6) {
        this.f34765d = f6;
        this.f34768g = (byte) (this.f34768g | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2458If0
    public final com.google.android.gms.internal.ads.AbstractC2458If0 f(int i6) {
        this.f34768g = (byte) (this.f34768g | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2458If0
    public final com.google.android.gms.internal.ads.AbstractC2458If0 g(android.os.IBinder iBinder) {
        if (iBinder == null) {
            throw new java.lang.NullPointerException("Null windowToken");
        }
        this.f34762a = iBinder;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2458If0
    public final com.google.android.gms.internal.ads.AbstractC2458If0 h(int i6) {
        this.f34766e = i6;
        this.f34768g = (byte) (this.f34768g | 16);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2458If0
    public final com.google.android.gms.internal.ads.AbstractC2495Jf0 i() {
        android.os.IBinder iBinder;
        if (this.f34768g == 31 && (iBinder = this.f34762a) != null) {
            return new com.google.android.gms.internal.ads.C3721ff0(iBinder, this.f34763b, this.f34764c, this.f34765d, 0, 0, null, this.f34766e, null, this.f34767f, null, null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.f34762a == null) {
            sb.append(" windowToken");
        }
        if ((this.f34768g & 1) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.f34768g & 2) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.f34768g & 4) == 0) {
            sb.append(" displayMode");
        }
        if ((this.f34768g & 8) == 0) {
            sb.append(" triggerMode");
        }
        if ((this.f34768g & 16) == 0) {
            sb.append(" windowWidthPx");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
