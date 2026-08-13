package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class JQ implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f28684a;

    public JQ(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0) {
        this.f28684a = interfaceC5078rz0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.lang.String b() {
        java.lang.String packageName = ((com.google.android.gms.internal.ads.C3204av) this.f28684a).a().getPackageName();
        com.google.android.gms.internal.ads.AbstractC4089iz0.b(packageName);
        return packageName;
    }
}
