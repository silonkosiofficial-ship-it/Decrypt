package p070h;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final h.e.b f45741h = new h.e.b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f45742a = new java.util.LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f45743b = new java.util.LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Map f45744c = new java.util.LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f45745d = new java.util.ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient java.util.Map f45746e = new java.util.LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.Map f45747f = new java.util.LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final android.os.Bundle f45748g = new android.os.Bundle();

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p070h.b f45749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p080i.a f45750b;

        public a(p070h.b bVar, p080i.a aVar) {
            p247y7.AbstractC7350t.f(bVar, "callback");
            p247y7.AbstractC7350t.f(aVar, "contract");
            this.f45749a = bVar;
            this.f45750b = aVar;
        }

        public final p070h.b a() {
            return this.f45749a;
        }

        public final p080i.a b() {
            return this.f45750b;
        }
    }

    private static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.lifecycle.AbstractC2079k f45751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.util.List f45752b;

        public c(androidx.lifecycle.AbstractC2079k abstractC2079k) {
            p247y7.AbstractC7350t.f(abstractC2079k, "lifecycle");
            this.f45751a = abstractC2079k;
            this.f45752b = new java.util.ArrayList();
        }

        public final void a(androidx.lifecycle.InterfaceC2083o interfaceC2083o) {
            p247y7.AbstractC7350t.f(interfaceC2083o, "observer");
            this.f45751a.a(interfaceC2083o);
            this.f45752b.add(interfaceC2083o);
        }

        public final void b() {
            java.util.Iterator it = this.f45752b.iterator();
            while (it.hasNext()) {
                this.f45751a.d((androidx.lifecycle.InterfaceC2083o) it.next());
            }
            this.f45752b.clear();
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final h.e.d f45753D = new h.e.d();

        d() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Integer b() {
            return java.lang.Integer.valueOf(C7.c.f1373C.c(2147418112) + 65536);
        }
    }

    /* JADX INFO: renamed from: h.e$e, reason: collision with other inner class name */
    public static final class C0525e extends p070h.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.String f45755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p080i.a f45756c;

        C0525e(java.lang.String str, p080i.a aVar) {
            this.f45755b = str;
            this.f45756c = aVar;
        }

        @Override // p070h.c
        public void b(java.lang.Object obj, androidx.core.app.c cVar) throws java.lang.Exception {
            java.lang.Object obj2 = p070h.e.this.f45743b.get(this.f45755b);
            p080i.a aVar = this.f45756c;
            if (obj2 != null) {
                int iIntValue = ((java.lang.Number) obj2).intValue();
                p070h.e.this.f45745d.add(this.f45755b);
                try {
                    p070h.e.this.i(iIntValue, this.f45756c, obj, cVar);
                    return;
                } catch (java.lang.Exception e6) {
                    p070h.e.this.f45745d.remove(this.f45755b);
                    throw e6;
                }
            }
            throw new java.lang.IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // p070h.c
        public void c() {
            p070h.e.this.p(this.f45755b);
        }
    }

    public static final class f extends p070h.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.String f45758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p080i.a f45759c;

        f(java.lang.String str, p080i.a aVar) {
            this.f45758b = str;
            this.f45759c = aVar;
        }

        @Override // p070h.c
        public void b(java.lang.Object obj, androidx.core.app.c cVar) throws java.lang.Exception {
            java.lang.Object obj2 = p070h.e.this.f45743b.get(this.f45758b);
            p080i.a aVar = this.f45759c;
            if (obj2 != null) {
                int iIntValue = ((java.lang.Number) obj2).intValue();
                p070h.e.this.f45745d.add(this.f45758b);
                try {
                    p070h.e.this.i(iIntValue, this.f45759c, obj, cVar);
                    return;
                } catch (java.lang.Exception e6) {
                    p070h.e.this.f45745d.remove(this.f45758b);
                    throw e6;
                }
            }
            throw new java.lang.IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // p070h.c
        public void c() {
            p070h.e.this.p(this.f45758b);
        }
    }

    private final void d(int i6, java.lang.String str) {
        this.f45742a.put(java.lang.Integer.valueOf(i6), str);
        this.f45743b.put(str, java.lang.Integer.valueOf(i6));
    }

    private final void g(java.lang.String str, int i6, android.content.Intent intent, h.e.a aVar) {
        if ((aVar != null ? aVar.a() : null) == null || !this.f45745d.contains(str)) {
            this.f45747f.remove(str);
            this.f45748g.putParcelable(str, new p070h.a(i6, intent));
        } else {
            aVar.a().a(aVar.b().c(i6, intent));
            this.f45745d.remove(str);
        }
    }

    private final int h() {
        for (java.lang.Number number : R8.k.o(h.e.d.f45753D)) {
            if (!this.f45742a.containsKey(java.lang.Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new java.util.NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(p070h.e eVar, java.lang.String str, p070h.b bVar, p080i.a aVar, androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar2) {
        p247y7.AbstractC7350t.f(eVar, "this$0");
        p247y7.AbstractC7350t.f(str, "$key");
        p247y7.AbstractC7350t.f(bVar, "$callback");
        p247y7.AbstractC7350t.f(aVar, "$contract");
        p247y7.AbstractC7350t.f(rVar, "<anonymous parameter 0>");
        p247y7.AbstractC7350t.f(aVar2, "event");
        if (androidx.lifecycle.AbstractC2079k.a.ON_START != aVar2) {
            if (androidx.lifecycle.AbstractC2079k.a.ON_STOP == aVar2) {
                eVar.f45746e.remove(str);
                return;
            } else {
                if (androidx.lifecycle.AbstractC2079k.a.ON_DESTROY == aVar2) {
                    eVar.p(str);
                    return;
                }
                return;
            }
        }
        eVar.f45746e.put(str, new h.e.a(bVar, aVar));
        if (eVar.f45747f.containsKey(str)) {
            java.lang.Object obj = eVar.f45747f.get(str);
            eVar.f45747f.remove(str);
            bVar.a(obj);
        }
        p070h.a aVar3 = (p070h.a) androidx.core.os.c.a(eVar.f45748g, str, p070h.a.class);
        if (aVar3 != null) {
            eVar.f45748g.remove(str);
            bVar.a(aVar.c(aVar3.b(), aVar3.a()));
        }
    }

    private final void o(java.lang.String str) {
        if (((java.lang.Integer) this.f45743b.get(str)) != null) {
            return;
        }
        d(h(), str);
    }

    public final boolean e(int i6, int i10, android.content.Intent intent) {
        java.lang.String str = (java.lang.String) this.f45742a.get(java.lang.Integer.valueOf(i6));
        if (str == null) {
            return false;
        }
        g(str, i10, intent, (h.e.a) this.f45746e.get(str));
        return true;
    }

    public final boolean f(int i6, java.lang.Object obj) {
        java.lang.String str = (java.lang.String) this.f45742a.get(java.lang.Integer.valueOf(i6));
        if (str == null) {
            return false;
        }
        h.e.a aVar = (h.e.a) this.f45746e.get(str);
        if ((aVar != null ? aVar.a() : null) == null) {
            this.f45748g.remove(str);
            this.f45747f.put(str, obj);
            return true;
        }
        p070h.b bVarA = aVar.a();
        p247y7.AbstractC7350t.d(bVarA, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.f45745d.remove(str)) {
            return true;
        }
        bVarA.a(obj);
        return true;
    }

    public abstract void i(int i6, p080i.a aVar, java.lang.Object obj, androidx.core.app.c cVar);

    public final void j(android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        java.util.ArrayList<java.lang.Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.f45745d.addAll(stringArrayList2);
        }
        android.os.Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle2 != null) {
            this.f45748g.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            java.lang.String str = stringArrayList.get(i6);
            if (this.f45743b.containsKey(str)) {
                java.lang.Integer num = (java.lang.Integer) this.f45743b.remove(str);
                if (!this.f45748g.containsKey(str)) {
                    p247y7.W.d(this.f45742a).remove(num);
                }
            }
            java.lang.Integer num2 = integerArrayList.get(i6);
            p247y7.AbstractC7350t.e(num2, "rcs[i]");
            int iIntValue = num2.intValue();
            java.lang.String str2 = stringArrayList.get(i6);
            p247y7.AbstractC7350t.e(str2, "keys[i]");
            d(iIntValue, str2);
        }
    }

    public final void k(android.os.Bundle bundle) {
        p247y7.AbstractC7350t.f(bundle, "outState");
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new java.util.ArrayList<>(this.f45743b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new java.util.ArrayList<>(this.f45743b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new java.util.ArrayList<>(this.f45745d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new android.os.Bundle(this.f45748g));
    }

    public final p070h.c l(final java.lang.String str, androidx.lifecycle.r rVar, final p080i.a aVar, final p070h.b bVar) {
        p247y7.AbstractC7350t.f(str, "key");
        p247y7.AbstractC7350t.f(rVar, "lifecycleOwner");
        p247y7.AbstractC7350t.f(aVar, "contract");
        p247y7.AbstractC7350t.f(bVar, "callback");
        androidx.lifecycle.AbstractC2079k abstractC2079kU = rVar.u();
        if (!abstractC2079kU.b().g(androidx.lifecycle.AbstractC2079k.b.STARTED)) {
            o(str);
            h.e.c cVar = (h.e.c) this.f45744c.get(str);
            if (cVar == null) {
                cVar = new h.e.c(abstractC2079kU);
            }
            cVar.a(new androidx.lifecycle.InterfaceC2083o() { // from class: h.d
                @Override // androidx.lifecycle.InterfaceC2083o
                public final void i(androidx.lifecycle.r rVar2, androidx.lifecycle.AbstractC2079k.a aVar2) {
                    p070h.e.n(this.f45737C, str, bVar, aVar, rVar2, aVar2);
                }
            });
            this.f45744c.put(str, cVar);
            return new p070h.e.C0525e(str, aVar);
        }
        throw new java.lang.IllegalStateException(("LifecycleOwner " + rVar + " is attempting to register while current state is " + abstractC2079kU.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
    }

    public final p070h.c m(java.lang.String str, p080i.a aVar, p070h.b bVar) {
        p247y7.AbstractC7350t.f(str, "key");
        p247y7.AbstractC7350t.f(aVar, "contract");
        p247y7.AbstractC7350t.f(bVar, "callback");
        o(str);
        this.f45746e.put(str, new h.e.a(bVar, aVar));
        if (this.f45747f.containsKey(str)) {
            java.lang.Object obj = this.f45747f.get(str);
            this.f45747f.remove(str);
            bVar.a(obj);
        }
        p070h.a aVar2 = (p070h.a) androidx.core.os.c.a(this.f45748g, str, p070h.a.class);
        if (aVar2 != null) {
            this.f45748g.remove(str);
            bVar.a(aVar.c(aVar2.b(), aVar2.a()));
        }
        return new h.e.f(str, aVar);
    }

    public final void p(java.lang.String str) {
        java.lang.Integer num;
        p247y7.AbstractC7350t.f(str, "key");
        if (!this.f45745d.contains(str) && (num = (java.lang.Integer) this.f45743b.remove(str)) != null) {
            this.f45742a.remove(num);
        }
        this.f45746e.remove(str);
        if (this.f45747f.containsKey(str)) {
            java.lang.String str2 = "Dropping pending result for request " + str + ": " + this.f45747f.get(str);
            this.f45747f.remove(str);
        }
        if (this.f45748g.containsKey(str)) {
            java.lang.String str3 = "Dropping pending result for request " + str + ": " + ((p070h.a) androidx.core.os.c.a(this.f45748g, str, p070h.a.class));
            this.f45748g.remove(str);
        }
        h.e.c cVar = (h.e.c) this.f45744c.get(str);
        if (cVar != null) {
            cVar.b();
            this.f45744c.remove(str);
        }
    }
}
