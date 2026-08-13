package p104k3;

/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.util.List f49496f = java.util.Arrays.asList("MA", "T", "PG", "G");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f49497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f49498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f49499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f49500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k3.t.b f49501e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f49502a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f49503b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.lang.String f49504c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final java.util.List f49505d = new java.util.ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private k3.t.b f49506e = k3.t.b.DEFAULT;

        public p104k3.t a() {
            return new p104k3.t(this.f49502a, this.f49503b, this.f49504c, this.f49505d, this.f49506e, null);
        }
    }

    public enum b {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);


        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final int f49511C;

        b(int i6) {
            this.f49511C = i6;
        }

        public int e() {
            return this.f49511C;
        }
    }

    /* synthetic */ t(int i6, int i10, java.lang.String str, java.util.List list, k3.t.b bVar, p104k3.F f6) {
        this.f49497a = i6;
        this.f49498b = i10;
        this.f49499c = str;
        this.f49500d = list;
        this.f49501e = bVar;
    }

    public java.lang.String a() {
        java.lang.String str = this.f49499c;
        return str == null ? "" : str;
    }

    public k3.t.b b() {
        return this.f49501e;
    }

    public int c() {
        return this.f49497a;
    }

    public int d() {
        return this.f49498b;
    }

    public java.util.List e() {
        return new java.util.ArrayList(this.f49500d);
    }
}
