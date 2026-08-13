.class public abstract LW8/E0;
.super Lb9/o;
.source "SourceFile"

# interfaces
.implements LW8/f0;
.implements LW8/v0;


# instance fields
.field public F:LW8/F0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb9/o;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LW8/K0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public e()V
    .locals 1

    invoke-virtual {p0}, LW8/E0;->v()LW8/F0;

    move-result-object v0

    invoke-virtual {v0, p0}, LW8/F0;->M0(LW8/E0;)V

    return-void
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, LW8/S;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, LW8/S;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[job@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LW8/E0;->v()LW8/F0;

    move-result-object v1

    invoke-static {v1}, LW8/S;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final v()LW8/F0;
    .locals 1

    .prologue
    iget-object v0, p0, LW8/E0;->F:LW8/F0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "job"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract w()Z
.end method

.method public abstract x(Ljava/lang/Throwable;)V
.end method

.method public final y(LW8/F0;)V
    .locals 0

    iput-object p1, p0, LW8/E0;->F:LW8/F0;

    return-void
.end method
