.class public final Ln1/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln1/m$a;
    }
.end annotation


# static fields
.field public static final g:Ln1/m$a;

.field public static final h:I

.field private static i:I


# instance fields
.field private a:Z

.field private b:Ln1/p;

.field private c:Ln1/p;

.field private d:Ljava/util/ArrayList;

.field private e:I

.field private f:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln1/m$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln1/m$a;-><init>(Ly7/k;)V

    sput-object v0, Ln1/m;->g:Ln1/m$a;

    const/16 v0, 0x8

    sput v0, Ln1/m;->h:I

    return-void
.end method

.method public constructor <init>(Ln1/p;I)V
    .locals 1

    const-string v0, "run"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln1/m;->c:Ln1/p;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ln1/m;->d:Ljava/util/ArrayList;

    iput p2, p0, Ln1/m;->f:I

    sget p1, Ln1/m;->i:I

    iput p1, p0, Ln1/m;->e:I

    add-int/lit8 p1, p1, 0x1

    sput p1, Ln1/m;->i:I

    return-void
.end method

.method public static final synthetic a(I)V
    .locals 0

    sput p0, Ln1/m;->i:I

    return-void
.end method

.method private final e(Ln1/f;J)J
    .locals 8

    .prologue
    invoke-virtual {p1}, Ln1/f;->f()Ln1/p;

    move-result-object v0

    instance-of v1, v0, Ln1/k;

    if-eqz v1, :cond_0

    return-wide p2

    :cond_0
    invoke-virtual {p1}, Ln1/f;->d()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    move-wide v3, p2

    :goto_0
    if-ge v2, v1, :cond_3

    invoke-virtual {p1}, Ln1/f;->d()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    const-string v6, "get(...)"

    invoke-static {v5, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ln1/d;

    instance-of v6, v5, Ln1/f;

    if-eqz v6, :cond_2

    check-cast v5, Ln1/f;

    invoke-virtual {v5}, Ln1/f;->f()Ln1/p;

    move-result-object v6

    invoke-static {v6, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Ln1/f;->e()I

    move-result v6

    int-to-long v6, v6

    add-long/2addr v6, p2

    invoke-direct {p0, v5, v6, v7}, Ln1/m;->e(Ln1/f;J)J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Ln1/p;->g()Ln1/f;

    move-result-object v1

    invoke-static {p1, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {v0}, Ln1/p;->t()J

    move-result-wide v1

    invoke-virtual {v0}, Ln1/p;->q()Ln1/f;

    move-result-object p1

    sub-long/2addr p2, v1

    invoke-direct {p0, p1, p2, p3}, Ln1/m;->e(Ln1/f;J)J

    move-result-wide v1

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    invoke-virtual {v0}, Ln1/p;->q()Ln1/f;

    move-result-object p1

    invoke-virtual {p1}, Ln1/f;->e()I

    move-result p1

    int-to-long v3, p1

    sub-long/2addr p2, v3

    invoke-static {v1, v2, p2, p3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    :cond_4
    return-wide v3
.end method

.method private final f(Ln1/f;J)J
    .locals 8

    .prologue
    invoke-virtual {p1}, Ln1/f;->f()Ln1/p;

    move-result-object v0

    instance-of v1, v0, Ln1/k;

    if-eqz v1, :cond_0

    return-wide p2

    :cond_0
    invoke-virtual {p1}, Ln1/f;->d()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    move-wide v3, p2

    :goto_0
    if-ge v2, v1, :cond_3

    invoke-virtual {p1}, Ln1/f;->d()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    const-string v6, "get(...)"

    invoke-static {v5, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ln1/d;

    instance-of v6, v5, Ln1/f;

    if-eqz v6, :cond_2

    check-cast v5, Ln1/f;

    invoke-virtual {v5}, Ln1/f;->f()Ln1/p;

    move-result-object v6

    invoke-static {v6, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Ln1/f;->e()I

    move-result v6

    int-to-long v6, v6

    add-long/2addr v6, p2

    invoke-direct {p0, v5, v6, v7}, Ln1/m;->f(Ln1/f;J)J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Ln1/p;->q()Ln1/f;

    move-result-object v1

    invoke-static {p1, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {v0}, Ln1/p;->t()J

    move-result-wide v1

    invoke-virtual {v0}, Ln1/p;->g()Ln1/f;

    move-result-object p1

    add-long/2addr p2, v1

    invoke-direct {p0, p1, p2, p3}, Ln1/m;->f(Ln1/f;J)J

    move-result-wide v1

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    invoke-virtual {v0}, Ln1/p;->g()Ln1/f;

    move-result-object p1

    invoke-virtual {p1}, Ln1/f;->e()I

    move-result p1

    int-to-long v3, p1

    sub-long/2addr p2, v3

    invoke-static {v1, v2, p2, p3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    :cond_4
    return-wide v3
.end method


# virtual methods
.method public final b(Ln1/p;)V
    .locals 1

    const-string v0, "run"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ln1/m;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object p1, p0, Ln1/m;->c:Ln1/p;

    return-void
.end method

.method public final c(Lm1/f;I)J
    .locals 10

    .prologue
    const-string v0, "container"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ln1/m;->b:Ln1/p;

    instance-of v1, v0, Ln1/c;

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_0

    const-string v1, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.analyzer.ChainRun"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ln1/c;

    invoke-virtual {v0}, Ln1/p;->p()I

    move-result v0

    if-eq v0, p2, :cond_2

    return-wide v2

    :cond_0
    if-nez p2, :cond_1

    instance-of v0, v0, Ln1/l;

    if-nez v0, :cond_2

    return-wide v2

    :cond_1
    instance-of v0, v0, Ln1/n;

    if-nez v0, :cond_2

    return-wide v2

    :cond_2
    if-nez p2, :cond_3

    invoke-virtual {p1}, Lm1/e;->K()Ln1/l;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln1/p;->q()Ln1/f;

    move-result-object v0

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lm1/e;->e0()Ln1/n;

    move-result-object v0

    goto :goto_0

    :goto_1
    if-nez p2, :cond_4

    invoke-virtual {p1}, Lm1/e;->K()Ln1/l;

    move-result-object p1

    :goto_2
    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln1/p;->g()Ln1/f;

    move-result-object p1

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Lm1/e;->e0()Ln1/n;

    move-result-object p1

    goto :goto_2

    :goto_3
    iget-object v1, p0, Ln1/m;->b:Ln1/p;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ln1/p;->q()Ln1/f;

    move-result-object v1

    invoke-virtual {v1}, Ln1/f;->g()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Ln1/m;->b:Ln1/p;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ln1/p;->g()Ln1/f;

    move-result-object v1

    invoke-virtual {v1}, Ln1/f;->g()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    iget-object v1, p0, Ln1/m;->b:Ln1/p;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ln1/p;->t()J

    move-result-wide v4

    if-eqz v0, :cond_8

    if-eqz p1, :cond_8

    iget-object p1, p0, Ln1/m;->b:Ln1/p;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln1/p;->q()Ln1/f;

    move-result-object p1

    invoke-direct {p0, p1, v2, v3}, Ln1/m;->f(Ln1/f;J)J

    move-result-wide v0

    iget-object p1, p0, Ln1/m;->b:Ln1/p;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln1/p;->g()Ln1/f;

    move-result-object p1

    invoke-direct {p0, p1, v2, v3}, Ln1/m;->e(Ln1/f;J)J

    move-result-wide v6

    sub-long/2addr v0, v4

    iget-object p1, p0, Ln1/m;->b:Ln1/p;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln1/p;->g()Ln1/f;

    move-result-object p1

    invoke-virtual {p1}, Ln1/f;->e()I

    move-result p1

    neg-int p1, p1

    int-to-long v8, p1

    cmp-long p1, v0, v8

    if-ltz p1, :cond_5

    iget-object p1, p0, Ln1/m;->b:Ln1/p;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln1/p;->g()Ln1/f;

    move-result-object p1

    invoke-virtual {p1}, Ln1/f;->e()I

    move-result p1

    int-to-long v8, p1

    add-long/2addr v0, v8

    :cond_5
    neg-long v6, v6

    sub-long/2addr v6, v4

    iget-object p1, p0, Ln1/m;->b:Ln1/p;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln1/p;->q()Ln1/f;

    move-result-object p1

    invoke-virtual {p1}, Ln1/f;->e()I

    move-result p1

    int-to-long v8, p1

    sub-long/2addr v6, v8

    iget-object p1, p0, Ln1/m;->b:Ln1/p;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln1/p;->q()Ln1/f;

    move-result-object p1

    invoke-virtual {p1}, Ln1/f;->e()I

    move-result p1

    int-to-long v8, p1

    cmp-long p1, v6, v8

    if-ltz p1, :cond_6

    iget-object p1, p0, Ln1/m;->b:Ln1/p;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln1/p;->q()Ln1/f;

    move-result-object p1

    invoke-virtual {p1}, Ln1/f;->e()I

    move-result p1

    int-to-long v8, p1

    sub-long/2addr v6, v8

    :cond_6
    iget-object p1, p0, Ln1/m;->b:Ln1/p;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln1/p;->n()Lm1/e;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Lm1/e;->n(I)F

    move-result p1

    const/4 p2, 0x0

    cmpl-float p2, p1, p2

    const/high16 v8, 0x3f800000    # 1.0f

    if-lez p2, :cond_7

    long-to-float p2, v6

    div-float/2addr p2, p1

    long-to-float v0, v0

    sub-float v1, v8, p1

    div-float/2addr v0, v1

    add-float/2addr p2, v0

    float-to-long v2, p2

    :cond_7
    long-to-float p2, v2

    mul-float v0, p2, p1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-long v2, v0

    sub-float/2addr v8, p1

    mul-float/2addr p2, v8

    add-float/2addr p2, v1

    float-to-long p1, p2

    add-long/2addr v2, v4

    add-long/2addr v2, p1

    iget-object p1, p0, Ln1/m;->b:Ln1/p;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln1/p;->q()Ln1/f;

    move-result-object p1

    invoke-virtual {p1}, Ln1/f;->e()I

    move-result p1

    int-to-long p1, p1

    add-long/2addr p1, v2

    iget-object v0, p0, Ln1/m;->b:Ln1/p;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln1/p;->g()Ln1/f;

    move-result-object v0

    invoke-virtual {v0}, Ln1/f;->e()I

    move-result v0

    int-to-long v0, v0

    sub-long/2addr p1, v0

    goto/16 :goto_5

    :cond_8
    if-eqz v0, :cond_9

    iget-object p1, p0, Ln1/m;->b:Ln1/p;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln1/p;->q()Ln1/f;

    move-result-object p1

    iget-object p2, p0, Ln1/m;->b:Ln1/p;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ln1/p;->q()Ln1/f;

    move-result-object p2

    invoke-virtual {p2}, Ln1/f;->e()I

    move-result p2

    int-to-long v0, p2

    invoke-direct {p0, p1, v0, v1}, Ln1/m;->f(Ln1/f;J)J

    move-result-wide p1

    iget-object v0, p0, Ln1/m;->b:Ln1/p;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln1/p;->q()Ln1/f;

    move-result-object v0

    invoke-virtual {v0}, Ln1/f;->e()I

    move-result v0

    int-to-long v0, v0

    add-long/2addr v0, v4

    :goto_4
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    goto :goto_5

    :cond_9
    if-eqz p1, :cond_a

    iget-object p1, p0, Ln1/m;->b:Ln1/p;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln1/p;->g()Ln1/f;

    move-result-object p1

    iget-object p2, p0, Ln1/m;->b:Ln1/p;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ln1/p;->g()Ln1/f;

    move-result-object p2

    invoke-virtual {p2}, Ln1/f;->e()I

    move-result p2

    int-to-long v0, p2

    invoke-direct {p0, p1, v0, v1}, Ln1/m;->e(Ln1/f;J)J

    move-result-wide p1

    iget-object v0, p0, Ln1/m;->b:Ln1/p;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln1/p;->g()Ln1/f;

    move-result-object v0

    invoke-virtual {v0}, Ln1/f;->e()I

    move-result v0

    neg-int v0, v0

    int-to-long v0, v0

    add-long/2addr v0, v4

    neg-long p1, p1

    goto :goto_4

    :cond_a
    iget-object p1, p0, Ln1/m;->b:Ln1/p;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln1/p;->q()Ln1/f;

    move-result-object p1

    invoke-virtual {p1}, Ln1/f;->e()I

    move-result p1

    int-to-long p1, p1

    iget-object v0, p0, Ln1/m;->b:Ln1/p;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln1/p;->t()J

    iget-object v0, p0, Ln1/m;->b:Ln1/p;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln1/p;->g()Ln1/f;

    move-result-object v0

    invoke-virtual {v0}, Ln1/f;->e()I

    :goto_5
    return-wide p1
.end method

.method public final d(Z)V
    .locals 0

    iput-boolean p1, p0, Ln1/m;->a:Z

    return-void
.end method
