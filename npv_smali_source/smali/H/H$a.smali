.class public final LH/H$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH/H;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LH/H$a;-><init>()V

    return-void
.end method

.method private final c(Lo0/q0;JLS0/L;LM0/K;Lo0/N1;)V
    .locals 1

    .prologue
    invoke-static {p2, p3}, LM0/N;->l(J)I

    move-result v0

    invoke-interface {p4, v0}, LS0/L;->b(I)I

    move-result v0

    invoke-static {p2, p3}, LM0/N;->k(J)I

    move-result p2

    invoke-interface {p4, p2}, LS0/L;->b(I)I

    move-result p2

    if-eq v0, p2, :cond_0

    invoke-virtual {p5, v0, p2}, LM0/K;->z(II)Lo0/Q1;

    move-result-object p2

    invoke-interface {p1, p2, p6}, Lo0/q0;->t(Lo0/Q1;Lo0/N1;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(JLS0/e0;)LS0/e0;
    .locals 27

    invoke-virtual/range {p3 .. p3}, LS0/e0;->a()LS0/L;

    move-result-object v0

    invoke-static/range {p1 .. p2}, LM0/N;->n(J)I

    move-result v1

    invoke-interface {v0, v1}, LS0/L;->b(I)I

    move-result v0

    invoke-virtual/range {p3 .. p3}, LS0/e0;->a()LS0/L;

    move-result-object v1

    invoke-static/range {p1 .. p2}, LM0/N;->i(J)I

    move-result v2

    invoke-interface {v1, v2}, LS0/L;->b(I)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    new-instance v1, LM0/d$a;

    invoke-virtual/range {p3 .. p3}, LS0/e0;->b()LM0/d;

    move-result-object v3

    invoke-direct {v1, v3}, LM0/d$a;-><init>(LM0/d;)V

    new-instance v3, LM0/C;

    move-object v4, v3

    sget-object v5, LX0/k;->b:LX0/k$a;

    invoke-virtual {v5}, LX0/k$a;->d()LX0/k;

    move-result-object v21

    const v25, 0xefff

    const/16 v26, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v4 .. v26}, LM0/C;-><init>(JJLR0/q;LR0/o;LR0/p;LR0/h;Ljava/lang/String;JLX0/a;LX0/p;LT0/h;JLX0/k;Lo0/c2;LM0/z;Lq0/h;ILy7/k;)V

    invoke-virtual {v1, v3, v2, v0}, LM0/d$a;->b(LM0/C;II)V

    invoke-virtual {v1}, LM0/d$a;->i()LM0/d;

    move-result-object v0

    invoke-virtual/range {p3 .. p3}, LS0/e0;->a()LS0/L;

    move-result-object v1

    new-instance v2, LS0/e0;

    invoke-direct {v2, v0, v1}, LS0/e0;-><init>(LM0/d;LS0/L;)V

    return-object v2
.end method

.method public final b(Lo0/q0;LS0/V;JJLS0/L;LM0/K;Lo0/N1;J)V
    .locals 10

    .prologue
    invoke-static {p3, p4}, LM0/N;->h(J)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface/range {p9 .. p11}, Lo0/N1;->G(J)V

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p3

    move-object/from16 v4, p7

    move-object/from16 v5, p8

    move-object/from16 v6, p9

    invoke-direct/range {v0 .. v6}, LH/H$a;->c(Lo0/q0;JLS0/L;LM0/K;Lo0/N1;)V

    goto/16 :goto_3

    :cond_0
    invoke-static/range {p5 .. p6}, LM0/N;->h(J)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual/range {p8 .. p8}, LM0/K;->l()LM0/J;

    move-result-object v0

    invoke-virtual {v0}, LM0/J;->i()LM0/P;

    move-result-object v0

    invoke-virtual {v0}, LM0/P;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v0

    invoke-virtual {v0}, Lo0/y0;->w()J

    move-result-wide v1

    const-wide/16 v3, 0x10

    cmp-long v1, v1, v3

    if-nez v1, :cond_1

    const/4 v0, 0x0

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lo0/y0;->w()J

    move-result-wide v0

    :goto_0
    move-wide v2, v0

    goto :goto_1

    :cond_2
    sget-object v0, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v0}, Lo0/y0$a;->a()J

    move-result-wide v0

    goto :goto_0

    :goto_1
    invoke-static {v2, v3}, Lo0/y0;->p(J)F

    move-result v0

    const v1, 0x3e4ccccd    # 0.2f

    mul-float v4, v0, v1

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v0

    move-object/from16 v8, p9

    invoke-interface {v8, v0, v1}, Lo0/N1;->G(J)V

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p5

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    :goto_2
    invoke-direct/range {v2 .. v8}, LH/H$a;->c(Lo0/q0;JLS0/L;LM0/K;Lo0/N1;)V

    goto :goto_3

    :cond_3
    move-object/from16 v8, p9

    invoke-virtual {p2}, LS0/V;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LM0/N;->h(J)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-interface/range {p9 .. p11}, Lo0/N1;->G(J)V

    invoke-virtual {p2}, LS0/V;->h()J

    move-result-wide v4

    move-object v2, p0

    move-object v3, p1

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    goto :goto_2

    :cond_4
    :goto_3
    sget-object v0, LM0/M;->a:LM0/M;

    move-object v1, p1

    move-object/from16 v2, p8

    invoke-virtual {v0, p1, v2}, LM0/M;->a(Lo0/q0;LM0/K;)V

    return-void
.end method

.method public final d(LH/D;JLY0/v;LM0/K;)Li7/A;
    .locals 0

    invoke-virtual {p1, p2, p3, p4, p5}, LH/D;->l(JLY0/v;LM0/K;)LM0/K;

    move-result-object p1

    new-instance p2, Li7/A;

    invoke-virtual {p1}, LM0/K;->B()J

    move-result-wide p3

    invoke-static {p3, p4}, LY0/t;->g(J)I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1}, LM0/K;->B()J

    move-result-wide p4

    invoke-static {p4, p5}, LY0/t;->f(J)I

    move-result p4

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-direct {p2, p3, p4, p1}, Li7/A;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method

.method public final e(LS0/V;LH/D;LM0/K;LD0/t;LS0/d0;ZLS0/L;)V
    .locals 7

    .prologue
    if-nez p6, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, LS0/V;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LM0/N;->k(J)I

    move-result p1

    invoke-interface {p7, p1}, LS0/L;->b(I)I

    move-result p1

    invoke-virtual {p3}, LM0/K;->l()LM0/J;

    move-result-object p6

    invoke-virtual {p6}, LM0/J;->j()LM0/d;

    move-result-object p6

    invoke-virtual {p6}, LM0/d;->length()I

    move-result p6

    if-ge p1, p6, :cond_1

    :goto_0
    invoke-virtual {p3, p1}, LM0/K;->d(I)Ln0/i;

    move-result-object p1

    goto :goto_1

    :cond_1
    if-eqz p1, :cond_2

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, LH/D;->j()LM0/P;

    move-result-object v0

    invoke-virtual {p2}, LH/D;->a()LY0/e;

    move-result-object v1

    invoke-virtual {p2}, LH/D;->b()LR0/h$b;

    move-result-object v2

    const/16 v5, 0x18

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, LH/I;->b(LM0/P;LY0/e;LR0/h$b;Ljava/lang/String;IILjava/lang/Object;)J

    move-result-wide p1

    new-instance p3, Ln0/i;

    invoke-static {p1, p2}, LY0/t;->f(J)I

    move-result p1

    int-to-float p1, p1

    const/4 p2, 0x0

    const/high16 p6, 0x3f800000    # 1.0f

    invoke-direct {p3, p2, p2, p6, p1}, Ln0/i;-><init>(FFFF)V

    move-object p1, p3

    :goto_1
    invoke-virtual {p1}, Ln0/i;->i()F

    move-result p2

    invoke-virtual {p1}, Ln0/i;->l()F

    move-result p3

    invoke-static {p2, p3}, Ln0/h;->a(FF)J

    move-result-wide p2

    invoke-interface {p4, p2, p3}, LD0/t;->h0(J)J

    move-result-wide p2

    invoke-static {p2, p3}, Ln0/g;->m(J)F

    move-result p4

    invoke-static {p2, p3}, Ln0/g;->n(J)F

    move-result p2

    invoke-static {p4, p2}, Ln0/h;->a(FF)J

    move-result-wide p2

    invoke-virtual {p1}, Ln0/i;->n()F

    move-result p4

    invoke-virtual {p1}, Ln0/i;->h()F

    move-result p1

    invoke-static {p4, p1}, Ln0/n;->a(FF)J

    move-result-wide p6

    invoke-static {p2, p3, p6, p7}, Ln0/j;->b(JJ)Ln0/i;

    move-result-object p1

    invoke-virtual {p5, p1}, LS0/d0;->c(Ln0/i;)Z

    return-void
.end method

.method public final f(LS0/d0;LS0/k;Lx7/l;)V
    .locals 7

    invoke-virtual {p2}, LS0/k;->f()LS0/V;

    move-result-object v0

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, LS0/V;->d(LS0/V;LM0/d;JLM0/N;ILjava/lang/Object;)LS0/V;

    move-result-object p2

    invoke-interface {p3, p2}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, LS0/d0;->a()V

    return-void
.end method

.method public final g(Ljava/util/List;LS0/k;Lx7/l;LS0/d0;)V
    .locals 0

    .prologue
    invoke-virtual {p2, p1}, LS0/k;->b(Ljava/util/List;)LS0/V;

    move-result-object p1

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p4, p2, p1}, LS0/d0;->d(LS0/V;LS0/V;)Z

    :cond_0
    invoke-interface {p3, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final h(LS0/X;LS0/V;LS0/k;LS0/s;Lx7/l;Lx7/l;)LS0/d0;
    .locals 0

    invoke-virtual/range {p0 .. p6}, LH/H$a;->i(LS0/X;LS0/V;LS0/k;LS0/s;Lx7/l;Lx7/l;)LS0/d0;

    move-result-object p1

    return-object p1
.end method

.method public final i(LS0/X;LS0/V;LS0/k;LS0/s;Lx7/l;Lx7/l;)LS0/d0;
    .locals 2

    new-instance v0, Ly7/O;

    invoke-direct {v0}, Ly7/O;-><init>()V

    new-instance v1, LH/H$a$a;

    invoke-direct {v1, p3, p5, v0}, LH/H$a$a;-><init>(LS0/k;Lx7/l;Ly7/O;)V

    invoke-virtual {p1, p2, p4, v1, p6}, LS0/X;->d(LS0/V;LS0/s;Lx7/l;Lx7/l;)LS0/d0;

    move-result-object p1

    iput-object p1, v0, Ly7/O;->C:Ljava/lang/Object;

    return-object p1
.end method

.method public final j(JLH/V;LS0/k;LS0/L;Lx7/l;)V
    .locals 7

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p3

    move-wide v1, p1

    invoke-static/range {v0 .. v5}, LH/V;->e(LH/V;JZILjava/lang/Object;)I

    move-result p1

    invoke-interface {p5, p1}, LS0/L;->a(I)I

    move-result p1

    invoke-virtual {p4}, LS0/k;->f()LS0/V;

    move-result-object v0

    invoke-static {p1}, LM0/O;->a(I)J

    move-result-wide v2

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, LS0/V;->d(LS0/V;LM0/d;JLM0/N;ILjava/lang/Object;)LS0/V;

    move-result-object p1

    invoke-interface {p6, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final k(LS0/d0;LS0/V;LS0/L;LH/V;)V
    .locals 9

    .prologue
    invoke-virtual {p4}, LH/V;->c()LD0/t;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, LD0/t;->K()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p4}, LH/V;->b()LD0/t;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p4}, LH/V;->f()LM0/K;

    move-result-object v5

    new-instance v6, LH/H$a$b;

    invoke-direct {v6, v0}, LH/H$a$b;-><init>(LD0/t;)V

    invoke-static {v0}, LN/z;->b(LD0/t;)Ln0/i;

    move-result-object v7

    const/4 p4, 0x0

    invoke-interface {v0, v1, p4}, LD0/t;->N(LD0/t;Z)Ln0/i;

    move-result-object v8

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v2 .. v8}, LS0/d0;->e(LS0/V;LS0/L;LM0/K;Lx7/l;Ln0/i;Ln0/i;)Z

    :cond_1
    return-void
.end method
