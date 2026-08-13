package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6188b0 extends com.google.android.gms.internal.play_billing.AbstractC6312w {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.play_billing.AbstractC6206e0 f41518E;

    C6188b0(com.google.android.gms.internal.play_billing.AbstractC6206e0 abstractC6206e0, int i6) {
        super(abstractC6206e0.size(), i6);
        this.f41518E = abstractC6206e0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6312w
    protected final java.lang.Object b(int i6) {
        return this.f41518E.get(i6);
    }
}
