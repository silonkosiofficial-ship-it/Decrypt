.class final LJ0/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LK0/o;

.field private final b:I

.field private final c:LY0/r;

.field private final d:LD0/t;


# direct methods
.method public constructor <init>(LK0/o;ILY0/r;LD0/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ0/m;->a:LK0/o;

    iput p2, p0, LJ0/m;->b:I

    iput-object p3, p0, LJ0/m;->c:LY0/r;

    iput-object p4, p0, LJ0/m;->d:LD0/t;

    return-void
.end method


# virtual methods
.method public final a()LD0/t;
    .locals 1

    iget-object v0, p0, LJ0/m;->d:LD0/t;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, LJ0/m;->b:I

    return v0
.end method

.method public final c()LK0/o;
    .locals 1

    iget-object v0, p0, LJ0/m;->a:LK0/o;

    return-object v0
.end method

.method public final d()LY0/r;
    .locals 1

    iget-object v0, p0, LJ0/m;->c:LY0/r;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ScrollCaptureCandidate(node="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LJ0/m;->a:LK0/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", depth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LJ0/m;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", viewportBoundsInWindow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LJ0/m;->c:LY0/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", coordinates="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LJ0/m;->d:LD0/t;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
