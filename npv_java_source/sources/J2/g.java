package J2;

/* JADX INFO: loaded from: classes.dex */
public class g extends I2.r {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final java.lang.String f5665j = I2.j.f("WorkContinuationImpl");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J2.j f5666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f5667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final I2.d f5668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f5669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.List f5670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.List f5671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.List f5672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f5673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private I2.m f5674i;

    public g(J2.j jVar, java.lang.String str, I2.d dVar, java.util.List list, java.util.List list2) {
        this.f5666a = jVar;
        this.f5667b = str;
        this.f5668c = dVar;
        this.f5669d = list;
        this.f5672g = list2;
        this.f5670e = new java.util.ArrayList(list.size());
        this.f5671f = new java.util.ArrayList();
        if (list2 != null) {
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f5671f.addAll(((J2.g) it.next()).f5671f);
            }
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            java.lang.String strA = ((I2.u) list.get(i6)).a();
            this.f5670e.add(strA);
            this.f5671f.add(strA);
        }
    }

    public g(J2.j jVar, java.util.List list) {
        this(jVar, null, I2.d.KEEP, list, null);
    }

    private static boolean i(J2.g gVar, java.util.Set set) {
        set.addAll(gVar.c());
        java.util.Set setL = l(gVar);
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            if (setL.contains((java.lang.String) it.next())) {
                return true;
            }
        }
        java.util.List listE = gVar.e();
        if (listE != null && !listE.isEmpty()) {
            java.util.Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                if (i((J2.g) it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.c());
        return false;
    }

    public static java.util.Set l(J2.g gVar) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.List listE = gVar.e();
        if (listE != null && !listE.isEmpty()) {
            java.util.Iterator it = listE.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((J2.g) it.next()).c());
            }
        }
        return hashSet;
    }

    public I2.m a() {
        if (this.f5673h) {
            I2.j.c().h(f5665j, java.lang.String.format("Already enqueued work ids (%s)", android.text.TextUtils.join(", ", this.f5670e)), new java.lang.Throwable[0]);
        } else {
            R2.b bVar = new R2.b(this);
            this.f5666a.p().b(bVar);
            this.f5674i = bVar.d();
        }
        return this.f5674i;
    }

    public I2.d b() {
        return this.f5668c;
    }

    public java.util.List c() {
        return this.f5670e;
    }

    public java.lang.String d() {
        return this.f5667b;
    }

    public java.util.List e() {
        return this.f5672g;
    }

    public java.util.List f() {
        return this.f5669d;
    }

    public J2.j g() {
        return this.f5666a;
    }

    public boolean h() {
        return i(this, new java.util.HashSet());
    }

    public boolean j() {
        return this.f5673h;
    }

    public void k() {
        this.f5673h = true;
    }
}
