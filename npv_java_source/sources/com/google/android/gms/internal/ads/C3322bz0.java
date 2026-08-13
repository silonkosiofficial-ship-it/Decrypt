package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3322bz0 implements com.google.android.gms.internal.ads.InterfaceC3213az0, com.google.android.gms.internal.ads.Uy0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.C3322bz0 f34406b = new com.google.android.gms.internal.ads.C3322bz0(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f34407a;

    private C3322bz0(java.lang.Object obj) {
        this.f34407a = obj;
    }

    public static com.google.android.gms.internal.ads.InterfaceC3213az0 a(java.lang.Object obj) {
        com.google.android.gms.internal.ads.AbstractC4089iz0.a(obj, "instance cannot be null");
        return new com.google.android.gms.internal.ads.C3322bz0(obj);
    }

    public static com.google.android.gms.internal.ads.InterfaceC3213az0 c(java.lang.Object obj) {
        return obj == null ? f34406b : new com.google.android.gms.internal.ads.C3322bz0(obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final java.lang.Object b() {
        return this.f34407a;
    }
}
