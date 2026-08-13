.class public final synthetic Lcom/google/android/gms/internal/ads/eA0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/aK;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/sB0;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/sB0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/eA0;->a:Lcom/google/android/gms/internal/ads/sB0;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/Rh;

    sget v0, Lcom/google/android/gms/internal/ads/GA0;->V:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eA0;->a:Lcom/google/android/gms/internal/ads/sB0;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/sB0;->g:Z

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/Rh;->P(Z)V

    return-void
.end method
