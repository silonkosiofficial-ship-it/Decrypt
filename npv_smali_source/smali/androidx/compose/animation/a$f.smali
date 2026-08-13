.class final Landroidx/compose/animation/a$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/a;->b(Lu/s0;Landroidx/compose/ui/d;Lx7/l;Lh0/c;Lx7/l;Lx7/r;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lu/s0;

.field final synthetic E:Ljava/lang/Object;

.field final synthetic F:Lx7/l;

.field final synthetic G:Landroidx/compose/animation/e;

.field final synthetic H:Lf0/r;

.field final synthetic I:Lx7/r;


# direct methods
.method constructor <init>(Lu/s0;Ljava/lang/Object;Lx7/l;Landroidx/compose/animation/e;Lf0/r;Lx7/r;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/a$f;->D:Lu/s0;

    iput-object p2, p0, Landroidx/compose/animation/a$f;->E:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/compose/animation/a$f;->F:Lx7/l;

    iput-object p4, p0, Landroidx/compose/animation/a$f;->G:Landroidx/compose/animation/e;

    iput-object p5, p0, Landroidx/compose/animation/a$f;->H:Lf0/r;

    iput-object p6, p0, Landroidx/compose/animation/a$f;->I:Lx7/r;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 12

    .prologue
    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    invoke-interface {p1}, LV/n;->u()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LV/n;->A()V

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:757)"

    const v3, 0x34c9ce26

    invoke-static {v3, p2, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v0, p0, Landroidx/compose/animation/a$f;->F:Lx7/l;

    iget-object v1, p0, Landroidx/compose/animation/a$f;->G:Landroidx/compose/animation/e;

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v2, v4, :cond_3

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lt/k;

    invoke-interface {p1, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast v2, Lt/k;

    iget-object v0, p0, Landroidx/compose/animation/a$f;->D:Lu/s0;

    invoke-virtual {v0}, Lu/s0;->n()Lu/s0$b;

    move-result-object v0

    invoke-interface {v0}, Lu/s0$b;->d()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/animation/a$f;->E:Ljava/lang/Object;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p1, v0}, LV/n;->d(Z)Z

    move-result v0

    iget-object v1, p0, Landroidx/compose/animation/a$f;->D:Lu/s0;

    iget-object v4, p0, Landroidx/compose/animation/a$f;->E:Ljava/lang/Object;

    iget-object v5, p0, Landroidx/compose/animation/a$f;->F:Lx7/l;

    iget-object v6, p0, Landroidx/compose/animation/a$f;->G:Landroidx/compose/animation/e;

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v7

    if-nez v0, :cond_4

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v7, v0, :cond_6

    :cond_4
    invoke-virtual {v1}, Lu/s0;->n()Lu/s0$b;

    move-result-object v0

    invoke-interface {v0}, Lu/s0$b;->d()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Landroidx/compose/animation/j;->a:Landroidx/compose/animation/j$a;

    invoke-virtual {v0}, Landroidx/compose/animation/j$a;->a()Landroidx/compose/animation/j;

    move-result-object v0

    :goto_1
    move-object v7, v0

    goto :goto_2

    :cond_5
    invoke-interface {v5, v6}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt/k;

    invoke-virtual {v0}, Lt/k;->a()Landroidx/compose/animation/j;

    move-result-object v0

    goto :goto_1

    :goto_2
    invoke-interface {p1, v7}, LV/n;->K(Ljava/lang/Object;)V

    :cond_6
    move-object v4, v7

    check-cast v4, Landroidx/compose/animation/j;

    iget-object v0, p0, Landroidx/compose/animation/a$f;->E:Ljava/lang/Object;

    iget-object v1, p0, Landroidx/compose/animation/a$f;->D:Lu/s0;

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v5, v6, :cond_7

    new-instance v5, Landroidx/compose/animation/e$a;

    invoke-virtual {v1}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    invoke-direct {v5, v0}, Landroidx/compose/animation/e$a;-><init>(Z)V

    invoke-interface {p1, v5}, LV/n;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v5, Landroidx/compose/animation/e$a;

    invoke-virtual {v2}, Lt/k;->c()Landroidx/compose/animation/h;

    move-result-object v6

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    invoke-interface {p1, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v7

    if-nez v1, :cond_8

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v7, v1, :cond_9

    :cond_8
    new-instance v7, Landroidx/compose/animation/a$f$a;

    invoke-direct {v7, v2}, Landroidx/compose/animation/a$f$a;-><init>(Lt/k;)V

    invoke-interface {p1, v7}, LV/n;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v7, Lx7/q;

    invoke-static {v0, v7}, Landroidx/compose/ui/layout/b;->a(Landroidx/compose/ui/d;Lx7/q;)Landroidx/compose/ui/d;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/animation/a$f;->E:Ljava/lang/Object;

    iget-object v2, p0, Landroidx/compose/animation/a$f;->D:Lu/s0;

    invoke-virtual {v2}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v5, v1}, Landroidx/compose/animation/e$a;->j(Z)V

    invoke-interface {v0, v5}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v2

    iget-object v0, p0, Landroidx/compose/animation/a$f;->D:Lu/s0;

    iget-object v1, p0, Landroidx/compose/animation/a$f;->E:Ljava/lang/Object;

    invoke-interface {p1, v1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    iget-object v5, p0, Landroidx/compose/animation/a$f;->E:Ljava/lang/Object;

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v7

    if-nez v1, :cond_a

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v7, v1, :cond_b

    :cond_a
    new-instance v7, Landroidx/compose/animation/a$f$b;

    invoke-direct {v7, v5}, Landroidx/compose/animation/a$f$b;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, v7}, LV/n;->K(Ljava/lang/Object;)V

    :cond_b
    move-object v1, v7

    check-cast v1, Lx7/l;

    invoke-interface {p1, v4}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_c

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v7, v3, :cond_d

    :cond_c
    new-instance v7, Landroidx/compose/animation/a$f$c;

    invoke-direct {v7, v4}, Landroidx/compose/animation/a$f$c;-><init>(Landroidx/compose/animation/j;)V

    invoke-interface {p1, v7}, LV/n;->K(Ljava/lang/Object;)V

    :cond_d
    move-object v5, v7

    check-cast v5, Lx7/p;

    new-instance v3, Landroidx/compose/animation/a$f$d;

    iget-object v7, p0, Landroidx/compose/animation/a$f;->H:Lf0/r;

    iget-object v9, p0, Landroidx/compose/animation/a$f;->E:Ljava/lang/Object;

    iget-object v10, p0, Landroidx/compose/animation/a$f;->G:Landroidx/compose/animation/e;

    iget-object v11, p0, Landroidx/compose/animation/a$f;->I:Lx7/r;

    invoke-direct {v3, v7, v9, v10, v11}, Landroidx/compose/animation/a$f$d;-><init>(Lf0/r;Ljava/lang/Object;Landroidx/compose/animation/e;Lx7/r;)V

    const/16 v7, 0x36

    const v9, -0x24ba65ea

    const/4 v10, 0x1

    invoke-static {v9, v10, v3, p1, v7}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v7

    const/high16 v9, 0xc00000

    const/16 v10, 0x40

    const/4 v11, 0x0

    move-object v3, v6

    move-object v6, v11

    move-object v8, p1

    invoke-static/range {v0 .. v10}, Lt/d;->a(Lu/s0;Lx7/l;Landroidx/compose/ui/d;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lx7/p;Lt/u;Lx7/q;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {}, LV/q;->P()V

    :cond_e
    :goto_3
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/animation/a$f;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
