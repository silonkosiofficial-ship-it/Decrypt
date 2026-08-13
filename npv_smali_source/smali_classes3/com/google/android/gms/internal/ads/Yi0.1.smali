.class final Lcom/google/android/gms/internal/ads/Yi0;
.super Lcom/google/android/gms/internal/ads/bh0;
.source "SourceFile"


# instance fields
.field final E:Ljava/util/Iterator;

.field final synthetic F:Ljava/util/Set;

.field final synthetic G:Ljava/util/Set;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Zi0;Ljava/util/Set;Ljava/util/Set;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Yi0;->F:Ljava/util/Set;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Yi0;->G:Ljava/util/Set;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/bh0;-><init>()V

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Yi0;->E:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method protected final a()Ljava/lang/Object;
    .locals 2

    .prologue
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Yi0;->E:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Yi0;->E:Ljava/util/Iterator;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Yi0;->G:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/bh0;->b()Ljava/lang/Object;

    const/4 v0, 0x0

    return-object v0
.end method
