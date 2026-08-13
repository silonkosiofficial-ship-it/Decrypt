package p248y8;

/* JADX INFO: loaded from: classes2.dex */
public interface k {

    public static final class a {
        public static /* synthetic */ java.util.Collection a(p248y8.k kVar, p248y8.d dVar, p237x7.l lVar, int i6, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
            }
            if ((i6 & 1) != 0) {
                dVar = p248y8.d.f57327o;
            }
            if ((i6 & 2) != 0) {
                lVar = p248y8.h.f57352a.a();
            }
            return kVar.e(dVar, lVar);
        }
    }

    java.util.Collection e(p248y8.d dVar, p237x7.l lVar);

    O7.InterfaceC1427h g(p138n8.f fVar, W7.b bVar);
}
