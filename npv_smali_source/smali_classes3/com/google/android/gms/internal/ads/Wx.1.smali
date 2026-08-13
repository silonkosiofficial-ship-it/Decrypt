.class final Lcom/google/android/gms/internal/ads/Wx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Jk0;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/google/android/gms/internal/ads/Xx;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Xx;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Wx;->a:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Wx;->b:Lcom/google/android/gms/internal/ads/Xx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 8

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Wx;->b:Lcom/google/android/gms/internal/ads/Xx;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Xx;->o(Lcom/google/android/gms/internal/ads/Xx;)Lcom/google/android/gms/internal/ads/z70;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Xx;->r(Lcom/google/android/gms/internal/ads/Xx;)Lcom/google/android/gms/internal/ads/Fa0;

    move-result-object v1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Xx;->k(Lcom/google/android/gms/internal/ads/Xx;)Lcom/google/android/gms/internal/ads/e70;

    move-result-object v2

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Xx;->i(Lcom/google/android/gms/internal/ads/Xx;)Lcom/google/android/gms/internal/ads/R60;

    move-result-object v3

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Xx;->z(Lcom/google/android/gms/internal/ads/Xx;)Ljava/util/List;

    move-result-object v7

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/Wx;->a:Ljava/lang/String;

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/Fa0;->d(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/z70;->a(Ljava/util/List;)V

    return-void
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Wx;->b:Lcom/google/android/gms/internal/ads/Xx;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/Wx;->a:Ljava/lang/String;

    move-object v6, p1

    check-cast v6, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Xx;->o(Lcom/google/android/gms/internal/ads/Xx;)Lcom/google/android/gms/internal/ads/z70;

    move-result-object p1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Xx;->r(Lcom/google/android/gms/internal/ads/Xx;)Lcom/google/android/gms/internal/ads/Fa0;

    move-result-object v1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Xx;->k(Lcom/google/android/gms/internal/ads/Xx;)Lcom/google/android/gms/internal/ads/e70;

    move-result-object v2

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Xx;->i(Lcom/google/android/gms/internal/ads/Xx;)Lcom/google/android/gms/internal/ads/R60;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Xx;->z(Lcom/google/android/gms/internal/ads/Xx;)Ljava/util/List;

    move-result-object v7

    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/Fa0;->d(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/z70;->a(Ljava/util/List;)V

    return-void
.end method
