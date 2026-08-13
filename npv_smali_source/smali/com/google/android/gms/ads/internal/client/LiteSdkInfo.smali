.class public Lcom/google/android/gms/ads/internal/client/LiteSdkInfo;
.super Ls3/r0;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ls3/r0;-><init>()V

    return-void
.end method


# virtual methods
.method public getAdapterCreator()Lcom/google/android/gms/internal/ads/Vl;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/Rl;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Rl;-><init>()V

    return-object v0
.end method

.method public getLiteSdkVersion()Ls3/t1;
    .locals 4

    new-instance v0, Ls3/t1;

    const v1, 0xe91675b

    const v2, 0xe916690

    const-string v3, "23.6.0"

    invoke-direct {v0, v1, v2, v3}, Ls3/t1;-><init>(IILjava/lang/String;)V

    return-object v0
.end method
