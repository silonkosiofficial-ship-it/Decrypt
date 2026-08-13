.class public final LH/D;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH/D$a;
    }
.end annotation


# static fields
.field public static final l:LH/D$a;


# instance fields
.field private final a:LM0/d;

.field private final b:LM0/P;

.field private final c:I

.field private final d:I

.field private final e:Z

.field private final f:I

.field private final g:LY0/e;

.field private final h:LR0/h$b;

.field private final i:Ljava/util/List;

.field private j:LM0/k;

.field private k:LY0/v;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LH/D$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LH/D$a;-><init>(Ly7/k;)V

    sput-object v0, LH/D;->l:LH/D$a;

    return-void
.end method

.method private constructor <init>(LM0/d;LM0/P;IIZILY0/e;LR0/h$b;Ljava/util/List;)V
    .locals 0

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH/D;->a:LM0/d;

    iput-object p2, p0, LH/D;->b:LM0/P;

    iput p3, p0, LH/D;->c:I

    iput p4, p0, LH/D;->d:I

    iput-boolean p5, p0, LH/D;->e:Z

    iput p6, p0, LH/D;->f:I

    iput-object p7, p0, LH/D;->g:LY0/e;

    iput-object p8, p0, LH/D;->h:LR0/h$b;

    iput-object p9, p0, LH/D;->i:Ljava/util/List;

    if-lez p3, :cond_2

    if-lez p4, :cond_1

    if-gt p4, p3, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "minLines greater than maxLines"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "no minLines"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "no maxLines"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(LM0/d;LM0/P;IIZILY0/e;LR0/h$b;Ljava/util/List;ILy7/k;)V
    .locals 13

    .prologue
    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    const v1, 0x7fffffff

    move v5, v1

    goto :goto_0

    :cond_0
    move/from16 v5, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    move v6, v2

    goto :goto_1

    :cond_1
    move/from16 v6, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    move v7, v2

    goto :goto_2

    :cond_2
    move/from16 v7, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    sget-object v1, LX0/u;->a:LX0/u$a;

    invoke-virtual {v1}, LX0/u$a;->a()I

    move-result v1

    move v8, v1

    goto :goto_3

    :cond_3
    move/from16 v8, p6

    :goto_3
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_4

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    move-object v11, v0

    goto :goto_4

    :cond_4
    move-object/from16 v11, p9

    :goto_4
    const/4 v12, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    invoke-direct/range {v2 .. v12}, LH/D;-><init>(LM0/d;LM0/P;IIZILY0/e;LR0/h$b;Ljava/util/List;Ly7/k;)V

    return-void
.end method

.method public synthetic constructor <init>(LM0/d;LM0/P;IIZILY0/e;LR0/h$b;Ljava/util/List;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p9}, LH/D;-><init>(LM0/d;LM0/P;IIZILY0/e;LR0/h$b;Ljava/util/List;)V

    return-void
.end method

.method private final f()LM0/k;
    .locals 2

    .prologue
    iget-object v0, p0, LH/D;->j:LM0/k;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "layoutIntrinsics must be called first"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final n(JLY0/v;)LM0/j;
    .locals 9

    .prologue
    invoke-virtual {p0, p3}, LH/D;->m(LY0/v;)V

    invoke-static {p1, p2}, LY0/b;->n(J)I

    move-result p3

    iget-boolean v0, p0, LH/D;->e:Z

    if-nez v0, :cond_0

    iget v0, p0, LH/D;->f:I

    sget-object v1, LX0/u;->a:LX0/u$a;

    invoke-virtual {v1}, LX0/u$a;->b()I

    move-result v1

    invoke-static {v0, v1}, LX0/u;->e(II)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-static {p1, p2}, LY0/b;->h(J)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1, p2}, LY0/b;->l(J)I

    move-result v0

    goto :goto_0

    :cond_1
    const v0, 0x7fffffff

    :goto_0
    iget-boolean v1, p0, LH/D;->e:Z

    if-nez v1, :cond_2

    iget v1, p0, LH/D;->f:I

    sget-object v2, LX0/u;->a:LX0/u$a;

    invoke-virtual {v2}, LX0/u$a;->b()I

    move-result v2

    invoke-static {v1, v2}, LX0/u;->e(II)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    :goto_1
    move v6, v1

    goto :goto_2

    :cond_2
    iget v1, p0, LH/D;->c:I

    goto :goto_1

    :goto_2
    if-ne p3, v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p0}, LH/D;->c()I

    move-result v1

    invoke-static {v1, p3, v0}, LE7/j;->k(III)I

    move-result v0

    :goto_3
    new-instance p3, LM0/j;

    invoke-direct {p0}, LH/D;->f()LM0/k;

    move-result-object v3

    sget-object v1, LY0/b;->b:LY0/b$a;

    invoke-static {p1, p2}, LY0/b;->k(J)I

    move-result p1

    const/4 p2, 0x0

    invoke-virtual {v1, p2, v0, p2, p1}, LY0/b$a;->b(IIII)J

    move-result-wide v4

    iget p1, p0, LH/D;->f:I

    sget-object p2, LX0/u;->a:LX0/u$a;

    invoke-virtual {p2}, LX0/u$a;->b()I

    move-result p2

    invoke-static {p1, p2}, LX0/u;->e(II)Z

    move-result v7

    const/4 v8, 0x0

    move-object v2, p3

    invoke-direct/range {v2 .. v8}, LM0/j;-><init>(LM0/k;JIZLy7/k;)V

    return-object p3
.end method


# virtual methods
.method public final a()LY0/e;
    .locals 1

    iget-object v0, p0, LH/D;->g:LY0/e;

    return-object v0
.end method

.method public final b()LR0/h$b;
    .locals 1

    iget-object v0, p0, LH/D;->h:LR0/h$b;

    return-object v0
.end method

.method public final c()I
    .locals 1

    invoke-direct {p0}, LH/D;->f()LM0/k;

    move-result-object v0

    invoke-virtual {v0}, LM0/k;->b()F

    move-result v0

    invoke-static {v0}, LH/E;->a(F)I

    move-result v0

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, LH/D;->c:I

    return v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, LH/D;->d:I

    return v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, LH/D;->f:I

    return v0
.end method

.method public final h()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LH/D;->i:Ljava/util/List;

    return-object v0
.end method

.method public final i()Z
    .locals 1

    iget-boolean v0, p0, LH/D;->e:Z

    return v0
.end method

.method public final j()LM0/P;
    .locals 1

    iget-object v0, p0, LH/D;->b:LM0/P;

    return-object v0
.end method

.method public final k()LM0/d;
    .locals 1

    iget-object v0, p0, LH/D;->a:LM0/d;

    return-object v0
.end method

.method public final l(JLY0/v;LM0/K;)LM0/K;
    .locals 21

    .prologue
    move-object/from16 v0, p0

    move-wide/from16 v14, p1

    move-object/from16 v13, p4

    if-eqz v13, :cond_0

    iget-object v2, v0, LH/D;->a:LM0/d;

    iget-object v3, v0, LH/D;->b:LM0/P;

    iget-object v4, v0, LH/D;->i:Ljava/util/List;

    iget v5, v0, LH/D;->c:I

    iget-boolean v6, v0, LH/D;->e:Z

    iget v7, v0, LH/D;->f:I

    iget-object v8, v0, LH/D;->g:LY0/e;

    iget-object v10, v0, LH/D;->h:LR0/h$b;

    move-object/from16 v1, p4

    move-object/from16 v9, p3

    move-wide/from16 v11, p1

    invoke-static/range {v1 .. v12}, LH/U;->a(LM0/K;LM0/d;LM0/P;Ljava/util/List;IZILY0/e;LY0/v;LR0/h$b;J)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v11, LM0/J;

    invoke-virtual/range {p4 .. p4}, LM0/K;->l()LM0/J;

    move-result-object v1

    invoke-virtual {v1}, LM0/J;->j()LM0/d;

    move-result-object v2

    iget-object v3, v0, LH/D;->b:LM0/P;

    invoke-virtual/range {p4 .. p4}, LM0/K;->l()LM0/J;

    move-result-object v1

    invoke-virtual {v1}, LM0/J;->g()Ljava/util/List;

    move-result-object v4

    invoke-virtual/range {p4 .. p4}, LM0/K;->l()LM0/J;

    move-result-object v1

    invoke-virtual {v1}, LM0/J;->e()I

    move-result v5

    invoke-virtual/range {p4 .. p4}, LM0/K;->l()LM0/J;

    move-result-object v1

    invoke-virtual {v1}, LM0/J;->h()Z

    move-result v6

    invoke-virtual/range {p4 .. p4}, LM0/K;->l()LM0/J;

    move-result-object v1

    invoke-virtual {v1}, LM0/J;->f()I

    move-result v7

    invoke-virtual/range {p4 .. p4}, LM0/K;->l()LM0/J;

    move-result-object v1

    invoke-virtual {v1}, LM0/J;->b()LY0/e;

    move-result-object v8

    invoke-virtual/range {p4 .. p4}, LM0/K;->l()LM0/J;

    move-result-object v1

    invoke-virtual {v1}, LM0/J;->d()LY0/v;

    move-result-object v9

    invoke-virtual/range {p4 .. p4}, LM0/K;->l()LM0/J;

    move-result-object v1

    invoke-virtual {v1}, LM0/J;->c()LR0/h$b;

    move-result-object v10

    const/16 v16, 0x0

    move-object v1, v11

    move-object v0, v11

    move-wide/from16 v11, p1

    move-object/from16 v13, v16

    invoke-direct/range {v1 .. v13}, LM0/J;-><init>(LM0/d;LM0/P;Ljava/util/List;IZILY0/e;LY0/v;LR0/h$b;JLy7/k;)V

    invoke-virtual/range {p4 .. p4}, LM0/K;->w()LM0/j;

    move-result-object v1

    invoke-virtual {v1}, LM0/j;->A()F

    move-result v1

    invoke-static {v1}, LH/E;->a(F)I

    move-result v1

    invoke-virtual/range {p4 .. p4}, LM0/K;->w()LM0/j;

    move-result-object v2

    invoke-virtual {v2}, LM0/j;->h()F

    move-result v2

    invoke-static {v2}, LH/E;->a(F)I

    move-result v2

    invoke-static {v1, v2}, LY0/u;->a(II)J

    move-result-wide v1

    invoke-static {v14, v15, v1, v2}, LY0/c;->f(JJ)J

    move-result-wide v1

    move-object/from16 v3, p4

    invoke-virtual {v3, v0, v1, v2}, LM0/K;->a(LM0/J;J)LM0/K;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-direct/range {p0 .. p3}, LH/D;->n(JLY0/v;)LM0/j;

    move-result-object v0

    invoke-virtual {v0}, LM0/j;->A()F

    move-result v1

    invoke-static {v1}, LH/E;->a(F)I

    move-result v1

    invoke-virtual {v0}, LM0/j;->h()F

    move-result v2

    invoke-static {v2}, LH/E;->a(F)I

    move-result v2

    invoke-static {v1, v2}, LY0/u;->a(II)J

    move-result-wide v1

    invoke-static {v14, v15, v1, v2}, LY0/c;->f(JJ)J

    move-result-wide v16

    new-instance v18, LM0/K;

    new-instance v19, LM0/J;

    move-object/from16 v13, p0

    iget-object v2, v13, LH/D;->a:LM0/d;

    iget-object v3, v13, LH/D;->b:LM0/P;

    iget-object v4, v13, LH/D;->i:Ljava/util/List;

    iget v5, v13, LH/D;->c:I

    iget-boolean v6, v13, LH/D;->e:Z

    iget v7, v13, LH/D;->f:I

    iget-object v8, v13, LH/D;->g:LY0/e;

    iget-object v10, v13, LH/D;->h:LR0/h$b;

    const/16 v20, 0x0

    move-object/from16 v1, v19

    move-object/from16 v9, p3

    move-wide/from16 v11, p1

    move-object/from16 v13, v20

    invoke-direct/range {v1 .. v13}, LM0/J;-><init>(LM0/d;LM0/P;Ljava/util/List;IZILY0/e;LY0/v;LR0/h$b;JLy7/k;)V

    const/4 v6, 0x0

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    move-object v3, v0

    move-wide/from16 v4, v16

    invoke-direct/range {v1 .. v6}, LM0/K;-><init>(LM0/J;LM0/j;JLy7/k;)V

    return-object v18
.end method

.method public final m(LY0/v;)V
    .locals 8

    .prologue
    iget-object v0, p0, LH/D;->j:LM0/k;

    if-eqz v0, :cond_0

    iget-object v1, p0, LH/D;->k:LY0/v;

    if-ne p1, v1, :cond_0

    invoke-virtual {v0}, LM0/k;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    iput-object p1, p0, LH/D;->k:LY0/v;

    iget-object v3, p0, LH/D;->a:LM0/d;

    iget-object v0, p0, LH/D;->b:LM0/P;

    invoke-static {v0, p1}, LM0/Q;->d(LM0/P;LY0/v;)LM0/P;

    move-result-object v4

    iget-object v6, p0, LH/D;->g:LY0/e;

    iget-object v7, p0, LH/D;->h:LR0/h$b;

    iget-object v5, p0, LH/D;->i:Ljava/util/List;

    new-instance v0, LM0/k;

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, LM0/k;-><init>(LM0/d;LM0/P;Ljava/util/List;LY0/e;LR0/h$b;)V

    :cond_1
    iput-object v0, p0, LH/D;->j:LM0/k;

    return-void
.end method
