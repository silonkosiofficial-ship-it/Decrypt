package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final androidx.recyclerview.widget.o.b f23441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    androidx.recyclerview.widget.o.a f23442b = new androidx.recyclerview.widget.o.a();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23443a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f23445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f23446d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23447e;

        a() {
        }

        void a(int i6) {
            this.f23443a = i6 | this.f23443a;
        }

        boolean b() {
            int i6 = this.f23443a;
            if ((i6 & 7) != 0 && (i6 & c(this.f23446d, this.f23444b)) == 0) {
                return false;
            }
            int i10 = this.f23443a;
            if ((i10 & 112) != 0 && (i10 & (c(this.f23446d, this.f23445c) << 4)) == 0) {
                return false;
            }
            int i11 = this.f23443a;
            if ((i11 & 1792) != 0 && (i11 & (c(this.f23447e, this.f23444b) << 8)) == 0) {
                return false;
            }
            int i12 = this.f23443a;
            return (i12 & 28672) == 0 || (i12 & (c(this.f23447e, this.f23445c) << 12)) != 0;
        }

        int c(int i6, int i10) {
            if (i6 > i10) {
                return 1;
            }
            return i6 == i10 ? 2 : 4;
        }

        void d() {
            this.f23443a = 0;
        }

        void e(int i6, int i10, int i11, int i12) {
            this.f23444b = i6;
            this.f23445c = i10;
            this.f23446d = i11;
            this.f23447e = i12;
        }
    }

    interface b {
        android.view.View a(int i6);

        int b(android.view.View view);

        int c();

        int d();

        int e(android.view.View view);
    }

    o(androidx.recyclerview.widget.o.b bVar) {
        this.f23441a = bVar;
    }

    android.view.View a(int i6, int i10, int i11, int i12) {
        int iC = this.f23441a.c();
        int iD = this.f23441a.d();
        int i13 = i10 > i6 ? 1 : -1;
        android.view.View view = null;
        while (i6 != i10) {
            android.view.View viewA = this.f23441a.a(i6);
            this.f23442b.e(iC, iD, this.f23441a.b(viewA), this.f23441a.e(viewA));
            if (i11 != 0) {
                this.f23442b.d();
                this.f23442b.a(i11);
                if (this.f23442b.b()) {
                    return viewA;
                }
            }
            if (i12 != 0) {
                this.f23442b.d();
                this.f23442b.a(i12);
                if (this.f23442b.b()) {
                    view = viewA;
                }
            }
            i6 += i13;
        }
        return view;
    }

    boolean b(android.view.View view, int i6) {
        this.f23442b.e(this.f23441a.c(), this.f23441a.d(), this.f23441a.b(view), this.f23441a.e(view));
        if (i6 == 0) {
            return false;
        }
        this.f23442b.d();
        this.f23442b.a(i6);
        return this.f23442b.b();
    }
}
