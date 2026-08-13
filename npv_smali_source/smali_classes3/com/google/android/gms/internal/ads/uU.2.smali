.class public final synthetic Lcom/google/android/gms/internal/ads/uU;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/xU;

.field public final synthetic D:Lcom/google/android/gms/internal/ads/Ot;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/xU;Lcom/google/android/gms/internal/ads/Ot;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/uU;->C:Lcom/google/android/gms/internal/ads/xU;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/uU;->D:Lcom/google/android/gms/internal/ads/Ot;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uU;->C:Lcom/google/android/gms/internal/ads/xU;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/uU;->D:Lcom/google/android/gms/internal/ads/Ot;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/xU;->d(Lcom/google/android/gms/internal/ads/Ot;)V

    return-void
.end method
