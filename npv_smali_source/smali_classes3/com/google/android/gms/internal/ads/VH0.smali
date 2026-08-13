.class public final Lcom/google/android/gms/internal/ads/VH0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Lcom/google/android/gms/internal/ads/LH0;

.field private final c:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method public constructor <init>()V
    .locals 3

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/internal/ads/VH0;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILcom/google/android/gms/internal/ads/LH0;)V

    return-void
.end method

.method private constructor <init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILcom/google/android/gms/internal/ads/LH0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/VH0;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/gms/internal/ads/VH0;->a:I

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/VH0;->b:Lcom/google/android/gms/internal/ads/LH0;

    return-void
.end method


# virtual methods
.method public final a(ILcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/VH0;
    .locals 2

    new-instance p1, Lcom/google/android/gms/internal/ads/VH0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/VH0;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, p2}, Lcom/google/android/gms/internal/ads/VH0;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILcom/google/android/gms/internal/ads/LH0;)V

    return-object p1
.end method

.method public final b(Landroid/os/Handler;Lcom/google/android/gms/internal/ads/WH0;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/UH0;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/ads/UH0;-><init>(Landroid/os/Handler;Lcom/google/android/gms/internal/ads/WH0;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/VH0;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final c(Lcom/google/android/gms/internal/ads/rF;)V
    .locals 5

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/VH0;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/UH0;

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/UH0;->b:Lcom/google/android/gms/internal/ads/WH0;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/UH0;->a:Landroid/os/Handler;

    new-instance v3, Lcom/google/android/gms/internal/ads/TH0;

    invoke-direct {v3, p1, v2}, Lcom/google/android/gms/internal/ads/TH0;-><init>(Lcom/google/android/gms/internal/ads/rF;Lcom/google/android/gms/internal/ads/WH0;)V

    sget v2, Lcom/google/android/gms/internal/ads/EW;->a:I

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->isAlive()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v4

    if-ne v2, v4, :cond_1

    invoke-interface {v3}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_1
    invoke-virtual {v1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final d(Lcom/google/android/gms/internal/ads/HH0;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/OH0;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/OH0;-><init>(Lcom/google/android/gms/internal/ads/VH0;Lcom/google/android/gms/internal/ads/HH0;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/VH0;->c(Lcom/google/android/gms/internal/ads/rF;)V

    return-void
.end method

.method public final e(Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/SH0;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ads/SH0;-><init>(Lcom/google/android/gms/internal/ads/VH0;Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/VH0;->c(Lcom/google/android/gms/internal/ads/rF;)V

    return-void
.end method

.method public final f(Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/QH0;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ads/QH0;-><init>(Lcom/google/android/gms/internal/ads/VH0;Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/VH0;->c(Lcom/google/android/gms/internal/ads/rF;)V

    return-void
.end method

.method public final g(Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;Ljava/io/IOException;Z)V
    .locals 7

    new-instance v6, Lcom/google/android/gms/internal/ads/RH0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/RH0;-><init>(Lcom/google/android/gms/internal/ads/VH0;Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;Ljava/io/IOException;Z)V

    invoke-virtual {p0, v6}, Lcom/google/android/gms/internal/ads/VH0;->c(Lcom/google/android/gms/internal/ads/rF;)V

    return-void
.end method

.method public final h(Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/PH0;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ads/PH0;-><init>(Lcom/google/android/gms/internal/ads/VH0;Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/VH0;->c(Lcom/google/android/gms/internal/ads/rF;)V

    return-void
.end method

.method public final i(Lcom/google/android/gms/internal/ads/WH0;)V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/VH0;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/UH0;

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/UH0;->b:Lcom/google/android/gms/internal/ads/WH0;

    if-ne v2, p1, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/VH0;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method
