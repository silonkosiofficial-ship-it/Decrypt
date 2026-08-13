.class public final synthetic Lcom/google/android/gms/internal/ads/Cf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/Hf0;

.field public final synthetic D:Lcom/google/android/gms/internal/ads/Jf0;

.field public final synthetic E:Lcom/google/android/gms/internal/ads/Nf0;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Hf0;Lcom/google/android/gms/internal/ads/Jf0;Lcom/google/android/gms/internal/ads/Nf0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Cf0;->C:Lcom/google/android/gms/internal/ads/Hf0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Cf0;->D:Lcom/google/android/gms/internal/ads/Jf0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Cf0;->E:Lcom/google/android/gms/internal/ads/Nf0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Cf0;->C:Lcom/google/android/gms/internal/ads/Hf0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Cf0;->D:Lcom/google/android/gms/internal/ads/Jf0;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Cf0;->E:Lcom/google/android/gms/internal/ads/Nf0;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Hf0;->d(Lcom/google/android/gms/internal/ads/Jf0;Lcom/google/android/gms/internal/ads/Nf0;)V

    return-void
.end method
