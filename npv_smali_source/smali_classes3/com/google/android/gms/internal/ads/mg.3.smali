.class public final Lcom/google/android/gms/internal/ads/mg;
.super Lcom/google/android/gms/internal/ads/lg;
.source "SourceFile"


# direct methods
.method protected constructor <init>(Ljava/lang/String;Ljava/lang/Object;I)V
    .locals 0

    const/4 p3, 0x1

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/lg;-><init>(Ljava/lang/String;Ljava/lang/Object;I)V

    return-void
.end method

.method public static f(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/lg;
    .locals 2

    new-instance p1, Lcom/google/android/gms/internal/ads/mg;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v1, 0x1

    invoke-direct {p1, p0, v0, v1}, Lcom/google/android/gms/internal/ads/mg;-><init>(Ljava/lang/String;Ljava/lang/Object;I)V

    return-object p1
.end method
