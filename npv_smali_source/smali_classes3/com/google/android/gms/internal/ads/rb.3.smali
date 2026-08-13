.class final Lcom/google/android/gms/internal/ads/rb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic C:Lcom/google/android/gms/internal/ads/sb;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/sb;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/rb;->C:Lcom/google/android/gms/internal/ads/sb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rb;->C:Lcom/google/android/gms/internal/ads/sb;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/sb;->b(Lcom/google/android/gms/internal/ads/sb;)V

    return-void
.end method
