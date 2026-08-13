package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f18363a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f18364b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18365c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18366d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18367e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18368f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f18369g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f18370h = false;

    V() {
    }

    public int a() {
        return this.f18369g ? this.f18363a : this.f18364b;
    }

    public int b() {
        return this.f18363a;
    }

    public int c() {
        return this.f18364b;
    }

    public int d() {
        return this.f18369g ? this.f18364b : this.f18363a;
    }

    public void e(int i6, int i10) {
        this.f18370h = false;
        if (i6 != Integer.MIN_VALUE) {
            this.f18367e = i6;
            this.f18363a = i6;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f18368f = i10;
            this.f18364b = i10;
        }
    }

    public void f(boolean z6) {
        int i6;
        if (z6 == this.f18369g) {
            return;
        }
        this.f18369g = z6;
        if (this.f18370h) {
            if (z6) {
                int i10 = this.f18366d;
                if (i10 == Integer.MIN_VALUE) {
                    i10 = this.f18367e;
                }
                this.f18363a = i10;
                i6 = this.f18365c;
                if (i6 == Integer.MIN_VALUE) {
                }
            } else {
                int i11 = this.f18365c;
                if (i11 == Integer.MIN_VALUE) {
                    i11 = this.f18367e;
                }
                this.f18363a = i11;
                i6 = this.f18366d;
                if (i6 == Integer.MIN_VALUE) {
                }
            }
            this.f18364b = i6;
        }
        this.f18363a = this.f18367e;
        i6 = this.f18368f;
        this.f18364b = i6;
    }

    public void g(int i6, int i10) {
        this.f18365c = i6;
        this.f18366d = i10;
        this.f18370h = true;
        if (this.f18369g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f18363a = i10;
            }
            if (i6 != Integer.MIN_VALUE) {
                this.f18364b = i6;
                return;
            }
            return;
        }
        if (i6 != Integer.MIN_VALUE) {
            this.f18363a = i6;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f18364b = i10;
        }
    }
}
