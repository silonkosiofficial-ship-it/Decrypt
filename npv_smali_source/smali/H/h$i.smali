.class final LH/h$i;
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

.field final synthetic F:Z

.field final synthetic G:LS0/X;

.field final synthetic H:LS0/V;

.field final synthetic I:LS0/s;

.field final synthetic J:LS0/L;

.field final synthetic K:LN/F;

.field final synthetic L:LW8/N;

.field final synthetic M:LE/b;


# direct methods
.method constructor <init>(LH/w;ZZLS0/X;LS0/V;LS0/s;LS0/L;LN/F;LW8/N;LE/b;)V
    .locals 0

    iput-object p1, p0, LH/h$i;->D:LH/w;

    iput-boolean p2, p0, LH/h$i;->E:Z

    iput-boolean p3, p0, LH/h$i;->F:Z

    iput-object p4, p0, LH/h$i;->G:LS0/X;

    iput-object p5, p0, LH/h$i;->H:LS0/V;

    iput-object p6, p0, LH/h$i;->I:LS0/s;

    iput-object p7, p0, LH/h$i;->J:LS0/L;

    iput-object p8, p0, LH/h$i;->K:LN/F;

    iput-object p9, p0, LH/h$i;->L:LW8/N;

    iput-object p10, p0, LH/h$i;->M:LE/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lm0/n;)V
    .locals 12

    .prologue
    iget-object v0, p0, LH/h$i;->D:LH/w;

    invoke-virtual {v0}, LH/w;->e()Z

    move-result v0

    invoke-interface {p1}, Lm0/n;->g()Z

    move-result v1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LH/h$i;->D:LH/w;

    invoke-interface {p1}, Lm0/n;->g()Z

    move-result v1

    invoke-virtual {v0, v1}, LH/w;->C(Z)V

    iget-object v0, p0, LH/h$i;->D:LH/w;

    invoke-virtual {v0}, LH/w;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, LH/h$i;->E:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, LH/h$i;->F:Z

    if-nez v0, :cond_1

    iget-object v0, p0, LH/h$i;->G:LS0/X;

    iget-object v1, p0, LH/h$i;->D:LH/w;

    iget-object v2, p0, LH/h$i;->H:LS0/V;

    iget-object v3, p0, LH/h$i;->I:LS0/s;

    iget-object v4, p0, LH/h$i;->J:LS0/L;

    invoke-static {v0, v1, v2, v3, v4}, LH/h;->k(LS0/X;LH/w;LS0/V;LS0/s;LS0/L;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, LH/h$i;->D:LH/w;

    invoke-static {v0}, LH/h;->i(LH/w;)V

    :goto_0
    invoke-interface {p1}, Lm0/n;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LH/h$i;->D:LH/w;

    invoke-virtual {v0}, LH/w;->j()LH/V;

    move-result-object v5

    if-eqz v5, :cond_2

    iget-object v0, p0, LH/h$i;->L:LW8/N;

    iget-object v2, p0, LH/h$i;->M:LE/b;

    iget-object v3, p0, LH/h$i;->H:LS0/V;

    iget-object v4, p0, LH/h$i;->D:LH/w;

    iget-object v6, p0, LH/h$i;->J:LS0/L;

    new-instance v9, LH/h$i$a;

    const/4 v7, 0x0

    move-object v1, v9

    invoke-direct/range {v1 .. v7}, LH/h$i$a;-><init>(LE/b;LS0/V;LH/w;LH/V;LS0/L;Lm7/e;)V

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v8, 0x0

    move-object v6, v0

    invoke-static/range {v6 .. v11}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    :cond_2
    invoke-interface {p1}, Lm0/n;->g()Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, LH/h$i;->K:LN/F;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, LN/F;->u(LN/F;Ln0/g;ILjava/lang/Object;)V

    :cond_3
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm0/n;

    invoke-virtual {p0, p1}, LH/h$i;->a(Lm0/n;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
