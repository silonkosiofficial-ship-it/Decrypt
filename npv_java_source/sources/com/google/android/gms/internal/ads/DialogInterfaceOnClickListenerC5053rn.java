package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class DialogInterfaceOnClickListenerC5053rn implements android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ java.lang.String f38557C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ java.lang.String f38558D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C5273tn f38559E;

    DialogInterfaceOnClickListenerC5053rn(com.google.android.gms.internal.ads.C5273tn c5273tn, java.lang.String str, java.lang.String str2) {
        this.f38557C = str;
        this.f38558D = str2;
        this.f38559E = c5273tn;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i6) {
        android.app.DownloadManager downloadManager = (android.app.DownloadManager) this.f38559E.f39031d.getSystemService("download");
        try {
            java.lang.String str = this.f38557C;
            java.lang.String str2 = this.f38558D;
            android.app.DownloadManager.Request request = new android.app.DownloadManager.Request(android.net.Uri.parse(str));
            request.setDestinationInExternalPublicDir(android.os.Environment.DIRECTORY_PICTURES, str2);
            p174r3.v.t();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (java.lang.IllegalStateException unused) {
            this.f38559E.c("Could not store picture.");
        }
    }
}
