.class public Lcom/google/android/gms/internal/ads/Xy;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/dA;

.field private final b:Landroid/view/View;

.field private final c:Lcom/google/android/gms/internal/ads/S60;

.field private final d:Lcom/google/android/gms/internal/ads/Ot;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/dA;Lcom/google/android/gms/internal/ads/S60;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Xy;->b:Landroid/view/View;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Xy;->d:Lcom/google/android/gms/internal/ads/Ot;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Xy;->a:Lcom/google/android/gms/internal/ads/dA;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/Xy;->c:Lcom/google/android/gms/internal/ads/S60;

    return-void
.end method


# virtual methods
.method public final a()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xy;->b:Landroid/view/View;

    return-object v0
.end method

.method public final b()Lcom/google/android/gms/internal/ads/Ot;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xy;->d:Lcom/google/android/gms/internal/ads/Ot;

    return-object v0
.end method

.method public final c()Lcom/google/android/gms/internal/ads/dA;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xy;->a:Lcom/google/android/gms/internal/ads/dA;

    return-object v0
.end method

.method public d(Ljava/util/Set;)Lcom/google/android/gms/internal/ads/sD;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/sD;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/sD;-><init>(Ljava/util/Set;)V

    return-object v0
.end method

.method public final e()Lcom/google/android/gms/internal/ads/S60;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xy;->c:Lcom/google/android/gms/internal/ads/S60;

    return-object v0
.end method
