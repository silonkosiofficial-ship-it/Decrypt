.class public final synthetic Lcom/google/android/gms/internal/ads/NK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:LP4/d;


# direct methods
.method public synthetic constructor <init>(LP4/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/NK;->a:LP4/d;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 2

    .prologue
    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/NK;->a:LP4/d;

    return-object p1

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/XV;

    const/4 v0, 0x1

    const-string v1, "Retrieve required value in native ad response failed."

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/XV;-><init>(ILjava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->g(Ljava/lang/Throwable;)LP4/d;

    move-result-object p1

    return-object p1
.end method
