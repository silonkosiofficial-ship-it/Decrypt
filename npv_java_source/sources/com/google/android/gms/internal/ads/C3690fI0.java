package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3690fI0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.util.SparseBooleanArray f35320a = new android.util.SparseBooleanArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f35321b;

    public final com.google.android.gms.internal.ads.C3690fI0 a(int i6) {
        com.google.android.gms.internal.ads.LC.f(!this.f35321b);
        this.f35320a.append(i6, true);
        return this;
    }

    public final com.google.android.gms.internal.ads.C3692fJ0 b() {
        com.google.android.gms.internal.ads.LC.f(!this.f35321b);
        this.f35321b = true;
        return new com.google.android.gms.internal.ads.C3692fJ0(this.f35320a, null);
    }
}
