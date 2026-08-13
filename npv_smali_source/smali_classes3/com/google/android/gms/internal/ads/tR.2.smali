.class final Lcom/google/android/gms/internal/ads/tR;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/eE;


# instance fields
.field private final C:Landroid/content/Context;

.field private final D:Lcom/google/android/gms/internal/ads/pq;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/pq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/tR;->C:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/tR;->D:Lcom/google/android/gms/internal/ads/pq;

    return-void
.end method


# virtual methods
.method public final B(Lcom/google/android/gms/internal/ads/Po;)V
    .locals 0

    return-void
.end method

.method public final w0(Lcom/google/android/gms/internal/ads/e70;)V
    .locals 3

    .prologue
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/c70;->b:Lcom/google/android/gms/internal/ads/U60;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/U60;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tR;->D:Lcom/google/android/gms/internal/ads/pq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/tR;->C:Landroid/content/Context;

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/e70;->a:Lcom/google/android/gms/internal/ads/a70;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/a70;->a:Lcom/google/android/gms/internal/ads/n70;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/n70;->d:Ls3/X1;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/pq;->m(Landroid/content/Context;Ls3/X1;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tR;->D:Lcom/google/android/gms/internal/ads/pq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/tR;->C:Landroid/content/Context;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/c70;->b:Lcom/google/android/gms/internal/ads/U60;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/U60;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/pq;->i(Landroid/content/Context;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
