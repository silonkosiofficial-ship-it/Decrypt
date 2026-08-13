package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Kw0 extends java.lang.RuntimeException {
    public Kw0(com.google.android.gms.internal.ads.InterfaceC4523mw0 interfaceC4523mw0) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final com.google.android.gms.internal.ads.Vv0 a() {
        return new com.google.android.gms.internal.ads.Vv0(getMessage());
    }
}
