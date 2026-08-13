package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class I2 implements com.google.android.gms.internal.play_billing.InterfaceC6221g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.play_billing.I2 f41419a = new com.google.android.gms.internal.play_billing.I2();

    private I2() {
    }

    public static com.google.android.gms.internal.play_billing.I2 a() {
        return f41419a;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6221g3
    public final com.google.android.gms.internal.play_billing.InterfaceC6215f3 b(java.lang.Class cls) {
        if (!com.google.android.gms.internal.play_billing.L2.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (com.google.android.gms.internal.play_billing.InterfaceC6215f3) com.google.android.gms.internal.play_billing.L2.o(cls.asSubclass(com.google.android.gms.internal.play_billing.L2.class)).j(3, null, null);
        } catch (java.lang.Exception e6) {
            throw new java.lang.RuntimeException("Unable to get message info for ".concat(cls.getName()), e6);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6221g3
    public final boolean c(java.lang.Class cls) {
        return com.google.android.gms.internal.play_billing.L2.class.isAssignableFrom(cls);
    }
}
