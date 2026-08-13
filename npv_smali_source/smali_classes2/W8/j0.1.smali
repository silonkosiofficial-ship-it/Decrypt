.class public abstract LW8/j0;
.super LW8/J;
.source "SourceFile"


# instance fields
.field private E:J

.field private F:Z

.field private G:Lj7/m;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LW8/J;-><init>()V

    return-void
.end method

.method public static synthetic A1(LW8/j0;ZILjava/lang/Object;)V
    .locals 0

    .prologue
    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, LW8/j0;->z1(Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: decrementUseCount"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final B1(Z)J
    .locals 2

    .prologue
    if-eqz p1, :cond_0

    const-wide v0, 0x100000000L

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x1

    :goto_0
    return-wide v0
.end method

.method public static synthetic F1(LW8/j0;ZILjava/lang/Object;)V
    .locals 0

    .prologue
    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, LW8/j0;->E1(Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: incrementUseCount"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final C1(LW8/a0;)V
    .locals 1

    .prologue
    iget-object v0, p0, LW8/j0;->G:Lj7/m;

    if-nez v0, :cond_0

    new-instance v0, Lj7/m;

    invoke-direct {v0}, Lj7/m;-><init>()V

    iput-object v0, p0, LW8/j0;->G:Lj7/m;

    :cond_0
    invoke-virtual {v0, p1}, Lj7/m;->g(Ljava/lang/Object;)V

    return-void
.end method

.method protected D1()J
    .locals 3

    .prologue
    iget-object v0, p0, LW8/j0;->G:Lj7/m;

    const-wide v1, 0x7fffffffffffffffL

    if-nez v0, :cond_0

    return-wide v1

    :cond_0
    invoke-virtual {v0}, Lj7/m;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const-wide/16 v1, 0x0

    :goto_0
    return-wide v1
.end method

.method public final E1(Z)V
    .locals 4

    .prologue
    iget-wide v0, p0, LW8/j0;->E:J

    invoke-direct {p0, p1}, LW8/j0;->B1(Z)J

    move-result-wide v2

    add-long/2addr v0, v2

    iput-wide v0, p0, LW8/j0;->E:J

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, LW8/j0;->F:Z

    :cond_0
    return-void
.end method

.method public final G1()Z
    .locals 5

    .prologue
    iget-wide v0, p0, LW8/j0;->E:J

    const/4 v2, 0x1

    invoke-direct {p0, v2}, LW8/j0;->B1(Z)J

    move-result-wide v3

    cmp-long v0, v0, v3

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public final H1()Z
    .locals 1

    .prologue
    iget-object v0, p0, LW8/j0;->G:Lj7/m;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj7/m;->isEmpty()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public abstract I1()J
.end method

.method public final J1()Z
    .locals 2

    .prologue
    iget-object v0, p0, LW8/j0;->G:Lj7/m;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Lj7/m;->S()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LW8/a0;

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {v0}, LW8/a0;->run()V

    const/4 v0, 0x1

    return v0
.end method

.method public K1()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract shutdown()V
.end method

.method public final x1(ILjava/lang/String;)LW8/J;
    .locals 0

    invoke-static {p1}, Lb9/l;->a(I)V

    invoke-static {p0, p2}, Lb9/l;->b(LW8/J;Ljava/lang/String;)LW8/J;

    move-result-object p1

    return-object p1
.end method

.method public final z1(Z)V
    .locals 4

    .prologue
    iget-wide v0, p0, LW8/j0;->E:J

    invoke-direct {p0, p1}, LW8/j0;->B1(Z)J

    move-result-wide v2

    sub-long/2addr v0, v2

    iput-wide v0, p0, LW8/j0;->E:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    return-void

    :cond_0
    iget-boolean p1, p0, LW8/j0;->F:Z

    if-eqz p1, :cond_1

    invoke-virtual {p0}, LW8/j0;->shutdown()V

    :cond_1
    return-void
.end method
