.class public final synthetic Lcom/google/android/gms/internal/ads/L90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Y80;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/E90;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/E90;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/L90;->a:Lcom/google/android/gms/internal/ads/E90;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/vg;->c:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/L90;->a:Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/E90;->h()Lcom/google/android/gms/internal/ads/E90;

    :cond_0
    return-object p1
.end method
