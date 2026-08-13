.class final Lcom/google/android/gms/internal/ads/xl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/qr;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/bl;

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:Lcom/google/android/gms/internal/ads/mr;

.field final synthetic d:Lcom/google/android/gms/internal/ads/Al;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Al;Lcom/google/android/gms/internal/ads/bl;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/mr;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/xl;->a:Lcom/google/android/gms/internal/ads/bl;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/xl;->b:Ljava/lang/Object;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/xl;->c:Lcom/google/android/gms/internal/ads/mr;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/xl;->d:Lcom/google/android/gms/internal/ads/Al;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic b(Ljava/lang/Object;)V
    .locals 4

    check-cast p1, Lcom/google/android/gms/internal/ads/il;

    const-string v0, "callJs > getEngine: Promise fulfilled"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xl;->b:Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/xl;->c:Lcom/google/android/gms/internal/ads/mr;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/xl;->d:Lcom/google/android/gms/internal/ads/Al;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/xl;->a:Lcom/google/android/gms/internal/ads/bl;

    invoke-static {v2, v3, p1, v0, v1}, Lcom/google/android/gms/internal/ads/Al;->d(Lcom/google/android/gms/internal/ads/Al;Lcom/google/android/gms/internal/ads/bl;Lcom/google/android/gms/internal/ads/il;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/mr;)V

    return-void
.end method
