.class public final Lcom/google/android/gms/internal/ads/ub0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lw3/a;

.field private final c:Ljava/util/concurrent/ScheduledExecutorService;

.field private final d:Lcom/google/android/gms/ads/internal/ClientApi;

.field private e:Lcom/google/android/gms/internal/ads/Vl;

.field private final f:LV3/f;


# direct methods
.method constructor <init>(Landroid/content/Context;Lw3/a;Ljava/util/concurrent/ScheduledExecutorService;LV3/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ub0;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ub0;->b:Lw3/a;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/ub0;->c:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance p1, Lcom/google/android/gms/ads/internal/ClientApi;

    invoke-direct {p1}, Lcom/google/android/gms/ads/internal/ClientApi;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ub0;->d:Lcom/google/android/gms/ads/internal/ClientApi;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/ub0;->f:LV3/f;

    return-void
.end method

.method private static c()Lcom/google/android/gms/internal/ads/Ra0;
    .locals 10

    new-instance v9, Lcom/google/android/gms/internal/ads/Ra0;

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->w:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->x:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    const-wide v7, 0x3fc999999999999aL    # 0.2

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/ads/Ra0;-><init>(JDJD)V

    return-object v9
.end method


# virtual methods
.method public final a(Ls3/I1;Ls3/c0;)Lcom/google/android/gms/internal/ads/tb0;
    .locals 11

    .prologue
    iget v0, p1, Ls3/I1;->D:I

    invoke-static {v0}, Lk3/c;->e(I)Lk3/c;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    :goto_0
    const/4 v0, 0x0

    return-object v0

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ub0;->d:Lcom/google/android/gms/ads/internal/ClientApi;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ub0;->a:Landroid/content/Context;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ub0;->b:Lw3/a;

    new-instance v10, Lcom/google/android/gms/internal/ads/Qa0;

    iget v3, v0, Lw3/a;->E:I

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/ub0;->e:Lcom/google/android/gms/internal/ads/Vl;

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/ub0;->c:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v9, p0, Lcom/google/android/gms/internal/ads/ub0;->f:LV3/f;

    invoke-static {}, Lcom/google/android/gms/internal/ads/ub0;->c()Lcom/google/android/gms/internal/ads/Ra0;

    move-result-object v8

    move-object v0, v10

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/internal/ads/Qa0;-><init>(Lcom/google/android/gms/ads/internal/ClientApi;Landroid/content/Context;ILcom/google/android/gms/internal/ads/Vl;Ls3/I1;Ls3/c0;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/ads/Ra0;LV3/f;)V

    return-object v10

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ub0;->d:Lcom/google/android/gms/ads/internal/ClientApi;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ub0;->a:Landroid/content/Context;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ub0;->b:Lw3/a;

    new-instance v10, Lcom/google/android/gms/internal/ads/xb0;

    iget v3, v0, Lw3/a;->E:I

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/ub0;->e:Lcom/google/android/gms/internal/ads/Vl;

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/ub0;->c:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v9, p0, Lcom/google/android/gms/internal/ads/ub0;->f:LV3/f;

    invoke-static {}, Lcom/google/android/gms/internal/ads/ub0;->c()Lcom/google/android/gms/internal/ads/Ra0;

    move-result-object v8

    move-object v0, v10

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/internal/ads/xb0;-><init>(Lcom/google/android/gms/ads/internal/ClientApi;Landroid/content/Context;ILcom/google/android/gms/internal/ads/Vl;Ls3/I1;Ls3/c0;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/ads/Ra0;LV3/f;)V

    return-object v10

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ub0;->d:Lcom/google/android/gms/ads/internal/ClientApi;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ub0;->a:Landroid/content/Context;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ub0;->b:Lw3/a;

    new-instance v10, Lcom/google/android/gms/internal/ads/Ta0;

    iget v3, v0, Lw3/a;->E:I

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/ub0;->e:Lcom/google/android/gms/internal/ads/Vl;

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/ub0;->c:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v9, p0, Lcom/google/android/gms/internal/ads/ub0;->f:LV3/f;

    invoke-static {}, Lcom/google/android/gms/internal/ads/ub0;->c()Lcom/google/android/gms/internal/ads/Ra0;

    move-result-object v8

    move-object v0, v10

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/internal/ads/Ta0;-><init>(Lcom/google/android/gms/ads/internal/ClientApi;Landroid/content/Context;ILcom/google/android/gms/internal/ads/Vl;Ls3/I1;Ls3/c0;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/ads/Ra0;LV3/f;)V

    return-object v10
.end method

.method public final b(Lcom/google/android/gms/internal/ads/Vl;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ub0;->e:Lcom/google/android/gms/internal/ads/Vl;

    return-void
.end method
