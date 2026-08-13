package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class DialogInterfaceOnClickListenerC4504mn implements android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4614nn f37417C;

    DialogInterfaceOnClickListenerC4504mn(com.google.android.gms.internal.ads.C4614nn c4614nn) {
        this.f37417C = c4614nn;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i6) {
        this.f37417C.c("Operation denied by user.");
    }
}
