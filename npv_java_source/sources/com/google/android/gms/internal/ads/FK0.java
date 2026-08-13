package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
abstract class FK0 {
    public static boolean a(android.content.Context context) {
        android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) context.getSystemService("display");
        android.view.Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr()) {
            return false;
        }
        for (int i6 : display.getHdrCapabilities().getSupportedHdrTypes()) {
            if (i6 == 1) {
                return true;
            }
        }
        return false;
    }
}
