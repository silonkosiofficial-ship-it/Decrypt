package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5227tI0 implements com.google.android.gms.internal.ads.KH0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2683Oh0 f38929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5117sI0 f38931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3365cK0 f38932d;

    public C5227tI0(com.google.android.gms.internal.ads.InterfaceC2683Oh0 interfaceC2683Oh0, com.google.android.gms.internal.ads.C5117sI0 c5117sI0) {
        com.google.android.gms.internal.ads.C3365cK0 c3365cK0 = new com.google.android.gms.internal.ads.C3365cK0(-1);
        this.f38929a = interfaceC2683Oh0;
        this.f38931c = c5117sI0;
        this.f38932d = c3365cK0;
        this.f38930b = 1048576;
    }

    public final com.google.android.gms.internal.ads.C5227tI0 a(int i6) {
        this.f38930b = i6;
        return this;
    }

    public final com.google.android.gms.internal.ads.C5447vI0 b(com.google.android.gms.internal.ads.Q7 q10) {
        q10.f30898b.getClass();
        return new com.google.android.gms.internal.ads.C5447vI0(q10, this.f38929a, this.f38931c, com.google.android.gms.internal.ads.XF0.f33102a, this.f38932d, this.f38930b, false, null, null);
    }
}
