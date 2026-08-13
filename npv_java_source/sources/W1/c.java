package W1;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W1.c f15309a = new W1.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static W1.c.C0293c f15310b = W1.c.C0293c.f15321d;

    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    public interface b {
    }

    /* JADX INFO: renamed from: W1.c$c, reason: collision with other inner class name */
    public static final class C0293c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W1.c.C0293c.a f15320c = new W1.c.C0293c.a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final W1.c.C0293c f15321d = new W1.c.C0293c(p097j7.Z.d(), null, p097j7.S.h());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.Set f15322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.util.Map f15323b;

        /* JADX INFO: renamed from: W1.c$c$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }
        }

        public C0293c(java.util.Set set, W1.c.b bVar, java.util.Map map) {
            p247y7.AbstractC7350t.f(set, "flags");
            p247y7.AbstractC7350t.f(map, "allowedViolations");
            this.f15322a = set;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : map.entrySet()) {
                linkedHashMap.put((java.lang.String) entry.getKey(), (java.util.Set) entry.getValue());
            }
            this.f15323b = linkedHashMap;
        }

        public final java.util.Set a() {
            return this.f15322a;
        }

        public final W1.c.b b() {
            return null;
        }

        public final java.util.Map c() {
            return this.f15323b;
        }
    }

    private c() {
    }

    private final W1.c.C0293c b(androidx.fragment.app.f fVar) {
        while (fVar != null) {
            if (fVar.a0()) {
                androidx.fragment.app.n nVarH = fVar.H();
                p247y7.AbstractC7350t.e(nVarH, "declaringFragment.parentFragmentManager");
                if (nVarH.x0() != null) {
                    W1.c.C0293c c0293cX0 = nVarH.x0();
                    p247y7.AbstractC7350t.c(c0293cX0);
                    return c0293cX0;
                }
            }
            fVar = fVar.G();
        }
        return f15310b;
    }

    private final void c(W1.c.C0293c c0293c, final W1.g gVar) {
        androidx.fragment.app.f fVarA = gVar.a();
        final java.lang.String name = fVarA.getClass().getName();
        if (c0293c.a().contains(W1.c.a.PENALTY_LOG)) {
            java.lang.String str = "Policy violation in " + name;
        }
        c0293c.b();
        if (c0293c.a().contains(W1.c.a.PENALTY_DEATH)) {
            j(fVarA, new java.lang.Runnable() { // from class: W1.b
                @Override // java.lang.Runnable
                public final void run() {
                    W1.c.d(name, gVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(java.lang.String str, W1.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "$violation");
        java.lang.String str2 = "Policy violation with PENALTY_DEATH in " + str;
        throw gVar;
    }

    private final void e(W1.g gVar) {
        if (androidx.fragment.app.n.E0(3)) {
            java.lang.String str = "StrictMode violation in " + gVar.a().getClass().getName();
        }
    }

    public static final void f(androidx.fragment.app.f fVar, java.lang.String str) {
        p247y7.AbstractC7350t.f(fVar, "fragment");
        p247y7.AbstractC7350t.f(str, "previousFragmentId");
        W1.a aVar = new W1.a(fVar, str);
        W1.c cVar = f15309a;
        cVar.e(aVar);
        W1.c.C0293c c0293cB = cVar.b(fVar);
        if (c0293cB.a().contains(W1.c.a.DETECT_FRAGMENT_REUSE) && cVar.k(c0293cB, fVar.getClass(), aVar.getClass())) {
            cVar.c(c0293cB, aVar);
        }
    }

    public static final void g(androidx.fragment.app.f fVar, android.view.ViewGroup viewGroup) {
        p247y7.AbstractC7350t.f(fVar, "fragment");
        W1.d dVar = new W1.d(fVar, viewGroup);
        W1.c cVar = f15309a;
        cVar.e(dVar);
        W1.c.C0293c c0293cB = cVar.b(fVar);
        if (c0293cB.a().contains(W1.c.a.DETECT_FRAGMENT_TAG_USAGE) && cVar.k(c0293cB, fVar.getClass(), dVar.getClass())) {
            cVar.c(c0293cB, dVar);
        }
    }

    public static final void h(androidx.fragment.app.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "fragment");
        W1.e eVar = new W1.e(fVar);
        W1.c cVar = f15309a;
        cVar.e(eVar);
        W1.c.C0293c c0293cB = cVar.b(fVar);
        if (c0293cB.a().contains(W1.c.a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.k(c0293cB, fVar.getClass(), eVar.getClass())) {
            cVar.c(c0293cB, eVar);
        }
    }

    public static final void i(androidx.fragment.app.f fVar, android.view.ViewGroup viewGroup) {
        p247y7.AbstractC7350t.f(fVar, "fragment");
        p247y7.AbstractC7350t.f(viewGroup, "container");
        W1.h hVar = new W1.h(fVar, viewGroup);
        W1.c cVar = f15309a;
        cVar.e(hVar);
        W1.c.C0293c c0293cB = cVar.b(fVar);
        if (c0293cB.a().contains(W1.c.a.DETECT_WRONG_FRAGMENT_CONTAINER) && cVar.k(c0293cB, fVar.getClass(), hVar.getClass())) {
            cVar.c(c0293cB, hVar);
        }
    }

    private final void j(androidx.fragment.app.f fVar, java.lang.Runnable runnable) {
        if (fVar.a0()) {
            android.os.Handler handlerR = fVar.H().r0().r();
            p247y7.AbstractC7350t.e(handlerR, "fragment.parentFragmentManager.host.handler");
            if (!p247y7.AbstractC7350t.b(handlerR.getLooper(), android.os.Looper.myLooper())) {
                handlerR.post(runnable);
                return;
            }
        }
        runnable.run();
    }

    private final boolean k(W1.c.C0293c c0293c, java.lang.Class cls, java.lang.Class cls2) {
        java.util.Set set = (java.util.Set) c0293c.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (p247y7.AbstractC7350t.b(cls2.getSuperclass(), W1.g.class) || !p097j7.AbstractC6879v.Z(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
