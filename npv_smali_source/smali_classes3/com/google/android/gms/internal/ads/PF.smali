.class public final Lcom/google/android/gms/internal/ads/PF;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/EF;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/EF;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/PF;->a:Lcom/google/android/gms/internal/ads/EF;

    return-void
.end method


# virtual methods
.method public final synthetic b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/PF;->a:Lcom/google/android/gms/internal/ads/EF;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/EF;->i()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method
