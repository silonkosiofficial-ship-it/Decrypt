.class public final synthetic Lcom/google/android/gms/internal/ads/tQ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/Po;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Po;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/tQ;->a:Lcom/google/android/gms/internal/ads/Po;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 2

    check-cast p1, Ljava/io/InputStream;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tQ;->a:Lcom/google/android/gms/internal/ads/Po;

    new-instance v1, Lcom/google/android/gms/internal/ads/BR;

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/internal/ads/BR;-><init>(Ljava/io/InputStream;Lcom/google/android/gms/internal/ads/Po;)V

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1
.end method
