package p182s1;

/* JADX INFO: loaded from: classes.dex */
public class f implements p182s1.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    p182s1.m f54068d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f54070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f54071g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p182s1.d f54065a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f54066b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f54067c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    s1.f.a f54069e = s1.f.a.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f54072h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    p182s1.g f54073i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f54074j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    java.util.List f54075k = new java.util.ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    java.util.List f54076l = new java.util.ArrayList();

    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p182s1.m mVar) {
        this.f54068d = mVar;
    }

    @Override // p182s1.d
    public void a(p182s1.d dVar) {
        java.util.Iterator it = this.f54076l.iterator();
        while (it.hasNext()) {
            if (!((p182s1.f) it.next()).f54074j) {
                return;
            }
        }
        this.f54067c = true;
        p182s1.d dVar2 = this.f54065a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f54066b) {
            this.f54068d.a(this);
            return;
        }
        p182s1.f fVar = null;
        int i6 = 0;
        for (p182s1.f fVar2 : this.f54076l) {
            if (!(fVar2 instanceof p182s1.g)) {
                i6++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i6 == 1 && fVar.f54074j) {
            p182s1.g gVar = this.f54073i;
            if (gVar != null) {
                if (!gVar.f54074j) {
                    return;
                } else {
                    this.f54070f = this.f54072h * gVar.f54071g;
                }
            }
            d(fVar.f54071g + this.f54070f);
        }
        p182s1.d dVar3 = this.f54065a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(p182s1.d dVar) {
        this.f54075k.add(dVar);
        if (this.f54074j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f54076l.clear();
        this.f54075k.clear();
        this.f54074j = false;
        this.f54071g = 0;
        this.f54067c = false;
        this.f54066b = false;
    }

    public void d(int i6) {
        if (this.f54074j) {
            return;
        }
        this.f54074j = true;
        this.f54071g = i6;
        for (p182s1.d dVar : this.f54075k) {
            dVar.a(dVar);
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f54068d.f54101b.r());
        sb.append(":");
        sb.append(this.f54069e);
        sb.append("(");
        sb.append(this.f54074j ? java.lang.Integer.valueOf(this.f54071g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f54076l.size());
        sb.append(":d=");
        sb.append(this.f54075k.size());
        sb.append(">");
        return sb.toString();
    }
}
