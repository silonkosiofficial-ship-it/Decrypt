package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4300kv implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f37027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f37028b;

    public C4300kv(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1) {
        this.f37027a = interfaceC5078rz0;
        this.f37028b = interfaceC5078rz1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        try {
            return W3.e.a(((com.google.android.gms.internal.ads.C3204av) this.f37027a).a()).f(((android.content.pm.ApplicationInfo) this.f37028b.b()).packageName, 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
