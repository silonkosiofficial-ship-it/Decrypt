package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f23408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f23409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f23410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f23411e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f23414h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f23415i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f23407a = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f23412f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f23413g = 0;

    f() {
    }

    boolean a(androidx.recyclerview.widget.RecyclerView.A a6) {
        int i6 = this.f23409c;
        return i6 >= 0 && i6 < a6.b();
    }

    android.view.View b(androidx.recyclerview.widget.RecyclerView.v vVar) {
        android.view.View viewO = vVar.o(this.f23409c);
        this.f23409c += this.f23410d;
        return viewO;
    }

    public java.lang.String toString() {
        return "LayoutState{mAvailable=" + this.f23408b + ", mCurrentPosition=" + this.f23409c + ", mItemDirection=" + this.f23410d + ", mLayoutDirection=" + this.f23411e + ", mStartLine=" + this.f23412f + ", mEndLine=" + this.f23413g + '}';
    }
}
