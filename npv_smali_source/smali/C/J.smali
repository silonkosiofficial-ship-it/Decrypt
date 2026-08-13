.class public final LC/J;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC/J$a;,
        LC/J$b;,
        LC/J$c;
    }
.end annotation


# instance fields
.field private final a:LC/j;

.field private final b:Ljava/util/ArrayList;

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private final g:Ljava/util/List;

.field private h:Ljava/util/List;

.field private i:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LC/j;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC/J;->a:LC/j;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, LC/J$a;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3, v1, v2}, LC/J$a;-><init>(IIILy7/k;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object p1, p0, LC/J;->b:Ljava/util/ArrayList;

    const/4 p1, -0x1

    iput p1, p0, LC/J;->f:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LC/J;->g:Ljava/util/List;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LC/J;->h:Ljava/util/List;

    return-void
.end method

.method private final a()I
    .locals 4

    invoke-virtual {p0}, LC/J;->f()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    iget v2, p0, LC/J;->i:I

    int-to-double v2, v2

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-int v0, v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method private final b(I)Ljava/util/List;
    .locals 4

    .prologue
    iget-object v0, p0, LC/J;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ne p1, v0, :cond_0

    iget-object p1, p0, LC/J;->h:Ljava/util/List;

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_1

    const/4 v2, 0x1

    invoke-static {v2}, LC/I;->a(I)J

    move-result-wide v2

    invoke-static {v2, v3}, LC/c;->a(J)LC/c;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iput-object v0, p0, LC/J;->h:Ljava/util/List;

    move-object p1, v0

    :goto_1
    return-object p1
.end method

.method private final g()V
    .locals 5

    iget-object v0, p0, LC/J;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, LC/J;->b:Ljava/util/ArrayList;

    new-instance v1, LC/J$a;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v4, v4, v2, v3}, LC/J$a;-><init>(IIILy7/k;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput v4, p0, LC/J;->c:I

    iput v4, p0, LC/J;->d:I

    iput v4, p0, LC/J;->e:I

    const/4 v0, -0x1

    iput v0, p0, LC/J;->f:I

    iget-object v0, p0, LC/J;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method


# virtual methods
.method public final c(I)LC/J$c;
    .locals 10

    .prologue
    iget-object v0, p0, LC/J;->a:LC/j;

    invoke-virtual {v0}, LC/j;->i()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget v0, p0, LC/J;->i:I

    mul-int/2addr p1, v0

    new-instance v0, LC/J$c;

    iget v2, p0, LC/J;->i:I

    invoke-virtual {p0}, LC/J;->f()I

    move-result v3

    sub-int/2addr v3, p1

    invoke-static {v2, v3}, LE7/j;->g(II)I

    move-result v2

    invoke-static {v2, v1}, LE7/j;->d(II)I

    move-result v1

    invoke-direct {p0, v1}, LC/J;->b(I)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, p1, v1}, LC/J$c;-><init>(ILjava/util/List;)V

    return-object v0

    :cond_0
    invoke-direct {p0}, LC/J;->a()I

    move-result v0

    div-int v0, p1, v0

    iget-object v2, p0, LC/J;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-direct {p0}, LC/J;->a()I

    move-result v2

    mul-int/2addr v2, v0

    iget-object v4, p0, LC/J;->b:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LC/J$a;

    invoke-virtual {v4}, LC/J$a;->a()I

    move-result v4

    iget-object v5, p0, LC/J;->b:Ljava/util/ArrayList;

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LC/J$a;

    invoke-virtual {v5}, LC/J$a;->b()I

    move-result v5

    iget v6, p0, LC/J;->c:I

    if-gt v2, v6, :cond_1

    if-gt v6, p1, :cond_1

    iget v4, p0, LC/J;->d:I

    iget v5, p0, LC/J;->e:I

    move v2, v6

    goto :goto_0

    :cond_1
    iget v6, p0, LC/J;->f:I

    if-ne v0, v6, :cond_2

    sub-int v6, p1, v2

    iget-object v7, p0, LC/J;->g:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_2

    iget-object v2, p0, LC/J;->g:Ljava/util/List;

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v4

    move v2, p1

    move v5, v1

    :cond_2
    :goto_0
    invoke-direct {p0}, LC/J;->a()I

    move-result v6

    rem-int v6, v2, v6

    if-nez v6, :cond_3

    invoke-direct {p0}, LC/J;->a()I

    move-result v6

    sub-int v7, p1, v2

    const/4 v8, 0x2

    if-gt v8, v7, :cond_3

    if-ge v7, v6, :cond_3

    goto :goto_1

    :cond_3
    move v3, v1

    :goto_1
    if-eqz v3, :cond_4

    iput v0, p0, LC/J;->f:I

    iget-object v0, p0, LC/J;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_4
    if-gt v2, p1, :cond_e

    :cond_5
    :goto_2
    if-ge v2, p1, :cond_b

    invoke-virtual {p0}, LC/J;->f()I

    move-result v0

    if-ge v4, v0, :cond_b

    if-eqz v3, :cond_6

    iget-object v0, p0, LC/J;->g:Ljava/util/List;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    move v0, v1

    :goto_3
    iget v6, p0, LC/J;->i:I

    if-ge v0, v6, :cond_9

    invoke-virtual {p0}, LC/J;->f()I

    move-result v6

    if-ge v4, v6, :cond_9

    if-nez v5, :cond_7

    iget v6, p0, LC/J;->i:I

    sub-int/2addr v6, v0

    invoke-virtual {p0, v4, v6}, LC/J;->i(II)I

    move-result v6

    move v9, v6

    move v6, v5

    move v5, v9

    goto :goto_4

    :cond_7
    move v6, v1

    :goto_4
    add-int/2addr v0, v5

    iget v7, p0, LC/J;->i:I

    if-le v0, v7, :cond_8

    goto :goto_5

    :cond_8
    add-int/lit8 v4, v4, 0x1

    move v5, v6

    goto :goto_3

    :cond_9
    :goto_5
    add-int/lit8 v2, v2, 0x1

    invoke-direct {p0}, LC/J;->a()I

    move-result v0

    rem-int v0, v2, v0

    if-nez v0, :cond_5

    invoke-virtual {p0}, LC/J;->f()I

    move-result v0

    if-ge v4, v0, :cond_5

    invoke-direct {p0}, LC/J;->a()I

    move-result v0

    div-int v0, v2, v0

    iget-object v6, p0, LC/J;->b:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ne v6, v0, :cond_a

    iget-object v0, p0, LC/J;->b:Ljava/util/ArrayList;

    new-instance v6, LC/J$a;

    invoke-direct {v6, v4, v5}, LC/J$a;-><init>(II)V

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "invalid starting point"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    iput p1, p0, LC/J;->c:I

    iput v4, p0, LC/J;->d:I

    iput v5, p0, LC/J;->e:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    move v0, v1

    move v2, v4

    :goto_6
    iget v3, p0, LC/J;->i:I

    if-ge v0, v3, :cond_d

    invoke-virtual {p0}, LC/J;->f()I

    move-result v3

    if-ge v2, v3, :cond_d

    if-nez v5, :cond_c

    iget v3, p0, LC/J;->i:I

    sub-int/2addr v3, v0

    invoke-virtual {p0, v2, v3}, LC/J;->i(II)I

    move-result v3

    move v9, v5

    move v5, v3

    move v3, v9

    goto :goto_7

    :cond_c
    move v3, v1

    :goto_7
    add-int/2addr v0, v5

    iget v6, p0, LC/J;->i:I

    if-gt v0, v6, :cond_d

    add-int/lit8 v2, v2, 0x1

    invoke-static {v5}, LC/I;->a(I)J

    move-result-wide v5

    invoke-static {v5, v6}, LC/c;->a(J)LC/c;

    move-result-object v5

    invoke-interface {p1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v5, v3

    goto :goto_6

    :cond_d
    new-instance v0, LC/J$c;

    invoke-direct {v0, v4, p1}, LC/J$c;-><init>(ILjava/util/List;)V

    return-object v0

    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "currentLine > lineIndex"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d(I)I
    .locals 9

    .prologue
    invoke-virtual {p0}, LC/J;->f()I

    move-result v0

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, LC/J;->f()I

    move-result v0

    if-ge p1, v0, :cond_a

    iget-object v0, p0, LC/J;->a:LC/j;

    invoke-virtual {v0}, LC/j;->i()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, LC/J;->i:I

    div-int/2addr p1, v0

    return p1

    :cond_1
    iget-object v2, p0, LC/J;->b:Ljava/util/ArrayList;

    new-instance v5, LC/J$d;

    invoke-direct {v5, p1}, LC/J$d;-><init>(I)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lj7/v;->k(Ljava/util/List;IILx7/l;ILjava/lang/Object;)I

    move-result v0

    const/4 v2, 0x2

    if-ltz v0, :cond_2

    goto :goto_0

    :cond_2
    neg-int v0, v0

    sub-int/2addr v0, v2

    :goto_0
    invoke-direct {p0}, LC/J;->a()I

    move-result v3

    mul-int/2addr v3, v0

    iget-object v4, p0, LC/J;->b:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC/J$a;

    invoke-virtual {v0}, LC/J$a;->a()I

    move-result v0

    if-gt v0, p1, :cond_9

    move v4, v1

    :goto_1
    if-ge v0, p1, :cond_7

    add-int/lit8 v5, v0, 0x1

    iget v6, p0, LC/J;->i:I

    sub-int/2addr v6, v4

    invoke-virtual {p0, v0, v6}, LC/J;->i(II)I

    move-result v0

    add-int/2addr v4, v0

    iget v6, p0, LC/J;->i:I

    if-ge v4, v6, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v3, v3, 0x1

    if-ne v4, v6, :cond_4

    move v4, v1

    goto :goto_2

    :cond_4
    move v4, v0

    :goto_2
    invoke-direct {p0}, LC/J;->a()I

    move-result v0

    rem-int v0, v3, v0

    if-nez v0, :cond_6

    invoke-direct {p0}, LC/J;->a()I

    move-result v0

    div-int v0, v3, v0

    iget-object v6, p0, LC/J;->b:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-lt v0, v6, :cond_6

    iget-object v0, p0, LC/J;->b:Ljava/util/ArrayList;

    new-instance v6, LC/J$a;

    if-lez v4, :cond_5

    const/4 v7, 0x1

    goto :goto_3

    :cond_5
    move v7, v1

    :goto_3
    sub-int v7, v5, v7

    const/4 v8, 0x0

    invoke-direct {v6, v7, v1, v2, v8}, LC/J$a;-><init>(IIILy7/k;)V

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    move v0, v5

    goto :goto_1

    :cond_7
    iget v0, p0, LC/J;->i:I

    sub-int/2addr v0, v4

    invoke-virtual {p0, p1, v0}, LC/J;->i(II)I

    move-result p1

    add-int/2addr v4, p1

    iget p1, p0, LC/J;->i:I

    if-le v4, p1, :cond_8

    add-int/lit8 v3, v3, 0x1

    :cond_8
    return v3

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "currentItemIndex > itemIndex"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "ItemIndex > total count"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e()I
    .locals 1

    iget v0, p0, LC/J;->i:I

    return v0
.end method

.method public final f()I
    .locals 1

    iget-object v0, p0, LC/J;->a:LC/j;

    invoke-virtual {v0}, LC/j;->j()LD/I;

    move-result-object v0

    invoke-virtual {v0}, LD/I;->a()I

    move-result v0

    return v0
.end method

.method public final h(I)V
    .locals 1

    .prologue
    iget v0, p0, LC/J;->i:I

    if-eq p1, v0, :cond_0

    iput p1, p0, LC/J;->i:I

    invoke-direct {p0}, LC/J;->g()V

    :cond_0
    return-void
.end method

.method public final i(II)I
    .locals 2

    sget-object v0, LC/J$b;->a:LC/J$b;

    invoke-virtual {v0, p2}, LC/J$b;->a(I)V

    iget p2, p0, LC/J;->i:I

    invoke-virtual {v0, p2}, LC/J$b;->b(I)V

    iget-object p2, p0, LC/J;->a:LC/j;

    invoke-virtual {p2}, LC/j;->j()LD/I;

    move-result-object p2

    invoke-virtual {p2, p1}, LD/I;->get(I)LD/d$a;

    move-result-object p2

    invoke-virtual {p2}, LD/d$a;->b()I

    move-result v1

    sub-int/2addr p1, v1

    invoke-virtual {p2}, LD/d$a;->c()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LC/i;

    invoke-virtual {p2}, LC/i;->b()Lx7/p;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC/c;

    invoke-virtual {p1}, LC/c;->g()J

    move-result-wide p1

    invoke-static {p1, p2}, LC/c;->d(J)I

    move-result p1

    return p1
.end method
