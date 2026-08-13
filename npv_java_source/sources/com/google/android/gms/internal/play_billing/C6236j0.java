package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6236j0 extends com.google.android.gms.internal.play_billing.AbstractC6318x implements java.io.Serializable {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final com.google.android.gms.internal.play_billing.C6236j0 f41568D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final com.google.android.gms.internal.play_billing.C6236j0 f41569E;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final transient com.google.android.gms.internal.play_billing.AbstractC6206e0 f41570C;

    static {
        int i6 = com.google.android.gms.internal.play_billing.AbstractC6206e0.f41547E;
        f41568D = new com.google.android.gms.internal.play_billing.C6236j0(com.google.android.gms.internal.play_billing.B0.f41326H);
        f41569E = new com.google.android.gms.internal.play_billing.C6236j0(com.google.android.gms.internal.play_billing.AbstractC6206e0.M(com.google.android.gms.internal.play_billing.C6325y0.a()));
    }

    C6236j0(com.google.android.gms.internal.play_billing.AbstractC6206e0 abstractC6206e0) {
        this.f41570C = abstractC6206e0;
    }

    static com.google.android.gms.internal.play_billing.C6236j0 a() {
        return f41569E;
    }

    public static com.google.android.gms.internal.play_billing.C6236j0 b() {
        return f41568D;
    }

    @Override // com.google.android.gms.internal.play_billing.A0
    public final /* bridge */ /* synthetic */ java.util.Set c() {
        return this.f41570C.isEmpty() ? com.google.android.gms.internal.play_billing.H0.f41411K : new com.google.android.gms.internal.play_billing.I0(this.f41570C, com.google.android.gms.internal.play_billing.C6319x0.f41675C);
    }
}
