package p242y1;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f57190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final y1.h.b[] f57191b;

        public a(int i6, y1.h.b[] bVarArr) {
            this.f57190a = i6;
            this.f57191b = bVarArr;
        }

        static y1.h.a a(int i6, y1.h.b[] bVarArr) {
            return new y1.h.a(i6, bVarArr);
        }

        public y1.h.b[] b() {
            return this.f57191b;
        }

        public int c() {
            return this.f57190a;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.net.Uri f57192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f57193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f57194c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f57195d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f57196e;

        public b(android.net.Uri uri, int i6, int i10, boolean z6, int i11) {
            this.f57192a = (android.net.Uri) B1.i.g(uri);
            this.f57193b = i6;
            this.f57194c = i10;
            this.f57195d = z6;
            this.f57196e = i11;
        }

        static y1.h.b a(android.net.Uri uri, int i6, int i10, boolean z6, int i11) {
            return new y1.h.b(uri, i6, i10, z6, i11);
        }

        public int b() {
            return this.f57196e;
        }

        public int c() {
            return this.f57193b;
        }

        public android.net.Uri d() {
            return this.f57192a;
        }

        public int e() {
            return this.f57194c;
        }

        public boolean f() {
            return this.f57195d;
        }
    }

    public static class c {
        public abstract void a(int i6);

        public abstract void b(android.graphics.Typeface typeface);
    }

    public static android.graphics.Typeface a(android.content.Context context, android.os.CancellationSignal cancellationSignal, y1.h.b[] bVarArr) {
        return androidx.core.graphics.i.b(context, cancellationSignal, bVarArr, 0);
    }

    public static y1.h.a b(android.content.Context context, android.os.CancellationSignal cancellationSignal, p242y1.f fVar) {
        return p242y1.e.e(context, fVar, cancellationSignal);
    }

    public static android.graphics.Typeface c(android.content.Context context, p242y1.f fVar, int i6, boolean z6, int i10, android.os.Handler handler, y1.h.c cVar) {
        p242y1.a aVar = new p242y1.a(cVar, handler);
        return z6 ? p242y1.g.e(context, fVar, aVar, i6, i10) : p242y1.g.d(context, fVar, i6, null, aVar);
    }
}
