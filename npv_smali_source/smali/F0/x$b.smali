.class final LF0/x$b;
.super LF0/U;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF0/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic X:LF0/x;


# direct methods
.method public constructor <init>(LF0/x;)V
    .locals 0

    iput-object p1, p0, LF0/x$b;->X:LF0/x;

    invoke-direct {p0, p1}, LF0/U;-><init>(LF0/d0;)V

    return-void
.end method


# virtual methods
.method protected M1()V
    .locals 1

    invoke-virtual {p0}, LF0/U;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->a0()LF0/O$a;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, LF0/O$a;->z1()V

    return-void
.end method

.method public S(I)I
    .locals 1

    invoke-virtual {p0}, LF0/U;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {v0, p1}, LF0/J;->d1(I)I

    move-result p1

    return p1
.end method

.method public T(I)I
    .locals 1

    invoke-virtual {p0}, LF0/U;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {v0, p1}, LF0/J;->Z0(I)I

    move-result p1

    return p1
.end method

.method public U(J)LD0/X;
    .locals 5

    .prologue
    invoke-static {p0, p1, p2}, LF0/U;->E1(LF0/U;J)V

    invoke-virtual {p0}, LF0/U;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->w0()LX/b;

    move-result-object v0

    invoke-virtual {v0}, LX/b;->t()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {v0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    :cond_0
    aget-object v3, v0, v2

    check-cast v3, LF0/J;

    invoke-virtual {v3}, LF0/J;->a0()LF0/O$a;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object v4, LF0/J$g;->E:LF0/J$g;

    invoke-virtual {v3, v4}, LF0/O$a;->E1(LF0/J$g;)V

    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_0

    :cond_1
    invoke-virtual {p0}, LF0/U;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->f0()LD0/I;

    move-result-object v0

    invoke-virtual {p0}, LF0/U;->o1()LF0/J;

    move-result-object v1

    invoke-virtual {v1}, LF0/J;->F()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, p0, v1, p1, p2}, LD0/I;->b(LD0/M;Ljava/util/List;J)LD0/K;

    move-result-object p1

    invoke-static {p0, p1}, LF0/U;->F1(LF0/U;LD0/K;)V

    return-object p0
.end method

.method public f1(LD0/a;)I
    .locals 3

    .prologue
    invoke-virtual {p0}, LF0/U;->G1()LF0/b;

    move-result-object v0

    invoke-interface {v0}, LF0/b;->y()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    const/high16 v0, -0x80000000

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0}, LF0/U;->I1()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v0
.end method

.method public n0(I)I
    .locals 1

    invoke-virtual {p0}, LF0/U;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {v0, p1}, LF0/J;->c1(I)I

    move-result p1

    return p1
.end method

.method public t(I)I
    .locals 1

    invoke-virtual {p0}, LF0/U;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {v0, p1}, LF0/J;->Y0(I)I

    move-result p1

    return p1
.end method
