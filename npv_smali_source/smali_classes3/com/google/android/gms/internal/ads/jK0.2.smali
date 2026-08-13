.class final Lcom/google/android/gms/internal/ads/jK0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/iK0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/iK0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/jK0;->C:Lcom/google/android/gms/internal/ads/iK0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jK0;->C:Lcom/google/android/gms/internal/ads/iK0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/iK0;->P()V

    return-void
.end method
