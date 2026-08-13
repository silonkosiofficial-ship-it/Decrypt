package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class QG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f30953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2559La0 f30954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p224w3.w f30955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f30956d;

    public QG(com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.C2559La0 c2559La0) {
        this.f30953a = r60.f31190p;
        this.f30954b = c2559La0;
        this.f30955c = r60.f31207x0;
    }

    public final void a() {
        if (this.f30956d) {
            return;
        }
        this.f30954b.e(this.f30953a, this.f30955c);
        this.f30956d = true;
    }
}
