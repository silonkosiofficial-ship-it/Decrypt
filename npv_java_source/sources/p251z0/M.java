package p251z0;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.viewinterop.c f57511D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.viewinterop.c cVar) {
            super(1);
            this.f57511D = cVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(android.view.MotionEvent motionEvent) {
            boolean zDispatchTouchEvent;
            switch (motionEvent.getActionMasked()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    zDispatchTouchEvent = this.f57511D.dispatchTouchEvent(motionEvent);
                    break;
                default:
                    zDispatchTouchEvent = this.f57511D.dispatchGenericMotionEvent(motionEvent);
                    break;
            }
            return java.lang.Boolean.valueOf(zDispatchTouchEvent);
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, androidx.compose.ui.viewinterop.c cVar) {
        p251z0.L l6 = new p251z0.L();
        l6.m(new z0.M.a(cVar));
        p251z0.T t6 = new p251z0.T();
        l6.n(t6);
        cVar.setOnRequestDisallowInterceptTouchEvent$ui_release(t6);
        return dVar.b(l6);
    }
}
