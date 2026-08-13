package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class DialogInterfaceOnCancelListenerC2403Gt implements android.content.DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ android.webkit.JsResult f27912C;

    DialogInterfaceOnCancelListenerC2403Gt(android.webkit.JsResult jsResult) {
        this.f27912C = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.f27912C.cancel();
    }
}
