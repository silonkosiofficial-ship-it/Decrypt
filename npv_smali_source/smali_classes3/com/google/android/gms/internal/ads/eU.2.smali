.class public final synthetic Lcom/google/android/gms/internal/ads/eU;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/GM;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/GM;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/eU;->C:Lcom/google/android/gms/internal/ads/GM;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eU;->C:Lcom/google/android/gms/internal/ads/GM;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/GM;->b()V

    return-void
.end method
