.class final LB3/q0;
.super Ljava/util/LinkedHashMap;
.source "SourceFile"


# instance fields
.field final synthetic C:LB3/s0;


# direct methods
.method constructor <init>(LB3/s0;)V
    .locals 0

    iput-object p1, p0, LB3/q0;->C:LB3/s0;

    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    return-void
.end method


# virtual methods
.method protected final removeEldestEntry(Ljava/util/Map$Entry;)Z
    .locals 5

    .prologue
    iget-object v0, p0, LB3/q0;->C:LB3/s0;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Ljava/util/AbstractMap;->size()I

    move-result v1

    iget-object v2, p0, LB3/q0;->C:LB3/s0;

    invoke-static {v2}, LB3/s0;->a(LB3/s0;)I

    move-result v3

    const/4 v4, 0x0

    if-gt v1, v3, :cond_0

    monitor-exit v0

    return v4

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    invoke-static {v2}, LB3/s0;->c(LB3/s0;)Ljava/util/ArrayDeque;

    move-result-object v1

    new-instance v2, Landroid/util/Pair;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LB3/r0;

    iget-object p1, p1, LB3/r0;->b:Ljava/lang/String;

    invoke-direct {v2, v3, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Ljava/util/AbstractMap;->size()I

    move-result p1

    iget-object v1, p0, LB3/q0;->C:LB3/s0;

    invoke-static {v1}, LB3/s0;->a(LB3/s0;)I

    move-result v1

    if-le p1, v1, :cond_1

    const/4 v4, 0x1

    :cond_1
    monitor-exit v0

    return v4

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
