.class public final LX9/S$a;
.super Ljava/io/OutputStream;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX9/S;->p1()Ljava/io/OutputStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic C:LX9/S;


# direct methods
.method constructor <init>(LX9/S;)V
    .locals 0

    iput-object p1, p0, LX9/S$a;->C:LX9/S;

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, LX9/S$a;->C:LX9/S;

    invoke-virtual {v0}, LX9/S;->close()V

    return-void
.end method

.method public flush()V
    .locals 2

    .prologue
    iget-object v0, p0, LX9/S$a;->C:LX9/S;

    iget-boolean v1, v0, LX9/S;->E:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, LX9/S;->flush()V

    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LX9/S$a;->C:LX9/S;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".outputStream()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public write(I)V
    .locals 2

    .prologue
    iget-object v0, p0, LX9/S$a;->C:LX9/S;

    iget-boolean v1, v0, LX9/S;->E:Z

    if-nez v1, :cond_0

    iget-object v0, v0, LX9/S;->D:LX9/d;

    int-to-byte p1, p1

    invoke-virtual {v0, p1}, LX9/d;->v1(I)LX9/d;

    iget-object p1, p0, LX9/S$a;->C:LX9/S;

    invoke-virtual {p1}, LX9/S;->d0()LX9/e;

    return-void

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public write([BII)V
    .locals 2

    .prologue
    const-string v0, "data"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LX9/S$a;->C:LX9/S;

    iget-boolean v1, v0, LX9/S;->E:Z

    if-nez v1, :cond_0

    iget-object v0, v0, LX9/S;->D:LX9/d;

    invoke-virtual {v0, p1, p2, p3}, LX9/d;->u1([BII)LX9/d;

    iget-object p1, p0, LX9/S$a;->C:LX9/S;

    invoke-virtual {p1}, LX9/S;->d0()LX9/e;

    return-void

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
