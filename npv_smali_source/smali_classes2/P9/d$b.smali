.class public final LP9/d$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP9/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:I

.field private final b:Z

.field private final c:LX9/d;

.field private d:I

.field private e:Z

.field public f:I

.field public g:[LP9/c;

.field private h:I

.field public i:I

.field public j:I


# direct methods
.method public constructor <init>(IZLX9/d;)V
    .locals 1

    const-string v0, "out"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LP9/d$b;->a:I

    iput-boolean p2, p0, LP9/d$b;->b:Z

    iput-object p3, p0, LP9/d$b;->c:LX9/d;

    const p2, 0x7fffffff

    iput p2, p0, LP9/d$b;->d:I

    iput p1, p0, LP9/d$b;->f:I

    const/16 p1, 0x8

    new-array p1, p1, [LP9/c;

    iput-object p1, p0, LP9/d$b;->g:[LP9/c;

    array-length p1, p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, LP9/d$b;->h:I

    return-void
.end method

.method public synthetic constructor <init>(IZLX9/d;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/16 p1, 0x1000

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const/4 p2, 0x1

    :cond_1
    invoke-direct {p0, p1, p2, p3}, LP9/d$b;-><init>(IZLX9/d;)V

    return-void
.end method

.method private final a()V
    .locals 2

    .prologue
    iget v0, p0, LP9/d$b;->f:I

    iget v1, p0, LP9/d$b;->j:I

    if-ge v0, v1, :cond_1

    if-nez v0, :cond_0

    invoke-direct {p0}, LP9/d$b;->b()V

    goto :goto_0

    :cond_0
    sub-int/2addr v1, v0

    invoke-direct {p0, v1}, LP9/d$b;->c(I)I

    :cond_1
    :goto_0
    return-void
.end method

.method private final b()V
    .locals 6

    iget-object v0, p0, LP9/d$b;->g:[LP9/c;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lj7/n;->B([Ljava/lang/Object;Ljava/lang/Object;IIILjava/lang/Object;)V

    iget-object v0, p0, LP9/d$b;->g:[LP9/c;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LP9/d$b;->h:I

    const/4 v0, 0x0

    iput v0, p0, LP9/d$b;->i:I

    iput v0, p0, LP9/d$b;->j:I

    return-void
.end method

.method private final c(I)I
    .locals 4

    .prologue
    const/4 v0, 0x0

    if-lez p1, :cond_1

    iget-object v1, p0, LP9/d$b;->g:[LP9/c;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    iget v2, p0, LP9/d$b;->h:I

    if-lt v1, v2, :cond_0

    if-lez p1, :cond_0

    iget-object v2, p0, LP9/d$b;->g:[LP9/c;

    aget-object v2, v2, v1

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v2, v2, LP9/c;->c:I

    sub-int/2addr p1, v2

    iget v2, p0, LP9/d$b;->j:I

    iget-object v3, p0, LP9/d$b;->g:[LP9/c;

    aget-object v3, v3, v1

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v3, v3, LP9/c;->c:I

    sub-int/2addr v2, v3

    iput v2, p0, LP9/d$b;->j:I

    iget v2, p0, LP9/d$b;->i:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, LP9/d$b;->i:I

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LP9/d$b;->g:[LP9/c;

    add-int/lit8 v1, v2, 0x1

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v2, v0

    iget v3, p0, LP9/d$b;->i:I

    invoke-static {p1, v1, p1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, LP9/d$b;->g:[LP9/c;

    iget v1, p0, LP9/d$b;->h:I

    add-int/lit8 v2, v1, 0x1

    add-int/lit8 v1, v1, 0x1

    add-int/2addr v1, v0

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    iget p1, p0, LP9/d$b;->h:I

    add-int/2addr p1, v0

    iput p1, p0, LP9/d$b;->h:I

    :cond_1
    return v0
.end method

.method private final d(LP9/c;)V
    .locals 6

    .prologue
    iget v0, p1, LP9/c;->c:I

    iget v1, p0, LP9/d$b;->f:I

    if-le v0, v1, :cond_0

    invoke-direct {p0}, LP9/d$b;->b()V

    return-void

    :cond_0
    iget v2, p0, LP9/d$b;->j:I

    add-int/2addr v2, v0

    sub-int/2addr v2, v1

    invoke-direct {p0, v2}, LP9/d$b;->c(I)I

    iget v1, p0, LP9/d$b;->i:I

    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, LP9/d$b;->g:[LP9/c;

    array-length v3, v2

    if-le v1, v3, :cond_1

    array-length v1, v2

    mul-int/lit8 v1, v1, 0x2

    new-array v1, v1, [LP9/c;

    array-length v3, v2

    array-length v4, v2

    const/4 v5, 0x0

    invoke-static {v2, v5, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v2, p0, LP9/d$b;->g:[LP9/c;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, LP9/d$b;->h:I

    iput-object v1, p0, LP9/d$b;->g:[LP9/c;

    :cond_1
    iget v1, p0, LP9/d$b;->h:I

    add-int/lit8 v2, v1, -0x1

    iput v2, p0, LP9/d$b;->h:I

    iget-object v2, p0, LP9/d$b;->g:[LP9/c;

    aput-object p1, v2, v1

    iget p1, p0, LP9/d$b;->i:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LP9/d$b;->i:I

    iget p1, p0, LP9/d$b;->j:I

    add-int/2addr p1, v0

    iput p1, p0, LP9/d$b;->j:I

    return-void
.end method


# virtual methods
.method public final e(I)V
    .locals 1

    .prologue
    iput p1, p0, LP9/d$b;->a:I

    const/16 v0, 0x4000

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    iget v0, p0, LP9/d$b;->f:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    if-ge p1, v0, :cond_1

    iget v0, p0, LP9/d$b;->d:I

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, LP9/d$b;->d:I

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, LP9/d$b;->e:Z

    iput p1, p0, LP9/d$b;->f:I

    invoke-direct {p0}, LP9/d$b;->a()V

    return-void
.end method

.method public final f(LX9/g;)V
    .locals 4

    .prologue
    const-string v0, "data"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LP9/d$b;->b:Z

    const/16 v1, 0x7f

    if-eqz v0, :cond_0

    sget-object v0, LP9/k;->a:LP9/k;

    invoke-virtual {v0, p1}, LP9/k;->d(LX9/g;)I

    move-result v2

    invoke-virtual {p1}, LX9/g;->I()I

    move-result v3

    if-ge v2, v3, :cond_0

    new-instance v2, LX9/d;

    invoke-direct {v2}, LX9/d;-><init>()V

    invoke-virtual {v0, p1, v2}, LP9/k;->c(LX9/g;LX9/e;)V

    invoke-virtual {v2}, LX9/d;->P0()LX9/g;

    move-result-object p1

    invoke-virtual {p1}, LX9/g;->I()I

    move-result v0

    const/16 v2, 0x80

    :goto_0
    invoke-virtual {p0, v0, v1, v2}, LP9/d$b;->h(III)V

    iget-object v0, p0, LP9/d$b;->c:LX9/d;

    invoke-virtual {v0, p1}, LX9/d;->m1(LX9/g;)LX9/d;

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, LX9/g;->I()I

    move-result v0

    const/4 v2, 0x0

    goto :goto_0

    :goto_1
    return-void
.end method

.method public final g(Ljava/util/List;)V
    .locals 12

    .prologue
    const-string v0, "headerBlock"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LP9/d$b;->e:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget v0, p0, LP9/d$b;->d:I

    iget v2, p0, LP9/d$b;->f:I

    const/16 v3, 0x20

    const/16 v4, 0x1f

    if-ge v0, v2, :cond_0

    invoke-virtual {p0, v0, v4, v3}, LP9/d$b;->h(III)V

    :cond_0
    iput-boolean v1, p0, LP9/d$b;->e:Z

    const v0, 0x7fffffff

    iput v0, p0, LP9/d$b;->d:I

    iget v0, p0, LP9/d$b;->f:I

    invoke-virtual {p0, v0, v4, v3}, LP9/d$b;->h(III)V

    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_b

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LP9/c;

    iget-object v4, v3, LP9/c;->a:LX9/g;

    invoke-virtual {v4}, LX9/g;->M()LX9/g;

    move-result-object v4

    iget-object v5, v3, LP9/c;->b:LX9/g;

    sget-object v6, LP9/d;->a:LP9/d;

    invoke-virtual {v6}, LP9/d;->b()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    const/4 v8, -0x1

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    add-int/lit8 v9, v7, 0x1

    const/4 v10, 0x2

    if-gt v10, v9, :cond_3

    const/16 v10, 0x8

    if-ge v9, v10, :cond_3

    invoke-virtual {v6}, LP9/d;->c()[LP9/c;

    move-result-object v10

    aget-object v10, v10, v7

    iget-object v10, v10, LP9/c;->b:LX9/g;

    invoke-static {v10, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    move v6, v9

    goto :goto_1

    :cond_2
    invoke-virtual {v6}, LP9/d;->c()[LP9/c;

    move-result-object v6

    aget-object v6, v6, v9

    iget-object v6, v6, LP9/c;->b:LX9/g;

    invoke-static {v6, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    add-int/lit8 v7, v7, 0x2

    move v6, v9

    move v9, v7

    goto :goto_1

    :cond_3
    move v6, v9

    move v9, v8

    goto :goto_1

    :cond_4
    move v6, v8

    move v9, v6

    :goto_1
    if-ne v9, v8, :cond_7

    iget v7, p0, LP9/d$b;->h:I

    add-int/lit8 v7, v7, 0x1

    iget-object v10, p0, LP9/d$b;->g:[LP9/c;

    array-length v10, v10

    :goto_2
    if-ge v7, v10, :cond_7

    iget-object v11, p0, LP9/d$b;->g:[LP9/c;

    aget-object v11, v11, v7

    invoke-static {v11}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v11, v11, LP9/c;->a:LX9/g;

    invoke-static {v11, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    iget-object v11, p0, LP9/d$b;->g:[LP9/c;

    aget-object v11, v11, v7

    invoke-static {v11}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v11, v11, LP9/c;->b:LX9/g;

    invoke-static {v11, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    iget v9, p0, LP9/d$b;->h:I

    sub-int/2addr v7, v9

    sget-object v9, LP9/d;->a:LP9/d;

    invoke-virtual {v9}, LP9/d;->c()[LP9/c;

    move-result-object v9

    array-length v9, v9

    add-int/2addr v9, v7

    goto :goto_3

    :cond_5
    if-ne v6, v8, :cond_6

    iget v6, p0, LP9/d$b;->h:I

    sub-int v6, v7, v6

    sget-object v11, LP9/d;->a:LP9/d;

    invoke-virtual {v11}, LP9/d;->c()[LP9/c;

    move-result-object v11

    array-length v11, v11

    add-int/2addr v6, v11

    :cond_6
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_7
    :goto_3
    if-eq v9, v8, :cond_8

    const/16 v3, 0x7f

    const/16 v4, 0x80

    invoke-virtual {p0, v9, v3, v4}, LP9/d$b;->h(III)V

    goto :goto_5

    :cond_8
    const/16 v7, 0x40

    if-ne v6, v8, :cond_9

    iget-object v6, p0, LP9/d$b;->c:LX9/d;

    invoke-virtual {v6, v7}, LX9/d;->v1(I)LX9/d;

    invoke-virtual {p0, v4}, LP9/d$b;->f(LX9/g;)V

    :goto_4
    invoke-virtual {p0, v5}, LP9/d$b;->f(LX9/g;)V

    invoke-direct {p0, v3}, LP9/d$b;->d(LP9/c;)V

    goto :goto_5

    :cond_9
    sget-object v8, LP9/c;->e:LX9/g;

    invoke-virtual {v4, v8}, LX9/g;->J(LX9/g;)Z

    move-result v8

    if-eqz v8, :cond_a

    sget-object v8, LP9/c;->j:LX9/g;

    invoke-static {v8, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    const/16 v3, 0xf

    invoke-virtual {p0, v6, v3, v1}, LP9/d$b;->h(III)V

    invoke-virtual {p0, v5}, LP9/d$b;->f(LX9/g;)V

    goto :goto_5

    :cond_a
    const/16 v4, 0x3f

    invoke-virtual {p0, v6, v4, v7}, LP9/d$b;->h(III)V

    goto :goto_4

    :goto_5
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_b
    return-void
.end method

.method public final h(III)V
    .locals 1

    .prologue
    if-ge p1, p2, :cond_0

    iget-object p2, p0, LP9/d$b;->c:LX9/d;

    or-int/2addr p1, p3

    :goto_0
    invoke-virtual {p2, p1}, LX9/d;->v1(I)LX9/d;

    return-void

    :cond_0
    iget-object v0, p0, LP9/d$b;->c:LX9/d;

    or-int/2addr p3, p2

    invoke-virtual {v0, p3}, LX9/d;->v1(I)LX9/d;

    sub-int/2addr p1, p2

    :goto_1
    const/16 p2, 0x80

    if-lt p1, p2, :cond_1

    and-int/lit8 p3, p1, 0x7f

    iget-object v0, p0, LP9/d$b;->c:LX9/d;

    or-int/2addr p2, p3

    invoke-virtual {v0, p2}, LX9/d;->v1(I)LX9/d;

    ushr-int/lit8 p1, p1, 0x7

    goto :goto_1

    :cond_1
    iget-object p2, p0, LP9/d$b;->c:LX9/d;

    goto :goto_0
.end method
