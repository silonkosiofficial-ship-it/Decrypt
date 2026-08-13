.class public final LN/F;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LH/Y;

.field private b:LS0/L;

.field private c:Lx7/l;

.field private d:LH/w;

.field private final e:LV/w0;

.field private f:LS0/g0;

.field private g:Landroidx/compose/ui/platform/m0;

.field private h:Landroidx/compose/ui/platform/t1;

.field private i:Lv0/a;

.field private j:Landroidx/compose/ui/focus/n;

.field private final k:LV/w0;

.field private final l:LV/w0;

.field private m:J

.field private n:Ljava/lang/Integer;

.field private o:J

.field private final p:LV/w0;

.field private final q:LV/w0;

.field private r:I

.field private s:LS0/V;

.field private t:LN/w;

.field private final u:LH/F;

.field private final v:LN/h;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LH/Y;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN/F;->a:LH/Y;

    invoke-static {}, LH/c0;->d()LS0/L;

    move-result-object p1

    iput-object p1, p0, LN/F;->b:LS0/L;

    sget-object p1, LN/F$d;->D:LN/F$d;

    iput-object p1, p0, LN/F;->c:Lx7/l;

    new-instance p1, LS0/V;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, LS0/V;-><init>(Ljava/lang/String;JLM0/N;ILy7/k;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, v0, v1, v0}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, LN/F;->e:LV/w0;

    sget-object p1, LS0/g0;->a:LS0/g0$a;

    invoke-virtual {p1}, LS0/g0$a;->c()LS0/g0;

    move-result-object p1

    iput-object p1, p0, LN/F;->f:LS0/g0;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0, v1, v0}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v2

    iput-object v2, p0, LN/F;->k:LV/w0;

    invoke-static {p1, v0, v1, v0}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, LN/F;->l:LV/w0;

    sget-object p1, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {p1}, Ln0/g$a;->c()J

    move-result-wide v2

    iput-wide v2, p0, LN/F;->m:J

    invoke-virtual {p1}, Ln0/g$a;->c()J

    move-result-wide v2

    iput-wide v2, p0, LN/F;->o:J

    invoke-static {v0, v0, v1, v0}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, LN/F;->p:LV/w0;

    invoke-static {v0, v0, v1, v0}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, LN/F;->q:LV/w0;

    const/4 p1, -0x1

    iput p1, p0, LN/F;->r:I

    new-instance p1, LS0/V;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, LS0/V;-><init>(Ljava/lang/String;JLM0/N;ILy7/k;)V

    iput-object p1, p0, LN/F;->s:LS0/V;

    new-instance p1, LN/F$i;

    invoke-direct {p1, p0}, LN/F$i;-><init>(LN/F;)V

    iput-object p1, p0, LN/F;->u:LH/F;

    new-instance p1, LN/F$c;

    invoke-direct {p1, p0}, LN/F$c;-><init>(LN/F;)V

    iput-object p1, p0, LN/F;->v:LN/h;

    return-void
.end method

.method private final W(Ln0/g;)V
    .locals 1

    iget-object v0, p0, LN/F;->q:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final Y(LH/k;)V
    .locals 1

    iget-object v0, p0, LN/F;->p:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic a(LN/F;LM0/d;J)LS0/V;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LN/F;->q(LM0/d;J)LS0/V;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LN/F;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, LN/F;->n:Ljava/lang/Integer;

    return-object p0
.end method

.method public static final synthetic c(LN/F;)J
    .locals 2

    iget-wide v0, p0, LN/F;->m:J

    return-wide v0
.end method

.method private final c0(LH/l;)V
    .locals 2

    .prologue
    iget-object v0, p0, LN/F;->d:LH/w;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LH/w;->d()LH/l;

    move-result-object v1

    if-ne v1, p1, :cond_0

    const/4 v0, 0x0

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, LH/w;->B(LH/l;)V

    :cond_1
    return-void
.end method

.method public static final synthetic d(LN/F;)J
    .locals 2

    iget-wide v0, p0, LN/F;->o:J

    return-wide v0
.end method

.method public static final synthetic e(LN/F;Ln0/g;)V
    .locals 0

    invoke-direct {p0, p1}, LN/F;->W(Ln0/g;)V

    return-void
.end method

.method public static final synthetic f(LN/F;Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, LN/F;->n:Ljava/lang/Integer;

    return-void
.end method

.method public static final synthetic g(LN/F;J)V
    .locals 0

    iput-wide p1, p0, LN/F;->m:J

    return-void
.end method

.method public static final synthetic h(LN/F;J)V
    .locals 0

    iput-wide p1, p0, LN/F;->o:J

    return-void
.end method

.method public static final synthetic i(LN/F;LH/k;)V
    .locals 0

    invoke-direct {p0, p1}, LN/F;->Y(LH/k;)V

    return-void
.end method

.method public static final synthetic j(LN/F;LH/l;)V
    .locals 0

    invoke-direct {p0, p1}, LN/F;->c0(LH/l;)V

    return-void
.end method

.method public static final synthetic k(LN/F;I)V
    .locals 0

    iput p1, p0, LN/F;->r:I

    return-void
.end method

.method public static final synthetic l(LN/F;Z)V
    .locals 0

    invoke-direct {p0, p1}, LN/F;->m0(Z)V

    return-void
.end method

.method public static final synthetic m(LN/F;LS0/V;JZZLN/q;Z)J
    .locals 0

    invoke-direct/range {p0 .. p7}, LN/F;->n0(LS0/V;JZZLN/q;Z)J

    move-result-wide p0

    return-wide p0
.end method

.method private final m0(Z)V
    .locals 1

    .prologue
    iget-object v0, p0, LN/F;->d:LH/w;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, LH/w;->K(Z)V

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p0}, LN/F;->l0()V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LN/F;->R()V

    :goto_1
    return-void
.end method

.method private final n0(LS0/V;JZZLN/q;Z)J
    .locals 13

    .prologue
    move-object v0, p0

    move/from16 v9, p7

    iget-object v1, v0, LN/F;->d:LH/w;

    if-eqz v1, :cond_14

    invoke-virtual {v1}, LH/w;->j()LH/V;

    move-result-object v1

    if-nez v1, :cond_0

    goto/16 :goto_d

    :cond_0
    iget-object v2, v0, LN/F;->b:LS0/L;

    invoke-virtual {p1}, LS0/V;->h()J

    move-result-wide v3

    invoke-static {v3, v4}, LM0/N;->n(J)I

    move-result v3

    invoke-interface {v2, v3}, LS0/L;->b(I)I

    move-result v2

    iget-object v3, v0, LN/F;->b:LS0/L;

    invoke-virtual {p1}, LS0/V;->h()J

    move-result-wide v4

    invoke-static {v4, v5}, LM0/N;->i(J)I

    move-result v4

    invoke-interface {v3, v4}, LS0/L;->b(I)I

    move-result v3

    invoke-static {v2, v3}, LM0/O;->b(II)J

    move-result-wide v5

    const/4 v10, 0x0

    move-wide v2, p2

    invoke-virtual {v1, v2, v3, v10}, LH/V;->d(JZ)I

    move-result v11

    if-nez p5, :cond_2

    if-eqz p4, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v5, v6}, LM0/N;->n(J)I

    move-result v2

    goto :goto_1

    :cond_2
    :goto_0
    move v2, v11

    :goto_1
    if-eqz p5, :cond_4

    if-eqz p4, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {v5, v6}, LM0/N;->i(J)I

    move-result v3

    goto :goto_3

    :cond_4
    :goto_2
    move v3, v11

    :goto_3
    iget-object v12, v0, LN/F;->t:LN/w;

    const/4 v4, -0x1

    if-nez p4, :cond_6

    if-eqz v12, :cond_6

    iget v7, v0, LN/F;->r:I

    if-ne v7, v4, :cond_5

    goto :goto_4

    :cond_5
    move v4, v7

    :cond_6
    :goto_4
    invoke-virtual {v1}, LH/V;->f()LM0/K;

    move-result-object v1

    move/from16 v7, p4

    move/from16 v8, p5

    invoke-static/range {v1 .. v8}, LN/x;->c(LM0/K;IIIJZZ)LN/w;

    move-result-object v1

    invoke-interface {v1, v12}, LN/w;->f(LN/w;)Z

    move-result v2

    if-nez v2, :cond_7

    invoke-virtual {p1}, LS0/V;->h()J

    move-result-wide v1

    return-wide v1

    :cond_7
    iput-object v1, v0, LN/F;->t:LN/w;

    iput v11, v0, LN/F;->r:I

    move-object/from16 v2, p6

    invoke-interface {v2, v1}, LN/q;->a(LN/w;)LN/k;

    move-result-object v1

    iget-object v2, v0, LN/F;->b:LS0/L;

    invoke-virtual {v1}, LN/k;->e()LN/k$a;

    move-result-object v3

    invoke-virtual {v3}, LN/k$a;->c()I

    move-result v3

    invoke-interface {v2, v3}, LS0/L;->a(I)I

    move-result v2

    iget-object v3, v0, LN/F;->b:LS0/L;

    invoke-virtual {v1}, LN/k;->c()LN/k$a;

    move-result-object v1

    invoke-virtual {v1}, LN/k$a;->c()I

    move-result v1

    invoke-interface {v3, v1}, LS0/L;->a(I)I

    move-result v1

    invoke-static {v2, v1}, LM0/O;->b(II)J

    move-result-wide v1

    invoke-virtual {p1}, LS0/V;->h()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, LM0/N;->g(JJ)Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {p1}, LS0/V;->h()J

    move-result-wide v1

    return-wide v1

    :cond_8
    invoke-static {v1, v2}, LM0/N;->m(J)Z

    move-result v3

    invoke-virtual {p1}, LS0/V;->h()J

    move-result-wide v4

    invoke-static {v4, v5}, LM0/N;->m(J)Z

    move-result v4

    const/4 v5, 0x1

    if-eq v3, v4, :cond_9

    invoke-static {v1, v2}, LM0/N;->i(J)I

    move-result v3

    invoke-static {v1, v2}, LM0/N;->n(J)I

    move-result v4

    invoke-static {v3, v4}, LM0/O;->b(II)J

    move-result-wide v3

    invoke-virtual {p1}, LS0/V;->h()J

    move-result-wide v6

    invoke-static {v3, v4, v6, v7}, LM0/N;->g(JJ)Z

    move-result v3

    if-eqz v3, :cond_9

    move v3, v5

    goto :goto_5

    :cond_9
    move v3, v10

    :goto_5
    invoke-static {v1, v2}, LM0/N;->h(J)Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual {p1}, LS0/V;->h()J

    move-result-wide v6

    invoke-static {v6, v7}, LM0/N;->h(J)Z

    move-result v4

    if-eqz v4, :cond_a

    move v4, v5

    goto :goto_6

    :cond_a
    move v4, v10

    :goto_6
    if-eqz v9, :cond_b

    invoke-virtual {p1}, LS0/V;->i()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-lez v6, :cond_b

    if-nez v3, :cond_b

    if-nez v4, :cond_b

    iget-object v3, v0, LN/F;->i:Lv0/a;

    if-eqz v3, :cond_b

    sget-object v4, Lv0/b;->a:Lv0/b$a;

    invoke-virtual {v4}, Lv0/b$a;->b()I

    move-result v4

    invoke-interface {v3, v4}, Lv0/a;->a(I)V

    :cond_b
    invoke-virtual {p1}, LS0/V;->f()LM0/d;

    move-result-object v3

    invoke-direct {p0, v3, v1, v2}, LN/F;->q(LM0/d;J)LS0/V;

    move-result-object v3

    iget-object v4, v0, LN/F;->c:Lx7/l;

    invoke-interface {v4, v3}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    if-nez v9, :cond_c

    invoke-static {v1, v2}, LM0/N;->h(J)Z

    move-result v3

    xor-int/2addr v3, v5

    invoke-direct {p0, v3}, LN/F;->m0(Z)V

    :cond_c
    iget-object v3, v0, LN/F;->d:LH/w;

    if-nez v3, :cond_d

    goto :goto_7

    :cond_d
    invoke-virtual {v3, v9}, LH/w;->D(Z)V

    :goto_7
    iget-object v3, v0, LN/F;->d:LH/w;

    if-nez v3, :cond_e

    goto :goto_9

    :cond_e
    invoke-static {v1, v2}, LM0/N;->h(J)Z

    move-result v4

    if-nez v4, :cond_f

    invoke-static {p0, v5}, LN/G;->c(LN/F;Z)Z

    move-result v4

    if-eqz v4, :cond_f

    move v4, v5

    goto :goto_8

    :cond_f
    move v4, v10

    :goto_8
    invoke-virtual {v3, v4}, LH/w;->M(Z)V

    :goto_9
    iget-object v3, v0, LN/F;->d:LH/w;

    if-nez v3, :cond_10

    goto :goto_b

    :cond_10
    invoke-static {v1, v2}, LM0/N;->h(J)Z

    move-result v4

    if-nez v4, :cond_11

    invoke-static {p0, v10}, LN/G;->c(LN/F;Z)Z

    move-result v4

    if-eqz v4, :cond_11

    move v4, v5

    goto :goto_a

    :cond_11
    move v4, v10

    :goto_a
    invoke-virtual {v3, v4}, LH/w;->L(Z)V

    :goto_b
    iget-object v3, v0, LN/F;->d:LH/w;

    if-nez v3, :cond_12

    goto :goto_c

    :cond_12
    invoke-static {v1, v2}, LM0/N;->h(J)Z

    move-result v4

    if-eqz v4, :cond_13

    invoke-static {p0, v5}, LN/G;->c(LN/F;Z)Z

    move-result v4

    if-eqz v4, :cond_13

    move v10, v5

    :cond_13
    invoke-virtual {v3, v10}, LH/w;->J(Z)V

    :goto_c
    return-wide v1

    :cond_14
    :goto_d
    sget-object v1, LM0/N;->b:LM0/N$a;

    invoke-virtual {v1}, LM0/N$a;->a()J

    move-result-wide v1

    return-wide v1
.end method

.method public static synthetic p(LN/F;ZILjava/lang/Object;)V
    .locals 0

    .prologue
    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-virtual {p0, p1}, LN/F;->o(Z)V

    return-void
.end method

.method private final q(LM0/d;J)LS0/V;
    .locals 8

    new-instance v7, LS0/V;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    move-object v1, p1

    move-wide v2, p2

    invoke-direct/range {v0 .. v6}, LS0/V;-><init>(LM0/d;JLM0/N;ILy7/k;)V

    return-object v7
.end method

.method public static synthetic u(LN/F;Ln0/g;ILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, LN/F;->t(Ln0/g;)V

    return-void
.end method

.method public static synthetic w(LN/F;ZILjava/lang/Object;)V
    .locals 0

    .prologue
    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-virtual {p0, p1}, LN/F;->v(Z)V

    return-void
.end method

.method private final z()Ln0/i;
    .locals 11

    .prologue
    iget-object v0, p0, LN/F;->d:LH/w;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, LH/w;->z()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_7

    iget-object v1, p0, LN/F;->b:LS0/L;

    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v3

    invoke-virtual {v3}, LS0/V;->h()J

    move-result-wide v3

    invoke-static {v3, v4}, LM0/N;->n(J)I

    move-result v3

    invoke-interface {v1, v3}, LS0/L;->b(I)I

    move-result v1

    iget-object v3, p0, LN/F;->b:LS0/L;

    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v4

    invoke-virtual {v4}, LS0/V;->h()J

    move-result-wide v4

    invoke-static {v4, v5}, LM0/N;->i(J)I

    move-result v4

    invoke-interface {v3, v4}, LS0/L;->b(I)I

    move-result v3

    iget-object v4, p0, LN/F;->d:LH/w;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, LH/w;->i()LD0/t;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {p0, v2}, LN/F;->G(Z)J

    move-result-wide v5

    invoke-interface {v4, v5, v6}, LD0/t;->h0(J)J

    move-result-wide v4

    goto :goto_1

    :cond_1
    sget-object v2, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {v2}, Ln0/g$a;->c()J

    move-result-wide v4

    :goto_1
    iget-object v2, p0, LN/F;->d:LH/w;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, LH/w;->i()LD0/t;

    move-result-object v2

    if-eqz v2, :cond_2

    const/4 v6, 0x0

    invoke-virtual {p0, v6}, LN/F;->G(Z)J

    move-result-wide v6

    invoke-interface {v2, v6, v7}, LD0/t;->h0(J)J

    move-result-wide v6

    goto :goto_2

    :cond_2
    sget-object v2, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {v2}, Ln0/g$a;->c()J

    move-result-wide v6

    :goto_2
    iget-object v2, p0, LN/F;->d:LH/w;

    const/4 v8, 0x0

    if-eqz v2, :cond_4

    invoke-virtual {v2}, LH/w;->i()LD0/t;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v0}, LH/w;->j()LH/V;

    move-result-object v9

    if-eqz v9, :cond_3

    invoke-virtual {v9}, LH/V;->f()LM0/K;

    move-result-object v9

    if-eqz v9, :cond_3

    invoke-virtual {v9, v1}, LM0/K;->e(I)Ln0/i;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ln0/i;->l()F

    move-result v1

    goto :goto_3

    :cond_3
    move v1, v8

    :goto_3
    invoke-static {v8, v1}, Ln0/h;->a(FF)J

    move-result-wide v9

    invoke-interface {v2, v9, v10}, LD0/t;->h0(J)J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/g;->n(J)F

    move-result v1

    goto :goto_4

    :cond_4
    move v1, v8

    :goto_4
    iget-object v2, p0, LN/F;->d:LH/w;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, LH/w;->i()LD0/t;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {v0}, LH/w;->j()LH/V;

    move-result-object v9

    if-eqz v9, :cond_5

    invoke-virtual {v9}, LH/V;->f()LM0/K;

    move-result-object v9

    if-eqz v9, :cond_5

    invoke-virtual {v9, v3}, LM0/K;->e(I)Ln0/i;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Ln0/i;->l()F

    move-result v3

    goto :goto_5

    :cond_5
    move v3, v8

    :goto_5
    invoke-static {v8, v3}, Ln0/h;->a(FF)J

    move-result-wide v8

    invoke-interface {v2, v8, v9}, LD0/t;->h0(J)J

    move-result-wide v2

    invoke-static {v2, v3}, Ln0/g;->n(J)F

    move-result v8

    :cond_6
    invoke-static {v4, v5}, Ln0/g;->m(J)F

    move-result v2

    invoke-static {v6, v7}, Ln0/g;->m(J)F

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v2

    invoke-static {v4, v5}, Ln0/g;->m(J)F

    move-result v3

    invoke-static {v6, v7}, Ln0/g;->m(J)F

    move-result v9

    invoke-static {v3, v9}, Ljava/lang/Math;->max(FF)F

    move-result v3

    invoke-static {v1, v8}, Ljava/lang/Math;->min(FF)F

    move-result v1

    invoke-static {v4, v5}, Ln0/g;->n(J)F

    move-result v4

    invoke-static {v6, v7}, Ln0/g;->n(J)F

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    move-result v4

    const/16 v5, 0x19

    int-to-float v5, v5

    invoke-static {v5}, LY0/i;->q(F)F

    move-result v5

    invoke-virtual {v0}, LH/w;->v()LH/D;

    move-result-object v0

    invoke-virtual {v0}, LH/D;->a()LY0/e;

    move-result-object v0

    invoke-interface {v0}, LY0/e;->getDensity()F

    move-result v0

    mul-float/2addr v5, v0

    add-float/2addr v4, v5

    new-instance v0, Ln0/i;

    invoke-direct {v0, v2, v1, v3, v4}, Ln0/i;-><init>(FFFF)V

    return-object v0

    :cond_7
    sget-object v0, Ln0/i;->e:Ln0/i$a;

    invoke-virtual {v0}, Ln0/i$a;->a()Ln0/i;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final A()Ln0/g;
    .locals 1

    iget-object v0, p0, LN/F;->q:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/g;

    return-object v0
.end method

.method public final B(LY0/e;)J
    .locals 4

    .prologue
    iget-object v0, p0, LN/F;->b:LS0/L;

    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v1

    invoke-virtual {v1}, LS0/V;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, LM0/N;->n(J)I

    move-result v1

    invoke-interface {v0, v1}, LS0/L;->b(I)I

    move-result v0

    iget-object v1, p0, LN/F;->d:LH/w;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LH/w;->j()LH/V;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, LH/V;->f()LM0/K;

    move-result-object v1

    invoke-virtual {v1}, LM0/K;->l()LM0/J;

    move-result-object v2

    invoke-virtual {v2}, LM0/J;->j()LM0/d;

    move-result-object v2

    invoke-virtual {v2}, LM0/d;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v0, v3, v2}, LE7/j;->k(III)I

    move-result v0

    invoke-virtual {v1, v0}, LM0/K;->e(I)Ln0/i;

    move-result-object v0

    invoke-virtual {v0}, Ln0/i;->i()F

    move-result v1

    invoke-static {}, LH/G;->b()F

    move-result v2

    invoke-interface {p1, v2}, LY0/e;->B0(F)F

    move-result p1

    const/4 v2, 0x2

    int-to-float v2, v2

    div-float/2addr p1, v2

    add-float/2addr v1, p1

    invoke-virtual {v0}, Ln0/i;->e()F

    move-result p1

    invoke-static {v1, p1}, Ln0/h;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method public final C()LH/k;
    .locals 1

    iget-object v0, p0, LN/F;->p:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LH/k;

    return-object v0
.end method

.method public final D()Z
    .locals 1

    iget-object v0, p0, LN/F;->k:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final E()Z
    .locals 1

    iget-object v0, p0, LN/F;->l:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final F()Landroidx/compose/ui/focus/n;
    .locals 1

    iget-object v0, p0, LN/F;->j:Landroidx/compose/ui/focus/n;

    return-object v0
.end method

.method public final G(Z)J
    .locals 4

    .prologue
    iget-object v0, p0, LN/F;->d:LH/w;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, LH/w;->j()LH/V;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, LH/V;->f()LM0/K;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, LN/F;->N()LM0/d;

    move-result-object v1

    if-nez v1, :cond_1

    sget-object p1, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {p1}, Ln0/g$a;->b()J

    move-result-wide v0

    return-wide v0

    :cond_1
    invoke-virtual {v0}, LM0/K;->l()LM0/J;

    move-result-object v2

    invoke-virtual {v2}, LM0/J;->j()LM0/d;

    move-result-object v2

    invoke-virtual {v2}, LM0/d;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, LM0/d;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    sget-object p1, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {p1}, Ln0/g$a;->b()J

    move-result-wide v0

    return-wide v0

    :cond_2
    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v1

    invoke-virtual {v1}, LS0/V;->h()J

    move-result-wide v1

    if-eqz p1, :cond_3

    invoke-static {v1, v2}, LM0/N;->n(J)I

    move-result v1

    goto :goto_0

    :cond_3
    invoke-static {v1, v2}, LM0/N;->i(J)I

    move-result v1

    :goto_0
    iget-object v2, p0, LN/F;->b:LS0/L;

    invoke-interface {v2, v1}, LS0/L;->b(I)I

    move-result v1

    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v2

    invoke-virtual {v2}, LS0/V;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, LM0/N;->m(J)Z

    move-result v2

    invoke-static {v0, v1, p1, v2}, LN/L;->b(LM0/K;IZZ)J

    move-result-wide v0

    return-wide v0

    :cond_4
    :goto_1
    sget-object p1, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {p1}, Ln0/g$a;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public final H()Lv0/a;
    .locals 1

    iget-object v0, p0, LN/F;->i:Lv0/a;

    return-object v0
.end method

.method public final I()LN/h;
    .locals 1

    iget-object v0, p0, LN/F;->v:LN/h;

    return-object v0
.end method

.method public final J()LS0/L;
    .locals 1

    iget-object v0, p0, LN/F;->b:LS0/L;

    return-object v0
.end method

.method public final K()Lx7/l;
    .locals 1

    iget-object v0, p0, LN/F;->c:Lx7/l;

    return-object v0
.end method

.method public final L()LH/w;
    .locals 1

    iget-object v0, p0, LN/F;->d:LH/w;

    return-object v0
.end method

.method public final M()LH/F;
    .locals 1

    iget-object v0, p0, LN/F;->u:LH/F;

    return-object v0
.end method

.method public final N()LM0/d;
    .locals 1

    .prologue
    iget-object v0, p0, LN/F;->d:LH/w;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LH/w;->v()LH/D;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LH/D;->k()LM0/d;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final O()LS0/V;
    .locals 1

    iget-object v0, p0, LN/F;->e:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LS0/V;

    return-object v0
.end method

.method public final P()LS0/g0;
    .locals 1

    iget-object v0, p0, LN/F;->f:LS0/g0;

    return-object v0
.end method

.method public final Q(Z)LH/F;
    .locals 1

    new-instance v0, LN/F$b;

    invoke-direct {v0, p0, p1}, LN/F$b;-><init>(LN/F;Z)V

    return-object v0
.end method

.method public final R()V
    .locals 2

    .prologue
    iget-object v0, p0, LN/F;->h:Landroidx/compose/ui/platform/t1;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/compose/ui/platform/t1;->d()Landroidx/compose/ui/platform/v1;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Landroidx/compose/ui/platform/v1;->C:Landroidx/compose/ui/platform/v1;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LN/F;->h:Landroidx/compose/ui/platform/t1;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroidx/compose/ui/platform/t1;->a()V

    :cond_1
    return-void
.end method

.method public final S()Z
    .locals 2

    iget-object v0, p0, LN/F;->s:LS0/V;

    invoke-virtual {v0}, LS0/V;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v1

    invoke-virtual {v1}, LS0/V;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final T()V
    .locals 4

    .prologue
    iget-object v0, p0, LN/F;->g:Landroidx/compose/ui/platform/m0;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroidx/compose/ui/platform/m0;->a()LM0/d;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v1

    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v2

    invoke-virtual {v2}, LS0/V;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v1, v2}, LS0/W;->c(LS0/V;I)LM0/d;

    move-result-object v1

    invoke-virtual {v1, v0}, LM0/d;->n(LM0/d;)LM0/d;

    move-result-object v1

    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v2

    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v3

    invoke-virtual {v3}, LS0/V;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v2, v3}, LS0/W;->b(LS0/V;I)LM0/d;

    move-result-object v2

    invoke-virtual {v1, v2}, LM0/d;->n(LM0/d;)LM0/d;

    move-result-object v1

    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v2

    invoke-virtual {v2}, LS0/V;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, LM0/N;->l(J)I

    move-result v2

    invoke-virtual {v0}, LM0/d;->length()I

    move-result v0

    add-int/2addr v2, v0

    invoke-static {v2, v2}, LM0/O;->b(II)J

    move-result-wide v2

    invoke-direct {p0, v1, v2, v3}, LN/F;->q(LM0/d;J)LS0/V;

    move-result-object v0

    iget-object v1, p0, LN/F;->c:Lx7/l;

    invoke-interface {v1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, LH/l;->C:LH/l;

    invoke-direct {p0, v0}, LN/F;->c0(LH/l;)V

    iget-object v0, p0, LN/F;->a:LH/Y;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LH/Y;->a()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final U()V
    .locals 9

    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v0

    invoke-virtual {v0}, LS0/V;->f()LM0/d;

    move-result-object v0

    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v1

    invoke-virtual {v1}, LS0/V;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v2, v1}, LM0/O;->b(II)J

    move-result-wide v1

    invoke-direct {p0, v0, v1, v2}, LN/F;->q(LM0/d;J)LS0/V;

    move-result-object v0

    iget-object v1, p0, LN/F;->c:Lx7/l;

    invoke-interface {v1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, LN/F;->s:LS0/V;

    invoke-virtual {v0}, LS0/V;->h()J

    move-result-wide v4

    const/4 v7, 0x5

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, LS0/V;->d(LS0/V;LM0/d;JLM0/N;ILjava/lang/Object;)LS0/V;

    move-result-object v0

    iput-object v0, p0, LN/F;->s:LS0/V;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LN/F;->v(Z)V

    return-void
.end method

.method public final V(Landroidx/compose/ui/platform/m0;)V
    .locals 0

    iput-object p1, p0, LN/F;->g:Landroidx/compose/ui/platform/m0;

    return-void
.end method

.method public final X(J)V
    .locals 3

    .prologue
    iget-object v0, p0, LN/F;->d:LH/w;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1, p2}, LH/w;->A(J)V

    :goto_0
    iget-object v0, p0, LN/F;->d:LH/w;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    sget-object v1, LM0/N;->b:LM0/N$a;

    invoke-virtual {v1}, LM0/N$a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LH/w;->I(J)V

    :goto_1
    invoke-static {p1, p2}, LM0/N;->h(J)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, LN/F;->x()V

    :cond_2
    return-void
.end method

.method public final Z(Z)V
    .locals 1

    iget-object v0, p0, LN/F;->k:LV/w0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final a0(Z)V
    .locals 1

    iget-object v0, p0, LN/F;->l:LV/w0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final b0(Landroidx/compose/ui/focus/n;)V
    .locals 0

    iput-object p1, p0, LN/F;->j:Landroidx/compose/ui/focus/n;

    return-void
.end method

.method public final d0(Lv0/a;)V
    .locals 0

    iput-object p1, p0, LN/F;->i:Lv0/a;

    return-void
.end method

.method public final e0(LS0/L;)V
    .locals 0

    iput-object p1, p0, LN/F;->b:LS0/L;

    return-void
.end method

.method public final f0(Lx7/l;)V
    .locals 0

    iput-object p1, p0, LN/F;->c:Lx7/l;

    return-void
.end method

.method public final g0(J)V
    .locals 3

    .prologue
    iget-object v0, p0, LN/F;->d:LH/w;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1, p2}, LH/w;->I(J)V

    :goto_0
    iget-object v0, p0, LN/F;->d:LH/w;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    sget-object v1, LM0/N;->b:LM0/N$a;

    invoke-virtual {v1}, LM0/N$a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LH/w;->A(J)V

    :goto_1
    invoke-static {p1, p2}, LM0/N;->h(J)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, LN/F;->x()V

    :cond_2
    return-void
.end method

.method public final h0(LH/w;)V
    .locals 0

    iput-object p1, p0, LN/F;->d:LH/w;

    return-void
.end method

.method public final i0(Landroidx/compose/ui/platform/t1;)V
    .locals 0

    iput-object p1, p0, LN/F;->h:Landroidx/compose/ui/platform/t1;

    return-void
.end method

.method public final j0(LS0/V;)V
    .locals 1

    iget-object v0, p0, LN/F;->e:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final k0(LS0/g0;)V
    .locals 0

    iput-object p1, p0, LN/F;->f:LS0/g0;

    return-void
.end method

.method public final l0()V
    .locals 9

    .prologue
    invoke-virtual {p0}, LN/F;->E()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, LN/F;->d:LH/w;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LH/w;->y()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v0, p0, LN/F;->f:LS0/g0;

    instance-of v0, v0, LS0/N;

    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v1

    invoke-virtual {v1}, LS0/V;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, LM0/N;->h(J)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    if-nez v0, :cond_1

    new-instance v1, LN/F$e;

    invoke-direct {v1, p0}, LN/F$e;-><init>(LN/F;)V

    move-object v5, v1

    goto :goto_0

    :cond_1
    move-object v5, v2

    :goto_0
    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v1

    invoke-virtual {v1}, LS0/V;->h()J

    move-result-wide v3

    invoke-static {v3, v4}, LM0/N;->h(J)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, LN/F;->D()Z

    move-result v1

    if-eqz v1, :cond_2

    if-nez v0, :cond_2

    new-instance v0, LN/F$f;

    invoke-direct {v0, p0}, LN/F$f;-><init>(LN/F;)V

    move-object v7, v0

    goto :goto_1

    :cond_2
    move-object v7, v2

    :goto_1
    invoke-virtual {p0}, LN/F;->D()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, LN/F;->g:Landroidx/compose/ui/platform/m0;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Landroidx/compose/ui/platform/m0;->c()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    new-instance v0, LN/F$g;

    invoke-direct {v0, p0}, LN/F$g;-><init>(LN/F;)V

    move-object v6, v0

    goto :goto_2

    :cond_3
    move-object v6, v2

    :goto_2
    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v0

    invoke-virtual {v0}, LS0/V;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LM0/N;->j(J)I

    move-result v0

    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v1

    invoke-virtual {v1}, LS0/V;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-eq v0, v1, :cond_4

    new-instance v2, LN/F$h;

    invoke-direct {v2, p0}, LN/F$h;-><init>(LN/F;)V

    :cond_4
    move-object v8, v2

    iget-object v3, p0, LN/F;->h:Landroidx/compose/ui/platform/t1;

    if-eqz v3, :cond_5

    invoke-direct {p0}, LN/F;->z()Ln0/i;

    move-result-object v4

    invoke-interface/range {v3 .. v8}, Landroidx/compose/ui/platform/t1;->b(Ln0/i;Lx7/a;Lx7/a;Lx7/a;Lx7/a;)V

    :cond_5
    :goto_3
    return-void
.end method

.method public final n()V
    .locals 3

    .prologue
    iget-object v0, p0, LN/F;->d:LH/w;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, LM0/N;->b:LM0/N$a;

    invoke-virtual {v1}, LM0/N$a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LH/w;->A(J)V

    :goto_0
    iget-object v0, p0, LN/F;->d:LH/w;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    sget-object v1, LM0/N;->b:LM0/N$a;

    invoke-virtual {v1}, LM0/N$a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LH/w;->I(J)V

    :goto_1
    return-void
.end method

.method public final o(Z)V
    .locals 3

    .prologue
    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v0

    invoke-virtual {v0}, LS0/V;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LM0/N;->h(J)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LN/F;->g:Landroidx/compose/ui/platform/m0;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v1

    invoke-static {v1}, LS0/W;->a(LS0/V;)LM0/d;

    move-result-object v1

    invoke-interface {v0, v1}, Landroidx/compose/ui/platform/m0;->b(LM0/d;)V

    :cond_1
    if-nez p1, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object p1

    invoke-virtual {p1}, LS0/V;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LM0/N;->k(J)I

    move-result p1

    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v0

    invoke-virtual {v0}, LS0/V;->f()LM0/d;

    move-result-object v0

    invoke-static {p1, p1}, LM0/O;->b(II)J

    move-result-wide v1

    invoke-direct {p0, v0, v1, v2}, LN/F;->q(LM0/d;J)LS0/V;

    move-result-object p1

    iget-object v0, p0, LN/F;->c:Lx7/l;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, LH/l;->C:LH/l;

    invoke-direct {p0, p1}, LN/F;->c0(LH/l;)V

    return-void
.end method

.method public final r()LH/F;
    .locals 1

    new-instance v0, LN/F$a;

    invoke-direct {v0, p0}, LN/F$a;-><init>(LN/F;)V

    return-object v0
.end method

.method public final s()V
    .locals 3

    .prologue
    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v0

    invoke-virtual {v0}, LS0/V;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LM0/N;->h(J)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LN/F;->g:Landroidx/compose/ui/platform/m0;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v1

    invoke-static {v1}, LS0/W;->a(LS0/V;)LM0/d;

    move-result-object v1

    invoke-interface {v0, v1}, Landroidx/compose/ui/platform/m0;->b(LM0/d;)V

    :cond_1
    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v0

    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v1

    invoke-virtual {v1}, LS0/V;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v0, v1}, LS0/W;->c(LS0/V;I)LM0/d;

    move-result-object v0

    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v1

    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v2

    invoke-virtual {v2}, LS0/V;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v1, v2}, LS0/W;->b(LS0/V;I)LM0/d;

    move-result-object v1

    invoke-virtual {v0, v1}, LM0/d;->n(LM0/d;)LM0/d;

    move-result-object v0

    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v1

    invoke-virtual {v1}, LS0/V;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, LM0/N;->l(J)I

    move-result v1

    invoke-static {v1, v1}, LM0/O;->b(II)J

    move-result-wide v1

    invoke-direct {p0, v0, v1, v2}, LN/F;->q(LM0/d;J)LS0/V;

    move-result-object v0

    iget-object v1, p0, LN/F;->c:Lx7/l;

    invoke-interface {v1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, LH/l;->C:LH/l;

    invoke-direct {p0, v0}, LN/F;->c0(LH/l;)V

    iget-object v0, p0, LN/F;->a:LH/Y;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LH/Y;->a()V

    :cond_2
    return-void
.end method

.method public final t(Ln0/g;)V
    .locals 8

    .prologue
    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v0

    invoke-virtual {v0}, LS0/V;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LM0/N;->h(J)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LN/F;->d:LH/w;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LH/w;->j()LH/V;

    move-result-object v0

    :goto_0
    move-object v1, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    if-eqz p1, :cond_1

    if-eqz v1, :cond_1

    iget-object v0, p0, LN/F;->b:LS0/L;

    invoke-virtual {p1}, Ln0/g;->v()J

    move-result-wide v2

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LH/V;->e(LH/V;JZILjava/lang/Object;)I

    move-result v1

    invoke-interface {v0, v1}, LS0/L;->a(I)I

    move-result v0

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v0

    invoke-virtual {v0}, LS0/V;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LM0/N;->k(J)I

    move-result v0

    :goto_2
    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v1

    invoke-static {v0}, LM0/O;->a(I)J

    move-result-wide v3

    const/4 v6, 0x5

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, LS0/V;->d(LS0/V;LM0/d;JLM0/N;ILjava/lang/Object;)LS0/V;

    move-result-object v0

    iget-object v1, p0, LN/F;->c:Lx7/l;

    invoke-interface {v1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object p1

    invoke-virtual {p1}, LS0/V;->i()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_3

    sget-object p1, LH/l;->E:LH/l;

    goto :goto_3

    :cond_3
    sget-object p1, LH/l;->C:LH/l;

    :goto_3
    invoke-direct {p0, p1}, LN/F;->c0(LH/l;)V

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LN/F;->m0(Z)V

    return-void
.end method

.method public final v(Z)V
    .locals 1

    .prologue
    iget-object v0, p0, LN/F;->d:LH/w;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LH/w;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LN/F;->j:Landroidx/compose/ui/focus/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/focus/n;->f()V

    :cond_0
    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v0

    iput-object v0, p0, LN/F;->s:LS0/V;

    invoke-direct {p0, p1}, LN/F;->m0(Z)V

    sget-object p1, LH/l;->D:LH/l;

    invoke-direct {p0, p1}, LN/F;->c0(LH/l;)V

    return-void
.end method

.method public final x()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LN/F;->m0(Z)V

    sget-object v0, LH/l;->C:LH/l;

    invoke-direct {p0, v0}, LN/F;->c0(LH/l;)V

    return-void
.end method

.method public final y()Landroidx/compose/ui/platform/m0;
    .locals 1

    iget-object v0, p0, LN/F;->g:Landroidx/compose/ui/platform/m0;

    return-object v0
.end method
