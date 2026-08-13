package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3277bc0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.C3277bc0 f34349b = new com.google.android.gms.internal.ads.C3277bc0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f34350a;

    private C3277bc0() {
    }

    public static com.google.android.gms.internal.ads.C3277bc0 b() {
        return f34349b;
    }

    public final android.content.Context a() {
        return this.f34350a;
    }

    public final void c(android.content.Context context) {
        this.f34350a = context != null ? context.getApplicationContext() : null;
    }
}
