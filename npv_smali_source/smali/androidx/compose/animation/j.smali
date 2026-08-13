.class public abstract Landroidx/compose/animation/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/animation/j$a;
    }
.end annotation


# static fields
.field public static final a:Landroidx/compose/animation/j$a;

.field private static final b:Landroidx/compose/animation/j;

.field private static final c:Landroidx/compose/animation/j;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Landroidx/compose/animation/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/animation/j$a;-><init>(Ly7/k;)V

    sput-object v0, Landroidx/compose/animation/j;->a:Landroidx/compose/animation/j$a;

    new-instance v0, Landroidx/compose/animation/k;

    new-instance v10, Lt/C;

    const/16 v8, 0x3f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lt/C;-><init>(Lt/o;Lt/y;Lt/i;Lt/v;ZLjava/util/Map;ILy7/k;)V

    invoke-direct {v0, v10}, Landroidx/compose/animation/k;-><init>(Lt/C;)V

    sput-object v0, Landroidx/compose/animation/j;->b:Landroidx/compose/animation/j;

    new-instance v0, Landroidx/compose/animation/k;

    new-instance v10, Lt/C;

    const/16 v8, 0x2f

    const/4 v6, 0x1

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lt/C;-><init>(Lt/o;Lt/y;Lt/i;Lt/v;ZLjava/util/Map;ILy7/k;)V

    invoke-direct {v0, v10}, Landroidx/compose/animation/k;-><init>(Lt/C;)V

    sput-object v0, Landroidx/compose/animation/j;->c:Landroidx/compose/animation/j;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/animation/j;-><init>()V

    return-void
.end method

.method public static final synthetic a()Landroidx/compose/animation/j;
    .locals 1

    sget-object v0, Landroidx/compose/animation/j;->b:Landroidx/compose/animation/j;

    return-object v0
.end method


# virtual methods
.method public abstract b()Lt/C;
.end method

.method public final c(Landroidx/compose/animation/j;)Landroidx/compose/animation/j;
    .locals 9

    .prologue
    new-instance v0, Landroidx/compose/animation/k;

    new-instance v8, Lt/C;

    invoke-virtual {p1}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object v1

    invoke-virtual {v1}, Lt/C;->c()Lt/o;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object v1

    invoke-virtual {v1}, Lt/C;->c()Lt/o;

    move-result-object v1

    :cond_0
    move-object v2, v1

    invoke-virtual {p1}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object v1

    invoke-virtual {v1}, Lt/C;->f()Lt/y;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object v1

    invoke-virtual {v1}, Lt/C;->f()Lt/y;

    move-result-object v1

    :cond_1
    move-object v3, v1

    invoke-virtual {p1}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object v1

    invoke-virtual {v1}, Lt/C;->a()Lt/i;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object v1

    invoke-virtual {v1}, Lt/C;->a()Lt/i;

    move-result-object v1

    :cond_2
    move-object v4, v1

    invoke-virtual {p1}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object v1

    invoke-virtual {v1}, Lt/C;->e()Lt/v;

    move-result-object v1

    if-nez v1, :cond_3

    invoke-virtual {p0}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object v1

    invoke-virtual {v1}, Lt/C;->e()Lt/v;

    move-result-object v1

    :cond_3
    move-object v5, v1

    invoke-virtual {p1}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object v1

    invoke-virtual {v1}, Lt/C;->d()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {p0}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object v1

    invoke-virtual {v1}, Lt/C;->d()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    :goto_0
    move v6, v1

    goto :goto_2

    :cond_5
    :goto_1
    const/4 v1, 0x1

    goto :goto_0

    :goto_2
    invoke-virtual {p0}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object v1

    invoke-virtual {v1}, Lt/C;->b()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object p1

    invoke-virtual {p1}, Lt/C;->b()Ljava/util/Map;

    move-result-object p1

    invoke-static {v1, p1}, Lj7/S;->n(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v7

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lt/C;-><init>(Lt/o;Lt/y;Lt/i;Lt/v;ZLjava/util/Map;)V

    invoke-direct {v0, v8}, Landroidx/compose/animation/k;-><init>(Lt/C;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    instance-of v0, p1, Landroidx/compose/animation/j;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/compose/animation/j;

    invoke-virtual {p1}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object v0

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object v0

    invoke-virtual {v0}, Lt/C;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    sget-object v0, Landroidx/compose/animation/j;->b:Landroidx/compose/animation/j;

    invoke-static {p0, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "ExitTransition.None"

    goto/16 :goto_3

    :cond_0
    sget-object v0, Landroidx/compose/animation/j;->c:Landroidx/compose/animation/j;

    invoke-static {p0, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "ExitTransition.KeepUntilTransitionsFinished"

    goto :goto_3

    :cond_1
    invoke-virtual {p0}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ExitTransition: \nFade - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lt/C;->c()Lt/o;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lt/o;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_2
    move-object v2, v3

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",\nSlide - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lt/C;->f()Lt/y;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lt/y;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_3
    move-object v2, v3

    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",\nShrink - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lt/C;->a()Lt/i;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lt/i;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_4
    move-object v2, v3

    :goto_2
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",\nScale - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lt/C;->e()Lt/v;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lt/v;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_5
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",\nKeepUntilTransitionsFinished - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lt/C;->d()Z

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_3
    return-object v0
.end method
