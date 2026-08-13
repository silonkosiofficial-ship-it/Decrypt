package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3014Xj implements Q3.AbstractC1464c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4512mr f33162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3086Zj f33163b;

    C3014Xj(com.google.android.gms.internal.ads.C3086Zj c3086Zj, com.google.android.gms.internal.ads.C4512mr c4512mr) {
        this.f33162a = c4512mr;
        this.f33163b = c3086Zj;
    }

    @Override // Q3.AbstractC1464c.a
    public final void L0(android.os.Bundle bundle) {
        try {
            this.f33162a.c(this.f33163b.f33649a.j0());
        } catch (android.os.DeadObjectException e6) {
            this.f33162a.d(e6);
        }
    }

    @Override // Q3.AbstractC1464c.a
    public final void y0(int i6) {
        this.f33162a.d(new java.lang.RuntimeException("onConnectionSuspended: " + i6));
    }
}
