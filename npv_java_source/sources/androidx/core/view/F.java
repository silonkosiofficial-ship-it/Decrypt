package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f21651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21652b;

    public F(android.view.ViewGroup viewGroup) {
    }

    public int a() {
        return this.f21651a | this.f21652b;
    }

    public void b(android.view.View view, android.view.View view2, int i6) {
        c(view, view2, i6, 0);
    }

    public void c(android.view.View view, android.view.View view2, int i6, int i10) {
        if (i10 == 1) {
            this.f21652b = i6;
        } else {
            this.f21651a = i6;
        }
    }

    public void d(android.view.View view, int i6) {
        if (i6 == 1) {
            this.f21652b = 0;
        } else {
            this.f21651a = 0;
        }
    }
}
