.class final Lcom/google/android/gms/internal/ads/Vj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/Nj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Zj;Lcom/google/android/gms/internal/ads/Nj;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Vj;->a:Lcom/google/android/gms/internal/ads/Nj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic b(Ljava/lang/Object;)LP4/d;
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/ads/Tj;

    new-instance v0, Lcom/google/android/gms/internal/ads/mr;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/mr;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/Uj;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/ads/Uj;-><init>(Lcom/google/android/gms/internal/ads/Vj;Lcom/google/android/gms/internal/ads/mr;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Vj;->a:Lcom/google/android/gms/internal/ads/Nj;

    invoke-virtual {p1, v2, v1}, Lcom/google/android/gms/internal/ads/Tj;->d2(Lcom/google/android/gms/internal/ads/Nj;Lcom/google/android/gms/internal/ads/Sj;)V

    return-object v0
.end method
