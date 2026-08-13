package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.It, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class DialogInterfaceOnClickListenerC2477It implements android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ android.webkit.JsResult f28520C;

    DialogInterfaceOnClickListenerC2477It(android.webkit.JsResult jsResult) {
        this.f28520C = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i6) {
        this.f28520C.confirm();
    }
}
