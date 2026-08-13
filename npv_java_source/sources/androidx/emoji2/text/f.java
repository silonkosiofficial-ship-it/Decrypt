package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final java.lang.Object f22252o = new java.lang.Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final java.lang.Object f22253p = new java.lang.Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static volatile androidx.emoji2.text.f f22254q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Set f22256b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.emoji2.text.f.b f22259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final androidx.emoji2.text.f.h f22260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final androidx.emoji2.text.f.j f22261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f22262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f22263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int[] f22264j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f22265k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f22266l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f22267m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final androidx.emoji2.text.f.e f22268n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.locks.ReadWriteLock f22255a = new java.util.concurrent.locks.ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f22257c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.os.Handler f22258d = new android.os.Handler(android.os.Looper.getMainLooper());

    private static final class a extends androidx.emoji2.text.f.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile androidx.emoji2.text.i f22269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile androidx.emoji2.text.n f22270c;

        /* JADX INFO: renamed from: androidx.emoji2.text.f$a$a, reason: collision with other inner class name */
        class C0422a extends androidx.emoji2.text.f.i {
            C0422a() {
            }

            @Override // androidx.emoji2.text.f.i
            public void a(java.lang.Throwable th) {
                androidx.emoji2.text.f.a.this.f22272a.p(th);
            }

            @Override // androidx.emoji2.text.f.i
            public void b(androidx.emoji2.text.n nVar) {
                androidx.emoji2.text.f.a.this.f(nVar);
            }
        }

        a(androidx.emoji2.text.f fVar) {
            super(fVar);
        }

        @Override // androidx.emoji2.text.f.b
        int a(java.lang.CharSequence charSequence, int i6) {
            return this.f22269b.b(charSequence, i6);
        }

        @Override // androidx.emoji2.text.f.b
        int b(java.lang.CharSequence charSequence, int i6) {
            return this.f22269b.c(charSequence, i6);
        }

        @Override // androidx.emoji2.text.f.b
        void c() {
            try {
                this.f22272a.f22260f.a(new androidx.emoji2.text.f.a.C0422a());
            } catch (java.lang.Throwable th) {
                this.f22272a.p(th);
            }
        }

        @Override // androidx.emoji2.text.f.b
        java.lang.CharSequence d(java.lang.CharSequence charSequence, int i6, int i10, int i11, boolean z6) {
            return this.f22269b.j(charSequence, i6, i10, i11, z6);
        }

        @Override // androidx.emoji2.text.f.b
        void e(android.view.inputmethod.EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f22270c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f22272a.f22262h);
        }

        void f(androidx.emoji2.text.n nVar) {
            if (nVar == null) {
                this.f22272a.p(new java.lang.IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f22270c = nVar;
            androidx.emoji2.text.n nVar2 = this.f22270c;
            androidx.emoji2.text.f.j jVar = this.f22272a.f22261g;
            androidx.emoji2.text.f.e eVar = this.f22272a.f22268n;
            androidx.emoji2.text.f fVar = this.f22272a;
            this.f22269b = new androidx.emoji2.text.i(nVar2, jVar, eVar, fVar.f22263i, fVar.f22264j, androidx.emoji2.text.h.a());
            this.f22272a.q();
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final androidx.emoji2.text.f f22272a;

        b(androidx.emoji2.text.f fVar) {
            this.f22272a = fVar;
        }

        abstract int a(java.lang.CharSequence charSequence, int i6);

        abstract int b(java.lang.CharSequence charSequence, int i6);

        abstract void c();

        abstract java.lang.CharSequence d(java.lang.CharSequence charSequence, int i6, int i10, int i11, boolean z6);

        abstract void e(android.view.inputmethod.EditorInfo editorInfo);
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final androidx.emoji2.text.f.h f22273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.emoji2.text.f.j f22274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f22275c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f22276d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int[] f22277e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        java.util.Set f22278f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f22279g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f22280h = -16711936;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f22281i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        androidx.emoji2.text.f.e f22282j = new androidx.emoji2.text.e();

        protected c(androidx.emoji2.text.f.h hVar) {
            B1.i.h(hVar, "metadataLoader cannot be null.");
            this.f22273a = hVar;
        }

        protected final androidx.emoji2.text.f.h a() {
            return this.f22273a;
        }

        public androidx.emoji2.text.f.c b(int i6) {
            this.f22281i = i6;
            return this;
        }
    }

    public static class d implements androidx.emoji2.text.f.j {
        @Override // androidx.emoji2.text.f.j
        public androidx.emoji2.text.j a(androidx.emoji2.text.p pVar) {
            return new androidx.emoji2.text.q(pVar);
        }
    }

    public interface e {
        boolean a(java.lang.CharSequence charSequence, int i6, int i10, int i11);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$f, reason: collision with other inner class name */
    public static abstract class AbstractC0423f {
        public void a(java.lang.Throwable th) {
        }

        public void b() {
        }
    }

    private static class g implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final java.util.List f22283C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final java.lang.Throwable f22284D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private final int f22285E;

        g(androidx.emoji2.text.f.AbstractC0423f abstractC0423f, int i6) {
            this(java.util.Arrays.asList((androidx.emoji2.text.f.AbstractC0423f) B1.i.h(abstractC0423f, "initCallback cannot be null")), i6, null);
        }

        g(java.util.Collection collection, int i6) {
            this(collection, i6, null);
        }

        g(java.util.Collection collection, int i6, java.lang.Throwable th) {
            B1.i.h(collection, "initCallbacks cannot be null");
            this.f22283C = new java.util.ArrayList(collection);
            this.f22285E = i6;
            this.f22284D = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f22283C.size();
            int i6 = 0;
            if (this.f22285E != 1) {
                while (i6 < size) {
                    ((androidx.emoji2.text.f.AbstractC0423f) this.f22283C.get(i6)).a(this.f22284D);
                    i6++;
                }
            } else {
                while (i6 < size) {
                    ((androidx.emoji2.text.f.AbstractC0423f) this.f22283C.get(i6)).b();
                    i6++;
                }
            }
        }
    }

    public interface h {
        void a(androidx.emoji2.text.f.i iVar);
    }

    public static abstract class i {
        public abstract void a(java.lang.Throwable th);

        public abstract void b(androidx.emoji2.text.n nVar);
    }

    public interface j {
        androidx.emoji2.text.j a(androidx.emoji2.text.p pVar);
    }

    private f(androidx.emoji2.text.f.c cVar) {
        this.f22262h = cVar.f22275c;
        this.f22263i = cVar.f22276d;
        this.f22264j = cVar.f22277e;
        this.f22265k = cVar.f22279g;
        this.f22266l = cVar.f22280h;
        this.f22260f = cVar.f22273a;
        this.f22267m = cVar.f22281i;
        this.f22268n = cVar.f22282j;
        p170r.C7027b c7027b = new p170r.C7027b();
        this.f22256b = c7027b;
        androidx.emoji2.text.f.j jVar = cVar.f22274b;
        this.f22261g = jVar == null ? new androidx.emoji2.text.f.d() : jVar;
        java.util.Set set = cVar.f22278f;
        if (set != null && !set.isEmpty()) {
            c7027b.addAll(cVar.f22278f);
        }
        this.f22259e = new androidx.emoji2.text.f.a(this);
        o();
    }

    public static androidx.emoji2.text.f c() {
        androidx.emoji2.text.f fVar;
        synchronized (f22252o) {
            fVar = f22254q;
            B1.i.i(fVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return fVar;
    }

    public static boolean h(android.view.inputmethod.InputConnection inputConnection, android.text.Editable editable, int i6, int i10, boolean z6) {
        return androidx.emoji2.text.i.d(inputConnection, editable, i6, i10, z6);
    }

    public static boolean i(android.text.Editable editable, int i6, android.view.KeyEvent keyEvent) {
        return androidx.emoji2.text.i.e(editable, i6, keyEvent);
    }

    public static androidx.emoji2.text.f j(androidx.emoji2.text.f.c cVar) {
        androidx.emoji2.text.f fVar = f22254q;
        if (fVar == null) {
            synchronized (f22252o) {
                try {
                    fVar = f22254q;
                    if (fVar == null) {
                        fVar = new androidx.emoji2.text.f(cVar);
                        f22254q = fVar;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return fVar;
    }

    public static boolean k() {
        return f22254q != null;
    }

    private boolean m() {
        return g() == 1;
    }

    private void o() {
        this.f22255a.writeLock().lock();
        try {
            if (this.f22267m == 0) {
                this.f22257c = 0;
            }
            this.f22255a.writeLock().unlock();
            if (g() == 0) {
                this.f22259e.c();
            }
        } catch (java.lang.Throwable th) {
            this.f22255a.writeLock().unlock();
            throw th;
        }
    }

    public int d(java.lang.CharSequence charSequence, int i6) {
        return this.f22259e.a(charSequence, i6);
    }

    public int e() {
        return this.f22266l;
    }

    public int f(java.lang.CharSequence charSequence, int i6) {
        return this.f22259e.b(charSequence, i6);
    }

    public int g() {
        this.f22255a.readLock().lock();
        try {
            return this.f22257c;
        } finally {
            this.f22255a.readLock().unlock();
        }
    }

    public boolean l() {
        return this.f22265k;
    }

    public void n() {
        B1.i.i(this.f22267m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (m()) {
            return;
        }
        this.f22255a.writeLock().lock();
        try {
            if (this.f22257c == 0) {
                this.f22255a.writeLock().unlock();
                return;
            }
            this.f22257c = 0;
            this.f22255a.writeLock().unlock();
            this.f22259e.c();
        } catch (java.lang.Throwable th) {
            this.f22255a.writeLock().unlock();
            throw th;
        }
    }

    void p(java.lang.Throwable th) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f22255a.writeLock().lock();
        try {
            this.f22257c = 2;
            arrayList.addAll(this.f22256b);
            this.f22256b.clear();
            this.f22255a.writeLock().unlock();
            this.f22258d.post(new androidx.emoji2.text.f.g(arrayList, this.f22257c, th));
        } catch (java.lang.Throwable th2) {
            this.f22255a.writeLock().unlock();
            throw th2;
        }
    }

    void q() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f22255a.writeLock().lock();
        try {
            this.f22257c = 1;
            arrayList.addAll(this.f22256b);
            this.f22256b.clear();
            this.f22255a.writeLock().unlock();
            this.f22258d.post(new androidx.emoji2.text.f.g(arrayList, this.f22257c));
        } catch (java.lang.Throwable th) {
            this.f22255a.writeLock().unlock();
            throw th;
        }
    }

    public java.lang.CharSequence r(java.lang.CharSequence charSequence) {
        return s(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public java.lang.CharSequence s(java.lang.CharSequence charSequence, int i6, int i10) {
        return t(charSequence, i6, i10, Integer.MAX_VALUE);
    }

    public java.lang.CharSequence t(java.lang.CharSequence charSequence, int i6, int i10, int i11) {
        return u(charSequence, i6, i10, i11, 0);
    }

    public java.lang.CharSequence u(java.lang.CharSequence charSequence, int i6, int i10, int i11, int i12) {
        boolean z6;
        B1.i.i(m(), "Not initialized yet");
        B1.i.e(i6, "start cannot be negative");
        B1.i.e(i10, "end cannot be negative");
        B1.i.e(i11, "maxEmojiCount cannot be negative");
        B1.i.b(i6 <= i10, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        B1.i.b(i6 <= charSequence.length(), "start should be < than charSequence length");
        B1.i.b(i10 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i6 == i10) {
            return charSequence;
        }
        if (i12 != 1) {
            z6 = i12 != 2 ? this.f22262h : false;
        } else {
            z6 = true;
        }
        return this.f22259e.d(charSequence, i6, i10, i11, z6);
    }

    public void v(androidx.emoji2.text.f.AbstractC0423f abstractC0423f) {
        B1.i.h(abstractC0423f, "initCallback cannot be null");
        this.f22255a.writeLock().lock();
        try {
            if (this.f22257c == 1 || this.f22257c == 2) {
                this.f22258d.post(new androidx.emoji2.text.f.g(abstractC0423f, this.f22257c));
            } else {
                this.f22256b.add(abstractC0423f);
            }
        } finally {
            this.f22255a.writeLock().unlock();
        }
    }

    public void w(androidx.emoji2.text.f.AbstractC0423f abstractC0423f) {
        B1.i.h(abstractC0423f, "initCallback cannot be null");
        this.f22255a.writeLock().lock();
        try {
            this.f22256b.remove(abstractC0423f);
        } finally {
            this.f22255a.writeLock().unlock();
        }
    }

    public void x(android.view.inputmethod.EditorInfo editorInfo) {
        if (!m() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new android.os.Bundle();
        }
        this.f22259e.e(editorInfo);
    }
}
