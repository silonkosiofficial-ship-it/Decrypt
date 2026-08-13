.class final Lr3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zd0;


# instance fields
.field final synthetic a:Lr3/k;


# direct methods
.method constructor <init>(Lr3/k;)V
    .locals 0

    iput-object p1, p0, Lr3/j;->a:Lr3/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(IJLjava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lr3/j;->a:Lr3/k;

    invoke-static {v0}, Lr3/k;->j(Lr3/k;)Lcom/google/android/gms/internal/ads/Vc0;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long/2addr v1, p2

    invoke-virtual {v0, p1, v1, v2, p4}, Lcom/google/android/gms/internal/ads/Vc0;->e(IJLjava/lang/String;)Ll4/l;

    return-void
.end method

.method public final e(IJ)V
    .locals 3

    iget-object v0, p0, Lr3/j;->a:Lr3/k;

    invoke-static {v0}, Lr3/k;->j(Lr3/k;)Lcom/google/android/gms/internal/ads/Vc0;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long/2addr v1, p2

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/gms/internal/ads/Vc0;->d(IJ)Ll4/l;

    return-void
.end method
