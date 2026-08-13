.class public final Lcom/google/android/gms/internal/ads/XD0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/NB0;
.implements Lcom/google/android/gms/internal/ads/YD0;


# instance fields
.field private final C:Landroid/content/Context;

.field private final D:Lcom/google/android/gms/internal/ads/ZD0;

.field private final E:Landroid/media/metrics/PlaybackSession;

.field private final F:J

.field private final G:Lcom/google/android/gms/internal/ads/Ql;

.field private final H:Lcom/google/android/gms/internal/ads/pl;

.field private final I:Ljava/util/HashMap;

.field private final J:Ljava/util/HashMap;

.field private K:Ljava/lang/String;

.field private L:Landroid/media/metrics/PlaybackMetrics$Builder;

.field private M:I

.field private N:I

.field private O:I

.field private P:Lcom/google/android/gms/internal/ads/Pf;

.field private Q:Lcom/google/android/gms/internal/ads/VC0;

.field private R:Lcom/google/android/gms/internal/ads/VC0;

.field private S:Lcom/google/android/gms/internal/ads/VC0;

.field private T:Lcom/google/android/gms/internal/ads/D;

.field private U:Lcom/google/android/gms/internal/ads/D;

.field private V:Lcom/google/android/gms/internal/ads/D;

.field private W:Z

.field private X:Z

.field private Y:I

.field private Z:I

.field private a0:I

.field private b0:Z


# direct methods
.method private constructor <init>(Landroid/content/Context;Landroid/media/metrics/PlaybackSession;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/XD0;->C:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/XD0;->E:Landroid/media/metrics/PlaybackSession;

    new-instance p1, Lcom/google/android/gms/internal/ads/Ql;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/Ql;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/XD0;->G:Lcom/google/android/gms/internal/ads/Ql;

    new-instance p1, Lcom/google/android/gms/internal/ads/pl;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/pl;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/XD0;->H:Lcom/google/android/gms/internal/ads/pl;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/XD0;->J:Ljava/util/HashMap;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/XD0;->I:Ljava/util/HashMap;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/XD0;->F:J

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/gms/internal/ads/XD0;->N:I

    iput p1, p0, Lcom/google/android/gms/internal/ads/XD0;->O:I

    new-instance p1, Lcom/google/android/gms/internal/ads/UC0;

    sget-object p2, Lcom/google/android/gms/internal/ads/UC0;->h:Lcom/google/android/gms/internal/ads/Tg0;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/UC0;-><init>(Lcom/google/android/gms/internal/ads/Tg0;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/XD0;->D:Lcom/google/android/gms/internal/ads/ZD0;

    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/ads/ZD0;->g(Lcom/google/android/gms/internal/ads/YD0;)V

    return-void
.end method

.method public static q(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/XD0;
    .locals 2

    .prologue
    const-string v0, "media_metrics"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/WC0;->a(Ljava/lang/Object;)Landroid/media/metrics/MediaMetricsManager;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/ads/XD0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/hD0;->a(Landroid/media/metrics/MediaMetricsManager;)Landroid/media/metrics/PlaybackSession;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/ads/XD0;-><init>(Landroid/content/Context;Landroid/media/metrics/PlaybackSession;)V

    return-object v1
.end method

.method private static r(I)I
    .locals 0

    .prologue
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/EW;->D(I)I

    move-result p0

    packed-switch p0, :pswitch_data_0

    const/16 p0, 0x1b

    return p0

    :pswitch_0
    const/16 p0, 0x1a

    return p0

    :pswitch_1
    const/16 p0, 0x19

    return p0

    :pswitch_2
    const/16 p0, 0x1c

    return p0

    :pswitch_3
    const/16 p0, 0x18

    return p0

    :pswitch_data_0
    .packed-switch 0x1772
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final s()V
    .locals 7

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/XD0;->L:Landroid/media/metrics/PlaybackMetrics$Builder;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/XD0;->b0:Z

    if-eqz v2, :cond_3

    iget v2, p0, Lcom/google/android/gms/internal/ads/XD0;->a0:I

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/GD0;->a(Landroid/media/metrics/PlaybackMetrics$Builder;I)Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/XD0;->L:Landroid/media/metrics/PlaybackMetrics$Builder;

    iget v2, p0, Lcom/google/android/gms/internal/ads/XD0;->Y:I

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/HD0;->a(Landroid/media/metrics/PlaybackMetrics$Builder;I)Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/XD0;->L:Landroid/media/metrics/PlaybackMetrics$Builder;

    iget v2, p0, Lcom/google/android/gms/internal/ads/XD0;->Z:I

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/ID0;->a(Landroid/media/metrics/PlaybackMetrics$Builder;I)Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/XD0;->I:Ljava/util/HashMap;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/XD0;->K:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/XD0;->L:Landroid/media/metrics/PlaybackMetrics$Builder;

    const-wide/16 v3, 0x0

    if-nez v0, :cond_0

    move-wide v5, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    :goto_0
    invoke-static {v2, v5, v6}, Lcom/google/android/gms/internal/ads/JD0;->a(Landroid/media/metrics/PlaybackMetrics$Builder;J)Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/XD0;->J:Ljava/util/HashMap;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/XD0;->K:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/XD0;->L:Landroid/media/metrics/PlaybackMetrics$Builder;

    if-nez v0, :cond_1

    move-wide v5, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    :goto_1
    invoke-static {v2, v5, v6}, Lcom/google/android/gms/internal/ads/KD0;->a(Landroid/media/metrics/PlaybackMetrics$Builder;J)Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/XD0;->L:Landroid/media/metrics/PlaybackMetrics$Builder;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v0, v5, v3

    if-lez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/LD0;->a(Landroid/media/metrics/PlaybackMetrics$Builder;I)Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/XD0;->E:Landroid/media/metrics/PlaybackSession;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/XD0;->L:Landroid/media/metrics/PlaybackMetrics$Builder;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/MD0;->a(Landroid/media/metrics/PlaybackMetrics$Builder;)Landroid/media/metrics/PlaybackMetrics;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/ND0;->a(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/PlaybackMetrics;)V

    :cond_3
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/XD0;->L:Landroid/media/metrics/PlaybackMetrics$Builder;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/XD0;->K:Ljava/lang/String;

    iput v1, p0, Lcom/google/android/gms/internal/ads/XD0;->a0:I

    iput v1, p0, Lcom/google/android/gms/internal/ads/XD0;->Y:I

    iput v1, p0, Lcom/google/android/gms/internal/ads/XD0;->Z:I

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/XD0;->T:Lcom/google/android/gms/internal/ads/D;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/XD0;->U:Lcom/google/android/gms/internal/ads/D;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/XD0;->V:Lcom/google/android/gms/internal/ads/D;

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/XD0;->b0:Z

    return-void
.end method

.method private final t(JLcom/google/android/gms/internal/ads/D;I)V
    .locals 6

    .prologue
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/XD0;->U:Lcom/google/android/gms/internal/ads/D;

    invoke-static {p4, p3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_0

    return-void

    :cond_0
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/XD0;->U:Lcom/google/android/gms/internal/ads/D;

    if-nez p4, :cond_1

    const/4 p4, 0x1

    :goto_0
    move v5, p4

    goto :goto_1

    :cond_1
    const/4 p4, 0x0

    goto :goto_0

    :goto_1
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/XD0;->U:Lcom/google/android/gms/internal/ads/D;

    const/4 v1, 0x0

    move-object v0, p0

    move-wide v2, p1

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/XD0;->x(IJLcom/google/android/gms/internal/ads/D;I)V

    return-void
.end method

.method private final u(JLcom/google/android/gms/internal/ads/D;I)V
    .locals 6

    .prologue
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/XD0;->V:Lcom/google/android/gms/internal/ads/D;

    invoke-static {p4, p3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_0

    return-void

    :cond_0
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/XD0;->V:Lcom/google/android/gms/internal/ads/D;

    if-nez p4, :cond_1

    const/4 p4, 0x1

    :goto_0
    move v5, p4

    goto :goto_1

    :cond_1
    const/4 p4, 0x0

    goto :goto_0

    :goto_1
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/XD0;->V:Lcom/google/android/gms/internal/ads/D;

    const/4 v1, 0x2

    move-object v0, p0

    move-wide v2, p1

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/XD0;->x(IJLcom/google/android/gms/internal/ads/D;I)V

    return-void
.end method

.method private final v(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;)V
    .locals 6

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/XD0;->L:Landroid/media/metrics/PlaybackMetrics$Builder;

    if-nez p2, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object p2, p2, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/qm;->a(Ljava/lang/Object;)I

    move-result p2

    const/4 v1, -0x1

    if-eq p2, v1, :cond_7

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/XD0;->H:Lcom/google/android/gms/internal/ads/pl;

    const/4 v2, 0x0

    invoke-virtual {p1, p2, v1, v2}, Lcom/google/android/gms/internal/ads/qm;->d(ILcom/google/android/gms/internal/ads/pl;Z)Lcom/google/android/gms/internal/ads/pl;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/XD0;->H:Lcom/google/android/gms/internal/ads/pl;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/XD0;->G:Lcom/google/android/gms/internal/ads/Ql;

    iget p2, p2, Lcom/google/android/gms/internal/ads/pl;->c:I

    const-wide/16 v3, 0x0

    invoke-virtual {p1, p2, v1, v3, v4}, Lcom/google/android/gms/internal/ads/qm;->e(ILcom/google/android/gms/internal/ads/Ql;J)Lcom/google/android/gms/internal/ads/Ql;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/XD0;->G:Lcom/google/android/gms/internal/ads/Ql;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/Ql;->c:Lcom/google/android/gms/internal/ads/Q7;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/Q7;->b:Lcom/google/android/gms/internal/ads/o5;

    const/4 p2, 0x2

    const/4 v1, 0x1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/o5;->a:Landroid/net/Uri;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/EW;->G(Landroid/net/Uri;)I

    move-result p1

    if-eqz p1, :cond_4

    if-eq p1, v1, :cond_3

    if-eq p1, p2, :cond_2

    move v2, v1

    goto :goto_0

    :cond_2
    const/4 v2, 0x4

    goto :goto_0

    :cond_3
    const/4 v2, 0x5

    goto :goto_0

    :cond_4
    const/4 v2, 0x3

    :goto_0
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/PD0;->a(Landroid/media/metrics/PlaybackMetrics$Builder;I)Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/XD0;->G:Lcom/google/android/gms/internal/ads/Ql;

    iget-wide v2, p1, Lcom/google/android/gms/internal/ads/Ql;->l:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v2, v4

    if-eqz v4, :cond_5

    iget-boolean v4, p1, Lcom/google/android/gms/internal/ads/Ql;->j:Z

    if-nez v4, :cond_5

    iget-boolean v4, p1, Lcom/google/android/gms/internal/ads/Ql;->h:Z

    if-nez v4, :cond_5

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Ql;->b()Z

    move-result p1

    if-nez p1, :cond_5

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/EW;->N(J)J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lcom/google/android/gms/internal/ads/QD0;->a(Landroid/media/metrics/PlaybackMetrics$Builder;J)Landroid/media/metrics/PlaybackMetrics$Builder;

    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/XD0;->G:Lcom/google/android/gms/internal/ads/Ql;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Ql;->b()Z

    move-result p1

    if-eq v1, p1, :cond_6

    move p2, v1

    :cond_6
    invoke-static {v0, p2}, Lcom/google/android/gms/internal/ads/RD0;->a(Landroid/media/metrics/PlaybackMetrics$Builder;I)Landroid/media/metrics/PlaybackMetrics$Builder;

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/XD0;->b0:Z

    :cond_7
    :goto_1
    return-void
.end method

.method private final w(JLcom/google/android/gms/internal/ads/D;I)V
    .locals 6

    .prologue
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/XD0;->T:Lcom/google/android/gms/internal/ads/D;

    invoke-static {p4, p3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_0

    return-void

    :cond_0
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/XD0;->T:Lcom/google/android/gms/internal/ads/D;

    if-nez p4, :cond_1

    const/4 p4, 0x1

    :goto_0
    move v5, p4

    goto :goto_1

    :cond_1
    const/4 p4, 0x0

    goto :goto_0

    :goto_1
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/XD0;->T:Lcom/google/android/gms/internal/ads/D;

    const/4 v1, 0x1

    move-object v0, p0

    move-wide v2, p1

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/XD0;->x(IJLcom/google/android/gms/internal/ads/D;I)V

    return-void
.end method

.method private final x(IJLcom/google/android/gms/internal/ads/D;I)V
    .locals 3

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/DD0;->a(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    move-result-object p1

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/XD0;->F:J

    sub-long/2addr p2, v0

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/oD0;->a(Landroid/media/metrics/TrackChangeEvent$Builder;J)Landroid/media/metrics/TrackChangeEvent$Builder;

    move-result-object p1

    const/4 p2, 0x0

    const/4 p3, 0x1

    if-eqz p4, :cond_b

    invoke-static {p1, p3}, Lcom/google/android/gms/internal/ads/wD0;->a(Landroid/media/metrics/TrackChangeEvent$Builder;I)Landroid/media/metrics/TrackChangeEvent$Builder;

    const/4 v0, 0x2

    if-eq p5, p3, :cond_0

    move p5, p3

    goto :goto_0

    :cond_0
    move p5, v0

    :goto_0
    invoke-static {p1, p5}, Lcom/google/android/gms/internal/ads/xD0;->a(Landroid/media/metrics/TrackChangeEvent$Builder;I)Landroid/media/metrics/TrackChangeEvent$Builder;

    iget-object p5, p4, Lcom/google/android/gms/internal/ads/D;->n:Ljava/lang/String;

    if-eqz p5, :cond_1

    invoke-static {p1, p5}, Lcom/google/android/gms/internal/ads/yD0;->a(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_1
    iget-object p5, p4, Lcom/google/android/gms/internal/ads/D;->o:Ljava/lang/String;

    if-eqz p5, :cond_2

    invoke-static {p1, p5}, Lcom/google/android/gms/internal/ads/zD0;->a(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_2
    iget-object p5, p4, Lcom/google/android/gms/internal/ads/D;->k:Ljava/lang/String;

    if-eqz p5, :cond_3

    invoke-static {p1, p5}, Lcom/google/android/gms/internal/ads/AD0;->a(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_3
    iget p5, p4, Lcom/google/android/gms/internal/ads/D;->j:I

    const/4 v1, -0x1

    if-eq p5, v1, :cond_4

    invoke-static {p1, p5}, Lcom/google/android/gms/internal/ads/BD0;->a(Landroid/media/metrics/TrackChangeEvent$Builder;I)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_4
    iget p5, p4, Lcom/google/android/gms/internal/ads/D;->v:I

    if-eq p5, v1, :cond_5

    invoke-static {p1, p5}, Lcom/google/android/gms/internal/ads/CD0;->a(Landroid/media/metrics/TrackChangeEvent$Builder;I)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_5
    iget p5, p4, Lcom/google/android/gms/internal/ads/D;->w:I

    if-eq p5, v1, :cond_6

    invoke-static {p1, p5}, Lcom/google/android/gms/internal/ads/ED0;->a(Landroid/media/metrics/TrackChangeEvent$Builder;I)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_6
    iget p5, p4, Lcom/google/android/gms/internal/ads/D;->D:I

    if-eq p5, v1, :cond_7

    invoke-static {p1, p5}, Lcom/google/android/gms/internal/ads/FD0;->a(Landroid/media/metrics/TrackChangeEvent$Builder;I)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_7
    iget p5, p4, Lcom/google/android/gms/internal/ads/D;->E:I

    if-eq p5, v1, :cond_8

    invoke-static {p1, p5}, Lcom/google/android/gms/internal/ads/pD0;->a(Landroid/media/metrics/TrackChangeEvent$Builder;I)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_8
    iget-object p5, p4, Lcom/google/android/gms/internal/ads/D;->d:Ljava/lang/String;

    if-eqz p5, :cond_a

    sget v2, Lcom/google/android/gms/internal/ads/EW;->a:I

    const-string v2, "-"

    invoke-virtual {p5, v2, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p5

    aget-object p2, p5, p2

    array-length v1, p5

    if-lt v1, v0, :cond_9

    aget-object p5, p5, p3

    goto :goto_1

    :cond_9
    const/4 p5, 0x0

    :goto_1
    invoke-static {p2, p5}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p2

    iget-object p5, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p5, Ljava/lang/String;

    invoke-static {p1, p5}, Lcom/google/android/gms/internal/ads/qD0;->a(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    iget-object p2, p2, Landroid/util/Pair;->second:Ljava/lang/Object;

    if-eqz p2, :cond_a

    check-cast p2, Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/rD0;->a(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_a
    iget p2, p4, Lcom/google/android/gms/internal/ads/D;->x:F

    const/high16 p4, -0x40800000    # -1.0f

    cmpl-float p4, p2, p4

    if-eqz p4, :cond_c

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/tD0;->a(Landroid/media/metrics/TrackChangeEvent$Builder;F)Landroid/media/metrics/TrackChangeEvent$Builder;

    goto :goto_2

    :cond_b
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/wD0;->a(Landroid/media/metrics/TrackChangeEvent$Builder;I)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_c
    :goto_2
    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/XD0;->b0:Z

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/XD0;->E:Landroid/media/metrics/PlaybackSession;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/uD0;->a(Landroid/media/metrics/TrackChangeEvent$Builder;)Landroid/media/metrics/TrackChangeEvent;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/vD0;->a(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/TrackChangeEvent;)V

    return-void
.end method

.method private final y(Lcom/google/android/gms/internal/ads/VC0;)Z
    .locals 1

    .prologue
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/XD0;->D:Lcom/google/android/gms/internal/ads/ZD0;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/VC0;->c:Ljava/lang/String;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ZD0;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/LB0;Lcom/google/android/gms/internal/ads/HH0;)V
    .locals 5

    .prologue
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/LB0;->d:Lcom/google/android/gms/internal/ads/LH0;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p2, Lcom/google/android/gms/internal/ads/HH0;->b:Lcom/google/android/gms/internal/ads/D;

    new-instance v2, Lcom/google/android/gms/internal/ads/VC0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/XD0;->D:Lcom/google/android/gms/internal/ads/ZD0;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/LB0;->b:Lcom/google/android/gms/internal/ads/qm;

    const/4 v4, 0x0

    invoke-interface {v3, p1, v0}, Lcom/google/android/gms/internal/ads/ZD0;->c(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, v1, v4, p1}, Lcom/google/android/gms/internal/ads/VC0;-><init>(Lcom/google/android/gms/internal/ads/D;ILjava/lang/String;)V

    iget p1, p2, Lcom/google/android/gms/internal/ads/HH0;->a:I

    if-eqz p1, :cond_3

    const/4 p2, 0x1

    if-eq p1, p2, :cond_2

    const/4 p2, 0x2

    if-eq p1, p2, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_1

    :goto_0
    return-void

    :cond_1
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/XD0;->S:Lcom/google/android/gms/internal/ads/VC0;

    return-void

    :cond_2
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/XD0;->R:Lcom/google/android/gms/internal/ads/VC0;

    return-void

    :cond_3
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/XD0;->Q:Lcom/google/android/gms/internal/ads/VC0;

    return-void
.end method

.method public final synthetic b(Lcom/google/android/gms/internal/ads/LB0;Lcom/google/android/gms/internal/ads/D;Lcom/google/android/gms/internal/ads/Hz0;)V
    .locals 0

    return-void
.end method

.method public final synthetic c(Lcom/google/android/gms/internal/ads/LB0;Ljava/lang/Object;J)V
    .locals 0

    return-void
.end method

.method public final d(Lcom/google/android/gms/internal/ads/rj;Lcom/google/android/gms/internal/ads/MB0;)V
    .locals 18

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const/4 v2, 0x1

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/ads/MB0;->b()I

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_12

    :cond_0
    const/4 v3, 0x0

    move v4, v3

    :goto_0
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/ads/MB0;->b()I

    move-result v5

    const/16 v6, 0xb

    if-ge v4, v5, :cond_3

    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/ads/MB0;->a(I)I

    move-result v5

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/ads/MB0;->c(I)Lcom/google/android/gms/internal/ads/LB0;

    move-result-object v7

    if-nez v5, :cond_1

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/XD0;->D:Lcom/google/android/gms/internal/ads/ZD0;

    invoke-interface {v5, v7}, Lcom/google/android/gms/internal/ads/ZD0;->b(Lcom/google/android/gms/internal/ads/LB0;)V

    goto :goto_1

    :cond_1
    if-ne v5, v6, :cond_2

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/XD0;->D:Lcom/google/android/gms/internal/ads/ZD0;

    iget v6, v0, Lcom/google/android/gms/internal/ads/XD0;->M:I

    invoke-interface {v5, v7, v6}, Lcom/google/android/gms/internal/ads/ZD0;->e(Lcom/google/android/gms/internal/ads/LB0;I)V

    goto :goto_1

    :cond_2
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/XD0;->D:Lcom/google/android/gms/internal/ads/ZD0;

    invoke-interface {v5, v7}, Lcom/google/android/gms/internal/ads/ZD0;->a(Lcom/google/android/gms/internal/ads/LB0;)V

    :goto_1
    add-int/2addr v4, v2

    goto :goto_0

    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/MB0;->d(I)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/MB0;->c(I)Lcom/google/android/gms/internal/ads/LB0;

    move-result-object v7

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/XD0;->L:Landroid/media/metrics/PlaybackMetrics$Builder;

    if-eqz v8, :cond_4

    iget-object v8, v7, Lcom/google/android/gms/internal/ads/LB0;->b:Lcom/google/android/gms/internal/ads/qm;

    iget-object v7, v7, Lcom/google/android/gms/internal/ads/LB0;->d:Lcom/google/android/gms/internal/ads/LH0;

    invoke-direct {v0, v8, v7}, Lcom/google/android/gms/internal/ads/XD0;->v(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;)V

    :cond_4
    const/4 v7, 0x2

    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/ads/MB0;->d(I)Z

    move-result v8

    const/4 v10, 0x3

    const/4 v11, 0x0

    if-eqz v8, :cond_c

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/XD0;->L:Landroid/media/metrics/PlaybackMetrics$Builder;

    if-eqz v8, :cond_c

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/rj;->p()Lcom/google/android/gms/internal/ads/gq;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/gq;->a()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v12

    move v13, v3

    :goto_2
    if-ge v13, v12, :cond_7

    invoke-interface {v8, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/google/android/gms/internal/ads/Gp;

    move v15, v3

    :goto_3
    iget v6, v14, Lcom/google/android/gms/internal/ads/Gp;->a:I

    add-int/lit8 v16, v13, 0x1

    if-ge v15, v6, :cond_6

    invoke-virtual {v14, v15}, Lcom/google/android/gms/internal/ads/Gp;->d(I)Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v14, v15}, Lcom/google/android/gms/internal/ads/Gp;->b(I)Lcom/google/android/gms/internal/ads/D;

    move-result-object v6

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/D;->s:Lcom/google/android/gms/internal/ads/EH0;

    if-eqz v6, :cond_5

    goto :goto_4

    :cond_5
    add-int/2addr v15, v2

    goto :goto_3

    :cond_6
    move/from16 v13, v16

    const/16 v6, 0xb

    goto :goto_2

    :cond_7
    move-object v6, v11

    :goto_4
    if-eqz v6, :cond_c

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/XD0;->L:Landroid/media/metrics/PlaybackMetrics$Builder;

    sget v12, Lcom/google/android/gms/internal/ads/EW;->a:I

    invoke-static {v8}, Lcom/google/android/gms/internal/ads/VD0;->a(Ljava/lang/Object;)Landroid/media/metrics/PlaybackMetrics$Builder;

    move-result-object v8

    move v12, v3

    :goto_5
    iget v13, v6, Lcom/google/android/gms/internal/ads/EH0;->F:I

    if-ge v12, v13, :cond_b

    invoke-virtual {v6, v12}, Lcom/google/android/gms/internal/ads/EH0;->a(I)Lcom/google/android/gms/internal/ads/aH0;

    move-result-object v13

    iget-object v13, v13, Lcom/google/android/gms/internal/ads/aH0;->D:Ljava/util/UUID;

    sget-object v14, Lcom/google/android/gms/internal/ads/Hw0;->d:Ljava/util/UUID;

    invoke-virtual {v13, v14}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_8

    move v6, v10

    goto :goto_6

    :cond_8
    sget-object v14, Lcom/google/android/gms/internal/ads/Hw0;->e:Ljava/util/UUID;

    invoke-virtual {v13, v14}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_9

    move v6, v7

    goto :goto_6

    :cond_9
    sget-object v14, Lcom/google/android/gms/internal/ads/Hw0;->c:Ljava/util/UUID;

    invoke-virtual {v13, v14}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_a

    const/4 v6, 0x6

    goto :goto_6

    :cond_a
    add-int/2addr v12, v2

    goto :goto_5

    :cond_b
    move v6, v2

    :goto_6
    invoke-static {v8, v6}, Lcom/google/android/gms/internal/ads/cD0;->a(Landroid/media/metrics/PlaybackMetrics$Builder;I)Landroid/media/metrics/PlaybackMetrics$Builder;

    :cond_c
    const/16 v6, 0x3f3

    invoke-virtual {v1, v6}, Lcom/google/android/gms/internal/ads/MB0;->d(I)Z

    move-result v6

    if-eqz v6, :cond_d

    iget v6, v0, Lcom/google/android/gms/internal/ads/XD0;->a0:I

    add-int/2addr v6, v2

    iput v6, v0, Lcom/google/android/gms/internal/ads/XD0;->a0:I

    :cond_d
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/XD0;->P:Lcom/google/android/gms/internal/ads/Pf;

    const/16 v16, 0x9

    if-nez v6, :cond_e

    goto/16 :goto_e

    :cond_e
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/XD0;->C:Landroid/content/Context;

    iget v9, v6, Lcom/google/android/gms/internal/ads/Pf;->C:I

    const/16 v12, 0x3e9

    if-ne v9, v12, :cond_10

    const/16 v8, 0x14

    :cond_f
    :goto_7
    move v9, v3

    goto/16 :goto_d

    :cond_10
    move-object v9, v6

    check-cast v9, Lcom/google/android/gms/internal/ads/Qz0;

    iget v12, v9, Lcom/google/android/gms/internal/ads/Qz0;->E:I

    if-ne v12, v2, :cond_11

    move v12, v2

    goto :goto_8

    :cond_11
    move v12, v3

    :goto_8
    iget v9, v9, Lcom/google/android/gms/internal/ads/Qz0;->I:I

    invoke-virtual {v6}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v14, v13, Ljava/io/IOException;

    const/16 v15, 0x17

    if-eqz v14, :cond_23

    instance-of v9, v13, Lcom/google/android/gms/internal/ads/ss0;

    if-eqz v9, :cond_12

    check-cast v13, Lcom/google/android/gms/internal/ads/ss0;

    iget v8, v13, Lcom/google/android/gms/internal/ads/ss0;->E:I

    move v9, v8

    const/4 v8, 0x5

    goto/16 :goto_d

    :cond_12
    instance-of v9, v13, Lcom/google/android/gms/internal/ads/of;

    if-eqz v9, :cond_13

    move v9, v3

    const/16 v8, 0xb

    goto/16 :goto_d

    :cond_13
    instance-of v9, v13, Lcom/google/android/gms/internal/ads/rr0;

    if-nez v9, :cond_1e

    instance-of v12, v13, Lcom/google/android/gms/internal/ads/jw0;

    if-eqz v12, :cond_14

    goto/16 :goto_c

    :cond_14
    iget v8, v6, Lcom/google/android/gms/internal/ads/Pf;->C:I

    const/16 v9, 0x3ea

    if-ne v8, v9, :cond_15

    const/16 v8, 0x15

    goto :goto_7

    :cond_15
    instance-of v8, v13, Lcom/google/android/gms/internal/ads/PF0;

    if-eqz v8, :cond_1b

    invoke-virtual {v13}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v9, v8, Landroid/media/MediaDrm$MediaDrmStateException;

    if-eqz v9, :cond_16

    check-cast v8, Landroid/media/MediaDrm$MediaDrmStateException;

    invoke-virtual {v8}, Landroid/media/MediaDrm$MediaDrmStateException;->getDiagnosticInfo()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/google/android/gms/internal/ads/EW;->E(Ljava/lang/String;)I

    move-result v8

    :goto_9
    invoke-static {v8}, Lcom/google/android/gms/internal/ads/XD0;->r(I)I

    move-result v9

    :goto_a
    move/from16 v17, v9

    move v9, v8

    move/from16 v8, v17

    goto/16 :goto_d

    :cond_16
    sget v9, Lcom/google/android/gms/internal/ads/EW;->a:I

    if-lt v9, v15, :cond_17

    instance-of v9, v8, Landroid/media/MediaDrmResetException;

    if-eqz v9, :cond_17

    const/16 v8, 0x1b

    goto :goto_7

    :cond_17
    instance-of v9, v8, Landroid/media/NotProvisionedException;

    if-eqz v9, :cond_18

    const/16 v8, 0x18

    goto :goto_7

    :cond_18
    instance-of v9, v8, Landroid/media/DeniedByServerException;

    if-eqz v9, :cond_19

    const/16 v8, 0x1d

    goto/16 :goto_7

    :cond_19
    instance-of v8, v8, Lcom/google/android/gms/internal/ads/aG0;

    if-eqz v8, :cond_1a

    :goto_b
    move v9, v3

    move v8, v15

    goto/16 :goto_d

    :cond_1a
    const/16 v8, 0x1e

    goto/16 :goto_7

    :cond_1b
    instance-of v8, v13, Lcom/google/android/gms/internal/ads/Op0;

    if-eqz v8, :cond_1d

    invoke-virtual {v13}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v8

    instance-of v8, v8, Ljava/io/FileNotFoundException;

    if-eqz v8, :cond_1d

    invoke-virtual {v13}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v8}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v8

    instance-of v9, v8, Landroid/system/ErrnoException;

    const/16 v12, 0x1f

    if-eqz v9, :cond_1c

    check-cast v8, Landroid/system/ErrnoException;

    iget v8, v8, Landroid/system/ErrnoException;->errno:I

    sget v9, Landroid/system/OsConstants;->EACCES:I

    if-ne v8, v9, :cond_1c

    const/16 v8, 0x20

    goto/16 :goto_7

    :cond_1c
    move v9, v3

    move v8, v12

    goto/16 :goto_d

    :cond_1d
    move v9, v3

    move/from16 v8, v16

    goto/16 :goto_d

    :cond_1e
    :goto_c
    invoke-static {v8}, Lcom/google/android/gms/internal/ads/qQ;->b(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/qQ;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/qQ;->a()I

    move-result v8

    if-ne v8, v2, :cond_1f

    move v9, v3

    move v8, v10

    goto/16 :goto_d

    :cond_1f
    invoke-virtual {v13}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v8

    instance-of v12, v8, Ljava/net/UnknownHostException;

    if-eqz v12, :cond_20

    move v9, v3

    const/4 v8, 0x6

    goto/16 :goto_d

    :cond_20
    instance-of v8, v8, Ljava/net/SocketTimeoutException;

    if-eqz v8, :cond_21

    move v9, v3

    const/4 v8, 0x7

    goto/16 :goto_d

    :cond_21
    if-eqz v9, :cond_22

    check-cast v13, Lcom/google/android/gms/internal/ads/rr0;

    iget v8, v13, Lcom/google/android/gms/internal/ads/rr0;->D:I

    if-ne v8, v2, :cond_22

    move v9, v3

    const/4 v8, 0x4

    goto/16 :goto_d

    :cond_22
    move v9, v3

    const/16 v8, 0x8

    goto/16 :goto_d

    :cond_23
    if-eqz v12, :cond_24

    const/16 v8, 0x23

    if-eqz v9, :cond_f

    if-ne v9, v2, :cond_24

    goto/16 :goto_7

    :cond_24
    if-eqz v12, :cond_25

    if-ne v9, v10, :cond_25

    const/16 v8, 0xf

    goto/16 :goto_7

    :cond_25
    if-eqz v12, :cond_26

    if-ne v9, v7, :cond_26

    goto/16 :goto_b

    :cond_26
    instance-of v8, v13, Lcom/google/android/gms/internal/ads/IG0;

    if-eqz v8, :cond_27

    check-cast v13, Lcom/google/android/gms/internal/ads/IG0;

    iget-object v8, v13, Lcom/google/android/gms/internal/ads/IG0;->F:Ljava/lang/String;

    invoke-static {v8}, Lcom/google/android/gms/internal/ads/EW;->E(Ljava/lang/String;)I

    move-result v8

    move v9, v8

    const/16 v8, 0xd

    goto :goto_d

    :cond_27
    instance-of v8, v13, Lcom/google/android/gms/internal/ads/zG0;

    const/16 v9, 0xe

    if-eqz v8, :cond_28

    check-cast v13, Lcom/google/android/gms/internal/ads/zG0;

    iget v8, v13, Lcom/google/android/gms/internal/ads/zG0;->D:I

    goto/16 :goto_a

    :cond_28
    instance-of v8, v13, Ljava/lang/OutOfMemoryError;

    if-eqz v8, :cond_29

    move v8, v9

    goto/16 :goto_7

    :cond_29
    instance-of v8, v13, Lcom/google/android/gms/internal/ads/NE0;

    if-eqz v8, :cond_2a

    check-cast v13, Lcom/google/android/gms/internal/ads/NE0;

    iget v8, v13, Lcom/google/android/gms/internal/ads/NE0;->C:I

    const/16 v9, 0x11

    goto/16 :goto_a

    :cond_2a
    instance-of v8, v13, Lcom/google/android/gms/internal/ads/QE0;

    if-eqz v8, :cond_2b

    check-cast v13, Lcom/google/android/gms/internal/ads/QE0;

    iget v8, v13, Lcom/google/android/gms/internal/ads/QE0;->C:I

    const/16 v9, 0x12

    goto/16 :goto_a

    :cond_2b
    instance-of v8, v13, Landroid/media/MediaCodec$CryptoException;

    if-eqz v8, :cond_2c

    check-cast v13, Landroid/media/MediaCodec$CryptoException;

    invoke-virtual {v13}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    move-result v8

    goto/16 :goto_9

    :cond_2c
    const/16 v8, 0x16

    goto/16 :goto_7

    :goto_d
    iget-object v12, v0, Lcom/google/android/gms/internal/ads/XD0;->E:Landroid/media/metrics/PlaybackSession;

    invoke-static {}, Lcom/google/android/gms/internal/ads/OD0;->a()Landroid/media/metrics/PlaybackErrorEvent$Builder;

    move-result-object v13

    iget-wide v14, v0, Lcom/google/android/gms/internal/ads/XD0;->F:J

    sub-long v14, v4, v14

    invoke-static {v13, v14, v15}, Lcom/google/android/gms/internal/ads/WD0;->a(Landroid/media/metrics/PlaybackErrorEvent$Builder;J)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    move-result-object v13

    invoke-static {v13, v8}, Lcom/google/android/gms/internal/ads/XC0;->a(Landroid/media/metrics/PlaybackErrorEvent$Builder;I)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    move-result-object v8

    invoke-static {v8, v9}, Lcom/google/android/gms/internal/ads/YC0;->a(Landroid/media/metrics/PlaybackErrorEvent$Builder;I)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    move-result-object v8

    invoke-static {v8, v6}, Lcom/google/android/gms/internal/ads/ZC0;->a(Landroid/media/metrics/PlaybackErrorEvent$Builder;Ljava/lang/Exception;)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    move-result-object v6

    invoke-static {v6}, Lcom/google/android/gms/internal/ads/aD0;->a(Landroid/media/metrics/PlaybackErrorEvent$Builder;)Landroid/media/metrics/PlaybackErrorEvent;

    move-result-object v6

    invoke-static {v12, v6}, Lcom/google/android/gms/internal/ads/bD0;->a(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/PlaybackErrorEvent;)V

    iput-boolean v2, v0, Lcom/google/android/gms/internal/ads/XD0;->b0:Z

    iput-object v11, v0, Lcom/google/android/gms/internal/ads/XD0;->P:Lcom/google/android/gms/internal/ads/Pf;

    :goto_e
    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/ads/MB0;->d(I)Z

    move-result v6

    if-eqz v6, :cond_30

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/rj;->p()Lcom/google/android/gms/internal/ads/gq;

    move-result-object v6

    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/ads/gq;->b(I)Z

    move-result v8

    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/ads/gq;->b(I)Z

    move-result v9

    invoke-virtual {v6, v10}, Lcom/google/android/gms/internal/ads/gq;->b(I)Z

    move-result v6

    if-nez v8, :cond_2d

    if-nez v9, :cond_2d

    if-eqz v6, :cond_30

    move v6, v2

    :cond_2d
    if-nez v8, :cond_2e

    invoke-direct {v0, v4, v5, v11, v3}, Lcom/google/android/gms/internal/ads/XD0;->w(JLcom/google/android/gms/internal/ads/D;I)V

    :cond_2e
    if-nez v9, :cond_2f

    invoke-direct {v0, v4, v5, v11, v3}, Lcom/google/android/gms/internal/ads/XD0;->t(JLcom/google/android/gms/internal/ads/D;I)V

    :cond_2f
    if-nez v6, :cond_30

    invoke-direct {v0, v4, v5, v11, v3}, Lcom/google/android/gms/internal/ads/XD0;->u(JLcom/google/android/gms/internal/ads/D;I)V

    :cond_30
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/XD0;->Q:Lcom/google/android/gms/internal/ads/VC0;

    invoke-direct {v0, v6}, Lcom/google/android/gms/internal/ads/XD0;->y(Lcom/google/android/gms/internal/ads/VC0;)Z

    move-result v6

    if-eqz v6, :cond_31

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/XD0;->Q:Lcom/google/android/gms/internal/ads/VC0;

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/VC0;->a:Lcom/google/android/gms/internal/ads/D;

    iget v8, v6, Lcom/google/android/gms/internal/ads/D;->w:I

    const/4 v9, -0x1

    if-eq v8, v9, :cond_31

    invoke-direct {v0, v4, v5, v6, v3}, Lcom/google/android/gms/internal/ads/XD0;->w(JLcom/google/android/gms/internal/ads/D;I)V

    iput-object v11, v0, Lcom/google/android/gms/internal/ads/XD0;->Q:Lcom/google/android/gms/internal/ads/VC0;

    :cond_31
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/XD0;->R:Lcom/google/android/gms/internal/ads/VC0;

    invoke-direct {v0, v6}, Lcom/google/android/gms/internal/ads/XD0;->y(Lcom/google/android/gms/internal/ads/VC0;)Z

    move-result v6

    if-eqz v6, :cond_32

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/XD0;->R:Lcom/google/android/gms/internal/ads/VC0;

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/VC0;->a:Lcom/google/android/gms/internal/ads/D;

    invoke-direct {v0, v4, v5, v6, v3}, Lcom/google/android/gms/internal/ads/XD0;->t(JLcom/google/android/gms/internal/ads/D;I)V

    iput-object v11, v0, Lcom/google/android/gms/internal/ads/XD0;->R:Lcom/google/android/gms/internal/ads/VC0;

    :cond_32
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/XD0;->S:Lcom/google/android/gms/internal/ads/VC0;

    invoke-direct {v0, v6}, Lcom/google/android/gms/internal/ads/XD0;->y(Lcom/google/android/gms/internal/ads/VC0;)Z

    move-result v6

    if-eqz v6, :cond_33

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/XD0;->S:Lcom/google/android/gms/internal/ads/VC0;

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/VC0;->a:Lcom/google/android/gms/internal/ads/D;

    invoke-direct {v0, v4, v5, v6, v3}, Lcom/google/android/gms/internal/ads/XD0;->u(JLcom/google/android/gms/internal/ads/D;I)V

    iput-object v11, v0, Lcom/google/android/gms/internal/ads/XD0;->S:Lcom/google/android/gms/internal/ads/VC0;

    :cond_33
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/XD0;->C:Landroid/content/Context;

    invoke-static {v6}, Lcom/google/android/gms/internal/ads/qQ;->b(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/qQ;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/qQ;->a()I

    move-result v6

    packed-switch v6, :pswitch_data_0

    :pswitch_0
    move v12, v2

    goto :goto_f

    :pswitch_1
    const/4 v12, 0x7

    goto :goto_f

    :pswitch_2
    const/16 v12, 0x8

    goto :goto_f

    :pswitch_3
    move v12, v10

    goto :goto_f

    :pswitch_4
    const/4 v12, 0x6

    goto :goto_f

    :pswitch_5
    const/4 v12, 0x5

    goto :goto_f

    :pswitch_6
    const/4 v12, 0x4

    goto :goto_f

    :pswitch_7
    move v12, v7

    goto :goto_f

    :pswitch_8
    move/from16 v12, v16

    goto :goto_f

    :pswitch_9
    move v12, v3

    :goto_f
    iget v6, v0, Lcom/google/android/gms/internal/ads/XD0;->O:I

    if-eq v12, v6, :cond_34

    iput v12, v0, Lcom/google/android/gms/internal/ads/XD0;->O:I

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/XD0;->E:Landroid/media/metrics/PlaybackSession;

    invoke-static {}, Lcom/google/android/gms/internal/ads/SD0;->a()Landroid/media/metrics/NetworkEvent$Builder;

    move-result-object v8

    invoke-static {v8, v12}, Lcom/google/android/gms/internal/ads/dD0;->a(Landroid/media/metrics/NetworkEvent$Builder;I)Landroid/media/metrics/NetworkEvent$Builder;

    move-result-object v8

    iget-wide v11, v0, Lcom/google/android/gms/internal/ads/XD0;->F:J

    sub-long v11, v4, v11

    invoke-static {v8, v11, v12}, Lcom/google/android/gms/internal/ads/eD0;->a(Landroid/media/metrics/NetworkEvent$Builder;J)Landroid/media/metrics/NetworkEvent$Builder;

    move-result-object v8

    invoke-static {v8}, Lcom/google/android/gms/internal/ads/fD0;->a(Landroid/media/metrics/NetworkEvent$Builder;)Landroid/media/metrics/NetworkEvent;

    move-result-object v8

    invoke-static {v6, v8}, Lcom/google/android/gms/internal/ads/gD0;->a(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/NetworkEvent;)V

    :cond_34
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/rj;->e()I

    move-result v6

    if-eq v6, v7, :cond_35

    iput-boolean v3, v0, Lcom/google/android/gms/internal/ads/XD0;->W:Z

    :cond_35
    move-object/from16 v6, p1

    check-cast v6, Lcom/google/android/gms/internal/ads/IB0;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/IB0;->s()Lcom/google/android/gms/internal/ads/Qz0;

    move-result-object v6

    const/16 v8, 0xa

    if-nez v6, :cond_36

    iput-boolean v3, v0, Lcom/google/android/gms/internal/ads/XD0;->X:Z

    goto :goto_10

    :cond_36
    invoke-virtual {v1, v8}, Lcom/google/android/gms/internal/ads/MB0;->d(I)Z

    move-result v3

    if-eqz v3, :cond_37

    iput-boolean v2, v0, Lcom/google/android/gms/internal/ads/XD0;->X:Z

    :cond_37
    :goto_10
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/rj;->e()I

    move-result v3

    iget-boolean v6, v0, Lcom/google/android/gms/internal/ads/XD0;->W:Z

    if-eqz v6, :cond_38

    const/4 v6, 0x5

    goto :goto_11

    :cond_38
    iget-boolean v6, v0, Lcom/google/android/gms/internal/ads/XD0;->X:Z

    if-eqz v6, :cond_39

    const/16 v6, 0xd

    goto :goto_11

    :cond_39
    const/4 v6, 0x4

    if-ne v3, v6, :cond_3a

    const/16 v6, 0xb

    goto :goto_11

    :cond_3a
    const/16 v9, 0xc

    if-ne v3, v7, :cond_3f

    iget v3, v0, Lcom/google/android/gms/internal/ads/XD0;->N:I

    if-eqz v3, :cond_3b

    if-eq v3, v7, :cond_3b

    if-ne v3, v9, :cond_3c

    :cond_3b
    move v6, v7

    goto :goto_11

    :cond_3c
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/rj;->A()Z

    move-result v3

    if-nez v3, :cond_3d

    const/4 v6, 0x7

    goto :goto_11

    :cond_3d
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/rj;->i()I

    move-result v3

    if-eqz v3, :cond_3e

    move v6, v8

    goto :goto_11

    :cond_3e
    const/4 v6, 0x6

    goto :goto_11

    :cond_3f
    if-ne v3, v10, :cond_42

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/rj;->A()Z

    move-result v3

    if-nez v3, :cond_40

    goto :goto_11

    :cond_40
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/rj;->i()I

    move-result v3

    if-eqz v3, :cond_41

    move/from16 v6, v16

    goto :goto_11

    :cond_41
    move v6, v10

    goto :goto_11

    :cond_42
    if-ne v3, v2, :cond_43

    iget v3, v0, Lcom/google/android/gms/internal/ads/XD0;->N:I

    if-eqz v3, :cond_43

    move v6, v9

    goto :goto_11

    :cond_43
    iget v6, v0, Lcom/google/android/gms/internal/ads/XD0;->N:I

    :goto_11
    iget v3, v0, Lcom/google/android/gms/internal/ads/XD0;->N:I

    if-eq v3, v6, :cond_44

    iput v6, v0, Lcom/google/android/gms/internal/ads/XD0;->N:I

    iput-boolean v2, v0, Lcom/google/android/gms/internal/ads/XD0;->b0:Z

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/XD0;->E:Landroid/media/metrics/PlaybackSession;

    invoke-static {}, Lcom/google/android/gms/internal/ads/TD0;->a()Landroid/media/metrics/PlaybackStateEvent$Builder;

    move-result-object v3

    iget v6, v0, Lcom/google/android/gms/internal/ads/XD0;->N:I

    invoke-static {v3, v6}, Lcom/google/android/gms/internal/ads/iD0;->a(Landroid/media/metrics/PlaybackStateEvent$Builder;I)Landroid/media/metrics/PlaybackStateEvent$Builder;

    move-result-object v3

    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/XD0;->F:J

    sub-long/2addr v4, v6

    invoke-static {v3, v4, v5}, Lcom/google/android/gms/internal/ads/jD0;->a(Landroid/media/metrics/PlaybackStateEvent$Builder;J)Landroid/media/metrics/PlaybackStateEvent$Builder;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/kD0;->a(Landroid/media/metrics/PlaybackStateEvent$Builder;)Landroid/media/metrics/PlaybackStateEvent;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/lD0;->a(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/PlaybackStateEvent;)V

    :cond_44
    const/16 v2, 0x404

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/MB0;->d(I)Z

    move-result v3

    if-eqz v3, :cond_45

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/XD0;->D:Lcom/google/android/gms/internal/ads/ZD0;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/MB0;->c(I)Lcom/google/android/gms/internal/ads/LB0;

    move-result-object v1

    invoke-interface {v3, v1}, Lcom/google/android/gms/internal/ads/ZD0;->f(Lcom/google/android/gms/internal/ads/LB0;)V

    :cond_45
    :goto_12
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final synthetic e(Lcom/google/android/gms/internal/ads/LB0;IJ)V
    .locals 0

    return-void
.end method

.method public final f(Lcom/google/android/gms/internal/ads/LB0;Ljava/lang/String;Z)V
    .locals 0

    .prologue
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/LB0;->d:Lcom/google/android/gms/internal/ads/LH0;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/LH0;->b()Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/XD0;->K:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/XD0;->s()V

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/XD0;->I:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/XD0;->J:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final g(Lcom/google/android/gms/internal/ads/LB0;Lcom/google/android/gms/internal/ads/Os;)V
    .locals 3

    .prologue
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/XD0;->Q:Lcom/google/android/gms/internal/ads/VC0;

    if-eqz p1, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/VC0;->a:Lcom/google/android/gms/internal/ads/D;

    iget v1, v0, Lcom/google/android/gms/internal/ads/D;->w:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/D;->b()Lcom/google/android/gms/internal/ads/oK0;

    move-result-object v0

    iget v1, p2, Lcom/google/android/gms/internal/ads/Os;->a:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/oK0;->G(I)Lcom/google/android/gms/internal/ads/oK0;

    iget p2, p2, Lcom/google/android/gms/internal/ads/Os;->b:I

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/oK0;->k(I)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/oK0;->H()Lcom/google/android/gms/internal/ads/D;

    move-result-object p2

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/VC0;->c:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/ads/VC0;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1, p1}, Lcom/google/android/gms/internal/ads/VC0;-><init>(Lcom/google/android/gms/internal/ads/D;ILjava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/XD0;->Q:Lcom/google/android/gms/internal/ads/VC0;

    :cond_0
    return-void
.end method

.method public final synthetic h(Lcom/google/android/gms/internal/ads/LB0;I)V
    .locals 0

    return-void
.end method

.method public final i(Lcom/google/android/gms/internal/ads/LB0;Ljava/lang/String;)V
    .locals 1

    .prologue
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/LB0;->d:Lcom/google/android/gms/internal/ads/LH0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/LH0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/XD0;->s()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/XD0;->K:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/ads/sD0;->a()Landroid/media/metrics/PlaybackMetrics$Builder;

    move-result-object p2

    const-string v0, "AndroidXMedia3"

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/ads/mD0;->a(Landroid/media/metrics/PlaybackMetrics$Builder;Ljava/lang/String;)Landroid/media/metrics/PlaybackMetrics$Builder;

    move-result-object p2

    const-string v0, "1.5.0-beta01"

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/ads/nD0;->a(Landroid/media/metrics/PlaybackMetrics$Builder;Ljava/lang/String;)Landroid/media/metrics/PlaybackMetrics$Builder;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/XD0;->L:Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/LB0;->b:Lcom/google/android/gms/internal/ads/qm;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/LB0;->d:Lcom/google/android/gms/internal/ads/LH0;

    invoke-direct {p0, p2, p1}, Lcom/google/android/gms/internal/ads/XD0;->v(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;)V

    return-void
.end method

.method public final j(Lcom/google/android/gms/internal/ads/LB0;Lcom/google/android/gms/internal/ads/Pf;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/XD0;->P:Lcom/google/android/gms/internal/ads/Pf;

    return-void
.end method

.method public final k(Lcom/google/android/gms/internal/ads/LB0;Lcom/google/android/gms/internal/ads/ri;Lcom/google/android/gms/internal/ads/ri;I)V
    .locals 0

    .prologue
    const/4 p1, 0x1

    if-ne p4, p1, :cond_0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/XD0;->W:Z

    move p4, p1

    :cond_0
    iput p4, p0, Lcom/google/android/gms/internal/ads/XD0;->M:I

    return-void
.end method

.method public final l(Lcom/google/android/gms/internal/ads/LB0;Lcom/google/android/gms/internal/ads/Gz0;)V
    .locals 1

    iget p1, p0, Lcom/google/android/gms/internal/ads/XD0;->Y:I

    iget v0, p2, Lcom/google/android/gms/internal/ads/Gz0;->g:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/gms/internal/ads/XD0;->Y:I

    iget p1, p0, Lcom/google/android/gms/internal/ads/XD0;->Z:I

    iget p2, p2, Lcom/google/android/gms/internal/ads/Gz0;->e:I

    add-int/2addr p1, p2

    iput p1, p0, Lcom/google/android/gms/internal/ads/XD0;->Z:I

    return-void
.end method

.method public final m(Lcom/google/android/gms/internal/ads/LB0;Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;Ljava/io/IOException;Z)V
    .locals 0

    return-void
.end method

.method public final synthetic n(Lcom/google/android/gms/internal/ads/LB0;Lcom/google/android/gms/internal/ads/D;Lcom/google/android/gms/internal/ads/Hz0;)V
    .locals 0

    return-void
.end method

.method public final o()Landroid/media/metrics/LogSessionId;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/XD0;->E:Landroid/media/metrics/PlaybackSession;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/UD0;->a(Landroid/media/metrics/PlaybackSession;)Landroid/media/metrics/LogSessionId;

    move-result-object v0

    return-object v0
.end method

.method public final p(Lcom/google/android/gms/internal/ads/LB0;IJJ)V
    .locals 5

    .prologue
    iget-object p5, p1, Lcom/google/android/gms/internal/ads/LB0;->d:Lcom/google/android/gms/internal/ads/LH0;

    if-eqz p5, :cond_2

    iget-object p6, p0, Lcom/google/android/gms/internal/ads/XD0;->D:Lcom/google/android/gms/internal/ads/ZD0;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/LB0;->b:Lcom/google/android/gms/internal/ads/qm;

    invoke-interface {p6, p1, p5}, Lcom/google/android/gms/internal/ads/ZD0;->c(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;)Ljava/lang/String;

    move-result-object p1

    iget-object p5, p0, Lcom/google/android/gms/internal/ads/XD0;->J:Ljava/util/HashMap;

    invoke-virtual {p5, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/lang/Long;

    iget-object p6, p0, Lcom/google/android/gms/internal/ads/XD0;->I:Ljava/util/HashMap;

    invoke-virtual {p6, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Ljava/lang/Long;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/XD0;->J:Ljava/util/HashMap;

    const-wide/16 v1, 0x0

    if-nez p5, :cond_0

    move-wide v3, v1

    goto :goto_0

    :cond_0
    invoke-virtual {p5}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    :goto_0
    add-long/2addr v3, p3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {v0, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/XD0;->I:Ljava/util/HashMap;

    if-nez p6, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p6}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    :goto_1
    int-to-long p4, p2

    add-long/2addr v1, p4

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method
