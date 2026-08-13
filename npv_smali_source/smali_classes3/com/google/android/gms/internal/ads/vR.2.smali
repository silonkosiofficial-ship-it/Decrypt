.class public final synthetic Lcom/google/android/gms/internal/ads/vR;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/rz0;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/Po;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/Po;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/vR;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/vR;->b:Lcom/google/android/gms/internal/ads/Po;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/oQ;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/vR;->a:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zR;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vR;->b:Lcom/google/android/gms/internal/ads/Po;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zR;->a(Lcom/google/android/gms/internal/ads/Po;)LP4/d;

    move-result-object p1

    return-object p1
.end method
