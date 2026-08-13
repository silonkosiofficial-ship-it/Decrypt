package com.android.billingclient.api;

/* JADX INFO: renamed from: com.android.billingclient.api.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2136e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f24590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f24591b;

    /* JADX INFO: renamed from: com.android.billingclient.api.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f24592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f24593b;

        private a() {
        }

        public com.android.billingclient.api.C2136e a() {
            if (!this.f24592a) {
                throw new java.lang.IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            return new com.android.billingclient.api.C2136e(true, this.f24593b);
        }

        public com.android.billingclient.api.C2136e.a b() {
            this.f24592a = true;
            return this;
        }
    }

    private C2136e(boolean z6, boolean z10) {
        this.f24590a = z6;
        this.f24591b = z10;
    }

    public static com.android.billingclient.api.C2136e.a c() {
        return new com.android.billingclient.api.C2136e.a();
    }

    boolean a() {
        return this.f24590a;
    }

    boolean b() {
        return this.f24591b;
    }
}
