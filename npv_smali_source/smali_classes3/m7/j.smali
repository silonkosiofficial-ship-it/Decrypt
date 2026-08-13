.class public final Lm7/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/i;
.implements Ljava/io/Serializable;


# static fields
.field public static final C:Lm7/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm7/j;

    invoke-direct {v0}, Lm7/j;-><init>()V

    sput-object v0, Lm7/j;->C:Lm7/j;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public D(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;
    .locals 1

    const-string v0, "operation"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public i(Lm7/i$c;)Lm7/i$b;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public o0(Lm7/i;)Lm7/i;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "EmptyCoroutineContext"

    return-object v0
.end method

.method public y0(Lm7/i$c;)Lm7/i;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
