package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements D2.a {

    class a implements androidx.lifecycle.InterfaceC2073e {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.AbstractC2079k f22242C;

        a(androidx.lifecycle.AbstractC2079k abstractC2079k) {
            this.f22242C = abstractC2079k;
        }

        @Override // androidx.lifecycle.InterfaceC2073e
        public /* synthetic */ void D(androidx.lifecycle.r rVar) {
            androidx.lifecycle.AbstractC2072d.b(this, rVar);
        }

        @Override // androidx.lifecycle.InterfaceC2073e
        public /* synthetic */ void H(androidx.lifecycle.r rVar) {
            androidx.lifecycle.AbstractC2072d.e(this, rVar);
        }

        @Override // androidx.lifecycle.InterfaceC2073e
        public void f(androidx.lifecycle.r rVar) {
            androidx.emoji2.text.EmojiCompatInitializer.this.e();
            this.f22242C.d(this);
        }

        @Override // androidx.lifecycle.InterfaceC2073e
        public /* synthetic */ void g(androidx.lifecycle.r rVar) {
            androidx.lifecycle.AbstractC2072d.a(this, rVar);
        }

        @Override // androidx.lifecycle.InterfaceC2073e
        public /* synthetic */ void o(androidx.lifecycle.r rVar) {
            androidx.lifecycle.AbstractC2072d.c(this, rVar);
        }

        @Override // androidx.lifecycle.InterfaceC2073e
        public /* synthetic */ void y(androidx.lifecycle.r rVar) {
            androidx.lifecycle.AbstractC2072d.f(this, rVar);
        }
    }

    static class b extends androidx.emoji2.text.f.c {
        protected b(android.content.Context context) {
            super(new androidx.emoji2.text.EmojiCompatInitializer.c(context));
            b(1);
        }
    }

    static class c implements androidx.emoji2.text.f.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.content.Context f22244a;

        class a extends androidx.emoji2.text.f.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.emoji2.text.f.i f22245a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ java.util.concurrent.ThreadPoolExecutor f22246b;

            a(androidx.emoji2.text.f.i iVar, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
                this.f22245a = iVar;
                this.f22246b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.f.i
            public void a(java.lang.Throwable th) {
                try {
                    this.f22245a.a(th);
                } finally {
                    this.f22246b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.f.i
            public void b(androidx.emoji2.text.n nVar) {
                try {
                    this.f22245a.b(nVar);
                } finally {
                    this.f22246b.shutdown();
                }
            }
        }

        c(android.content.Context context) {
            this.f22244a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.f.h
        public void a(final androidx.emoji2.text.f.i iVar) {
            final java.util.concurrent.ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.c.b("EmojiCompatInitializer");
            threadPoolExecutorB.execute(new java.lang.Runnable() { // from class: androidx.emoji2.text.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22286C.d(iVar, threadPoolExecutorB);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void d(androidx.emoji2.text.f.i iVar, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
            try {
                androidx.emoji2.text.k kVarA = androidx.emoji2.text.d.a(this.f22244a);
                if (kVarA == null) {
                    throw new java.lang.RuntimeException("EmojiCompat font provider not available on this device.");
                }
                kVarA.c(threadPoolExecutor);
                kVarA.a().a(new androidx.emoji2.text.EmojiCompatInitializer.c.a(iVar, threadPoolExecutor));
            } catch (java.lang.Throwable th) {
                iVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    static class d implements java.lang.Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                androidx.core.os.s.a("EmojiCompat.EmojiCompatInitializer.run");
                if (androidx.emoji2.text.f.k()) {
                    androidx.emoji2.text.f.c().n();
                }
            } finally {
                androidx.core.os.s.b();
            }
        }
    }

    @Override // D2.a
    public java.util.List a() {
        return java.util.Collections.singletonList(androidx.lifecycle.ProcessLifecycleInitializer.class);
    }

    @Override // D2.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean b(android.content.Context context) {
        androidx.emoji2.text.f.j(new androidx.emoji2.text.EmojiCompatInitializer.b(context));
        d(context);
        return java.lang.Boolean.TRUE;
    }

    void d(android.content.Context context) {
        androidx.lifecycle.AbstractC2079k abstractC2079kU = ((androidx.lifecycle.r) androidx.startup.a.e(context).f(androidx.lifecycle.ProcessLifecycleInitializer.class)).u();
        abstractC2079kU.a(new androidx.emoji2.text.EmojiCompatInitializer.a(abstractC2079kU));
    }

    void e() {
        androidx.emoji2.text.c.d().postDelayed(new androidx.emoji2.text.EmojiCompatInitializer.d(), 500L);
    }
}
