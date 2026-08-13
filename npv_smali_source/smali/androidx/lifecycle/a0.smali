.class public abstract Landroidx/lifecycle/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroid/view/View;)Landroidx/lifecycle/Y;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/lifecycle/a0$a;->D:Landroidx/lifecycle/a0$a;

    invoke-static {p0, v0}, LR8/k;->n(Ljava/lang/Object;Lx7/l;)LR8/h;

    move-result-object p0

    sget-object v0, Landroidx/lifecycle/a0$b;->D:Landroidx/lifecycle/a0$b;

    invoke-static {p0, v0}, LR8/k;->H(LR8/h;Lx7/l;)LR8/h;

    move-result-object p0

    invoke-static {p0}, LR8/k;->A(LR8/h;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/lifecycle/Y;

    return-object p0
.end method

.method public static final b(Landroid/view/View;Landroidx/lifecycle/Y;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lc2/e;->a:I

    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method
