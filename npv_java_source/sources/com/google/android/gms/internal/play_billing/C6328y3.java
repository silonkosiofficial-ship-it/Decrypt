package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6328y3 extends java.lang.RuntimeException {
    public C6328y3(com.google.android.gms.internal.play_billing.InterfaceC6233i3 interfaceC6233i3) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final com.google.android.gms.internal.play_billing.S2 a() {
        return new com.google.android.gms.internal.play_billing.S2(getMessage());
    }
}
