.class public final Lo0/n0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo0/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Lo0/n0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a([Li7/u;JJI)Lo0/n0;
    .locals 11

    .prologue
    move-object v0, p1

    array-length v1, v0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    move v4, v2

    :goto_0
    if-ge v4, v1, :cond_0

    aget-object v5, v0, v4

    invoke-virtual {v5}, Li7/u;->d()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo0/y0;

    invoke-virtual {v5}, Lo0/y0;->w()J

    move-result-wide v5

    invoke-static {v5, v6}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    array-length v1, v0

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    if-ge v2, v1, :cond_1

    aget-object v5, v0, v2

    invoke-virtual {v5}, Li7/u;->c()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    new-instance v0, Lo0/I1;

    const/4 v10, 0x0

    move-object v2, v0

    move-wide v5, p2

    move-wide v7, p4

    move/from16 v9, p6

    invoke-direct/range {v2 .. v10}, Lo0/I1;-><init>(Ljava/util/List;Ljava/util/List;JJILy7/k;)V

    return-object v0
.end method

.method public final b([Li7/u;JFI)Lo0/n0;
    .locals 9

    .prologue
    array-length v0, p1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    move v3, v1

    :goto_0
    if-ge v3, v0, :cond_0

    aget-object v4, p1, v3

    invoke-virtual {v4}, Li7/u;->d()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo0/y0;

    invoke-virtual {v4}, Lo0/y0;->w()J

    move-result-wide v4

    invoke-static {v4, v5}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    array-length v0, p1

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    if-ge v1, v0, :cond_1

    aget-object v4, p1, v1

    invoke-virtual {v4}, Li7/u;->c()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    new-instance p1, Lo0/W1;

    const/4 v8, 0x0

    move-object v1, p1

    move-wide v4, p2

    move v6, p4

    move v7, p5

    invoke-direct/range {v1 .. v8}, Lo0/W1;-><init>(Ljava/util/List;Ljava/util/List;JFILy7/k;)V

    return-object p1
.end method

.method public final c([Li7/u;J)Lo0/n0;
    .locals 7

    .prologue
    array-length v0, p1

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_0

    aget-object v3, p1, v2

    invoke-virtual {v3}, Li7/u;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo0/y0;

    invoke-virtual {v3}, Lo0/y0;->w()J

    move-result-wide v5

    invoke-static {v5, v6}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    array-length v0, p1

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    invoke-virtual {v2}, Li7/u;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    new-instance p1, Lo0/i2;

    const/4 v6, 0x0

    move-object v1, p1

    move-wide v2, p2

    invoke-direct/range {v1 .. v6}, Lo0/i2;-><init>(JLjava/util/List;Ljava/util/List;Ly7/k;)V

    return-object p1
.end method
