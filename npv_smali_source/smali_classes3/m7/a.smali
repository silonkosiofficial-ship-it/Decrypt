.class public abstract Lm7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/i$b;


# instance fields
.field private final C:Lm7/i$c;


# direct methods
.method public constructor <init>(Lm7/i$c;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm7/a;->C:Lm7/i$c;

    return-void
.end method


# virtual methods
.method public D(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lm7/i$b$a;->a(Lm7/i$b;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getKey()Lm7/i$c;
    .locals 1

    iget-object v0, p0, Lm7/a;->C:Lm7/i$c;

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
