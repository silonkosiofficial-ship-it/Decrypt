.class public final Lz8/b;
.super Lz8/a;
.source "SourceFile"

# interfaces
.implements Lz8/f;


# instance fields
.field private final c:LO7/e;

.field private final d:Ln8/f;


# direct methods
.method public constructor <init>(LO7/e;LF8/E;Ln8/f;Lz8/g;)V
    .locals 1

    const-string v0, "classDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "receiverType"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p4}, Lz8/a;-><init>(LF8/E;Lz8/g;)V

    iput-object p1, p0, Lz8/b;->c:LO7/e;

    iput-object p3, p0, Lz8/b;->d:Ln8/f;

    return-void
.end method


# virtual methods
.method public a()Ln8/f;
    .locals 1

    iget-object v0, p0, Lz8/b;->d:Ln8/f;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lz8/a;->getType()LF8/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ": Ctx { "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz8/b;->c:LO7/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " }"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
