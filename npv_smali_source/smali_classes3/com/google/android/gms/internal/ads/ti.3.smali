.class public final Lcom/google/android/gms/internal/ads/ti;
.super Lcom/google/android/gms/internal/ads/bi;
.source "SourceFile"


# instance fields
.field private final C:Ln3/o;


# direct methods
.method public constructor <init>(Ln3/o;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/bi;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ti;->C:Ln3/o;

    return-void
.end method


# virtual methods
.method public final N3(Lcom/google/android/gms/internal/ads/ki;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/li;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/li;-><init>(Lcom/google/android/gms/internal/ads/ki;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ti;->C:Ln3/o;

    invoke-interface {p1, v0}, Ln3/o;->b(Ln3/g;)V

    return-void
.end method
