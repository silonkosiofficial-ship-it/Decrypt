package com.google.android.gms.ads.internal.client;

/* JADX INFO: loaded from: classes.dex */
public class LiteSdkInfo extends p184s3.AbstractBinderC7127r0 {
    public LiteSdkInfo(android.content.Context context) {
    }

    @Override // p184s3.InterfaceC7130s0
    public com.google.android.gms.internal.ads.InterfaceC2945Vl getAdapterCreator() {
        return new com.google.android.gms.internal.ads.BinderC2801Rl();
    }

    @Override // p184s3.InterfaceC7130s0
    public p184s3.C7134t1 getLiteSdkVersion() {
        return new p184s3.C7134t1(com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION, 244410000, "23.6.0");
    }
}
