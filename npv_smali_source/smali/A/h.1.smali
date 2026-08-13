.class final LA/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA/g;
.implements LA/e;


# instance fields
.field private final a:LY0/e;

.field private final b:J

.field private final synthetic c:Landroidx/compose/foundation/layout/f;


# direct methods
.method private constructor <init>(LY0/e;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA/h;->a:LY0/e;

    iput-wide p2, p0, LA/h;->b:J

    sget-object p1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    iput-object p1, p0, LA/h;->c:Landroidx/compose/foundation/layout/f;

    return-void
.end method

.method public synthetic constructor <init>(LY0/e;JLy7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LA/h;-><init>(LY0/e;J)V

    return-void
.end method


# virtual methods
.method public a(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;
    .locals 1

    iget-object v0, p0, LA/h;->c:Landroidx/compose/foundation/layout/f;

    invoke-virtual {v0, p1}, Landroidx/compose/foundation/layout/f;->a(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LA/h;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LA/h;

    iget-object v1, p0, LA/h;->a:LY0/e;

    iget-object v3, p1, LA/h;->a:LY0/e;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, LA/h;->b:J

    iget-wide v5, p1, LA/h;->b:J

    invoke-static {v3, v4, v5, v6}, LY0/b;->f(JJ)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LA/h;->a:LY0/e;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LA/h;->b:J

    invoke-static {v1, v2}, LY0/b;->o(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BoxWithConstraintsScopeImpl(density="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LA/h;->a:LY0/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", constraints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LA/h;->b:J

    invoke-static {v1, v2}, LY0/b;->q(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
