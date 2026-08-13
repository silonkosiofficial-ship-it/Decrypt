.class public final Landroidx/compose/ui/platform/q0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/os/Parcel;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/platform/q0;->a:Landroid/os/Parcel;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    array-length v2, p1

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Parcel;->unmarshall([BII)V

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    return-void
.end method

.method private final a()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/q0;->a:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->dataAvail()I

    move-result v0

    return v0
.end method

.method private final b()F
    .locals 1

    invoke-direct {p0}, Landroidx/compose/ui/platform/q0;->e()F

    move-result v0

    invoke-static {v0}, LX0/a;->c(F)F

    move-result v0

    return v0
.end method

.method private final c()B
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/q0;->a:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readByte()B

    move-result v0

    return v0
.end method

.method private final e()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/q0;->a:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    return v0
.end method

.method private final i()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/q0;->a:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    return v0
.end method

.method private final j()Lo0/c2;
    .locals 8

    new-instance v7, Lo0/c2;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/q0;->d()J

    move-result-wide v1

    invoke-direct {p0}, Landroidx/compose/ui/platform/q0;->e()F

    move-result v0

    invoke-direct {p0}, Landroidx/compose/ui/platform/q0;->e()F

    move-result v3

    invoke-static {v0, v3}, Ln0/h;->a(FF)J

    move-result-wide v3

    invoke-direct {p0}, Landroidx/compose/ui/platform/q0;->e()F

    move-result v5

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lo0/c2;-><init>(JJFLy7/k;)V

    return-object v7
.end method

.method private final l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/q0;->a:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final m()LX0/k;
    .locals 6

    .prologue
    invoke-direct {p0}, Landroidx/compose/ui/platform/q0;->i()I

    move-result v0

    sget-object v1, LX0/k;->b:LX0/k$a;

    invoke-virtual {v1}, LX0/k$a;->b()LX0/k;

    move-result-object v2

    invoke-virtual {v2}, LX0/k;->e()I

    move-result v2

    and-int/2addr v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    invoke-virtual {v1}, LX0/k$a;->d()LX0/k;

    move-result-object v5

    invoke-virtual {v5}, LX0/k;->e()I

    move-result v5

    and-int/2addr v0, v5

    if-eqz v0, :cond_1

    move v0, v4

    goto :goto_1

    :cond_1
    move v0, v3

    :goto_1
    if-eqz v2, :cond_2

    if-eqz v0, :cond_2

    invoke-virtual {v1}, LX0/k$a;->b()LX0/k;

    move-result-object v0

    invoke-virtual {v1}, LX0/k$a;->d()LX0/k;

    move-result-object v2

    const/4 v5, 0x2

    new-array v5, v5, [LX0/k;

    aput-object v0, v5, v3

    aput-object v2, v5, v4

    invoke-static {v5}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, LX0/k$a;->a(Ljava/util/List;)LX0/k;

    move-result-object v0

    goto :goto_2

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v1}, LX0/k$a;->b()LX0/k;

    move-result-object v0

    goto :goto_2

    :cond_3
    if-eqz v0, :cond_4

    invoke-virtual {v1}, LX0/k$a;->d()LX0/k;

    move-result-object v0

    goto :goto_2

    :cond_4
    invoke-virtual {v1}, LX0/k$a;->c()LX0/k;

    move-result-object v0

    :goto_2
    return-object v0
.end method

.method private final n()LX0/p;
    .locals 3

    new-instance v0, LX0/p;

    invoke-direct {p0}, Landroidx/compose/ui/platform/q0;->e()F

    move-result v1

    invoke-direct {p0}, Landroidx/compose/ui/platform/q0;->e()F

    move-result v2

    invoke-direct {v0, v1, v2}, LX0/p;-><init>(FF)V

    return-object v0
.end method

.method private final p()J
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/q0;->a:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    invoke-static {v0, v1}, Li7/G;->g(J)J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public final d()J
    .locals 2

    invoke-direct {p0}, Landroidx/compose/ui/platform/q0;->p()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo0/y0;->j(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final f()I
    .locals 2

    .prologue
    invoke-direct {p0}, Landroidx/compose/ui/platform/q0;->c()B

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, LR0/o;->b:LR0/o$a;

    invoke-virtual {v0}, LR0/o$a;->b()I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget-object v0, LR0/o;->b:LR0/o$a;

    invoke-virtual {v0}, LR0/o$a;->a()I

    move-result v0

    :goto_0
    return v0
.end method

.method public final g()I
    .locals 2

    .prologue
    invoke-direct {p0}, Landroidx/compose/ui/platform/q0;->c()B

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, LR0/p;->b:LR0/p$a;

    invoke-virtual {v0}, LR0/p$a;->b()I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    sget-object v0, LR0/p;->b:LR0/p$a;

    invoke-virtual {v0}, LR0/p$a;->a()I

    move-result v0

    goto :goto_0

    :cond_2
    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    sget-object v0, LR0/p;->b:LR0/p$a;

    invoke-virtual {v0}, LR0/p$a;->c()I

    move-result v0

    goto :goto_0

    :cond_3
    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    sget-object v0, LR0/p;->b:LR0/p$a;

    invoke-virtual {v0}, LR0/p$a;->d()I

    move-result v0

    :goto_0
    return v0
.end method

.method public final h()LR0/q;
    .locals 2

    new-instance v0, LR0/q;

    invoke-direct {p0}, Landroidx/compose/ui/platform/q0;->i()I

    move-result v1

    invoke-direct {v0, v1}, LR0/q;-><init>(I)V

    return-object v0
.end method

.method public final k()LM0/C;
    .locals 22

    .prologue
    new-instance v15, Landroidx/compose/ui/platform/N0;

    move-object v0, v15

    const/16 v19, 0x3fff

    const/16 v20, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v16, 0x0

    move-object/from16 v21, v15

    move-wide/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v0 .. v20}, Landroidx/compose/ui/platform/N0;-><init>(JJLR0/q;LR0/o;LR0/p;LR0/h;Ljava/lang/String;JLX0/a;LX0/p;LT0/h;JLX0/k;Lo0/c2;ILy7/k;)V

    move-object/from16 v0, p0

    :goto_0
    iget-object v1, v0, Landroidx/compose/ui/platform/q0;->a:Landroid/os/Parcel;

    invoke-virtual {v1}, Landroid/os/Parcel;->dataAvail()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_0

    invoke-direct/range {p0 .. p0}, Landroidx/compose/ui/platform/q0;->c()B

    move-result v1

    const/16 v3, 0x8

    if-ne v1, v2, :cond_1

    invoke-direct/range {p0 .. p0}, Landroidx/compose/ui/platform/q0;->a()I

    move-result v1

    if-lt v1, v3, :cond_0

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/platform/q0;->d()J

    move-result-wide v1

    move-object/from16 v4, v21

    invoke-virtual {v4, v1, v2}, Landroidx/compose/ui/platform/N0;->c(J)V

    goto :goto_0

    :cond_0
    move-object/from16 v4, v21

    goto/16 :goto_2

    :cond_1
    move-object/from16 v4, v21

    const/4 v5, 0x2

    const/4 v6, 0x5

    if-ne v1, v5, :cond_3

    invoke-direct/range {p0 .. p0}, Landroidx/compose/ui/platform/q0;->a()I

    move-result v1

    if-lt v1, v6, :cond_d

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/platform/q0;->o()J

    move-result-wide v1

    invoke-virtual {v4, v1, v2}, Landroidx/compose/ui/platform/N0;->e(J)V

    :cond_2
    :goto_1
    move-object/from16 v21, v4

    goto :goto_0

    :cond_3
    const/4 v5, 0x3

    const/4 v7, 0x4

    if-ne v1, v5, :cond_4

    invoke-direct/range {p0 .. p0}, Landroidx/compose/ui/platform/q0;->a()I

    move-result v1

    if-lt v1, v7, :cond_d

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/platform/q0;->h()LR0/q;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroidx/compose/ui/platform/N0;->h(LR0/q;)V

    goto :goto_1

    :cond_4
    if-ne v1, v7, :cond_5

    invoke-direct/range {p0 .. p0}, Landroidx/compose/ui/platform/q0;->a()I

    move-result v1

    if-lt v1, v2, :cond_d

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/platform/q0;->f()I

    move-result v1

    invoke-static {v1}, LR0/o;->c(I)LR0/o;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroidx/compose/ui/platform/N0;->f(LR0/o;)V

    goto :goto_1

    :cond_5
    if-ne v1, v6, :cond_6

    invoke-direct/range {p0 .. p0}, Landroidx/compose/ui/platform/q0;->a()I

    move-result v1

    if-lt v1, v2, :cond_d

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/platform/q0;->g()I

    move-result v1

    invoke-static {v1}, LR0/p;->e(I)LR0/p;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroidx/compose/ui/platform/N0;->g(LR0/p;)V

    goto :goto_1

    :cond_6
    const/4 v2, 0x6

    if-ne v1, v2, :cond_7

    invoke-direct/range {p0 .. p0}, Landroidx/compose/ui/platform/q0;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroidx/compose/ui/platform/N0;->d(Ljava/lang/String;)V

    goto :goto_1

    :cond_7
    const/4 v2, 0x7

    if-ne v1, v2, :cond_8

    invoke-direct/range {p0 .. p0}, Landroidx/compose/ui/platform/q0;->a()I

    move-result v1

    if-lt v1, v6, :cond_d

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/platform/q0;->o()J

    move-result-wide v1

    invoke-virtual {v4, v1, v2}, Landroidx/compose/ui/platform/N0;->i(J)V

    goto :goto_1

    :cond_8
    if-ne v1, v3, :cond_9

    invoke-direct/range {p0 .. p0}, Landroidx/compose/ui/platform/q0;->a()I

    move-result v1

    if-lt v1, v7, :cond_d

    invoke-direct/range {p0 .. p0}, Landroidx/compose/ui/platform/q0;->b()F

    move-result v1

    invoke-static {v1}, LX0/a;->b(F)LX0/a;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroidx/compose/ui/platform/N0;->b(LX0/a;)V

    goto :goto_1

    :cond_9
    const/16 v2, 0x9

    if-ne v1, v2, :cond_a

    invoke-direct/range {p0 .. p0}, Landroidx/compose/ui/platform/q0;->a()I

    move-result v1

    if-lt v1, v3, :cond_d

    invoke-direct/range {p0 .. p0}, Landroidx/compose/ui/platform/q0;->n()LX0/p;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroidx/compose/ui/platform/N0;->l(LX0/p;)V

    goto :goto_1

    :cond_a
    const/16 v2, 0xa

    if-ne v1, v2, :cond_b

    invoke-direct/range {p0 .. p0}, Landroidx/compose/ui/platform/q0;->a()I

    move-result v1

    if-lt v1, v3, :cond_d

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/platform/q0;->d()J

    move-result-wide v1

    invoke-virtual {v4, v1, v2}, Landroidx/compose/ui/platform/N0;->a(J)V

    goto/16 :goto_1

    :cond_b
    const/16 v2, 0xb

    if-ne v1, v2, :cond_c

    invoke-direct/range {p0 .. p0}, Landroidx/compose/ui/platform/q0;->a()I

    move-result v1

    if-lt v1, v7, :cond_d

    invoke-direct/range {p0 .. p0}, Landroidx/compose/ui/platform/q0;->m()LX0/k;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroidx/compose/ui/platform/N0;->k(LX0/k;)V

    goto/16 :goto_1

    :cond_c
    const/16 v2, 0xc

    if-ne v1, v2, :cond_2

    invoke-direct/range {p0 .. p0}, Landroidx/compose/ui/platform/q0;->a()I

    move-result v1

    const/16 v2, 0x14

    if-lt v1, v2, :cond_d

    invoke-direct/range {p0 .. p0}, Landroidx/compose/ui/platform/q0;->j()Lo0/c2;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroidx/compose/ui/platform/N0;->j(Lo0/c2;)V

    goto/16 :goto_1

    :cond_d
    :goto_2
    invoke-virtual {v4}, Landroidx/compose/ui/platform/N0;->m()LM0/C;

    move-result-object v1

    return-object v1
.end method

.method public final o()J
    .locals 4

    .prologue
    invoke-direct {p0}, Landroidx/compose/ui/platform/q0;->c()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget-object v0, LY0/z;->b:LY0/z$a;

    invoke-virtual {v0}, LY0/z$a;->b()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    sget-object v0, LY0/z;->b:LY0/z$a;

    invoke-virtual {v0}, LY0/z$a;->a()J

    move-result-wide v0

    goto :goto_0

    :cond_1
    sget-object v0, LY0/z;->b:LY0/z$a;

    invoke-virtual {v0}, LY0/z$a;->c()J

    move-result-wide v0

    :goto_0
    sget-object v2, LY0/z;->b:LY0/z$a;

    invoke-virtual {v2}, LY0/z$a;->c()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LY0/z;->g(JJ)Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v0, LY0/x;->b:LY0/x$a;

    invoke-virtual {v0}, LY0/x$a;->a()J

    move-result-wide v0

    return-wide v0

    :cond_2
    invoke-direct {p0}, Landroidx/compose/ui/platform/q0;->e()F

    move-result v2

    invoke-static {v2, v0, v1}, LY0/y;->a(FJ)J

    move-result-wide v0

    return-wide v0
.end method
