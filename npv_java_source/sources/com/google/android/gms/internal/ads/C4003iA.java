package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4003iA implements com.google.android.gms.internal.ads.InterfaceC4111jA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f36235a;

    C4003iA(java.util.Map map) {
        this.f36235a = map;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111jA
    public final com.google.android.gms.internal.ads.VT f(int i6, java.lang.String str) {
        return (com.google.android.gms.internal.ads.VT) this.f36235a.get(str);
    }
}
