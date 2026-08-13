.class public final synthetic Lcom/google/android/gms/internal/ads/el;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/fl;

.field public final synthetic D:Lcom/google/android/gms/internal/ads/Bk;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/fl;Lcom/google/android/gms/internal/ads/Bk;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/el;->C:Lcom/google/android/gms/internal/ads/fl;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/el;->D:Lcom/google/android/gms/internal/ads/Bk;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/el;->D:Lcom/google/android/gms/internal/ads/Bk;

    const-string v1, "/result"

    sget-object v2, Lcom/google/android/gms/internal/ads/fj;->o:Lcom/google/android/gms/internal/ads/xj;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/il;->q0(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Bk;->c()V

    return-void
.end method
