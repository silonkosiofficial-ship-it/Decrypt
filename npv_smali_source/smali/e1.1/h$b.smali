.class public final Le1/h$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le1/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field private a:Le1/i;

.field private b:Le1/h;

.field final synthetic c:Le1/h;


# direct methods
.method public constructor <init>(Le1/h;Le1/h;)V
    .locals 1

    const-string v0, "row"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Le1/h$b;->c:Le1/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Le1/h$b;->b:Le1/h;

    return-void
.end method


# virtual methods
.method public final a(Le1/i;F)Z
    .locals 9

    .prologue
    const-string v0, "other"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le1/h$b;->a:Le1/i;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Le1/i;->q()Z

    move-result v0

    const v1, 0x38d1b717    # 1.0E-4f

    const/16 v2, 0x9

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v0, :cond_3

    move v0, v4

    :goto_0
    if-ge v0, v2, :cond_1

    iget-object v6, p0, Le1/h$b;->a:Le1/i;

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6}, Le1/i;->s()[F

    move-result-object v6

    aget v7, v6, v0

    invoke-virtual {p1}, Le1/i;->s()[F

    move-result-object v8

    aget v8, v8, v0

    mul-float/2addr v8, p2

    add-float/2addr v7, v8

    aput v7, v6, v0

    iget-object v6, p0, Le1/h$b;->a:Le1/i;

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6}, Le1/i;->s()[F

    move-result-object v6

    aget v6, v6, v0

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v6

    cmpg-float v6, v6, v1

    if-gez v6, :cond_0

    iget-object v6, p0, Le1/h$b;->a:Le1/i;

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6}, Le1/i;->s()[F

    move-result-object v6

    aput v3, v6, v0

    goto :goto_1

    :cond_0
    move v5, v4

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    if-eqz v5, :cond_2

    iget-object p1, p0, Le1/h$b;->c:Le1/h;

    iget-object p2, p0, Le1/h$b;->a:Le1/i;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {p1, p2}, Le1/h;->N(Le1/h;Le1/i;)V

    :cond_2
    return v4

    :cond_3
    :goto_2
    if-ge v4, v2, :cond_6

    invoke-virtual {p1}, Le1/i;->s()[F

    move-result-object v0

    aget v0, v0, v4

    cmpg-float v6, v0, v3

    if-nez v6, :cond_4

    iget-object v0, p0, Le1/h$b;->a:Le1/i;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Le1/i;->s()[F

    move-result-object v0

    aput v3, v0, v4

    goto :goto_3

    :cond_4
    mul-float/2addr v0, p2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v6

    cmpg-float v6, v6, v1

    if-gez v6, :cond_5

    move v0, v3

    :cond_5
    iget-object v6, p0, Le1/h$b;->a:Le1/i;

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6}, Le1/i;->s()[F

    move-result-object v6

    aput v0, v6, v4

    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_6
    return v5
.end method

.method public final b(Le1/i;)V
    .locals 0

    iput-object p1, p0, Le1/h$b;->a:Le1/i;

    return-void
.end method

.method public final c()Z
    .locals 5

    .prologue
    const/16 v0, 0x8

    :goto_0
    const/4 v1, 0x0

    const/4 v2, -0x1

    if-ge v2, v0, :cond_2

    iget-object v2, p0, Le1/h$b;->a:Le1/i;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Le1/i;->s()[F

    move-result-object v2

    aget v2, v2, v0

    const/4 v3, 0x0

    cmpl-float v4, v2, v3

    if-lez v4, :cond_0

    return v1

    :cond_0
    cmpg-float v1, v2, v3

    if-gez v1, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public final d(Le1/i;)Z
    .locals 4

    .prologue
    const-string v0, "other"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    :goto_0
    const/4 v1, 0x0

    const/4 v2, -0x1

    if-ge v2, v0, :cond_1

    invoke-virtual {p1}, Le1/i;->s()[F

    move-result-object v2

    aget v2, v2, v0

    iget-object v3, p0, Le1/h$b;->a:Le1/i;

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3}, Le1/i;->s()[F

    move-result-object v3

    aget v3, v3, v0

    cmpg-float v2, v3, v2

    if-nez v2, :cond_0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    if-gez v2, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public final e()V
    .locals 7

    iget-object v0, p0, Le1/h$b;->a:Le1/i;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Le1/i;->s()[F

    move-result-object v1

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lj7/n;->y([FFIIILjava/lang/Object;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    iget-object v0, p0, Le1/h$b;->a:Le1/i;

    const-string v1, "[ "

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    const/16 v2, 0x9

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Le1/h$b;->a:Le1/i;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Le1/i;->s()[F

    move-result-object v2

    aget v2, v2, v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le1/h$b;->a:Le1/i;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
