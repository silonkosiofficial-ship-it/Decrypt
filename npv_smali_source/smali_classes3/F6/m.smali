.class public final LF6/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/i$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF6/m$a;
    }
.end annotation


# static fields
.field public static final D:LF6/m$a;


# instance fields
.field private final C:Lm7/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LF6/m$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF6/m$a;-><init>(Ly7/k;)V

    sput-object v0, LF6/m;->D:LF6/m$a;

    return-void
.end method

.method public constructor <init>(Lm7/i;)V
    .locals 1

    const-string v0, "callContext"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF6/m;->C:Lm7/i;

    return-void
.end method


# virtual methods
.method public D(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lm7/i$b$a;->a(Lm7/i$b;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final a()Lm7/i;
    .locals 1

    iget-object v0, p0, LF6/m;->C:Lm7/i;

    return-object v0
.end method

.method public getKey()Lm7/i$c;
    .locals 1

    sget-object v0, LF6/m;->D:LF6/m$a;

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
