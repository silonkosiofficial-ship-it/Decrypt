.class public final Lu/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/G1;


# instance fields
.field private final C:Lu/x0;

.field private final D:LV/w0;

.field private E:Lu/r;

.field private F:J

.field private G:J

.field private H:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lu/x0;Ljava/lang/Object;Lu/r;JJZ)V
    .locals 2

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu/l;->C:Lu/x0;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p2, v0, v1, v0}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v0

    iput-object v0, p0, Lu/l;->D:LV/w0;

    if-eqz p3, :cond_0

    invoke-static {p3}, Lu/s;->e(Lu/r;)Lu/r;

    move-result-object p3

    if-nez p3, :cond_1

    :cond_0
    invoke-static {p1, p2}, Lu/m;->i(Lu/x0;Ljava/lang/Object;)Lu/r;

    move-result-object p3

    :cond_1
    iput-object p3, p0, Lu/l;->E:Lu/r;

    iput-wide p4, p0, Lu/l;->F:J

    iput-wide p6, p0, Lu/l;->G:J

    iput-boolean p8, p0, Lu/l;->H:Z

    return-void
.end method

.method public synthetic constructor <init>(Lu/x0;Ljava/lang/Object;Lu/r;JJZILy7/k;)V
    .locals 10

    .prologue
    and-int/lit8 v0, p9, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, p3

    :goto_0
    and-int/lit8 v0, p9, 0x8

    const-wide/high16 v1, -0x8000000000000000L

    if-eqz v0, :cond_1

    move-wide v5, v1

    goto :goto_1

    :cond_1
    move-wide v5, p4

    :goto_1
    and-int/lit8 v0, p9, 0x10

    if-eqz v0, :cond_2

    move-wide v7, v1

    goto :goto_2

    :cond_2
    move-wide/from16 v7, p6

    :goto_2
    and-int/lit8 v0, p9, 0x20

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    move v9, v0

    goto :goto_3

    :cond_3
    move/from16 v9, p8

    :goto_3
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v9}, Lu/l;-><init>(Lu/x0;Ljava/lang/Object;Lu/r;JJZ)V

    return-void
.end method


# virtual methods
.method public final e()J
    .locals 2

    iget-wide v0, p0, Lu/l;->G:J

    return-wide v0
.end method

.method public final g()J
    .locals 2

    iget-wide v0, p0, Lu/l;->F:J

    return-wide v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu/l;->D:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final n()Lu/x0;
    .locals 1

    iget-object v0, p0, Lu/l;->C:Lu/x0;

    return-object v0
.end method

.method public final o()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lu/l;->C:Lu/x0;

    invoke-interface {v0}, Lu/x0;->b()Lx7/l;

    move-result-object v0

    iget-object v1, p0, Lu/l;->E:Lu/r;

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final q()Lu/r;
    .locals 1

    iget-object v0, p0, Lu/l;->E:Lu/r;

    return-object v0
.end method

.method public final r()Z
    .locals 1

    iget-boolean v0, p0, Lu/l;->H:Z

    return v0
.end method

.method public final s(J)V
    .locals 0

    iput-wide p1, p0, Lu/l;->G:J

    return-void
.end method

.method public final t(J)V
    .locals 0

    iput-wide p1, p0, Lu/l;->F:J

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AnimationState(value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lu/l;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", velocity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lu/l;->o()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isRunning="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lu/l;->H:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", lastFrameTimeNanos="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lu/l;->F:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", finishedTimeNanos="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lu/l;->G:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Z)V
    .locals 0

    iput-boolean p1, p0, Lu/l;->H:Z

    return-void
.end method

.method public v(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lu/l;->D:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final w(Lu/r;)V
    .locals 0

    iput-object p1, p0, Lu/l;->E:Lu/r;

    return-void
.end method
