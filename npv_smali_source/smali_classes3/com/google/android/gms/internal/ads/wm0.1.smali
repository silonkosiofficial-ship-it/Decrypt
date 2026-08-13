.class public final Lcom/google/android/gms/internal/ads/wm0;
.super Lcom/google/android/gms/internal/ads/bm0;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Dm0;

.field private final b:Lcom/google/android/gms/internal/ads/Mu0;

.field private final c:Lcom/google/android/gms/internal/ads/Lu0;

.field private final d:Ljava/lang/Integer;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Dm0;Lcom/google/android/gms/internal/ads/Mu0;Lcom/google/android/gms/internal/ads/Lu0;Ljava/lang/Integer;Lcom/google/android/gms/internal/ads/vm0;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/bm0;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wm0;->a:Lcom/google/android/gms/internal/ads/Dm0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/wm0;->b:Lcom/google/android/gms/internal/ads/Mu0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/wm0;->c:Lcom/google/android/gms/internal/ads/Lu0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/wm0;->d:Ljava/lang/Integer;

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/ads/um0;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/um0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/um0;-><init>(Lcom/google/android/gms/internal/ads/vm0;)V

    return-object v0
.end method


# virtual methods
.method public final b()Lcom/google/android/gms/internal/ads/Dm0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wm0;->a:Lcom/google/android/gms/internal/ads/Dm0;

    return-object v0
.end method

.method public final c()Lcom/google/android/gms/internal/ads/Lu0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wm0;->c:Lcom/google/android/gms/internal/ads/Lu0;

    return-object v0
.end method

.method public final d()Lcom/google/android/gms/internal/ads/Mu0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wm0;->b:Lcom/google/android/gms/internal/ads/Mu0;

    return-object v0
.end method

.method public final e()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wm0;->d:Ljava/lang/Integer;

    return-object v0
.end method
