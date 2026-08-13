package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
enum EnumC6278q0 {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);


    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final com.google.android.gms.internal.play_billing.AbstractC6224h0 f41634S;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f41636C;

    static {
        com.google.android.gms.internal.play_billing.C6218g0 c6218g0 = new com.google.android.gms.internal.play_billing.C6218g0();
        for (com.google.android.gms.internal.play_billing.EnumC6278q0 enumC6278q0 : values()) {
            c6218g0.a(java.lang.Integer.valueOf(enumC6278q0.f41636C), enumC6278q0);
        }
        f41634S = c6218g0.b();
    }

    EnumC6278q0(int i6) {
        this.f41636C = i6;
    }

    static com.google.android.gms.internal.play_billing.EnumC6278q0 e(int i6) {
        com.google.android.gms.internal.play_billing.AbstractC6224h0 abstractC6224h0 = f41634S;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i6);
        return !abstractC6224h0.containsKey(numValueOf) ? RESPONSE_CODE_UNSPECIFIED : (com.google.android.gms.internal.play_billing.EnumC6278q0) abstractC6224h0.get(numValueOf);
    }
}
