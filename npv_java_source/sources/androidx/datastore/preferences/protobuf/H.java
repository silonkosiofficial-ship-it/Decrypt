package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.datastore.preferences.protobuf.H.a f21933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f21934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f21935c;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.datastore.preferences.protobuf.r0.b f21936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final java.lang.Object f21937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.datastore.preferences.protobuf.r0.b f21938c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final java.lang.Object f21939d;

        public a(androidx.datastore.preferences.protobuf.r0.b bVar, java.lang.Object obj, androidx.datastore.preferences.protobuf.r0.b bVar2, java.lang.Object obj2) {
            this.f21936a = bVar;
            this.f21937b = obj;
            this.f21938c = bVar2;
            this.f21939d = obj2;
        }
    }

    private H(androidx.datastore.preferences.protobuf.r0.b bVar, java.lang.Object obj, androidx.datastore.preferences.protobuf.r0.b bVar2, java.lang.Object obj2) {
        this.f21933a = new androidx.datastore.preferences.protobuf.H.a(bVar, obj, bVar2, obj2);
        this.f21934b = obj;
        this.f21935c = obj2;
    }

    static int b(androidx.datastore.preferences.protobuf.H.a aVar, java.lang.Object obj, java.lang.Object obj2) {
        return androidx.datastore.preferences.protobuf.C2058s.b(aVar.f21936a, 1, obj) + androidx.datastore.preferences.protobuf.C2058s.b(aVar.f21938c, 2, obj2);
    }

    public static androidx.datastore.preferences.protobuf.H d(androidx.datastore.preferences.protobuf.r0.b bVar, java.lang.Object obj, androidx.datastore.preferences.protobuf.r0.b bVar2, java.lang.Object obj2) {
        return new androidx.datastore.preferences.protobuf.H(bVar, obj, bVar2, obj2);
    }

    static void e(androidx.datastore.preferences.protobuf.AbstractC2050j abstractC2050j, androidx.datastore.preferences.protobuf.H.a aVar, java.lang.Object obj, java.lang.Object obj2) {
        androidx.datastore.preferences.protobuf.C2058s.u(abstractC2050j, aVar.f21936a, 1, obj);
        androidx.datastore.preferences.protobuf.C2058s.u(abstractC2050j, aVar.f21938c, 2, obj2);
    }

    public int a(int i6, java.lang.Object obj, java.lang.Object obj2) {
        return androidx.datastore.preferences.protobuf.AbstractC2050j.O(i6) + androidx.datastore.preferences.protobuf.AbstractC2050j.y(b(this.f21933a, obj, obj2));
    }

    androidx.datastore.preferences.protobuf.H.a c() {
        return this.f21933a;
    }
}
