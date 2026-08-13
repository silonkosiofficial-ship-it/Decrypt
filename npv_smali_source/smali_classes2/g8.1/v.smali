.class public final Lg8/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD8/f;


# instance fields
.field private final b:Lg8/t;

.field private final c:LB8/t;

.field private final d:Z

.field private final e:LD8/e;


# direct methods
.method public constructor <init>(Lg8/t;LB8/t;ZLD8/e;)V
    .locals 1

    const-string v0, "binaryClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "abiStability"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/v;->b:Lg8/t;

    iput-object p2, p0, Lg8/v;->c:LB8/t;

    iput-boolean p3, p0, Lg8/v;->d:Z

    iput-object p4, p0, Lg8/v;->e:LD8/e;

    return-void
.end method


# virtual methods
.method public a()LO7/b0;
    .locals 2

    sget-object v0, LO7/b0;->a:LO7/b0;

    const-string v1, "NO_SOURCE_FILE"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Class \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg8/v;->b:Lg8/t;

    invoke-interface {v1}, Lg8/t;->c()Ln8/b;

    move-result-object v1

    invoke-virtual {v1}, Ln8/b;->b()Ln8/c;

    move-result-object v1

    invoke-virtual {v1}, Ln8/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lg8/t;
    .locals 1

    iget-object v0, p0, Lg8/v;->b:Lg8/t;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lg8/v;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg8/v;->b:Lg8/t;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
