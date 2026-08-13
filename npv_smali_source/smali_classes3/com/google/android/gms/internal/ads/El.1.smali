.class public final synthetic Lcom/google/android/gms/internal/ads/El;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/gj;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/El;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/El;->b:Lcom/google/android/gms/internal/ads/gj;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/il;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/El;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/El;->b:Lcom/google/android/gms/internal/ads/gj;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/il;->W(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1
.end method
