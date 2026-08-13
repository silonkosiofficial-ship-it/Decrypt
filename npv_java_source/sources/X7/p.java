package X7;

/* JADX INFO: loaded from: classes2.dex */
public interface p {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p138n8.b f16028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f16029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p048e8.g f16030c;

        public a(p138n8.b bVar, byte[] bArr, p048e8.g gVar) {
            p247y7.AbstractC7350t.f(bVar, "classId");
            this.f16028a = bVar;
            this.f16029b = bArr;
            this.f16030c = gVar;
        }

        public /* synthetic */ a(p138n8.b bVar, byte[] bArr, p048e8.g gVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
            this(bVar, (i6 & 2) != 0 ? null : bArr, (i6 & 4) != 0 ? null : gVar);
        }

        public final p138n8.b a() {
            return this.f16028a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof X7.p.a)) {
                return false;
            }
            X7.p.a aVar = (X7.p.a) obj;
            return p247y7.AbstractC7350t.b(this.f16028a, aVar.f16028a) && p247y7.AbstractC7350t.b(this.f16029b, aVar.f16029b) && p247y7.AbstractC7350t.b(this.f16030c, aVar.f16030c);
        }

        public int hashCode() {
            int iHashCode = this.f16028a.hashCode() * 31;
            byte[] bArr = this.f16029b;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : java.util.Arrays.hashCode(bArr))) * 31;
            p048e8.g gVar = this.f16030c;
            return iHashCode2 + (gVar != null ? gVar.hashCode() : 0);
        }

        public java.lang.String toString() {
            return "Request(classId=" + this.f16028a + ", previouslyFoundClassFileContent=" + java.util.Arrays.toString(this.f16029b) + ", outerClass=" + this.f16030c + ')';
        }
    }

    p048e8.u a(p138n8.c cVar, boolean z6);

    p048e8.g b(X7.p.a aVar);

    java.util.Set c(p138n8.c cVar);
}
