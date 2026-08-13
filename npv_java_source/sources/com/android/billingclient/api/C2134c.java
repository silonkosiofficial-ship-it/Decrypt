package com.android.billingclient.api;

/* JADX INFO: renamed from: com.android.billingclient.api.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2134c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f24566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.String f24567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.String f24568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.android.billingclient.api.C2134c.b f24569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.gms.internal.play_billing.AbstractC6206e0 f24570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.util.ArrayList f24571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f24572g;

    /* JADX INFO: renamed from: com.android.billingclient.api.c$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f24573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.String f24574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.util.List f24575c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private java.util.ArrayList f24576d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f24577e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.android.billingclient.api.C2134c.b.a f24578f;

        /* synthetic */ a(T2.r rVar) {
            com.android.billingclient.api.C2134c.b.a aVarA = com.android.billingclient.api.C2134c.b.a();
            com.android.billingclient.api.C2134c.b.a.b(aVarA);
            this.f24578f = aVarA;
        }

        public com.android.billingclient.api.C2134c a() {
            java.util.ArrayList arrayList = this.f24576d;
            boolean z6 = true;
            boolean z10 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            java.util.List list = this.f24575c;
            boolean z11 = (list == null || list.isEmpty()) ? false : true;
            if (!z10 && !z11) {
                throw new java.lang.IllegalArgumentException("Details of the products must be provided.");
            }
            if (z10 && z11) {
                throw new java.lang.IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            T2.r rVar = null;
            if (!z10) {
                j$.lang.Iterable$EL.forEach(this.f24575c, new java.util.function.Consumer() { // from class: T2.q
                    @Override // java.util.function.Consumer
                    public final void accept(java.lang.Object obj) {
                        androidx.appcompat.app.D.a(obj);
                        throw new java.lang.IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }

                    public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            } else {
                if (this.f24576d.contains(null)) {
                    throw new java.lang.IllegalArgumentException("SKU cannot be null.");
                }
                if (this.f24576d.size() > 1) {
                    com.android.billingclient.api.SkuDetails skuDetails = (com.android.billingclient.api.SkuDetails) this.f24576d.get(0);
                    java.lang.String strD = skuDetails.d();
                    java.util.ArrayList arrayList2 = this.f24576d;
                    int size = arrayList2.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        com.android.billingclient.api.SkuDetails skuDetails2 = (com.android.billingclient.api.SkuDetails) arrayList2.get(i6);
                        if (!strD.equals("play_pass_subs") && !skuDetails2.d().equals("play_pass_subs") && !strD.equals(skuDetails2.d())) {
                            throw new java.lang.IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    java.lang.String strH = skuDetails.h();
                    java.util.ArrayList arrayList3 = this.f24576d;
                    int size2 = arrayList3.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        com.android.billingclient.api.SkuDetails skuDetails3 = (com.android.billingclient.api.SkuDetails) arrayList3.get(i10);
                        if (!strD.equals("play_pass_subs") && !skuDetails3.d().equals("play_pass_subs") && !strH.equals(skuDetails3.h())) {
                            throw new java.lang.IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
            }
            com.android.billingclient.api.C2134c c2134c = new com.android.billingclient.api.C2134c(rVar);
            if (!z10 || ((com.android.billingclient.api.SkuDetails) this.f24576d.get(0)).h().isEmpty()) {
                if (z11) {
                    androidx.appcompat.app.D.a(this.f24575c.get(0));
                    throw null;
                }
                z6 = false;
            }
            c2134c.f24566a = z6;
            c2134c.f24567b = this.f24573a;
            c2134c.f24568c = this.f24574b;
            c2134c.f24569d = this.f24578f.a();
            java.util.ArrayList arrayList4 = this.f24576d;
            c2134c.f24571f = arrayList4 != null ? new java.util.ArrayList(arrayList4) : new java.util.ArrayList();
            c2134c.f24572g = this.f24577e;
            java.util.List list2 = this.f24575c;
            c2134c.f24570e = list2 != null ? com.google.android.gms.internal.play_billing.AbstractC6206e0.D(list2) : com.google.android.gms.internal.play_billing.AbstractC6206e0.E();
            return c2134c;
        }

        public com.android.billingclient.api.C2134c.a b(com.android.billingclient.api.SkuDetails skuDetails) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(skuDetails);
            this.f24576d = arrayList;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.c$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f24579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.String f24580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f24581c = 0;

        /* JADX INFO: renamed from: com.android.billingclient.api.c$b$a */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private java.lang.String f24582a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private java.lang.String f24583b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f24584c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f24585d = 0;

            /* synthetic */ a(T2.r rVar) {
            }

            static /* synthetic */ com.android.billingclient.api.C2134c.b.a b(com.android.billingclient.api.C2134c.b.a aVar) {
                aVar.f24584c = true;
                return aVar;
            }

            public com.android.billingclient.api.C2134c.b a() {
                T2.r rVar = null;
                boolean z6 = (android.text.TextUtils.isEmpty(this.f24582a) && android.text.TextUtils.isEmpty(null)) ? false : true;
                boolean zIsEmpty = true ^ android.text.TextUtils.isEmpty(this.f24583b);
                if (z6 && zIsEmpty) {
                    throw new java.lang.IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f24584c && !z6 && !zIsEmpty) {
                    throw new java.lang.IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                com.android.billingclient.api.C2134c.b bVar = new com.android.billingclient.api.C2134c.b(rVar);
                bVar.f24579a = this.f24582a;
                bVar.f24581c = this.f24585d;
                bVar.f24580b = this.f24583b;
                return bVar;
            }
        }

        /* synthetic */ b(T2.r rVar) {
        }

        public static com.android.billingclient.api.C2134c.b.a a() {
            return new com.android.billingclient.api.C2134c.b.a(null);
        }

        final int b() {
            return this.f24581c;
        }

        final java.lang.String c() {
            return this.f24579a;
        }

        final java.lang.String d() {
            return this.f24580b;
        }
    }

    /* synthetic */ C2134c(T2.r rVar) {
    }

    public static com.android.billingclient.api.C2134c.a a() {
        return new com.android.billingclient.api.C2134c.a(null);
    }

    public final int b() {
        return this.f24569d.b();
    }

    final com.android.billingclient.api.C2135d c() {
        if (this.f24570e.isEmpty()) {
            return com.android.billingclient.api.z.f24659l;
        }
        androidx.appcompat.app.D.a(this.f24570e.get(0));
        if (1 >= this.f24570e.size()) {
            throw null;
        }
        androidx.appcompat.app.D.a(this.f24570e.get(1));
        throw null;
    }

    public final java.lang.String d() {
        return this.f24567b;
    }

    public final java.lang.String e() {
        return this.f24568c;
    }

    public final java.lang.String f() {
        return this.f24569d.c();
    }

    public final java.lang.String g() {
        return this.f24569d.d();
    }

    public final java.util.ArrayList h() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.f24571f);
        return arrayList;
    }

    public final java.util.List i() {
        return this.f24570e;
    }

    public final boolean q() {
        return this.f24572g;
    }

    final boolean r() {
        return (this.f24567b == null && this.f24568c == null && this.f24569d.d() == null && this.f24569d.b() == 0 && !j$.util.Collection.EL.stream(this.f24570e).anyMatch(new java.util.function.Predicate() { // from class: T2.p
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
                androidx.appcompat.app.D.a(obj);
                return false;
            }
        }) && !this.f24566a && !this.f24572g) ? false : true;
    }
}
