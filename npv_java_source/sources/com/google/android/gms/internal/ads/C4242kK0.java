package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4242kK0 extends java.io.IOException {
    public C4242kK0(java.lang.Throwable th) {
        super("Unexpected " + th.getClass().getSimpleName() + (th.getMessage() != null ? ": ".concat(java.lang.String.valueOf(th.getMessage())) : ""), th);
    }
}
