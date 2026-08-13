.class public final Lcom/google/android/gms/internal/ads/Wu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lw3/a;

.field private final b:Landroid/content/Context;

.field private final c:J

.field private final d:Ljava/lang/ref/WeakReference;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Tu;Lcom/google/android/gms/internal/ads/Uu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Tu;->c(Lcom/google/android/gms/internal/ads/Tu;)Lw3/a;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Wu;->a:Lw3/a;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Tu;->b(Lcom/google/android/gms/internal/ads/Tu;)Landroid/content/Context;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Wu;->b:Landroid/content/Context;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Tu;->g(Lcom/google/android/gms/internal/ads/Tu;)Ljava/lang/ref/WeakReference;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Wu;->d:Ljava/lang/ref/WeakReference;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Tu;->a(Lcom/google/android/gms/internal/ads/Tu;)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/Wu;->c:J

    return-void
.end method


# virtual methods
.method final a()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/Wu;->c:J

    return-wide v0
.end method

.method final b()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Wu;->b:Landroid/content/Context;

    return-object v0
.end method

.method public final c()Lr3/k;
    .locals 3

    new-instance v0, Lr3/k;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Wu;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Wu;->a:Lw3/a;

    invoke-direct {v0, v1, v2}, Lr3/k;-><init>(Landroid/content/Context;Lw3/a;)V

    return-object v0
.end method

.method final d()Lcom/google/android/gms/internal/ads/Wg;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/Wg;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Wu;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/Wg;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method final e()Lw3/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Wu;->a:Lw3/a;

    return-object v0
.end method

.method final f()Ljava/lang/String;
    .locals 3

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Wu;->a:Lw3/a;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Wu;->b:Landroid/content/Context;

    iget-object v1, v1, Lw3/a;->C:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lv3/E0;->H(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method final g()Ljava/lang/ref/WeakReference;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Wu;->d:Ljava/lang/ref/WeakReference;

    return-object v0
.end method
