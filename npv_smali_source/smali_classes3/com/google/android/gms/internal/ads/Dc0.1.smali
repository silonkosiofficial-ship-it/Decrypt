.class final Lcom/google/android/gms/internal/ads/Dc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic C:Lcom/google/android/gms/internal/ads/Gc0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Gc0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Dc0;->C:Lcom/google/android/gms/internal/ads/Gc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Dc0;->C:Lcom/google/android/gms/internal/ads/Gc0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Gc0;->c(Lcom/google/android/gms/internal/ads/Gc0;)Lcom/google/android/gms/internal/ads/Cc0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Cc0;->b()V

    return-void
.end method
