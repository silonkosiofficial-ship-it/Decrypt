.class public final Ly/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly/f;->a(LB/D;Ly/j;)Ly/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LB/D;

.field final synthetic b:Ly/j;


# direct methods
.method constructor <init>(LB/D;Ly/j;)V
    .locals 0

    iput-object p1, p0, Ly/f$a;->a:LB/D;

    iput-object p2, p0, Ly/f$a;->b:Ly/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final c()I
    .locals 4

    .prologue
    invoke-direct {p0}, Ly/f$a;->d()LB/q;

    move-result-object v0

    invoke-interface {v0}, LB/q;->j()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, LB/q;->j()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0}, LB/q;->j()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LB/l;

    invoke-interface {v3}, LB/l;->a()I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_0

    :cond_1
    div-int/2addr v2, v1

    :goto_1
    return v2
.end method

.method private final d()LB/q;
    .locals 1

    iget-object v0, p0, Ly/f$a;->a:LB/D;

    invoke-virtual {v0}, LB/D;->w()LB/q;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(FF)F
    .locals 1

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p1

    invoke-direct {p0}, Ly/f$a;->c()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr p1, v0

    const/4 v0, 0x0

    invoke-static {p1, v0}, LE7/j;->c(FF)F

    move-result p1

    invoke-static {p2}, Ljava/lang/Math;->signum(F)F

    move-result p2

    mul-float/2addr p1, p2

    return p1
.end method

.method public b(F)F
    .locals 14

    .prologue
    invoke-direct {p0}, Ly/f$a;->d()LB/q;

    move-result-object v0

    invoke-interface {v0}, LB/q;->j()Ljava/util/List;

    move-result-object v0

    iget-object v9, p0, Ly/f$a;->b:Ly/j;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v10

    const/high16 v1, -0x800000    # Float.NEGATIVE_INFINITY

    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    const/4 v3, 0x0

    move v11, v1

    move v12, v2

    move v13, v3

    :goto_0
    if-ge v13, v10, :cond_2

    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LB/l;

    invoke-direct {p0}, Ly/f$a;->d()LB/q;

    move-result-object v2

    invoke-static {v2}, Ly/f;->d(LB/q;)I

    move-result v2

    invoke-direct {p0}, Ly/f$a;->d()LB/q;

    move-result-object v3

    invoke-interface {v3}, LB/q;->g()I

    move-result v3

    invoke-direct {p0}, Ly/f$a;->d()LB/q;

    move-result-object v4

    invoke-interface {v4}, LB/q;->b()I

    move-result v4

    invoke-interface {v1}, LB/l;->a()I

    move-result v5

    invoke-interface {v1}, LB/l;->c()I

    move-result v6

    invoke-interface {v1}, LB/l;->getIndex()I

    move-result v7

    invoke-direct {p0}, Ly/f$a;->d()LB/q;

    move-result-object v1

    invoke-interface {v1}, LB/q;->d()I

    move-result v8

    move v1, v2

    move v2, v3

    move v3, v4

    move v4, v5

    move v5, v6

    move v6, v7

    move-object v7, v9

    invoke-static/range {v1 .. v8}, Ly/k;->a(IIIIIILy/j;I)F

    move-result v1

    const/4 v2, 0x0

    cmpg-float v3, v1, v2

    if-gtz v3, :cond_0

    cmpl-float v3, v1, v11

    if-lez v3, :cond_0

    move v11, v1

    :cond_0
    cmpl-float v2, v1, v2

    if-ltz v2, :cond_1

    cmpg-float v2, v1, v12

    if-gez v2, :cond_1

    move v12, v1

    :cond_1
    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Ly/f$a;->a:LB/D;

    invoke-virtual {v0}, LB/D;->q()LY0/e;

    move-result-object v0

    invoke-static {v0, p1}, Ly/f;->c(LY0/e;F)I

    move-result p1

    invoke-static {p1, v11, v12}, Ly/h;->j(IFF)F

    move-result p1

    return p1
.end method
