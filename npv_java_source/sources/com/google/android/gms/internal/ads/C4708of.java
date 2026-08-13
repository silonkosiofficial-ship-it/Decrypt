package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.of, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4708of extends java.io.IOException {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean f37845C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f37846D;

    protected C4708of(java.lang.String str, java.lang.Throwable th, boolean z6, int i6) {
        super(str, th);
        this.f37845C = z6;
        this.f37846D = i6;
    }

    public static com.google.android.gms.internal.ads.C4708of a(java.lang.String str, java.lang.Throwable th) {
        return new com.google.android.gms.internal.ads.C4708of(str, th, true, 1);
    }

    public static com.google.android.gms.internal.ads.C4708of b(java.lang.String str, java.lang.Throwable th) {
        return new com.google.android.gms.internal.ads.C4708of(str, th, true, 0);
    }

    public static com.google.android.gms.internal.ads.C4708of c(java.lang.String str) {
        return new com.google.android.gms.internal.ads.C4708of(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return super.getMessage() + " {contentIsMalformed=" + this.f37845C + ", dataType=" + this.f37846D + "}";
    }
}
