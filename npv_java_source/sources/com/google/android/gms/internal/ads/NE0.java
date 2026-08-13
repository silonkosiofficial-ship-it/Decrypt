package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class NE0 extends java.lang.Exception {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f30203C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f30204D;

    public NE0(int i6, int i10, int i11, int i12, com.google.android.gms.internal.ads.D d6, boolean z6, java.lang.Exception exc) {
        java.lang.String strValueOf = java.lang.String.valueOf(d6);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AudioTrack init failed ");
        sb.append(i6);
        sb.append(" Config(");
        sb.append(i10);
        sb.append(", ");
        sb.append(i11);
        sb.append(", ");
        sb.append(i12);
        sb.append(") ");
        sb.append(strValueOf);
        sb.append(true != z6 ? "" : " (recoverable)");
        super(sb.toString(), exc);
        this.f30203C = i6;
        this.f30204D = z6;
    }
}
