.class public final LS/L;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LE7/i;

.field private final b:LS/P0;

.field private final c:LT/k;

.field private final d:LS/Q;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;

.field private final h:Ljava/lang/String;

.field private i:Ljava/lang/Long;

.field private j:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LE7/i;LS/P0;LT/k;LS/Q;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS/L;->a:LE7/i;

    iput-object p2, p0, LS/L;->b:LS/P0;

    iput-object p3, p0, LS/L;->c:LT/k;

    iput-object p4, p0, LS/L;->d:LS/Q;

    iput-object p5, p0, LS/L;->e:Ljava/lang/String;

    iput-object p6, p0, LS/L;->f:Ljava/lang/String;

    iput-object p7, p0, LS/L;->g:Ljava/lang/String;

    iput-object p8, p0, LS/L;->h:Ljava/lang/String;

    iput-object p9, p0, LS/L;->i:Ljava/lang/Long;

    iput-object p10, p0, LS/L;->j:Ljava/lang/Long;

    return-void
.end method

.method public synthetic constructor <init>(LE7/i;LS/P0;LT/k;LS/Q;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;ILy7/k;)V
    .locals 14

    .prologue
    move/from16 v0, p11

    and-int/lit16 v1, v0, 0x100

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v12, v2

    goto :goto_0

    :cond_0
    move-object/from16 v12, p9

    :goto_0
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_1

    move-object v13, v2

    goto :goto_1

    :cond_1
    move-object/from16 v13, p10

    :goto_1
    move-object v3, p0

    move-object v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    invoke-direct/range {v3 .. v13}, LS/L;-><init>(LE7/i;LS/P0;LT/k;LS/Q;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, LS/L;->i:Ljava/lang/Long;

    return-void
.end method

.method public final b(LT/e;ILjava/util/Locale;)Ljava/lang/String;
    .locals 10

    .prologue
    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-string v3, "format(this, *args)"

    if-nez p1, :cond_0

    iget-object p1, p0, LS/L;->e:Ljava/lang/String;

    iget-object p2, p0, LS/L;->c:LT/k;

    invoke-virtual {p2}, LT/k;->b()Ljava/lang/String;

    move-result-object p2

    sget-object p3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p2, p3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "this as java.lang.String).toUpperCase(Locale.ROOT)"

    invoke-static {p2, p3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-array p3, v2, [Ljava/lang/Object;

    aput-object p2, p3, v1

    invoke-static {p3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-static {p1, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    iget-object v4, p0, LS/L;->a:LE7/i;

    invoke-virtual {p1}, LT/e;->m()I

    move-result v5

    invoke-virtual {v4, v5}, LE7/i;->D(I)Z

    move-result v4

    if-nez v4, :cond_1

    iget-object p1, p0, LS/L;->f:Ljava/lang/String;

    iget-object p2, p0, LS/L;->a:LE7/i;

    invoke-virtual {p2}, LE7/g;->f()I

    move-result v4

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, LS/p;->c(IIIZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    iget-object p3, p0, LS/L;->a:LE7/i;

    invoke-virtual {p3}, LE7/g;->g()I

    move-result v4

    invoke-static/range {v4 .. v9}, LS/p;->c(IIIZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    new-array v4, v0, [Ljava/lang/Object;

    aput-object p2, v4, v1

    aput-object p3, v4, v2

    invoke-static {v4, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object v0, p0, LS/L;->b:LS/P0;

    invoke-virtual {p1}, LT/e;->m()I

    move-result v4

    invoke-interface {v0, v4}, LS/P0;->b(I)Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-virtual {p1}, LT/e;->i()J

    move-result-wide v4

    invoke-interface {v0, v4, v5}, LS/P0;->a(J)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_3

    :cond_2
    sget-object p3, LS/j0;->a:LS/j0$a;

    invoke-virtual {p3}, LS/j0$a;->c()I

    move-result v0

    invoke-static {p2, v0}, LS/j0;->e(II)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, LT/e;->i()J

    move-result-wide v0

    iget-object v2, p0, LS/L;->j:Ljava/lang/Long;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    goto :goto_1

    :cond_3
    const-wide v2, 0x7fffffffffffffffL

    :goto_1
    cmp-long v0, v0, v2

    if-gez v0, :cond_6

    :cond_4
    invoke-virtual {p3}, LS/j0$a;->a()I

    move-result p3

    invoke-static {p2, p3}, LS/j0;->e(II)Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-virtual {p1}, LT/e;->i()J

    move-result-wide p1

    iget-object p3, p0, LS/L;->i:Ljava/lang/Long;

    if-eqz p3, :cond_5

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_2

    :cond_5
    const-wide/high16 v0, -0x8000000000000000L

    :goto_2
    cmp-long p1, p1, v0

    if-gez p1, :cond_7

    :cond_6
    iget-object p1, p0, LS/L;->h:Ljava/lang/String;

    return-object p1

    :cond_7
    const-string p1, ""

    return-object p1

    :cond_8
    :goto_3
    iget-object p2, p0, LS/L;->g:Ljava/lang/String;

    iget-object v4, p0, LS/L;->d:LS/Q;

    invoke-virtual {p1}, LT/e;->i()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v6, p3

    invoke-static/range {v4 .. v9}, LS/P;->a(LS/Q;Ljava/lang/Long;Ljava/util/Locale;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-array p3, v2, [Ljava/lang/Object;

    aput-object p1, p3, v1

    invoke-static {p3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_0
.end method
