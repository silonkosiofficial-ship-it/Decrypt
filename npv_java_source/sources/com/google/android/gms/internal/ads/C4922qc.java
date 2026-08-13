package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4922qc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    java.io.ByteArrayOutputStream f38289a = new java.io.ByteArrayOutputStream(4096);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    android.util.Base64OutputStream f38290b = new android.util.Base64OutputStream(this.f38289a, 10);

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String toString() {
        java.lang.String string;
        try {
            this.f38290b.close();
        } catch (java.io.IOException e6) {
            p224w3.p.e("HashManager: Unable to convert to Base64.", e6);
        }
        try {
            try {
                this.f38289a.close();
                string = this.f38289a.toString();
            } catch (java.io.IOException e10) {
                p224w3.p.e("HashManager: Unable to convert to Base64.", e10);
                string = "";
            }
            return string;
        } finally {
            this.f38289a = null;
            this.f38290b = null;
        }
    }
}
