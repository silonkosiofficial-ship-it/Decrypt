.class final Lcom/google/android/gms/internal/ads/xB0;
.super Lcom/google/android/gms/internal/ads/yH0;
.source "SourceFile"


# instance fields
.field private final c:Lcom/google/android/gms/internal/ads/Ql;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/yB0;Lcom/google/android/gms/internal/ads/qm;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/yH0;-><init>(Lcom/google/android/gms/internal/ads/qm;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/Ql;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/Ql;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/xB0;->c:Lcom/google/android/gms/internal/ads/Ql;

    return-void
.end method


# virtual methods
.method public final d(ILcom/google/android/gms/internal/ads/pl;Z)Lcom/google/android/gms/internal/ads/pl;
    .locals 11

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yH0;->b:Lcom/google/android/gms/internal/ads/qm;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/qm;->d(ILcom/google/android/gms/internal/ads/pl;Z)Lcom/google/android/gms/internal/ads/pl;

    move-result-object p1

    iget p3, p1, Lcom/google/android/gms/internal/ads/pl;->c:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xB0;->c:Lcom/google/android/gms/internal/ads/Ql;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/yH0;->b:Lcom/google/android/gms/internal/ads/qm;

    const-wide/16 v2, 0x0

    invoke-virtual {v1, p3, v0, v2, v3}, Lcom/google/android/gms/internal/ads/qm;->e(ILcom/google/android/gms/internal/ads/Ql;J)Lcom/google/android/gms/internal/ads/Ql;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/Ql;->b()Z

    move-result p3

    if-eqz p3, :cond_0

    iget-object v2, p2, Lcom/google/android/gms/internal/ads/pl;->a:Ljava/lang/Object;

    iget-object v3, p2, Lcom/google/android/gms/internal/ads/pl;->b:Ljava/lang/Object;

    iget v4, p2, Lcom/google/android/gms/internal/ads/pl;->c:I

    iget-wide v5, p2, Lcom/google/android/gms/internal/ads/pl;->d:J

    sget-object v9, Lcom/google/android/gms/internal/ads/Cc;->e:Lcom/google/android/gms/internal/ads/Cc;

    const/4 v10, 0x1

    const-wide/16 v7, 0x0

    move-object v1, p1

    invoke-virtual/range {v1 .. v10}, Lcom/google/android/gms/internal/ads/pl;->i(Ljava/lang/Object;Ljava/lang/Object;IJJLcom/google/android/gms/internal/ads/Cc;Z)Lcom/google/android/gms/internal/ads/pl;

    goto :goto_0

    :cond_0
    const/4 p2, 0x1

    iput-boolean p2, p1, Lcom/google/android/gms/internal/ads/pl;->f:Z

    :goto_0
    return-object p1
.end method
