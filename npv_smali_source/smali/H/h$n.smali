.class final LH/h$n;
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
.field final synthetic D:LS0/e0;

.field final synthetic E:LS0/V;

.field final synthetic F:Z

.field final synthetic G:Z

.field final synthetic H:Z

.field final synthetic I:LS0/s;

.field final synthetic J:LH/w;

.field final synthetic K:LS0/L;

.field final synthetic L:LN/F;

.field final synthetic M:Landroidx/compose/ui/focus/n;


# direct methods
.method constructor <init>(LS0/e0;LS0/V;ZZZLS0/s;LH/w;LS0/L;LN/F;Landroidx/compose/ui/focus/n;)V
    .locals 0

    iput-object p1, p0, LH/h$n;->D:LS0/e0;

    iput-object p2, p0, LH/h$n;->E:LS0/V;

    iput-boolean p3, p0, LH/h$n;->F:Z

    iput-boolean p4, p0, LH/h$n;->G:Z

    iput-boolean p5, p0, LH/h$n;->H:Z

    iput-object p6, p0, LH/h$n;->I:LS0/s;

    iput-object p7, p0, LH/h$n;->J:LH/w;

    iput-object p8, p0, LH/h$n;->K:LS0/L;

    iput-object p9, p0, LH/h$n;->L:LN/F;

    iput-object p10, p0, LH/h$n;->M:Landroidx/compose/ui/focus/n;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LK0/w;)V
    .locals 17

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v7, p1

    iget-object v1, v0, LH/h$n;->D:LS0/e0;

    invoke-virtual {v1}, LS0/e0;->b()LM0/d;

    move-result-object v1

    invoke-static {v7, v1}, LK0/u;->R(LK0/w;LM0/d;)V

    iget-object v1, v0, LH/h$n;->E:LS0/V;

    invoke-virtual {v1}, LS0/V;->h()J

    move-result-wide v1

    invoke-static {v7, v1, v2}, LK0/u;->f0(LK0/w;J)V

    iget-boolean v1, v0, LH/h$n;->F:Z

    if-nez v1, :cond_0

    invoke-static/range {p1 .. p1}, LK0/u;->j(LK0/w;)V

    :cond_0
    iget-boolean v1, v0, LH/h$n;->G:Z

    if-eqz v1, :cond_1

    invoke-static/range {p1 .. p1}, LK0/u;->A(LK0/w;)V

    :cond_1
    iget-boolean v1, v0, LH/h$n;->F:Z

    const/4 v8, 0x1

    if-eqz v1, :cond_2

    iget-boolean v1, v0, LH/h$n;->H:Z

    if-nez v1, :cond_2

    move v1, v8

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-static {v7, v1}, LK0/u;->Q(LK0/w;Z)V

    new-instance v2, LH/h$n$b;

    iget-object v3, v0, LH/h$n;->J:LH/w;

    invoke-direct {v2, v3}, LH/h$n$b;-><init>(LH/w;)V

    const/4 v9, 0x0

    invoke-static {v7, v9, v2, v8, v9}, LK0/u;->q(LK0/w;Ljava/lang/String;Lx7/l;ILjava/lang/Object;)V

    if-eqz v1, :cond_3

    new-instance v1, LH/h$n$c;

    iget-object v2, v0, LH/h$n;->J:LH/w;

    invoke-direct {v1, v2, v7}, LH/h$n$c;-><init>(LH/w;LK0/w;)V

    invoke-static {v7, v9, v1, v8, v9}, LK0/u;->e0(LK0/w;Ljava/lang/String;Lx7/l;ILjava/lang/Object;)V

    new-instance v10, LH/h$n$d;

    iget-boolean v2, v0, LH/h$n;->H:Z

    iget-boolean v3, v0, LH/h$n;->F:Z

    iget-object v4, v0, LH/h$n;->J:LH/w;

    iget-object v6, v0, LH/h$n;->E:LS0/V;

    move-object v1, v10

    move-object/from16 v5, p1

    invoke-direct/range {v1 .. v6}, LH/h$n$d;-><init>(ZZLH/w;LK0/w;LS0/V;)V

    invoke-static {v7, v9, v10, v8, v9}, LK0/u;->t(LK0/w;Ljava/lang/String;Lx7/l;ILjava/lang/Object;)V

    :cond_3
    new-instance v1, LH/h$n$e;

    iget-object v12, v0, LH/h$n;->K:LS0/L;

    iget-boolean v13, v0, LH/h$n;->F:Z

    iget-object v14, v0, LH/h$n;->E:LS0/V;

    iget-object v15, v0, LH/h$n;->L:LN/F;

    iget-object v2, v0, LH/h$n;->J:LH/w;

    move-object v11, v1

    move-object/from16 v16, v2

    invoke-direct/range {v11 .. v16}, LH/h$n$e;-><init>(LS0/L;ZLS0/V;LN/F;LH/w;)V

    invoke-static {v7, v9, v1, v8, v9}, LK0/u;->a0(LK0/w;Ljava/lang/String;Lx7/q;ILjava/lang/Object;)V

    iget-object v1, v0, LH/h$n;->I:LS0/s;

    invoke-virtual {v1}, LS0/s;->e()I

    move-result v2

    new-instance v4, LH/h$n$f;

    iget-object v1, v0, LH/h$n;->J:LH/w;

    iget-object v3, v0, LH/h$n;->I:LS0/s;

    invoke-direct {v4, v1, v3}, LH/h$n$f;-><init>(LH/w;LS0/s;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v6}, LK0/u;->x(LK0/w;ILjava/lang/String;Lx7/a;ILjava/lang/Object;)V

    new-instance v1, LH/h$n$g;

    iget-object v2, v0, LH/h$n;->J:LH/w;

    iget-object v3, v0, LH/h$n;->M:Landroidx/compose/ui/focus/n;

    iget-boolean v4, v0, LH/h$n;->H:Z

    invoke-direct {v1, v2, v3, v4}, LH/h$n$g;-><init>(LH/w;Landroidx/compose/ui/focus/n;Z)V

    invoke-static {v7, v9, v1, v8, v9}, LK0/u;->v(LK0/w;Ljava/lang/String;Lx7/a;ILjava/lang/Object;)V

    new-instance v1, LH/h$n$h;

    iget-object v2, v0, LH/h$n;->L:LN/F;

    invoke-direct {v1, v2}, LH/h$n$h;-><init>(LN/F;)V

    invoke-static {v7, v9, v1, v8, v9}, LK0/u;->z(LK0/w;Ljava/lang/String;Lx7/a;ILjava/lang/Object;)V

    iget-object v1, v0, LH/h$n;->E:LS0/V;

    invoke-virtual {v1}, LS0/V;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, LM0/N;->h(J)Z

    move-result v1

    if-nez v1, :cond_4

    iget-boolean v1, v0, LH/h$n;->G:Z

    if-nez v1, :cond_4

    new-instance v1, LH/h$n$i;

    iget-object v2, v0, LH/h$n;->L:LN/F;

    invoke-direct {v1, v2}, LH/h$n$i;-><init>(LN/F;)V

    invoke-static {v7, v9, v1, v8, v9}, LK0/u;->f(LK0/w;Ljava/lang/String;Lx7/a;ILjava/lang/Object;)V

    iget-boolean v1, v0, LH/h$n;->F:Z

    if-eqz v1, :cond_4

    iget-boolean v1, v0, LH/h$n;->H:Z

    if-nez v1, :cond_4

    new-instance v1, LH/h$n$j;

    iget-object v2, v0, LH/h$n;->L:LN/F;

    invoke-direct {v1, v2}, LH/h$n$j;-><init>(LN/F;)V

    invoke-static {v7, v9, v1, v8, v9}, LK0/u;->h(LK0/w;Ljava/lang/String;Lx7/a;ILjava/lang/Object;)V

    :cond_4
    iget-boolean v1, v0, LH/h$n;->F:Z

    if-eqz v1, :cond_5

    iget-boolean v1, v0, LH/h$n;->H:Z

    if-nez v1, :cond_5

    new-instance v1, LH/h$n$a;

    iget-object v2, v0, LH/h$n;->L:LN/F;

    invoke-direct {v1, v2}, LH/h$n$a;-><init>(LN/F;)V

    invoke-static {v7, v9, v1, v8, v9}, LK0/u;->C(LK0/w;Ljava/lang/String;Lx7/a;ILjava/lang/Object;)V

    :cond_5
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LK0/w;

    invoke-virtual {p0, p1}, LH/h$n;->a(LK0/w;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
