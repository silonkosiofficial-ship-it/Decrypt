.class public abstract Ls1/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls1/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls1/m$b;
    }
.end annotation


# instance fields
.field public a:I

.field b:Lr1/e;

.field c:Ls1/k;

.field protected d:Lr1/e$b;

.field e:Ls1/g;

.field public f:I

.field g:Z

.field public h:Ls1/f;

.field public i:Ls1/f;

.field protected j:Ls1/m$b;


# direct methods
.method public constructor <init>(Lr1/e;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ls1/g;

    invoke-direct {v0, p0}, Ls1/g;-><init>(Ls1/m;)V

    iput-object v0, p0, Ls1/m;->e:Ls1/g;

    const/4 v0, 0x0

    iput v0, p0, Ls1/m;->f:I

    iput-boolean v0, p0, Ls1/m;->g:Z

    new-instance v0, Ls1/f;

    invoke-direct {v0, p0}, Ls1/f;-><init>(Ls1/m;)V

    iput-object v0, p0, Ls1/m;->h:Ls1/f;

    new-instance v0, Ls1/f;

    invoke-direct {v0, p0}, Ls1/f;-><init>(Ls1/m;)V

    iput-object v0, p0, Ls1/m;->i:Ls1/f;

    sget-object v0, Ls1/m$b;->C:Ls1/m$b;

    iput-object v0, p0, Ls1/m;->j:Ls1/m$b;

    iput-object p1, p0, Ls1/m;->b:Lr1/e;

    return-void
.end method

.method private l(II)V
    .locals 7

    .prologue
    iget v0, p0, Ls1/m;->a:I

    if-eqz v0, :cond_8

    const/4 v1, 0x1

    if-eq v0, v1, :cond_7

    const/4 p2, 0x2

    const/high16 v2, 0x3f000000    # 0.5f

    if-eq v0, p2, :cond_4

    const/4 p2, 0x3

    if-eq v0, p2, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object v0, p0, Ls1/m;->b:Lr1/e;

    iget-object v3, v0, Lr1/e;->e:Ls1/j;

    iget-object v4, v3, Ls1/m;->d:Lr1/e$b;

    sget-object v5, Lr1/e$b;->E:Lr1/e$b;

    if-ne v4, v5, :cond_1

    iget v4, v3, Ls1/m;->a:I

    if-ne v4, p2, :cond_1

    iget-object v4, v0, Lr1/e;->f:Ls1/l;

    iget-object v6, v4, Ls1/m;->d:Lr1/e$b;

    if-ne v6, v5, :cond_1

    iget v4, v4, Ls1/m;->a:I

    if-ne v4, p2, :cond_1

    goto :goto_5

    :cond_1
    if-nez p1, :cond_2

    iget-object v3, v0, Lr1/e;->f:Ls1/l;

    :cond_2
    iget-object p2, v3, Ls1/m;->e:Ls1/g;

    iget-boolean p2, p2, Ls1/f;->j:Z

    if-eqz p2, :cond_9

    invoke-virtual {v0}, Lr1/e;->t()F

    move-result p2

    if-ne p1, v1, :cond_3

    iget-object p1, v3, Ls1/m;->e:Ls1/g;

    iget p1, p1, Ls1/f;->g:I

    int-to-float p1, p1

    div-float/2addr p1, p2

    add-float/2addr p1, v2

    float-to-int p1, p1

    goto :goto_0

    :cond_3
    iget-object p1, v3, Ls1/m;->e:Ls1/g;

    iget p1, p1, Ls1/f;->g:I

    int-to-float p1, p1

    mul-float/2addr p2, p1

    add-float/2addr p2, v2

    float-to-int p1, p2

    :goto_0
    iget-object p2, p0, Ls1/m;->e:Ls1/g;

    invoke-virtual {p2, p1}, Ls1/g;->d(I)V

    goto :goto_5

    :cond_4
    iget-object p2, p0, Ls1/m;->b:Lr1/e;

    invoke-virtual {p2}, Lr1/e;->G()Lr1/e;

    move-result-object p2

    if-eqz p2, :cond_9

    if-nez p1, :cond_5

    iget-object p2, p2, Lr1/e;->e:Ls1/j;

    goto :goto_1

    :cond_5
    iget-object p2, p2, Lr1/e;->f:Ls1/l;

    :goto_1
    iget-object p2, p2, Ls1/m;->e:Ls1/g;

    iget-boolean v0, p2, Ls1/f;->j:Z

    if-eqz v0, :cond_9

    iget-object v0, p0, Ls1/m;->b:Lr1/e;

    if-nez p1, :cond_6

    iget v0, v0, Lr1/e;->q:F

    goto :goto_2

    :cond_6
    iget v0, v0, Lr1/e;->t:F

    :goto_2
    iget p2, p2, Ls1/f;->g:I

    int-to-float p2, p2

    mul-float/2addr p2, v0

    add-float/2addr p2, v2

    float-to-int p2, p2

    goto :goto_4

    :cond_7
    iget-object v0, p0, Ls1/m;->e:Ls1/g;

    iget v0, v0, Ls1/g;->m:I

    invoke-virtual {p0, v0, p1}, Ls1/m;->g(II)I

    move-result p1

    iget-object v0, p0, Ls1/m;->e:Ls1/g;

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    :goto_3
    invoke-virtual {v0, p1}, Ls1/g;->d(I)V

    goto :goto_5

    :cond_8
    :goto_4
    iget-object v0, p0, Ls1/m;->e:Ls1/g;

    invoke-virtual {p0, p2, p1}, Ls1/m;->g(II)I

    move-result p1

    goto :goto_3

    :cond_9
    :goto_5
    return-void
.end method


# virtual methods
.method public abstract a(Ls1/d;)V
.end method

.method protected final b(Ls1/f;Ls1/f;I)V
    .locals 1

    iget-object v0, p1, Ls1/f;->l:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput p3, p1, Ls1/f;->f:I

    iget-object p2, p2, Ls1/f;->k:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected final c(Ls1/f;Ls1/f;ILs1/g;)V
    .locals 2

    iget-object v0, p1, Ls1/f;->l:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p1, Ls1/f;->l:Ljava/util/List;

    iget-object v1, p0, Ls1/m;->e:Ls1/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput p3, p1, Ls1/f;->h:I

    iput-object p4, p1, Ls1/f;->i:Ls1/g;

    iget-object p2, p2, Ls1/f;->k:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p2, p4, Ls1/f;->k:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method abstract d()V
.end method

.method abstract e()V
.end method

.method abstract f()V
.end method

.method protected final g(II)I
    .locals 1

    .prologue
    if-nez p2, :cond_1

    iget-object p2, p0, Ls1/m;->b:Lr1/e;

    iget v0, p2, Lr1/e;->p:I

    iget p2, p2, Lr1/e;->o:I

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-lez v0, :cond_0

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_0
    if-eq p2, p1, :cond_3

    goto :goto_0

    :cond_1
    iget-object p2, p0, Ls1/m;->b:Lr1/e;

    iget v0, p2, Lr1/e;->s:I

    iget p2, p2, Lr1/e;->r:I

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-lez v0, :cond_2

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_2
    if-eq p2, p1, :cond_3

    :goto_0
    move p1, p2

    :cond_3
    return p1
.end method

.method protected final h(Lr1/d;)Ls1/f;
    .locals 3

    .prologue
    iget-object p1, p1, Lr1/d;->d:Lr1/d;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p1, Lr1/d;->b:Lr1/e;

    iget-object p1, p1, Lr1/d;->c:Lr1/d$b;

    sget-object v2, Ls1/m$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    const/4 v2, 0x1

    if-eq p1, v2, :cond_5

    const/4 v2, 0x2

    if-eq p1, v2, :cond_4

    const/4 v2, 0x3

    if-eq p1, v2, :cond_3

    const/4 v2, 0x4

    if-eq p1, v2, :cond_2

    const/4 v2, 0x5

    if-eq p1, v2, :cond_1

    goto :goto_2

    :cond_1
    iget-object p1, v1, Lr1/e;->f:Ls1/l;

    :goto_0
    iget-object v0, p1, Ls1/m;->i:Ls1/f;

    goto :goto_2

    :cond_2
    iget-object p1, v1, Lr1/e;->f:Ls1/l;

    iget-object v0, p1, Ls1/l;->k:Ls1/f;

    goto :goto_2

    :cond_3
    iget-object p1, v1, Lr1/e;->f:Ls1/l;

    :goto_1
    iget-object v0, p1, Ls1/m;->h:Ls1/f;

    goto :goto_2

    :cond_4
    iget-object p1, v1, Lr1/e;->e:Ls1/j;

    goto :goto_0

    :cond_5
    iget-object p1, v1, Lr1/e;->e:Ls1/j;

    goto :goto_1

    :goto_2
    return-object v0
.end method

.method protected final i(Lr1/d;I)Ls1/f;
    .locals 2

    .prologue
    iget-object p1, p1, Lr1/d;->d:Lr1/d;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p1, Lr1/d;->b:Lr1/e;

    if-nez p2, :cond_1

    iget-object p2, v1, Lr1/e;->e:Ls1/j;

    goto :goto_0

    :cond_1
    iget-object p2, v1, Lr1/e;->f:Ls1/l;

    :goto_0
    iget-object p1, p1, Lr1/d;->c:Lr1/d$b;

    sget-object v1, Ls1/m$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_2

    const/4 v1, 0x3

    if-eq p1, v1, :cond_3

    const/4 v1, 0x5

    if-eq p1, v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p2, Ls1/m;->i:Ls1/f;

    goto :goto_1

    :cond_3
    iget-object v0, p2, Ls1/m;->h:Ls1/f;

    :goto_1
    return-object v0
.end method

.method public j()J
    .locals 2

    .prologue
    iget-object v0, p0, Ls1/m;->e:Ls1/g;

    iget-boolean v1, v0, Ls1/f;->j:Z

    if-eqz v1, :cond_0

    iget v0, v0, Ls1/f;->g:I

    int-to-long v0, v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Ls1/m;->g:Z

    return v0
.end method

.method abstract m()Z
.end method

.method protected n(Ls1/d;Lr1/d;Lr1/d;I)V
    .locals 4

    .prologue
    invoke-virtual {p0, p2}, Ls1/m;->h(Lr1/d;)Ls1/f;

    move-result-object p1

    invoke-virtual {p0, p3}, Ls1/m;->h(Lr1/d;)Ls1/f;

    move-result-object v0

    iget-boolean v1, p1, Ls1/f;->j:Z

    if-eqz v1, :cond_6

    iget-boolean v1, v0, Ls1/f;->j:Z

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    iget v1, p1, Ls1/f;->g:I

    invoke-virtual {p2}, Lr1/d;->c()I

    move-result p2

    add-int/2addr v1, p2

    iget p2, v0, Ls1/f;->g:I

    invoke-virtual {p3}, Lr1/d;->c()I

    move-result p3

    sub-int/2addr p2, p3

    sub-int p3, p2, v1

    iget-object v2, p0, Ls1/m;->e:Ls1/g;

    iget-boolean v2, v2, Ls1/f;->j:Z

    if-nez v2, :cond_1

    iget-object v2, p0, Ls1/m;->d:Lr1/e$b;

    sget-object v3, Lr1/e$b;->E:Lr1/e$b;

    if-ne v2, v3, :cond_1

    invoke-direct {p0, p4, p3}, Ls1/m;->l(II)V

    :cond_1
    iget-object v2, p0, Ls1/m;->e:Ls1/g;

    iget-boolean v3, v2, Ls1/f;->j:Z

    if-nez v3, :cond_2

    return-void

    :cond_2
    iget v2, v2, Ls1/f;->g:I

    if-ne v2, p3, :cond_3

    iget-object p1, p0, Ls1/m;->h:Ls1/f;

    invoke-virtual {p1, v1}, Ls1/f;->d(I)V

    iget-object p1, p0, Ls1/m;->i:Ls1/f;

    :goto_0
    invoke-virtual {p1, p2}, Ls1/f;->d(I)V

    return-void

    :cond_3
    iget-object p3, p0, Ls1/m;->b:Lr1/e;

    if-nez p4, :cond_4

    invoke-virtual {p3}, Lr1/e;->w()F

    move-result p3

    goto :goto_1

    :cond_4
    invoke-virtual {p3}, Lr1/e;->K()F

    move-result p3

    :goto_1
    const/high16 p4, 0x3f000000    # 0.5f

    if-ne p1, v0, :cond_5

    iget v1, p1, Ls1/f;->g:I

    iget p2, v0, Ls1/f;->g:I

    move p3, p4

    :cond_5
    sub-int/2addr p2, v1

    iget-object p1, p0, Ls1/m;->e:Ls1/g;

    iget p1, p1, Ls1/f;->g:I

    sub-int/2addr p2, p1

    iget-object p1, p0, Ls1/m;->h:Ls1/f;

    int-to-float v0, v1

    add-float/2addr v0, p4

    int-to-float p2, p2

    mul-float/2addr p2, p3

    add-float/2addr v0, p2

    float-to-int p2, v0

    invoke-virtual {p1, p2}, Ls1/f;->d(I)V

    iget-object p1, p0, Ls1/m;->i:Ls1/f;

    iget-object p2, p0, Ls1/m;->h:Ls1/f;

    iget p2, p2, Ls1/f;->g:I

    iget-object p3, p0, Ls1/m;->e:Ls1/g;

    iget p3, p3, Ls1/f;->g:I

    add-int/2addr p2, p3

    goto :goto_0

    :cond_6
    :goto_2
    return-void
.end method

.method protected o(Ls1/d;)V
    .locals 0

    return-void
.end method

.method protected p(Ls1/d;)V
    .locals 0

    return-void
.end method
