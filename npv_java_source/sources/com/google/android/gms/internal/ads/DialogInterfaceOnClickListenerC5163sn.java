package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class DialogInterfaceOnClickListenerC5163sn implements android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C5273tn f38797C;

    DialogInterfaceOnClickListenerC5163sn(com.google.android.gms.internal.ads.C5273tn c5273tn) {
        this.f38797C = c5273tn;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i6) {
        this.f38797C.c("User canceled the download.");
    }
}
