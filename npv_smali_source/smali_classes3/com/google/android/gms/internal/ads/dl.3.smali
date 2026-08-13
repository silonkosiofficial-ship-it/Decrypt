.class final Lcom/google/android/gms/internal/ads/dl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/or;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/bl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/gl;Lcom/google/android/gms/internal/ads/bl;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/dl;->a:Lcom/google/android/gms/internal/ads/bl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    const-string v0, "Rejecting reference for JS Engine."

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->B7:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dl;->a:Lcom/google/android/gms/internal/ads/bl;

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Unable to create JS engine reference."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    const-string v2, "SdkJavascriptFactory.createNewReference.FailureCallback"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/tr;->d(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dl;->a:Lcom/google/android/gms/internal/ads/bl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/tr;->c()V

    return-void
.end method
