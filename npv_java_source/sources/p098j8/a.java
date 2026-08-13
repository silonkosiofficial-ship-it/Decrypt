package p098j8;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends p108k8.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p098j8.a.C0617a f49319g = new p098j8.a.C0617a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p098j8.a f49320h = new p098j8.a(1, 0, 7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p098j8.a f49321i = new p098j8.a(new int[0]);

    /* JADX INFO: renamed from: j8.a$a, reason: collision with other inner class name */
    public static final class C0617a {
        private C0617a() {
        }

        public /* synthetic */ C0617a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p098j8.a a(java.io.InputStream inputStream) {
            p247y7.AbstractC7350t.f(inputStream, "stream");
            java.io.DataInputStream dataInputStream = new java.io.DataInputStream(inputStream);
            E7.i iVar = new E7.i(1, dataInputStream.readInt());
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(iVar, 10));
            java.util.Iterator it = iVar.iterator();
            while (it.hasNext()) {
                ((p097j7.O) it).b();
                arrayList.add(java.lang.Integer.valueOf(dataInputStream.readInt()));
            }
            int[] iArrS0 = p097j7.AbstractC6879v.S0(arrayList);
            return new p098j8.a(java.util.Arrays.copyOf(iArrS0, iArrS0.length));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int... iArr) {
        super(java.util.Arrays.copyOf(iArr, iArr.length));
        p247y7.AbstractC7350t.f(iArr, "numbers");
    }

    public boolean h() {
        return f(f49320h);
    }
}
