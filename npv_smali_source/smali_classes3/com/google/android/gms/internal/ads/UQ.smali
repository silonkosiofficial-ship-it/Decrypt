.class public final synthetic Lcom/google/android/gms/internal/ads/UQ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 1

    check-cast p1, Ljava/util/concurrent/TimeoutException;

    new-instance p1, Lcom/google/android/gms/internal/ads/oQ;

    const/4 v0, 0x5

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/oQ;-><init>(I)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->g(Ljava/lang/Throwable;)LP4/d;

    move-result-object p1

    return-object p1
.end method
