.class public abstract LF0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LF0/j;)Landroid/view/View;
    .locals 1

    .prologue
    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Cannot get View because the Modifier node is not currently attached."

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-static {p0}, LF0/k;->m(LF0/j;)LF0/J;

    move-result-object p0

    invoke-static {p0}, LF0/N;->b(LF0/J;)LF0/o0;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type android.view.View"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/view/View;

    return-object p0
.end method
