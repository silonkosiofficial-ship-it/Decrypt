package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Lt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class DialogInterfaceOnClickListenerC2587Lt implements android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ android.webkit.JsPromptResult f29579C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ android.widget.EditText f29580D;

    DialogInterfaceOnClickListenerC2587Lt(android.webkit.JsPromptResult jsPromptResult, android.widget.EditText editText) {
        this.f29579C = jsPromptResult;
        this.f29580D = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i6) {
        this.f29579C.confirm(this.f29580D.getText().toString());
    }
}
