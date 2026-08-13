.class public final LG/f;
.super LG/a;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LG/b;LG/b;LG/b;LG/b;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LG/a;-><init>(LG/b;LG/b;LG/b;LG/b;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(LG/b;LG/b;LG/b;LG/b;)LG/a;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, LG/f;->i(LG/b;LG/b;LG/b;LG/b;)LG/f;

    move-result-object p1

    return-object p1
.end method

.method public d(JFFFFLY0/v;)Lo0/L1;
    .locals 16

    .prologue
    move-object/from16 v0, p7

    add-float v1, p3, p4

    add-float v1, v1, p5

    add-float v1, v1, p6

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-nez v1, :cond_0

    new-instance v0, Lo0/L1$b;

    invoke-static/range {p1 .. p2}, Ln0/n;->c(J)Ln0/i;

    move-result-object v1

    invoke-direct {v0, v1}, Lo0/L1$b;-><init>(Ln0/i;)V

    goto :goto_4

    :cond_0
    new-instance v1, Lo0/L1$c;

    invoke-static/range {p1 .. p2}, Ln0/n;->c(J)Ln0/i;

    move-result-object v3

    sget-object v4, LY0/v;->C:LY0/v;

    if-ne v0, v4, :cond_1

    move/from16 v5, p3

    goto :goto_0

    :cond_1
    move/from16 v5, p4

    :goto_0
    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static {v5, v2, v6, v7}, Ln0/b;->b(FFILjava/lang/Object;)J

    move-result-wide v8

    if-ne v0, v4, :cond_2

    move/from16 v5, p4

    goto :goto_1

    :cond_2
    move/from16 v5, p3

    :goto_1
    invoke-static {v5, v2, v6, v7}, Ln0/b;->b(FFILjava/lang/Object;)J

    move-result-wide v10

    if-ne v0, v4, :cond_3

    move/from16 v5, p5

    goto :goto_2

    :cond_3
    move/from16 v5, p6

    :goto_2
    invoke-static {v5, v2, v6, v7}, Ln0/b;->b(FFILjava/lang/Object;)J

    move-result-wide v12

    if-ne v0, v4, :cond_4

    move/from16 v0, p6

    goto :goto_3

    :cond_4
    move/from16 v0, p5

    :goto_3
    invoke-static {v0, v2, v6, v7}, Ln0/b;->b(FFILjava/lang/Object;)J

    move-result-wide v14

    move-wide v4, v8

    move-wide v6, v10

    move-wide v8, v12

    move-wide v10, v14

    invoke-static/range {v3 .. v11}, Ln0/l;->b(Ln0/i;JJJJ)Ln0/k;

    move-result-object v0

    invoke-direct {v1, v0}, Lo0/L1$c;-><init>(Ln0/k;)V

    move-object v0, v1

    :goto_4
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LG/f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, LG/a;->h()LG/b;

    move-result-object v1

    check-cast p1, LG/f;

    invoke-virtual {p1}, LG/a;->h()LG/b;

    move-result-object v3

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, LG/a;->g()LG/b;

    move-result-object v1

    invoke-virtual {p1}, LG/a;->g()LG/b;

    move-result-object v3

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, LG/a;->e()LG/b;

    move-result-object v1

    invoke-virtual {p1}, LG/a;->e()LG/b;

    move-result-object v3

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    invoke-virtual {p0}, LG/a;->f()LG/b;

    move-result-object v1

    invoke-virtual {p1}, LG/a;->f()LG/b;

    move-result-object p1

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, LG/a;->h()LG/b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LG/a;->g()LG/b;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LG/a;->e()LG/b;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LG/a;->f()LG/b;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public i(LG/b;LG/b;LG/b;LG/b;)LG/f;
    .locals 1

    new-instance v0, LG/f;

    invoke-direct {v0, p1, p2, p3, p4}, LG/f;-><init>(LG/b;LG/b;LG/b;LG/b;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RoundedCornerShape(topStart = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LG/a;->h()LG/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", topEnd = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LG/a;->g()LG/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bottomEnd = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LG/a;->e()LG/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bottomStart = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LG/a;->f()LG/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
