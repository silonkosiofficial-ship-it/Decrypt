package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6185a3 implements com.google.android.gms.internal.play_billing.InterfaceC6221g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.play_billing.InterfaceC6221g3[] f41517a;

    C6185a3(com.google.android.gms.internal.play_billing.InterfaceC6221g3... interfaceC6221g3Arr) {
        this.f41517a = interfaceC6221g3Arr;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6221g3
    public final com.google.android.gms.internal.play_billing.InterfaceC6215f3 b(java.lang.Class cls) {
        for (int i6 = 0; i6 < 2; i6++) {
            com.google.android.gms.internal.play_billing.InterfaceC6221g3 interfaceC6221g3 = this.f41517a[i6];
            if (interfaceC6221g3.c(cls)) {
                return interfaceC6221g3.b(cls);
            }
        }
        throw new java.lang.UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6221g3
    public final boolean c(java.lang.Class cls) {
        for (int i6 = 0; i6 < 2; i6++) {
            if (this.f41517a[i6].c(cls)) {
                return true;
            }
        }
        return false;
    }
}
