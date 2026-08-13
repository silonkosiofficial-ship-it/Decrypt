.class public abstract LX9/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX9/Z;


# instance fields
.field private final C:LX9/Z;


# direct methods
.method public constructor <init>(LX9/Z;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX9/m;->C:LX9/Z;

    return-void
.end method


# virtual methods
.method public final a()LX9/Z;
    .locals 1

    iget-object v0, p0, LX9/m;->C:LX9/Z;

    return-object v0
.end method

.method public b0(LX9/d;J)J
    .locals 1

    const-string v0, "sink"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LX9/m;->C:LX9/Z;

    invoke-interface {v0, p1, p2, p3}, LX9/Z;->b0(LX9/d;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, LX9/m;->C:LX9/Z;

    invoke-interface {v0}, LX9/Z;->close()V

    return-void
.end method

.method public k()LX9/a0;
    .locals 1

    iget-object v0, p0, LX9/m;->C:LX9/Z;

    invoke-interface {v0}, LX9/Z;->k()LX9/a0;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, LX9/m;->C:LX9/Z;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
