package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f23676a;

    static class a {
        static android.graphics.Bitmap a(android.graphics.Picture picture) {
            return android.graphics.Bitmap.createBitmap(picture);
        }
    }

    static {
        f23676a = android.os.Build.VERSION.SDK_INT >= 28;
    }

    static android.view.View a(android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        androidx.transition.A.g(view, matrix);
        androidx.transition.A.h(viewGroup, matrix);
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int iRound = java.lang.Math.round(rectF.left);
        int iRound2 = java.lang.Math.round(rectF.top);
        int iRound3 = java.lang.Math.round(rectF.right);
        int iRound4 = java.lang.Math.round(rectF.bottom);
        android.widget.ImageView imageView = new android.widget.ImageView(view.getContext());
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        android.graphics.Bitmap bitmapB = b(view, matrix, rectF, viewGroup);
        if (bitmapB != null) {
            imageView.setImageBitmap(bitmapB);
        }
        imageView.measure(android.view.View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
        imageView.layout(iRound, iRound2, iRound3, iRound4);
        return imageView;
    }

    private static android.graphics.Bitmap b(android.view.View view, android.graphics.Matrix matrix, android.graphics.RectF rectF, android.view.ViewGroup viewGroup) {
        android.view.ViewGroup viewGroup2;
        boolean z6 = !view.isAttachedToWindow();
        int iIndexOfChild = 0;
        boolean z10 = viewGroup != null && viewGroup.isAttachedToWindow();
        android.graphics.Bitmap bitmapCreateBitmap = null;
        if (!z6) {
            viewGroup2 = null;
        } else {
            if (!z10) {
                return null;
            }
            viewGroup2 = (android.view.ViewGroup) view.getParent();
            iIndexOfChild = viewGroup2.indexOfChild(view);
            viewGroup.getOverlay().add(view);
        }
        int iRound = java.lang.Math.round(rectF.width());
        int iRound2 = java.lang.Math.round(rectF.height());
        if (iRound > 0 && iRound2 > 0) {
            float fMin = java.lang.Math.min(1.0f, 1048576.0f / (iRound * iRound2));
            int iRound3 = java.lang.Math.round(iRound * fMin);
            int iRound4 = java.lang.Math.round(iRound2 * fMin);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(fMin, fMin);
            if (f23676a) {
                android.graphics.Picture picture = new android.graphics.Picture();
                android.graphics.Canvas canvasBeginRecording = picture.beginRecording(iRound3, iRound4);
                canvasBeginRecording.concat(matrix);
                view.draw(canvasBeginRecording);
                picture.endRecording();
                bitmapCreateBitmap = androidx.transition.w.a.a(picture);
            } else {
                bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iRound3, iRound4, android.graphics.Bitmap.Config.ARGB_8888);
                android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (z6) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, iIndexOfChild);
        }
        return bitmapCreateBitmap;
    }

    static android.animation.Animator c(android.animation.Animator animator, android.animation.Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
