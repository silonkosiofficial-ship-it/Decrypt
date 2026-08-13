.class public abstract Lcom/google/android/gms/internal/ads/sg;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "gads:consent:gmscore:dsid:enabled"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/mg;->f(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/lg;

    const-string v0, "gads:consent:gmscore:lat:enabled"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/mg;->f(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/lg;

    const-string v0, "gads:consent:gmscore:enabled"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/mg;->f(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/lg;

    return-void
.end method
