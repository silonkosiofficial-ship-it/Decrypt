.class public final synthetic Lcom/google/android/gms/internal/ads/rW;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/pg0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/Ot;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/R60;

.field public final synthetic c:Lcom/google/android/gms/internal/ads/gM;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/xW;Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/gM;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/rW;->a:Lcom/google/android/gms/internal/ads/Ot;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/rW;->b:Lcom/google/android/gms/internal/ads/R60;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/rW;->c:Lcom/google/android/gms/internal/ads/gM;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/rW;->a:Lcom/google/android/gms/internal/ads/Ot;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rW;->b:Lcom/google/android/gms/internal/ads/R60;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/R60;->M:Z

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->j0()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rW;->c:Lcom/google/android/gms/internal/ads/gM;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->I0()V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->onPause()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/gM;->k()Lcom/google/android/gms/internal/ads/fM;

    move-result-object p1

    return-object p1
.end method
