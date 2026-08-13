.class public final synthetic Lcom/google/android/gms/internal/ads/dP;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/pP;

.field public final synthetic D:Lcom/google/android/gms/internal/ads/mr;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/pP;Lcom/google/android/gms/internal/ads/mr;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/dP;->C:Lcom/google/android/gms/internal/ads/pP;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/dP;->D:Lcom/google/android/gms/internal/ads/mr;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dP;->C:Lcom/google/android/gms/internal/ads/pP;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/dP;->D:Lcom/google/android/gms/internal/ads/mr;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/pP;->o(Lcom/google/android/gms/internal/ads/mr;)V

    return-void
.end method
