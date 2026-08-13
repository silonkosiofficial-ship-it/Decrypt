package androidx.compose.ui.viewinterop;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.compose.ui.viewinterop.d.a f20522a = new androidx.compose.ui.viewinterop.d.a();

    public static final class a implements p241y0.b {
        a() {
        }

        @Override // p241y0.b
        public /* synthetic */ java.lang.Object J(long j6, long j10, p127m7.e eVar) {
            return p241y0.a.a(this, j6, j10, eVar);
        }

        @Override // p241y0.b
        public /* synthetic */ long e1(long j6, long j10, int i6) {
            return p241y0.a.b(this, j6, j10, i6);
        }

        @Override // p241y0.b
        public /* synthetic */ java.lang.Object h1(long j6, p127m7.e eVar) {
            return p241y0.a.c(this, j6, eVar);
        }

        @Override // p241y0.b
        public /* synthetic */ long u0(long j6, int i6) {
            return p241y0.a.d(this, j6, i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(android.view.View view, F0.J j6) {
        long jE = D0.AbstractC0901u.e(j6.l());
        int iRound = java.lang.Math.round(p131n0.g.m(jE));
        int iRound2 = java.lang.Math.round(p131n0.g.n(jE));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(int i6) {
        return i6 * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(float f6) {
        return f6 * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(int i6) {
        return i6 == 0 ? p241y0.f.f57150a.b() : p241y0.f.f57150a.a();
    }
}
