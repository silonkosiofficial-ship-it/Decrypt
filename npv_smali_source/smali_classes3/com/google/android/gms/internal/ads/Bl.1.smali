.class public final synthetic Lcom/google/android/gms/internal/ads/Bl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/pg0;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/gj;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Bl;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Bl;->b:Lcom/google/android/gms/internal/ads/gj;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/il;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Bl;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Bl;->b:Lcom/google/android/gms/internal/ads/gj;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/il;->q0(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    return-object p1
.end method
