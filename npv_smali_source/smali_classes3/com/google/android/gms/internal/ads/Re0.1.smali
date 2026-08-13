.class public final synthetic Lcom/google/android/gms/internal/ads/Re0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/f;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/Se0;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Se0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Re0;->a:Lcom/google/android/gms/internal/ads/Se0;

    return-void
.end method


# virtual methods
.method public final a(Ll4/l;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Re0;->a:Lcom/google/android/gms/internal/ads/Se0;

    invoke-virtual {p1}, Ll4/l;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/ak0;->cancel(Z)Z

    return-void

    :cond_0
    invoke-virtual {p1}, Ll4/l;->o()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ll4/l;->l()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Se0;->f(Ljava/lang/Object;)Z

    return-void

    :cond_1
    invoke-virtual {p1}, Ll4/l;->k()Ljava/lang/Exception;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Se0;->h(Ljava/lang/Throwable;)Z

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method
