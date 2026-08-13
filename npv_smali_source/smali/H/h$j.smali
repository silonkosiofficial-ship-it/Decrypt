.class final LH/h$j;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/h;->a(LS0/V;Lx7/l;Landroidx/compose/ui/d;LM0/P;LS0/g0;Lx7/l;Lz/l;Lo0/n0;ZIILS0/s;LH/u;ZZLx7/q;LV/n;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LH/w;

.field final synthetic E:Z

.field final synthetic F:Landroidx/compose/ui/platform/J1;

.field final synthetic G:LN/F;

.field final synthetic H:LS0/V;

.field final synthetic I:LS0/L;


# direct methods
.method constructor <init>(LH/w;ZLandroidx/compose/ui/platform/J1;LN/F;LS0/V;LS0/L;)V
    .locals 0

    iput-object p1, p0, LH/h$j;->D:LH/w;

    iput-boolean p2, p0, LH/h$j;->E:Z

    iput-object p3, p0, LH/h$j;->F:Landroidx/compose/ui/platform/J1;

    iput-object p4, p0, LH/h$j;->G:LN/F;

    iput-object p5, p0, LH/h$j;->H:LS0/V;

    iput-object p6, p0, LH/h$j;->I:LS0/L;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/t;)V
    .locals 4

    .prologue
    iget-object v0, p0, LH/h$j;->D:LH/w;

    invoke-virtual {v0, p1}, LH/w;->F(LD0/t;)V

    iget-object v0, p0, LH/h$j;->D:LH/w;

    invoke-virtual {v0}, LH/w;->j()LH/V;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, LH/V;->i(LD0/t;)V

    :goto_0
    iget-boolean p1, p0, LH/h$j;->E:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, LH/h$j;->D:LH/w;

    invoke-virtual {p1}, LH/w;->d()LH/l;

    move-result-object p1

    sget-object v0, LH/l;->D:LH/l;

    const/4 v1, 0x1

    if-ne p1, v0, :cond_2

    iget-object p1, p0, LH/h$j;->D:LH/w;

    invoke-virtual {p1}, LH/w;->s()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LH/h$j;->F:Landroidx/compose/ui/platform/J1;

    invoke-interface {p1}, Landroidx/compose/ui/platform/J1;->a()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LH/h$j;->G:LN/F;

    invoke-virtual {p1}, LN/F;->l0()V

    goto :goto_1

    :cond_1
    iget-object p1, p0, LH/h$j;->G:LN/F;

    invoke-virtual {p1}, LN/F;->R()V

    :goto_1
    iget-object p1, p0, LH/h$j;->D:LH/w;

    iget-object v0, p0, LH/h$j;->G:LN/F;

    invoke-static {v0, v1}, LN/G;->c(LN/F;Z)Z

    move-result v0

    invoke-virtual {p1, v0}, LH/w;->M(Z)V

    iget-object p1, p0, LH/h$j;->D:LH/w;

    iget-object v0, p0, LH/h$j;->G:LN/F;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LN/G;->c(LN/F;Z)Z

    move-result v0

    invoke-virtual {p1, v0}, LH/w;->L(Z)V

    iget-object p1, p0, LH/h$j;->D:LH/w;

    iget-object v0, p0, LH/h$j;->H:LS0/V;

    invoke-virtual {v0}, LS0/V;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LM0/N;->h(J)Z

    move-result v0

    :goto_2
    invoke-virtual {p1, v0}, LH/w;->J(Z)V

    goto :goto_3

    :cond_2
    iget-object p1, p0, LH/h$j;->D:LH/w;

    invoke-virtual {p1}, LH/w;->d()LH/l;

    move-result-object p1

    sget-object v0, LH/l;->E:LH/l;

    if-ne p1, v0, :cond_3

    iget-object p1, p0, LH/h$j;->D:LH/w;

    iget-object v0, p0, LH/h$j;->G:LN/F;

    invoke-static {v0, v1}, LN/G;->c(LN/F;Z)Z

    move-result v0

    goto :goto_2

    :cond_3
    :goto_3
    iget-object p1, p0, LH/h$j;->D:LH/w;

    iget-object v0, p0, LH/h$j;->H:LS0/V;

    iget-object v1, p0, LH/h$j;->I:LS0/L;

    invoke-static {p1, v0, v1}, LH/h;->j(LH/w;LS0/V;LS0/L;)V

    iget-object p1, p0, LH/h$j;->D:LH/w;

    invoke-virtual {p1}, LH/w;->j()LH/V;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v0, p0, LH/h$j;->D:LH/w;

    iget-object v1, p0, LH/h$j;->H:LS0/V;

    iget-object v2, p0, LH/h$j;->I:LS0/L;

    invoke-virtual {v0}, LH/w;->g()LS0/d0;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v0}, LH/w;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, LH/H;->a:LH/H$a;

    invoke-virtual {v0, v3, v1, v2, p1}, LH/H$a;->k(LS0/d0;LS0/V;LS0/L;LH/V;)V

    :cond_4
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/t;

    invoke-virtual {p0, p1}, LH/h$j;->a(LD0/t;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
