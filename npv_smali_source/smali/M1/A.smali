.class public final LM1/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/i$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM1/A$a;
    }
.end annotation


# static fields
.field public static final E:LM1/A$a;

.field private static final F:Ljava/lang/String;


# instance fields
.field private final C:LM1/A;

.field private final D:LM1/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LM1/A$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LM1/A$a;-><init>(Ly7/k;)V

    sput-object v0, LM1/A;->E:LM1/A$a;

    const-string v0, "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details."

    sput-object v0, LM1/A;->F:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(LM1/A;LM1/j;)V
    .locals 1

    const-string v0, "instance"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM1/A;->C:LM1/A;

    iput-object p2, p0, LM1/A;->D:LM1/j;

    return-void
.end method


# virtual methods
.method public D(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lm7/i$b$a;->a(Lm7/i$b;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final a(LM1/h;)V
    .locals 1

    .prologue
    const-string v0, "candidate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM1/A;->D:LM1/j;

    if-eq v0, p1, :cond_1

    iget-object v0, p0, LM1/A;->C:LM1/A;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LM1/A;->a(LM1/h;)V

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    sget-object v0, LM1/A;->F:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getKey()Lm7/i$c;
    .locals 1

    sget-object v0, LM1/A$a$a;->C:LM1/A$a$a;

    return-object v0
.end method

.method public i(Lm7/i$c;)Lm7/i$b;
    .locals 0

    invoke-static {p0, p1}, Lm7/i$b$a;->b(Lm7/i$b;Lm7/i$c;)Lm7/i$b;

    move-result-object p1

    return-object p1
.end method

.method public o0(Lm7/i;)Lm7/i;
    .locals 0

    invoke-static {p0, p1}, Lm7/i$b$a;->d(Lm7/i$b;Lm7/i;)Lm7/i;

    move-result-object p1

    return-object p1
.end method

.method public y0(Lm7/i$c;)Lm7/i;
    .locals 0

    invoke-static {p0, p1}, Lm7/i$b$a;->c(Lm7/i$b;Lm7/i$c;)Lm7/i;

    move-result-object p1

    return-object p1
.end method
