package com.android.billingclient.api;

/* JADX INFO: renamed from: com.android.billingclient.api.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2132a {

    /* JADX INFO: renamed from: com.android.billingclient.api.a$a, reason: collision with other inner class name */
    public static final class C0469a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile com.android.billingclient.api.C2136e f24529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final android.content.Context f24530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile T2.e f24531c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile boolean f24532d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private volatile boolean f24533e;

        /* synthetic */ C0469a(android.content.Context context, T2.B b6) {
            this.f24530b = context;
        }

        private final boolean e() {
            try {
                return this.f24530b.getPackageManager().getApplicationInfo(this.f24530b.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
            } catch (java.lang.Exception e6) {
                com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e6);
                return false;
            }
        }

        public com.android.billingclient.api.AbstractC2132a a() {
            if (this.f24530b == null) {
                throw new java.lang.IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.f24531c == null) {
                if (!this.f24532d && !this.f24533e) {
                    throw new java.lang.IllegalArgumentException("Please provide a valid listener for purchases updates.");
                }
                android.content.Context context = this.f24530b;
                return e() ? new com.android.billingclient.api.w(null, context, null, null) : new com.android.billingclient.api.C2133b(null, context, null, null);
            }
            if (this.f24529a == null || !this.f24529a.a()) {
                throw new java.lang.IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            if (this.f24531c == null) {
                com.android.billingclient.api.C2136e c2136e = this.f24529a;
                android.content.Context context2 = this.f24530b;
                return e() ? new com.android.billingclient.api.w(null, c2136e, context2, null, null, null) : new com.android.billingclient.api.C2133b(null, c2136e, context2, null, null, null);
            }
            com.android.billingclient.api.C2136e c2136e2 = this.f24529a;
            android.content.Context context3 = this.f24530b;
            T2.e eVar = this.f24531c;
            return e() ? new com.android.billingclient.api.w(null, c2136e2, context3, eVar, null, null, null) : new com.android.billingclient.api.C2133b(null, c2136e2, context3, eVar, null, null, null);
        }

        public com.android.billingclient.api.AbstractC2132a.C0469a b() {
            com.android.billingclient.api.C2136e.a aVarC = com.android.billingclient.api.C2136e.c();
            aVarC.b();
            c(aVarC.a());
            return this;
        }

        public com.android.billingclient.api.AbstractC2132a.C0469a c(com.android.billingclient.api.C2136e c2136e) {
            this.f24529a = c2136e;
            return this;
        }

        public com.android.billingclient.api.AbstractC2132a.C0469a d(T2.e eVar) {
            this.f24531c = eVar;
            return this;
        }
    }

    public static com.android.billingclient.api.AbstractC2132a.C0469a d(android.content.Context context) {
        return new com.android.billingclient.api.AbstractC2132a.C0469a(context, null);
    }

    public abstract void a(T2.C1651a c1651a, T2.InterfaceC1652b interfaceC1652b);

    public abstract void b();

    public abstract com.android.billingclient.api.C2135d c(android.app.Activity activity, com.android.billingclient.api.C2134c c2134c);

    public abstract void e(T2.f fVar, T2.d dVar);

    public abstract void f(com.android.billingclient.api.C2137f c2137f, T2.g gVar);

    public abstract void g(T2.c cVar);
}
