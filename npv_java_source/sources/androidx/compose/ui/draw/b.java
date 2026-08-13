package androidx.compose.ui.draw;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final p111l0.c a(p237x7.l lVar) {
        return new androidx.compose.ui.draw.a(new p111l0.d(), lVar);
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, p237x7.l lVar) {
        return dVar.b(new androidx.compose.ui.draw.DrawBehindElement(lVar));
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, p237x7.l lVar) {
        return dVar.b(new androidx.compose.ui.draw.DrawWithCacheElement(lVar));
    }

    public static final androidx.compose.ui.d d(androidx.compose.ui.d dVar, p237x7.l lVar) {
        return dVar.b(new androidx.compose.ui.draw.DrawWithContentElement(lVar));
    }
}
