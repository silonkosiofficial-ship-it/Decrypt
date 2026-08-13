.class public final synthetic Lcom/google/android/gms/internal/ads/u4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/rF;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/v4;

.field public final synthetic b:J

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/v4;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/u4;->a:Lcom/google/android/gms/internal/ads/v4;

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/u4;->b:J

    iput p4, p0, Lcom/google/android/gms/internal/ads/u4;->c:I

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u4;->a:Lcom/google/android/gms/internal/ads/v4;

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/u4;->b:J

    iget v3, p0, Lcom/google/android/gms/internal/ads/u4;->c:I

    check-cast p1, Lcom/google/android/gms/internal/ads/j4;

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/google/android/gms/internal/ads/v4;->h(JILcom/google/android/gms/internal/ads/j4;)V

    return-void
.end method
