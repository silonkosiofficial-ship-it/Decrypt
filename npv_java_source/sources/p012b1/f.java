package p012b1;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p012b1.w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f24053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b1.i.c f24054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b1.i.c f24055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b1.i.b f24056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b1.i.c f24057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b1.i.c f24058h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b1.i.b f24059i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b1.i.a f24060j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.Object obj) {
        super(obj);
        p247y7.AbstractC7350t.f(obj, "id");
        this.f24053c = obj;
        this.f24054d = new b1.i.c(a(), -2, this);
        this.f24055e = new b1.i.c(a(), 0, this);
        this.f24056f = new b1.i.b(a(), 0, this);
        this.f24057g = new b1.i.c(a(), -1, this);
        this.f24058h = new b1.i.c(a(), 1, this);
        this.f24059i = new b1.i.b(a(), 1, this);
        this.f24060j = new b1.i.a(a(), this);
    }

    @Override // p012b1.w
    public java.lang.Object a() {
        return this.f24053c;
    }

    public final b1.i.b b() {
        return this.f24059i;
    }

    public final b1.i.c c() {
        return this.f24057g;
    }

    public final b1.i.c d() {
        return this.f24054d;
    }

    public final b1.i.b e() {
        return this.f24056f;
    }
}
