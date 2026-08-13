.class final Lcom/google/android/gms/internal/ads/UF0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/XF0;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/D;)I
    .locals 0

    .prologue
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/D;->s:Lcom/google/android/gms/internal/ads/EH0;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final synthetic b(Lcom/google/android/gms/internal/ads/SF0;Lcom/google/android/gms/internal/ads/D;)Lcom/google/android/gms/internal/ads/WF0;
    .locals 0

    sget-object p1, Lcom/google/android/gms/internal/ads/WF0;->a:Lcom/google/android/gms/internal/ads/WF0;

    return-object p1
.end method

.method public final c(Lcom/google/android/gms/internal/ads/SF0;Lcom/google/android/gms/internal/ads/D;)Lcom/google/android/gms/internal/ads/YF0;
    .locals 2

    .prologue
    iget-object p1, p2, Lcom/google/android/gms/internal/ads/D;->s:Lcom/google/android/gms/internal/ads/EH0;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/YF0;

    new-instance p2, Lcom/google/android/gms/internal/ads/PF0;

    new-instance v0, Lcom/google/android/gms/internal/ads/aG0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/aG0;-><init>(I)V

    const/16 v1, 0x1771

    invoke-direct {p2, v0, v1}, Lcom/google/android/gms/internal/ads/PF0;-><init>(Ljava/lang/Throwable;I)V

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/YF0;-><init>(Lcom/google/android/gms/internal/ads/PF0;)V

    return-object p1
.end method
