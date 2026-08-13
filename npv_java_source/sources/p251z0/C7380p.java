package p251z0;

/* JADX INFO: renamed from: z0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7380p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f57582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p251z0.C7372h f57583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f57584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f57585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f57586e;

    public C7380p(java.util.List list) {
        this(list, null);
    }

    public C7380p(java.util.List list, p251z0.C7372h c7372h) {
        this.f57582a = list;
        this.f57583b = c7372h;
        android.view.MotionEvent motionEventE = e();
        this.f57584c = p251z0.AbstractC7379o.a(motionEventE != null ? motionEventE.getButtonState() : 0);
        android.view.MotionEvent motionEventE2 = e();
        this.f57585d = p251z0.O.b(motionEventE2 != null ? motionEventE2.getMetaState() : 0);
        this.f57586e = a();
    }

    private final int a() {
        android.view.MotionEvent motionEventE = e();
        if (motionEventE == null) {
            java.util.List list = this.f57582a;
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                p251z0.B b6 = (p251z0.B) list.get(i6);
                if (p251z0.AbstractC7381q.d(b6)) {
                    return p251z0.AbstractC7383t.f57591a.e();
                }
                if (p251z0.AbstractC7381q.b(b6)) {
                    return p251z0.AbstractC7383t.f57591a.d();
                }
            }
            return p251z0.AbstractC7383t.f57591a.c();
        }
        int actionMasked = motionEventE.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    switch (actionMasked) {
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            return p251z0.AbstractC7383t.f57591a.f();
                        case 9:
                            return p251z0.AbstractC7383t.f57591a.a();
                        case 10:
                            return p251z0.AbstractC7383t.f57591a.b();
                        default:
                            return p251z0.AbstractC7383t.f57591a.g();
                    }
                }
                return p251z0.AbstractC7383t.f57591a.c();
            }
            return p251z0.AbstractC7383t.f57591a.e();
        }
        return p251z0.AbstractC7383t.f57591a.d();
    }

    public final int b() {
        return this.f57584c;
    }

    public final java.util.List c() {
        return this.f57582a;
    }

    public final p251z0.C7372h d() {
        return this.f57583b;
    }

    public final android.view.MotionEvent e() {
        p251z0.C7372h c7372h = this.f57583b;
        if (c7372h != null) {
            return c7372h.c();
        }
        return null;
    }

    public final int f() {
        return this.f57586e;
    }

    public final void g(int i6) {
        this.f57586e = i6;
    }
}
