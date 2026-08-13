.class public final synthetic Lcom/google/android/gms/internal/ads/FC0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/aK;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/LB0;

.field public final synthetic b:I

.field public final synthetic c:Lcom/google/android/gms/internal/ads/ri;

.field public final synthetic d:Lcom/google/android/gms/internal/ads/ri;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/LB0;ILcom/google/android/gms/internal/ads/ri;Lcom/google/android/gms/internal/ads/ri;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/FC0;->a:Lcom/google/android/gms/internal/ads/LB0;

    iput p2, p0, Lcom/google/android/gms/internal/ads/FC0;->b:I

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/FC0;->c:Lcom/google/android/gms/internal/ads/ri;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/FC0;->d:Lcom/google/android/gms/internal/ads/ri;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 4

    check-cast p1, Lcom/google/android/gms/internal/ads/NB0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/FC0;->a:Lcom/google/android/gms/internal/ads/LB0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/FC0;->d:Lcom/google/android/gms/internal/ads/ri;

    iget v2, p0, Lcom/google/android/gms/internal/ads/FC0;->b:I

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/FC0;->c:Lcom/google/android/gms/internal/ads/ri;

    invoke-interface {p1, v0, v3, v1, v2}, Lcom/google/android/gms/internal/ads/NB0;->k(Lcom/google/android/gms/internal/ads/LB0;Lcom/google/android/gms/internal/ads/ri;Lcom/google/android/gms/internal/ads/ri;I)V

    return-void
.end method
