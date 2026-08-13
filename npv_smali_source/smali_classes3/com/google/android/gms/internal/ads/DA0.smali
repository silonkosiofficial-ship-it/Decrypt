.class final Lcom/google/android/gms/internal/ads/DA0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/fB0;


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Lcom/google/android/gms/internal/ads/qm;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/GH0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/DA0;->a:Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/GH0;->G()Lcom/google/android/gms/internal/ads/qm;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/DA0;->b:Lcom/google/android/gms/internal/ads/qm;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/qm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/DA0;->b:Lcom/google/android/gms/internal/ads/qm;

    return-object v0
.end method

.method public final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/DA0;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final c(Lcom/google/android/gms/internal/ads/qm;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/DA0;->b:Lcom/google/android/gms/internal/ads/qm;

    return-void
.end method
