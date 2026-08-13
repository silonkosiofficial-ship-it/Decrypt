.class final Li7/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li7/n;
.implements Ljava/io/Serializable;


# instance fields
.field private C:Lx7/a;

.field private volatile D:Ljava/lang/Object;

.field private final E:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lx7/a;Ljava/lang/Object;)V
    .locals 1

    .prologue
    const-string v0, "initializer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li7/z;->C:Lx7/a;

    sget-object p1, Li7/I;->a:Li7/I;

    iput-object p1, p0, Li7/z;->D:Ljava/lang/Object;

    if-nez p2, :cond_0

    move-object p2, p0

    :cond_0
    iput-object p2, p0, Li7/z;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lx7/a;Ljava/lang/Object;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Li7/z;-><init>(Lx7/a;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public d()Z
    .locals 2

    .prologue
    iget-object v0, p0, Li7/z;->D:Ljava/lang/Object;

    sget-object v1, Li7/I;->a:Li7/I;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 3

    .prologue
    iget-object v0, p0, Li7/z;->D:Ljava/lang/Object;

    sget-object v1, Li7/I;->a:Li7/I;

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Li7/z;->E:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v2, p0, Li7/z;->D:Ljava/lang/Object;

    if-eq v2, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Li7/z;->C:Lx7/a;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Li7/z;->D:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, p0, Li7/z;->C:Lx7/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    invoke-virtual {p0}, Li7/z;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Li7/z;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "Lazy value not initialized yet."

    :goto_0
    return-object v0
.end method
