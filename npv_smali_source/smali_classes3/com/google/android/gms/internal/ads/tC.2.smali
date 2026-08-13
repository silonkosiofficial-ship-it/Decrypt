.class public final Lcom/google/android/gms/internal/ads/tC;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/nC;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/nC;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/tC;->a:Lcom/google/android/gms/internal/ads/nC;

    return-void
.end method


# virtual methods
.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tC;->a:Lcom/google/android/gms/internal/ads/nC;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/nC;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
