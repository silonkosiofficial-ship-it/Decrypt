package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class U4 extends com.google.android.gms.internal.play_billing.R4 {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.play_billing.V4 f41490J;

    U4(com.google.android.gms.internal.play_billing.V4 v6) {
        this.f41490J = v6;
    }

    @Override // com.google.android.gms.internal.play_billing.R4
    protected final java.lang.String a() {
        com.google.android.gms.internal.play_billing.S4 s6 = (com.google.android.gms.internal.play_billing.S4) this.f41490J.f41491C.get();
        if (s6 == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + java.lang.String.valueOf(s6.f41464a) + "]";
    }
}
