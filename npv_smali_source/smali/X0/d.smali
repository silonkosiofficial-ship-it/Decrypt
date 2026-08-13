.class final LX0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX0/o;


# instance fields
.field private final b:J


# direct methods
.method private constructor <init>(J)V
    .locals 2

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LX0/d;->b:J

    const-wide/16 v0, 0x10

    cmp-long p1, p1, v0

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(JLy7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LX0/d;-><init>(J)V

    return-void
.end method


# virtual methods
.method public a()F
    .locals 2

    invoke-virtual {p0}, LX0/d;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo0/y0;->p(J)F

    move-result v0

    return v0
.end method

.method public c()J
    .locals 2

    iget-wide v0, p0, LX0/d;->b:J

    return-wide v0
.end method

.method public synthetic d(Lx7/a;)LX0/o;
    .locals 0

    invoke-static {p0, p1}, LX0/n;->b(LX0/o;Lx7/a;)LX0/o;

    move-result-object p1

    return-object p1
.end method

.method public synthetic e(LX0/o;)LX0/o;
    .locals 0

    invoke-static {p0, p1}, LX0/n;->a(LX0/o;LX0/o;)LX0/o;

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
    instance-of v1, p1, LX0/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LX0/d;

    iget-wide v3, p0, LX0/d;->b:J

    iget-wide v5, p1, LX0/d;->b:J

    invoke-static {v3, v4, v5, v6}, Lo0/y0;->o(JJ)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public f()Lo0/n0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, LX0/d;->b:J

    invoke-static {v0, v1}, Lo0/y0;->u(J)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ColorStyle(value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LX0/d;->b:J

    invoke-static {v1, v2}, Lo0/y0;->v(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
