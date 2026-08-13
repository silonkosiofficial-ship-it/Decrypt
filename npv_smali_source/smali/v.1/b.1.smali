.class public abstract Lv/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LV/n;I)Lv/T;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.android.kt:63)"

    const v2, -0x57ff4a94

    invoke-static {v2, p1, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/T;->g()LV/O0;

    move-result-object p1

    invoke-interface {p0, p1}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {}, Lv/S;->a()LV/O0;

    move-result-object v0

    invoke-interface {p0, v0}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv/Q;

    if-eqz v0, :cond_3

    const v1, 0x5e88c4e9

    invoke-interface {p0, v1}, LV/n;->T(I)V

    invoke-interface {p0, p1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p0, v0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-interface {p0}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1

    sget-object v1, LV/n;->a:LV/n$a;

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_2

    :cond_1
    new-instance v2, Lv/a;

    invoke-direct {v2, p1, v0}, Lv/a;-><init>(Landroid/content/Context;Lv/Q;)V

    invoke-interface {p0, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v2, Lv/a;

    invoke-interface {p0}, LV/n;->J()V

    goto :goto_0

    :cond_3
    const p1, 0x5e8a48e5

    invoke-interface {p0, p1}, LV/n;->T(I)V

    invoke-interface {p0}, LV/n;->J()V

    sget-object v2, Lv/P;->a:Lv/P;

    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-static {}, LV/q;->P()V

    :cond_4
    return-object v2
.end method
