.class public abstract Ld2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LV/n;I)Landroidx/lifecycle/Y;
    .locals 3

    .prologue
    const v0, 0x52686103    # 2.49515E11f

    invoke-interface {p0, v0}, LV/n;->f(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.lifecycle.viewmodel.compose.findViewTreeViewModelStoreOwner (LocalViewModelStoreOwner.android.kt:25)"

    invoke-static {v0, p1, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/T;->i()LV/O0;

    move-result-object p1

    invoke-interface {p0, p1}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-static {p1}, Landroidx/lifecycle/a0;->a(Landroid/view/View;)Landroidx/lifecycle/Y;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    invoke-interface {p0}, LV/n;->P()V

    return-object p1
.end method
