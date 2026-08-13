package p251z0;

/* JADX INFO: renamed from: z0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7372h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p170r.C7046v f57562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p251z0.D f57563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f57564c;

    public C7372h(p170r.C7046v c7046v, p251z0.D d6) {
        this.f57562a = c7046v;
        this.f57563b = d6;
    }

    public final boolean a(long j6) {
        java.lang.Object obj;
        java.util.List listB = this.f57563b.b();
        int size = listB.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                obj = null;
                break;
            }
            obj = listB.get(i6);
            if (p251z0.A.d(((p251z0.E) obj).d(), j6)) {
                break;
            }
            i6++;
        }
        p251z0.E e6 = (p251z0.E) obj;
        if (e6 != null) {
            return e6.a();
        }
        return false;
    }

    public final p170r.C7046v b() {
        return this.f57562a;
    }

    public final android.view.MotionEvent c() {
        return this.f57563b.a();
    }

    public final boolean d() {
        return this.f57564c;
    }

    public final void e(boolean z6) {
        this.f57564c = z6;
    }
}
