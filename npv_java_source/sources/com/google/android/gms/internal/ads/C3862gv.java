package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3862gv implements com.google.android.gms.internal.ads.InterfaceC3213az0 {
    public C3862gv(com.google.android.gms.internal.ads.C2990Wu c2990Wu) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* synthetic */ java.lang.Object b() {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(android.net.Uri.parse("https://play.google.com/d"));
        return intent;
    }
}
