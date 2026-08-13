.class public abstract Lz9/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lj7/m;

.field private b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lj7/m;

    invoke-direct {v0}, Lj7/m;-><init>()V

    iput-object v0, p0, Lz9/l;->a:Lj7/m;

    return-void
.end method


# virtual methods
.method protected final a([C)V
    .locals 2

    .prologue
    const-string v0, "array"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lz9/l;->b:I

    array-length v1, p1

    add-int/2addr v0, v1

    invoke-static {}, Lz9/j;->a()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget v0, p0, Lz9/l;->b:I

    array-length v1, p1

    add-int/2addr v0, v1

    iput v0, p0, Lz9/l;->b:I

    iget-object v0, p0, Lz9/l;->a:Lj7/m;

    invoke-virtual {v0, p1}, Lj7/m;->g(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method protected final b(I)[C
    .locals 3

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lz9/l;->a:Lj7/m;

    invoke-virtual {v0}, Lj7/m;->U()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [C

    if-eqz v0, :cond_0

    iget v1, p0, Lz9/l;->b:I

    array-length v2, v0

    sub-int/2addr v1, v2

    iput v1, p0, Lz9/l;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit p0

    if-nez v0, :cond_1

    new-array v0, p1, [C

    :cond_1
    return-object v0

    :goto_1
    monitor-exit p0

    throw p1
.end method
