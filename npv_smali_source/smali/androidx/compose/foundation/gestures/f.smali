.class final Landroidx/compose/foundation/gestures/f;
.super Landroidx/compose/foundation/gestures/b;
.source "SourceFile"

# interfaces
.implements LF0/i0;
.implements LF0/h;
.implements Lm0/j;
.implements Lx0/e;
.implements LF0/z0;


# instance fields
.field private a0:Lv/T;

.field private b0:Lx/p;

.field private final c0:Z

.field private final d0:Ly0/c;

.field private final e0:Lx/x;

.field private final f0:Lx/j;

.field private final g0:Lx/C;

.field private final h0:Landroidx/compose/foundation/gestures/e;

.field private final i0:Lx/h;

.field private j0:Lx/v;

.field private k0:Lx7/p;

.field private l0:Lx7/p;


# direct methods
.method public constructor <init>(Lx/A;Lv/T;Lx/p;Lx/s;ZZLz/l;Lx/f;)V
    .locals 12

    .prologue
    move-object v0, p0

    move-object/from16 v8, p4

    move/from16 v9, p5

    invoke-static {}, Landroidx/compose/foundation/gestures/d;->a()Lx7/l;

    move-result-object v1

    move-object/from16 v2, p7

    invoke-direct {p0, v1, v9, v2, v8}, Landroidx/compose/foundation/gestures/b;-><init>(Lx7/l;ZLz/l;Lx/s;)V

    move-object v1, p2

    iput-object v1, v0, Landroidx/compose/foundation/gestures/f;->a0:Lv/T;

    move-object v1, p3

    iput-object v1, v0, Landroidx/compose/foundation/gestures/f;->b0:Lx/p;

    new-instance v10, Ly0/c;

    invoke-direct {v10}, Ly0/c;-><init>()V

    iput-object v10, v0, Landroidx/compose/foundation/gestures/f;->d0:Ly0/c;

    new-instance v1, Lx/x;

    invoke-direct {v1, v9}, Lx/x;-><init>(Z)V

    invoke-virtual {p0, v1}, LF0/m;->T1(LF0/j;)LF0/j;

    move-result-object v1

    check-cast v1, Lx/x;

    iput-object v1, v0, Landroidx/compose/foundation/gestures/f;->e0:Lx/x;

    new-instance v1, Lx/j;

    invoke-static {}, Landroidx/compose/foundation/gestures/d;->c()Landroidx/compose/foundation/gestures/d$d;

    move-result-object v2

    invoke-static {v2}, Lt/z;->c(LY0/e;)Lu/B;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-direct {v1, v2, v3, v4, v3}, Lx/j;-><init>(Lu/B;Lh0/k;ILy7/k;)V

    iput-object v1, v0, Landroidx/compose/foundation/gestures/f;->f0:Lx/j;

    iget-object v3, v0, Landroidx/compose/foundation/gestures/f;->a0:Lv/T;

    iget-object v2, v0, Landroidx/compose/foundation/gestures/f;->b0:Lx/p;

    if-nez v2, :cond_0

    move-object v4, v1

    goto :goto_0

    :cond_0
    move-object v4, v2

    :goto_0
    new-instance v11, Lx/C;

    move-object v1, v11

    move-object v2, p1

    move-object/from16 v5, p4

    move/from16 v6, p6

    move-object v7, v10

    invoke-direct/range {v1 .. v7}, Lx/C;-><init>(Lx/A;Lv/T;Lx/p;Lx/s;ZLy0/c;)V

    iput-object v11, v0, Landroidx/compose/foundation/gestures/f;->g0:Lx/C;

    new-instance v1, Landroidx/compose/foundation/gestures/e;

    invoke-direct {v1, v11, v9}, Landroidx/compose/foundation/gestures/e;-><init>(Lx/C;Z)V

    iput-object v1, v0, Landroidx/compose/foundation/gestures/f;->h0:Landroidx/compose/foundation/gestures/e;

    new-instance v2, Lx/h;

    move/from16 v3, p6

    move-object/from16 v4, p8

    invoke-direct {v2, v8, v11, v3, v4}, Lx/h;-><init>(Lx/s;Lx/C;ZLx/f;)V

    invoke-virtual {p0, v2}, LF0/m;->T1(LF0/j;)LF0/j;

    move-result-object v2

    check-cast v2, Lx/h;

    iput-object v2, v0, Landroidx/compose/foundation/gestures/f;->i0:Lx/h;

    invoke-static {v1, v10}, Ly0/e;->a(Ly0/b;Ly0/c;)LF0/j;

    move-result-object v1

    invoke-virtual {p0, v1}, LF0/m;->T1(LF0/j;)LF0/j;

    invoke-static {}, Lm0/q;->a()Lm0/p;

    move-result-object v1

    invoke-virtual {p0, v1}, LF0/m;->T1(LF0/j;)LF0/j;

    new-instance v1, Landroidx/compose/foundation/relocation/f;

    invoke-direct {v1, v2}, Landroidx/compose/foundation/relocation/f;-><init>(LE/c;)V

    invoke-virtual {p0, v1}, LF0/m;->T1(LF0/j;)LF0/j;

    new-instance v1, Lv/D;

    new-instance v2, Landroidx/compose/foundation/gestures/f$a;

    invoke-direct {v2, p0}, Landroidx/compose/foundation/gestures/f$a;-><init>(Landroidx/compose/foundation/gestures/f;)V

    invoke-direct {v1, v2}, Lv/D;-><init>(Lx7/l;)V

    invoke-virtual {p0, v1}, LF0/m;->T1(LF0/j;)LF0/j;

    return-void
.end method

.method private final B2()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/gestures/f$h;

    invoke-direct {v0, p0}, Landroidx/compose/foundation/gestures/f$h;-><init>(Landroidx/compose/foundation/gestures/f;)V

    invoke-static {p0, v0}, LF0/j0;->a(Landroidx/compose/ui/d$c;Lx7/a;)V

    return-void
.end method

.method public static final synthetic u2(Landroidx/compose/foundation/gestures/f;)Lx/h;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/gestures/f;->i0:Lx/h;

    return-object p0
.end method

.method public static final synthetic v2(Landroidx/compose/foundation/gestures/f;)Lx/j;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/gestures/f;->f0:Lx/j;

    return-object p0
.end method

.method public static final synthetic w2(Landroidx/compose/foundation/gestures/f;)Lx/C;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/gestures/f;->g0:Lx/C;

    return-object p0
.end method

.method private final x2()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/foundation/gestures/f;->k0:Lx7/p;

    iput-object v0, p0, Landroidx/compose/foundation/gestures/f;->l0:Lx7/p;

    return-void
.end method

.method private final y2(Lz0/p;J)V
    .locals 9

    .prologue
    invoke-virtual {p1}, Lz0/p;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lz0/B;

    invoke-virtual {v4}, Lz0/B;->p()Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    if-nez v4, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->j0:Lx/v;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {p0}, LF0/k;->i(LF0/j;)LY0/e;

    move-result-object v1

    invoke-interface {v0, v1, p1, p2, p3}, Lx/v;->a(LY0/e;Lz0/p;J)J

    move-result-wide p2

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->t1()LW8/N;

    move-result-object v3

    new-instance v6, Landroidx/compose/foundation/gestures/f$e;

    const/4 v0, 0x0

    invoke-direct {v6, p0, p2, p3, v0}, Landroidx/compose/foundation/gestures/f$e;-><init>(Landroidx/compose/foundation/gestures/f;JLm7/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    invoke-virtual {p1}, Lz0/p;->c()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    :goto_1
    if-ge v2, p2, :cond_2

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lz0/B;

    invoke-virtual {p3}, Lz0/B;->a()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    return-void
.end method

.method private final z2()V
    .locals 2

    new-instance v0, Landroidx/compose/foundation/gestures/f$f;

    invoke-direct {v0, p0}, Landroidx/compose/foundation/gestures/f$f;-><init>(Landroidx/compose/foundation/gestures/f;)V

    iput-object v0, p0, Landroidx/compose/foundation/gestures/f;->k0:Lx7/p;

    new-instance v0, Landroidx/compose/foundation/gestures/f$g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/compose/foundation/gestures/f$g;-><init>(Landroidx/compose/foundation/gestures/f;Lm7/e;)V

    iput-object v0, p0, Landroidx/compose/foundation/gestures/f;->l0:Lx7/p;

    return-void
.end method


# virtual methods
.method public final A2(Lx/A;Lx/s;Lv/T;ZZLx/p;Lz/l;Lx/f;)V
    .locals 15

    .prologue
    move-object v6, p0

    move/from16 v2, p4

    move-object/from16 v0, p6

    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/b;->k2()Z

    move-result v1

    if-eq v1, v2, :cond_0

    iget-object v1, v6, Landroidx/compose/foundation/gestures/f;->h0:Landroidx/compose/foundation/gestures/e;

    invoke-virtual {v1, v2}, Landroidx/compose/foundation/gestures/e;->a(Z)V

    iget-object v1, v6, Landroidx/compose/foundation/gestures/f;->e0:Lx/x;

    invoke-virtual {v1, v2}, Lx/x;->U1(Z)V

    const/4 v1, 0x1

    :goto_0
    move v7, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    if-nez v0, :cond_1

    iget-object v1, v6, Landroidx/compose/foundation/gestures/f;->f0:Lx/j;

    move-object v13, v1

    goto :goto_2

    :cond_1
    move-object v13, v0

    :goto_2
    iget-object v8, v6, Landroidx/compose/foundation/gestures/f;->g0:Lx/C;

    iget-object v14, v6, Landroidx/compose/foundation/gestures/f;->d0:Ly0/c;

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    move/from16 v12, p5

    invoke-virtual/range {v8 .. v14}, Lx/C;->C(Lx/A;Lx/s;Lv/T;ZLx/p;Ly0/c;)Z

    move-result v5

    iget-object v1, v6, Landroidx/compose/foundation/gestures/f;->i0:Lx/h;

    move-object/from16 v3, p2

    move/from16 v4, p5

    move-object/from16 v8, p8

    invoke-virtual {v1, v3, v4, v8}, Lx/h;->q2(Lx/s;ZLx/f;)V

    move-object/from16 v1, p3

    iput-object v1, v6, Landroidx/compose/foundation/gestures/f;->a0:Lv/T;

    iput-object v0, v6, Landroidx/compose/foundation/gestures/f;->b0:Lx/p;

    invoke-static {}, Landroidx/compose/foundation/gestures/d;->a()Lx7/l;

    move-result-object v1

    iget-object v0, v6, Landroidx/compose/foundation/gestures/f;->g0:Lx/C;

    invoke-virtual {v0}, Lx/C;->p()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lx/s;->C:Lx/s;

    :goto_3
    move-object v4, v0

    goto :goto_4

    :cond_2
    sget-object v0, Lx/s;->D:Lx/s;

    goto :goto_3

    :goto_4
    move-object v0, p0

    move/from16 v2, p4

    move-object/from16 v3, p7

    invoke-virtual/range {v0 .. v5}, Landroidx/compose/foundation/gestures/b;->t2(Lx7/l;ZLz/l;Lx/s;Z)V

    if-eqz v7, :cond_3

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/f;->x2()V

    invoke-static {p0}, LF0/A0;->b(LF0/z0;)V

    :cond_3
    return-void
.end method

.method public D1()V
    .locals 1

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/f;->B2()V

    invoke-static {p0}, Lx/c;->a(LF0/h;)Lx/v;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/foundation/gestures/f;->j0:Lx/v;

    return-void
.end method

.method public H(Landroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public L0()V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/f;->B2()V

    return-void
.end method

.method public M0(LK0/w;)V
    .locals 3

    .prologue
    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/b;->k2()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->k0:Lx7/p;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->l0:Lx7/p;

    if-nez v0, :cond_1

    :cond_0
    invoke-direct {p0}, Landroidx/compose/foundation/gestures/f;->z2()V

    :cond_1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->k0:Lx7/p;

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, v2}, LK0/u;->H(LK0/w;Ljava/lang/String;Lx7/p;ILjava/lang/Object;)V

    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->l0:Lx7/p;

    if-eqz v0, :cond_3

    invoke-static {p1, v0}, LK0/u;->I(LK0/w;Lx7/p;)V

    :cond_3
    return-void
.end method

.method public Y(Landroidx/compose/ui/focus/j;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroidx/compose/ui/focus/j;->y(Z)V

    return-void
.end method

.method public b0(Landroid/view/KeyEvent;)Z
    .locals 8

    .prologue
    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/b;->k2()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p1}, Lx0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v0

    sget-object v2, Lx0/a;->b:Lx0/a$a;

    invoke-virtual {v2}, Lx0/a$a;->j()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, Lx0/a;->p(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lx0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v0

    invoke-virtual {v2}, Lx0/a$a;->k()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, Lx0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_0
    invoke-static {p1}, Lx0/d;->b(Landroid/view/KeyEvent;)I

    move-result v0

    sget-object v1, Lx0/c;->a:Lx0/c$a;

    invoke-virtual {v1}, Lx0/c$a;->a()I

    move-result v1

    invoke-static {v0, v1}, Lx0/c;->e(II)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p1}, Lx0/d;->e(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->g0:Lx/C;

    invoke-virtual {v0}, Lx/C;->p()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->i0:Lx/h;

    invoke-virtual {v0}, Lx/h;->j2()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/t;->f(J)I

    move-result v0

    invoke-static {p1}, Lx0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v3

    invoke-virtual {v2}, Lx0/a$a;->k()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Lx0/a;->p(JJ)Z

    move-result p1

    if-eqz p1, :cond_1

    int-to-float p1, v0

    goto :goto_0

    :cond_1
    int-to-float p1, v0

    neg-float p1, p1

    :goto_0
    invoke-static {v1, p1}, Ln0/h;->a(FF)J

    move-result-wide v0

    goto :goto_2

    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->i0:Lx/h;

    invoke-virtual {v0}, Lx/h;->j2()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/t;->g(J)I

    move-result v0

    invoke-static {p1}, Lx0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v3

    invoke-virtual {v2}, Lx0/a$a;->k()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Lx0/a;->p(JJ)Z

    move-result p1

    if-eqz p1, :cond_3

    int-to-float p1, v0

    goto :goto_1

    :cond_3
    int-to-float p1, v0

    neg-float p1, p1

    :goto_1
    invoke-static {p1, v1}, Ln0/h;->a(FF)J

    move-result-wide v0

    :goto_2
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->t1()LW8/N;

    move-result-object v2

    new-instance v5, Landroidx/compose/foundation/gestures/f$d;

    const/4 p1, 0x0

    invoke-direct {v5, p0, v0, v1, p1}, Landroidx/compose/foundation/gestures/f$d;-><init>(Landroidx/compose/foundation/gestures/f;JLm7/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    const/4 p1, 0x1

    goto :goto_3

    :cond_4
    const/4 p1, 0x0

    :goto_3
    return p1
.end method

.method public synthetic h0()Z
    .locals 1

    invoke-static {p0}, LF0/y0;->a(LF0/z0;)Z

    move-result v0

    return v0
.end method

.method public i2(Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->g0:Lx/C;

    sget-object v1, Lv/L;->D:Lv/L;

    new-instance v2, Landroidx/compose/foundation/gestures/f$b;

    const/4 v3, 0x0

    invoke-direct {v2, p1, v0, v3}, Landroidx/compose/foundation/gestures/f$b;-><init>(Lx7/p;Lx/C;Lm7/e;)V

    invoke-virtual {v0, v1, v2, p2}, Lx/C;->v(Lv/L;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public synthetic k1()Z
    .locals 1

    invoke-static {p0}, LF0/y0;->b(LF0/z0;)Z

    move-result v0

    return v0
.end method

.method public m2(J)V
    .locals 0

    return-void
.end method

.method public n2(J)V
    .locals 7

    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->d0:Ly0/c;

    invoke-virtual {v0}, Ly0/c;->e()LW8/N;

    move-result-object v1

    new-instance v4, Landroidx/compose/foundation/gestures/f$c;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, p2, v0}, Landroidx/compose/foundation/gestures/f$c;-><init>(Landroidx/compose/foundation/gestures/f;JLm7/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    return-void
.end method

.method public r2()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->g0:Lx/C;

    invoke-virtual {v0}, Lx/C;->w()Z

    move-result v0

    return v0
.end method

.method public w0(Lz0/p;Lz0/r;J)V
    .locals 5

    .prologue
    invoke-virtual {p1}, Lz0/p;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz0/B;

    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/b;->j2()Lx7/l;

    move-result-object v4

    invoke-interface {v4, v3}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-super {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/gestures/b;->w0(Lz0/p;Lz0/r;J)V

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    sget-object v0, Lz0/r;->D:Lz0/r;

    if-ne p2, v0, :cond_2

    invoke-virtual {p1}, Lz0/p;->f()I

    move-result p2

    sget-object v0, Lz0/t;->a:Lz0/t$a;

    invoke-virtual {v0}, Lz0/t$a;->f()I

    move-result v0

    invoke-static {p2, v0}, Lz0/t;->i(II)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-direct {p0, p1, p3, p4}, Landroidx/compose/foundation/gestures/f;->y2(Lz0/p;J)V

    :cond_2
    return-void
.end method

.method public y1()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/gestures/f;->c0:Z

    return v0
.end method
