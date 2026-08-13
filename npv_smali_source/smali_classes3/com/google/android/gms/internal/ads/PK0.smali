.class final Lcom/google/android/gms/internal/ads/PK0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/google/android/gms/internal/ads/D;

.field final synthetic b:Lcom/google/android/gms/internal/ads/j;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/j;Lcom/google/android/gms/internal/ads/i;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/PK0;->b:Lcom/google/android/gms/internal/ads/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/Os;)V
    .locals 3

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/ads/oK0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/oK0;-><init>()V

    iget v1, p1, Lcom/google/android/gms/internal/ads/Os;->a:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/oK0;->G(I)Lcom/google/android/gms/internal/ads/oK0;

    iget v1, p1, Lcom/google/android/gms/internal/ads/Os;->b:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/oK0;->k(I)Lcom/google/android/gms/internal/ads/oK0;

    const-string v1, "video/raw"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/oK0;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/oK0;->H()Lcom/google/android/gms/internal/ads/D;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/PK0;->a:Lcom/google/android/gms/internal/ads/D;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/PK0;->b:Lcom/google/android/gms/internal/ads/j;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/j;->j(Lcom/google/android/gms/internal/ads/j;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/e;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/PK0;->b:Lcom/google/android/gms/internal/ads/j;

    invoke-interface {v1, v2, p1}, Lcom/google/android/gms/internal/ads/e;->f(Lcom/google/android/gms/internal/ads/j;Lcom/google/android/gms/internal/ads/Os;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final b(JJZ)V
    .locals 7

    .prologue
    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/PK0;->b:Lcom/google/android/gms/internal/ads/j;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/j;->a(Lcom/google/android/gms/internal/ads/j;)Landroid/util/Pair;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/j;->j(Lcom/google/android/gms/internal/ads/j;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/ads/e;

    iget-object p5, p0, Lcom/google/android/gms/internal/ads/PK0;->b:Lcom/google/android/gms/internal/ads/j;

    invoke-interface {p2, p5}, Lcom/google/android/gms/internal/ads/e;->e(Lcom/google/android/gms/internal/ads/j;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/PK0;->b:Lcom/google/android/gms/internal/ads/j;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/j;->e(Lcom/google/android/gms/internal/ads/j;)Lcom/google/android/gms/internal/ads/k;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/PK0;->a:Lcom/google/android/gms/internal/ads/D;

    if-nez p1, :cond_1

    new-instance p1, Lcom/google/android/gms/internal/ads/oK0;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/oK0;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/oK0;->H()Lcom/google/android/gms/internal/ads/D;

    move-result-object p1

    :cond_1
    move-object v5, p1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/PK0;->b:Lcom/google/android/gms/internal/ads/j;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/j;->e(Lcom/google/android/gms/internal/ads/j;)Lcom/google/android/gms/internal/ads/k;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/j;->d(Lcom/google/android/gms/internal/ads/j;)Lcom/google/android/gms/internal/ads/mD;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/mD;->c()J

    move-result-wide v3

    const/4 v6, 0x0

    move-wide v1, p3

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/k;->a(JJLcom/google/android/gms/internal/ads/D;Landroid/media/MediaFormat;)V

    :cond_2
    const/4 p1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/LC;->b(Ljava/lang/Object;)Ljava/lang/Object;

    throw p1
.end method
