.class public final Lcom/google/android/gms/internal/ads/JI0;
.super Lcom/google/android/gms/internal/ads/qm;
.source "SourceFile"


# static fields
.field private static final g:Ljava/lang/Object;


# instance fields
.field private final b:J

.field private final c:J

.field private final d:Z

.field private final e:Lcom/google/android/gms/internal/ads/Q7;

.field private final f:Lcom/google/android/gms/internal/ads/N4;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/JI0;->g:Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/ads/I1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/I1;-><init>()V

    const-string v1, "SinglePeriodTimeline"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/I1;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/I1;

    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/I1;->b(Landroid/net/Uri;)Lcom/google/android/gms/internal/ads/I1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/I1;->c()Lcom/google/android/gms/internal/ads/Q7;

    return-void
.end method

.method public constructor <init>(JJJJJJJZZZLjava/lang/Object;Lcom/google/android/gms/internal/ads/Q7;Lcom/google/android/gms/internal/ads/N4;)V
    .locals 3

    move-object v0, p0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/qm;-><init>()V

    move-wide v1, p7

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/JI0;->b:J

    move-wide v1, p9

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/JI0;->c:J

    move/from16 v1, p15

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/JI0;->d:Z

    invoke-virtual/range {p19 .. p19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v1, p19

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/JI0;->e:Lcom/google/android/gms/internal/ads/Q7;

    move-object/from16 v1, p20

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/JI0;->f:Lcom/google/android/gms/internal/ads/N4;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)I
    .locals 1

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/JI0;->g:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final b()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final c()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final d(ILcom/google/android/gms/internal/ads/pl;Z)Lcom/google/android/gms/internal/ads/pl;
    .locals 10

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/LC;->a(III)I

    if-eqz p3, :cond_0

    sget-object p1, Lcom/google/android/gms/internal/ads/JI0;->g:Ljava/lang/Object;

    :goto_0
    move-object v2, p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/JI0;->b:J

    sget-object v8, Lcom/google/android/gms/internal/ads/Cc;->e:Lcom/google/android/gms/internal/ads/Cc;

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    move-object v0, p2

    invoke-virtual/range {v0 .. v9}, Lcom/google/android/gms/internal/ads/pl;->i(Ljava/lang/Object;Ljava/lang/Object;IJJLcom/google/android/gms/internal/ads/Cc;Z)Lcom/google/android/gms/internal/ads/pl;

    return-object p2
.end method

.method public final e(ILcom/google/android/gms/internal/ads/Ql;J)Lcom/google/android/gms/internal/ads/Ql;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const/4 v2, 0x0

    const/4 v3, 0x1

    move/from16 v4, p1

    invoke-static {v4, v2, v3}, Lcom/google/android/gms/internal/ads/LC;->a(III)I

    sget-object v2, Lcom/google/android/gms/internal/ads/Ql;->o:Ljava/lang/Object;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/JI0;->e:Lcom/google/android/gms/internal/ads/Q7;

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/JI0;->c:J

    move-wide/from16 v16, v4

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/JI0;->f:Lcom/google/android/gms/internal/ads/N4;

    iget-boolean v11, v0, Lcom/google/android/gms/internal/ads/JI0;->d:Z

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/4 v4, 0x0

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-wide v7, v9

    move-wide v5, v9

    const/4 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v18, 0x0

    invoke-virtual/range {v1 .. v21}, Lcom/google/android/gms/internal/ads/Ql;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/Q7;Ljava/lang/Object;JJJZZLcom/google/android/gms/internal/ads/N4;JJIIJ)Lcom/google/android/gms/internal/ads/Ql;

    return-object p2
.end method

.method public final f(I)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/LC;->a(III)I

    sget-object p1, Lcom/google/android/gms/internal/ads/JI0;->g:Ljava/lang/Object;

    return-object p1
.end method
