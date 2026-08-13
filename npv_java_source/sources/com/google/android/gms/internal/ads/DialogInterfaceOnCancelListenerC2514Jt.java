package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class DialogInterfaceOnCancelListenerC2514Jt implements android.content.DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ android.webkit.JsPromptResult f28761C;

    DialogInterfaceOnCancelListenerC2514Jt(android.webkit.JsPromptResult jsPromptResult) {
        this.f28761C = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.f28761C.cancel();
    }
}
