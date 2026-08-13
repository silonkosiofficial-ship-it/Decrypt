.class final Landroidx/compose/ui/platform/x$n;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/x;->D0(Landroidx/compose/ui/platform/n1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/platform/n1;

.field final synthetic E:Landroidx/compose/ui/platform/x;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/n1;Landroidx/compose/ui/platform/x;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/x$n;->D:Landroidx/compose/ui/platform/n1;

    iput-object p2, p0, Landroidx/compose/ui/platform/x$n;->E:Landroidx/compose/ui/platform/x;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/x$n;->D:Landroidx/compose/ui/platform/n1;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/n1;->a()LK0/i;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/x$n;->D:Landroidx/compose/ui/platform/n1;

    invoke-virtual {v1}, Landroidx/compose/ui/platform/n1;->e()LK0/i;

    move-result-object v1

    iget-object v2, p0, Landroidx/compose/ui/platform/x$n;->D:Landroidx/compose/ui/platform/n1;

    invoke-virtual {v2}, Landroidx/compose/ui/platform/n1;->b()Ljava/lang/Float;

    move-result-object v2

    iget-object v3, p0, Landroidx/compose/ui/platform/x$n;->D:Landroidx/compose/ui/platform/n1;

    invoke-virtual {v3}, Landroidx/compose/ui/platform/n1;->c()Ljava/lang/Float;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    if-eqz v2, :cond_0

    invoke-virtual {v0}, LK0/i;->c()Lx7/a;

    move-result-object v5

    invoke-interface {v5}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    sub-float/2addr v5, v2

    goto :goto_0

    :cond_0
    move v5, v4

    :goto_0
    if-eqz v1, :cond_1

    if-eqz v3, :cond_1

    invoke-virtual {v1}, LK0/i;->c()Lx7/a;

    move-result-object v2

    invoke-interface {v2}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    sub-float/2addr v2, v3

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_1
    cmpg-float v3, v5, v4

    if-nez v3, :cond_2

    cmpg-float v2, v2, v4

    if-nez v2, :cond_2

    goto :goto_3

    :cond_2
    iget-object v2, p0, Landroidx/compose/ui/platform/x$n;->E:Landroidx/compose/ui/platform/x;

    iget-object v3, p0, Landroidx/compose/ui/platform/x$n;->D:Landroidx/compose/ui/platform/n1;

    invoke-virtual {v3}, Landroidx/compose/ui/platform/n1;->d()I

    move-result v3

    invoke-static {v2, v3}, Landroidx/compose/ui/platform/x;->I(Landroidx/compose/ui/platform/x;I)I

    move-result v2

    iget-object v3, p0, Landroidx/compose/ui/platform/x$n;->E:Landroidx/compose/ui/platform/x;

    invoke-static {v3}, Landroidx/compose/ui/platform/x;->v(Landroidx/compose/ui/platform/x;)Lr/n;

    move-result-object v3

    iget-object v4, p0, Landroidx/compose/ui/platform/x$n;->E:Landroidx/compose/ui/platform/x;

    invoke-static {v4}, Landroidx/compose/ui/platform/x;->y(Landroidx/compose/ui/platform/x;)I

    move-result v4

    invoke-virtual {v3, v4}, Lr/n;->c(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/platform/p1;

    if-eqz v3, :cond_3

    iget-object v4, p0, Landroidx/compose/ui/platform/x$n;->E:Landroidx/compose/ui/platform/x;

    :try_start_0
    invoke-static {v4}, Landroidx/compose/ui/platform/x;->w(Landroidx/compose/ui/platform/x;)LC1/B;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-static {v4, v3}, Landroidx/compose/ui/platform/x;->s(Landroidx/compose/ui/platform/x;Landroidx/compose/ui/platform/p1;)Landroid/graphics/Rect;

    move-result-object v3

    invoke-virtual {v5, v3}, LC1/B;->j0(Landroid/graphics/Rect;)V

    sget-object v3, Li7/M;->a:Li7/M;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    sget-object v3, Li7/M;->a:Li7/M;

    :cond_3
    :goto_2
    iget-object v3, p0, Landroidx/compose/ui/platform/x$n;->E:Landroidx/compose/ui/platform/x;

    invoke-virtual {v3}, Landroidx/compose/ui/platform/x;->l0()Landroidx/compose/ui/platform/r;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->invalidate()V

    iget-object v3, p0, Landroidx/compose/ui/platform/x$n;->E:Landroidx/compose/ui/platform/x;

    invoke-static {v3}, Landroidx/compose/ui/platform/x;->v(Landroidx/compose/ui/platform/x;)Lr/n;

    move-result-object v3

    invoke-virtual {v3, v2}, Lr/n;->c(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/platform/p1;

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Landroidx/compose/ui/platform/p1;->b()LK0/o;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v3}, LK0/o;->q()LF0/J;

    move-result-object v3

    if-eqz v3, :cond_6

    iget-object v4, p0, Landroidx/compose/ui/platform/x$n;->E:Landroidx/compose/ui/platform/x;

    if-eqz v0, :cond_4

    invoke-static {v4}, Landroidx/compose/ui/platform/x;->A(Landroidx/compose/ui/platform/x;)Lr/C;

    move-result-object v5

    invoke-virtual {v5, v2, v0}, Lr/C;->s(ILjava/lang/Object;)V

    :cond_4
    if-eqz v1, :cond_5

    invoke-static {v4}, Landroidx/compose/ui/platform/x;->B(Landroidx/compose/ui/platform/x;)Lr/C;

    move-result-object v5

    invoke-virtual {v5, v2, v1}, Lr/C;->s(ILjava/lang/Object;)V

    :cond_5
    invoke-static {v4, v3}, Landroidx/compose/ui/platform/x;->F(Landroidx/compose/ui/platform/x;LF0/J;)V

    :cond_6
    :goto_3
    if-eqz v0, :cond_7

    iget-object v2, p0, Landroidx/compose/ui/platform/x$n;->D:Landroidx/compose/ui/platform/n1;

    invoke-virtual {v0}, LK0/i;->c()Lx7/a;

    move-result-object v0

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v2, v0}, Landroidx/compose/ui/platform/n1;->g(Ljava/lang/Float;)V

    :cond_7
    if-eqz v1, :cond_8

    iget-object v0, p0, Landroidx/compose/ui/platform/x$n;->D:Landroidx/compose/ui/platform/n1;

    invoke-virtual {v1}, LK0/i;->c()Lx7/a;

    move-result-object v1

    invoke-interface {v1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/n1;->h(Ljava/lang/Float;)V

    :cond_8
    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/x$n;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
