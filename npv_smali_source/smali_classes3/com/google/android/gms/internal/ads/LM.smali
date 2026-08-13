.class public final Lcom/google/android/gms/internal/ads/LM;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/LM;->a:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/KM;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/LM;->a:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Ot;

    new-instance v1, Lcom/google/android/gms/internal/ads/KM;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/KM;-><init>(Lcom/google/android/gms/internal/ads/Ot;)V

    return-object v1
.end method

.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/LM;->a()Lcom/google/android/gms/internal/ads/KM;

    move-result-object v0

    return-object v0
.end method
