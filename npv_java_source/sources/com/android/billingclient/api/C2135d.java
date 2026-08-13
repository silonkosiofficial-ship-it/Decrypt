package com.android.billingclient.api;

/* JADX INFO: renamed from: com.android.billingclient.api.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2135d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.String f24587b;

    /* JADX INFO: renamed from: com.android.billingclient.api.d$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f24588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.String f24589b = "";

        /* synthetic */ a(T2.s sVar) {
        }

        public com.android.billingclient.api.C2135d a() {
            com.android.billingclient.api.C2135d c2135d = new com.android.billingclient.api.C2135d();
            c2135d.f24586a = this.f24588a;
            c2135d.f24587b = this.f24589b;
            return c2135d;
        }

        public com.android.billingclient.api.C2135d.a b(java.lang.String str) {
            this.f24589b = str;
            return this;
        }

        public com.android.billingclient.api.C2135d.a c(int i6) {
            this.f24588a = i6;
            return this;
        }
    }

    public static com.android.billingclient.api.C2135d.a c() {
        return new com.android.billingclient.api.C2135d.a(null);
    }

    public java.lang.String a() {
        return this.f24587b;
    }

    public int b() {
        return this.f24586a;
    }

    public java.lang.String toString() {
        return "Response Code: " + com.google.android.gms.internal.play_billing.AbstractC6195c1.g(this.f24586a) + ", Debug Message: " + this.f24587b;
    }
}
