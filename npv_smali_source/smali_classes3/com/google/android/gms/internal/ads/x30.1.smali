.class public final Lcom/google/android/gms/internal/ads/x30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/L20;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Uq;

.field private final b:Ljava/util/concurrent/ScheduledExecutorService;

.field private final c:Lcom/google/android/gms/internal/ads/Yk0;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/Qc;Lcom/google/android/gms/internal/ads/Uq;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/ads/Yk0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/x30;->a:Lcom/google/android/gms/internal/ads/Uq;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/x30;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/x30;->c:Lcom/google/android/gms/internal/ads/Yk0;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/16 v0, 0x2b

    return v0
.end method

.method public final b()LP4/d;
    .locals 5

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->X2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->c3:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {v1}, Ll4/o;->e(Ljava/lang/Object;)Ll4/l;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/Te0;->a(Ll4/l;Ll4/b;)LP4/d;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/u30;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/u30;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/x30;->c:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/og;->a:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/google/android/gms/internal/ads/og;->b:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/x30;->b:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, v2, v4, v3}, Lcom/google/android/gms/internal/ads/Nk0;->o(LP4/d;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)LP4/d;

    move-result-object v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/ads/w30;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/w30;-><init>(Lcom/google/android/gms/internal/ads/x30;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/x30;->c:Lcom/google/android/gms/internal/ads/Yk0;

    const-class v3, Ljava/lang/Exception;

    invoke-static {v0, v3, v1, v2}, Lcom/google/android/gms/internal/ads/Nk0;->e(LP4/d;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/pg0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/y30;

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/y30;-><init>(Ljava/lang/String;I)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v0

    return-object v0
.end method

.method final synthetic c(Ljava/lang/Exception;)Lcom/google/android/gms/internal/ads/y30;
    .locals 2

    const-string v0, "AppSetIdInfoGmscoreSignal"

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/x30;->a:Lcom/google/android/gms/internal/ads/Uq;

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/ads/Uq;->x(Ljava/lang/Throwable;Ljava/lang/String;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/y30;

    const/4 v0, 0x0

    const/4 v1, -0x1

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/y30;-><init>(Ljava/lang/String;I)V

    return-object p1
.end method
