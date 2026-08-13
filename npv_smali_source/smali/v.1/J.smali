.class public final Lv/J;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/u;
.implements LF0/s;
.implements LF0/z0;
.implements LF0/i0;


# instance fields
.field private P:Lx7/l;

.field private Q:Lx7/l;

.field private R:Lx7/l;

.field private S:F

.field private T:Z

.field private U:J

.field private V:F

.field private W:F

.field private X:Z

.field private Y:Lv/W;

.field private Z:Landroid/view/View;

.field private a0:LY0/e;

.field private b0:Lv/V;

.field private final c0:LV/w0;

.field private d0:LV/G1;

.field private e0:J

.field private f0:LY0/t;

.field private g0:LY8/j;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lx7/l;Lx7/l;Lx7/l;FZJFFZLv/W;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, Lv/J;->P:Lx7/l;

    iput-object p2, p0, Lv/J;->Q:Lx7/l;

    iput-object p3, p0, Lv/J;->R:Lx7/l;

    iput p4, p0, Lv/J;->S:F

    iput-boolean p5, p0, Lv/J;->T:Z

    iput-wide p6, p0, Lv/J;->U:J

    iput p8, p0, Lv/J;->V:F

    iput p9, p0, Lv/J;->W:F

    iput-boolean p10, p0, Lv/J;->X:Z

    iput-object p11, p0, Lv/J;->Y:Lv/W;

    const/4 p1, 0x0

    invoke-static {}, LV/v1;->j()LV/u1;

    move-result-object p2

    invoke-static {p1, p2}, LV/v1;->h(Ljava/lang/Object;LV/u1;)LV/w0;

    move-result-object p1

    iput-object p1, p0, Lv/J;->c0:LV/w0;

    sget-object p1, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {p1}, Ln0/g$a;->b()J

    move-result-wide p1

    iput-wide p1, p0, Lv/J;->e0:J

    return-void
.end method

.method public synthetic constructor <init>(Lx7/l;Lx7/l;Lx7/l;FZJFFZLv/W;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p11}, Lv/J;-><init>(Lx7/l;Lx7/l;Lx7/l;FZJFFZLv/W;)V

    return-void
.end method

.method private final I0()LD0/t;
    .locals 1

    iget-object v0, p0, Lv/J;->c0:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD0/t;

    return-object v0
.end method

.method public static final synthetic T1(Lv/J;)LY8/j;
    .locals 0

    iget-object p0, p0, Lv/J;->g0:LY8/j;

    return-object p0
.end method

.method public static final synthetic U1(Lv/J;)LD0/t;
    .locals 0

    invoke-direct {p0}, Lv/J;->I0()LD0/t;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic V1(Lv/J;)Lv/V;
    .locals 0

    iget-object p0, p0, Lv/J;->b0:Lv/V;

    return-object p0
.end method

.method public static final synthetic W1(Lv/J;)J
    .locals 2

    iget-wide v0, p0, Lv/J;->e0:J

    return-wide v0
.end method

.method public static final synthetic X1(Lv/J;)V
    .locals 0

    invoke-direct {p0}, Lv/J;->c2()V

    return-void
.end method

.method private final Y1()J
    .locals 2

    .prologue
    iget-object v0, p0, Lv/J;->d0:LV/G1;

    if-nez v0, :cond_0

    new-instance v0, Lv/J$a;

    invoke-direct {v0, p0}, Lv/J$a;-><init>(Lv/J;)V

    invoke-static {v0}, LV/v1;->e(Lx7/a;)LV/G1;

    move-result-object v0

    iput-object v0, p0, Lv/J;->d0:LV/G1;

    :cond_0
    iget-object v0, p0, Lv/J;->d0:LV/G1;

    if-eqz v0, :cond_1

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/g;

    invoke-virtual {v0}, Ln0/g;->v()J

    move-result-wide v0

    goto :goto_0

    :cond_1
    sget-object v0, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {v0}, Ln0/g$a;->b()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method private final Z1()V
    .locals 11

    .prologue
    iget-object v0, p0, Lv/J;->b0:Lv/V;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lv/V;->dismiss()V

    :cond_0
    iget-object v0, p0, Lv/J;->Z:Landroid/view/View;

    if-nez v0, :cond_1

    invoke-static {p0}, LF0/l;->a(LF0/j;)Landroid/view/View;

    move-result-object v0

    :cond_1
    move-object v2, v0

    iput-object v2, p0, Lv/J;->Z:Landroid/view/View;

    iget-object v0, p0, Lv/J;->a0:LY0/e;

    if-nez v0, :cond_2

    invoke-static {p0}, LF0/k;->i(LF0/j;)LY0/e;

    move-result-object v0

    :cond_2
    move-object v9, v0

    iput-object v9, p0, Lv/J;->a0:LY0/e;

    iget-object v1, p0, Lv/J;->Y:Lv/W;

    iget-boolean v3, p0, Lv/J;->T:Z

    iget-wide v4, p0, Lv/J;->U:J

    iget v6, p0, Lv/J;->V:F

    iget v7, p0, Lv/J;->W:F

    iget-boolean v8, p0, Lv/J;->X:Z

    iget v10, p0, Lv/J;->S:F

    invoke-interface/range {v1 .. v10}, Lv/W;->b(Landroid/view/View;ZJFFZLY0/e;F)Lv/V;

    move-result-object v0

    iput-object v0, p0, Lv/J;->b0:Lv/V;

    invoke-direct {p0}, Lv/J;->d2()V

    return-void
.end method

.method private final a2(LD0/t;)V
    .locals 1

    iget-object v0, p0, Lv/J;->c0:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final c2()V
    .locals 8

    .prologue
    iget-object v0, p0, Lv/J;->a0:LY0/e;

    if-nez v0, :cond_0

    invoke-static {p0}, LF0/k;->i(LF0/j;)LY0/e;

    move-result-object v0

    iput-object v0, p0, Lv/J;->a0:LY0/e;

    :cond_0
    iget-object v1, p0, Lv/J;->P:Lx7/l;

    invoke-interface {v1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/g;

    invoke-virtual {v1}, Ln0/g;->v()J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/h;->c(J)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-direct {p0}, Lv/J;->Y1()J

    move-result-wide v3

    invoke-static {v3, v4}, Ln0/h;->c(J)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-direct {p0}, Lv/J;->Y1()J

    move-result-wide v3

    invoke-static {v3, v4, v1, v2}, Ln0/g;->r(JJ)J

    move-result-wide v1

    iput-wide v1, p0, Lv/J;->e0:J

    iget-object v1, p0, Lv/J;->Q:Lx7/l;

    if-eqz v1, :cond_2

    invoke-interface {v1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/g;

    invoke-virtual {v0}, Ln0/g;->v()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/g;->d(J)Ln0/g;

    move-result-object v0

    invoke-virtual {v0}, Ln0/g;->v()J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/h;->c(J)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ln0/g;->v()J

    move-result-wide v0

    invoke-direct {p0}, Lv/J;->Y1()J

    move-result-wide v2

    invoke-static {v2, v3, v0, v1}, Ln0/g;->r(JJ)J

    move-result-wide v0

    :goto_1
    move-wide v5, v0

    goto :goto_2

    :cond_2
    sget-object v0, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {v0}, Ln0/g$a;->b()J

    move-result-wide v0

    goto :goto_1

    :goto_2
    iget-object v0, p0, Lv/J;->b0:Lv/V;

    if-nez v0, :cond_3

    invoke-direct {p0}, Lv/J;->Z1()V

    :cond_3
    iget-object v2, p0, Lv/J;->b0:Lv/V;

    if-eqz v2, :cond_4

    iget-wide v3, p0, Lv/J;->e0:J

    iget v7, p0, Lv/J;->S:F

    invoke-interface/range {v2 .. v7}, Lv/V;->b(JJF)V

    :cond_4
    invoke-direct {p0}, Lv/J;->d2()V

    return-void

    :cond_5
    sget-object v0, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {v0}, Ln0/g$a;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lv/J;->e0:J

    iget-object v0, p0, Lv/J;->b0:Lv/V;

    if-eqz v0, :cond_6

    invoke-interface {v0}, Lv/V;->dismiss()V

    :cond_6
    return-void
.end method

.method private final d2()V
    .locals 5

    .prologue
    iget-object v0, p0, Lv/J;->b0:Lv/V;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lv/J;->a0:LY0/e;

    if-nez v1, :cond_1

    return-void

    :cond_1
    invoke-interface {v0}, Lv/V;->a()J

    move-result-wide v2

    iget-object v4, p0, Lv/J;->f0:LY0/t;

    invoke-static {v2, v3, v4}, LY0/t;->d(JLjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, Lv/J;->R:Lx7/l;

    if-eqz v2, :cond_2

    invoke-interface {v0}, Lv/V;->a()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/u;->d(J)J

    move-result-wide v3

    invoke-interface {v1, v3, v4}, LY0/e;->P(J)J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/l;->c(J)LY0/l;

    move-result-object v1

    invoke-interface {v2, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-interface {v0}, Lv/V;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/t;->b(J)LY0/t;

    move-result-object v0

    iput-object v0, p0, Lv/J;->f0:LY0/t;

    :cond_3
    return-void
.end method


# virtual methods
.method public D1()V
    .locals 9

    invoke-virtual {p0}, Lv/J;->L0()V

    const/4 v0, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v1, v2, v2, v0, v2}, LY8/m;->b(ILY8/d;Lx7/l;ILjava/lang/Object;)LY8/j;

    move-result-object v0

    iput-object v0, p0, Lv/J;->g0:LY8/j;

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->t1()LW8/N;

    move-result-object v3

    new-instance v6, Lv/J$c;

    invoke-direct {v6, p0, v2}, Lv/J$c;-><init>(Lv/J;Lm7/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    return-void
.end method

.method public E1()V
    .locals 1

    .prologue
    iget-object v0, p0, Lv/J;->b0:Lv/V;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lv/V;->dismiss()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lv/J;->b0:Lv/V;

    return-void
.end method

.method public L0()V
    .locals 1

    new-instance v0, Lv/J$d;

    invoke-direct {v0, p0}, Lv/J$d;-><init>(Lv/J;)V

    invoke-static {p0, v0}, LF0/j0;->a(Landroidx/compose/ui/d$c;Lx7/a;)V

    return-void
.end method

.method public M0(LK0/w;)V
    .locals 2

    invoke-static {}, Lv/K;->b()LK0/v;

    move-result-object v0

    new-instance v1, Lv/J$b;

    invoke-direct {v1, p0}, Lv/J$b;-><init>(Lv/J;)V

    invoke-interface {p1, v0, v1}, LK0/w;->d(LK0/v;Ljava/lang/Object;)V

    return-void
.end method

.method public final b2(Lx7/l;Lx7/l;FZJFFZLx7/l;Lv/W;)V
    .locals 20

    .prologue
    move-object/from16 v0, p0

    move/from16 v1, p3

    move/from16 v2, p4

    move-wide/from16 v3, p5

    move/from16 v5, p7

    move/from16 v6, p8

    move/from16 v7, p9

    move-object/from16 v8, p11

    iget v9, v0, Lv/J;->S:F

    iget-wide v10, v0, Lv/J;->U:J

    iget v12, v0, Lv/J;->V:F

    iget-boolean v13, v0, Lv/J;->T:Z

    iget v14, v0, Lv/J;->W:F

    iget-boolean v15, v0, Lv/J;->X:Z

    move/from16 v16, v15

    iget-object v15, v0, Lv/J;->Y:Lv/W;

    move-object/from16 v17, v15

    iget-object v15, v0, Lv/J;->Z:Landroid/view/View;

    move-object/from16 v18, v15

    iget-object v15, v0, Lv/J;->a0:LY0/e;

    move-object/from16 v19, v15

    move-object/from16 v15, p1

    iput-object v15, v0, Lv/J;->P:Lx7/l;

    move-object/from16 v15, p2

    iput-object v15, v0, Lv/J;->Q:Lx7/l;

    iput v1, v0, Lv/J;->S:F

    iput-boolean v2, v0, Lv/J;->T:Z

    iput-wide v3, v0, Lv/J;->U:J

    iput v5, v0, Lv/J;->V:F

    iput v6, v0, Lv/J;->W:F

    iput-boolean v7, v0, Lv/J;->X:Z

    move-object/from16 v15, p10

    iput-object v15, v0, Lv/J;->R:Lx7/l;

    iput-object v8, v0, Lv/J;->Y:Lv/W;

    invoke-static/range {p0 .. p0}, LF0/l;->a(LF0/j;)Landroid/view/View;

    move-result-object v15

    move-object/from16 p1, v15

    invoke-static/range {p0 .. p0}, LF0/k;->i(LF0/j;)LY0/e;

    move-result-object v15

    move-object/from16 p2, v15

    iget-object v15, v0, Lv/J;->b0:Lv/V;

    if-eqz v15, :cond_2

    invoke-static {v1, v9}, Lv/K;->a(FF)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface/range {p11 .. p11}, Lv/W;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    invoke-static {v3, v4, v10, v11}, LY0/l;->f(JJ)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v5, v12}, LY0/i;->s(FF)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v6, v14}, LY0/i;->s(FF)Z

    move-result v1

    if-eqz v1, :cond_1

    if-ne v2, v13, :cond_1

    move/from16 v1, v16

    if-ne v7, v1, :cond_1

    move-object/from16 v1, v17

    invoke-static {v8, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    move-object/from16 v2, p1

    move-object/from16 v1, v18

    invoke-static {v2, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    move-object/from16 v2, p2

    move-object/from16 v1, v19

    invoke-static {v2, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    invoke-direct/range {p0 .. p0}, Lv/J;->Z1()V

    :cond_2
    invoke-direct/range {p0 .. p0}, Lv/J;->c2()V

    return-void
.end method

.method public synthetic h0()Z
    .locals 1

    invoke-static {p0}, LF0/y0;->a(LF0/z0;)Z

    move-result v0

    return v0
.end method

.method public synthetic k1()Z
    .locals 1

    invoke-static {p0}, LF0/y0;->b(LF0/z0;)Z

    move-result v0

    return v0
.end method

.method public synthetic m0()V
    .locals 0

    invoke-static {p0}, LF0/r;->a(LF0/s;)V

    return-void
.end method

.method public s(LD0/t;)V
    .locals 0

    invoke-direct {p0, p1}, Lv/J;->a2(LD0/t;)V

    return-void
.end method

.method public y(Lq0/c;)V
    .locals 1

    .prologue
    invoke-interface {p1}, Lq0/c;->l1()V

    iget-object p1, p0, Lv/J;->g0:LY8/j;

    if-eqz p1, :cond_0

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-interface {p1, v0}, LY8/C;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LY8/n;->b(Ljava/lang/Object;)LY8/n;

    :cond_0
    return-void
.end method
