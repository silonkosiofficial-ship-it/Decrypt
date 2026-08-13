.class public final LT/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/window/r;


# instance fields
.field private final a:J

.field private final b:LY0/e;

.field private final c:I

.field private final d:Lx7/p;

.field private final e:LT/u$a;

.field private final f:LT/u$a;

.field private final g:LT/u$a;

.field private final h:LT/u$a;

.field private final i:LT/u$b;

.field private final j:LT/u$b;

.field private final k:LT/u$b;

.field private final l:LT/u$b;

.field private final m:LT/u$b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(JLY0/e;ILx7/p;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LT/m;->a:J

    iput-object p3, p0, LT/m;->b:LY0/e;

    iput p4, p0, LT/m;->c:I

    iput-object p5, p0, LT/m;->d:Lx7/p;

    invoke-static {p1, p2}, LY0/k;->e(J)F

    move-result p5

    invoke-interface {p3, p5}, LY0/e;->S0(F)I

    move-result p5

    sget-object v0, LT/u;->a:LT/u;

    invoke-virtual {v0, p5}, LT/u;->g(I)LT/u$a;

    move-result-object v1

    iput-object v1, p0, LT/m;->e:LT/u$a;

    invoke-virtual {v0, p5}, LT/u;->d(I)LT/u$a;

    move-result-object p5

    iput-object p5, p0, LT/m;->f:LT/u$a;

    const/4 p5, 0x0

    invoke-virtual {v0, p5}, LT/u;->e(I)LT/u$a;

    move-result-object v1

    iput-object v1, p0, LT/m;->g:LT/u$a;

    invoke-virtual {v0, p5}, LT/u;->f(I)LT/u$a;

    move-result-object p5

    iput-object p5, p0, LT/m;->h:LT/u$a;

    invoke-static {p1, p2}, LY0/k;->f(J)F

    move-result p1

    invoke-interface {p3, p1}, LY0/e;->S0(F)I

    move-result p1

    invoke-virtual {v0, p1}, LT/u;->h(I)LT/u$b;

    move-result-object p2

    iput-object p2, p0, LT/m;->i:LT/u$b;

    invoke-virtual {v0, p1}, LT/u;->a(I)LT/u$b;

    move-result-object p2

    iput-object p2, p0, LT/m;->j:LT/u$b;

    invoke-virtual {v0, p1}, LT/u;->c(I)LT/u$b;

    move-result-object p1

    iput-object p1, p0, LT/m;->k:LT/u$b;

    invoke-virtual {v0, p4}, LT/u;->i(I)LT/u$b;

    move-result-object p1

    iput-object p1, p0, LT/m;->l:LT/u$b;

    invoke-virtual {v0, p4}, LT/u;->b(I)LT/u$b;

    move-result-object p1

    iput-object p1, p0, LT/m;->m:LT/u$b;

    return-void
.end method

.method public synthetic constructor <init>(JLY0/e;ILx7/p;ILy7/k;)V
    .locals 7

    .prologue
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    invoke-static {}, LS/s0;->j()F

    move-result p4

    invoke-interface {p3, p4}, LY0/e;->S0(F)I

    move-result p4

    :cond_0
    move v4, p4

    and-int/lit8 p4, p6, 0x8

    if-eqz p4, :cond_1

    sget-object p5, LT/m$a;->D:LT/m$a;

    :cond_1
    move-object v5, p5

    const/4 v6, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    invoke-direct/range {v0 .. v6}, LT/m;-><init>(JLY0/e;ILx7/p;Ly7/k;)V

    return-void
.end method

.method public synthetic constructor <init>(JLY0/e;ILx7/p;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, LT/m;-><init>(JLY0/e;ILx7/p;)V

    return-void
.end method


# virtual methods
.method public a(LY0/r;JLY0/v;J)J
    .locals 15

    .prologue
    move-object v0, p0

    move-object/from16 v7, p1

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v10, 0x1

    iget-object v1, v0, LT/m;->e:LT/u$a;

    iget-object v2, v0, LT/m;->f:LT/u$a;

    invoke-virtual/range {p1 .. p1}, LY0/r;->e()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/p;->h(J)I

    move-result v3

    invoke-static/range {p2 .. p3}, LY0/t;->g(J)I

    move-result v4

    const/4 v11, 0x2

    div-int/2addr v4, v11

    if-ge v3, v4, :cond_0

    iget-object v3, v0, LT/m;->g:LT/u$a;

    goto :goto_0

    :cond_0
    iget-object v3, v0, LT/m;->h:LT/u$a;

    :goto_0
    new-array v4, v8, [LT/u$a;

    aput-object v1, v4, v9

    aput-object v2, v4, v10

    aput-object v3, v4, v11

    invoke-static {v4}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v13

    move v14, v9

    :goto_1
    if-ge v14, v13, :cond_2

    invoke-interface {v12, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LT/u$a;

    invoke-static/range {p5 .. p6}, LY0/t;->g(J)I

    move-result v5

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    move-object/from16 v6, p4

    invoke-interface/range {v1 .. v6}, LT/u$a;->a(LY0/r;JILY0/v;)I

    move-result v1

    invoke-static {v12}, Lj7/v;->o(Ljava/util/List;)I

    move-result v2

    if-eq v14, v2, :cond_3

    if-ltz v1, :cond_1

    invoke-static/range {p5 .. p6}, LY0/t;->g(J)I

    move-result v2

    add-int/2addr v2, v1

    invoke-static/range {p2 .. p3}, LY0/t;->g(J)I

    move-result v3

    if-gt v2, v3, :cond_1

    goto :goto_2

    :cond_1
    add-int/2addr v14, v10

    goto :goto_1

    :cond_2
    move v1, v9

    :cond_3
    :goto_2
    iget-object v2, v0, LT/m;->i:LT/u$b;

    iget-object v3, v0, LT/m;->j:LT/u$b;

    iget-object v4, v0, LT/m;->k:LT/u$b;

    invoke-virtual/range {p1 .. p1}, LY0/r;->e()J

    move-result-wide v5

    invoke-static {v5, v6}, LY0/p;->i(J)I

    move-result v5

    invoke-static/range {p2 .. p3}, LY0/t;->f(J)I

    move-result v6

    div-int/2addr v6, v11

    if-ge v5, v6, :cond_4

    iget-object v5, v0, LT/m;->l:LT/u$b;

    goto :goto_3

    :cond_4
    iget-object v5, v0, LT/m;->m:LT/u$b;

    :goto_3
    const/4 v6, 0x4

    new-array v6, v6, [LT/u$b;

    aput-object v2, v6, v9

    aput-object v3, v6, v10

    aput-object v4, v6, v11

    aput-object v5, v6, v8

    invoke-static {v6}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    move v4, v9

    :goto_4
    if-ge v4, v3, :cond_7

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LT/u$b;

    invoke-static/range {p5 .. p6}, LY0/t;->f(J)I

    move-result v6

    move-wide/from16 v11, p2

    invoke-interface {v5, v7, v11, v12, v6}, LT/u$b;->a(LY0/r;JI)I

    move-result v5

    invoke-static {v2}, Lj7/v;->o(Ljava/util/List;)I

    move-result v6

    if-eq v4, v6, :cond_6

    iget v6, v0, LT/m;->c:I

    if-lt v5, v6, :cond_5

    invoke-static/range {p5 .. p6}, LY0/t;->f(J)I

    move-result v6

    add-int/2addr v6, v5

    invoke-static/range {p2 .. p3}, LY0/t;->f(J)I

    move-result v8

    iget v13, v0, LT/m;->c:I

    sub-int/2addr v8, v13

    if-gt v6, v8, :cond_5

    goto :goto_5

    :cond_5
    add-int/2addr v4, v10

    goto :goto_4

    :cond_6
    :goto_5
    move v9, v5

    :cond_7
    invoke-static {v1, v9}, LY0/q;->a(II)J

    move-result-wide v1

    iget-object v3, v0, LT/m;->d:Lx7/p;

    move-wide/from16 v4, p5

    invoke-static {v1, v2, v4, v5}, LY0/s;->a(JJ)LY0/r;

    move-result-object v4

    invoke-interface {v3, v7, v4}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-wide v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LT/m;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LT/m;

    iget-wide v3, p0, LT/m;->a:J

    iget-wide v5, p1, LT/m;->a:J

    invoke-static {v3, v4, v5, v6}, LY0/k;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LT/m;->b:LY0/e;

    iget-object v3, p1, LT/m;->b:LY0/e;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, LT/m;->c:I

    iget v3, p1, LT/m;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LT/m;->d:Lx7/p;

    iget-object p1, p1, LT/m;->d:Lx7/p;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, LT/m;->a:J

    invoke-static {v0, v1}, LY0/k;->g(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LT/m;->b:LY0/e;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LT/m;->c:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LT/m;->d:Lx7/p;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DropdownMenuPositionProvider(contentOffset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LT/m;->a:J

    invoke-static {v1, v2}, LY0/k;->h(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", density="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LT/m;->b:LY0/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", verticalMargin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LT/m;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", onPositionCalculated="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LT/m;->d:Lx7/p;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
