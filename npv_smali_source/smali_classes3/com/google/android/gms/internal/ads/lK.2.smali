.class public final Lcom/google/android/gms/internal/ads/lK;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/km;

.field private final b:Lcom/google/android/gms/internal/ads/hm;

.field private final c:Lcom/google/android/gms/internal/ads/gm;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/hm;Lcom/google/android/gms/internal/ads/gm;Lcom/google/android/gms/internal/ads/km;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/lK;->b:Lcom/google/android/gms/internal/ads/hm;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/lK;->c:Lcom/google/android/gms/internal/ads/gm;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/lK;->a:Lcom/google/android/gms/internal/ads/km;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/km;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lK;->a:Lcom/google/android/gms/internal/ads/km;

    return-object v0
.end method

.method public final b()Lcom/google/android/gms/internal/ads/gm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lK;->c:Lcom/google/android/gms/internal/ads/gm;

    return-object v0
.end method

.method public final c()Lcom/google/android/gms/internal/ads/hm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lK;->b:Lcom/google/android/gms/internal/ads/hm;

    return-object v0
.end method
