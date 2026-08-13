.class public final LF8/C;
.super LF8/l0;
.source "SourceFile"


# instance fields
.field private final c:[LO7/f0;

.field private final d:[LF8/i0;

.field private final e:Z


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;)V
    .locals 7

    const-string v0, "parameters"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "argumentsList"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/Collection;

    const/4 v0, 0x0

    new-array v1, v0, [LO7/f0;

    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, [LO7/f0;

    check-cast p2, Ljava/util/Collection;

    new-array p1, v0, [LF8/i0;

    invoke-interface {p2, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, [LF8/i0;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, LF8/C;-><init>([LO7/f0;[LF8/i0;ZILy7/k;)V

    return-void
.end method

.method public constructor <init>([LO7/f0;[LF8/i0;Z)V
    .locals 1

    const-string v0, "parameters"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LF8/l0;-><init>()V

    iput-object p1, p0, LF8/C;->c:[LO7/f0;

    iput-object p2, p0, LF8/C;->d:[LF8/i0;

    iput-boolean p3, p0, LF8/C;->e:Z

    array-length p1, p1

    array-length p1, p2

    return-void
.end method

.method public synthetic constructor <init>([LO7/f0;[LF8/i0;ZILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, LF8/C;-><init>([LO7/f0;[LF8/i0;Z)V

    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    iget-boolean v0, p0, LF8/C;->e:Z

    return v0
.end method

.method public e(LF8/E;)LF8/i0;
    .locals 4

    .prologue
    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LF8/E;->W0()LF8/e0;

    move-result-object p1

    invoke-interface {p1}, LF8/e0;->w()LO7/h;

    move-result-object p1

    instance-of v0, p1, LO7/f0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, LO7/f0;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_1

    return-object v1

    :cond_1
    invoke-interface {p1}, LO7/f0;->getIndex()I

    move-result v0

    iget-object v2, p0, LF8/C;->c:[LO7/f0;

    array-length v3, v2

    if-ge v0, v3, :cond_2

    aget-object v2, v2, v0

    invoke-interface {v2}, LO7/f0;->p()LF8/e0;

    move-result-object v2

    invoke-interface {p1}, LO7/f0;->p()LF8/e0;

    move-result-object p1

    invoke-static {v2, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, LF8/C;->d:[LF8/i0;

    aget-object p1, p1, v0

    return-object p1

    :cond_2
    return-object v1
.end method

.method public f()Z
    .locals 1

    .prologue
    iget-object v0, p0, LF8/C;->d:[LF8/i0;

    array-length v0, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final i()[LF8/i0;
    .locals 1

    iget-object v0, p0, LF8/C;->d:[LF8/i0;

    return-object v0
.end method

.method public final j()[LO7/f0;
    .locals 1

    iget-object v0, p0, LF8/C;->c:[LO7/f0;

    return-object v0
.end method
