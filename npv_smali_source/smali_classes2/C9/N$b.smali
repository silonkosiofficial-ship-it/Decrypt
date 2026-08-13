.class final LC9/N$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC9/N;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private C:I

.field private D:Ljava/lang/String;

.field private E:C

.field private F:C

.field private G:LS8/o;

.field private H:Ljava/lang/String;

.field private I:LD9/c;

.field private J:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(ILjava/lang/String;CCLS8/o;Ljava/lang/String;LD9/c;)V
    .locals 1

    const-string v0, "prefix"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LC9/N$b;->C:I

    iput-object p2, p0, LC9/N$b;->D:Ljava/lang/String;

    iput-char p3, p0, LC9/N$b;->E:C

    iput-char p4, p0, LC9/N$b;->F:C

    iput-object p5, p0, LC9/N$b;->G:LS8/o;

    iput-object p6, p0, LC9/N$b;->H:Ljava/lang/String;

    iput-object p7, p0, LC9/N$b;->I:LD9/c;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, LC9/N$b;->J:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;CCLS8/o;Ljava/lang/String;LD9/c;ILy7/k;)V
    .locals 5

    .prologue
    and-int/lit8 p9, p8, 0x1

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move p9, v0

    goto :goto_0

    :cond_0
    move p9, p1

    :goto_0
    and-int/lit8 p1, p8, 0x2

    if-eqz p1, :cond_1

    const-string p2, ""

    :cond_1
    move-object v1, p2

    and-int/lit8 p1, p8, 0x4

    if-eqz p1, :cond_2

    move v2, v0

    goto :goto_1

    :cond_2
    move v2, p3

    :goto_1
    and-int/lit8 p1, p8, 0x8

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    move v0, p4

    :goto_2
    and-int/lit8 p1, p8, 0x10

    const/4 p2, 0x0

    if-eqz p1, :cond_4

    move-object v3, p2

    goto :goto_3

    :cond_4
    move-object v3, p5

    :goto_3
    and-int/lit8 p1, p8, 0x20

    if-eqz p1, :cond_5

    move-object v4, p2

    goto :goto_4

    :cond_5
    move-object v4, p6

    :goto_4
    and-int/lit8 p1, p8, 0x40

    if-eqz p1, :cond_6

    move-object p8, p2

    goto :goto_5

    :cond_6
    move-object p8, p7

    :goto_5
    move-object p1, p0

    move p2, p9

    move-object p3, v1

    move p4, v2

    move p5, v0

    move-object p6, v3

    move-object p7, v4

    invoke-direct/range {p1 .. p8}, LC9/N$b;-><init>(ILjava/lang/String;CCLS8/o;Ljava/lang/String;LD9/c;)V

    return-void
.end method

.method private final g([LC9/N$b;LC9/N$b;)[LC9/N$b;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/4 p1, 0x1

    new-array p1, p1, [LC9/N$b;

    const/4 v0, 0x0

    aput-object p2, p1, v0

    return-object p1

    :cond_0
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string v0, "copyOf(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, [LC9/N$b;

    invoke-static {p1, p2}, Lj7/n;->G([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [LC9/N$b;

    return-object p1
.end method

.method private final o(Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .prologue
    const-string v0, "{"

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, LS8/r;->V(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "}"

    invoke-static {p1, v0, v1, v2, v3}, LS8/r;->J(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object v3

    :cond_0
    const/4 v8, 0x6

    const/4 v9, 0x0

    const-string v5, "{"

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v4, p1

    invoke-static/range {v4 .. v9}, LS8/r;->p0(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v0

    const/4 v5, 0x6

    const/4 v6, 0x0

    const-string v2, "}"

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, LS8/r;->p0(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v1

    const/4 v6, 0x6

    const/4 v7, 0x0

    const-string v3, ":"

    const/4 v5, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v7}, LS8/r;->p0(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    :cond_1
    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const-string v0, "substring(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LC9/N$b;

    invoke-virtual {p0, p1}, LC9/N$b;->m(LC9/N$b;)I

    move-result p1

    return p1
.end method

.method public final e(LC9/N$b;Ljava/lang/String;)LC9/N$b;
    .locals 19

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "child"

    invoke-static {v1, v3}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "search"

    invoke-static {v2, v3}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, LC9/N$b;->v(Ljava/lang/String;)LC9/N$c;

    move-result-object v3

    invoke-virtual {v3}, LC9/N$c;->b()I

    move-result v5

    invoke-virtual {v3}, LC9/N$c;->d()I

    move-result v4

    invoke-virtual {v3}, LC9/N$c;->a()I

    move-result v6

    if-eqz v5, :cond_4

    const/4 v7, 0x1

    if-ne v5, v7, :cond_0

    invoke-virtual {v3}, LC9/N$c;->c()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v1, LC9/N$b;->D:Ljava/lang/String;

    new-instance v7, LS8/o;

    invoke-virtual {v3}, LC9/N$c;->c()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, LS8/o;-><init>(Ljava/lang/String;)V

    iput-object v7, v1, LC9/N$b;->G:LS8/o;

    :cond_0
    const-string v7, "substring(...)"

    const/4 v8, 0x0

    if-nez v4, :cond_3

    iput v5, v1, LC9/N$b;->C:I

    const/4 v4, 0x3

    if-ne v5, v4, :cond_1

    const/4 v6, -0x1

    :cond_1
    if-gez v6, :cond_2

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v6

    :cond_2
    invoke-virtual {v3}, LC9/N$c;->e()C

    move-result v3

    iput-char v3, v1, LC9/N$b;->F:C

    invoke-direct {v0, v2}, LC9/N$b;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, LC9/N$b;->H:Ljava/lang/String;

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v3

    if-eq v6, v3, :cond_4

    invoke-virtual {v2, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v7}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v8}, Ljava/lang/String;->charAt(I)C

    move-result v12

    new-instance v3, LC9/N$b;

    const/16 v17, 0x78

    const/16 v18, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v9, v3

    move-object v11, v2

    invoke-direct/range {v9 .. v18}, LC9/N$b;-><init>(ILjava/lang/String;CCLS8/o;Ljava/lang/String;LD9/c;ILy7/k;)V

    invoke-virtual {v1, v3, v2}, LC9/N$b;->e(LC9/N$b;Ljava/lang/String;)LC9/N$b;

    move-result-object v2

    goto :goto_0

    :cond_3
    if-lez v4, :cond_4

    iput v8, v1, LC9/N$b;->C:I

    invoke-virtual {v2, v8, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v7}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v6, v1, LC9/N$b;->D:Ljava/lang/String;

    const/4 v6, 0x0

    iput-object v6, v1, LC9/N$b;->G:LS8/o;

    invoke-virtual {v2, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v7}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v14, LC9/N$b;

    invoke-virtual {v2, v8}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-virtual {v3}, LC9/N$c;->e()C

    move-result v8

    invoke-direct {v0, v2}, LC9/N$b;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/16 v12, 0x52

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object v4, v14

    invoke-direct/range {v4 .. v13}, LC9/N$b;-><init>(ILjava/lang/String;CCLS8/o;Ljava/lang/String;LD9/c;ILy7/k;)V

    invoke-virtual {v1, v14, v2}, LC9/N$b;->e(LC9/N$b;Ljava/lang/String;)LC9/N$b;

    move-result-object v2

    goto :goto_0

    :cond_4
    move-object v2, v1

    :goto_0
    iget-object v3, v0, LC9/N$b;->J:Ljava/util/LinkedHashMap;

    iget v4, v1, LC9/N$b;->C:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget-object v5, v0, LC9/N$b;->J:Ljava/util/LinkedHashMap;

    iget v6, v1, LC9/N$b;->C:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [LC9/N$b;

    invoke-direct {v0, v5, v1}, LC9/N$b;->g([LC9/N$b;LC9/N$b;)[LC9/N$b;

    move-result-object v1

    invoke-virtual {v0, v1}, LC9/N$b;->x([LC9/N$b;)V

    invoke-interface {v3, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LC9/N$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LC9/N$b;

    iget v1, p0, LC9/N$b;->C:I

    iget v3, p1, LC9/N$b;->C:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LC9/N$b;->D:Ljava/lang/String;

    iget-object v3, p1, LC9/N$b;->D:Ljava/lang/String;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-char v1, p0, LC9/N$b;->E:C

    iget-char v3, p1, LC9/N$b;->E:C

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-char v1, p0, LC9/N$b;->F:C

    iget-char v3, p1, LC9/N$b;->F:C

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, LC9/N$b;->G:LS8/o;

    iget-object v3, p1, LC9/N$b;->G:LS8/o;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, LC9/N$b;->H:Ljava/lang/String;

    iget-object v3, p1, LC9/N$b;->H:Ljava/lang/String;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, LC9/N$b;->I:LD9/c;

    iget-object p1, p1, LC9/N$b;->I:LD9/c;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    iget v0, p0, LC9/N$b;->C:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LC9/N$b;->D:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-char v1, p0, LC9/N$b;->E:C

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-char v1, p0, LC9/N$b;->F:C

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LC9/N$b;->G:LS8/o;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LC9/N$b;->H:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LC9/N$b;->I:LD9/c;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public final i(LD9/c;)V
    .locals 0

    iput-object p1, p0, LC9/N$b;->I:LD9/c;

    return-void
.end method

.method public m(LC9/N$b;)I
    .locals 1

    const-string v0, "other"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-char v0, p0, LC9/N$b;->E:C

    iget-char p1, p1, LC9/N$b;->E:C

    sub-int/2addr v0, p1

    return v0
.end method

.method public final n([LC9/N$b;C)LC9/N$b;
    .locals 5

    .prologue
    const-string v0, "ns"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    add-int/lit8 v1, v0, -0x1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-gt v2, v1, :cond_2

    sub-int v3, v1, v2

    div-int/lit8 v3, v3, 0x2

    add-int/2addr v3, v2

    aget-object v4, p1, v3

    iget-char v4, v4, LC9/N$b;->E:C

    invoke-static {p2, v4}, Ly7/t;->g(II)I

    move-result v4

    if-lez v4, :cond_0

    add-int/lit8 v2, v3, 0x1

    goto :goto_0

    :cond_0
    aget-object v4, p1, v3

    iget-char v4, v4, LC9/N$b;->E:C

    invoke-static {p2, v4}, Ly7/t;->g(II)I

    move-result v4

    if-gez v4, :cond_1

    add-int/lit8 v1, v3, -0x1

    goto :goto_0

    :cond_1
    move v2, v0

    goto :goto_0

    :cond_2
    aget-object p1, p1, v3

    iget-char v0, p1, LC9/N$b;->E:C

    if-eq v0, p2, :cond_3

    const/4 p1, 0x0

    :cond_3
    return-object p1
.end method

.method public final q(LC9/J;Ljava/lang/String;)LD9/c;
    .locals 22

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v8, p2

    const-string v2, "rctx"

    invoke-static {v1, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "path"

    invoke-static {v8, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v9, 0x0

    move v10, v9

    :goto_0
    const/4 v2, 0x4

    const/4 v3, 0x0

    if-ge v10, v2, :cond_13

    iget-object v2, v0, LC9/N$b;->J:Ljava/util/LinkedHashMap;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, [LC9/N$b;

    if-nez v11, :cond_0

    goto/16 :goto_6

    :cond_0
    invoke-interface/range {p2 .. p2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_1

    invoke-virtual {v8, v9}, Ljava/lang/String;->charAt(I)C

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v9

    :goto_1
    const/4 v4, 0x2

    const-string v12, "substring(...)"

    if-eqz v10, :cond_d

    const/4 v13, 0x1

    if-eq v10, v13, :cond_3

    if-eq v10, v4, :cond_3

    invoke-interface/range {p2 .. p2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_2

    invoke-virtual/range {p1 .. p2}, LC9/J;->g(Ljava/lang/String;)V

    :cond_2
    aget-object v2, v11, v9

    const-string v3, ""

    goto/16 :goto_5

    :cond_3
    invoke-interface/range {p2 .. p2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_4

    goto/16 :goto_6

    :cond_4
    move v14, v9

    :goto_2
    array-length v2, v11

    if-ge v14, v2, :cond_c

    aget-object v15, v11, v14

    iget v2, v15, LC9/N$b;->C:I

    if-eqz v2, :cond_5

    iget-object v2, v15, LC9/N$b;->H:Ljava/lang/String;

    if-eqz v2, :cond_5

    invoke-virtual/range {p1 .. p1}, LC9/J;->a()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    iget-char v3, v15, LC9/N$b;->F:C

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v2, p2

    invoke-static/range {v2 .. v7}, LS8/r;->o0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v2

    if-gez v2, :cond_7

    iget-char v2, v15, LC9/N$b;->F:C

    const/16 v3, 0x2f

    if-ne v2, v3, :cond_6

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v2

    goto :goto_4

    :cond_6
    :goto_3
    add-int/lit8 v14, v14, 0x1

    move-object v3, v15

    goto :goto_2

    :cond_7
    :goto_4
    iget-object v3, v15, LC9/N$b;->G:LS8/o;

    if-ne v10, v13, :cond_8

    if-eqz v3, :cond_8

    invoke-virtual {v8, v9, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v12}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, LS8/o;->d(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_3

    :cond_8
    invoke-virtual {v8, v9, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v12}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v20, 0x6

    const/16 v21, 0x0

    const/16 v17, 0x2f

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v3

    invoke-static/range {v16 .. v21}, LS8/r;->o0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_9

    goto :goto_3

    :cond_9
    invoke-virtual/range {p1 .. p1}, LC9/J;->c()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v8, v9, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v12}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v4}, LC9/J;->g(Ljava/lang/String;)V

    invoke-virtual {v8, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v12}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_a

    invoke-virtual {v15}, LC9/N$b;->t()Z

    move-result v4

    if-eqz v4, :cond_a

    iget-object v4, v15, LC9/N$b;->I:LD9/c;

    if-eqz v4, :cond_a

    invoke-virtual/range {p1 .. p1}, LC9/J;->d()V

    return-object v4

    :cond_a
    invoke-virtual {v15, v1, v2}, LC9/N$b;->q(LC9/J;Ljava/lang/String;)LD9/c;

    move-result-object v2

    if-eqz v2, :cond_b

    return-object v2

    :cond_b
    invoke-virtual {v1, v3}, LC9/J;->f(I)V

    goto :goto_3

    :cond_c
    move-object v2, v3

    move-object v3, v8

    goto :goto_5

    :cond_d
    invoke-virtual {v0, v11, v2}, LC9/N$b;->n([LC9/N$b;C)LC9/N$b;

    move-result-object v2

    if-eqz v2, :cond_12

    iget-object v5, v2, LC9/N$b;->D:Ljava/lang/String;

    invoke-static {v8, v5, v9, v4, v3}, LS8/r;->V(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_e

    goto :goto_6

    :cond_e
    iget-object v3, v2, LC9/N$b;->D:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v8, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v12}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_5
    if-nez v2, :cond_f

    goto :goto_6

    :cond_f
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_10

    invoke-virtual {v2}, LC9/N$b;->t()Z

    move-result v4

    if-eqz v4, :cond_10

    iget-object v4, v2, LC9/N$b;->I:LD9/c;

    if-eqz v4, :cond_10

    invoke-virtual/range {p1 .. p1}, LC9/J;->d()V

    return-object v4

    :cond_10
    invoke-virtual {v2, v1, v3}, LC9/N$b;->q(LC9/J;Ljava/lang/String;)LD9/c;

    move-result-object v3

    if-eqz v3, :cond_11

    return-object v3

    :cond_11
    iget v2, v2, LC9/N$b;->C:I

    if-lez v2, :cond_12

    invoke-virtual/range {p1 .. p1}, LC9/J;->e()V

    :cond_12
    :goto_6
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    :cond_13
    return-object v3
.end method

.method public final r(ICCLjava/lang/String;)LC9/N$b;
    .locals 5

    .prologue
    const-string v0, "prefix"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LC9/N$b;->J:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LC9/N$b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const/4 v2, 0x0

    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_3

    aget-object v3, v0, v2

    iget-char v4, v3, LC9/N$b;->E:C

    if-ne v4, p2, :cond_1

    iget-char v4, v3, LC9/N$b;->F:C

    if-ne v4, p3, :cond_1

    const/4 v4, 0x1

    if-ne p1, v4, :cond_2

    iget-object v3, v3, LC9/N$b;->D:Ljava/lang/String;

    invoke-static {v3, p4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    aget-object p1, v0, v2

    return-object p1

    :cond_3
    return-object v1
.end method

.method public final s(Ljava/lang/String;LD9/c;)LC9/N$b;
    .locals 24

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "pattern"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "route"

    invoke-static {v1, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v13, v0

    move-object v2, v3

    :goto_0
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v13, v1}, LC9/N$b;->i(LD9/c;)V

    return-object v13

    :cond_0
    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v4, 0x2a

    if-eq v6, v4, :cond_1

    const/16 v4, 0x7b

    if-eq v6, v4, :cond_1

    new-instance v4, LC9/N$c;

    const/16 v20, 0x1f

    const/16 v21, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v14, v4

    invoke-direct/range {v14 .. v21}, LC9/N$c;-><init>(ILjava/lang/String;CIIILy7/k;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v2}, LC9/N$b;->v(Ljava/lang/String;)LC9/N$c;

    move-result-object v4

    :goto_1
    invoke-virtual {v4}, LC9/N$c;->b()I

    move-result v5

    const/4 v7, 0x1

    if-ne v5, v7, :cond_2

    invoke-virtual {v4}, LC9/N$c;->c()Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :cond_2
    const-string v5, ""

    :goto_2
    invoke-virtual {v4}, LC9/N$c;->b()I

    move-result v7

    invoke-virtual {v4}, LC9/N$c;->e()C

    move-result v8

    invoke-virtual {v13, v7, v6, v8, v5}, LC9/N$b;->r(ICCLjava/lang/String;)LC9/N$b;

    move-result-object v5

    if-nez v5, :cond_3

    invoke-virtual {v4}, LC9/N$c;->e()C

    move-result v7

    new-instance v14, LC9/N$b;

    const/16 v11, 0x71

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v3, v14

    move-object v5, v2

    invoke-direct/range {v3 .. v12}, LC9/N$b;-><init>(ILjava/lang/String;CCLS8/o;Ljava/lang/String;LD9/c;ILy7/k;)V

    invoke-virtual {v13, v14, v2}, LC9/N$b;->e(LC9/N$b;Ljava/lang/String;)LC9/N$b;

    move-result-object v2

    :goto_3
    invoke-virtual {v2, v1}, LC9/N$b;->i(LD9/c;)V

    return-object v2

    :cond_3
    iget v6, v5, LC9/N$b;->C:I

    const-string v7, "substring(...)"

    if-lez v6, :cond_4

    invoke-virtual {v4}, LC9/N$c;->a()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    :goto_4
    invoke-static {v2, v7}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v13, v5

    goto :goto_0

    :cond_4
    iget-object v6, v5, LC9/N$b;->D:Ljava/lang/String;

    invoke-virtual {v0, v2, v6}, LC9/N$b;->u(Ljava/lang/String;Ljava/lang/String;)I

    move-result v6

    iget-object v8, v5, LC9/N$b;->D:Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    if-ne v6, v8, :cond_5

    invoke-virtual {v2, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_4

    :cond_5
    new-instance v8, LC9/N$b;

    invoke-virtual {v2, v3, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v7}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v22, 0x7c

    const/16 v23, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object v14, v8

    move-object/from16 v16, v9

    invoke-direct/range {v14 .. v23}, LC9/N$b;-><init>(ILjava/lang/String;CCLS8/o;Ljava/lang/String;LD9/c;ILy7/k;)V

    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v9

    invoke-virtual {v4}, LC9/N$c;->e()C

    move-result v4

    invoke-virtual {v13, v9, v4, v8}, LC9/N$b;->w(CCLC9/N$b;)V

    iget-object v4, v5, LC9/N$b;->D:Ljava/lang/String;

    invoke-virtual {v4, v6}, Ljava/lang/String;->charAt(I)C

    move-result v4

    iput-char v4, v5, LC9/N$b;->E:C

    iget-object v4, v5, LC9/N$b;->D:Ljava/lang/String;

    invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v7}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v5, LC9/N$b;->D:Ljava/lang/String;

    invoke-virtual {v8, v5, v4}, LC9/N$b;->e(LC9/N$b;Ljava/lang/String;)LC9/N$b;

    invoke-virtual {v2, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v7}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_6

    invoke-virtual {v8, v1}, LC9/N$b;->i(LD9/c;)V

    return-object v8

    :cond_6
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v12

    new-instance v3, LC9/N$b;

    const/16 v17, 0x78

    const/16 v18, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v9, v3

    move-object v11, v2

    invoke-direct/range {v9 .. v18}, LC9/N$b;-><init>(ILjava/lang/String;CCLS8/o;Ljava/lang/String;LD9/c;ILy7/k;)V

    invoke-virtual {v8, v3, v2}, LC9/N$b;->e(LC9/N$b;Ljava/lang/String;)LC9/N$b;

    move-result-object v2

    goto/16 :goto_3
.end method

.method public final t()Z
    .locals 1

    .prologue
    iget-object v0, p0, LC9/N$b;->I:LD9/c;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget v0, p0, LC9/N$b;->C:I

    iget-object v1, p0, LC9/N$b;->D:Ljava/lang/String;

    iget-char v2, p0, LC9/N$b;->E:C

    iget-char v3, p0, LC9/N$b;->F:C

    iget-object v4, p0, LC9/N$b;->G:LS8/o;

    iget-object v5, p0, LC9/N$b;->H:Ljava/lang/String;

    iget-object v6, p0, LC9/N$b;->I:LD9/c;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Node(type="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", prefix="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", label="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, ", tail="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, ", rex="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", paramsKey="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", route="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Ljava/lang/String;Ljava/lang/String;)I
    .locals 4

    .prologue
    const-string v0, "k1"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "k2"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v2, v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public final v(Ljava/lang/String;)LC9/N$c;
    .locals 17

    .prologue
    move-object/from16 v6, p1

    const-string v0, "pattern"

    invoke-static {v6, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/16 v1, 0x7b

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, p1

    invoke-static/range {v0 .. v5}, LS8/r;->o0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v10

    const/16 v1, 0x2a

    invoke-static/range {v0 .. v5}, LS8/r;->o0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v15

    if-gez v10, :cond_0

    if-gez v15, :cond_0

    new-instance v7, LC9/N$c;

    const/4 v4, 0x0

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v1, 0x0

    const-string v2, ""

    const/4 v3, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v5}, LC9/N$c;-><init>(ILjava/lang/String;CII)V

    return-object v7

    :cond_0
    if-ltz v10, :cond_2

    if-ltz v15, :cond_2

    if-lt v15, v10, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "chi: wildcard \'*\' must be the last pattern in a route, otherwise use a \'{param}\'"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    if-ltz v10, :cond_c

    invoke-virtual {v6, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "substring(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_1
    if-ge v4, v2, :cond_6

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0x7b

    if-eq v7, v8, :cond_4

    const/16 v8, 0x7d

    if-eq v7, v8, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v5, v5, -0x1

    if-nez v5, :cond_5

    add-int/2addr v4, v10

    goto :goto_3

    :cond_4
    add-int/lit8 v5, v5, 0x1

    :cond_5
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_6
    move v4, v10

    :goto_3
    if-eq v4, v10, :cond_b

    add-int/lit8 v0, v10, 0x1

    invoke-virtual {v6, v0, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x1

    add-int/2addr v4, v2

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v4, v5, :cond_7

    invoke-virtual {v6, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    :goto_4
    move v9, v5

    goto :goto_5

    :cond_7
    const/16 v5, 0x2f

    goto :goto_4

    :goto_5
    const/4 v15, 0x6

    const/16 v16, 0x0

    const/16 v12, 0x3a

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v11, v0

    invoke-static/range {v11 .. v16}, LS8/r;->o0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v5

    if-ltz v5, :cond_8

    add-int/2addr v5, v2

    invoke-virtual {v0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move v7, v2

    goto :goto_6

    :cond_8
    const/4 v0, 0x2

    const-string v1, ""

    move v7, v0

    move-object v0, v1

    :goto_6
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_a

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v3, 0x5e

    if-eq v1, v3, :cond_9

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "^"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_9
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x24

    if-eq v1, v2, :cond_a

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "$"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_a
    move-object v8, v0

    new-instance v0, LC9/N$c;

    move-object v6, v0

    move v11, v4

    invoke-direct/range {v6 .. v11}, LC9/N$c;-><init>(ILjava/lang/String;CII)V

    return-object v0

    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Router: route param closing delimiter \'}\' is missing"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    new-instance v0, LC9/N$c;

    const/4 v14, 0x0

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v16

    const/4 v12, 0x3

    const-string v13, ""

    move-object v11, v0

    invoke-direct/range {v11 .. v16}, LC9/N$c;-><init>(ILjava/lang/String;CII)V

    return-object v0
.end method

.method public final w(CCLC9/N$b;)V
    .locals 4

    .prologue
    const-string v0, "child"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LC9/N$b;->J:Ljava/util/LinkedHashMap;

    iget v1, p3, LC9/N$b;->C:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LC9/N$b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_2

    aget-object v2, v0, v1

    iget-char v3, v2, LC9/N$b;->E:C

    if-ne v3, p1, :cond_1

    iget-char v2, v2, LC9/N$b;->F:C

    if-ne v2, p2, :cond_1

    aput-object p3, v0, v1

    iput-char p1, p3, LC9/N$b;->E:C

    iput-char p2, p3, LC9/N$b;->F:C

    return-void

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "chi: replacing missing child"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final x([LC9/N$b;)V
    .locals 6

    .prologue
    const-string v0, "ns"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    const/4 v1, 0x1

    if-le v0, v1, :cond_2

    move-object v0, p1

    check-cast v0, [Ljava/lang/Comparable;

    invoke-static {v0}, Lj7/n;->J([Ljava/lang/Object;)V

    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_2

    :goto_0
    add-int/lit8 v2, v0, -0x1

    aget-object v3, p1, v0

    iget v4, v3, LC9/N$b;->C:I

    if-lez v4, :cond_0

    iget-char v4, v3, LC9/N$b;->F:C

    const/16 v5, 0x2f

    if-ne v4, v5, :cond_0

    array-length v2, p1

    sub-int/2addr v2, v1

    aget-object v2, p1, v2

    aput-object v2, p1, v0

    array-length v0, p1

    sub-int/2addr v0, v1

    aput-object v3, p1, v0

    return-void

    :cond_0
    if-gez v2, :cond_1

    goto :goto_1

    :cond_1
    move v0, v2

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method
