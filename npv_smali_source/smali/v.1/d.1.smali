.class final Lv/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lo0/E1;

.field private b:Lo0/q0;

.field private c:Lq0/a;

.field private d:Lo0/Q1;


# direct methods
.method public constructor <init>(Lo0/E1;Lo0/q0;Lq0/a;Lo0/Q1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv/d;->a:Lo0/E1;

    iput-object p2, p0, Lv/d;->b:Lo0/q0;

    iput-object p3, p0, Lv/d;->c:Lq0/a;

    iput-object p4, p0, Lv/d;->d:Lo0/Q1;

    return-void
.end method

.method public synthetic constructor <init>(Lo0/E1;Lo0/q0;Lq0/a;Lo0/Q1;ILy7/k;)V
    .locals 1

    .prologue
    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lv/d;-><init>(Lo0/E1;Lo0/q0;Lq0/a;Lo0/Q1;)V

    return-void
.end method

.method public static final synthetic a(Lv/d;)Lo0/q0;
    .locals 0

    iget-object p0, p0, Lv/d;->b:Lo0/q0;

    return-object p0
.end method

.method public static final synthetic b(Lv/d;)Lq0/a;
    .locals 0

    iget-object p0, p0, Lv/d;->c:Lq0/a;

    return-object p0
.end method

.method public static final synthetic c(Lv/d;)Lo0/E1;
    .locals 0

    iget-object p0, p0, Lv/d;->a:Lo0/E1;

    return-object p0
.end method

.method public static final synthetic d(Lv/d;Lo0/q0;)V
    .locals 0

    iput-object p1, p0, Lv/d;->b:Lo0/q0;

    return-void
.end method

.method public static final synthetic e(Lv/d;Lq0/a;)V
    .locals 0

    iput-object p1, p0, Lv/d;->c:Lq0/a;

    return-void
.end method

.method public static final synthetic f(Lv/d;Lo0/E1;)V
    .locals 0

    iput-object p1, p0, Lv/d;->a:Lo0/E1;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lv/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lv/d;

    iget-object v1, p0, Lv/d;->a:Lo0/E1;

    iget-object v3, p1, Lv/d;->a:Lo0/E1;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lv/d;->b:Lo0/q0;

    iget-object v3, p1, Lv/d;->b:Lo0/q0;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lv/d;->c:Lq0/a;

    iget-object v3, p1, Lv/d;->c:Lq0/a;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lv/d;->d:Lo0/Q1;

    iget-object p1, p1, Lv/d;->d:Lo0/Q1;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final g()Lo0/Q1;
    .locals 1

    .prologue
    iget-object v0, p0, Lv/d;->d:Lo0/Q1;

    if-nez v0, :cond_0

    invoke-static {}, Lo0/Y;->a()Lo0/Q1;

    move-result-object v0

    iput-object v0, p0, Lv/d;->d:Lo0/Q1;

    :cond_0
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    iget-object v0, p0, Lv/d;->a:Lo0/E1;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lv/d;->b:Lo0/q0;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lv/d;->c:Lq0/a;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lv/d;->d:Lo0/Q1;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BorderCache(imageBitmap="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lv/d;->a:Lo0/E1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", canvas="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lv/d;->b:Lo0/q0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", canvasDrawScope="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lv/d;->c:Lq0/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", borderPath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lv/d;->d:Lo0/Q1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
