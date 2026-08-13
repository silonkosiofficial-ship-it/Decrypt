package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public class k extends androidx.emoji2.text.f.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final androidx.emoji2.text.k.a f22313k = new androidx.emoji2.text.k.a();

    public static class a {
        public android.graphics.Typeface a(android.content.Context context, y1.h.b bVar) {
            return p242y1.h.a(context, null, new y1.h.b[]{bVar});
        }

        public y1.h.a b(android.content.Context context, p242y1.f fVar) {
            return p242y1.h.b(context, null, fVar);
        }

        public void c(android.content.Context context, android.database.ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements androidx.emoji2.text.f.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.content.Context f22314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p242y1.f f22315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.emoji2.text.k.a f22316c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final java.lang.Object f22317d = new java.lang.Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private android.os.Handler f22318e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private java.util.concurrent.Executor f22319f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private java.util.concurrent.ThreadPoolExecutor f22320g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        androidx.emoji2.text.f.i f22321h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private android.database.ContentObserver f22322i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private java.lang.Runnable f22323j;

        b(android.content.Context context, p242y1.f fVar, androidx.emoji2.text.k.a aVar) {
            B1.i.h(context, "Context cannot be null");
            B1.i.h(fVar, "FontRequest cannot be null");
            this.f22314a = context.getApplicationContext();
            this.f22315b = fVar;
            this.f22316c = aVar;
        }

        private void b() {
            synchronized (this.f22317d) {
                try {
                    this.f22321h = null;
                    android.database.ContentObserver contentObserver = this.f22322i;
                    if (contentObserver != null) {
                        this.f22316c.c(this.f22314a, contentObserver);
                        this.f22322i = null;
                    }
                    android.os.Handler handler = this.f22318e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f22323j);
                    }
                    this.f22318e = null;
                    java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = this.f22320g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f22319f = null;
                    this.f22320g = null;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }

        private y1.h.b e() {
            try {
                y1.h.a aVarB = this.f22316c.b(this.f22314a, this.f22315b);
                if (aVarB.c() == 0) {
                    y1.h.b[] bVarArrB = aVarB.b();
                    if (bVarArrB == null || bVarArrB.length == 0) {
                        throw new java.lang.RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrB[0];
                }
                throw new java.lang.RuntimeException("fetchFonts failed (" + aVarB.c() + ")");
            } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
                throw new java.lang.RuntimeException("provider not found", e6);
            }
        }

        @Override // androidx.emoji2.text.f.h
        public void a(androidx.emoji2.text.f.i iVar) {
            B1.i.h(iVar, "LoaderCallback cannot be null");
            synchronized (this.f22317d) {
                this.f22321h = iVar;
            }
            d();
        }

        void c() {
            synchronized (this.f22317d) {
                try {
                    if (this.f22321h == null) {
                        return;
                    }
                    try {
                        y1.h.b bVarE = e();
                        int iB = bVarE.b();
                        if (iB == 2) {
                            synchronized (this.f22317d) {
                            }
                        }
                        if (iB != 0) {
                            throw new java.lang.RuntimeException("fetchFonts result is not OK. (" + iB + ")");
                        }
                        try {
                            androidx.core.os.s.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            android.graphics.Typeface typefaceA = this.f22316c.a(this.f22314a, bVarE);
                            java.nio.ByteBuffer byteBufferF = androidx.core.graphics.p.f(this.f22314a, null, bVarE.d());
                            if (byteBufferF == null || typefaceA == null) {
                                throw new java.lang.RuntimeException("Unable to open file.");
                            }
                            androidx.emoji2.text.n nVarB = androidx.emoji2.text.n.b(typefaceA, byteBufferF);
                            androidx.core.os.s.b();
                            synchronized (this.f22317d) {
                                try {
                                    androidx.emoji2.text.f.i iVar = this.f22321h;
                                    if (iVar != null) {
                                        iVar.b(nVarB);
                                    }
                                } catch (java.lang.Throwable th) {
                                    throw th;
                                }
                            }
                            b();
                        } catch (java.lang.Throwable th2) {
                            androidx.core.os.s.b();
                            throw th2;
                        }
                    } catch (java.lang.Throwable th3) {
                        synchronized (this.f22317d) {
                            try {
                                androidx.emoji2.text.f.i iVar2 = this.f22321h;
                                if (iVar2 != null) {
                                    iVar2.a(th3);
                                }
                                b();
                            } catch (java.lang.Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                } catch (java.lang.Throwable th5) {
                    throw th5;
                }
            }
        }

        void d() {
            synchronized (this.f22317d) {
                try {
                    if (this.f22321h == null) {
                        return;
                    }
                    if (this.f22319f == null) {
                        java.util.concurrent.ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.c.b("emojiCompat");
                        this.f22320g = threadPoolExecutorB;
                        this.f22319f = threadPoolExecutorB;
                    }
                    this.f22319f.execute(new java.lang.Runnable() { // from class: androidx.emoji2.text.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f22324C.c();
                        }
                    });
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }

        public void f(java.util.concurrent.Executor executor) {
            synchronized (this.f22317d) {
                this.f22319f = executor;
            }
        }
    }

    public k(android.content.Context context, p242y1.f fVar) {
        super(new androidx.emoji2.text.k.b(context, fVar, f22313k));
    }

    public androidx.emoji2.text.k c(java.util.concurrent.Executor executor) {
        ((androidx.emoji2.text.k.b) a()).f(executor);
        return this;
    }
}
