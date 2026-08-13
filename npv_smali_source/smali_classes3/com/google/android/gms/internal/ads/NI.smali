.class public final synthetic Lcom/google/android/gms/internal/ads/NI;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/ZI;

.field public final synthetic D:Lcom/google/android/gms/internal/ads/eK;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/ZI;Lcom/google/android/gms/internal/ads/eK;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/NI;->C:Lcom/google/android/gms/internal/ads/ZI;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/NI;->D:Lcom/google/android/gms/internal/ads/eK;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/NI;->C:Lcom/google/android/gms/internal/ads/ZI;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/NI;->D:Lcom/google/android/gms/internal/ads/eK;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ZI;->f0(Lcom/google/android/gms/internal/ads/eK;)V

    return-void
.end method
