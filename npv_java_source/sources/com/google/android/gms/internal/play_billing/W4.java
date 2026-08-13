package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public abstract class W4 {
    public static com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1 a(com.android.billingclient.api.p pVar) {
        com.google.android.gms.internal.play_billing.S4 s6 = new com.google.android.gms.internal.play_billing.S4();
        com.google.android.gms.internal.play_billing.V4 v6 = new com.google.android.gms.internal.play_billing.V4(s6);
        s6.f41465b = v6;
        s6.f41464a = pVar.getClass();
        try {
            s6.f41464a = pVar.a(s6);
        } catch (java.lang.Exception e6) {
            v6.b(e6);
        }
        return v6;
    }
}
