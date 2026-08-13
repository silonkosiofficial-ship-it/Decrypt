package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Hf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2421Hf0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.C3175ag0 f28084c = new com.google.android.gms.internal.ads.C3175ag0("OverlayDisplayService");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final android.content.Intent f28085d = new android.content.Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f28086e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.android.gms.internal.ads.C3079Zf0 f28087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f28088b;

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.Df0] */
    C2421Hf0(android.content.Context context) {
        this.f28087a = com.google.android.gms.internal.ads.AbstractC3394cg0.a(context) ? new com.google.android.gms.internal.ads.C3079Zf0(context.getApplicationContext(), f28084c, "OverlayDisplayService", f28085d, new java.lang.Object() { // from class: com.google.android.gms.internal.ads.Df0
        }) : null;
        this.f28088b = context.getPackageName();
    }

    static /* synthetic */ boolean h(java.lang.String str) {
        return !k(str);
    }

    private static void i(java.lang.String str, java.util.function.Consumer consumer) {
        if (k(str)) {
            return;
        }
        str.getClass();
        consumer.accept(str.trim());
    }

    private static boolean j(com.google.android.gms.internal.ads.InterfaceC2642Nf0 interfaceC2642Nf0, java.lang.String str, java.util.List list) {
        if (j$.util.Collection.EL.stream(list).anyMatch(new java.util.function.Predicate() { // from class: com.google.android.gms.internal.ads.Ef0
            public /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
                return j$.util.function.Predicate$CC.$default$and(this, predicate);
            }

            public /* synthetic */ java.util.function.Predicate negate() {
                return j$.util.function.Predicate$CC.$default$negate(this);
            }

            public /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
                return j$.util.function.Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.C2421Hf0.h((java.lang.String) obj);
            }
        })) {
            return true;
        }
        f28084c.a(str, new java.lang.Object[0]);
        com.google.android.gms.internal.ads.AbstractC2532Kf0 abstractC2532Kf0C = com.google.android.gms.internal.ads.AbstractC2605Mf0.c();
        abstractC2532Kf0C.b(8160);
        interfaceC2642Nf0.a(abstractC2532Kf0C.c());
        return false;
    }

    private static boolean k(java.lang.String str) {
        return com.google.android.gms.internal.ads.AbstractC2829Sg0.c(str).trim().isEmpty();
    }

    final void a() {
        if (this.f28087a == null) {
            return;
        }
        f28084c.c("unbind LMD display overlay service", new java.lang.Object[0]);
        this.f28087a.n();
    }

    final void b(final com.google.android.gms.internal.ads.AbstractC4709of0 abstractC4709of0, final com.google.android.gms.internal.ads.InterfaceC2642Nf0 interfaceC2642Nf0) {
        if (this.f28087a == null) {
            f28084c.a("error: %s", "Play Store not found.");
        } else if (j(interfaceC2642Nf0, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", java.util.Arrays.asList(abstractC4709of0.b(), abstractC4709of0.a()))) {
            this.f28087a.i(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.xf0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39893C.c(abstractC4709of0, interfaceC2642Nf0);
                }
            });
        }
    }

    final /* synthetic */ void c(com.google.android.gms.internal.ads.AbstractC4709of0 abstractC4709of0, com.google.android.gms.internal.ads.InterfaceC2642Nf0 interfaceC2642Nf0) {
        try {
            com.google.android.gms.internal.ads.C3079Zf0 c3079Zf0 = this.f28087a;
            if (c3079Zf0 == null) {
                throw null;
            }
            com.google.android.gms.internal.ads.InterfaceC3005Xe0 interfaceC3005Xe0 = (com.google.android.gms.internal.ads.InterfaceC3005Xe0) c3079Zf0.c();
            if (interfaceC3005Xe0 == null) {
                return;
            }
            java.lang.String str = this.f28088b;
            final android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("callerPackage", str);
            i(abstractC4709of0.b(), new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.Af0
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    int i6 = com.google.android.gms.internal.ads.C2421Hf0.f28086e;
                    bundle.putString("sessionToken", (java.lang.String) obj);
                }

                public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                    return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
                }
            });
            i(abstractC4709of0.a(), new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.Bf0
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    int i6 = com.google.android.gms.internal.ads.C2421Hf0.f28086e;
                    bundle.putString("appId", (java.lang.String) obj);
                }

                public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                    return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
                }
            });
            interfaceC3005Xe0.Z3(bundle, new com.google.android.gms.internal.ads.BinderC2384Gf0(this, interfaceC2642Nf0));
        } catch (android.os.RemoteException e6) {
            f28084c.b(e6, "dismiss overlay display from: %s", this.f28088b);
        }
    }

    final /* synthetic */ void d(com.google.android.gms.internal.ads.AbstractC2495Jf0 abstractC2495Jf0, com.google.android.gms.internal.ads.InterfaceC2642Nf0 interfaceC2642Nf0) {
        try {
            com.google.android.gms.internal.ads.C3079Zf0 c3079Zf0 = this.f28087a;
            if (c3079Zf0 == null) {
                throw null;
            }
            com.google.android.gms.internal.ads.InterfaceC3005Xe0 interfaceC3005Xe0 = (com.google.android.gms.internal.ads.InterfaceC3005Xe0) c3079Zf0.c();
            if (interfaceC3005Xe0 == null) {
                return;
            }
            java.lang.String str = this.f28088b;
            final android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("callerPackage", str);
            bundle.putBinder("windowToken", abstractC2495Jf0.f());
            i(abstractC2495Jf0.g(), new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.Ff0
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    int i6 = com.google.android.gms.internal.ads.C2421Hf0.f28086e;
                    bundle.putString("adFieldEnifd", (java.lang.String) obj);
                }

                public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                    return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
                }
            });
            bundle.putInt("layoutGravity", abstractC2495Jf0.c());
            bundle.putFloat("layoutVerticalMargin", abstractC2495Jf0.a());
            bundle.putInt("displayMode", 0);
            bundle.putInt("triggerMode", 0);
            bundle.putInt("windowWidthPx", abstractC2495Jf0.e());
            i(null, new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.tf0
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    int i6 = com.google.android.gms.internal.ads.C2421Hf0.f28086e;
                    bundle.putString("deeplinkUrl", (java.lang.String) obj);
                }

                public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                    return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
                }
            });
            i(null, new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.uf0
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    int i6 = com.google.android.gms.internal.ads.C2421Hf0.f28086e;
                    bundle.putString("sessionToken", (java.lang.String) obj);
                }

                public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                    return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
                }
            });
            i(abstractC2495Jf0.h(), new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.vf0
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    int i6 = com.google.android.gms.internal.ads.C2421Hf0.f28086e;
                    bundle.putString("appId", (java.lang.String) obj);
                }

                public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                    return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
                }
            });
            i(null, new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.wf0
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    int i6 = com.google.android.gms.internal.ads.C2421Hf0.f28086e;
                    bundle.putString("thirdPartyAuthCallerId", (java.lang.String) obj);
                }

                public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                    return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
                }
            });
            bundle.putBoolean("stableSessionToken", true);
            interfaceC3005Xe0.e5(str, bundle, new com.google.android.gms.internal.ads.BinderC2384Gf0(this, interfaceC2642Nf0));
        } catch (android.os.RemoteException e6) {
            f28084c.b(e6, "show overlay display from: %s", this.f28088b);
        }
    }

    final /* synthetic */ void e(com.google.android.gms.internal.ads.AbstractC2716Pf0 abstractC2716Pf0, int i6, com.google.android.gms.internal.ads.InterfaceC2642Nf0 interfaceC2642Nf0) {
        try {
            com.google.android.gms.internal.ads.C3079Zf0 c3079Zf0 = this.f28087a;
            if (c3079Zf0 == null) {
                throw null;
            }
            com.google.android.gms.internal.ads.InterfaceC3005Xe0 interfaceC3005Xe0 = (com.google.android.gms.internal.ads.InterfaceC3005Xe0) c3079Zf0.c();
            if (interfaceC3005Xe0 == null) {
                return;
            }
            java.lang.String str = this.f28088b;
            final android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("callerPackage", str);
            bundle.putInt("displayMode", i6);
            i(abstractC2716Pf0.b(), new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.sf0
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    int i10 = com.google.android.gms.internal.ads.C2421Hf0.f28086e;
                    bundle.putString("sessionToken", (java.lang.String) obj);
                }

                public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                    return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
                }
            });
            i(abstractC2716Pf0.a(), new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.yf0
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    int i10 = com.google.android.gms.internal.ads.C2421Hf0.f28086e;
                    bundle.putString("appId", (java.lang.String) obj);
                }

                public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                    return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
                }
            });
            interfaceC3005Xe0.v2(bundle, new com.google.android.gms.internal.ads.BinderC2384Gf0(this, interfaceC2642Nf0));
        } catch (android.os.RemoteException e6) {
            f28084c.b(e6, "switchDisplayMode overlay display to %d from: %s", java.lang.Integer.valueOf(i6), this.f28088b);
        }
    }

    final void f(final com.google.android.gms.internal.ads.AbstractC2495Jf0 abstractC2495Jf0, final com.google.android.gms.internal.ads.InterfaceC2642Nf0 interfaceC2642Nf0) {
        if (this.f28087a == null) {
            f28084c.a("error: %s", "Play Store not found.");
        } else if (j(interfaceC2642Nf0, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", java.util.Arrays.asList(null, abstractC2495Jf0.h()))) {
            this.f28087a.i(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Cf0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26269C.d(abstractC2495Jf0, interfaceC2642Nf0);
                }
            });
        }
    }

    final void g(final com.google.android.gms.internal.ads.AbstractC2716Pf0 abstractC2716Pf0, final com.google.android.gms.internal.ads.InterfaceC2642Nf0 interfaceC2642Nf0, final int i6) {
        if (this.f28087a == null) {
            f28084c.a("error: %s", "Play Store not found.");
        } else if (j(interfaceC2642Nf0, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", java.util.Arrays.asList(abstractC2716Pf0.b(), abstractC2716Pf0.a()))) {
            this.f28087a.i(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zf0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40340C.e(abstractC2716Pf0, i6, interfaceC2642Nf0);
                }
            });
        }
    }
}
