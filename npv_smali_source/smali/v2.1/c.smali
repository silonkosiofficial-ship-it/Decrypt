.class public final Lv2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/e;
.implements Lo2/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv2/c$a;,
        Lv2/c$b;,
        Lv2/c$c;
    }
.end annotation


# instance fields
.field private final C:Lz2/e;

.field private final D:Lv2/b;

.field private final E:Lv2/c$a;


# direct methods
.method public constructor <init>(Lz2/e;Lv2/b;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autoCloser"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv2/c;->C:Lz2/e;

    iput-object p2, p0, Lv2/c;->D:Lv2/b;

    new-instance p1, Lv2/c$a;

    invoke-direct {p1, p2}, Lv2/c$a;-><init>(Lv2/b;)V

    iput-object p1, p0, Lv2/c;->E:Lv2/c$a;

    invoke-virtual {p0}, Lv2/c;->a()Lz2/e;

    move-result-object p1

    invoke-virtual {p2, p1}, Lv2/b;->l(Lz2/e;)V

    return-void
.end method


# virtual methods
.method public a()Lz2/e;
    .locals 1

    iget-object v0, p0, Lv2/c;->C:Lz2/e;

    return-object v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lv2/c;->E:Lv2/c$a;

    invoke-virtual {v0}, Lv2/c$a;->close()V

    return-void
.end method

.method public final f()Lv2/b;
    .locals 1

    iget-object v0, p0, Lv2/c;->D:Lv2/b;

    return-object v0
.end method

.method public getDatabaseName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv2/c;->C:Lz2/e;

    invoke-interface {v0}, Lz2/e;->getDatabaseName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setWriteAheadLoggingEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lv2/c;->C:Lz2/e;

    invoke-interface {v0, p1}, Lz2/e;->setWriteAheadLoggingEnabled(Z)V

    return-void
.end method

.method public v0()Lz2/d;
    .locals 1

    iget-object v0, p0, Lv2/c;->E:Lv2/c$a;

    invoke-virtual {v0}, Lv2/c$a;->a()V

    iget-object v0, p0, Lv2/c;->E:Lv2/c$a;

    return-object v0
.end method
