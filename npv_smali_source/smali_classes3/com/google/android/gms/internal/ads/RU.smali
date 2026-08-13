.class public final Lcom/google/android/gms/internal/ads/RU;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/VT;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/vz;

.field private final b:Lcom/google/android/gms/internal/ads/xU;

.field private final c:Lcom/google/android/gms/internal/ads/Yk0;

.field private final d:Lcom/google/android/gms/internal/ads/GC;

.field private final e:Ljava/util/concurrent/ScheduledExecutorService;

.field private final f:Lcom/google/android/gms/internal/ads/YN;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/vz;Lcom/google/android/gms/internal/ads/xU;Lcom/google/android/gms/internal/ads/GC;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/ads/Yk0;Lcom/google/android/gms/internal/ads/YN;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/RU;->a:Lcom/google/android/gms/internal/ads/vz;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/RU;->b:Lcom/google/android/gms/internal/ads/xU;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/RU;->d:Lcom/google/android/gms/internal/ads/GC;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/RU;->e:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/RU;->c:Lcom/google/android/gms/internal/ads/Yk0;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/RU;->f:Lcom/google/android/gms/internal/ads/YN;

    return-void
.end method

.method static bridge synthetic d(Lcom/google/android/gms/internal/ads/RU;)Lcom/google/android/gms/internal/ads/vz;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/RU;->a:Lcom/google/android/gms/internal/ads/vz;

    return-object p0
.end method

.method static bridge synthetic e(Lcom/google/android/gms/internal/ads/RU;)Lcom/google/android/gms/internal/ads/GC;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/RU;->d:Lcom/google/android/gms/internal/ads/GC;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)Z
    .locals 6

    .prologue
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/e70;->a:Lcom/google/android/gms/internal/ads/a70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/a70;->a:Lcom/google/android/gms/internal/ads/n70;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/n70;->a()Lcom/google/android/gms/internal/ads/fi;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/RU;->b:Lcom/google/android/gms/internal/ads/xU;

    invoke-virtual {v1, p1, p2}, Lcom/google/android/gms/internal/ads/xU;->a(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)Z

    move-result p1

    sget-object p2, Lcom/google/android/gms/internal/ads/Af;->Rb:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const/4 v1, 0x1

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/RU;->f:Lcom/google/android/gms/internal/ads/YN;

    const-string v2, "0"

    const-string v3, "1"

    if-eqz v0, :cond_0

    move-object v4, v3

    goto :goto_0

    :cond_0
    move-object v4, v2

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/YN;->b()Ljava/util/Map;

    move-result-object p2

    const-string v5, "has_dbl"

    invoke-interface {p2, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/RU;->f:Lcom/google/android/gms/internal/ads/YN;

    if-eq v1, p1, :cond_1

    goto :goto_1

    :cond_1
    move-object v2, v3

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/YN;->b()Ljava/util/Map;

    move-result-object p2

    const-string v3, "crdb"

    invoke-interface {p2, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    if-eqz v0, :cond_3

    if-eqz p1, :cond_3

    return v1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)LP4/d;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/OU;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ads/OU;-><init>(Lcom/google/android/gms/internal/ads/RU;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/RU;->c:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/Yk0;->H0(Ljava/util/concurrent/Callable;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method final synthetic c(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)Lcom/google/android/gms/internal/ads/Qy;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/ads/wA;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/wA;-><init>(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Ljava/lang/String;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/Nz;

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/e70;->a:Lcom/google/android/gms/internal/ads/a70;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/a70;->a:Lcom/google/android/gms/internal/ads/n70;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/n70;->a()Lcom/google/android/gms/internal/ads/fi;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/PU;

    invoke-direct {v3, p0, p1, p2}, Lcom/google/android/gms/internal/ads/PU;-><init>(Lcom/google/android/gms/internal/ads/RU;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)V

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/ads/Nz;-><init>(Lcom/google/android/gms/internal/ads/fi;Ljava/lang/Runnable;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/RU;->a:Lcom/google/android/gms/internal/ads/vz;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/vz;->b(Lcom/google/android/gms/internal/ads/wA;Lcom/google/android/gms/internal/ads/Nz;)Lcom/google/android/gms/internal/ads/Mz;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Mz;->a()Lcom/google/android/gms/internal/ads/Qy;

    move-result-object p1

    return-object p1
.end method

.method final synthetic f(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/RU;->b:Lcom/google/android/gms/internal/ads/xU;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/xU;->b(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)LP4/d;

    move-result-object p1

    iget p2, p2, Lcom/google/android/gms/internal/ads/R60;->R:I

    int-to-long v0, p2

    sget-object p2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/RU;->e:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {p1, v0, v1, p2, v2}, Lcom/google/android/gms/internal/ads/Nk0;->o(LP4/d;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)LP4/d;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/QU;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/QU;-><init>(Lcom/google/android/gms/internal/ads/RU;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/RU;->c:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V

    return-void
.end method
