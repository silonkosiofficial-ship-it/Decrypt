package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ht, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class DialogInterfaceOnClickListenerC2440Ht implements android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ android.webkit.JsResult f28113C;

    DialogInterfaceOnClickListenerC2440Ht(android.webkit.JsResult jsResult) {
        this.f28113C = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i6) {
        this.f28113C.cancel();
    }
}
