package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6192b4 implements com.google.android.gms.internal.play_billing.N2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final com.google.android.gms.internal.play_billing.N2 f41522a = new com.google.android.gms.internal.play_billing.C6192b4();

    private C6192b4() {
    }

    @Override // com.google.android.gms.internal.play_billing.N2
    public final boolean r(int i6) {
        com.google.android.gms.internal.play_billing.EnumC6198c4 enumC6198c4;
        if (i6 == 0) {
            enumC6198c4 = com.google.android.gms.internal.play_billing.EnumC6198c4.BROADCAST_ACTION_UNSPECIFIED;
        } else if (i6 == 1) {
            enumC6198c4 = com.google.android.gms.internal.play_billing.EnumC6198c4.PURCHASES_UPDATED_ACTION;
        } else if (i6 != 2) {
            enumC6198c4 = i6 != 3 ? null : com.google.android.gms.internal.play_billing.EnumC6198c4.ALTERNATIVE_BILLING_ACTION;
        } else {
            enumC6198c4 = com.google.android.gms.internal.play_billing.EnumC6198c4.LOCAL_PURCHASES_UPDATED_ACTION;
        }
        return enumC6198c4 != null;
    }
}
