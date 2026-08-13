package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3535dw0 implements com.google.android.gms.internal.ads.InterfaceC4303kw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4303kw0[] f34860a;

    C3535dw0(com.google.android.gms.internal.ads.InterfaceC4303kw0... interfaceC4303kw0Arr) {
        this.f34860a = interfaceC4303kw0Arr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4303kw0
    public final com.google.android.gms.internal.ads.InterfaceC4083iw0 b(java.lang.Class cls) {
        for (int i6 = 0; i6 < 2; i6++) {
            com.google.android.gms.internal.ads.InterfaceC4303kw0 interfaceC4303kw0 = this.f34860a[i6];
            if (interfaceC4303kw0.c(cls)) {
                return interfaceC4303kw0.b(cls);
            }
        }
        throw new java.lang.UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4303kw0
    public final boolean c(java.lang.Class cls) {
        for (int i6 = 0; i6 < 2; i6++) {
            if (this.f34860a[i6].c(cls)) {
                return true;
            }
        }
        return false;
    }
}
