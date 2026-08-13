.class public final LM/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:LM0/d;

.field private b:LM0/P;

.field private c:LR0/h$b;

.field private d:I

.field private e:Z

.field private f:I

.field private g:I

.field private h:Ljava/util/List;

.field private i:LM/c;

.field private j:J

.field private k:LY0/e;

.field private l:LM0/k;

.field private m:LY0/v;

.field private n:LM0/K;

.field private o:I

.field private p:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(LM0/d;LM0/P;LR0/h$b;IZIILjava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM/e;->a:LM0/d;

    iput-object p2, p0, LM/e;->b:LM0/P;

    iput-object p3, p0, LM/e;->c:LR0/h$b;

    iput p4, p0, LM/e;->d:I

    iput-boolean p5, p0, LM/e;->e:Z

    iput p6, p0, LM/e;->f:I

    iput p7, p0, LM/e;->g:I

    iput-object p8, p0, LM/e;->h:Ljava/util/List;

    sget-object p1, LM/a;->a:LM/a$a;

    invoke-virtual {p1}, LM/a$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, LM/e;->j:J

    const/4 p1, -0x1

    iput p1, p0, LM/e;->o:I

    iput p1, p0, LM/e;->p:I

    return-void
.end method

.method public synthetic constructor <init>(LM0/d;LM0/P;LR0/h$b;IZIILjava/util/List;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, LM/e;-><init>(LM0/d;LM0/P;LR0/h$b;IZIILjava/util/List;)V

    return-void
.end method

.method private final e(JLY0/v;)LM0/j;
    .locals 7

    invoke-direct {p0, p3}, LM/e;->l(LY0/v;)LM0/k;

    move-result-object v1

    new-instance p3, LM0/j;

    iget-boolean v0, p0, LM/e;->e:Z

    iget v2, p0, LM/e;->d:I

    invoke-virtual {v1}, LM0/k;->b()F

    move-result v3

    invoke-static {p1, p2, v0, v2, v3}, LM/b;->a(JZIF)J

    move-result-wide v2

    iget-boolean p1, p0, LM/e;->e:Z

    iget p2, p0, LM/e;->d:I

    iget v0, p0, LM/e;->f:I

    invoke-static {p1, p2, v0}, LM/b;->b(ZII)I

    move-result v4

    iget p1, p0, LM/e;->d:I

    sget-object p2, LX0/u;->a:LX0/u$a;

    invoke-virtual {p2}, LX0/u$a;->b()I

    move-result p2

    invoke-static {p1, p2}, LX0/u;->e(II)Z

    move-result v5

    const/4 v6, 0x0

    move-object v0, p3

    invoke-direct/range {v0 .. v6}, LM0/j;-><init>(LM0/k;JIZLy7/k;)V

    return-object p3
.end method

.method private final g()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LM/e;->l:LM0/k;

    iput-object v0, p0, LM/e;->n:LM0/K;

    const/4 v0, -0x1

    iput v0, p0, LM/e;->p:I

    iput v0, p0, LM/e;->o:I

    return-void
.end method

.method private final j(LM0/K;JLY0/v;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, LM0/K;->w()LM0/j;

    move-result-object v1

    invoke-virtual {v1}, LM0/j;->j()LM0/k;

    move-result-object v1

    invoke-virtual {v1}, LM0/k;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p1}, LM0/K;->l()LM0/J;

    move-result-object v1

    invoke-virtual {v1}, LM0/J;->d()LY0/v;

    move-result-object v1

    if-eq p4, v1, :cond_2

    return v0

    :cond_2
    invoke-virtual {p1}, LM0/K;->l()LM0/J;

    move-result-object p4

    invoke-virtual {p4}, LM0/J;->a()J

    move-result-wide v1

    invoke-static {p2, p3, v1, v2}, LY0/b;->f(JJ)Z

    move-result p4

    const/4 v1, 0x0

    if-eqz p4, :cond_3

    return v1

    :cond_3
    invoke-static {p2, p3}, LY0/b;->l(J)I

    move-result p4

    invoke-virtual {p1}, LM0/K;->l()LM0/J;

    move-result-object v2

    invoke-virtual {v2}, LM0/J;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/b;->l(J)I

    move-result v2

    if-eq p4, v2, :cond_4

    return v0

    :cond_4
    invoke-static {p2, p3}, LY0/b;->k(J)I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p1}, LM0/K;->w()LM0/j;

    move-result-object p3

    invoke-virtual {p3}, LM0/j;->h()F

    move-result p3

    cmpg-float p2, p2, p3

    if-ltz p2, :cond_6

    invoke-virtual {p1}, LM0/K;->w()LM0/j;

    move-result-object p1

    invoke-virtual {p1}, LM0/j;->f()Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_0

    :cond_5
    return v1

    :cond_6
    :goto_0
    return v0
.end method

.method private final l(LY0/v;)LM0/k;
    .locals 8

    .prologue
    iget-object v0, p0, LM/e;->l:LM0/k;

    if-eqz v0, :cond_0

    iget-object v1, p0, LM/e;->m:LY0/v;

    if-ne p1, v1, :cond_0

    invoke-virtual {v0}, LM0/k;->c()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_0
    iput-object p1, p0, LM/e;->m:LY0/v;

    iget-object v3, p0, LM/e;->a:LM0/d;

    iget-object v0, p0, LM/e;->b:LM0/P;

    invoke-static {v0, p1}, LM0/Q;->d(LM0/P;LY0/v;)LM0/P;

    move-result-object v4

    iget-object v6, p0, LM/e;->k:LY0/e;

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v7, p0, LM/e;->c:LR0/h$b;

    iget-object p1, p0, LM/e;->h:Ljava/util/List;

    if-nez p1, :cond_1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    :cond_1
    move-object v5, p1

    new-instance v0, LM0/k;

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, LM0/k;-><init>(LM0/d;LM0/P;Ljava/util/List;LY0/e;LR0/h$b;)V

    :cond_2
    iput-object v0, p0, LM/e;->l:LM0/k;

    return-object v0
.end method

.method private final m(LY0/v;JLM0/j;)LM0/K;
    .locals 22

    .prologue
    move-object/from16 v0, p0

    invoke-virtual/range {p4 .. p4}, LM0/j;->j()LM0/k;

    move-result-object v1

    invoke-virtual {v1}, LM0/k;->b()F

    move-result v1

    invoke-virtual/range {p4 .. p4}, LM0/j;->A()F

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    new-instance v8, LM0/K;

    new-instance v3, LM0/J;

    iget-object v10, v0, LM/e;->a:LM0/d;

    iget-object v11, v0, LM/e;->b:LM0/P;

    iget-object v2, v0, LM/e;->h:Ljava/util/List;

    if-nez v2, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v2

    :cond_0
    move-object v12, v2

    iget v13, v0, LM/e;->f:I

    iget-boolean v14, v0, LM/e;->e:Z

    iget v15, v0, LM/e;->d:I

    iget-object v2, v0, LM/e;->k:LY0/e;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v4, v0, LM/e;->c:LR0/h$b;

    const/16 v21, 0x0

    move-object v9, v3

    move-object/from16 v16, v2

    move-object/from16 v17, p1

    move-object/from16 v18, v4

    move-wide/from16 v19, p2

    invoke-direct/range {v9 .. v21}, LM0/J;-><init>(LM0/d;LM0/P;Ljava/util/List;IZILY0/e;LY0/v;LR0/h$b;JLy7/k;)V

    invoke-static {v1}, LH/E;->a(F)I

    move-result v1

    invoke-virtual/range {p4 .. p4}, LM0/j;->h()F

    move-result v2

    invoke-static {v2}, LH/E;->a(F)I

    move-result v2

    invoke-static {v1, v2}, LY0/u;->a(II)J

    move-result-wide v1

    move-wide/from16 v4, p2

    invoke-static {v4, v5, v1, v2}, LY0/c;->f(JJ)J

    move-result-wide v5

    const/4 v7, 0x0

    move-object v2, v8

    move-object/from16 v4, p4

    invoke-direct/range {v2 .. v7}, LM0/K;-><init>(LM0/J;LM0/j;JLy7/k;)V

    return-object v8
.end method


# virtual methods
.method public final a()LY0/e;
    .locals 1

    iget-object v0, p0, LM/e;->k:LY0/e;

    return-object v0
.end method

.method public final b()LM0/K;
    .locals 1

    iget-object v0, p0, LM/e;->n:LM0/K;

    return-object v0
.end method

.method public final c()LM0/K;
    .locals 2

    .prologue
    iget-object v0, p0, LM/e;->n:LM0/K;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You must call layoutWithConstraints first"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d(ILY0/v;)I
    .locals 3

    .prologue
    iget v0, p0, LM/e;->o:I

    iget v1, p0, LM/e;->p:I

    if-ne p1, v0, :cond_0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    return v1

    :cond_0
    const v0, 0x7fffffff

    const/4 v1, 0x0

    invoke-static {v1, p1, v1, v0}, LY0/c;->a(IIII)J

    move-result-wide v0

    invoke-direct {p0, v0, v1, p2}, LM/e;->e(JLY0/v;)LM0/j;

    move-result-object p2

    invoke-virtual {p2}, LM0/j;->h()F

    move-result p2

    invoke-static {p2}, LH/E;->a(F)I

    move-result p2

    iput p1, p0, LM/e;->o:I

    iput p2, p0, LM/e;->p:I

    return p2
.end method

.method public final f(JLY0/v;)Z
    .locals 8

    .prologue
    iget v0, p0, LM/e;->g:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    sget-object v2, LM/c;->h:LM/c$a;

    iget-object v3, p0, LM/e;->i:LM/c;

    iget-object v5, p0, LM/e;->b:LM0/P;

    iget-object v6, p0, LM/e;->k:LY0/e;

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v7, p0, LM/e;->c:LR0/h$b;

    move-object v4, p3

    invoke-virtual/range {v2 .. v7}, LM/c$a;->a(LM/c;LY0/v;LM0/P;LY0/e;LR0/h$b;)LM/c;

    move-result-object v0

    iput-object v0, p0, LM/e;->i:LM/c;

    iget v2, p0, LM/e;->g:I

    invoke-virtual {v0, p1, p2, v2}, LM/c;->c(JI)J

    move-result-wide p1

    :cond_0
    iget-object v0, p0, LM/e;->n:LM0/K;

    invoke-direct {p0, v0, p1, p2, p3}, LM/e;->j(LM0/K;JLY0/v;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LM/e;->n:LM0/K;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, LM0/K;->l()LM0/J;

    move-result-object v0

    invoke-virtual {v0}, LM0/J;->a()J

    move-result-wide v2

    invoke-static {p1, p2, v2, v3}, LY0/b;->f(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object v0, p0, LM/e;->n:LM0/K;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, LM0/K;->w()LM0/j;

    move-result-object v0

    :goto_0
    invoke-direct {p0, p3, p1, p2, v0}, LM/e;->m(LY0/v;JLM0/j;)LM0/K;

    move-result-object p1

    iput-object p1, p0, LM/e;->n:LM0/K;

    return v1

    :cond_2
    invoke-direct {p0, p1, p2, p3}, LM/e;->e(JLY0/v;)LM0/j;

    move-result-object v0

    goto :goto_0
.end method

.method public final h(LY0/v;)I
    .locals 0

    invoke-direct {p0, p1}, LM/e;->l(LY0/v;)LM0/k;

    move-result-object p1

    invoke-virtual {p1}, LM0/k;->b()F

    move-result p1

    invoke-static {p1}, LH/E;->a(F)I

    move-result p1

    return p1
.end method

.method public final i(LY0/v;)I
    .locals 0

    invoke-direct {p0, p1}, LM/e;->l(LY0/v;)LM0/k;

    move-result-object p1

    invoke-virtual {p1}, LM0/k;->a()F

    move-result p1

    invoke-static {p1}, LH/E;->a(F)I

    move-result p1

    return p1
.end method

.method public final k(LY0/e;)V
    .locals 5

    .prologue
    iget-object v0, p0, LM/e;->k:LY0/e;

    if-eqz p1, :cond_0

    invoke-static {p1}, LM/a;->d(LY0/e;)J

    move-result-wide v1

    goto :goto_0

    :cond_0
    sget-object v1, LM/a;->a:LM/a$a;

    invoke-virtual {v1}, LM/a$a;->a()J

    move-result-wide v1

    :goto_0
    if-nez v0, :cond_1

    iput-object p1, p0, LM/e;->k:LY0/e;

    iput-wide v1, p0, LM/e;->j:J

    return-void

    :cond_1
    if-eqz p1, :cond_2

    iget-wide v3, p0, LM/e;->j:J

    invoke-static {v3, v4, v1, v2}, LM/a;->e(JJ)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    iput-object p1, p0, LM/e;->k:LY0/e;

    iput-wide v1, p0, LM/e;->j:J

    invoke-direct {p0}, LM/e;->g()V

    :cond_3
    return-void
.end method

.method public final n(LM0/d;LM0/P;LR0/h$b;IZIILjava/util/List;)V
    .locals 0

    iput-object p1, p0, LM/e;->a:LM0/d;

    iput-object p2, p0, LM/e;->b:LM0/P;

    iput-object p3, p0, LM/e;->c:LR0/h$b;

    iput p4, p0, LM/e;->d:I

    iput-boolean p5, p0, LM/e;->e:Z

    iput p6, p0, LM/e;->f:I

    iput p7, p0, LM/e;->g:I

    iput-object p8, p0, LM/e;->h:Ljava/util/List;

    invoke-direct {p0}, LM/e;->g()V

    return-void
.end method
