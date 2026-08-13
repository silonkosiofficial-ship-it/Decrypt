.class public final synthetic Lcom/google/android/gms/internal/ads/GK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/RK;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/RK;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/GK;->a:Lcom/google/android/gms/internal/ads/RK;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/GK;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/GK;->a:Lcom/google/android/gms/internal/ads/RK;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/GK;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/RK;->c(Ljava/lang/String;Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1
.end method
