package com.android.billingclient.api;

/* JADX INFO: renamed from: com.android.billingclient.api.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2137f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f24594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.util.List f24595b;

    /* JADX INFO: renamed from: com.android.billingclient.api.f$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f24596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.util.List f24597b;

        /* synthetic */ a(T2.y yVar) {
        }

        public com.android.billingclient.api.C2137f a() {
            java.lang.String str = this.f24596a;
            if (str == null) {
                throw new java.lang.IllegalArgumentException("SKU type must be set");
            }
            if (this.f24597b == null) {
                throw new java.lang.IllegalArgumentException("SKU list must be set");
            }
            com.android.billingclient.api.C2137f c2137f = new com.android.billingclient.api.C2137f();
            c2137f.f24594a = str;
            c2137f.f24595b = this.f24597b;
            return c2137f;
        }

        public com.android.billingclient.api.C2137f.a b(java.util.List list) {
            this.f24597b = new java.util.ArrayList(list);
            return this;
        }

        public com.android.billingclient.api.C2137f.a c(java.lang.String str) {
            this.f24596a = str;
            return this;
        }
    }

    public static com.android.billingclient.api.C2137f.a c() {
        return new com.android.billingclient.api.C2137f.a(null);
    }

    public java.lang.String a() {
        return this.f24594a;
    }

    public java.util.List b() {
        return this.f24595b;
    }
}
