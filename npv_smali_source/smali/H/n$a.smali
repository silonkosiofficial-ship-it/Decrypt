.class final LH/n$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/n;->f(LD0/M;LD0/G;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD0/M;

.field final synthetic E:LH/n;

.field final synthetic F:LD0/X;

.field final synthetic G:I


# direct methods
.method constructor <init>(LD0/M;LH/n;LD0/X;I)V
    .locals 0

    iput-object p1, p0, LH/n$a;->D:LD0/M;

    iput-object p2, p0, LH/n$a;->E:LH/n;

    iput-object p3, p0, LH/n$a;->F:LD0/X;

    iput p4, p0, LH/n$a;->G:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 8

    .prologue
    iget-object v0, p0, LH/n$a;->D:LD0/M;

    iget-object v1, p0, LH/n$a;->E:LH/n;

    invoke-virtual {v1}, LH/n;->g()I

    move-result v1

    iget-object v2, p0, LH/n$a;->E:LH/n;

    invoke-virtual {v2}, LH/n;->m()LS0/e0;

    move-result-object v2

    iget-object v3, p0, LH/n$a;->E:LH/n;

    invoke-virtual {v3}, LH/n;->l()Lx7/a;

    move-result-object v3

    invoke-interface {v3}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LH/V;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, LH/V;->f()LM0/K;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-object v4, p0, LH/n$a;->D:LD0/M;

    invoke-interface {v4}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v4

    sget-object v5, LY0/v;->D:LY0/v;

    if-ne v4, v5, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    iget-object v5, p0, LH/n$a;->F:LD0/X;

    invoke-virtual {v5}, LD0/X;->I0()I

    move-result v5

    invoke-static/range {v0 .. v5}, LH/P;->a(LY0/e;ILS0/e0;LM0/K;ZI)Ln0/i;

    move-result-object v0

    iget-object v1, p0, LH/n$a;->E:LH/n;

    invoke-virtual {v1}, LH/n;->j()LH/Q;

    move-result-object v1

    sget-object v2, Lx/s;->D:Lx/s;

    iget v3, p0, LH/n$a;->G:I

    iget-object v4, p0, LH/n$a;->F:LD0/X;

    invoke-virtual {v4}, LD0/X;->I0()I

    move-result v4

    invoke-virtual {v1, v2, v0, v3, v4}, LH/Q;->j(Lx/s;Ln0/i;II)V

    iget-object v0, p0, LH/n$a;->E:LH/n;

    invoke-virtual {v0}, LH/n;->j()LH/Q;

    move-result-object v0

    invoke-virtual {v0}, LH/Q;->d()F

    move-result v0

    neg-float v0, v0

    iget-object v2, p0, LH/n$a;->F:LD0/X;

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v3

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, LH/n$a;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
