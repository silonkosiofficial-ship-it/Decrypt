package p242y1;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y1.h.c f57157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.os.Handler f57158b;

    /* JADX INFO: renamed from: y1.a$a, reason: collision with other inner class name */
    class RunnableC0755a implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ y1.h.c f57159C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ android.graphics.Typeface f57160D;

        RunnableC0755a(y1.h.c cVar, android.graphics.Typeface typeface) {
            this.f57159C = cVar;
            this.f57160D = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f57159C.b(this.f57160D);
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ y1.h.c f57162C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f57163D;

        b(y1.h.c cVar, int i6) {
            this.f57162C = cVar;
            this.f57163D = i6;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f57162C.a(this.f57163D);
        }
    }

    a(y1.h.c cVar, android.os.Handler handler) {
        this.f57157a = cVar;
        this.f57158b = handler;
    }

    private void a(int i6) {
        this.f57158b.post(new y1.a.b(this.f57157a, i6));
    }

    private void c(android.graphics.Typeface typeface) {
        this.f57158b.post(new p242y1.a.RunnableC0755a(this.f57157a, typeface));
    }

    void b(y1.g.e eVar) {
        if (eVar.a()) {
            c(eVar.f57188a);
        } else {
            a(eVar.f57189b);
        }
    }
}
