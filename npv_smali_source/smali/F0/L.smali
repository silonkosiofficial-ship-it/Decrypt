.class public final LF0/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq0/g;
.implements Lq0/c;


# instance fields
.field private final C:Lq0/a;

.field private D:LF0/s;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lq0/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF0/L;->C:Lq0/a;

    return-void
.end method

.method public synthetic constructor <init>(Lq0/a;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    new-instance p1, Lq0/a;

    invoke-direct {p1}, Lq0/a;-><init>()V

    :cond_0
    invoke-direct {p0, p1}, LF0/L;-><init>(Lq0/a;)V

    return-void
.end method


# virtual methods
.method public B0(F)F
    .locals 1

    iget-object v0, p0, LF0/L;->C:Lq0/a;

    invoke-virtual {v0, p1}, Lq0/a;->B0(F)F

    move-result p1

    return p1
.end method

.method public C0(Lo0/n0;JJFLq0/h;Lo0/z0;I)V
    .locals 11

    move-object v0, p0

    iget-object v1, v0, LF0/L;->C:Lq0/a;

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    invoke-virtual/range {v1 .. v10}, Lq0/a;->C0(Lo0/n0;JJFLq0/h;Lo0/z0;I)V

    return-void
.end method

.method public F0()Lq0/d;
    .locals 1

    iget-object v0, p0, LF0/L;->C:Lq0/a;

    invoke-virtual {v0}, Lq0/a;->F0()Lq0/d;

    move-result-object v0

    return-object v0
.end method

.method public I(JFFZJJFLq0/h;Lo0/z0;I)V
    .locals 15

    move-object v0, p0

    iget-object v1, v0, LF0/L;->C:Lq0/a;

    move-wide/from16 v2, p1

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    invoke-virtual/range {v1 .. v14}, Lq0/a;->I(JFFZJJFLq0/h;Lo0/z0;I)V

    return-void
.end method

.method public J0(Lo0/E1;JJJJFLq0/h;Lo0/z0;II)V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, LF0/L;->C:Lq0/a;

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    invoke-virtual/range {v1 .. v15}, Lq0/a;->J0(Lo0/E1;JJJJFLq0/h;Lo0/z0;II)V

    return-void
.end method

.method public K0(J)I
    .locals 1

    iget-object v0, p0, LF0/L;->C:Lq0/a;

    invoke-virtual {v0, p1, p2}, Lq0/a;->K0(J)I

    move-result p1

    return p1
.end method

.method public O(F)J
    .locals 2

    iget-object v0, p0, LF0/L;->C:Lq0/a;

    invoke-virtual {v0, p1}, Lq0/a;->O(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public P(J)J
    .locals 1

    iget-object v0, p0, LF0/L;->C:Lq0/a;

    invoke-virtual {v0, p1, p2}, Lq0/a;->P(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public Q0(Lo0/Q1;JFLq0/h;Lo0/z0;I)V
    .locals 8

    iget-object v0, p0, LF0/L;->C:Lq0/a;

    move-object v1, p1

    move-wide v2, p2

    move v4, p4

    move-object v5, p5

    move-object v6, p6

    move v7, p7

    invoke-virtual/range {v0 .. v7}, Lq0/a;->Q0(Lo0/Q1;JFLq0/h;Lo0/z0;I)V

    return-void
.end method

.method public S0(F)I
    .locals 1

    iget-object v0, p0, LF0/L;->C:Lq0/a;

    invoke-virtual {v0, p1}, Lq0/a;->S0(F)I

    move-result p1

    return p1
.end method

.method public U0(JJJFLq0/h;Lo0/z0;I)V
    .locals 12

    move-object v0, p0

    iget-object v1, v0, LF0/L;->C:Lq0/a;

    move-wide v2, p1

    move-wide v4, p3

    move-wide/from16 v6, p5

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    invoke-virtual/range {v1 .. v11}, Lq0/a;->U0(JJJFLq0/h;Lo0/z0;I)V

    return-void
.end method

.method public V0(Lo0/E1;JFLq0/h;Lo0/z0;I)V
    .locals 8

    iget-object v0, p0, LF0/L;->C:Lq0/a;

    move-object v1, p1

    move-wide v2, p2

    move v4, p4

    move-object v5, p5

    move-object v6, p6

    move v7, p7

    invoke-virtual/range {v0 .. v7}, Lq0/a;->V0(Lo0/E1;JFLq0/h;Lo0/z0;I)V

    return-void
.end method

.method public W0()J
    .locals 2

    iget-object v0, p0, LF0/L;->C:Lq0/a;

    invoke-virtual {v0}, Lq0/a;->W0()J

    move-result-wide v0

    return-wide v0
.end method

.method public X(J)F
    .locals 1

    iget-object v0, p0, LF0/L;->C:Lq0/a;

    invoke-virtual {v0, p1, p2}, Lq0/a;->X(J)F

    move-result p1

    return p1
.end method

.method public Z0(JFJFLq0/h;Lo0/z0;I)V
    .locals 11

    move-object v0, p0

    iget-object v1, v0, LF0/L;->C:Lq0/a;

    move-wide v2, p1

    move v4, p3

    move-wide v5, p4

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    invoke-virtual/range {v1 .. v10}, Lq0/a;->Z0(JFJFLq0/h;Lo0/z0;I)V

    return-void
.end method

.method public a0(JJJJLq0/h;FLo0/z0;I)V
    .locals 14

    move-object v0, p0

    iget-object v1, v0, LF0/L;->C:Lq0/a;

    move-wide v2, p1

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move-object/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v13, p12

    invoke-virtual/range {v1 .. v13}, Lq0/a;->a0(JJJJLq0/h;FLo0/z0;I)V

    return-void
.end method

.method public b1(J)J
    .locals 1

    iget-object v0, p0, LF0/L;->C:Lq0/a;

    invoke-virtual {v0, p1, p2}, Lq0/a;->b1(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public d1(Lo0/n0;JJJFLq0/h;Lo0/z0;I)V
    .locals 13

    move-object v0, p0

    iget-object v1, v0, LF0/L;->C:Lq0/a;

    move-object v2, p1

    move-wide v3, p2

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p11

    invoke-virtual/range {v1 .. v12}, Lq0/a;->d1(Lo0/n0;JJJFLq0/h;Lo0/z0;I)V

    return-void
.end method

.method public e0(Lo0/n0;JJFILo0/R1;FLo0/z0;I)V
    .locals 13

    move-object v0, p0

    iget-object v1, v0, LF0/L;->C:Lq0/a;

    move-object v2, p1

    move-wide v3, p2

    move-wide/from16 v5, p4

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p11

    invoke-virtual/range {v1 .. v12}, Lq0/a;->e0(Lo0/n0;JJFILo0/R1;FLo0/z0;I)V

    return-void
.end method

.method public final f(Lo0/q0;JLF0/d0;Landroidx/compose/ui/d$c;Lr0/c;)V
    .locals 12

    .prologue
    const/4 v0, 0x4

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v0

    const/4 v1, 0x0

    move-object/from16 v2, p5

    move-object v3, v1

    :goto_0
    if-eqz v2, :cond_7

    instance-of v4, v2, LF0/s;

    if-eqz v4, :cond_0

    move-object v10, v2

    check-cast v10, LF0/s;

    move-object v5, p0

    move-object v6, p1

    move-wide v7, p2

    move-object/from16 v9, p4

    move-object/from16 v11, p6

    invoke-virtual/range {v5 .. v11}, LF0/L;->k(Lo0/q0;JLF0/d0;LF0/s;Lr0/c;)V

    goto :goto_3

    :cond_0
    invoke-virtual {v2}, Landroidx/compose/ui/d$c;->v1()I

    move-result v4

    and-int/2addr v4, v0

    if-eqz v4, :cond_6

    instance-of v4, v2, LF0/m;

    if-eqz v4, :cond_6

    move-object v4, v2

    check-cast v4, LF0/m;

    invoke-virtual {v4}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v4

    const/4 v5, 0x0

    move v6, v5

    :goto_1
    const/4 v7, 0x1

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Landroidx/compose/ui/d$c;->v1()I

    move-result v8

    and-int/2addr v8, v0

    if-eqz v8, :cond_4

    add-int/lit8 v6, v6, 0x1

    if-ne v6, v7, :cond_1

    move-object v2, v4

    goto :goto_2

    :cond_1
    if-nez v3, :cond_2

    new-instance v3, LX/b;

    const/16 v7, 0x10

    new-array v7, v7, [Landroidx/compose/ui/d$c;

    invoke-direct {v3, v7, v5}, LX/b;-><init>([Ljava/lang/Object;I)V

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v3, v2}, LX/b;->d(Ljava/lang/Object;)Z

    move-object v2, v1

    :cond_3
    invoke-virtual {v3, v4}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_4
    :goto_2
    invoke-virtual {v4}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v4

    goto :goto_1

    :cond_5
    if-ne v6, v7, :cond_6

    goto :goto_0

    :cond_6
    :goto_3
    invoke-static {v3}, LF0/k;->b(LX/b;)Landroidx/compose/ui/d$c;

    move-result-object v2

    goto :goto_0

    :cond_7
    return-void
.end method

.method public g1(J)F
    .locals 1

    iget-object v0, p0, LF0/L;->C:Lq0/a;

    invoke-virtual {v0, p1, p2}, Lq0/a;->g1(J)F

    move-result p1

    return p1
.end method

.method public getDensity()F
    .locals 1

    iget-object v0, p0, LF0/L;->C:Lq0/a;

    invoke-virtual {v0}, Lq0/a;->getDensity()F

    move-result v0

    return v0
.end method

.method public getLayoutDirection()LY0/v;
    .locals 1

    iget-object v0, p0, LF0/L;->C:Lq0/a;

    invoke-virtual {v0}, Lq0/a;->getLayoutDirection()LY0/v;

    move-result-object v0

    return-object v0
.end method

.method public i()J
    .locals 2

    iget-object v0, p0, LF0/L;->C:Lq0/a;

    invoke-virtual {v0}, Lq0/a;->i()J

    move-result-wide v0

    return-wide v0
.end method

.method public final k(Lo0/q0;JLF0/d0;LF0/s;Lr0/c;)V
    .locals 14

    .prologue
    move-object v1, p0

    move-object/from16 v0, p5

    iget-object v2, v1, LF0/L;->D:LF0/s;

    iput-object v0, v1, LF0/L;->D:LF0/s;

    iget-object v3, v1, LF0/L;->C:Lq0/a;

    invoke-virtual/range {p4 .. p4}, LF0/d0;->getLayoutDirection()LY0/v;

    move-result-object v4

    invoke-interface {v3}, Lq0/g;->F0()Lq0/d;

    move-result-object v5

    invoke-interface {v5}, Lq0/d;->getDensity()LY0/e;

    move-result-object v5

    invoke-interface {v3}, Lq0/g;->F0()Lq0/d;

    move-result-object v6

    invoke-interface {v6}, Lq0/d;->getLayoutDirection()LY0/v;

    move-result-object v6

    invoke-interface {v3}, Lq0/g;->F0()Lq0/d;

    move-result-object v7

    invoke-interface {v7}, Lq0/d;->h()Lo0/q0;

    move-result-object v7

    invoke-interface {v3}, Lq0/g;->F0()Lq0/d;

    move-result-object v8

    invoke-interface {v8}, Lq0/d;->i()J

    move-result-wide v8

    invoke-interface {v3}, Lq0/g;->F0()Lq0/d;

    move-result-object v10

    invoke-interface {v10}, Lq0/d;->f()Lr0/c;

    move-result-object v10

    invoke-interface {v3}, Lq0/g;->F0()Lq0/d;

    move-result-object v11

    move-object/from16 v12, p4

    invoke-interface {v11, v12}, Lq0/d;->a(LY0/e;)V

    invoke-interface {v11, v4}, Lq0/d;->b(LY0/v;)V

    move-object v4, p1

    invoke-interface {v11, p1}, Lq0/d;->g(Lo0/q0;)V

    move-wide/from16 v12, p2

    invoke-interface {v11, v12, v13}, Lq0/d;->d(J)V

    move-object/from16 v12, p6

    invoke-interface {v11, v12}, Lq0/d;->e(Lr0/c;)V

    invoke-interface {p1}, Lo0/q0;->m()V

    :try_start_0
    invoke-interface {v0, p0}, LF0/s;->y(Lq0/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Lo0/q0;->s()V

    invoke-interface {v3}, Lq0/g;->F0()Lq0/d;

    move-result-object v0

    invoke-interface {v0, v5}, Lq0/d;->a(LY0/e;)V

    invoke-interface {v0, v6}, Lq0/d;->b(LY0/v;)V

    invoke-interface {v0, v7}, Lq0/d;->g(Lo0/q0;)V

    invoke-interface {v0, v8, v9}, Lq0/d;->d(J)V

    invoke-interface {v0, v10}, Lq0/d;->e(Lr0/c;)V

    iput-object v2, v1, LF0/L;->D:LF0/s;

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    invoke-interface {p1}, Lo0/q0;->s()V

    invoke-interface {v3}, Lq0/g;->F0()Lq0/d;

    move-result-object v0

    invoke-interface {v0, v5}, Lq0/d;->a(LY0/e;)V

    invoke-interface {v0, v6}, Lq0/d;->b(LY0/v;)V

    invoke-interface {v0, v7}, Lq0/d;->g(Lo0/q0;)V

    invoke-interface {v0, v8, v9}, Lq0/d;->d(J)V

    invoke-interface {v0, v10}, Lq0/d;->e(Lr0/c;)V

    throw v2
.end method

.method public k0(F)J
    .locals 2

    iget-object v0, p0, LF0/L;->C:Lq0/a;

    invoke-virtual {v0, p1}, Lq0/a;->k0(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public l1()V
    .locals 10

    .prologue
    invoke-interface {p0}, Lq0/g;->F0()Lq0/d;

    move-result-object v0

    invoke-interface {v0}, Lq0/d;->h()Lo0/q0;

    move-result-object v0

    iget-object v1, p0, LF0/L;->D:LF0/s;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v1}, LF0/M;->a(LF0/j;)Landroidx/compose/ui/d$c;

    move-result-object v2

    const/4 v3, 0x4

    if-eqz v2, :cond_7

    invoke-static {v3}, LF0/f0;->a(I)I

    move-result v1

    const/4 v3, 0x0

    move-object v4, v3

    :goto_0
    if-eqz v2, :cond_9

    instance-of v5, v2, LF0/s;

    if-eqz v5, :cond_0

    check-cast v2, LF0/s;

    invoke-virtual {p0}, LF0/L;->F0()Lq0/d;

    move-result-object v5

    invoke-interface {v5}, Lq0/d;->f()Lr0/c;

    move-result-object v5

    invoke-virtual {p0, v2, v0, v5}, LF0/L;->s(LF0/s;Lo0/q0;Lr0/c;)V

    goto :goto_3

    :cond_0
    invoke-virtual {v2}, Landroidx/compose/ui/d$c;->v1()I

    move-result v5

    and-int/2addr v5, v1

    if-eqz v5, :cond_6

    instance-of v5, v2, LF0/m;

    if-eqz v5, :cond_6

    move-object v5, v2

    check-cast v5, LF0/m;

    invoke-virtual {v5}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v5

    const/4 v6, 0x0

    move v7, v6

    :goto_1
    const/4 v8, 0x1

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Landroidx/compose/ui/d$c;->v1()I

    move-result v9

    and-int/2addr v9, v1

    if-eqz v9, :cond_4

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v8, :cond_1

    move-object v2, v5

    goto :goto_2

    :cond_1
    if-nez v4, :cond_2

    new-instance v4, LX/b;

    const/16 v8, 0x10

    new-array v8, v8, [Landroidx/compose/ui/d$c;

    invoke-direct {v4, v8, v6}, LX/b;-><init>([Ljava/lang/Object;I)V

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v4, v2}, LX/b;->d(Ljava/lang/Object;)Z

    move-object v2, v3

    :cond_3
    invoke-virtual {v4, v5}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_4
    :goto_2
    invoke-virtual {v5}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v5

    goto :goto_1

    :cond_5
    if-ne v7, v8, :cond_6

    goto :goto_0

    :cond_6
    :goto_3
    invoke-static {v4}, LF0/k;->b(LX/b;)Landroidx/compose/ui/d$c;

    move-result-object v2

    goto :goto_0

    :cond_7
    invoke-static {v3}, LF0/f0;->a(I)I

    move-result v2

    invoke-static {v1, v2}, LF0/k;->h(LF0/j;I)LF0/d0;

    move-result-object v2

    invoke-virtual {v2}, LF0/d0;->n2()Landroidx/compose/ui/d$c;

    move-result-object v3

    invoke-interface {v1}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v1

    if-ne v3, v1, :cond_8

    invoke-virtual {v2}, LF0/d0;->o2()LF0/d0;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    :cond_8
    invoke-virtual {p0}, LF0/L;->F0()Lq0/d;

    move-result-object v1

    invoke-interface {v1}, Lq0/d;->f()Lr0/c;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, LF0/d0;->J2(Lo0/q0;Lr0/c;)V

    :cond_9
    return-void
.end method

.method public o0(I)F
    .locals 1

    iget-object v0, p0, LF0/L;->C:Lq0/a;

    invoke-virtual {v0, p1}, Lq0/a;->o0(I)F

    move-result p1

    return p1
.end method

.method public p1(Lo0/Q1;Lo0/n0;FLq0/h;Lo0/z0;I)V
    .locals 7

    iget-object v0, p0, LF0/L;->C:Lq0/a;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lq0/a;->p1(Lo0/Q1;Lo0/n0;FLq0/h;Lo0/z0;I)V

    return-void
.end method

.method public q0(F)F
    .locals 1

    iget-object v0, p0, LF0/L;->C:Lq0/a;

    invoke-virtual {v0, p1}, Lq0/a;->q0(F)F

    move-result p1

    return p1
.end method

.method public final s(LF0/s;Lo0/q0;Lr0/c;)V
    .locals 8

    const/4 v0, 0x4

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v0

    invoke-static {p1, v0}, LF0/k;->h(LF0/j;I)LF0/d0;

    move-result-object v5

    invoke-virtual {v5}, LF0/d0;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/u;->d(J)J

    move-result-wide v3

    invoke-virtual {v5}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->c0()LF0/L;

    move-result-object v1

    move-object v2, p2

    move-object v6, p1

    move-object v7, p3

    invoke-virtual/range {v1 .. v7}, LF0/L;->k(Lo0/q0;JLF0/d0;LF0/s;Lr0/c;)V

    return-void
.end method

.method public v0()F
    .locals 1

    iget-object v0, p0, LF0/L;->C:Lq0/a;

    invoke-virtual {v0}, Lq0/a;->v0()F

    move-result v0

    return v0
.end method

.method public y0(JJJFILo0/R1;FLo0/z0;I)V
    .locals 14

    move-object v0, p0

    iget-object v1, v0, LF0/L;->C:Lq0/a;

    move-wide v2, p1

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v13, p12

    invoke-virtual/range {v1 .. v13}, Lq0/a;->y0(JJJFILo0/R1;FLo0/z0;I)V

    return-void
.end method
