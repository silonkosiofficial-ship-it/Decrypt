.class final Lcom/google/android/gms/internal/ads/JA;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Jk0;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/LA;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/LA;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/JA;->a:Lcom/google/android/gms/internal/ads/LA;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/JA;->a:Lcom/google/android/gms/internal/ads/LA;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/LA;->b(Lcom/google/android/gms/internal/ads/LA;)Lcom/google/android/gms/internal/ads/sF;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/sF;->O(Z)V

    return-void
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/Po;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/JA;->a:Lcom/google/android/gms/internal/ads/LA;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/LA;->b(Lcom/google/android/gms/internal/ads/LA;)Lcom/google/android/gms/internal/ads/sF;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/sF;->O(Z)V

    return-void
.end method
