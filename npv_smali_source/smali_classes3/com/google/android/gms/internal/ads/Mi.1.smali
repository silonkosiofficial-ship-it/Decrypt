.class final Lcom/google/android/gms/internal/ads/Mi;
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
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/Ot;

    invoke-static {}, Lr3/v;->n()Lu3/H;

    move-result-object p2

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lu3/H;->a(Lcom/google/android/gms/internal/ads/Ot;Landroid/content/Context;)V

    return-void
.end method
