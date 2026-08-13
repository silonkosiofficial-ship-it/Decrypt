.class public final LC/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD/h;


# instance fields
.field private final a:LC/K;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LC/K;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC/e;->a:LC/K;

    return-void
.end method

.method private final h(LC/s;)I
    .locals 11

    .prologue
    invoke-interface {p1}, LC/s;->e()Lx/s;

    move-result-object v0

    sget-object v1, Lx/s;->C:Lx/s;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-interface {p1}, LC/s;->j()Ljava/util/List;

    move-result-object v1

    new-instance v3, LC/e$a;

    invoke-direct {v3, v0, v1}, LC/e$a;-><init>(ZLjava/util/List;)V

    move v4, v2

    move v5, v4

    move v6, v5

    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v7

    if-ge v4, v7, :cond_4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v3, v7}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    const/4 v8, -0x1

    if-ne v7, v8, :cond_1

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    move v8, v2

    :goto_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v9

    if-ge v4, v9, :cond_3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v3, v9}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v9

    if-ne v9, v7, :cond_3

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LC/k;

    invoke-interface {v9}, LC/k;->a()J

    move-result-wide v9

    if-eqz v0, :cond_2

    invoke-static {v9, v10}, LY0/t;->f(J)I

    move-result v9

    goto :goto_3

    :cond_2
    invoke-static {v9, v10}, LY0/t;->g(J)I

    move-result v9

    :goto_3
    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v8

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_3
    add-int/2addr v5, v8

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_4
    div-int/2addr v5, v6

    invoke-interface {p1}, LC/s;->h()I

    move-result p1

    add-int/2addr v5, p1

    return v5
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, LC/e;->a:LC/K;

    invoke-virtual {v0}, LC/K;->r()LC/s;

    move-result-object v0

    invoke-interface {v0}, LC/s;->d()I

    move-result v0

    return v0
.end method

.method public b()I
    .locals 1

    .prologue
    iget-object v0, p0, LC/e;->a:LC/K;

    invoke-virtual {v0}, LC/K;->r()LC/s;

    move-result-object v0

    invoke-interface {v0}, LC/s;->j()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lj7/v;->v0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC/k;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LC/k;->getIndex()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c(Lx/w;II)V
    .locals 1

    iget-object p1, p0, LC/e;->a:LC/K;

    const/4 v0, 0x1

    invoke-virtual {p1, p2, p3, v0}, LC/K;->H(IIZ)V

    return-void
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, LC/e;->a:LC/K;

    invoke-virtual {v0}, LC/K;->o()I

    move-result v0

    return v0
.end method

.method public e(Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 6

    .prologue
    iget-object v0, p0, LC/e;->a:LC/K;

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v0 .. v5}, Lx/z;->c(Lx/A;Lv/L;Lx7/p;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public f(I)F
    .locals 7

    .prologue
    iget-object v0, p0, LC/e;->a:LC/K;

    invoke-virtual {v0}, LC/K;->r()LC/s;

    move-result-object v0

    invoke-interface {v0}, LC/s;->j()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-interface {v0}, LC/s;->j()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_2

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, LC/k;

    invoke-interface {v6}, LC/k;->getIndex()I

    move-result v6

    if-ne v6, p1, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    :goto_1
    check-cast v5, LC/k;

    if-nez v5, :cond_5

    iget-object v1, p0, LC/e;->a:LC/K;

    invoke-virtual {v1}, LC/K;->A()I

    move-result v1

    invoke-direct {p0, v0}, LC/e;->h(LC/s;)I

    move-result v0

    invoke-virtual {p0}, LC/e;->g()I

    move-result v2

    const/4 v4, 0x1

    if-ge p1, v2, :cond_3

    move v3, v4

    :cond_3
    invoke-virtual {p0}, LC/e;->g()I

    move-result v2

    sub-int/2addr p1, v2

    add-int/lit8 v2, v1, -0x1

    if-eqz v3, :cond_4

    const/4 v4, -0x1

    :cond_4
    mul-int/2addr v2, v4

    add-int/2addr p1, v2

    div-int/2addr p1, v1

    mul-int/2addr v0, p1

    int-to-float p1, v0

    invoke-virtual {p0}, LC/e;->d()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr p1, v0

    goto :goto_3

    :cond_5
    invoke-interface {v0}, LC/s;->e()Lx/s;

    move-result-object p1

    sget-object v0, Lx/s;->C:Lx/s;

    if-ne p1, v0, :cond_6

    invoke-interface {v5}, LC/k;->l()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/p;->i(J)I

    move-result p1

    goto :goto_2

    :cond_6
    invoke-interface {v5}, LC/k;->l()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/p;->h(J)I

    move-result p1

    :goto_2
    int-to-float p1, p1

    :goto_3
    return p1
.end method

.method public g()I
    .locals 1

    iget-object v0, p0, LC/e;->a:LC/K;

    invoke-virtual {v0}, LC/K;->n()I

    move-result v0

    return v0
.end method
