.class final Lcom/google/android/gms/internal/ads/aj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/gj;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 0

    .prologue
    check-cast p1, Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->b0()Lcom/google/android/gms/internal/ads/ch;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ch;->c()V

    :cond_0
    return-void
.end method
