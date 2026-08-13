.class public final synthetic Lcom/google/android/gms/internal/ads/GT;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/Nb0;

.field public final synthetic D:Lcom/google/android/gms/internal/ads/iu;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Nb0;Lcom/google/android/gms/internal/ads/iu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/GT;->C:Lcom/google/android/gms/internal/ads/Nb0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/GT;->D:Lcom/google/android/gms/internal/ads/iu;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/GT;->C:Lcom/google/android/gms/internal/ads/Nb0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/GT;->D:Lcom/google/android/gms/internal/ads/iu;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Nb0;->g(Lcom/google/android/gms/internal/ads/iu;)V

    return-void
.end method
