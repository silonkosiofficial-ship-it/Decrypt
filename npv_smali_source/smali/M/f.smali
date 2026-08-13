.class public final LM/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:LM0/P;

.field private c:LR0/h$b;

.field private d:I

.field private e:Z

.field private f:I

.field private g:I

.field private h:J

.field private i:LY0/e;

.field private j:LM0/p;

.field private k:Z

.field private l:J

.field private m:LM/c;

.field private n:LM0/s;

.field private o:LY0/v;

.field private p:J

.field private q:I

.field private r:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;LM0/P;LR0/h$b;IZII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM/f;->a:Ljava/lang/String;

    iput-object p2, p0, LM/f;->b:LM0/P;

    iput-object p3, p0, LM/f;->c:LR0/h$b;

    iput p4, p0, LM/f;->d:I

    iput-boolean p5, p0, LM/f;->e:Z

    iput p6, p0, LM/f;->f:I

    iput p7, p0, LM/f;->g:I

    sget-object p1, LM/a;->a:LM/a$a;

    invoke-virtual {p1}, LM/a$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, LM/f;->h:J

    const/4 p1, 0x0

    invoke-static {p1, p1}, LY0/u;->a(II)J

    move-result-wide p2

    iput-wide p2, p0, LM/f;->l:J

    sget-object p2, LY0/b;->b:LY0/b$a;

    invoke-virtual {p2, p1, p1}, LY0/b$a;->c(II)J

    move-result-wide p1

    iput-wide p1, p0, LM/f;->p:J

    const/4 p1, -0x1

    iput p1, p0, LM/f;->q:I

    iput p1, p0, LM/f;->r:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;LM0/P;LR0/h$b;IZIILy7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, LM/f;-><init>(Ljava/lang/String;LM0/P;LR0/h$b;IZII)V

    return-void
.end method

.method private final g(JLY0/v;)LM0/p;
    .locals 3

    invoke-direct {p0, p3}, LM/f;->n(LY0/v;)LM0/s;

    move-result-object p3

    iget-boolean v0, p0, LM/f;->e:Z

    iget v1, p0, LM/f;->d:I

    invoke-interface {p3}, LM0/s;->b()F

    move-result v2

    invoke-static {p1, p2, v0, v1, v2}, LM/b;->a(JZIF)J

    move-result-wide p1

    iget-boolean v0, p0, LM/f;->e:Z

    iget v1, p0, LM/f;->d:I

    iget v2, p0, LM/f;->f:I

    invoke-static {v0, v1, v2}, LM/b;->b(ZII)I

    move-result v0

    iget v1, p0, LM/f;->d:I

    sget-object v2, LX0/u;->a:LX0/u$a;

    invoke-virtual {v2}, LX0/u$a;->b()I

    move-result v2

    invoke-static {v1, v2}, LX0/u;->e(II)Z

    move-result v1

    invoke-static {p3, p1, p2, v0, v1}, LM0/u;->c(LM0/s;JIZ)LM0/p;

    move-result-object p1

    return-object p1
.end method

.method private final i()V
    .locals 4

    const/4 v0, 0x0

    iput-object v0, p0, LM/f;->j:LM0/p;

    iput-object v0, p0, LM/f;->n:LM0/s;

    iput-object v0, p0, LM/f;->o:LY0/v;

    const/4 v0, -0x1

    iput v0, p0, LM/f;->q:I

    iput v0, p0, LM/f;->r:I

    sget-object v0, LY0/b;->b:LY0/b$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, LY0/b$a;->c(II)J

    move-result-wide v2

    iput-wide v2, p0, LM/f;->p:J

    invoke-static {v1, v1}, LY0/u;->a(II)J

    move-result-wide v2

    iput-wide v2, p0, LM/f;->l:J

    iput-boolean v1, p0, LM/f;->k:Z

    return-void
.end method

.method private final l(JLY0/v;)Z
    .locals 5

    .prologue
    iget-object v0, p0, LM/f;->j:LM0/p;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v2, p0, LM/f;->n:LM0/s;

    if-nez v2, :cond_1

    return v1

    :cond_1
    invoke-interface {v2}, LM0/s;->c()Z

    move-result v2

    if-eqz v2, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, LM/f;->o:LY0/v;

    if-eq p3, v2, :cond_3

    return v1

    :cond_3
    iget-wide v2, p0, LM/f;->p:J

    invoke-static {p1, p2, v2, v3}, LY0/b;->f(JJ)Z

    move-result p3

    const/4 v2, 0x0

    if-eqz p3, :cond_4

    return v2

    :cond_4
    invoke-static {p1, p2}, LY0/b;->l(J)I

    move-result p3

    iget-wide v3, p0, LM/f;->p:J

    invoke-static {v3, v4}, LY0/b;->l(J)I

    move-result v3

    if-eq p3, v3, :cond_5

    return v1

    :cond_5
    invoke-static {p1, p2}, LY0/b;->k(J)I

    move-result p1

    int-to-float p1, p1

    invoke-interface {v0}, LM0/p;->getHeight()F

    move-result p2

    cmpg-float p1, p1, p2

    if-ltz p1, :cond_7

    invoke-interface {v0}, LM0/p;->w()Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_0

    :cond_6
    return v2

    :cond_7
    :goto_0
    return v1
.end method

.method private final n(LY0/v;)LM0/s;
    .locals 10

    .prologue
    iget-object v0, p0, LM/f;->n:LM0/s;

    if-eqz v0, :cond_0

    iget-object v1, p0, LM/f;->o:LY0/v;

    if-ne p1, v1, :cond_0

    invoke-interface {v0}, LM0/s;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    iput-object p1, p0, LM/f;->o:LY0/v;

    iget-object v2, p0, LM/f;->a:Ljava/lang/String;

    iget-object v0, p0, LM/f;->b:LM0/P;

    invoke-static {v0, p1}, LM0/Q;->d(LM0/P;LY0/v;)LM0/P;

    move-result-object v3

    iget-object v6, p0, LM/f;->i:LY0/e;

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v7, p0, LM/f;->c:LR0/h$b;

    const/16 v8, 0xc

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v9}, LM0/t;->b(Ljava/lang/String;LM0/P;Ljava/util/List;Ljava/util/List;LY0/e;LR0/h$b;ILjava/lang/Object;)LM0/s;

    move-result-object v0

    :cond_1
    iput-object v0, p0, LM/f;->n:LM0/s;

    return-object v0
.end method


# virtual methods
.method public final a()LY0/e;
    .locals 1

    iget-object v0, p0, LM/f;->i:LY0/e;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, LM/f;->k:Z

    return v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, LM/f;->l:J

    return-wide v0
.end method

.method public final d()Li7/M;
    .locals 1

    .prologue
    iget-object v0, p0, LM/f;->n:LM0/s;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LM0/s;->c()Z

    :cond_0
    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method

.method public final e()LM0/p;
    .locals 1

    iget-object v0, p0, LM/f;->j:LM0/p;

    return-object v0
.end method

.method public final f(ILY0/v;)I
    .locals 3

    .prologue
    iget v0, p0, LM/f;->q:I

    iget v1, p0, LM/f;->r:I

    if-ne p1, v0, :cond_0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    return v1

    :cond_0
    const v0, 0x7fffffff

    const/4 v1, 0x0

    invoke-static {v1, p1, v1, v0}, LY0/c;->a(IIII)J

    move-result-wide v0

    invoke-direct {p0, v0, v1, p2}, LM/f;->g(JLY0/v;)LM0/p;

    move-result-object p2

    invoke-interface {p2}, LM0/p;->getHeight()F

    move-result p2

    invoke-static {p2}, LH/E;->a(F)I

    move-result p2

    iput p1, p0, LM/f;->q:I

    iput p2, p0, LM/f;->r:I

    return p2
.end method

.method public final h(JLY0/v;)Z
    .locals 8

    .prologue
    iget v0, p0, LM/f;->g:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    sget-object v2, LM/c;->h:LM/c$a;

    iget-object v3, p0, LM/f;->m:LM/c;

    iget-object v5, p0, LM/f;->b:LM0/P;

    iget-object v6, p0, LM/f;->i:LY0/e;

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v7, p0, LM/f;->c:LR0/h$b;

    move-object v4, p3

    invoke-virtual/range {v2 .. v7}, LM/c$a;->a(LM/c;LY0/v;LM0/P;LY0/e;LR0/h$b;)LM/c;

    move-result-object v0

    iput-object v0, p0, LM/f;->m:LM/c;

    iget v2, p0, LM/f;->g:I

    invoke-virtual {v0, p1, p2, v2}, LM/c;->c(JI)J

    move-result-wide p1

    :cond_0
    invoke-direct {p0, p1, p2, p3}, LM/f;->l(JLY0/v;)Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_4

    iget-wide v3, p0, LM/f;->p:J

    invoke-static {p1, p2, v3, v4}, LY0/b;->f(JJ)Z

    move-result p3

    if-nez p3, :cond_3

    iget-object p3, p0, LM/f;->j:LM0/p;

    invoke-static {p3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p3}, LM0/p;->b()F

    move-result v0

    invoke-interface {p3}, LM0/p;->getWidth()F

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->min(FF)F

    move-result v0

    invoke-static {v0}, LH/E;->a(F)I

    move-result v0

    invoke-interface {p3}, LM0/p;->getHeight()F

    move-result v3

    invoke-static {v3}, LH/E;->a(F)I

    move-result v3

    invoke-static {v0, v3}, LY0/u;->a(II)J

    move-result-wide v3

    invoke-static {p1, p2, v3, v4}, LY0/c;->f(JJ)J

    move-result-wide v3

    iput-wide v3, p0, LM/f;->l:J

    iget v0, p0, LM/f;->d:I

    sget-object v5, LX0/u;->a:LX0/u$a;

    invoke-virtual {v5}, LX0/u$a;->c()I

    move-result v5

    invoke-static {v0, v5}, LX0/u;->e(II)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v3, v4}, LY0/t;->g(J)I

    move-result v0

    int-to-float v0, v0

    invoke-interface {p3}, LM0/p;->getWidth()F

    move-result v5

    cmpg-float v0, v0, v5

    if-ltz v0, :cond_2

    invoke-static {v3, v4}, LY0/t;->f(J)I

    move-result v0

    int-to-float v0, v0

    invoke-interface {p3}, LM0/p;->getHeight()F

    move-result p3

    cmpg-float p3, v0, p3

    if-gez p3, :cond_1

    goto :goto_0

    :cond_1
    move v1, v2

    :cond_2
    :goto_0
    iput-boolean v1, p0, LM/f;->k:Z

    iput-wide p1, p0, LM/f;->p:J

    :cond_3
    return v2

    :cond_4
    invoke-direct {p0, p1, p2, p3}, LM/f;->g(JLY0/v;)LM0/p;

    move-result-object p3

    iput-wide p1, p0, LM/f;->p:J

    invoke-interface {p3}, LM0/p;->getWidth()F

    move-result v0

    invoke-static {v0}, LH/E;->a(F)I

    move-result v0

    invoke-interface {p3}, LM0/p;->getHeight()F

    move-result v3

    invoke-static {v3}, LH/E;->a(F)I

    move-result v3

    invoke-static {v0, v3}, LY0/u;->a(II)J

    move-result-wide v3

    invoke-static {p1, p2, v3, v4}, LY0/c;->f(JJ)J

    move-result-wide p1

    iput-wide p1, p0, LM/f;->l:J

    iget v0, p0, LM/f;->d:I

    sget-object v3, LX0/u;->a:LX0/u$a;

    invoke-virtual {v3}, LX0/u$a;->c()I

    move-result v3

    invoke-static {v0, v3}, LX0/u;->e(II)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {p1, p2}, LY0/t;->g(J)I

    move-result v0

    int-to-float v0, v0

    invoke-interface {p3}, LM0/p;->getWidth()F

    move-result v3

    cmpg-float v0, v0, v3

    if-ltz v0, :cond_5

    invoke-static {p1, p2}, LY0/t;->f(J)I

    move-result p1

    int-to-float p1, p1

    invoke-interface {p3}, LM0/p;->getHeight()F

    move-result p2

    cmpg-float p1, p1, p2

    if-gez p1, :cond_6

    :cond_5
    move v2, v1

    :cond_6
    iput-boolean v2, p0, LM/f;->k:Z

    iput-object p3, p0, LM/f;->j:LM0/p;

    return v1
.end method

.method public final j(LY0/v;)I
    .locals 0

    invoke-direct {p0, p1}, LM/f;->n(LY0/v;)LM0/s;

    move-result-object p1

    invoke-interface {p1}, LM0/s;->b()F

    move-result p1

    invoke-static {p1}, LH/E;->a(F)I

    move-result p1

    return p1
.end method

.method public final k(LY0/v;)I
    .locals 0

    invoke-direct {p0, p1}, LM/f;->n(LY0/v;)LM0/s;

    move-result-object p1

    invoke-interface {p1}, LM0/s;->a()F

    move-result p1

    invoke-static {p1}, LH/E;->a(F)I

    move-result p1

    return p1
.end method

.method public final m(LY0/e;)V
    .locals 5

    .prologue
    iget-object v0, p0, LM/f;->i:LY0/e;

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

    iput-object p1, p0, LM/f;->i:LY0/e;

    iput-wide v1, p0, LM/f;->h:J

    return-void

    :cond_1
    if-eqz p1, :cond_2

    iget-wide v3, p0, LM/f;->h:J

    invoke-static {v3, v4, v1, v2}, LM/a;->e(JJ)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    iput-object p1, p0, LM/f;->i:LY0/e;

    iput-wide v1, p0, LM/f;->h:J

    invoke-direct {p0}, LM/f;->i()V

    :cond_3
    return-void
.end method

.method public final o(LM0/P;)LM0/K;
    .locals 31

    .prologue
    move-object/from16 v0, p0

    iget-object v9, v0, LM/f;->o:LY0/v;

    const/4 v1, 0x0

    if-nez v9, :cond_0

    return-object v1

    :cond_0
    iget-object v14, v0, LM/f;->i:LY0/e;

    if-nez v14, :cond_1

    return-object v1

    :cond_1
    new-instance v15, LM0/d;

    iget-object v3, v0, LM/f;->a:Ljava/lang/String;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v15

    invoke-direct/range {v2 .. v7}, LM0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILy7/k;)V

    iget-object v2, v0, LM/f;->j:LM0/p;

    if-nez v2, :cond_2

    return-object v1

    :cond_2
    iget-object v2, v0, LM/f;->n:LM0/s;

    if-nez v2, :cond_3

    return-object v1

    :cond_3
    iget-wide v1, v0, LM/f;->p:J

    const/16 v22, 0xa

    const/16 v23, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-wide/from16 v16, v1

    invoke-static/range {v16 .. v23}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v26

    new-instance v16, LM0/K;

    new-instance v17, LM0/J;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v4

    iget v5, v0, LM/f;->f:I

    iget-boolean v6, v0, LM/f;->e:Z

    iget v7, v0, LM/f;->d:I

    iget-object v10, v0, LM/f;->c:LR0/h$b;

    const/4 v13, 0x0

    move-object/from16 v1, v17

    move-object v2, v15

    move-object/from16 v3, p1

    move-object v8, v14

    move-wide/from16 v11, v26

    invoke-direct/range {v1 .. v13}, LM0/J;-><init>(LM0/d;LM0/P;Ljava/util/List;IZILY0/e;LY0/v;LR0/h$b;JLy7/k;)V

    new-instance v8, LM0/j;

    new-instance v25, LM0/k;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v5

    iget-object v7, v0, LM/f;->c:LR0/h$b;

    move-object/from16 v2, v25

    move-object v3, v15

    move-object/from16 v4, p1

    move-object v6, v14

    invoke-direct/range {v2 .. v7}, LM0/k;-><init>(LM0/d;LM0/P;Ljava/util/List;LY0/e;LR0/h$b;)V

    iget v1, v0, LM/f;->f:I

    iget v2, v0, LM/f;->d:I

    sget-object v3, LX0/u;->a:LX0/u$a;

    invoke-virtual {v3}, LX0/u$a;->b()I

    move-result v3

    invoke-static {v2, v3}, LX0/u;->e(II)Z

    move-result v29

    const/16 v30, 0x0

    move-object/from16 v24, v8

    move/from16 v28, v1

    invoke-direct/range {v24 .. v30}, LM0/j;-><init>(LM0/k;JIZLy7/k;)V

    iget-wide v4, v0, LM/f;->l:J

    const/4 v6, 0x0

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    move-object v3, v8

    invoke-direct/range {v1 .. v6}, LM0/K;-><init>(LM0/J;LM0/j;JLy7/k;)V

    return-object v16
.end method

.method public final p(Ljava/lang/String;LM0/P;LR0/h$b;IZII)V
    .locals 0

    iput-object p1, p0, LM/f;->a:Ljava/lang/String;

    iput-object p2, p0, LM/f;->b:LM0/P;

    iput-object p3, p0, LM/f;->c:LR0/h$b;

    iput p4, p0, LM/f;->d:I

    iput-boolean p5, p0, LM/f;->e:Z

    iput p6, p0, LM/f;->f:I

    iput p7, p0, LM/f;->g:I

    invoke-direct {p0}, LM/f;->i()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ParagraphLayoutCache(paragraph="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LM/f;->j:LM0/p;

    if-eqz v1, :cond_0

    const-string v1, "<paragraph>"

    goto :goto_0

    :cond_0
    const-string v1, "null"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", lastDensity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LM/f;->h:J

    invoke-static {v1, v2}, LM/a;->h(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
