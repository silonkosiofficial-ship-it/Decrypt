.class final Landroidx/compose/animation/e$b$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/e$b;->f(LD0/M;LD0/G;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/animation/e;

.field final synthetic E:Landroidx/compose/animation/e$b;


# direct methods
.method constructor <init>(Landroidx/compose/animation/e;Landroidx/compose/animation/e$b;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/e$b$b;->D:Landroidx/compose/animation/e;

    iput-object p2, p0, Landroidx/compose/animation/e$b$b;->E:Landroidx/compose/animation/e$b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lu/s0$b;)Lu/I;
    .locals 4

    .prologue
    iget-object v0, p0, Landroidx/compose/animation/e$b$b;->D:Landroidx/compose/animation/e;

    invoke-virtual {v0}, Landroidx/compose/animation/e;->i()Lr/K;

    move-result-object v0

    invoke-interface {p1}, Lu/s0$b;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lr/U;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LV/G1;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/t;

    invoke-virtual {v0}, LY0/t;->j()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    sget-object v0, LY0/t;->b:LY0/t$a;

    invoke-virtual {v0}, LY0/t$a;->a()J

    move-result-wide v0

    :goto_0
    iget-object v2, p0, Landroidx/compose/animation/e$b$b;->D:Landroidx/compose/animation/e;

    invoke-virtual {v2}, Landroidx/compose/animation/e;->i()Lr/K;

    move-result-object v2

    invoke-interface {p1}, Lu/s0$b;->d()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1}, Lr/U;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LV/G1;

    if-eqz p1, :cond_1

    invoke-interface {p1}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LY0/t;

    invoke-virtual {p1}, LY0/t;->j()J

    move-result-wide v2

    goto :goto_1

    :cond_1
    sget-object p1, LY0/t;->b:LY0/t$a;

    invoke-virtual {p1}, LY0/t$a;->a()J

    move-result-wide v2

    :goto_1
    iget-object p1, p0, Landroidx/compose/animation/e$b$b;->E:Landroidx/compose/animation/e$b;

    invoke-virtual {p1}, Landroidx/compose/animation/e$b;->g()LV/G1;

    move-result-object p1

    invoke-interface {p1}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt/x;

    if-eqz p1, :cond_2

    invoke-interface {p1, v0, v1, v2, v3}, Lt/x;->b(JJ)Lu/I;

    move-result-object p1

    if-nez p1, :cond_3

    :cond_2
    const/4 p1, 0x7

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v0, v1, p1, v1}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object p1

    :cond_3
    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu/s0$b;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/e$b$b;->a(Lu/s0$b;)Lu/I;

    move-result-object p1

    return-object p1
.end method
