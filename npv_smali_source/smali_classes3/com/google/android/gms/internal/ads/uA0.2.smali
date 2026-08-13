.class public final synthetic Lcom/google/android/gms/internal/ads/uA0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/aK;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/Q7;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Q7;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/uA0;->a:Lcom/google/android/gms/internal/ads/Q7;

    iput p2, p0, Lcom/google/android/gms/internal/ads/uA0;->b:I

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/Rh;

    sget v0, Lcom/google/android/gms/internal/ads/GA0;->V:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uA0;->a:Lcom/google/android/gms/internal/ads/Q7;

    iget v1, p0, Lcom/google/android/gms/internal/ads/uA0;->b:I

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/Rh;->X(Lcom/google/android/gms/internal/ads/Q7;I)V

    return-void
.end method
