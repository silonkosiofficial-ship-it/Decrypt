.class final Lcom/google/android/gms/internal/ads/dd;
.super Lcom/google/android/gms/internal/ads/mr;
.source "SourceFile"


# instance fields
.field final synthetic D:Lcom/google/android/gms/internal/ads/kd;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/kd;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/dd;->D:Lcom/google/android/gms/internal/ads/kd;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/mr;-><init>()V

    return-void
.end method


# virtual methods
.method public final cancel(Z)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dd;->D:Lcom/google/android/gms/internal/ads/kd;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/kd;->e(Lcom/google/android/gms/internal/ads/kd;)V

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/mr;->cancel(Z)Z

    move-result p1

    return p1
.end method
