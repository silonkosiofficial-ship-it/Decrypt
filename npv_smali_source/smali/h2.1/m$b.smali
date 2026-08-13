.class final Lh2/m$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh2/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final a:Lh2/m$a;

.field private final b:Lh2/m$a;

.field private c:Lh2/Z$a;

.field private final d:Ljava/util/concurrent/locks/ReentrantLock;

.field final synthetic e:Lh2/m;


# direct methods
.method public constructor <init>(Lh2/m;)V
    .locals 1

    iput-object p1, p0, Lh2/m$b;->e:Lh2/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lh2/m$a;

    invoke-direct {v0, p1}, Lh2/m$a;-><init>(Lh2/m;)V

    iput-object v0, p0, Lh2/m$b;->a:Lh2/m$a;

    new-instance v0, Lh2/m$a;

    invoke-direct {v0, p1}, Lh2/m$a;-><init>(Lh2/m;)V

    iput-object v0, p0, Lh2/m$b;->b:Lh2/m$a;

    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lh2/m$b;->d:Ljava/util/concurrent/locks/ReentrantLock;

    return-void
.end method


# virtual methods
.method public final a()LZ8/f;
    .locals 1

    iget-object v0, p0, Lh2/m$b;->b:Lh2/m$a;

    invoke-virtual {v0}, Lh2/m$a;->a()LZ8/f;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lh2/Z$a;
    .locals 1

    iget-object v0, p0, Lh2/m$b;->c:Lh2/Z$a;

    return-object v0
.end method

.method public final c()LZ8/f;
    .locals 1

    iget-object v0, p0, Lh2/m$b;->a:Lh2/m$a;

    invoke-virtual {v0}, Lh2/m$a;->a()LZ8/f;

    move-result-object v0

    return-object v0
.end method

.method public final d(Lh2/Z$a;Lx7/p;)V
    .locals 2

    .prologue
    const-string v0, "block"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh2/m$b;->d:Ljava/util/concurrent/locks/ReentrantLock;

    :try_start_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lh2/m$b;->c:Lh2/Z$a;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p1, p0, Lh2/m$b;->a:Lh2/m$a;

    iget-object v1, p0, Lh2/m$b;->b:Lh2/m$a;

    invoke-interface {p2, p1, v1}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :goto_1
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1
.end method
