package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Py0 extends com.google.android.gms.internal.ads.Sy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.util.logging.Logger f30847a;

    public Py0(java.lang.String str) {
        this.f30847a = java.util.logging.Logger.getLogger(str);
    }

    @Override // com.google.android.gms.internal.ads.Sy0
    public final void a(java.lang.String str) {
        this.f30847a.logp(java.util.logging.Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
