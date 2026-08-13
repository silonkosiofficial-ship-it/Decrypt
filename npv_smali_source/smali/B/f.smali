.class public final LB/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD/h;


# instance fields
.field private final a:LB/D;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LB/D;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB/f;->a:LB/D;

    return-void
.end method

.method private final h(LB/q;)I
    .locals 5

    .prologue
    invoke-interface {p1}, LB/q;->j()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LB/l;

    invoke-interface {v4}, LB/l;->a()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    div-int/2addr v3, v0

    invoke-interface {p1}, LB/q;->h()I

    move-result p1

    add-int/2addr v3, p1

    return v3
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, LB/f;->a:LB/D;

    invoke-virtual {v0}, LB/D;->w()LB/q;

    move-result-object v0

    invoke-interface {v0}, LB/q;->d()I

    move-result v0

    return v0
.end method

.method public b()I
    .locals 1

    .prologue
    iget-object v0, p0, LB/f;->a:LB/D;

    invoke-virtual {v0}, LB/D;->w()LB/q;

    move-result-object v0

    invoke-interface {v0}, LB/q;->j()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lj7/v;->v0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LB/l;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LB/l;->getIndex()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c(Lx/w;II)V
    .locals 1

    iget-object p1, p0, LB/f;->a:LB/D;

    const/4 v0, 0x1

    invoke-virtual {p1, p2, p3, v0}, LB/D;->N(IIZ)V

    return-void
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, LB/f;->a:LB/D;

    invoke-virtual {v0}, LB/D;->s()I

    move-result v0

    return v0
.end method

.method public e(Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 6

    .prologue
    iget-object v0, p0, LB/f;->a:LB/D;

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
    .locals 6

    .prologue
    iget-object v0, p0, LB/f;->a:LB/D;

    invoke-virtual {v0}, LB/D;->w()LB/q;

    move-result-object v0

    invoke-interface {v0}, LB/q;->j()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-interface {v0}, LB/q;->j()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, LB/l;

    invoke-interface {v5}, LB/l;->getIndex()I

    move-result v5

    if-ne v5, p1, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_1
    check-cast v4, LB/l;

    if-nez v4, :cond_3

    invoke-direct {p0, v0}, LB/f;->h(LB/q;)I

    move-result v0

    invoke-virtual {p0}, LB/f;->g()I

    move-result v1

    sub-int/2addr p1, v1

    mul-int/2addr v0, p1

    int-to-float p1, v0

    invoke-virtual {p0}, LB/f;->d()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr p1, v0

    goto :goto_2

    :cond_3
    invoke-interface {v4}, LB/l;->c()I

    move-result p1

    int-to-float p1, p1

    :goto_2
    return p1
.end method

.method public g()I
    .locals 1

    iget-object v0, p0, LB/f;->a:LB/D;

    invoke-virtual {v0}, LB/D;->r()I

    move-result v0

    return v0
.end method
