.class public abstract LB8/A;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB8/A$a;,
        LB8/A$b;
    }
.end annotation


# instance fields
.field private final a:Lk8/c;

.field private final b:Lk8/g;

.field private final c:LO7/a0;


# direct methods
.method private constructor <init>(Lk8/c;Lk8/g;LO7/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB8/A;->a:Lk8/c;

    iput-object p2, p0, LB8/A;->b:Lk8/g;

    iput-object p3, p0, LB8/A;->c:LO7/a0;

    return-void
.end method

.method public synthetic constructor <init>(Lk8/c;Lk8/g;LO7/a0;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LB8/A;-><init>(Lk8/c;Lk8/g;LO7/a0;)V

    return-void
.end method


# virtual methods
.method public abstract a()Ln8/c;
.end method

.method public final b()Lk8/c;
    .locals 1

    iget-object v0, p0, LB8/A;->a:Lk8/c;

    return-object v0
.end method

.method public final c()LO7/a0;
    .locals 1

    iget-object v0, p0, LB8/A;->c:LO7/a0;

    return-object v0
.end method

.method public final d()Lk8/g;
    .locals 1

    iget-object v0, p0, LB8/A;->b:Lk8/g;

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

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LB8/A;->a()Ln8/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
