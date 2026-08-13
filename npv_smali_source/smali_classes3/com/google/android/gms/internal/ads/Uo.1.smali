.class final Lcom/google/android/gms/internal/ads/Uo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/google/android/gms/internal/ads/Wo;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Wo;Landroid/content/Context;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Uo;->a:Landroid/content/Context;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Uo;->b:Lcom/google/android/gms/internal/ads/Wo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 5

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Uo;->b:Lcom/google/android/gms/internal/ads/Wo;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Wo;->a(Lcom/google/android/gms/internal/ads/Wo;)Ljava/util/WeakHashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Uo;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Vo;

    if-eqz v0, :cond_1

    sget-object v1, Lcom/google/android/gms/internal/ads/rg;->d:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/Vo;->a:J

    add-long/2addr v3, v1

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v1

    invoke-interface {v1}, LV3/f;->a()J

    move-result-wide v1

    cmp-long v1, v3, v1

    if-gez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Uo;->a:Landroid/content/Context;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/Vo;->b:Lcom/google/android/gms/internal/ads/To;

    new-instance v2, Lcom/google/android/gms/internal/ads/So;

    invoke-direct {v2, v1, v0}, Lcom/google/android/gms/internal/ads/So;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/To;)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/So;->a()Lcom/google/android/gms/internal/ads/To;

    move-result-object v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Uo;->a:Landroid/content/Context;

    new-instance v1, Lcom/google/android/gms/internal/ads/So;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/So;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/So;->a()Lcom/google/android/gms/internal/ads/To;

    move-result-object v0

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Uo;->b:Lcom/google/android/gms/internal/ads/Wo;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Uo;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/Wo;->a(Lcom/google/android/gms/internal/ads/Wo;)Ljava/util/WeakHashMap;

    move-result-object v3

    new-instance v4, Lcom/google/android/gms/internal/ads/Vo;

    invoke-direct {v4, v1, v0}, Lcom/google/android/gms/internal/ads/Vo;-><init>(Lcom/google/android/gms/internal/ads/Wo;Lcom/google/android/gms/internal/ads/To;)V

    invoke-virtual {v3, v2, v4}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
