package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3253bJ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4382lh f34270a;

    public C3253bJ(com.google.android.gms.internal.ads.LI li) {
        this.f34270a = li;
    }

    public final synchronized com.google.android.gms.internal.ads.InterfaceC4382lh a() {
        return this.f34270a;
    }

    public final synchronized void b(com.google.android.gms.internal.ads.InterfaceC4382lh interfaceC4382lh) {
        this.f34270a = interfaceC4382lh;
    }
}
