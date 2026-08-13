package L4;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f6213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6214b;

    /* JADX INFO: renamed from: L4.a$a, reason: collision with other inner class name */
    public static class C0152a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final android.content.Context f6216b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f6218d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.List f6215a = new java.util.ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f6217c = 0;

        public C0152a(android.content.Context context) {
            this.f6216b = context.getApplicationContext();
        }

        public L4.a a() {
            boolean z6 = true;
            if (!p055f4.AbstractC6589x0.a(true) && !this.f6215a.contains(p055f4.AbstractC6574p0.a(this.f6216b)) && !this.f6218d) {
                z6 = false;
            }
            return new L4.a(z6, this, null);
        }
    }

    /* synthetic */ a(boolean z6, L4.a.C0152a c0152a, L4.g gVar) {
        this.f6213a = z6;
        this.f6214b = c0152a.f6217c;
    }

    public int a() {
        return this.f6214b;
    }

    public boolean b() {
        return this.f6213a;
    }
}
