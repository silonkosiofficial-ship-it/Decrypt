package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5198t4 implements com.google.android.gms.internal.ads.InterfaceC5520w0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5520w0 f38854C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4869q4 f38855D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final android.util.SparseArray f38856E = new android.util.SparseArray();

    public C5198t4(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0, com.google.android.gms.internal.ads.InterfaceC4869q4 interfaceC4869q4) {
        this.f38854C = interfaceC5520w0;
        this.f38855D = interfaceC4869q4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5520w0
    public final void Q() {
        this.f38854C.Q();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5520w0
    public final void R(com.google.android.gms.internal.ads.T0 t6) {
        this.f38854C.R(t6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5520w0
    public final com.google.android.gms.internal.ads.InterfaceC3107a1 S(int i6, int i10) {
        if (i10 != 3) {
            return this.f38854C.S(i6, i10);
        }
        com.google.android.gms.internal.ads.C5418v4 c5418v4 = (com.google.android.gms.internal.ads.C5418v4) this.f38856E.get(i6);
        if (c5418v4 != null) {
            return c5418v4;
        }
        com.google.android.gms.internal.ads.C5418v4 c5418v5 = new com.google.android.gms.internal.ads.C5418v4(this.f38854C.S(i6, 3), this.f38855D);
        this.f38856E.put(i6, c5418v5);
        return c5418v5;
    }
}
