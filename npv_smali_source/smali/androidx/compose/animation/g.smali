.class final Landroidx/compose/animation/g;
.super Lt/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/animation/g$a;
    }
.end annotation


# instance fields
.field private P:Lu/s0;

.field private Q:Lu/s0$a;

.field private R:Lu/s0$a;

.field private S:Lu/s0$a;

.field private T:Landroidx/compose/animation/h;

.field private U:Landroidx/compose/animation/j;

.field private V:Lx7/a;

.field private W:Lt/r;

.field private X:Z

.field private Y:J

.field private Z:J

.field private a0:Lh0/c;

.field private final b0:Lx7/l;

.field private final c0:Lx7/l;


# direct methods
.method public constructor <init>(Lu/s0;Lu/s0$a;Lu/s0$a;Lu/s0$a;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lx7/a;Lt/r;)V
    .locals 0

    invoke-direct {p0}, Lt/s;-><init>()V

    iput-object p1, p0, Landroidx/compose/animation/g;->P:Lu/s0;

    iput-object p2, p0, Landroidx/compose/animation/g;->Q:Lu/s0$a;

    iput-object p3, p0, Landroidx/compose/animation/g;->R:Lu/s0$a;

    iput-object p4, p0, Landroidx/compose/animation/g;->S:Lu/s0$a;

    iput-object p5, p0, Landroidx/compose/animation/g;->T:Landroidx/compose/animation/h;

    iput-object p6, p0, Landroidx/compose/animation/g;->U:Landroidx/compose/animation/j;

    iput-object p7, p0, Landroidx/compose/animation/g;->V:Lx7/a;

    iput-object p8, p0, Landroidx/compose/animation/g;->W:Lt/r;

    invoke-static {}, Lt/g;->a()J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/compose/animation/g;->Y:J

    const/16 p7, 0xf

    const/4 p8, 0x0

    const/4 p3, 0x0

    const/4 p4, 0x0

    const/4 p5, 0x0

    const/4 p6, 0x0

    invoke-static/range {p3 .. p8}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/compose/animation/g;->Z:J

    new-instance p1, Landroidx/compose/animation/g$i;

    invoke-direct {p1, p0}, Landroidx/compose/animation/g$i;-><init>(Landroidx/compose/animation/g;)V

    iput-object p1, p0, Landroidx/compose/animation/g;->b0:Lx7/l;

    new-instance p1, Landroidx/compose/animation/g$j;

    invoke-direct {p1, p0}, Landroidx/compose/animation/g$j;-><init>(Landroidx/compose/animation/g;)V

    iput-object p1, p0, Landroidx/compose/animation/g;->c0:Lx7/l;

    return-void
.end method

.method private final a2(J)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/animation/g;->X:Z

    iput-wide p1, p0, Landroidx/compose/animation/g;->Z:J

    return-void
.end method


# virtual methods
.method public D1()V
    .locals 2

    invoke-super {p0}, Landroidx/compose/ui/d$c;->D1()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/animation/g;->X:Z

    invoke-static {}, Lt/g;->a()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/animation/g;->Y:J

    return-void
.end method

.method public final T1()Lh0/c;
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/compose/animation/g;->P:Lu/s0;

    invoke-virtual {v0}, Lu/s0;->n()Lu/s0$b;

    move-result-object v0

    sget-object v1, Lt/m;->C:Lt/m;

    sget-object v2, Lt/m;->D:Lt/m;

    invoke-interface {v0, v1, v2}, Lu/s0$b;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/compose/animation/g;->T:Landroidx/compose/animation/h;

    invoke-virtual {v0}, Landroidx/compose/animation/h;->b()Lt/C;

    move-result-object v0

    invoke-virtual {v0}, Lt/C;->a()Lt/i;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lt/i;->a()Lh0/c;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v0

    goto :goto_2

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/compose/animation/g;->U:Landroidx/compose/animation/j;

    invoke-virtual {v0}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object v0

    invoke-virtual {v0}, Lt/C;->a()Lt/i;

    move-result-object v0

    if-eqz v0, :cond_4

    :goto_1
    invoke-virtual {v0}, Lt/i;->a()Lh0/c;

    move-result-object v1

    goto :goto_2

    :cond_2
    iget-object v0, p0, Landroidx/compose/animation/g;->U:Landroidx/compose/animation/j;

    invoke-virtual {v0}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object v0

    invoke-virtual {v0}, Lt/C;->a()Lt/i;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lt/i;->a()Lh0/c;

    move-result-object v0

    if-nez v0, :cond_0

    :cond_3
    iget-object v0, p0, Landroidx/compose/animation/g;->T:Landroidx/compose/animation/h;

    invoke-virtual {v0}, Landroidx/compose/animation/h;->b()Lt/C;

    move-result-object v0

    invoke-virtual {v0}, Lt/C;->a()Lt/i;

    move-result-object v0

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    :goto_2
    return-object v1
.end method

.method public final U1()Landroidx/compose/animation/h;
    .locals 1

    iget-object v0, p0, Landroidx/compose/animation/g;->T:Landroidx/compose/animation/h;

    return-object v0
.end method

.method public final V1()Landroidx/compose/animation/j;
    .locals 1

    iget-object v0, p0, Landroidx/compose/animation/g;->U:Landroidx/compose/animation/j;

    return-object v0
.end method

.method public final W1(Lx7/a;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/g;->V:Lx7/a;

    return-void
.end method

.method public final X1(Landroidx/compose/animation/h;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/g;->T:Landroidx/compose/animation/h;

    return-void
.end method

.method public final Y1(Landroidx/compose/animation/j;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/g;->U:Landroidx/compose/animation/j;

    return-void
.end method

.method public final Z1(Lt/r;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/g;->W:Lt/r;

    return-void
.end method

.method public final b2(Lu/s0$a;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/g;->R:Lu/s0$a;

    return-void
.end method

.method public final c2(Lu/s0$a;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/g;->Q:Lu/s0$a;

    return-void
.end method

.method public final d2(Lu/s0$a;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/g;->S:Lu/s0$a;

    return-void
.end method

.method public final e2(Lu/s0;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/g;->P:Lu/s0;

    return-void
.end method

.method public f(LD0/M;LD0/G;J)LD0/K;
    .locals 20

    .prologue
    move-object/from16 v0, p0

    move-wide/from16 v1, p3

    iget-object v3, v0, Landroidx/compose/animation/g;->P:Lu/s0;

    invoke-virtual {v3}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, v0, Landroidx/compose/animation/g;->P:Lu/s0;

    invoke-virtual {v4}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x0

    if-ne v3, v4, :cond_0

    iput-object v5, v0, Landroidx/compose/animation/g;->a0:Lh0/c;

    goto :goto_0

    :cond_0
    iget-object v3, v0, Landroidx/compose/animation/g;->a0:Lh0/c;

    if-nez v3, :cond_2

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/animation/g;->T1()Lh0/c;

    move-result-object v3

    if-nez v3, :cond_1

    sget-object v3, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v3}, Lh0/c$a;->o()Lh0/c;

    move-result-object v3

    :cond_1
    iput-object v3, v0, Landroidx/compose/animation/g;->a0:Lh0/c;

    :cond_2
    :goto_0
    invoke-interface/range {p1 .. p1}, LD0/o;->A0()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface/range {p2 .. p4}, LD0/G;->U(J)LD0/X;

    move-result-object v3

    invoke-virtual {v3}, LD0/X;->I0()I

    move-result v4

    invoke-virtual {v3}, LD0/X;->w0()I

    move-result v5

    invoke-static {v4, v5}, LY0/u;->a(II)J

    move-result-wide v4

    iput-wide v4, v0, Landroidx/compose/animation/g;->Y:J

    invoke-direct {v0, v1, v2}, Landroidx/compose/animation/g;->a2(J)V

    invoke-static {v4, v5}, LY0/t;->g(J)I

    move-result v7

    invoke-static {v4, v5}, LY0/t;->f(J)I

    move-result v8

    new-instance v10, Landroidx/compose/animation/g$b;

    invoke-direct {v10, v3}, Landroidx/compose/animation/g$b;-><init>(LD0/X;)V

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v9, 0x0

    move-object/from16 v6, p1

    invoke-static/range {v6 .. v12}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object v1

    return-object v1

    :cond_3
    iget-object v3, v0, Landroidx/compose/animation/g;->V:Lx7/a;

    invoke-interface {v3}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_a

    iget-object v3, v0, Landroidx/compose/animation/g;->W:Lt/r;

    invoke-interface {v3}, Lt/r;->a()Lx7/l;

    move-result-object v12

    invoke-interface/range {p2 .. p4}, LD0/G;->U(J)LD0/X;

    move-result-object v7

    invoke-virtual {v7}, LD0/X;->I0()I

    move-result v3

    invoke-virtual {v7}, LD0/X;->w0()I

    move-result v4

    invoke-static {v3, v4}, LY0/u;->a(II)J

    move-result-wide v3

    iget-wide v8, v0, Landroidx/compose/animation/g;->Y:J

    invoke-static {v8, v9}, Lt/g;->b(J)Z

    move-result v6

    if-eqz v6, :cond_4

    iget-wide v8, v0, Landroidx/compose/animation/g;->Y:J

    move-wide v14, v8

    goto :goto_1

    :cond_4
    move-wide v14, v3

    :goto_1
    iget-object v6, v0, Landroidx/compose/animation/g;->Q:Lu/s0$a;

    if-eqz v6, :cond_5

    iget-object v5, v0, Landroidx/compose/animation/g;->b0:Lx7/l;

    new-instance v8, Landroidx/compose/animation/g$e;

    invoke-direct {v8, v0, v14, v15}, Landroidx/compose/animation/g$e;-><init>(Landroidx/compose/animation/g;J)V

    invoke-virtual {v6, v5, v8}, Lu/s0$a;->a(Lx7/l;Lx7/l;)LV/G1;

    move-result-object v5

    :cond_5
    if-eqz v5, :cond_6

    invoke-interface {v5}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LY0/t;

    invoke-virtual {v3}, LY0/t;->j()J

    move-result-wide v3

    :cond_6
    invoke-static {v1, v2, v3, v4}, LY0/c;->f(JJ)J

    move-result-wide v1

    iget-object v3, v0, Landroidx/compose/animation/g;->R:Lu/s0$a;

    if-eqz v3, :cond_7

    sget-object v4, Landroidx/compose/animation/g$f;->D:Landroidx/compose/animation/g$f;

    new-instance v5, Landroidx/compose/animation/g$g;

    invoke-direct {v5, v0, v14, v15}, Landroidx/compose/animation/g$g;-><init>(Landroidx/compose/animation/g;J)V

    invoke-virtual {v3, v4, v5}, Lu/s0$a;->a(Lx7/l;Lx7/l;)LV/G1;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-interface {v3}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LY0/p;

    invoke-virtual {v3}, LY0/p;->n()J

    move-result-wide v3

    :goto_2
    move-wide v10, v3

    goto :goto_3

    :cond_7
    sget-object v3, LY0/p;->b:LY0/p$a;

    invoke-virtual {v3}, LY0/p$a;->a()J

    move-result-wide v3

    goto :goto_2

    :goto_3
    iget-object v3, v0, Landroidx/compose/animation/g;->S:Lu/s0$a;

    if-eqz v3, :cond_8

    iget-object v4, v0, Landroidx/compose/animation/g;->c0:Lx7/l;

    new-instance v5, Landroidx/compose/animation/g$h;

    invoke-direct {v5, v0, v14, v15}, Landroidx/compose/animation/g$h;-><init>(Landroidx/compose/animation/g;J)V

    invoke-virtual {v3, v4, v5}, Lu/s0$a;->a(Lx7/l;Lx7/l;)LV/G1;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-interface {v3}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LY0/p;

    invoke-virtual {v3}, LY0/p;->n()J

    move-result-wide v3

    goto :goto_4

    :cond_8
    sget-object v3, LY0/p;->b:LY0/p$a;

    invoke-virtual {v3}, LY0/p$a;->a()J

    move-result-wide v3

    :goto_4
    iget-object v13, v0, Landroidx/compose/animation/g;->a0:Lh0/c;

    if-eqz v13, :cond_9

    sget-object v18, LY0/v;->C:LY0/v;

    move-wide/from16 v16, v1

    invoke-interface/range {v13 .. v18}, Lh0/c;->a(JJLY0/v;)J

    move-result-wide v5

    goto :goto_5

    :cond_9
    sget-object v5, LY0/p;->b:LY0/p$a;

    invoke-virtual {v5}, LY0/p$a;->a()J

    move-result-wide v5

    :goto_5
    invoke-static {v5, v6, v3, v4}, LY0/p;->l(JJ)J

    move-result-wide v8

    invoke-static {v1, v2}, LY0/t;->g(J)I

    move-result v14

    invoke-static {v1, v2}, LY0/t;->f(J)I

    move-result v15

    new-instance v17, Landroidx/compose/animation/g$c;

    move-object/from16 v6, v17

    invoke-direct/range {v6 .. v12}, Landroidx/compose/animation/g$c;-><init>(LD0/X;JJLx7/l;)V

    const/16 v18, 0x4

    const/16 v19, 0x0

    const/16 v16, 0x0

    move-object/from16 v13, p1

    invoke-static/range {v13 .. v19}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object v1

    return-object v1

    :cond_a
    invoke-interface/range {p2 .. p4}, LD0/G;->U(J)LD0/X;

    move-result-object v1

    invoke-virtual {v1}, LD0/X;->I0()I

    move-result v3

    invoke-virtual {v1}, LD0/X;->w0()I

    move-result v4

    new-instance v6, Landroidx/compose/animation/g$d;

    invoke-direct {v6, v1}, Landroidx/compose/animation/g$d;-><init>(LD0/X;)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v8}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object v1

    return-object v1
.end method

.method public final f2(Lt/m;J)J
    .locals 1

    .prologue
    sget-object v0, Landroidx/compose/animation/g$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Landroidx/compose/animation/g;->U:Landroidx/compose/animation/j;

    invoke-virtual {p1}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object p1

    invoke-virtual {p1}, Lt/C;->a()Lt/i;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lt/i;->d()Lx7/l;

    move-result-object p1

    if-eqz p1, :cond_2

    :goto_0
    invoke-static {p2, p3}, LY0/t;->b(J)LY0/t;

    move-result-object p2

    invoke-interface {p1, p2}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LY0/t;

    invoke-virtual {p1}, LY0/t;->j()J

    move-result-wide p2

    goto :goto_1

    :cond_0
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_1
    iget-object p1, p0, Landroidx/compose/animation/g;->T:Landroidx/compose/animation/h;

    invoke-virtual {p1}, Landroidx/compose/animation/h;->b()Lt/C;

    move-result-object p1

    invoke-virtual {p1}, Lt/C;->a()Lt/i;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lt/i;->d()Lx7/l;

    move-result-object p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    return-wide p2
.end method

.method public final g2(Lt/m;J)J
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/compose/animation/g;->T:Landroidx/compose/animation/h;

    invoke-virtual {v0}, Landroidx/compose/animation/h;->b()Lt/C;

    move-result-object v0

    invoke-virtual {v0}, Lt/C;->f()Lt/y;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lt/y;->b()Lx7/l;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p2, p3}, LY0/t;->b(J)LY0/t;

    move-result-object v1

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/p;

    invoke-virtual {v0}, LY0/p;->n()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    sget-object v0, LY0/p;->b:LY0/p$a;

    invoke-virtual {v0}, LY0/p$a;->a()J

    move-result-wide v0

    :goto_0
    iget-object v2, p0, Landroidx/compose/animation/g;->U:Landroidx/compose/animation/j;

    invoke-virtual {v2}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object v2

    invoke-virtual {v2}, Lt/C;->f()Lt/y;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lt/y;->b()Lx7/l;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {p2, p3}, LY0/t;->b(J)LY0/t;

    move-result-object p2

    invoke-interface {v2, p2}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LY0/p;

    invoke-virtual {p2}, LY0/p;->n()J

    move-result-wide p2

    goto :goto_1

    :cond_1
    sget-object p2, LY0/p;->b:LY0/p$a;

    invoke-virtual {p2}, LY0/p$a;->a()J

    move-result-wide p2

    :goto_1
    sget-object v2, Landroidx/compose/animation/g$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    const/4 v2, 0x1

    if-eq p1, v2, :cond_3

    const/4 v2, 0x2

    if-eq p1, v2, :cond_4

    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    move-wide v0, p2

    goto :goto_2

    :cond_2
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_3
    sget-object p1, LY0/p;->b:LY0/p$a;

    invoke-virtual {p1}, LY0/p$a;->a()J

    move-result-wide v0

    :cond_4
    :goto_2
    return-wide v0
.end method

.method public final h2(Lt/m;J)J
    .locals 10

    .prologue
    iget-object v0, p0, Landroidx/compose/animation/g;->a0:Lh0/c;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    sget-object p1, LY0/p;->b:LY0/p$a;

    invoke-virtual {p1}, LY0/p$a;->a()J

    move-result-wide p1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroidx/compose/animation/g;->T1()Lh0/c;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Landroidx/compose/animation/g;->a0:Lh0/c;

    invoke-virtual {p0}, Landroidx/compose/animation/g;->T1()Lh0/c;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    sget-object v0, Landroidx/compose/animation/g$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 v0, 0x3

    if-ne p1, v0, :cond_4

    iget-object p1, p0, Landroidx/compose/animation/g;->U:Landroidx/compose/animation/j;

    invoke-virtual {p1}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object p1

    invoke-virtual {p1}, Lt/C;->a()Lt/i;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lt/i;->d()Lx7/l;

    move-result-object p1

    invoke-static {p2, p3}, LY0/t;->b(J)LY0/t;

    move-result-object v0

    invoke-interface {p1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LY0/t;

    invoke-virtual {p1}, LY0/t;->j()J

    move-result-wide v6

    invoke-virtual {p0}, Landroidx/compose/animation/g;->T1()Lh0/c;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object p1, LY0/v;->C:LY0/v;

    move-wide v1, p2

    move-wide v3, v6

    move-object v5, p1

    invoke-interface/range {v0 .. v5}, Lh0/c;->a(JJLY0/v;)J

    move-result-wide v8

    iget-object v0, p0, Landroidx/compose/animation/g;->a0:Lh0/c;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface/range {v0 .. v5}, Lh0/c;->a(JJLY0/v;)J

    move-result-wide p1

    invoke-static {v8, v9, p1, p2}, LY0/p;->k(JJ)J

    move-result-wide p1

    goto :goto_1

    :cond_4
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :goto_1
    return-wide p1
.end method
