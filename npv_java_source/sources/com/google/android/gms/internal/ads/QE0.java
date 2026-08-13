package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class QE0 extends java.lang.Exception {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f30948C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f30949D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.D f30950E;

    public QE0(int i6, com.google.android.gms.internal.ads.D d6, boolean z6) {
        super("AudioTrack write failed: " + i6);
        this.f30949D = z6;
        this.f30948C = i6;
        this.f30950E = d6;
    }
}
