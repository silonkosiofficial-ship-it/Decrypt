.class public final Lcom/google/android/gms/internal/ads/gB;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls3/a;


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/lB;

.field private final D:Lcom/google/android/gms/internal/ads/n70;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/lB;Lcom/google/android/gms/internal/ads/n70;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gB;->C:Lcom/google/android/gms/internal/ads/lB;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/gB;->D:Lcom/google/android/gms/internal/ads/n70;

    return-void
.end method


# virtual methods
.method public final e0()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gB;->D:Lcom/google/android/gms/internal/ads/n70;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/gB;->C:Lcom/google/android/gms/internal/ads/lB;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/n70;->f:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/lB;->c(Ljava/lang/String;)V

    return-void
.end method
