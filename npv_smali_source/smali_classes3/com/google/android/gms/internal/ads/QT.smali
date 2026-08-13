.class public final Lcom/google/android/gms/internal/ads/QT;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Bb0;

.field private final b:Lcom/google/android/gms/internal/ads/Db0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Bb0;Lcom/google/android/gms/internal/ads/Db0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/QT;->a:Lcom/google/android/gms/internal/ads/Bb0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/QT;->b:Lcom/google/android/gms/internal/ads/Db0;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/Bb0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/QT;->a:Lcom/google/android/gms/internal/ads/Bb0;

    return-object v0
.end method

.method public final b()Z
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/QT;->b:Lcom/google/android/gms/internal/ads/Db0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Db0;->d()Lcom/google/android/gms/internal/ads/Eb0;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/Eb0;->D:Lcom/google/android/gms/internal/ads/Eb0;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
