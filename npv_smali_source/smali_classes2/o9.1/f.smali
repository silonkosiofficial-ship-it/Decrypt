.class public final Lo9/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo9/h;


# instance fields
.field private final C:Lo9/q;

.field private final D:Lo9/a;

.field private E:Lo9/k;

.field private F:I

.field private G:Z

.field private H:J


# direct methods
.method public constructor <init>(Lo9/q;)V
    .locals 1

    .prologue
    const-string v0, "upstream"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo9/f;->C:Lo9/q;

    invoke-interface {p1}, Lo9/q;->d()Lo9/a;

    move-result-object p1

    iput-object p1, p0, Lo9/f;->D:Lo9/a;

    invoke-virtual {p1}, Lo9/a;->o()Lo9/k;

    move-result-object v0

    iput-object v0, p0, Lo9/f;->E:Lo9/k;

    invoke-virtual {p1}, Lo9/a;->o()Lo9/k;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lo9/k;->f()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    iput p1, p0, Lo9/f;->F:I

    return-void
.end method


# virtual methods
.method public I0(Lo9/a;J)J
    .locals 6

    .prologue
    const-string v0, "sink"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lo9/f;->G:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_6

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_5

    iget-object v3, p0, Lo9/f;->E:Lo9/k;

    if-eqz v3, :cond_1

    iget-object v4, p0, Lo9/f;->D:Lo9/a;

    invoke-virtual {v4}, Lo9/a;->o()Lo9/k;

    move-result-object v4

    if-ne v3, v4, :cond_0

    iget v3, p0, Lo9/f;->F:I

    iget-object v4, p0, Lo9/f;->D:Lo9/a;

    invoke-virtual {v4}, Lo9/a;->o()Lo9/k;

    move-result-object v4

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lo9/k;->f()I

    move-result v4

    if-ne v3, v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Peek source is invalid because upstream source was used"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-nez v2, :cond_2

    return-wide v0

    :cond_2
    iget-object v0, p0, Lo9/f;->C:Lo9/q;

    iget-wide v1, p0, Lo9/f;->H:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    invoke-interface {v0, v1, v2}, Lo9/q;->G0(J)Z

    move-result v0

    if-nez v0, :cond_3

    const-wide/16 p1, -0x1

    return-wide p1

    :cond_3
    iget-object v0, p0, Lo9/f;->E:Lo9/k;

    if-nez v0, :cond_4

    iget-object v0, p0, Lo9/f;->D:Lo9/a;

    invoke-virtual {v0}, Lo9/a;->o()Lo9/k;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lo9/f;->D:Lo9/a;

    invoke-virtual {v0}, Lo9/a;->o()Lo9/k;

    move-result-object v0

    iput-object v0, p0, Lo9/f;->E:Lo9/k;

    iget-object v0, p0, Lo9/f;->D:Lo9/a;

    invoke-virtual {v0}, Lo9/a;->o()Lo9/k;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lo9/k;->f()I

    move-result v0

    iput v0, p0, Lo9/f;->F:I

    :cond_4
    iget-object v0, p0, Lo9/f;->D:Lo9/a;

    invoke-virtual {v0}, Lo9/a;->r()J

    move-result-wide v0

    iget-wide v2, p0, Lo9/f;->H:J

    sub-long/2addr v0, v2

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    iget-object v0, p0, Lo9/f;->D:Lo9/a;

    iget-wide v2, p0, Lo9/f;->H:J

    add-long v4, v2, p2

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lo9/a;->i(Lo9/a;JJ)V

    iget-wide v0, p0, Lo9/f;->H:J

    add-long/2addr v0, p2

    iput-wide v0, p0, Lo9/f;->H:J

    return-wide p2

    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "byteCount ("

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, ") < 0"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Source is closed."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public close()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lo9/f;->G:Z

    return-void
.end method
