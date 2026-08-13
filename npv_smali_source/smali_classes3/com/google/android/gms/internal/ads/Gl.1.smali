.class public final synthetic Lcom/google/android/gms/internal/ads/Gl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/Il;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Il;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Gl;->a:Lcom/google/android/gms/internal/ads/Il;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Gl;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Gl;->a:Lcom/google/android/gms/internal/ads/Il;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Gl;->b:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/internal/ads/il;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/Il;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/il;)LP4/d;

    move-result-object p1

    return-object p1
.end method
